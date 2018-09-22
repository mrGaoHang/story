package com.jsyunsi.transaction.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.jsyunsi.transaction.Transaction;
import com.jsyunsi.util.JdbcUtil;

public class TransactionImpl implements Transaction{
	public void begin() throws SQLException {
		//�����Զ��ύΪ�ֶ��ύ
		Connection conn = JdbcUtil.getCon();
		conn.setAutoCommit(false);
	}
	public void commit() throws SQLException{
		Connection conn = JdbcUtil.getCon();
		try {
			conn.commit();
		} catch (SQLException e) {
			throw e;
		}finally{
			//�黹����
			JdbcUtil.close();
		}
	}
	public void rollback() throws SQLException{
		Connection conn = JdbcUtil.getCon();
		try {
			conn.rollback();
		} catch (SQLException e) {
			throw e;
		}finally{
			//�黹����
			JdbcUtil.close();
		}
	}
}

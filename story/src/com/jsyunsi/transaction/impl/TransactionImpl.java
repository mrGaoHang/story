package com.jsyunsi.transaction.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.jsyunsi.transaction.Transaction;
import com.jsyunsi.util.JdbcUtil;

public class TransactionImpl implements Transaction{
	public void begin() throws SQLException {
		//设置自动提交为手动提交
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
			//归还连接
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
			//归还连接
			JdbcUtil.close();
		}
	}
}

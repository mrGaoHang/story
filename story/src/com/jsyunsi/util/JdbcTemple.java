package com.jsyunsi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsyunsi.entity.User;
import com.jsyunsi.mapper.RowMapper;


public class JdbcTemple {
	
	/**
	 * ��װ����ɾ�ķ���
	 * @param sql
	 * @param params
	 * @throws SQLException
	 */
	public static void executeUpdate(String sql,Object...params) throws SQLException{
		//��������
		Connection conn = JdbcUtil.getCon();
		//Ԥ����sql���
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//���ø�ռλ����ֵ�ķ���
		setParams(pstmt, params);
		//ִ����ɾ�Ĳ���
		pstmt.executeUpdate();
		//�ر���Դ�����ӣ�
		JdbcUtil.close(pstmt, null);
	}
	/**
	 * ��װ�Ĳ�ѯ����
	 * @param sql
	 * @param rowMapper
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static List  executeQuery(String sql,RowMapper rowMapper,Object...params) throws SQLException{
		//�½�һ�����϶���
		ArrayList list = new ArrayList();
		Connection conn = JdbcUtil.getCon();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		setParams(pstmt, params);
		ResultSet rs = pstmt.executeQuery();
		//���������
		while(rs.next()){
			//����RowMapper�з�װ����ķ���,��������е����ݱ�ɶ���
			Object obj = rowMapper.mapperObject(rs);
			//��ӵ�����
			list.add(obj);
		}
		JdbcUtil.close(pstmt, rs);
		return list;
	}
	/**
	 * ��ռλ����ֵ�ķ���
	 * @param pstmt
	 * @param params
	 * @throws SQLException
	 */
	public static void setParams(PreparedStatement pstmt,Object...params) throws SQLException{
		if(params != null){
			//��ռλ����ֵ
			for(int i = 0; i<params.length;i++){
				//���δ�������ȡֵ��ռλ����ֵ
				pstmt.setObject((i+1), params[i]);
			}
		}
	}
}

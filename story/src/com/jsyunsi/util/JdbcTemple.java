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
	 * 封装的增删改方法
	 * @param sql
	 * @param params
	 * @throws SQLException
	 */
	public static void executeUpdate(String sql,Object...params) throws SQLException{
		//创建连接
		Connection conn = JdbcUtil.getCon();
		//预编译sql语句
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//调用给占位符赋值的方法
		setParams(pstmt, params);
		//执行增删改操作
		pstmt.executeUpdate();
		//关闭资源（连接）
		JdbcUtil.close(pstmt, null);
	}
	/**
	 * 封装的查询方法
	 * @param sql
	 * @param rowMapper
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static List  executeQuery(String sql,RowMapper rowMapper,Object...params) throws SQLException{
		//新建一个集合对象
		ArrayList list = new ArrayList();
		Connection conn = JdbcUtil.getCon();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		setParams(pstmt, params);
		ResultSet rs = pstmt.executeQuery();
		//遍历结果集
		while(rs.next()){
			//调用RowMapper中封装对象的方法,将结果集中的数据变成对象
			Object obj = rowMapper.mapperObject(rs);
			//添加到集合
			list.add(obj);
		}
		JdbcUtil.close(pstmt, rs);
		return list;
	}
	/**
	 * 给占位符赋值的方法
	 * @param pstmt
	 * @param params
	 * @throws SQLException
	 */
	public static void setParams(PreparedStatement pstmt,Object...params) throws SQLException{
		if(params != null){
			//给占位符赋值
			for(int i = 0; i<params.length;i++){
				//依次从数组中取值给占位符赋值
				pstmt.setObject((i+1), params[i]);
			}
		}
	}
}

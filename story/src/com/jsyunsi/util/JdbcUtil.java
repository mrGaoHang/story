package com.jsyunsi.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class JdbcUtil {
	//数据源，用于存放Connection
	private static DataSource ds;
	//创建ThreadLocal对象，让每个线程都有一个属于自己的独立的Connection
	private static ThreadLocal<Connection> threadlocal = new ThreadLocal<Connection>();
	
	static{
		//创建配置文件对象
		Properties p = new Properties();
		//利用load()方法将文件中的键值读取到p中保存
		try {
			//p.load(new FileInputStream(new File("src/datasource.properties")));
			p.load(JdbcUtil.class.getClassLoader().getResourceAsStream("datasource.properties"));
			System.out.println("读取成功");
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try{
		/* DataSource是接口，不能创建对象，所以借助BasicDataSourceFactory
		 * 将p中的配置传递给BasicDataSourceFactory，生成数据源对象
			 */
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 创建Connection对象
	 * @return
	 */
	public static Connection getCon(){
		//利用threadlocal的get()方法获得一个独立的Connection
		Connection conn = threadlocal.get();
		//判断是否获取到，如果没有获取到，就创建新的Connection对象
		if(conn == null){
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//将创建的链接加入threadlocal
			threadlocal.set(conn);
		}
		return conn;
	}
	/**
	 * 关闭pstmt rs
	 * 遵循先使用的后关闭
	 * @param pstmt
	 * @param rs
	 */
	public static void close(PreparedStatement pstmt,ResultSet rs){
		if(null != rs){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != pstmt){
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 事务做完以后jdbc操作全部结束，关闭Connection，将Connection还给连接池
	 * 同时threadLocal中的Connection清除
	 */
	public static void close(){
		Connection conn = threadlocal.get();
		threadlocal.remove();
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

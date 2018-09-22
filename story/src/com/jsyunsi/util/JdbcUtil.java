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
	//����Դ�����ڴ��Connection
	private static DataSource ds;
	//����ThreadLocal������ÿ���̶߳���һ�������Լ��Ķ�����Connection
	private static ThreadLocal<Connection> threadlocal = new ThreadLocal<Connection>();
	
	static{
		//���������ļ�����
		Properties p = new Properties();
		//����load()�������ļ��еļ�ֵ��ȡ��p�б���
		try {
			//p.load(new FileInputStream(new File("src/datasource.properties")));
			p.load(JdbcUtil.class.getClassLoader().getResourceAsStream("datasource.properties"));
			System.out.println("��ȡ�ɹ�");
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try{
		/* DataSource�ǽӿڣ����ܴ����������Խ���BasicDataSourceFactory
		 * ��p�е����ô��ݸ�BasicDataSourceFactory����������Դ����
			 */
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * ����Connection����
	 * @return
	 */
	public static Connection getCon(){
		//����threadlocal��get()�������һ��������Connection
		Connection conn = threadlocal.get();
		//�ж��Ƿ��ȡ�������û�л�ȡ�����ʹ����µ�Connection����
		if(conn == null){
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//�����������Ӽ���threadlocal
			threadlocal.set(conn);
		}
		return conn;
	}
	/**
	 * �ر�pstmt rs
	 * ��ѭ��ʹ�õĺ�ر�
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
	 * ���������Ժ�jdbc����ȫ���������ر�Connection����Connection�������ӳ�
	 * ͬʱthreadLocal�е�Connection���
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

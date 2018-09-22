package com.jsyunsi.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.jsyunsi.util.JdbcUtil;

/**
 * ���󹤳�
 * @author gw
 *
 */
public class ObjectFactory {
	//���ڴ洢�����ļ��е�������Ϣ
	private static Map<String,Object> objs = new HashMap<String, Object>();
	static{
		//�����ļ�object.txt
		BufferedReader reader = null;
			try {
				//reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("src/bean.properties"))));
				reader = new BufferedReader(new InputStreamReader(JdbcUtil.class.getClassLoader().getResourceAsStream("bean.properties")));
				String msg = reader.readLine();
				while(null != msg){
					String[] msgs = msg.split("=");
					String key = msgs[0];
					String className = msgs[1];
					/*
					 * ��ʱ��className��һ���ַ�������Ҫ�Ĳ����ַ���������һ������
					 * ������Ҫ����className��һ����ַ��ö�Ӧ�Ķ���
					 */
					Class objClass = Class.forName(className);
					//ͨ��class���ͣ��������ɶ���
					Object obj = objClass.newInstance();
					objs.put(key, obj);
					msg = reader.readLine();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	/**
	 * getBean:���һ������
	 * @param beanName  �����ļ��е�key
	 * @return
	 */
	public static Object getBean(String beanName){
		return objs.get(beanName);
	}
}

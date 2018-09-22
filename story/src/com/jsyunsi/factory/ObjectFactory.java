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
 * 对象工厂
 * @author gw
 *
 */
public class ObjectFactory {
	//用于存储配置文件中的配置信息
	private static Map<String,Object> objs = new HashMap<String, Object>();
	static{
		//加载文件object.txt
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
					 * 此时的className是一个字符串，需要的不是字符串，而是一个对象，
					 * 所以需要利用className这一个地址获得对应的对象
					 */
					Class objClass = Class.forName(className);
					//通过class类型，反向生成对象
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
	 * getBean:获得一个对象
	 * @param beanName  配置文件中的key
	 * @return
	 */
	public static Object getBean(String beanName){
		return objs.get(beanName);
	}
}

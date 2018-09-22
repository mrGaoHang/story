package com.jsyunsi.test;

import java.sql.SQLException;

import com.jsyunsi.entity.User;
import com.jsyunsi.exception.UserException;
import com.jsyunsi.factory.ObjectFactory;
import com.jsyunsi.service.UserService;

public class Test{
	public static void main(String[] args) throws SQLException {
		//从Map集合中获取对象
		UserService userService = (UserService) ObjectFactory.getBean("userService");
		
		User user = new User();
		user.setUsername("asd");
		user.setPassword("123");
		user.setSex("女");
		user.setPhone("110112");
		
		try {
			userService.regist(user);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}

		UserService userService1 = (UserService) ObjectFactory.getBean("userService");
		
		
		
	}
}

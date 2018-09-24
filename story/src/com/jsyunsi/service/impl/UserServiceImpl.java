package com.jsyunsi.service.impl;

import java.sql.SQLException;

import com.jsyunsi.dao.UserDao;
import com.jsyunsi.entity.User;
import com.jsyunsi.exception.UserException;
import com.jsyunsi.factory.ObjectFactory;
import com.jsyunsi.service.UserService;
import com.jsyunsi.transaction.Transaction;

public class UserServiceImpl implements UserService{
	UserDao userDao = (UserDao) ObjectFactory.getBean("userDao");
	Transaction tx = (Transaction) ObjectFactory.getBean("tx");
	
	
	public void regist(User user) throws UserException {
		//验证username\password
		//判断调用方法或抛出自定义异常
		try {
			//开启事务
			tx.begin();
			userDao.regist(user);
			//提交事务
			tx.commit();
		} catch (SQLException e) {
			//回滚事务
			try {
				tx.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

	public void login(String username, String password) throws UserException  {
		//
		try {
			tx.begin();
			userDao.login(username, password);
			tx.commit();
		} catch (SQLException e) {
			try {
				tx.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
              throw new UserException("用户名密码错误");
		}
		
	}

}

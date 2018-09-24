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
		//��֤username\password
		//�жϵ��÷������׳��Զ����쳣
		try {
			//��������
			tx.begin();
			userDao.regist(user);
			//�ύ����
			tx.commit();
		} catch (SQLException e) {
			//�ع�����
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
              throw new UserException("�û����������");
		}
		
	}

}

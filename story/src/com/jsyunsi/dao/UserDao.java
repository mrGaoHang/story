package com.jsyunsi.dao;

import java.sql.SQLException;
import java.util.List;

import com.jsyunsi.entity.User;

public interface UserDao {
	/**
	 * ע��
	 * @param user
	 * @throws SQLException 
	 */
	public abstract void regist(User user) throws SQLException;
	/**
	 * ��¼
	 * @param username
	 * @param password
	 * @throws SQLException 
	 */
	public abstract void login(String username,String password) throws SQLException;
	
	public abstract List<User> showAll() throws SQLException;
}

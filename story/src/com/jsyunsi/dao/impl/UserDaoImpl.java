package com.jsyunsi.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.jsyunsi.dao.UserDao;
import com.jsyunsi.entity.User;
import com.jsyunsi.mapper.UserMapper;
import com.jsyunsi.util.JdbcTemple;

public class UserDaoImpl implements UserDao{

	public void regist(User user) throws SQLException {
		String sql = "insert into user (username,password,sex,phone) values (?,?,?,?)";
		JdbcTemple.executeUpdate(sql, user.getUsername(),user.getPassword(),user.getSex(),user.getPhone());
	}

	public void login(String username, String password) throws SQLException {
		String sql = "select * from user where username = ? and password  = ?";
		JdbcTemple.executeQuery(sql, new UserMapper(), username,password);
	}

	public List<User> showAll() throws SQLException {
		List<User> list =null;
		String sql ="select * from user";
		list = JdbcTemple.executeQuery(sql, new UserMapper(), null);
		return list;
	}
	public static void main(String[] args) {
		UserDaoImpl d = new UserDaoImpl();
		try {
			d.showAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

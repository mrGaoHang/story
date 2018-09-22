package com.jsyunsi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsyunsi.entity.User;

public class UserMapper implements RowMapper {

	public Object mapperObject(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setSex(rs.getString("sex"));
		user.setPhone(rs.getString("phone"));
		return user;
	}

}

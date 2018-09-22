package com.jsyunsi.service;

import com.jsyunsi.entity.User;
import com.jsyunsi.exception.UserException;

public interface UserService {
	
	public abstract void regist(User user) throws UserException;
	
	public abstract void login(String username,String password) throws UserException;
}

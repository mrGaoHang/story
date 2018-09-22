package com.jsyunsi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.jsyunsi.entity.User;
import com.jsyunsi.exception.UserException;
import com.jsyunsi.factory.ObjectFactory;
import com.jsyunsi.service.UserService;

public class RegistServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		UserService userService = (UserService) ObjectFactory.getBean("userService");
		String username = request.getParameter("username");
		String password=request.getParameter("password");
		String sex =request.getParameter("sex");
		String phone = request.getParameter("phone");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setSex(sex);
		user.setPhone(phone);
		
		try {
			userService.regist(user);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		} catch (UserException e) {
			JOptionPane.showMessageDialog(null, "用户名重复");
			request.getRequestDispatcher("Regist");
		}
		
		
	}

}

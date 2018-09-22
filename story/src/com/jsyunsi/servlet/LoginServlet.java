package com.jsyunsi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.jsyunsi.exception.UserException;
import com.jsyunsi.factory.ObjectFactory;
import com.jsyunsi.service.UserService;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		UserService userService=(UserService) ObjectFactory.getBean("userService");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//新建db类对象，使用其方法完成判断
		
		
	
			try {
				userService.login(username, password);
				//response.sendRedirect("index/66.jsp");
			} catch (UserException e) {
				JOptionPane.showMessageDialog(null, "错误我");
			}
			
			
	}
}

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<style type="text/css">
	body{
	
	background-color: white;
	
	}
	
	</style>

  </head>
  
  <body>
   <form action="story/Login" method="post">
   <div id = "login">
     	  
     	  
     	  <table id="loginTable">
     	  		<tr>
     	  			<td>用户名:&nbsp;</td>
     	  			<td>
     	  				<input type= "text" name = "username" id = "userName"/>
     	  			</td>
     	  			<td>&nbsp;</td>
     	  		</tr>
     	  		<tr>
     	  			<td>密&nbsp;&nbsp;&nbsp;码:&nbsp;</td>
     	  			<td>
     	  				<input type= "password" name = "password" id = "password"/>
     	  			</td>
     	  			<td>&nbsp;</td>
     	  		</tr>
      	  		
     	  		
     	  		<tr>
     	  			<td>&nbsp;</td>
     	  			<td colspan="2">
     	  				<input type= "submit" value="登&nbsp;录" class="btn"/>
     	  			</td>
     	  			<td> 
     	  			<a href="story/Regist.jsp"> <input type= "button" value="注&nbsp;测" class="btn" /></a>
     	  			   
     	  			 </td>
     	  		</tr>
     	  		    	  		     	  
     	  </table>
     	  
     
     
     
     </div>
     </form>
     
  </body>
  
</html>

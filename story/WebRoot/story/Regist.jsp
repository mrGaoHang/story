<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
	<style type="text/css">
		body,div,table,tr,td{
			margin: 0px;
			padding: 0px;
		}
	
		#userEditTable{
			font-size: 15px;
			border-collapse: collapse;
			width: 350px;
			margin: 20px auto;
			
			
		}
		
		#userEditTable td{
			height: 40px;
		}
	
	</style>
  </head>
  
  <body>
   	<form action="story/Regist" method="post">
   	
   	<table id = "userEditTable">
   		<tr>
   			<td>
   			用户名：
   			</td>
   			<td>
   				<input type = "text" name="username id="username"/>
   			</td>
   		</tr>
   		<tr>
   			<td>
   			密码：
   			</td>
   			<td>
   				<input type = "password" name="password" id="password" />
   			</td>
   		</tr>  

   		<tr>
   			<td>
   			性别：
   			</td>
   			<td>
   				<input type = "text" name="sex" />
   			</td>
   		</tr>  

   		<tr>
   			<td>
   			电话：
   			</td>
   			<td>
   				<input type = "text" name="phone"/>
   			</td>
   		</tr>  
   		
   		<tr>
   			<td colspan="2">
   				<input type = "submit" value="注册"/>
   				<input type = "reset" value="重置"/>
   			</td>
   		</tr>  	
   	</table>
   	</form>
  </body>
</html>

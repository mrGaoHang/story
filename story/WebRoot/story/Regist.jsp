<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>部门编辑</title>
    
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
	
		#deptEditTable{
			font-size: 15px;
			border-collapse: collapse;
			width: 350px;
			margin: 20px auto;
			
			
		}
		
		#deptEditTable td{
			height: 40px;
		}
	
	</style>
  </head>
  
  <body>
   	<form action="story/addUser" method="post">
   	
   	<table id = "deptEditTable">
   		<tr>
   			<td>
   			用户名:
   			</td>
   			<td>
   				<input type = "text" name="username" id="deptNo"/>
   			</td>
   		</tr>
   		<tr>
   			<td>
   			密码:
   			</td>
   			<td>
   				<input type = "password" name="password" id="deptName"/>
   			</td>
   		</tr>  

   		<tr>
   			<td>
   			性别:
   			</td>
   			<td>
   				<input type = "text" name="sex" id="deptLoc"/>
   			</td>
   		</tr>  

   		<tr>
   			<td>
   			电话:
   			</td>
   			<td>
   				<input type = "text" name="phone" id="deptMaster"/>
   			</td>
   		</tr>  
   		
   		<tr>
   			<td colspan="2">
   				<input type = "submit" value="添加"/>
   				<input type = "reset" value="重置"/>
   			</td>
   		</tr>  	
   	</table>
   	</form>
  </body>
</html>

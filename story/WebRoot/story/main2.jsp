<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/main2.css">
<link rel="stylesheet" type="text/css" href="css/main-table.css"> 
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<!--第一层 页面顶部  -->
	<div class="top">
		<div class="top-in">
			<div class="top-left">
				<a> <font>收藏本站</font> </a>
			</div>
			<div class="top-right">欢迎来到本站，您还未[登录]</div>
		</div>

	</div>
	<!-- 第二层文学图标 搜索图标 -->
	<div class="second">
		<div class="second-in">
			<div class="second-left">
				<img alt="" src="images/logo.gif">
			</div>
			<div class="second-right">
				<input type="text" placeholder="输入你要搜索的小说"> <img alt=""
					src="images/search-btn.png">

			</div>
		</div>
	</div>
	<!--第三层的 导航栏内容 -->
	<div class="three">
		<div class="three-in">
			<div class="three-left">
				<!-- 导航栏内容 -->
				<ul id=menu>
					<li><span>首页</span></li>
					<li><span>玄幻</span></li>
					<li><span>奇幻</span></li>
					<li><span>武侠</span></li>
					<li><span>仙侠</span></li>

				</ul>
			</div>
		</div>
	</div>
	<!--图片滑动   -->
	<div class="four">
		<div class="four-in">
			<div class="four-left">
				<div class="pictrue">
					<img alt="" src="images/4.jpg" class="img-4">

				</div>
				<div class="div-table-1">
					<table class="table-1">
						<tr>
							<td><h4>
									蒲公英的约定<br>
									<p>
										<b>长亭外古道边，芳草碧连天</b>
									</p>
								</h4>
							</td>
						</tr>
						<tr>
							<td><h4>
									时光老我们散<br>
									<p>
										<b>长亭外古道边，芳草碧连天</b>
									</p>
								</h4>
							</td>
						</tr>
						<tr>
							<td><h4>
									蒲公英的约定<br>
									<p>
										<b>长亭外古道边，芳草碧连天</b>
									</p>
								</h4>
							</td>
						</tr>
						<tr>
							<td><h4>
									蒲公英的约定<br>
									<p>
										<b>长亭外古道边，芳草碧连天</b>
									</p>
								</h4></td>
						</tr>
					</table>

				</div>
			</div>
			<div class="four-right">
			    <br>
			    <br>
				<font>会员登录</font><br>
				<br>
			    <br>
				<form action="story/Login">
					<table class="table-1-2">
						<tr>
							<td>用户名:</td>
							
						</tr>
						<tr>
						    <td><input type="text" name="username"></td>
						    
						</tr>
						<tr>
						    <td>密码:</td>
						    
						</tr>
						    <tr>
						    <td><input type="password" name="password"></td>
						   </tr>
						   <tr>
					        <td ><input type="submit" value="登录">         
					        <a><input type="button" value="注册"></a></td>
						</tr>
					</table>
					<table>
					   <tr>
					       <td>本周排行榜</td>
					   
					   </tr>
					    <tr>
					       <td>1.</td>
					   </tr>
					</table>
					<img alt="" src="images/xwc.jpg">
				</form>
			</div>
		</div>
	</div>
	<!-- 玄幻 奇幻小说表 -->
	<div class="five">
		<div class="five-in">
			<div class="five-left">
				<div class="table-2">
				  <table class="table-2-biao">
				      <tr>
				         <td>玄幻</td>
				      
				      </tr>
				      <tr>
				         <td><img alt="" src="images/1.jpg"></td>
				      
				      </tr>
				      <tr>
				        <td class="td1">玄幻新书</td>
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				  </table>
				</div>
				<div class="table-3">
				     <table class="table-3-biao">
				      <tr>
				         <td>奇幻</td>
				      
				      </tr>
				      <tr>
				         <td><img alt="" src="images/2.jpg"></td>
				      
				      </tr>
				      <tr>
				         <td class="td3">奇牛鬼才</td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				  </table>
				
				</div>

			</div>
			<div class="five-right">
			      <table class="table-wwxf-biao">
				      <tr>
				         <td>网文新风</td>
				      
				      </tr>
				      <tr>
				         <td></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				  </table>
			
			</div>
		</div>
	</div>
	<!-- 武侠 仙侠 -->
	<div class="six">
		<div class="six-in">
			<div class="six-left">
				<div class="table-4">
				 <table class="table-4-biao">
				      <tr>
				         <td>奇幻</td>
				      
				      </tr>
				      <tr>
				         <td><img alt="" src="images/2.jpg"></td>
				      
				      </tr>
				      <tr>
				         <td class="td4">奇牛鬼才</td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				  </table>
				
				</div>
				<div class="table-5">
				      <table class="table-5-biao">
				      <tr>
				         <td>奇幻</td>
				      
				      </tr>
				      <tr>
				         <td><img alt="" src="images/2.jpg"></td>
				      
				      </tr>
				      <tr>
				         <td class="td5">奇牛鬼才</td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				      <tr>
				         <td><a href="">奇牛鬼才</a></td>
				      
				      </tr>
				  </table>
				
				
				</div>

			</div>
		</div>
	</div>
	<!-- 底层 -->
	<div class="seven">
		<div class="seven-in">
		    <img alt="" src="images/foot.jpg" height="95px" width="760px">
		
		</div>
	</div>
	<div class="eight">
		<div class="eight-in">
		     <img alt="" src="images/footer.gif" height="95px" width="760px">
		</div>
	</div>

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>

	<div class="first">
		<div class="first-1">收藏本站</div>
		<div class="first-2">您还未登录请[登陆]</div>
	</div>

	<div class="second">
		<div class="second-1">
			<img alt="" src="images/logo.gif">
		</div>
		<div class="second-2">
			<input type="text" placeholder="输入你要搜索的小说"> 
			<img alt=""src="images/search-btn.png">
		</div>
	</div>
	<div class="third">
			<ul id =menu>
				<li ><span>首页</span></li>
				<li><span>玄幻</span></li>
				<li><span>奇幻</span></li>
				<li><span>武侠</span></li>
				<li><span>仙侠</span></li>
			
		</ul>
		
	</div>
	<div class="fourth">
	<div class="fourth-1">
		<div class="fourth-1-1">
		<marquee behavior="slide" direction="left" onMouseOver= stop() onMouseOut=start() scrollamount="3" scrolldelay="0"> 
		<img src="images/4.jpg">
		<img src="images/timg.jpg">
		</marquee></div>
		<div class="fourth-1-2">
		<table>
			<tr><td>1
			</td></tr>
			<tr><td>2</td></tr>
		</table>
		</div>
	</div>
	<div class="fourth-2">
		<div class="fourth-2-1"><font color="#8DC61E">会员登陆</font></div>
		<div class="fourth-2-2"><input type="text" > </div>
		<div class="fourth-2-3"><input type="text" > </div>
		<div class="fourth-2-4">
		<button type="button">登陆</button></div>
	</div>
	<div class="fourth-3">
		<div class="fourth-3-1"><font color="#8DC61E">本周排行榜</font></div>
		<div class="fourth-3-2"><img src="images/xwc.jpg" width="185" height="100"> </div>
		<div class="fourth-3-3"><table>
			<tr><td height="40" style="color:#8DC61E">网文新风</td></tr>
			<tr><td >[都市]音为我狂</td></tr>
			<tr><td>[玄幻]超维入侵</td></tr>
			<tr><td>[历史]手眼通天</td></tr>
			<tr><td>[游戏]次元法典</td></tr>
			<tr><td>[都市]都市大明星</td></tr>
			<tr><td>[都市]无限福利神豪</td></tr>
			<tr><td>[玄幻]完美配角系统</td></tr>
		</table></div>
	</div>
	
	<div class="fourth-4">
		<div class="fourth-4-1">
		<div class="fourth-4-1-1">玄幻</div>
		<div class="fourth-4-1-2"><img src="images/1.jpg"> </div>
		<div class="fourth-4-1-3"><font color="white" style="text-align:left:10px">玄幻新书</font></div>
		<div class="fourth-4-1-4"><table>
			</table></div>
		</div>
		<div class="fourth-4-2">
		
		<div class="fourth-4-2-1">奇幻</div>
		<div class="fourth-4-2-2"><img src="images/2.jpg"> </div>
		<div class="fourth-4-2-3"><font color="white" style="text-align:left:10px">奇幻世界</font></div>
		<div class="fourth-4-2-4"><table>
		
			
		</table></div>
		</div>
	</div>
	<div class="fourth-5">
		<div class="fourth-5-1">
		<div class="fourth-5-1-1">奇幻</div>
		<div class="fourth-5-1-2"><img src="images/3.jpg"> </div>
		<div class="fourth-5-1-3"><font color="white" style="text-align:left:10px">武侠最新连载</font></div>
		<div class="fourth-5-1-4"><table>
	
		</table></div>
		</div>
		<div class="fourth-5-2">
		<div class="fourth-5-2-1">仙侠</div>
		<div class="fourth-5-2-2"><img src="images/6.jpg"> </div>
		<div class="fourth-5-2-3"><font color="white" style="text-align:left:10px">仙侠游记</font></div>
		<div class="fourth-5-2-4"><table>
		
		</table></div>
		</div>
	</div>
	</div>
	<div class="fifth"><img src="images/foot.jpg"width="900" height="185"> </div>
</body>

</html>

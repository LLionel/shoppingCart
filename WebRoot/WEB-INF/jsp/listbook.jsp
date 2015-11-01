<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'listbook.jsp' starting page</title>
    <meta http-equiv="content-type" content = "text/html;charset:utf-8">
  	
  	<style>
  		.container{
  			/* margin :　auto; */
  			margin-left : auto;
  			margin-right:auto; 
  			/* margin-bottom : auto ;  */
  		/* align : right ; */
  		}
  	</style>
  	
  </head>
  
  <body >
	  	<h1 style = "text-align:center">书籍购买</h1>
  	
		<table class = "container" width = "70%" border = "1" style = "text-align : center">
			<tr>
				<td>书名</td>
				<td>作者</td>
				<td>价格</td>
				<td>描述</td>
				<td>操作</td>
			</tr>
			<c:forEach var = "entry" items = "${map}">
				<tr>
					<td>${entry.value.name }</td>
					<td>${entry.value.author }</td>
					<td>${entry.value.price }</td>
					<td>${entry.value.description }</td>
					<td>$<a href ="${pageContext.request.contextPath }/servlet/BuyServlet?id=${entry.value.id}">购买</td>
				</tr>
			</c:forEach>
		</table>
  </body>
</html>

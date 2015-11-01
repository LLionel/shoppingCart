<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'listcart.jsp' starting page</title>
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
				<td>单价</td>
				<td>数量</td>
				<td>小计</td>
				<td>操作</td>
			</tr>
			<c:forEach var = "entry" items = "${cart.map}">
				<tr>
					<td>${entry.value.book.name }</td>
					<td>${entry.value.book.author }</td>
					<td>${entry.value.book.price }</td>
					<td>${entry.value.quanlity }</td>
					<td>${entry.value.price}</td>
					<td>$<a href ="${pageContext.request.contextPath }/servlet/DeleteServlet?id=${entry.value.book.id}">删除</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan = "2">总价</td>
				<td colspan = "4">${cart.price}元</td>
			</tr>
		</table>
  </body>
</html>

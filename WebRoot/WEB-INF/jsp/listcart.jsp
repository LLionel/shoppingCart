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
  	
  	<script type="text/javascript">
  	
  		function deleteItem(id)
  		{
  			var b = window.confirm("您确认删除吗");
  			if(b)
  			{
  				window.location.href = "${pageContext.request.contextPath }/servlet/DeleteItemServlet?id="+id;
  			}
  		}
  		
  		function clearCart()
  		{
  			var b = window.confirm("您确认删除吗");
  			if(b)
  			{
  				window.location.href = "${pageContext.request.contextPath }/servlet/ClearCartServlet";
  				
  			}
  		}
  		
  		function changeQuantity(input , id , quantity)
  		{
  			var value = input.value ;
  		
  			/* if(isNaN(value))
  			{
  				alert("请输入数字！！！");
  				input.value = quantity;
  			} */
  			if(value<=0 || value != parseInt(value))
  			{
	  			alert("请输入正整数！！！");  			
	  			input.value = quantity;	
	  		}
	  		else
	  		{
	  			var b = window.confirm("您确认修改吗？");
	  			if(b)
	  			{
	  				
	  				window.location.href = "${pageContext.request.contextPath }/servlet/ChangeQuantityServlet?id="+id+"&quantity="+value;
	  					
	  			}
	  				//window.location.href = "${pageContext.request.contextPath }/servlet/ChangeQuantityServlet?id="+id+"&quantity="+value;
  				
	  		}
  			
  			
  		}
  		
  	</script>
  	
  </head>
  
  <body >
	  	<h1 style = "text-align:center">购物车列表</h1>
  	
  	<c:if test="${empty(cart.map)}">
  		您并没有购买任何商品！
  	</c:if>
  	<c:if test = "${!empty(cart.map)}">
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
					<td><input type = "text" value="${entry.value.quantity}" maxlength = "5" style = "width : 45px" onchange="changeQuantity(this,${entry.key} , ${entry.value.quantity})"></td>
					<td>${entry.value.price}</td>
					<!-- 去掉超链接默认行为 -->
					<td><a href ="javascript:void(0)" onclick = "deleteItem(${entry.value.book.id})">删除</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan = "2">总价</td>
				<td colspan = "3">${cart.price}元</td>
				<td ><a href = "javascript:void(0)" onclick = "clearCart()">清空购物车</a></td>
			</tr>
		</table>
		</c:if>
  </body>
</html>

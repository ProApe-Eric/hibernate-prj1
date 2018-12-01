<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆成功</title>
</head>
<body>
<h1 >登陆成功</h1>
<a href="./allItems">查看所有商品信息</a>
<table border="1">
	<s:iterator value="#session.shoppingCart.itemsOrdered">
		<tr>
			<th>编号</th><th>名称</th><th>说明</th><th>单价</th><th>数量</th>
		</tr>
		<tr>
			<td><s:property value="item.itemID"/></td> 
			<td><s:property value="item.name"/></td> 
			<td><s:property value="item.description"/></td> 
			<td><s:property value="item.cost"/></td> 
			<td><s:property value="numItems"/></td>
		</tr>
	
	</s:iterator>
</table>

<s:actionmessage/>
</body>
</html>
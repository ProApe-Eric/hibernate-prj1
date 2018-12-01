<%--
  Created by IntelliJ IDEA.
  User: Erix_Mac
  Date: 2018/11/1
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030" import="com.opensymphony.xwork2.util.ValueStack,
java.util.List,java.util.Iterator, cn.edu.zjut.bean.Item"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
    <title>ItemList</title>
</head>

<body> <center>商品列表</center> <table border=1>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>说明</th>
        <th>单价</th>
    </tr>
    <s:iterator value="items" > <tr>
        <td><s:property value="itemPK.itemID"/></td>
        <td><s:property value="itemPK.title"/></td>
        <td><s:property value="description"/></td>
        <td><s:property value="cost"/></td>
    </tr>
    </s:iterator>
</table>
</body>


</html>

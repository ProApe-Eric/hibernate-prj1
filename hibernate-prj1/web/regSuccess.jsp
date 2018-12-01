<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册成功</title>
</head>
<body>

 <!-- 数据标签 property -->
<s:property value="loginUser.name"/> 
<!-- 控制标签 if/else -->

<s:if test="%{loginUser.sex== \"1\"}"> <s:text name="regSuccess.male"/>
</s:if>
<s:else>
<s:text name="regSuccess.female"/> </s:else>
您注册成功了!
<!-- 数据标签 set -->
<s:set var="user" value="loginUser" scope="session" />
<!-- 这里强制了set中不用name选项而用var选项 -->
</body>
</html>
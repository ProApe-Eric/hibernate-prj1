<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<s:head theme="xhtml"/>
<sx:head parseContent="true" extraLocales="UTF-8"/>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
<s:form action="register" method="post">
<s:textfield name="customer.account" key="register.account"/>
<s:password name="customer.password" key="register.password"/>

<s:textfield name="customer.name" key="register.name"/>
<s:radio name="customer.sex" list="#{ 1 : getText('register.sex.male'), 0 : getText('register.sex.female')}" key="register.sex"/>
<s:textfield name="customer.birthday" key="register.birthday"/>

<s:submit key="login.submit.button.show"/>
<s:reset key="login.reset.button.show"/> </s:form>

</body>
</html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Erix_Mac
  Date: 2018/11/2
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exception</title>
</head>
<body>

<h1 style="color: red">opps It seems the server encounter an exception</h1>
<s:property value="exception.message"/>

</body>
</html>

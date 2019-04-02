<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>"/>
    <title>添加班级</title>
</head>
<body>
<form method="post" action="class/add">
    班级名称：<input type="text" name="name"/><br/>
    班级编号：<input type="text" name="num"/><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>

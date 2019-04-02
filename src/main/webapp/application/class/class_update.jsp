<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>"/>
    <title>修改班级</title>
</head>
<body>
<form method="post" action="class/update">
    <input type="hidden" name="id" value="${c.id}"/>
    班级名称：<input type="text" name="name" value="${c.name}"/><br/>
    班级编号：<input type="text" name="num" value="${c.num}"/><br/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>"/>
    <title>显示所有学生</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>学生姓名</th>
        <th>学号</th>
        <th>年龄</th>
        <th>所在班级</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${students}" var="s">
    <tr>
        <td>${s.name}</td>
        <td>${s.num}</td>
        <td>${s.age}</td>
        <td>${s.className}</td>
        <td>
            <a href="student/toUpdate?id=${s.id}">编辑</a>
            <a href="student/del?id=${s.id}">删除</a>
        </td>
    </tr>
    </c:forEach>
</table>
<a href="student/toAdd">添加</a>
</body>
</html>

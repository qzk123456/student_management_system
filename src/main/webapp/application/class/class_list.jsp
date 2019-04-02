<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>"/>
    <title>班级管理</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#add").click(function () {
                location.href="class/toAdd";
            })
        })
    </script>
</head>
<body>
<table border="1px">
    <tr>
        <th>班级编号</th>
        <th>班级名称</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${classList}" var="c">
    <tr>
        <td>${c.num}</td>
        <td>${c.name}</td>
        <td>
            <a href="class/toUpdate?id=${c.id}">编辑</a>
            <a href="class/del?id=${c.id}">删除</a>
        </td>
    </tr>
    </c:forEach>
</table>
<input type="button" id="add" value="添加"/>
</body>
</html>

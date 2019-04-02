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
    <title>添加学生</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
    $(function () {
        $.ajax({
            type:"POST",
            url:"class/list",
            success:function (data) {
                var b;
                for (var i=0; i <data.length; i++) {
                    b += "<option value='"+data[i].id+"'>"+data[i].name+"</option>";
                }
                $("#classId").append(b);
            }
        })
    })
    </script>
</head>
<body>
<form method="post" action="student/add">
    学生姓名：<input type="text" name="name"/><br/>
    学号：<input type="text" name="num"/><br/>
    年龄：<input type="text" name="age"/><br/>
    所属班级：<select id="classId" name="classId">
            </select>
    <input type="submit" value="添加"/>
</form>
</body>
</html>

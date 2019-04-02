<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>"/>
    <title>修改学生</title>
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
<form method="post" action="student/update">
    <input value="${student.id}" type="hidden" name="id"/>
    学生姓名：<input type="text" name="name" value="${student.name}"/><br/>
    学号：<input type="text" name="num" value="${student.num}"/><br/>
    年龄：<input type="text" name="age" value="${student.age}"/><br/>
    所属班级：<select id="classId" name="classId">
    <option value="${student.classId}">${student.className}</option>
</select>
    <input type="submit" value="修改"/>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/10 0010
  Time: 下午 7:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/updateStudent" method="post">
    name:<input type="text" name="name" value="${student.name}"/><br>
    age:<input type="text" name="age" value="${student.age}"/><br>
    <input type="submit" value="保存"/>
</form>
</body>
</html>

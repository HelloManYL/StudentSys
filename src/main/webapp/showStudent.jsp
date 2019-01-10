<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/9 0009
  Time: 下午 7:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>
                <a href="/student/getStudentById/${student.id}">编辑</a>
                <a href="/student/deleteStudent/${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <td colspan="4"><a href="/add.jsp">添加</a></td>
</table>
</body>
</html>

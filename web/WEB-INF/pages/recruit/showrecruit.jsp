<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        html,body{
            width:100%;
            height:100%
        }
        body{
            font-family: "华文细黑";
            background:url("/img/13.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
        }
    </style>
</head>
<body>
<table  border="1" align="center" cellpadding="10" cellspacing="0">
    <tr>
        <td colspan="6" bgcolor="#9FCDEA">所有招聘信息</td>
    </tr>
    <tr>
        <td>序号</td>
        <td>招聘单位描述</td>
        <td>性别要求</td>
        <td>年龄要求</td>
        <td>基本职位要求</td>
        <td>投递简历</td>
    </tr>
    <c:forEach items="${requestScope.get('recruits')}" var="recruits">
        <tr>
        <td>${recruits.id}</td>
        <td>${recruits.job}</td>
        <td>${recruits.sex}</td>
        <td>${recruits.age}</td>
        <td>${recruits.appeal}</td>
        <td> <a href="${pageContext.request.contextPath}/vitae/resume?tid=${requestScope.get("tid")}">投递</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

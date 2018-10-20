<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<caption><h3>所有可以录用的员工</h3></caption>
<c:forEach items="${requestScope.get('interviews')}" var="interviews">
    <ul>
        面试人：<li>${interviews.tourist.name}</li>
        面试官：<li>${interviews.employee.name}</li>
        面试时间：<li>${interviews.time}</li>
        <a href="${pageContext.request.contextPath}/employee/insertemployee?tid=${interviews.tourist.id}">录用</a>
    </ul>
    <br>
    <hr>
    <br>
</c:forEach>
</body>
</html>

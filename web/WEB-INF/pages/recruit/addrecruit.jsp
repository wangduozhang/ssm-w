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
            background:url("/img/07.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
        }
        .wrap{margin:200px auto;width:400px;
            height:400px;}
    </style>
</head>
<body>
<div class="wrap">
    <h1>管理员发布招聘信息</h1>
    <fieldset>
        <form action="${pageContext.request.contextPath}/recruit/insertrecruit" method="post">
            <p>招聘单位描述: <input type="text" name="job" /><br><br>
            <p>性别要求: <input type="text" name="sex" /><br><br>
            <p>年龄要求: <input type="text" name="age" /><br><br>
            <p>职位基本要求: <input type="text" name="appeal" /><br><br>
            <div style="width:30px;height: auto;background: #4cae4c" ><input type="submit" value="确认发布"></div>
            <a href="javascript:history.back(-1)">返回</a>
        </form>
    </fieldset>
</div>
</body>
</html>

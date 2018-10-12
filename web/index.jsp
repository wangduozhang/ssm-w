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
            background:url("http://img5.imgtn.bdimg.com/it/u=4203575838,2441778357&fm=26&gp=0.jpg") no-repeat;
            background-size: 100%;
        }
        .wrap{margin:200px auto;width:300px;
            height:400px;}
    </style>
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="wrap">
    <h1>游客登录页面</h1>
    <fieldset>
        <form action="${pageContext.request.contextPath}/tourist/loginTourist" method="get">
            <p>用户名: <input type="text" name="name" /><br><br>
            <p>密&nbsp;&nbsp;&nbsp;&nbsp;码: <input type="text" name="password" /></p><br><br>
            <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/tourist/registTourist">注册</a>
        </form>
    </fieldset>
</div>
</body>
</html>

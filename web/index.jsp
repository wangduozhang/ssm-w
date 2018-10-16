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
        .wang{
            color: red;
            display: none;
        }
        html,body{
            width:100%;
            height:100%
        }
        body{
            font-family: "华文细黑";
            background:url("/img/01.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
        }
        .wrap{margin:200px auto;width:300px;
            height:400px;}
    </style>
    <script type="text/javascript" src="/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("form").submit(function(){
                var name=$("#input1").val();
                var password=$("#input2").val();
                $.ajax({
                    url:"${pageContext.request.contextPath}/tourist/loginajax",
                    type:"post",
                    dataType:"text",
                    data:{"name":name,"password":password},
                    success:function (data) {
                        if (data==""){
                            $(".wang").eq(0).css("display","none");
                           window.location.href="${pageContext.request.contextPath}/tourist/loginTourist?name="+name+"&password="+password
                        }
                    }
                });
                $(".wang").eq(0).css("display","inline");
                return false;
            })
        })

    </script>
</head>
<body>
<div class="wrap">
    <h1>游客登录页面</h1>
    <fieldset>
        <form  method="get">
            <p>用户名: <input id="input1" type="text" name="name" /><br><br>
            <p>密&nbsp;&nbsp;&nbsp;&nbsp;码: <input id="input2"type="text" name="password" /></p>
            <span  class="wang">账号或密码不正确</span><br><br>
            <input id="login" type="submit" value="登录">&nbsp;&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/tourist/registTourist">注册</a>
        </form>
    </fieldset>
</div>
</body>
</html>

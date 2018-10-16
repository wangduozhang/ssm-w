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
            background:url("/img/07.jpg");
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
                if(name==""){
                    $(".wang").eq(0).css("display","inline");
                    return false;
                }else {
                    $(".wang").eq(0).css("display","none");
                }
                if(password==""){
                    $(".wang").eq(2).css("display","inline");
                    return false;
                }else {
                    $(".wang").eq(2).css("display","none");
                }
                $.ajax({
                    url:"${pageContext.request.contextPath}/admin/inputajax",
                    type:"post",
                    dataType:"text",
                    data:{"name":name},
                    success:function (data) {
                        alert(data);
                        if (data==""){
                            $(".wang").eq(1).css("display","none");
                            window.location.href="${pageContext.request.contextPath}/admin/addadmin?name="+name+"&password="+password
                            alert("注册成功");
                        }else {
                            $(".wang").eq(1).css("display","inline");
                        }
                    }
                });
                return false;
            })
        })

    </script>
</head>
<body>
<div class="wrap">
    <h1>游客注册页面</h1>
    <fieldset>
        <form  method="post">
            <p>用户名: <input id="input1" type="text" name="name" /><br><br>
            <span class="wang">名字不能为空</span><br>
            <span class="wang">用户名已存在</span><br>
            <p>密&nbsp;&nbsp;&nbsp;&nbsp;码: <input id="input2" type="text" name="password" /></p>
            <span class="wang">密码不能为空</span><br><br>
            <div style="width:30px;height: auto;background: #4cae4c" ><input type="submit" value="立即注册"></div>
            <a href="javascript:history.back(-1)">返回</a>
        </form>
    </fieldset>
</div>
</body>
</html>

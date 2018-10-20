<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/v1.1/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/v1.1/js/Blob.js/Blob.js"></script>
    <script src="${pageContext.request.contextPath}/v1.1/js/FileSaver.js/FileSaver.js"></script>
    <script src="${pageContext.request.contextPath}/v1.1/js/Bootstrap/bootstrap.min.js"></script>

    <style>
        .navbar-default .navbar-nav>li>a {
            color: white;
        }
        nav {
            background-image: url("/img/04.jpg");
            background-repeat: repeat-x;
        }
        body{
            background-image: url("/img/02.jpg");
            background-repeat: repeat-x;
        }
    </style>


    <script>
        $(function () {
            $("#ul1 li a").each(function () {
                var $this = $(this);
                if($this[0].href==String(window.location)){
                    $("#ul1 li").removeClass("active");
                    $this.parent().addClass("active");  //active表示被选中效果的类名
                }
            }) 
        })
    </script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <span class="icon-bar" style="color:red">当前用户 ：${requestScope.get("tourist").name}</span>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav" id="ul1">
                <li class="active"><a href="${pageContext.request.contextPath}/vitae/findmyvitae?id=${requestScope.get("tourist").id}">我的简历 <span class="sr-only">(current)</span></a></li>
                <li><a href="${pageContext.request.contextPath}/recruit/findallrecruit?tid=${requestScope.get("tourist").id}">浏览招聘信息</a></li>
                <li><a href="${pageContext.request.contextPath}/interview/findinterviewbytid?tid=${requestScope.get("tourist").id}">浏览面试信息</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">简历管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/vitae/addvitae?tid=${requestScope.get("tourist").id}">添加简历</a></li>
                        <li><a href="lookTheResume">删除简历</a></li>
                        <li><a href="${pageContext.request.contextPath}/vitae/editvitae?tid=${requestScope.get("tourist").id}">修改简历</a></li>
                        <li role="separator" class="divider"></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="javascript:history.back(-1)">返回</a></li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
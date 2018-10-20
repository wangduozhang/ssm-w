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
            background-image: url("/img/08.jpg");
            background-repeat: repeat-x;
        }
        body{
            background-image: url("/img/09.jpg");
            background-repeat: repeat-x;
            background-size: 100%;
        }
    </style>
    <script type="text/javascript" src="/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#a1").click(function () {
                var id = $("#input").val();
                $.ajax({
                    url:"${pageContext.request.contextPath}/work/goajax",
                    type:"post",
                    data:{"id":id}
                });
            })
        })
    </script>

</head>
<body>
<input id="input" type="hidden" value="${requestScope.get("employee").id}">
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <span class="icon-bar" style="color:red">当前员工 ：${requestScope.get("employee").name}</span>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav" id="ul1">
                <li  class="active"><a  id="a1" href="#">上班打卡 <span class="sr-only">(current)</span></a></li>
                <li  class="active"><a  id="a2" href="#">下班打卡 <span class="sr-only">(current)</span></a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">招聘信息管理管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/recruit/addrecruit">发布招聘信息</a></li>
                        <li><a href="lookTheResume">查看所有已发布招聘信息</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">部门管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/branch/addbranch">添加部门</a></li>
                        <li><a href="lookTheResume">查看所有部门</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">职位管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/job/addjob">添加职位</a></li>
                        <li><a href="lookTheResume">查看所有职位</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">员工管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/employee/addemployee">录用员工</a></li>
                        <li><a href="lookTheResume">查看所有员工员工</a></li>
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
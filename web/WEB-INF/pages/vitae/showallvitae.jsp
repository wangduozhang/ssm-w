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
    <script type="text/javascript" src="/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".a").click(function(){
                $(this).text("已阅");
                var id = $(this).parent().children()[0];
                $t=$(id);
                var tid=$t.val();
                $.ajax({
                    url:"${pageContext.request.contextPath}/vitae/readvitae",
                    type:"post",
                    data:{"tid":tid}
                });
            })
        })
    </script>
</head>
<body>
<caption><h3>所有简历</h3></caption>
<c:forEach items="${requestScope.get('vitaes')}" var="vitaes">
    <table width="800" border="1" align="center" cellpadding="10" cellspacing="0">
        <tr>
            <td colspan="2" bgcolor="#9FCDEA">个人资料</td>
        </tr>
        <tr>
            <td>姓&nbsp;&nbsp;名：${vitaes.name}</td>
            <td>性 &nbsp;&nbsp;别：${vitaes.sex}</td>
        </tr>
        <tr>
            <td>年 &nbsp;&nbsp;龄：${vitaes.age}</td>
            <td>学 &nbsp;&nbsp;历：${vitaes.schoolling}</td>
        </tr>
        <tr>
            <td>联系方式${vitaes.phone}</td>
            <td>e-mail&nbsp;${vitaes.email}</td>
        </tr>
        <tr>
            <td>应聘职位：${vitaes.branch.name}&nbsp;${vitaes.job.name}</td>
            <td>政治面貌：${vitaes.appearance}</td>
        </tr>
        <tr>
            <td>上份工作：${vitaes.work}</td>
            <td>工作经验：${vitaes.workTime}</td>
        </tr>
        <tr>
            <td>期望薪资：${vitaes.salary}</td>
            <td>兴趣爱好：${vitaes.bent}</td>
        </tr>
        <tr>
            <td>
                <input type="hidden" value="${vitaes.id}">
                <a class="a" href="#">阅</a>
            </td>
            <td><a>邀请面试</a></td>
        </tr>
    </table><br>
</c:forEach>
</body>
</html>

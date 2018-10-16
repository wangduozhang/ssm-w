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
<c:if test="${requestScope.get('vitae')==null}">
    <h1>你还没有添加简历</h1>
</c:if>
<c:if test="${requestScope.get('vitae')!=null}">
    <table width="800" border="1" align="center" cellpadding="10" cellspacing="0">
        <caption><h3>个人简历</h3></caption>
        <tr>
            <td colspan="2" bgcolor="#9FCDEA">个人资料</td>
        </tr>
        <tr>
            <td>姓&nbsp;&nbsp;名：${requestScope.get("vitae").name}</td>
            <td>性 &nbsp;&nbsp;别：${requestScope.get("vitae").sex}</td>
        </tr>
        <tr>
            <td>年 &nbsp;&nbsp;龄：${requestScope.get("vitae").age}</td>
            <td>学 &nbsp;&nbsp;历：${requestScope.get("vitae").schoolling}</td>
        </tr>
        <tr>
            <td>联系方式${requestScope.get("vitae").phone}</td>
            <td>e-mail&nbsp;${requestScope.get("vitae").email}</td>
        </tr>
        <tr>
            <td>应聘职位：${requestScope.get("vitae").branch.name}&nbsp;${requestScope.get("viate").job.name}</td>
            <td>政治面貌：${requestScope.get("vitae").appearance}</td>
        </tr>
        <tr>
            <td>上份工作：${requestScope.get("vitae").work}</td>
            <td>工作经验：${requestScope.get("vitae").workTime}</td>
        </tr>
        <tr>
            <td>期望薪资：${requestScope.get("vitae").salary}</td>
            <td>兴趣爱好：${requestScope.get("vitae").bent}</td>
        </tr>
        <tr>
            <td></td>
            <td> <a href="javascript:history.back(-1)">返回</a></td>
        </tr>
    </table>
</c:if>
</body>
</html>

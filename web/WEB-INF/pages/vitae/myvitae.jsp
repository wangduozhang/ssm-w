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
    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script>
        $(function() {
            $("#second").hide(); //初始化的时候第二个下拉列表隐藏
        });
        function firstSel() {//如果第一个下拉列表的值改变则调用此方法
            var orderTypeId = $("#first").val();//得到第一个下拉列表的值
            if(orderTypeId!=null && "" != orderTypeId){
                //通过ajax传入后台，把orderTypeName数据传到后端
                $.post("${pageContext.request.contextPath}/job/finjobbybranch",{id:orderTypeId},function(data){
                    var res = $.parseJSON(data);//把后台传回的json数据解析
                    var option;
                    $.each(res,function(i,n){//循环，i为下标从0开始，n为集合中对应的第i个对象
                        option += "<option value='"+n.orderTypeId+"'>"+n.orderTypeSmall+"</option>"
                    });
                    $("#second").html(option);//将循环拼接的字符串插入第二个下拉列表
                    $("#second").show();//把第二个下拉列表展示
                });

            }else {
                $("#second").hide();
            }
        };
    </script>
</head>
<body>
<c:if test="${requestScope.vitae==null}">
<form action="${pageContext.request.contextPath}/vitae/addvitae">
<table width="800" border="1" align="center" cellpadding="10" cellspacing="0">
    <caption><h3>个人简历</h3></caption>
    <tr>
        <td colspan="2" bgcolor="#9FCDEA">个人资料</td>
    </tr>
    <tr>
        <td>姓&nbsp;&nbsp;名：<input type="text" name="name"></td>
        <td>性 &nbsp;&nbsp;别：<input  type="radio" checked ="checked" name="sex" value="sex1">男

            <input  type="radio"  name="sex" value="sex2">女
        </td>
    </tr>
    <tr>
        <td>年 &nbsp;&nbsp;龄：<input type="text" name="age"></td>
        <td>学 &nbsp;&nbsp;历：<input type="text" name="schoolling"></td>
    </tr>
    <tr>
        <td>联系方式<input type="text" name="phone"></td>
        <td>e-mail&nbsp;<input type="text" name="email"></td>
    </tr>
    <tr>



        <td>应聘职位：<select id="first" class="easyui-combobox" name="typeOne"
                         style="width:200px;" onchange="firstSel()">
            <c:forEach items="${requestScope.branches }" var="branch">
                <option value="${branch.id}">${branch.name}</option>
            </c:forEach>

        </select>
            <select id="second" class="easyui-combobox" name="typeTwo" style="width:200px;"></select>
            </td>



        <td>政治面貌：<input type="text" name="appearance"></td>
    </tr>
    <tr>
        <td>上份工作：<input type="text" name="work"></td>
        <td>工作经验：<input type="text" name="workTime"></td>
    </tr>
    <tr>
        <td>期望薪资：<input type="text" name="salary"></td>
        <td>兴趣爱好：<input type="text" name="bent"></td>
    </tr>
    <tr>
        <td><input type="submit" value="保存"></td>
        <td><a href="${pageContext.request.contextPath}/web/WEB-INF/pages/tourist/showtourist.jsp">返回</a></td>
    </tr>
</table>
</form>
</c:if>



<c:if test="${requestScope.vitae!=null}">
    <form action="${pageContext.request.contextPath}/vitae/addvitae">
        <table width="800" border="1" align="center" cellpadding="10" cellspacing="0">
            <caption><h3>个人简历</h3></caption>
            <tr>
                <td colspan="2" bgcolor="#9FCDEA">个人资料</td>
            </tr>
            <tr>
                <td>姓&nbsp;&nbsp;名：<input type="text" name="name"></td>
                <td>性 &nbsp;&nbsp;别：<input  type="radio" checked ="checked" name="sex" value="sex1">男

                    <input  type="radio"  name="sex" value="sex2">女
                </td>
            </tr>
            <tr>
                <td>年 &nbsp;&nbsp;龄：<input type="text" name="age"></td>
                <td>学 &nbsp;&nbsp;历：<input type="text" name="schoolling"></td>
            </tr>
            <tr>
                <td>联系方式<input type="text" name="phone"></td>
                <td>e-mail&nbsp;<input type="text" name="email"></td>
            </tr>
            <tr>



                <td>应聘职位：<select id="" class="easyui-combobox" name="typeOne"
                                 style="width:200px;" onchange="firstSel()">
                    <option value="-1">请选择部门</option>
                    <option value=""></option>
                    <option value=""></option>
                    <option value=""></option>
                </select>
                    <select id="" class="easyui-combobox" name="typeTwo" style="width:200px;"></select>
                </td>



                <td>政治面貌：<input type="text" name="appearance"></td>
            </tr>
            <tr>
                <td>上份工作：<input type="text" name="work"></td>
                <td>工作经验：<input type="text" name="workTime"></td>
            </tr>
            <tr>
                <td>期望薪资：<input type="text" name="salary"></td>
                <td>兴趣爱好：<input type="text" name="bent"></td>
            </tr>
            <tr>
                <td><input type="submit" value="保存"></td>
                <td><a href="${pageContext.request.contextPath}/web/WEB-INF/pages/tourist/showtourist.jsp">返回</a></td>
            </tr>
        </table>
    </form>
</c:if>
</body>
</html>

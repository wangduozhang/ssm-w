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
    <script>
        $(function() {
            $("#second").hide(); //初始化的时候第二个下拉列表隐藏
        });
        function firstSel() {//如果第一个下拉列表的值改变则调用此方法
            var orderTypeId = $("#first").val();//得到第一个下拉列表的值
            if(orderTypeId!=null && "" != orderTypeId){
                //通过ajax传入后台，把orderTypeName数据传到后端
                $.ajax({
                    url:"${pageContext.request.contextPath}/job/finjobbybranch",
                    type:"get",
                    dataType:"json",
                    data:{"id":orderTypeId},
                    success:function (data) {
                        var res = JSON.stringify(data);
                        var option;
                        $.each(data,function(i,n){//循环，i为下标从0开始，n为集合中对应的第i个对象
                            option += "<option value='"+n.id+"'>"+n.name+"</option>"
                        });
                        $("#second").html(option);//将循环拼接的字符串插入第二个下拉列表
                        $("#second").show();//把第二个下拉列表展示
                    }

                })
            }else {
                $("#second").hide();
            }
        };

    </script>
</head>
<body>
<c:if test="${requestScope.get('vitae')==null}">
    <h1>你还没有添加过简历</h1>
</c:if>
<c:if test="${requestScope.get('vitae')!=null}">
<form action="${pageContext.request.contextPath}/vitae/updatemyvitae" method="post">
    <input type="hidden" name="tid" value="${requestScope.get("tid")}"/>
    <table width="800" border="1" align="center" cellpadding="10" cellspacing="0">
    <caption><h3>个人简历</h3></caption>
    <tr>
        <td colspan="2" bgcolor="#9FCDEA">个人资料</td>
    </tr>
    <tr>
        <td>姓&nbsp;&nbsp;名：<input type="text" name="name" value="${requestScope.vitae.name}"></td>
         <td>性 &nbsp;&nbsp;别：
             <c:if test="${requestScope.vitae.sex eq'男'}">
             <input  type="radio"  name="sex" value="男" checked="checked">男
             <input  type="radio"  name="sex" value="女" >女
             </c:if>
             <c:if test="${requestScope.vitae.sex eq'女'}">
                 <input  type="radio"  name="sex" value="男" >男
                 <input  type="radio"  name="sex" value="女" checked="checked">女
             </c:if>
        </td>
    </tr>
    <tr>
        <td>年 &nbsp;&nbsp;龄：<input type="number" name="age" value="${requestScope.vitae.age}"></td>
        <td>学 &nbsp;&nbsp;历：<input type="text" name="schoolling" value="${requestScope.vitae.schoolling}"></td>
    </tr>
    <tr>
        <td>联系方式<input type="text" name="phone" value="${requestScope.vitae.phone}"></td>
        <td>e-mail&nbsp;<input type="text" name="email" value="${requestScope.vitae.email}"></td>
    </tr>
    <tr>



        <td>应聘职位：<select id="first" class="easyui-combobox" name="branches"
                         style="width:200px;" onchange="firstSel()">
            <c:forEach items="${requestScope.branches }" var="branchs">
                <c:if test="${requestScope.vitae.branch.id==branchs.id}">
                <option value="${branchs.id}" selected="selected">${branchs.name}</option>
                </c:if>
                <c:if test="${requestScope.vitae.branch.id!=branchs.id}">
                    <option value="${branchs.id}">${branchs.name}</option>
                </c:if>
            </c:forEach>

        </select>
            <select id="second" class="easyui-combobox" name="jobs" style="width:200px;">

            </select>
            </td>



        <td>政治面貌：<input type="text" name="appearance" value="${requestScope.vitae.appearance}"></td>
    </tr>
    <tr>
        <td>上份工作：<input type="text" name="work" value="${requestScope.vitae.work}"></td>
        <td>工作经验：<input type="text" name="workTime" value="${requestScope.vitae.workTime}"></td>
    </tr>
    <tr>
        <td>期望薪资：<input type="text" name="salary" value="${requestScope.vitae.salary}"></td>
        <td>兴趣爱好：<input type="text" name="bent" value="${requestScope.vitae.bent}"></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"></td>
        <td> <a href="javascript:history.back(-1)">返回</a></td>
    </tr>
</table>
</form>
</c:if>
</body>
</html>

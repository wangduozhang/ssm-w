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
    <h1>你还没有添加简历</h1>
</c:if>
<c:if test="${requestScope.get('vitae')!=null}">

</c:if>
</body>
</html>

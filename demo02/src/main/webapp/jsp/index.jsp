<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/10/11
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<h1 align="center">标注信息列表</h1>
<table border="1px" align="center">
    <form action="/Index" method="post">
        <tr>
            <td align="right" colspan="7"><input type="text" name="name"><input type="submit" value="提交检索">
                <input type="button" value="新增检索" name="add"><input type="button" value="删除检索" name="del"></td>
        </tr>
    </form>
    <tr align="center">
        <td><input type="checkbox"></td>
        <td>标准号</td>
        <td>中文名称</td>
        <td>版本</td>
        <td>发布日期</td>
        <td>实施日期</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="list">
        <tr align="center">
            <td><input type="checkbox" name="check" value="${list.id}"></td>
            <td>${list.stdNum}</td>
            <td>${list.zhname}</td>
            <td>${list.version}</td>
            <td><fmt:formatDate value="${list.releaseDate}" pattern="yyyy-mm-dd"></fmt:formatDate></td>
            <td><fmt:formatDate value="${list.implDate}" pattern="yyyy-mm-dd"></fmt:formatDate></td>
            <td><a href="/down?filename=${list.packagePath}">下载</a><a href="/updCha?id=${list.id}">修改</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="7" align="right">
            <a href="/Index?pageIndex=${pageInfo.firstPage}">首页</a>
            <a> | </a>
            <a href="/Index?pageIndex=${pageInfo.prePage}">上一页</a>
            <a> | </a>
            <a href="/Index?pageIndex=${pageInfo.nextPage}">下一页</a>
            <a> | </a>
            <a href="/Index?pageIndex=${pageInfo.lastPage}">末页</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <span>第${pageInfo.pageNum}页/共${pageInfo.pages}页</span>
        </td>
    </tr>
</table>
<c:if test="${sessionScope.flag==1}">
    <p align="center">删除成功！</p>
</c:if>
<script type="text/javascript">
    $("[name='add']").click(function () {
        location.href="/jsp/add.jsp";
    })
    $("[name='del']").click(function () {
        var check=$("[name='check']:checked");
        if(check.length==0){
            alert("至少选择一个删除");
            return false;
        }
        if(confirm("确定要删除所选用户吗？")){
            var str="";
            check.each(function () {
                str+=$(this).val()+",";
            })
            location.href="/delete?id="+str;
        }
    })
</script>
</body>
</html>

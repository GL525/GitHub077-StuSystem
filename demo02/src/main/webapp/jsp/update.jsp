<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/11
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>修改标准信息</h2>
  <%--  <p>${list.packagepath}</p>
    <img src="/static/img/${list.packagepath}">--%>
    <form action="/doupdate" enctype="multipart/form-data" method="post">
        <p>标准号:<input name="stdNum"  value="${list.stdNum}" type="text"></p>
        <p>中文名称:<input name="zhname" value="${list.zhname}" type="text"></p>
        <input name="id"  type="hidden" value="${list.id}">
        <p>版本:<input name="version"   value="${list.version}" type="text"></p>
        <p>关键字/词:<input name="keyss"  value="${list.keyss}" type="text"></p>
        <p>发布日期（yyyy-MM-dd）:<input name="releaseDate" type="text"  value="<fmt:formatDate value="${list.releaseDate}" pattern="yyyy-MM-dd"/>"></p>
        <p>实施日期（yyyy-MM-dd）:<input name="implDate" type="text"  value="<fmt:formatDate value="${list.implDate}" pattern="yyyy-MM-dd"/>"></p>
        <p>附件<input type="file" name="file" value="${list.packagePath}"></p>
        <p><input type="submit" value="提交"><input type="reset" value="取消"></p>
    </form>
</center>
</body>
</html>

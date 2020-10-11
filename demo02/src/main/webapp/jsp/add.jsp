<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/11
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <h2>增加标准信息</h2>
    <form action="/doadd" enctype="multipart/form-data" method="post">
        <p>标准号:<input name="stdNum"  type="text" id="stdNum" onblur="ucexist()"></p>
        <p>中文名称:<input name="zhname" type="text"></p>
        <p>版本:<input name="version" type="text"></p>
        <p>关键字/词:<input name="keyss" type="text"></p>
        <p>发布日期（yyyy-MM-dd）:<input name="releaseDate" type="text"></p>
        <p>实施日期（yyyy-MM-dd）:<input name="implDate" type="text"></p>
        <p>附件<input type="file" name="file"></p>
        <p><input type="submit" value="提交"><input type="reset" value="取消"></p>
    </form>
</center>
</body>
</html>
<script type="text/javascript">
    function ucexist() {
        var stdNum=$("#stdNum").val();
        $.get('/doname',{stdNum:stdNum},function (data) {
            if (data.status=="true"){
                alert('标准号已存在！');
            }
        })

    }
</script>

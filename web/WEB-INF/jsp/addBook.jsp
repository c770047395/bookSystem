<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/29
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
      integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>${title}</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <form action="${action}" method="get">
            <c:if test="${not empty book}"><input type="hidden" name="bookID" value="${book.bookID}"></c:if>
            <div class="form-group">
                <label for="bookName">书籍名称</label>
                <input type="text" name="bookName"
                <c:if test="${not empty book}">value="${book.bookName}"</c:if>
                       class="form-control" id="bookName" required placeholder="书籍名称">
            </div>
            <div class="form-group">
                <label for="bookCounts">书籍数量</label>
                <input type="text" name="bookCounts"
                       <c:if test="${not empty book}">value="${book.bookCounts}"</c:if>
                       class="form-control" id="bookCounts" required placeholder="书籍数量">
            </div>
            <div class="form-group">
                <label for="detail">详情</label>
                <input type="text" name="detail"
                       <c:if test="${not empty book}">value="${book.detail}"</c:if>
                       class="form-control" id="detail" required placeholder="详情">
            </div>
            <button type="submit" class="btn btn-default">提交</button>
        </form>
    </div>


</div>

</body>
</html>

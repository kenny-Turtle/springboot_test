<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
<%--    <script src="${pageContext.request.contextPath}/js/hello.js"/>--%>
</head>
<body>
    <h2>用户登录</h2>
    <span style="color:red">${loginError}</span>
    <form action="${pageContext.request.contextPath}/login2" method="post">

        用户名：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/><br>
        <input type="submit" value="登录"/>
    </form>
    <img src="${pageContext.request.contextPath}/img/springMVC.png"/>
</body>
</html>

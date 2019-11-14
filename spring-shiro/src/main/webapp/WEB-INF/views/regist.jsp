<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>注册</h2>
<form action="${pageContext.request.contextPath}/user/regist" method="post">
    用户名；<input type="text" name="loginName"><br>
    密码；<input type="password" name="password"><br>
    确认密码；<input type="password" name="repassword"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>

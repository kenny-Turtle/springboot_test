<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h2>用户注册表单</h2>

<from action="${pageContext.request.contextPath}/regist" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" value="注册"/>


</from>
</body>
</html>

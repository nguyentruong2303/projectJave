<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<div>
Get <br/>
<form action="login1"method="get">
UserName : <input type="text" name="uname">
PassWord : <input type="password" name="upass">
<input type="submit" value="LOGIN">
</form>
POST <br/>
<form action="login2"method="post">
UserName : <input type="text" name="uname">
PassWord : <input type="password" name="upass">
<input type="submit" value="LOGIN">
</form>
</div>
</body>
</html>
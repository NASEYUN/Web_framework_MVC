<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login페이지</title>
</head>
<body>
	<!-- ctrl+shift+f하면 자동 formating됨. -->
	<form action="/hwMVC/doLogin" method="post">
		ID를 입력하세요 :) <input type="text" name="userId"><br /> 
		PASSWORD를 입력하세요:) <input type="password" name="userPassword"><br /> 
		<input type="submit" value="입력">
	</form>
</body>
</html>
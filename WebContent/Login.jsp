<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<link rel=stylesheet type="text/css" href="css/pentomino.css" />
		<title>ピザ・ペントミノ - ログイン</title>
	</head>
	<body>
		<h1>ピザ・ペントミノへようこそ！</h1>
		<form action="login.do" method="post" class="login">
			<table>
				<tr>
					<td>ユーザ名</td>
					<td><input type="text" name="user" size="16" value=""/></td>
				</tr>
				<tr>
					<td>パスワード</td>
					<td><input type="password" name ="password" size="16" value=""/></td>
				</tr>
			</table>
			<input type="submit" value="ログイン"/>
		</form>
	</body>
</html>
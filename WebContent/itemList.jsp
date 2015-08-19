<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="user" type="java.lang.String" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" type="text/css" href="css/pentomino.css">
		<title>ピザ・ペントミノ - 商品一覧</title>
	</head>
	<body>
		<h1>ピザ・ペントミノ - 商品一覧</h1>
		<div align ="center">
			<h2><%=user %>さん、お好きなピザを選んでください</h2>
			<form  action="ItemList.do" class ="itemList">
				<table class="menu">
					<tr>
						<th colspan="2">商品</th>
						<th>価格</th>
					</tr>
					<tr>
						<td class="ckeckbox"><input type="checkbox" name ="itemA" value="1"/></td>
						<td>マルゲリータ</td>
						<td class ="price">&yen;800</td>
					</tr>
					<tr>
						<td class="ckeckbox"><input type="checkbox" name ="itemB" value="2"/></td>
						<td>バジル・トマト</td>
						<td class ="price">&yen;900</td>
					</tr>
					<tr>
						<td class="ckeckbox"><input type="checkbox" name ="itemC" value="3"/></td>
						<td>ナス・ミートソース</td>
						<td class ="price">&yen;1,000</td>
					</tr>
					<tr>
						<td class="ckeckbox"><input type="checkbox" name ="itemD" value="4"/></td>
						<td>アンチョビ・シーフード</td>
						<td class ="price">&yen;1,000</td>
					</tr>
					<tr>
						<td class="ckeckbox"><input type="checkbox" name ="itemE" value="5"/></td>
						<td>チーズ・ミルフィーユ</td>
						<td class ="price">&yen;1,300</td>
					</tr>
				</table>
				<input type="submit" value="チェックした商品をカートに入れる">
			</form>
			<form action="CertList.jsp" class ="itemList">
				<input type="submit" value="カートの内容を確認して注文へ進む"/>
			</form>
			<form class ="itemList">
				<input type ="button" value="ログアウト">
			</form>
		</div>
	</body>
</html>
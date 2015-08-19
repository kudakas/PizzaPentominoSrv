<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="itemACount" type="java.lang.Integer" scope="session" />
    <jsp:useBean id="itemBCount" type="java.lang.Integer" scope="session" />
    <jsp:useBean id="itemCCount" type="java.lang.Integer" scope="session" />
    <jsp:useBean id="itemDCount" type="java.lang.Integer" scope="session" />
    <jsp:useBean id="itemECount" type="java.lang.Integer" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>ピザ・ペンテミノ - カート一覧</title>
	</head>
	<body>
		<h1>カート内の商品は以下の通りです</h1>
		<form>
			<table>
				<tr>
					<th>商品名</th>
					<th>単価</th>
					<th>注文数</th>
					<th>金額</th>
				</tr>
				<tr>
					<td>マルゲリータ</td>
					<td>&yen;800</td>
					<td><%= itemACount %></td>
					<td><%= 800*itemACount %></td>
				</tr>
				<tr>
					<td>バジル・トマト</td>
					<td>&yen;900</td>
					<td><%= itemBCount %></td>
					<td><%= 900*itemBCount %></td>
				</tr>
				<tr>
					<td>ナス・ミートソース</td>
					<td>&yen;1000</td>
					<td><%= itemCCount %></td>
					<td><%= 1000*itemCCount %></td>
				</tr>
				<tr>
					<td>アンチョビ・シーフード</td>
					<td>&yen;1000</td>
					<td><%= itemDCount %>
					</td><td><%= 1000*itemDCount %></td>
				</tr>
				<tr>
					<td>チーズ・ミルフィーユ</td>
					<td>&yen;1300</td>
					<td><%= itemECount %>
					</td><td><%= 1300*itemECount %></td>
				</tr>
				<tr>
					<td colspan="3">合計金額</td>
				</tr>
				<tr>
					<td><%= 800*itemACount+900*itemBCount+1000*itemCCount+1000*itemDCount+1300*itemECount %></td>
				</tr>
			</table>
		</form>
		<form>
			<input type="button" value ="この内容で注文する">
		</form>
		<form>
			<input type="button" value ="注文をやりなおす">
		</form>
	</body>
</html>
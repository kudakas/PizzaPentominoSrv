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
		<link rel="stylesheet" type="text/css" href="css/common.css">
		<link rel="stylesheet" type="text/css" href="css/CertList.css">
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
					<td class="goods">マルゲリータ</td>
					<td class="price">&yen;800</td>
					<td class="count"><%= itemACount %></td>
					<td class="subtotal">&yen;<%= 800*itemACount %></td>
				</tr>
				<tr>
					<td class="goods">バジル・トマト</td>
					<td class="price">&yen;900</td>
					<td class="count"><%= itemBCount %></td>
					<td class="subtotal">&yen;<%= 900*itemBCount %></td>
				</tr>
				<tr>
					<td class="goods">ナス・ミートソース</td>
					<td class="price">&yen;1,000</td>
					<td class="count"><%= itemCCount %></td>
					<td class="subtotal">&yen;<%= 1000*itemCCount %></td>
				</tr>
				<tr>
					<td class="goods">アンチョビ・シーフード</td>
					<td class="price">&yen;1,000</td>
					<td class="count"><%= itemDCount %></td>
					<td class="subtotal">&yen;<%= 1000*itemDCount %></td>
				</tr>
				<tr>
					<td class="goods">チーズ・ミルフィーユ</td>
					<td class="price">&yen;1,300</td>
					<td class="count"><%= itemECount %></td>
					<td class="subtotal">&yen;<%= 1300*itemECount %></td>
				</tr>
				<tr>
					<td class="total" colspan="3">合計金額</td>
					<td class="totalMojiretsu">&yen;<%= 800*itemACount+900*itemBCount+1000*itemCCount+1000*itemDCount+1300*itemECount %></td>
				</tr>
			</table>
		</form>
		<form action="OrderComplete.jsp">
			<input type="submit" value ="この内容で注文する">
		</form>
		<form action="CertListClear.do">
			<input type="submit" value ="注文をやりなおす">
		</form>
	</body>
</html>
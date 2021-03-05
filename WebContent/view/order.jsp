<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
</head>
<body bgcolor=F8EDD8>
	<%-- JSTL --%>

	<h2>
		<p style="text-align: center;">Reading All Request Parameters
	</h2>

	<table border="1" style="margin: auto">
		<c:forEach var="order" items="${orders}">
			<tr bgcolor=#FFBF00>
				<th>Parameter Name</th>
				<th>Parameter Value(s)</th>
			</tr>
			<tr>
			<td>cardNum</td>
				<td><li>${order.creditcard}</li></td>
			</tr>
			<tr>
			<td>cardType</td>
				<td>${order.creditcardType }</td>
			</tr>
			<tr>
			<td>price</td>
				<td>${order.price}</td>
			</tr>
			<tr>
			<td>initial</td>
				<td>${order.initial }</td>
			</tr>
			<tr>
			<td>itemNum</td>
				<td>${order.itemNumber}</td>
			</tr>
			<tr>
			<td>address</td>
				<td>${order.address }</td>
			</tr>
			<tr>
			<td>firstName</td>
				<td>${order.firstName}</td>
			</tr>
			<tr>
			<td>description</td>
				<td>${order.description }</td>
			</tr>
			<tr>
			<td>lastName</td>
				<td>${order.lastName }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
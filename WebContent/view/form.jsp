<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력폼</title>
</head>
<body bgcolor=F8EDD8>
	<form action="/hwMVC/doOrder" method="post">
		<%--객체의 property에 접근하기위해서는 JSP Expression Language를 씀 --%>
		<h2><p style="text-align: center;">A Sample Form</p></h2>

		Item Number: <input type="text" name="itemNumber"><br />
		Description: <input type="text" name="description"><br />
		Price Each: <input type="text" name="price"><br />
		<hr>
		
		First Name: <input type="text" name="firstName"><br /> 
		Last Name: <input type="text" name="lastName"><br /> 
		Middle Initial: <input type="text" name="initial"><br /> 
		Shipping Address: <textarea name="address" cols="35" rows="3"></textarea><br />
		
		 Credit Card:<br />
		<input type="radio" name="cardType" value="Visa" checked>Visa<br />
		<input type="radio" name="cardType" value="MasterCard">MasterCard<br />
		<input type="radio" name="cardType" value="American Express">American Express<br /> 
		<input type="radio" name="cardType" value="Discover">Discover<br />
		<input type="radio" name="cardType" value="Java SmartCard">Java SmartCard<br /> 
		
		Credit Card Number: <input type="password" name="creditCard"><br /> 
		Repeat Credit Card Number: <input type="password" name="RecreditCard"><br /><br /><br />
		<input type="submit" value="Submit Order" style="float: right;">
	</form>
</body>
</html>
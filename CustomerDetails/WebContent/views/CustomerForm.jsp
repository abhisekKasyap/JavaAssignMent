<%@page import="com.exilant.dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<jsp:useBean id="cust" class="com.exilant.beans.Customer" scope="request" />
<jsp:setProperty property="*" name="cust"/>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Customer Insert Form</h1>
	<hr />
	<form action="/CustomerDetails/InsertCust" method = "post" >
		<table border="3">
			<tr>
				<td>Enter Customer Id</td>
				<td><input type="text" name="custId" /></td>
			</tr>
			<tr>
				<td>Enter Customer First Name</td>
				<td><input type="text" name="fName" /></td>
			</tr>
			<tr>
				<td>Enter Customer Last Name </td>
				<td><input type="text" name="lName" /></td>
			</tr>
			<tr>
				<td>Enter Customer Income </td>
				<td><input type="text" name="custIncome" /></td>
			</tr>
			<tr>
				<td>Enter Customer Email </td>
				<td><input type="text" name="custEmail" /></td>
			</tr>
			<tr>
				<td>Enter Customer House No </td>
				<td><input type="text" name="custHno" /></td>
			</tr>
			<tr>
				<td>Enter Customer Street </td>
				<td><input type="text" name="custStreet" /></td>
			</tr>
			<tr>
				<td>Enter Customer City </td>
				<td><input type="text" name="custCity" /></td>
			</tr>
			<tr>
				<td>Enter Customer Pin </td>
				<td><input type="text" name="custPin" /></td>
			</tr>
			<tr>
				<td><input type="reset" /></td>
				<td><input type="submit" value="Insert" /></td>
				
			</tr>
			<tr>
			<td><input type="submit" value="Select All" /></td>
			</tr>
			
		</table>

	</form>

</body>


</html>
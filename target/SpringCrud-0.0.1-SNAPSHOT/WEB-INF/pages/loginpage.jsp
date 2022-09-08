<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body Style = "background-color:#ffffe6">
<%@include file="header.jsp" %> 
<center>
<table>
	<form:form modelAttribute = "user" method="post">
	<tr>
	<td>Email</td>
	<td><form:input path="email" type='text'/></td>
	</tr>
	<tr>
	<td>Password</td>
	<td><form:input path="password" type='password'/></td>
	</tr>
	<tr>
	<td><a href = "login">LogIn</a></td>
	<td><a href = "employee/add">Register</a></td>
	</tr>
</form:form>
</table>
</center>
</body>
</html>
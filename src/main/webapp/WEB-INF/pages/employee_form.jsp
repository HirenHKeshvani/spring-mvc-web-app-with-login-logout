<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>User Form</title>
</head>
<body Style = "background-color:#ffffe6">
<%@include file="header.jsp" %> 
<center>
	<spring:url value="/employee/save" var="saveURL" />
	<form:form modelAttribute="employeeForm" method="post" action="${saveURL }">
		<form:hidden path="employeeid" />
		<table>
			<tr>
				<td>First name:</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password" /></td>
			</tr>
			
			<tr>
				<td>Role:</td>
				<td><form:select path="role">
				<form:option value="employee" label="employee"/>  
				<form:option value="admin" label="admin"/> 
				</form:select> 
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit">Save</button>
				</td>
			</tr>
		</table>
	</form:form>
	</center>
</body>
</html>
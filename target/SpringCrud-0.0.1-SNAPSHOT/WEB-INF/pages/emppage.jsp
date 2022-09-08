<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Information</title>
</head>
<body Style = "background-color:#ffffe6">
		<%@include file="header.jsp" %>  
			
<center>
	<h1>Employees Information</h1>
	<table width="90%" border="1">
		<tr>
			<th>ID</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Email</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${listEmployees }" var="employee">
			<tr>
				<td>${employee.employeeid }</td>
				<td>${employee.firstname }</td>
				<td>${employee.lastname }</td>
				<td>${employee.email }</td>
				<td><spring:url
						value="/employee/update/${employee.employeeid }" var="updateURL" />
					<a href="${updateURL }">Update</a></td>
				<td><spring:url
						value="/employee/delete/${employee.employeeid }" var="deleteURL" />
					<a href="${deleteURL }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<spring:url value="/employee/add" var="addURL" />
	<a href="${addURL }">Add User</a>
	</navbar>
	
</center>

</body>
</html>
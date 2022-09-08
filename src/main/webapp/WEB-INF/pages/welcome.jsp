<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login Page</title>
</head>
<body>
<%@include file="header.jsp" %> 


<h5 style  = "margin-left:3.6in;">Hi ${emp.firstname}, Here's Your Details </h5>
<center>


<h2>Personal Information</h2>
<table class="table table-sm" style = "width:50%">

  <tr>
    <th>FirstName :</th>
    <td>${emp.firstname}</td> 
  </tr>
  <tr>
  <th>LastName :</th>
    <td>${emp.lastname}</td> 
  </tr>
  <tr>
  <th>Email :</th>
  <td>${emp.email}</td> 
  </tr>
</table>

</center>
</body>
</html>
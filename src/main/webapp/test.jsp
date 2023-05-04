<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.example.employee.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Training</title>
</head>
<body>
	
	<jsp:useBean id="employee" class="com.example.employee.Employee" />

	<jsp:setProperty property="*" name="employee" />

	<%
	Employee emp = new Employee();

	out.print("Employee Name is " + emp.getUserName());
	
	
	%>

</body>
</html>



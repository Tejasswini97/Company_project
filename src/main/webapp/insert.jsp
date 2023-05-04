<%@page import="operations.InsertValues"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String dept_id = request.getParameter("dept_id");
	String dept_name = request.getParameter("dept_name");
	String description = request.getParameter("description");
	String count_emp = request.getParameter("count_emp");

	InsertValues value = new InsertValues();

	value.insertvalues(dept_id, dept_name, description, count_emp);
	%>

	Insert Successful

	<%
	String redirectURL = "http://localhost:8080/Training/index.jsp";
	response.sendRedirect(redirectURL);
	%>

</body>
</html>
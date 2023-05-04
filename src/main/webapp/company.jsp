<%@page import="java.util.Iterator"%>
<%@page import="common.User"%>
<%@page import="java.util.List"%>
<%@page import="operations.CompanyDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%




CompanyDetails company = new CompanyDetails();

List<User> list = company.getValues();

Iterator<User> it_list = list.iterator();
%>
<h1>Company Details Table</h1>

<body>


	<table BORDER="1">
		<tr>
			<th>dept_name</th>
			<th>description</th>
			<th>emp_name</th>
			<th>salary</th>
			<th>address</th>
			<th>experience</th>

		</tr>
		<%
		while (it_list.hasNext()) {
			User us = new User();
			us = it_list.next();
		%>
		<tr>
			<td><%=us.getDeptName()%></td>
			<td><%=us.getDescription()%></td>
			<td><%=us.getEmpname()%></td>
			<td><%=us.getSalary()%></td>
			<td><%=us.getAddress()%></td>
			<td><%=us.getExperience()%></td>

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
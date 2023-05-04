<%@page import="java.util.Iterator"%>
<%@page import="common.User"%>
<%@page import="java.util.List"%>
<%@page import="operations.EmployeeDetails"%>
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
EmployeeDetails emp = new EmployeeDetails();

List<User> list = emp.getValues();

Iterator<User> it_list = list.iterator();
%>
<h1>Employee table</h1>

<table BORDER="1">
		<tr>
			<th>dept_id</th>
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
			<td><%=us.getDeptid()%></td>
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
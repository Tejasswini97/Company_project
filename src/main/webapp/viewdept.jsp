<%@page import="java.util.Iterator"%>
<%@page import="org.jboss.util.collection.Iterators"%>
<%@page import="common.User"%>
<%@page import="java.util.List"%>
<%@page import="operations.ViewValues"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>

<html>
<head>
<title>The View Of Database Table</title>
</head>
<%
ViewValues values = new ViewValues();

List<User> list = values.getValues();

Iterator<User> it_list = list.iterator();
%>
<h1>View Department table</h1>

<body>


	<table BORDER="1">
		<tr>
			<th>dept_id</th>
			<th>dept_name</th>
			<th>description</th>
			<th>count_emp</th>
			<th>modify_table</th>

		</tr>
		<%
		while (it_list.hasNext()) {
			User us = new User();
			us = it_list.next();
		%>
		<tr>
			<td><%=(us.getDeptid())%></td>
			<td><%=(us.getDeptName())%></td>
			<td><%=(us.getDescription())%></td>
			<td><%=(us.getCountemp())%></td>
			<td><a href="editdept.jsp?dept_id=<%=(us.getDeptid())%>">Edit</a>
				&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="delete.jsp?deptid=<%=(us.getDeptid())%>">Delete</a>
		</tr>
		<%
		}
		%>


	</table>
</body>
</html>
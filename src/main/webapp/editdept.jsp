
<%@page import="common.User"%>
<%@page import="operations.EditValues"%>
<%@ page import="java.sql.*"%>
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
String deptid = (String)request.getParameter("dept_id");

EditValues values = new EditValues();

User us = values.editValue(deptid);

%>

<h1>Edit Department table</h1>
<form action="edit.jsp">


	Dept_id :<input type="text" name="dept_id" value="<%=deptid%>"><br /><br /> 
	
	Dept_Name :<input type="text" name="dept_name" value="<%=(us.getDeptName())%>"><br /><br />
	Description :<input type="text" name="description" value="<%=(us.getDescription())%>"><br /><br />
	Count_emp :<input type="text" name="count_emp" value="<%=(us.getCountemp())%>"><br /><br />
	 
	<input type="submit" value="Edit">
	</form>

</body>
</html>

<%@page import="operations.EditValues"%>
<%@page import="common.User"%>
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
	

			String deptid = request.getParameter("dept_id");
			String deptname = request.getParameter("dept_name");
			String description = request.getParameter("description");
			String countemp = request.getParameter("count_emp");

			User us = new User();
			us.setDeptid(deptid);
			us.setDeptName(deptname);
			us.setDescription(description);
			us.setCountemp(countemp);

			EditValues values1 = new EditValues();

			values1.updateValue(us);
	%>

	Update Successful

	<%
	String redirectURL = "http://localhost:8080/Training/viewdept.jsp";
	response.sendRedirect(redirectURL);
	%>


</body>
</html>
<%@page import="operations.DeleteValues"%>
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


String deptid = request.getParameter("deptid");

DeleteValues values = new DeleteValues();

values.deleteValue(deptid);
%>

Delete Successful

<%

String redirectURL = "http://localhost:8080/Training/viewdept.jsp";
response.sendRedirect(redirectURL);
%>

</body>
</html>
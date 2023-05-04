
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "java.sql.Connection;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Insert Details</h1>
<form action="insert.jsp">


Dept_id      : <input type= "text" name="dept_id"><br/><br/>
Dept_Name    : <input type= "text" name="dept_name"> <br/><br/>
Description  : <input type= "text" name="description"> <br/><br/>
Count_emp    : <input type= "text" name="count_emp"> <br/><br/>


<input type="submit" value="insert">
</form>
</body>
</html>

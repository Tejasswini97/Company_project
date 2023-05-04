<%@page import="jsp.LoginServlet"%>
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
<form action=LoginServlet method=post>


id         : <input type= "text" name="empid"><br/><br/>
first_name : <input type= "text" name="fname"> <br/><br/>
last_name  : <input type= "text" name="lname"> <br/><br/>
address    : <input type= "text" name="addr"> <br/><br/>
contact    : <input type= "text" name="cont"> <br/><br/>

<input type="submit" value="submit">
</form>
</body>
</html>
<%@page import="com.register.emp.EmpRegistration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List<HashMap<String,String>>employees= new ArrayList<HashMap<String,String>>();
HashMap <String,String> formData= new HashMap <String,String>();

formData.put("firstname", request.getParameter("firstname"));
formData.put("lastname", request.getParameter("lastname"));
formData.put("address", request.getParameter("address"));
formData.put("date", request.getParameter("date"));
formData.put("department", request.getParameter("department"));
employees.add(formData);
out.println(employees);

%>


</body>
</html>
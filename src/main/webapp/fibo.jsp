<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.example.fibonacci.Fibonacci"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Training</title>
</head>
<body>

	<jsp:useBean id="fibonacci" class="com.example.fibonacci.Fibonacci"
		scope="page" />

	<jsp:setProperty name="fibonacci" property="*"  />

	<%
	Fibonacci fbs = new Fibonacci();

	int n1=0,n2=1,n3,i,count=10;    
	 out.print(n1+" "+n2);   
	    
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;    
	  out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	
	
	%>
	

</body>
</html>
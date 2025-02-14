<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a,b,c;
Date d;
%>
<% 
	d=new Date(); 
%>
<h1> date is<%=d%></h1>
<%
a=4;
b=3;
c=a+b;
out.print("add="+c);
%>
</body>
</html>
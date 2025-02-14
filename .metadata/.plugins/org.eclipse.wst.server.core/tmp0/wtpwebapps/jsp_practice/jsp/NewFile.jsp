<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! Date d;%>
<%@include file="tagfile.jsp" %>

<%
 d=new Date();
 out.println(d.toString());
%>
</body>
</html>
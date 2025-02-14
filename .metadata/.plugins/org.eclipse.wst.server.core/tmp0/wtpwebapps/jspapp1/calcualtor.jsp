<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	
	
</head>
<body>
<%!
int a,b,c; 
%>
<%@include file="demo.jsp" %>
<form  name="fr" action="">
<input type="text" name="ft" value="" placeholder="fisrt" style='width:300px;heigth:40px;' /><br><br>
<input type="text" name="sd" value="" placeholder="second" style='width:300px;heigth:40px;'/><br><br>
<input type="submit" name="b" value="add"  style='width:300px;heigth:40px;'/>
</form>
<%
String btn=request.getParameter("b");
System.out.println(btn);
if(btn!=null)
{
	   a=Integer.parseInt(request.getParameter("ft"));
	   b=Integer.parseInt(request.getParameter("sd"));
	c=a+b;
	out.println("add="+c);

}
%>
</body>
</html>
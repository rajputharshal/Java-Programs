<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input
{
 height: 30px;
 width: 400px;
 display: block;
 margin:10px;
 
}
table
{
 border:2px solid;
 width:500px;
}
table th
{
	border:2px solid;
	width:40px;
	text-align: center;
}
table td
{
	border:2px solid;
	width:40px;
	text-align: center;
}
</style>
</head>
<body>
<%!
int a,tab=1;
%>
<form action="" method="get">
<input type="text" name="a" value="">
<input type="submit" name="s" value="Table">
</form>
<%
	String btn=request.getParameter("s");
    if(btn!=null)
    {
    	a=Integer.parseInt(request.getParameter("a"));
%>
	<table> <tr><th> Iteration</th><th>*</th><th>NO</th><th>=</th><th>Result</th></tr>
<%
    	for(int i=1;i<=10;i++)
    	{
    		tab=a*i;
    		out.println("<tr><td>"+i+"</td>"
    				+"<td>*</td>"
    				+"<td>"+a+"</td>"
    				+"<td>=</td>"
    				+"<td>"+tab+"</td></tr>");
    	}
    }
%>
</table>
</body>
</html>
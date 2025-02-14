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
   border-radius: 10px;
   height: 40px;
   width: 400px;
   display:block;
   padding: 10px;
   margin: 10px;
 }
</style>
</head>
<body>
<%! int a,b,c; %>
<form name="frm" action="" method="get">
<input type="text" name='a' value='' placeholder='frist'>
<input type="text" name="b" value="" placeholder="b">
<input type="submit" value="result" name="s">

<% 
	String str=request.getParameter("s");
	if(str!=null)
	{
		a=Integer.parseInt(request.getParameter("a"));
		b=Integer.parseInt(request.getParameter("b"));
		c=a+b;
		out.println("<input type='text' value="+c+">");
	}
%>

</form>
</body>
</html>
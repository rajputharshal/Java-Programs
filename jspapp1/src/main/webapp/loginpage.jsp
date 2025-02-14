<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String name,pass;
Connection con ;
PreparedStatement stm;
%>
<form name="frm" action="">
<input type='text' name='name' value=''  /><br>
<input type='text' name='pass' value=''/><br>
<input type='submit' name='s' value='Register'/>
</form>

<%
	String btn=request.getParameter("s");
System.out.println("btn");
	if(btn != null)
	{
		try
		{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","12345");
				stm=con.prepareStatement(" insert into admin values(0,?,?)");
				name=request.getParameter("name");
				pass=request.getParameter("pass");
				stm.setString(1,name);
				stm.setString(2,pass);
				System.out.println(name + pass);
				int val=stm.executeUpdate();
				if(val>0)
				{
					out.println("<h1>login<>");
				}
				else
				{
					out.println("faild");
				}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	else
	{
		out.println("faild");
	}
%>
</body>
</html>
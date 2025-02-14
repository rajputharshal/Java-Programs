<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        * {
            padding: 0%;
            margin: 0%;
            box-sizing: border-box;
        }

        .clearfix::after {
            content: "";
            display: block;
            clear: both;
        }

        .main_div {
            margin: auto;
            width: 500px;
            margin-top: 200px;
        }

        .main_div div input {
            width: 100%;
            padding: 10px;
            margin: 10px 0px 10px 0px;
        }
    </style>
</head>
<body>
<%!
	Connection con;
	PreparedStatement stm;
	
%>
<%@include file="nav.jsp"%>
<form name="frm" action="" class="main_div">

        <div>
            <input  name="name" value="" type="text" placeholder="enter name" />
        </div>
        <div>
            <input  name="contact" type="text" value="" placeholder="contact" />
        </div>
        <div>
            <input  name="email" type="text" value="" placeholder="emial" />
        </div>
        <div>
            <input  name="password" type="text" value="" placeholder="password" />
        </div>
        <div>
            <input type="submit" name="s" value="Register" />
        </div>
</form>
 <%
 	String btn=request.getParameter("s");
 System.out.println(btn);
 	if(btn!=null)
 	{
 		Class.forName("com.mysql.cj.jdbc.Driver");
 		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","12345");
 		if(con!=null)
 		{
 			stm=con.prepareStatement("insert into  register values('0',?,?,?,?)");
 			stm.setString(1,request.getParameter("name"));
 			stm.setInt(2,Integer.parseInt(request.getParameter("contact")));
 			stm.setString(3,request.getParameter("email"));
 			stm.setString(4,request.getParameter("password"));
 			int v=stm.executeUpdate();
 			if(v>0)
 			{
 				out.println("<h1>succesd</h1>");
 			}
 			else
 			{
 				out.println("<h1>faild</h1>");

 			}
 		}
 		else
 		{
 			out.println("dbs not connected");
 		}
 	}
 %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        table {
          border: 2px solid rgb(6, 4, 3) ;
          width: 500px;
          margin:auto;
          margin-top:100px;
        }
        table tr:hover{
            color: rgb(245, 106, 0);
            background-color: black;
        }
        table th
        {
            border: 2px solid black;
        }
        table td
        {
            border: 2px solid black;
        }
    </style>
</head>
<body>
<%!
	Connection con;
	PreparedStatement stm;
	
%>
<%@include file="nav.jsp" %>
<%
       try
{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","12345");
   		if(con!=null)
   		{
   			stm=con.prepareStatement("select * from register");
   			ResultSet rs=stm.executeQuery();
%>
   	<table>
           <tr>
               <th>Name</th>
               <th>contact</th>
               <th>email</th>
               <th>passwod</th>
               <th>DELETE</th>
               <th>UPDATE</th>
           </tr>
  <%			
   			while(rs.next())
   			{
   %>
   			<tr>
   				<td><%=rs.getString("name")%></td>
   				<td><%=rs.getInt("contact") %></td>
   				<td><%=rs.getString("email") %></td>
   				<td><%=rs.getString("Password") %></td>
   				<td><a href="delete">Delete</a></td>
   				<td><a href="update">Update</a></td>
   			</tr>
   		
   <%	
   			}
  %>
  		</table>
  <%
   		}
   		else
   		{
   			System.out.println("not connected");
   		} 
}
catch(Exception ex)
{
	System.out.println("======================="+ex);
}
%>

	
     
</body>
</html>
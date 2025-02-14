<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        input
        {
            width: 400px;
            height: 40px;
            margin: 10px;
            
        }
        table
        {
            border: 2px  solid black  ;
            width:500px;
        }
        table th{
            border: 2px solid black;
        }
        table td{
            border: 2px solid black;
            text-align: center;
        }
        table tr:hover{
            color: wheat;
            background-color: black;
        }
    </style>
</head>
<body>
<%!
int no,i;
%>
<form  name="frm" action="">
        <input type="text" name="no" value="" placeholder="enter number">
        <input type="submit" name="s" value="Result" >
</form>
<%
	String btn=request.getParameter("s");
	if(btn!=null)
	{
		no=Integer.parseInt(request.getParameter("no"));
%>
	<table>
   	 <tr>
        <th>Itration</th>
        <th>*</th>
        <th>Number</th>
        <th>=</th>
        <th>Result</th>
   	 </tr>
<%
		
		for(i=1;i<=10;i++)
		{
%>
			 <tr>
		        <td><%=i %></td>
		        <td>*</td>
		        <td><%=no %></td>
		        <td>=</td>
		        <td><%=no*i%></td>
		    </tr>
<%
		}
%>
		</table>>
<%
	}
%>

</body>
</html>
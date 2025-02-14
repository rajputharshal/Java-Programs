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
            margin: auto;
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
				out.print(" <table>");
			   out.println("<tr>");
		        out.println("<th>Itration</th>");
		       out.println(" <th>*</th>");
		        out.println("<th>Number</th>");
		        out.println("<th>=</th>");
		        out.println("<th>Result</th>");
		    	out.println("</tr>");
		    	for(i=1;i<=10;i++)
		    	{
		    		 out.println("<tr>");
		    	        out.println("<td>"+i+"</td>");
		    	        out.println("<td>*</td>");
		    	        out.println("<td>"+no+"</td>");
		    	        out.println("<td>=</td>");
		    	        out.println("<td>"+no*i+"</td>");
		    	  		 out.println(" </tr>");
		    	}
		    	out.println("/table");
	}
%>
</body>
</html>
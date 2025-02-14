package LoginApp_pack;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/loginapp")
public class LoginApp extends HttpServlet {    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String contact=request.getParameter("contact");
		String  name=request.getParameter("name");
		try 
		{
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");
			PreparedStatement stm=con.prepareStatement("select * from login where email=? and password=?");
			stm.setString(1, email);
			stm.setString(2, pass);
			ResultSet rs=stm.executeQuery();
				if(rs.next())
				{
					RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
					rd.forward(request, response);
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("loginMain.html");
					rd.include(request, response);
					pr.println("<h1>enter valid user name and password!...</h>");
				}/*
				
			if(rs.next())
			{
				if(rs.getString("email").equals(email)&& rs.getString("password").equals(pass))
				{
					RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
					rd.forward(request, response);
					
					
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("loginMain.html");
					rd.include(request, response);
					pr.println("enter valid user name and password!...");
					
				}
			}*/
			
		} 
		catch (SQLException e)
		{
			pr.println(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

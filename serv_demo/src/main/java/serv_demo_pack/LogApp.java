package serv_demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/logpage")
public class LogApp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//String name=request.getParameter("name");
		String email=request.getParameter("emil");
		String contact=request.getParameter("contact");
		try
		{
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
			PreparedStatement stm=con.prepareStatement("select * from jj where email=? and contact=?");
			stm.setString(1, email);
			stm.setString(2, contact);
			ResultSet rs=stm.executeQuery();
			if(rs.next())
			{
				out.print("jjjjjjjjjjjjjjjjjj");
				RequestDispatcher dp=request.getRequestDispatcher("welc.html");
				dp.forward(request, response);
			}
			else
			{
				RequestDispatcher dp=request.getRequestDispatcher("login.html");
				dp.include(request, response);
				out.print("invalid user name password");
			}
		}
		catch(Exception ex)
		{
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

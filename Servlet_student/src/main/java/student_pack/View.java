package student_pack;

import java.io.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/hjghf")
public class View extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getContentType();	
	PrintWriter out=response.getWriter();
		try
		{
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
			PreparedStatement stm=con.prepareStatement("selet * from stude");
			ResultSet rs=stm.executeQuery();
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>rs.getInt(1) </td>");
				out.print("<td> rs.getString(2) </td>");
				out.print("</tr>");

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

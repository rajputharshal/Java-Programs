package servletPractice_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewPageurl")
public class viewPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");
			PreparedStatement stm=con.prepareStatement("select * from login");
			
			ResultSet rs=stm.executeQuery();
			out.println("<table>\r\n"
					+ "	<tr><th>name</th><th>email</th><th>contact</th><th>id</th><th>Delete</th><th>name</th></tr>");
			while(rs.next())
			{
				out.println("<tr>"
						+ "<td>"+rs.getString("name")+"</td>"
						+ "<td>"+rs.getString("email")+"</td>"
						+ "<td>"+rs.getInt("contact")+"</td>"
						+ "<td>"+rs.getInt("id")+"</td>"
						+ "<td><a href='deleteurl?id="+rs.getInt("id")+"'>Delete</a></td>"
						+ "<td><a href='updateurl?name="+rs.getString("name")+"'>Name</a></td></tr>");


			}
			out.println("</tabale>");
		}
		catch(Exception e)
		{
			out.println("e=============="+e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

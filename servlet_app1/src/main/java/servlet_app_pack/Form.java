package servlet_app_pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/form")
public class Form extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		try
		{
		
		/*	out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "<link rel=\"stylesheet\" a  href=\"CSS/NewFile.css\"/>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<div class=\"abc\">\r\n"
					+ "	<form name=\"frm\" action=\"\" method=\"post\">\r\n"
					+ "		<input type=\"text\" name=\"name\" value=\"\" placeholder=\"name\"/><br><br>\r\n"
					+ "		<input type=\"text\" name=\"email\" value=\"\" placeholder=\"email\"/><br><br>\r\n"
					+ "		<input type=\"text\" name=\"contact\" value=\"\" placeholder=\"contact\"><br><br>\r\n"
					+ "		<input type=\"submit\" name=\"s\" value=\"button\">\r\n"
					+ "	</form>\r\n"
					+ "	</div>\r\n"
					+ "</body>\r\n"
					+ "</html>");
			
			String btn=request.getParameter("s");   ///check button click or not
			if(btn!=null)
			{*/
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
		   // Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
			if(con!=null)
			{
				PreparedStatement stm=con.prepareStatement("insert into jj values(?,?,?)");
				stm.setString(1,name);
				stm.setString(2,email);
				stm.setString(3, contact);
				int v=stm.executeUpdate();
				if(v>0)
				{
					pr.print("<h1>Registration Success............</h1>");;
				}
				else
				{
					pr.println("<h1>Registration faild............</h1>");;
				}
			}
			else
			{
				pr.println("<h1>sql not connected</h1>");
			}
		// }
		}
		
		catch(Exception ex)
		{
			pr.println(ex);
		}
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

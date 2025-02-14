package servletPractice_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerurl")
public class register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<form name=\"register\" action=\"\" method=\"get\">\r\n"
				+ "	<input type=\"text\" name=\"id\" value=\"\" placeholder=\"id\">\r\n"
				+ "	<input type=\"text\" name=\"name\" value=\"\" placeholder=\"name\">\r\n"
				+ "	<input type=\"text\" name=\"email\" value=\"\" placeholder=\"email\">\r\n"
				+ "	<input type=\"text\" name=\"con\" value=\"\" placeholder=\"contact\">\r\n"
				+ "	<input type=\"text\" name=\"pass\" value=\"\" placeholder=\"password\">\r\n"
				+ "	<input type=\"submit\" name=\"btn\" value=\"login\" >\r\n"
				+ "</form>");
		int con,id;
		String name,email,pass ,btn;
		id=Integer.parseInt(request.getParameter("id"));
		name=request.getParameter("name");
		email=request.getParameter("email");
		con=Integer.parseInt(request.getParameter("con"));	
		pass=request.getParameter("pass");
		btn=request.getParameter("btn");
		if(btn!=null)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");
				PreparedStatement stm=conn.prepareStatement(" insert into login values(?,?,?,?,?)");
				stm.setString(1, name);
				stm.setString(2, email);
				stm.setInt(3, con);
				stm.setString(4, pass);
				stm.setInt(5, id);
				int val=stm.executeUpdate();
				if(val>0)
				{
					out.println("registered");
				}
				else
				{
					out.println("registration faild");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			out.println("wrong register");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

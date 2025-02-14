package servletPractice_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first_pageurl")
public class first_page extends HttpServlet {
	
    public first_page() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String btn=request.getParameter("login");
		if(btn!=null)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");
				PreparedStatement stm=con.prepareStatement("select * from login where name=? and password=?");
				stm.setString(1, name);
				stm.setString(2, pass);
				
				ResultSet rs=stm.executeQuery();
				if(rs.next())
				{
					out.println("login");
					RequestDispatcher rdp=request.getRequestDispatcher("viewPageurl");
					rdp.forward(request, response);
				}
				else
				{
					out.println("please check your id password");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			out.println("wrong");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package package_mini;

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


@WebServlet("/adminLoginurl")
public class adminLogin extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("n");
		int pass=Integer.parseInt(request.getParameter("p"));
		String btn=request.getParameter("btn");
		
		if(btn!=null)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/min","root","12345");
				PreparedStatement stm=con.prepareStatement("select * from admin where uname=? and pass=?");
				stm.setString(1, name);
				stm.setInt(2, pass);
				ResultSet rs=stm.executeQuery();
				if(rs.next())
				{
					RequestDispatcher rdp=request.getRequestDispatcher("homePage.html");
					rdp.include(request, response);
				}
				else
				{
					RequestDispatcher rdp=request.getRequestDispatcher("wrong.html");
					rdp.include(request, response);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("enter informanton properly");
		}
		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

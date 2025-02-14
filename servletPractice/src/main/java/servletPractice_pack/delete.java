package servletPractice_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteurl")
public class delete extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	int id=Integer.parseInt(request.getParameter("id"));
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");
		PreparedStatement stm=con.prepareStatement("delete from login where id=?");
		stm.setInt(1, id);
		int val=stm.executeUpdate();
		if(val>0)
		{
			RequestDispatcher rdp=request.getRequestDispatcher("viewPageurl");
			rdp.forward(request, response);
		}
		else
		{
			RequestDispatcher rdp=request.getRequestDispatcher("viewPageurl");
			rdp.forward(request, response);
		}
	}
	catch(Exception e)
	{
		System.out.println("delete=========="+e);
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

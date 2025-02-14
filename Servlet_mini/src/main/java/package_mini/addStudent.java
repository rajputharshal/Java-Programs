package package_mini;

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

@WebServlet("/addStudenturl")
public class addStudent extends HttpServlet {       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("homePage.html");
		rd.include(request, response);
		
		out.print("<form name='addstud' action='' method='get'>"
				+ "	<input name='id' type='text'  value='' placeholder='id'> "
				+ "	<input name='name' type='text' value='' placeholder='name'>"
				+ "	<input type='text' name='contact' value='' placeholder='contact'>"
				+ "	<input type='submit' value='ADD' name='btn'>"
				+ "</form>");
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int contact=Integer.parseInt(request.getParameter("contact"));
		
		String btn=request.getParameter("btn");
		if(btn!=null)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/min","root","12345");
				if(con!=null)
				{
					PreparedStatement stm=con.prepareStatement("insert into student values(?,?,?)");
					stm.setInt(1, id);
					stm.setString(2, name);
					stm.setInt(3,contact);
					int val=stm.executeUpdate();
					if(val>0)
					{
						RequestDispatcher rdp=request.getRequestDispatcher("wel.html");
						rdp.include(request, response);
					}
					else
					{
						RequestDispatcher rdp=request.getRequestDispatcher("wrong.html");
						rdp.include(request, response);
					}
				}
				else
				{
					System.out.println("datase not connected");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		else
		{
			System.out.println("fill info properly");
		}
		
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

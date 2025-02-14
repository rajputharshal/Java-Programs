package LoginApp_pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registerrpp")
public class RegisterApp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String contact=request.getParameter("contact");
		String  name=request.getParameter("name");
		
		
		try {
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345");

			PreparedStatement stm1=con.prepareStatement("insert into login values(?,?,?,?,'0')");
			stm1.setString(1,name);
			stm1.setString(2, email);
			stm1.setString(3,contact);
			stm1.setString(4,pass);
			int value=stm1.executeUpdate();
			if(value>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("loginMain.html");
				rd.forward(request, response);
				pr.print("succesful enterd");
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Register.html");
				rd.include(request, response);
				pr.println("data not valid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

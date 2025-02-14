package package_mini;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/viewStudenturl")
public class viewStudent extends HttpServlet
	{
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/min","root","12345");
			PreparedStatement stm=con.prepareStatement("select * from student");
			ResultSet rst=stm.executeQuery();
			out.println("<table> <tr><th>id</th> <th>name</th> <th>contact</th></tr>");
			while(rst.next())
			{
				out.print("<tr><td>"+rst.getInt(1) +"</td>"
						+	"<td> "+rst.getString(2)+" </td>"
						+	"<td>"+rst.getInt(3)+"</td>"
						+ 	"</tr>");
			}
			out.println("</table>");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

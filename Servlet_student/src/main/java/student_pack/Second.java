package student_pack;

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

@WebServlet("/Second")
public class Second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rs = request.getRequestDispatcher("First");
		rs.include(request, response);
		
		out.println("<!DOCTYPE html>\r\n"
				+ "	<html>\r\n"
				+ "	<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>Insert title here</title>\r\n"
				+ "	</head>\r\n"
				+ "	<body>\r\n"
				+ "		<form name=\"addform\" action=\"\" method=\"get\">\r\n"
				+ "			<input type=\"text\" name=\"id\" value=\"\"placeholder=\"id\"/><br><br>\r\n"
				+ "			<input type=\"text\" name=\"name\" value=\"\"placeholder=\"name\"/><br><br>\r\n"
				+ "			<input type=\"text\" name=\"email\" value=\"\"placeholder=\"email\"/><br><br>\r\n"
				+ "			<input type=\"text\" name=\"contact\" value=\"\"placeholder=\"contact\"/><br><br>\r\n"
				+ "			<input type=\"submit\" name=\"sub\" value=\"submit\"/>\r\n"
				+ "		</form>\r\n"
				+ "	</body>\r\n"
				+ "	</html>");
		
			String button=request.getParameter("sub");
				
				if(button!=null) {
		
				try
				{
					Integer id=Integer.valueOf(request.getParameter("id"));
					String name=request.getParameter("name");
					String email=request.getParameter("email");
					Integer contact=Integer.valueOf(request.getParameter("contact"));
					
					com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
					DriverManager.registerDriver(d);
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
																
					if(con!=null)
					{
						PreparedStatement stm=con.prepareStatement("insert into stud values(?,?,?,?)");
						stm.setInt(1, id);
						stm.setString(2,name);
						stm.setString(3, email);
						stm.setInt(4, contact);
						int val=stm.executeUpdate();
						
						if(val>0)
						{
//							RequestDispatcher dp=request.getRequestDispatcher("welcome");
//							dp.forward(request, response);
							out.println("<h1>success</h1>");
						}
						else
						{
//							RequestDispatcher dp=request.getRequestDispatcher("Second");
//							dp.include(request, response);
							out.println("<h1>failed</h1>");
						}
					}
					else
					{
						out.println("<h1>database not connected</h1>");
					}
				}
				catch(Exception ex)
				{
					out.print(ex);
				}
				}else {
					out.println("NOt Have Value of Button please press submit button");
				}	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

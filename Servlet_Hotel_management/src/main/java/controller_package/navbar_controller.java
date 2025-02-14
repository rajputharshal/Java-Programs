package controller_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/navbarurl")
public class navbar_controller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<ul style=\"list-style-type: none;\" >\r\n"
				+ "		<li><a href='addHotel_Controllerurl' \">Add Hotel</a></li>\r\n"
				+ "		<li><a href=\"viewHotelurl\">ViewHotels</a></li>\r\n"
				+ "		<li><a href='AddHotelInfo_Controllerurl'>Add Hotel Information</a></li>\r\n"
				+ "		<li><a href='viewHotelInfo_contrurl'>view Hotel Information</a></li>\r\n"
				+ "		\r\n"
				+ "	</ul>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}

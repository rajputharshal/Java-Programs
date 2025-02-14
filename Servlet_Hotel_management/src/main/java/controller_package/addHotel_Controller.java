package controller_package;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_package.addHotel_model;
import service_package.addHotel_service;


@WebServlet("/addHotel_Controllerurl")
public class addHotel_Controller extends HttpServlet
{
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rdp=request.getRequestDispatcher("navbarurl");
		rdp.include(request,response);
		
		out.print("<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<form>\r\n"
				+ "		<input type=\"text\" name=\"hotelid\" value=\"\" placeholder=\"id\"><br><br>\r\n"
				+ "		<input type=\"text\" name=\"hotelname\" value=\"\" placeholder=\"name\"><br><br>\r\n"
				
				+ "		<input type=\"submit\" name=\"sub\" value=\"Add Hotel\">\r\n"
				+ "	</form>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");		
		String hotelname=request.getParameter("hotelname");
		Integer hotelid=Integer.valueOf(request.getParameter("hotelid"));
	
		addHotel_model addHotel=new addHotel_model();
		addHotel.setHotelName(hotelname);
		addHotel.setHotelid(hotelid);
		
		addHotel_service addServ=new addHotel_service();
		boolean b=addServ.isaddHotelserv(addHotel);
		
		
	if(b)
	{
		out.print("<h1>add succesfully...<h2>");
	}
	else
	{
		out.print("<h1>faild...<h2>");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

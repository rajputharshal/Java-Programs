package controller_package;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_package.addHotel_model;
import service_package.addHotel_service;

@WebServlet("/viewHotelurl")
public class viewHotel_controller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rp=request.getRequestDispatcher("navbarurl");
		rp.include(request,response);
		
		addHotel_service hotelserv=new addHotel_service();
		List<addHotel_model> list=hotelserv.viewHoltes();
		
		out.println("<table >");
		out.println("<tr><th>Hotels</th> "
				+ "<th>Delete</th> <th>Update</th> "
				+ "</tr><br><br>");
		for(addHotel_model h:list)
		{
			out.println("<tr><td>"+h.getHotelname()+"</td> "
			+ "<td><a href=\"deleteHotelurl?id="+h.getHotelid()+"\">Delete</a></td> "
			+ "<td><a href=\"updateHotel_Controllerurl?id="+h.getHotelid()+"&name="+h.getHotelname()+"\">Update</a></td></tr>");
		}
		out.println("</table>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

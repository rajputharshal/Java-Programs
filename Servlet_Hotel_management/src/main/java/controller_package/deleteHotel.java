package controller_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service_package.addHotel_service;


@WebServlet("/deleteHotelurl")
public class deleteHotel extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id").trim());
		
		addHotel_service serv=new addHotel_service();
		boolean b=serv.isdeleteHotel_serv(id);
		if(b)
		{
			out.print("<h1>done.....</h1>");
		}
		else
		{
			out.print("<h1>done.....</h1>");

		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

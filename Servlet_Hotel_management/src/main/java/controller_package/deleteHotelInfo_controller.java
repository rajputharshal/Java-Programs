package controller_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service_package.viewHotelInfo_serv;

/**
 * Servlet implementation class deleteHotelInfo_controller
 */
@WebServlet("/deleteHotelInfo_controllerurl")
public class deleteHotelInfo_controller extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	RequestDispatcher rdp=request.getRequestDispatcher("navbarurl");
	rdp.include(request,response);
	int id=Integer.parseInt(request.getParameter("id"));
	//System.out.println(id);
	
	viewHotelInfo_serv srv=new viewHotelInfo_serv(); 
	boolean val=srv.deleteInfoserv(id);
	System.out.println(val);
	if(val)
	{
		out.print("delete sucessfull");
	}
	else
	{
		out.print("somnthing wrong");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

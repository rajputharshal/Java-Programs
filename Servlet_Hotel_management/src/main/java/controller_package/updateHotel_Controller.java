package controller_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_package.addHotel_model;
import service_package.updateHotel_serv;

@WebServlet("/updateHotel_Controllerurl")
public class updateHotel_Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rdp=request.getRequestDispatcher("navbarurl");
		rdp.include(request,response);
		String Hid=request.getParameter("id");
		String Hname=request.getParameter("name");

		out.print("<form name='upf action='' method='get'>");
		out.print("<input type='hidden'name='id' value="+Hid+">"
				+ "	<input type='text'name='name' value="+Hname+">"
				+ "	<input type='Submit'name='sub' value='Update'>");
		out.println("</form>");
		
		String sub=request.getParameter("sub");
		System.out.println(sub);
		if(sub!=null)
		{
			System.out.println(sub);
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			
			
			addHotel_model model =new addHotel_model();
			model.setHotelid(id);
			model.setHotelName(name);
			
			updateHotel_serv service=new updateHotel_serv();
			boolean b=service.updateservice(model);
			
			System.out.println(b);
			if(b)
			{
				out.print("<h1>update</h2>");
			}
			else
			{
				out.print("<h1>not update</h2>");
			}
			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

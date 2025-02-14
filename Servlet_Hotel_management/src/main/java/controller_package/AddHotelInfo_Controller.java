package controller_package;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_package.addHotelInfo_model;
import model_package.addHotel_model;
import service_package.addHotel_service;


@WebServlet("/AddHotelInfo_Controllerurl")
public class AddHotelInfo_Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher re=request.getRequestDispatcher("navbarurl");
		re.include(request,response);
		
		addHotel_service hotelShow=new addHotel_service();
		ArrayList <addHotel_model> list=new ArrayList<addHotel_model>();
		list=(ArrayList<addHotel_model>) hotelShow.viewHoltes();
		
		
		out.print("<form name='infoHotel' action='' method='post'>"
				+ "	<input type='text' name='Iid' value='' placeholder='id'><br><br>"
				+ "	<input type='text' name='Contact' value='' placeholder='Contact'><br><br>"
				+ "	<input type='text' name='Email' value='' placeholder='Email'><br><br>"
				+ "	<input type='text' name='Location' value='' placeholder='Location'><br><br>"
				+ "	<input type='text' name='Address' value='' placeholder='Address'><br><br>");
				out.print("<select name='HotelName'>");
				out.print("	<option >Select Hotel</option>");
					for(addHotel_model  model:list )
					{
						out.print("	<option value='"+model.getHotelname()+"'>"+model.getHotelname()+"</option>");
					}
				out.print("</select>"
						+"<input type='submit' name='sub' value='submit' >"
						+ "</form>");
		
		String bt=request.getParameter("sub");
		if(bt!=null)
		{
			int Iid=Integer.parseInt(request.getParameter("Iid"));
			int Contact=Integer.parseInt(request.getParameter("Contact"));
			String Email=request.getParameter("Email");
			String Location=request.getParameter("Location");
			String Address=request.getParameter("Address");
			String HotelName=request.getParameter("HotelName");
			addHotelInfo_model info=new addHotelInfo_model();
			info.setIid(Iid);
			info.setContact(Contact);
			info.setEmail(Email);
			info.setLocation(Location);
			info.setAddress(Address);
			info.setHotelName(HotelName);
			addHotel_service addinfo=new addHotel_service();
			boolean b=addinfo.addHotelInfo_serv(info);
			System.out.println(b);
			if(b)
			{
				out.print("<h1>done</h1>");
			}
			else
			{
				out.print("<h1>faild</h1>");
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

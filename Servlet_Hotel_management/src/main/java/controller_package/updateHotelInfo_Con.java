package controller_package;


import java.io.*;

import javax.servlet.*;
//import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model_package.addHotelInfo_model;
import service_package.viewHotelInfo_serv;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateHotelInfo_Con
 */
@WebServlet("/updateHotelInfo_Conurl")
public class updateHotelInfo_Con extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		RequestDispatcher rdp=request.getRequestDispatcher("navbarurl");
		rdp.include(request,response);
		
		String iid=request.getParameter("idu");
		//String iname=request.getParameter("name");
		String icontact=request.getParameter("contact");
		String iemail=request.getParameter("email");
		String ilocation=request.getParameter("location");
		String iaddress=request.getParameter("address");
		
	System.out.println("id="+iid +"		email="+ iemail +"		con="+ icontact +"		loc="+ilocation+ "		add="+iaddress );
		out.print("<form name='info' action='' method='get'>");		
		out.println(""
				
				+ "	<input type='text' name='id' value='"+iid+"' placeholder='id' >"
				+ "	<input type='text' name='Contact' value="+icontact+" placeholder='contact' >"
				+ "	<input type='text' name='Email' value='"+iemail+"' placeholder='email'>"
				+ "	<input type=text' name='Location' value='"+ilocation+"' placeholder='location'>"
				+ "	<input type='text' name='Address' value='"+iaddress+"' placeholder='address'>"
				+ "	<input type='Submit'name='sub' value='Update'>"
				);
		out.println("</form>");

		String but=request.getParameter("sub");
		System.out.println("update controll="+but);
		if(but!=null)
		{
			int id1=Integer.parseInt(request.getParameter("id"));
			int contact=Integer.parseInt(request.getParameter("Contact"));
			String email=request.getParameter("Email");
			String location=request.getParameter("Location");
			String address=request.getParameter("Address");
			
			addHotelInfo_model model=new addHotelInfo_model();
			model.setHotelid(id1);
			model.setContact(contact);
			model.setEmail(email);
			model.setLocation(location);
			model.setAddress(address);
			
			viewHotelInfo_serv serv=new viewHotelInfo_serv();
			boolean b=serv.updatehotelinfo(model);
			System.out.println(b);
			if(b)
			{
				out.print("<h1>succsess </h1>");
			}
			else
			{
				out.print("<h1>faild </h1>");

			}
		}
		else
		{
			out.print("<h1>not enter</h1>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

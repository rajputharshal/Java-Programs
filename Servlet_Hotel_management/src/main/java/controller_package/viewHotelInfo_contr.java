package controller_package;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.Request;

import model_package.addHotelInfo_model;
import service_package.viewHotelInfo_serv;

@WebServlet("/viewHotelInfo_contrurl")
public class viewHotelInfo_contr extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	RequestDispatcher rpd=request.getRequestDispatcher("navbarurl");
	rpd.include(request,response);
	
	viewHotelInfo_serv srv=new viewHotelInfo_serv(); //service class  object
	//List <addHotelInfo_model>list=new ArrayList<addHotelInfo_model>();
	//addHotelInfo_model model=new addHotelInfo_model();
	List <addHotelInfo_model> list=srv.viewInfo();	
	out.print("<table>"
			+ "<tr>"
			+ "<th>Id</th>"
			+ "<th>Name</th>"
			+ "<th>Contact</th>"
			+ "<th>Email</th>"
			+ "<th>Location</th>"
			+ "<th>Address</th>"
			+"<th>Delete</th>"
			+"<th>Update</th>"
			+ "</tr>");
			for(addHotelInfo_model f:list)
			{
				out.print("<tr>"
						+ "<td>"+f.getHotelid()+"</td>"
						+ "<td>"+f.getHotelname()+"</td>"
						+ "<td>"+f.getContact()+"</td>"
						+ "<td>"+f.getEmail()+"</td>"
						+ "<td>"+f.getLocation()+"</td>"
						+ "<td>"+f.getAddress()+"</td>"
						+ "<td><a href='deleteHotelInfo_controllerurl?id="+f.getHotelid()+"'>Delete</a></td>"
						+ "<td><a href='updateHotelInfo_Conurl?idu="+f.getHotelid()+"&contact="+f.getContact()+"&email="+f.getEmail()+"&location="+f.getLocation()+"&address="+f.getAddress()+"'>Update</a></td>"
						+ "</tr>");
			}
			out.print( "</table>");
			
			//delete hotel information
//			//String id=request.getParameter("id");
//			int id=Integer.parseInt(request.getParameter("id"));
//			//System.out.println(id);
//			boolean val=srv.deleteInfoserv(id);
//			System.out.println(val);
//			if(val)
//			{
//				out.print("delete sucessfull");
//			}
//			else
//			{
//				out.print("somnthing wrong");
//			}
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

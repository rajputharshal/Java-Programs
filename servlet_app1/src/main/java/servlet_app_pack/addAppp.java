package servlet_app_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addappp")
public class addAppp extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html	");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("fr");
		String s2=request.getParameter("sc");
		int c=Integer.valueOf(s1)+ Integer.valueOf(s2);
		   out.println("<h1>Addition is "+c+"</h1>");
		
	}
}

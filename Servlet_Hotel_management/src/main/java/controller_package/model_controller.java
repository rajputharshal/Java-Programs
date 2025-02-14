package controller_package;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_package.admin_model;
import service_package.admin_service;

@WebServlet("/loginpage")
public class model_controller extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		
		admin_model model=new admin_model();
		model.setName(name);
		model.setPassword(password);
		
		admin_service adservice=new admin_service();
		boolean b=adservice.isAdminLogin(model);
		System.out.println("================="+b);
		if(b)
		{
			RequestDispatcher rdp=request.getRequestDispatcher("navbarurl");
			rdp.forward(request,response);
			out.print("success..........");
		}
		else
		{
			RequestDispatcher rdp=request.getRequestDispatcher("loginpage");
			rdp.include(request,response);
			out.print("faild");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

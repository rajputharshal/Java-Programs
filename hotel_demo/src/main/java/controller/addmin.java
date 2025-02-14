package controller;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.admin_model;
import service.adminser;
@WebServlet("/adminurl")
public class addmin extends HttpServlet {
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		System.out.println(name+ pass);
		admin_model mod=new admin_model();
		mod.setName(name);
		mod.setPass(pass);
		
		adminser serv=new adminser();
		boolean b=serv.ismodel(mod);
		System.out.println("========"+b);
		if(b)
		{
			RequestDispatcher rp=request.getRequestDispatcher("aaa.html");
			rp.forward(request,response);
			out.println("<h1>success</h1>");
		}
		else
		{
			RequestDispatcher rp=request.getRequestDispatcher("addminurl");
			rp.include(request,response);
			out.println("<h1>faild</h1>");

		}
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

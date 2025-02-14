package controller_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterAdmin_Controllerurl")
public class RegisterAdmin_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<input type=\"text\" name=\"Name\" value=\"\" placeholder=\"Name\">\r\n<br><br>"
				+ "	<input type=\"text\" name=\"Address\" value=\"\" placeholder=\"Address\">\r\n<br><br>"
				+ "	<input type=\"text\" name=\"Contact\" value=\"\" placeholder=\"Contact\">\r\n<br><br>"
				+ "	<input type=\"text\" name=\"Email\" value=\"\" placeholder=\"Email\">\r\n<br><br>"
				+ "	<input type=\"password\" name=\"Password\" value=\"\" placeholder=\"Password\">\r\n<br><br>"
				+ "	<input type=\"submit\"  name=\"Sub\" value=\"submit\">");
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

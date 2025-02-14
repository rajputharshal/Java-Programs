package RequestDispatcher_pack;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.RequestDispatcher;
@WebServlet("/loginpage")
public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(user.equals("hhh") && pass.equals("hh"))
		{
			RequestDispatcher rdp=request.getRequestDispatcher("welcome.html");
			rdp.include(request, response);
		}
		
	}
	public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws ServletException, IOException
	{
		doGet(rq,rs);
	}
}
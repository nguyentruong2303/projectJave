package tp.kits.truong;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Servlet Container 
	//Servlet interface(implement)
	//make method
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	private void doget(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// web application(context)
		// has info for application
		ServletContext ctx = getServletContext();
		ctx.setAttribute("pm", "william stanford mario green");
		response.getWriter().append("First servlet");
	}
	
	

	
	
}

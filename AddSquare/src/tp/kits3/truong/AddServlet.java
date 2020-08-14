package tp.kits3.truong;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k = num1+num2;
		resp.setContentType("text/html");
		//resp.getWriter().print("result is:"+k);
		req.setAttribute("k", k);
		
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		Cookie cookie = new Cookie("k", k+"");
		resp.addCookie(cookie);
		
		resp.sendRedirect("sq");
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, resp);
	}
}

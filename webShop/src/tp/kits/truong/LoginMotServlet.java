package tp.kits.truong;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login1")
public class LoginMotServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO get data in request
		String uname = req.getParameter("uname"); //form input name="uname"'s value
		String upass = req.getParameter("upass"); // form input name="pass"'s value
		System.out.println(); //if you want out in console
		resp.setContentType("text/plain;charset=UTF-8");
		resp.getWriter().println("uname:"+uname);
		
	}
  //servlet's role process request from client
	
	//doGET() ,doPOST()
	
	
}

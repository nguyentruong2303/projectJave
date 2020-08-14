package tp.kits.truong;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/hai")
public class SecondServlet extends GenericServlet {

	


	/**
	 * version if this class(servlet)
	 */
	//private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// how to response
		// 1. set Content-type
		res.setContentType("text/html;charset=UTF-8");
		// 2.Open OutputStream to client
		PrintWriter out = res.getWriter(); //our data is text
		// 3. send HTML data
		out.print("<html><head><title>SecondDemo</title></head>");
		out.print("<body>");
		out.print("<h1> Second Servlet by response object</h1>");
		out.print("</body></html>");

	}

}

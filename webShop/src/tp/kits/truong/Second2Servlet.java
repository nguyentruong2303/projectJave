package tp.kits.truong;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second2Servlet
 */
@WebServlet("/second")
public class Second2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		ServletContext ctx = getServletContext();
//		String pm =(String) ctx.getAttribute("pm"); // Object is mother of all class(root class)
//		response.getWriter().append("First servlet");
//		response.getWriter().append("Second "+pm);
		String ms = (String)request.getAttribute("ms");

		response.getWriter().append("second at:"+ms);
	}

}

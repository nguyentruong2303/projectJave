package tp.kits.truong;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGuServlet
 */
@WebServlet("/gugudan")
public class GuGuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO make string 1 ~ 9 X dan
		request.setCharacterEncoding("UTF-8");
		String dan = request.getParameter("dan"); //input type="text"
		int idan = Integer.parseInt(dan);
		String html = "<table>";
		for(int v = 1; v < 10; ++v) {
			int result = idan * v;
			html += "<tr>";
			html += "<td>"+ idan
					+"</td><td>" + v
					+"</td><td>"+ result + "</td>";
			html += "</tr>";
		}
		html += "</table>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(html);
		response.getWriter().println(html);
	}


	

}

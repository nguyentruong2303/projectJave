package tp.kits.truong;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BangCuuChuongServlet
 */
@WebServlet("/bangcuuchuong")
public class BangCuuChuongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BangCuuChuongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		String html = "<table>";
		for(int v = 1; v <= 10; ++v) {
			int result = num * v;
			html += "<tr>";
			html += "<td>" + num
					+ "</td><td>" + "x"
					+ "</td><td>" + v
					+ "</td><td>" + "="
					+ "</td><td>" + result;
			html += "</tr>";
		}
		html += "</table>";
		response.getWriter().append(html);
	}

}

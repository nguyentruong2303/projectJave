package tp.kits3.truong;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//int k = (int)req.getAttribute("k");
		//int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		
		int k = 0;
		Cookie cookie[] = req.getCookies();
		for( Cookie c : cookie) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k*k;
		resp.getWriter().print("result is :"+k);
	}
}

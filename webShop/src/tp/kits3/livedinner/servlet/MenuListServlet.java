package tp.kits3.livedinner.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import tp.kits3.livedinner.DAO.MenuDao;
import tp.kits3.livedinner.vo.Menu;

/**
 * Servlet implementation class MenuListServlet
 */
@WebServlet("/menu/list")
public class MenuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private MenuDao dao = new MenuDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuListServlet() {
        super();
        this.dao = new MenuDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		ServletContext ctx = getServletContext();// shared date all servlet
//		ctx.setAttribute("menu", new Menu());
		response.setContentType("text/html");
		List<Menu> menulist = dao.findAll();
		request.setAttribute("MenuList", menulist);
		//Servlet to servlet 
		String prefix = "/WEB-INF/view/";
		String postfix = ".jsp";
		RequestDispatcher rp = request.getRequestDispatcher(prefix+"menuList"+postfix);
		rp.forward(request, response);
		response.getWriter().append("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

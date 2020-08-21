package tp.kits3.livedinner.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.BookDao;
import tp.kits3.livedinner.vo.Book;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/book")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDao dao = new BookDao();
		
		String action = request.getParameter("act");
		String viewName = "booklist";
		if(action.equals("add")) {
			//need form
			viewName = "bookForm";
		} else if (action.equals("edit")) {
			//need form to edit
			viewName = "bookForm";
			int id = Integer.parseInt(request.getParameter("id"));
			
			Book book = dao.selectOne(id); //
			request.setAttribute("Book", book); //before data
		}
		else {
			List<Book> booklist = dao.selectAll();
			request.setAttribute("Booklist", booklist);
		}
		
		//if you want to forward other servlet ,jsp
		
		String prefix = getServletContext().getInitParameter("prefix");
		String postfix = getServletContext().getInitParameter("postfix");
		request.getRequestDispatcher(prefix+viewName+postfix).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

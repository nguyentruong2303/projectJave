package tp.kits3.livedinner.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.CategoryDao;
import tp.kits3.livedinner.vo.Category;

/**
 * Servlet implementation class CategoryUpdateServlet
 */
@WebServlet("/category/update")
public class CategoryUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO show form to update
		int ctgid = Integer.parseInt(request.getParameter("ctgid"));
		CategoryDao dao = new CategoryDao();
		Category category = dao.findOne(ctgid); // select one
		if(category == null ) {
			System.out.println(" khong co ~");
		}else {
		String form = "<div>";
		form += "<form method='post' action='update'>";
		form += "Category.id <input type='type' name='ctgid='value='"+category.getCtgid()+"' readonly><br/>";
		form += "Category.name <input type='type' name='ctgname='value='"+category.getCtname()+"'<br>";
		form += "Category.service <input type='type' name='service'value='"+category.getService()+"'<br>";
		form += "<input type='submit' value='Update'/>";
		form += "</form></div>";
		response.getWriter().append(form);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryDao dao = new CategoryDao();
		Category category = new Category();
		category.setCtgid(Integer.parseInt(request.getParameter("ctgid").trim()));
		category.setCtname(request.getParameter("ctgname"));
		category.setService(request.getParameter("service"));
		dao.update(category);
		response.sendRedirect("/webShop/category/list");
	
	}

}

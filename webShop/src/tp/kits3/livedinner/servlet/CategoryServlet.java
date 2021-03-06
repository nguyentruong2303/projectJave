package tp.kits3.livedinner.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.CategoryDao;
import tp.kits3.livedinner.vo.Category;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/category/list")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private CategoryDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
        super();
        this.dao =  new CategoryDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	CategoryDao dao = new CategoryDao();
//	request.getAttribute("menuName");
//	List<Category> list = dao.findAll();
//	if(list.size() == 0) {
//		System.out.println("have no entries");
//	}
//	String divList = "<div class = 'ctgList'>";
//	 for (Category ct : list) {
//		 divList += "<p><a href ='update?ctgid="+ct.getCtgid()+"'>"+ct.toString()+"</p>";
//	 }
//	divList += "</div>";
//	response.setContentType("text/html;charset=UTF-8");
//		response.getWriter().append(divList);
		response.setContentType("text/html");
		List<Category> list = dao.findAll();
		request.setAttribute("CategoryList", list);
		
		String prefix = "/WEB-INF/view/";
		String profix = ".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix+"categoryList"+profix);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		
	}

}

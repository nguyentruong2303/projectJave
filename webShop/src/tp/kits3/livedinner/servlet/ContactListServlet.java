package tp.kits3.livedinner.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.ContactDao;
import tp.kits3.livedinner.vo.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contact/list")
public class ContactListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ContactDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactListServlet() {
        super();
        this.dao = new ContactDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		List<Contact> list = dao.findAll();
		request.setAttribute("ContactList", list);
		String prefix = "/WEB-INF/view/";
		String profix = ".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix+"contactList"+profix);
		rd.forward(request, response);
//		if(list.size() == 0) {
//			System.out.println("list is emty");
//		}
//		//System.out.println("Aaaaa");
//		String divList = "<div class='coList'>";
//		for (Contact co : list) {
//			divList += "<p>"+co.toString()+"</p>";
//		}
//		divList += "</div>";
		response.setContentType("text/html");
		
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

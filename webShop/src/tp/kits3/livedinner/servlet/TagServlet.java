package tp.kits3.livedinner.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.TagDao;
import tp.kits3.livedinner.vo.Tag;

/**understand about class
 * Servlet implementation class TagServlet
 * what core concept of Java OOP
 * 1. re use (one source multi use)
 * 2. easy to maintaince(repair , update , upgrade)
 * 
 * amazing
 * url:
 *  /tag/ -> means show to tag list
 *  /tag/insert -> means add tag 
 *  /tag/edit -> means edit tag
 */
@WebServlet("/tag/other")
public  class  TagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TagServlet() {
    	//just once called by servlet container
        super();
      //  initConnection();
  
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] uri = request.getRequestURI().split("/");
		String command = (uri[uri.length -1]);
		TagDao dao = new TagDao();
		if("insert".equals(command)) {
			Tag tag = new Tag();
			String tgname = request.getParameter("tgname");
			tag.setTgname(tgname);
			dao.save(tag);
		}
		if("list".equals(command)) {

		List<Tag> list = dao.findAll(); // selectAll
		//make HTML to response
		String table = "<table>";
		// for or for each
		for(Tag t : list) {
			int tid = t.getTagid();
			String tname = t.getTgname(); //column of DB
			table += "<tr><td>"+tid+"</td><td>" + tname + "</td></tr>";
			// consider override toString method
			//table +=t.toString();
		}
		table += "</table>";
		response.getWriter().println(table);
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

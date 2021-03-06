package tp.kits3.livedinner.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.DAO.ContactDao;
import tp.kits3.livedinner.vo.Contact;

/**
 * Servlet implementation class ContactAddServlet
 */
@WebServlet("/contact/add")
public class ContactAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String form = "<div>";
		form += "<form method='post'action='add'>";
		form += "Contact.name <input type='text' name='coname'required><br>";
		form += "PriPhone <input type='text' name='priphone'><br>";
		form += "SubPhone <input type='text' name='subphone'><br>";
		form += "Email <input type='email' name='email'><br>";
		form += "Address <input type='text' name='address'><br>";
		form += "Unused <input type='text' name='unused'><br>";
		form += "Opening <input type='text' name='opening'><br>";
		form += "Weekday <input type='text' name='weekday'><br>";
		form += "Weekend <input type='text' name='weekend'><br>";
		form += "Aboutus <input type='text' name='aboutus'><br>";
		form += "Latitude <input type='number' name='latitude'><br>";
		form += "Logitude <input type='number' name='logitude'><br>";
		form += "<input type=submit value='Add'>";
		form += "</form></div>";
		response.getWriter().append(form);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactDao dao = new ContactDao();
		Contact contact = new Contact();
		contact.setConame(request.getParameter("coname"));
		contact.setPriphone(request.getParameter("priphone"));
		contact.setSubphone(request.getParameter("subphone"));
		contact.setEmail(request.getParameter("email"));
		contact.setAddress(request.getParameter("address"));
		contact.setOpening(request.getParameter("address"));
		contact.setWeekday(request.getParameter("weekday"));
		contact.setWeekend(request.getParameter("weekend"));
		contact.setAboutus(request.getParameter("aboutus"));
		contact.setLatitude(Double.parseDouble(request.getParameter("latitude")));
		contact.setLogitude(Double.parseDouble(request.getParameter("logitude")));
		contact.setUnused(Boolean.parseBoolean(request.getParameter("unused")));
		dao.save(contact);
		response.sendRedirect("/webShop/contact/list");
	}

}

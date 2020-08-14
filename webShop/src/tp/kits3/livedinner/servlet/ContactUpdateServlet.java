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
 * Servlet implementation class ContactUpdateServlet
 */
@WebServlet("/contact/update")
public class ContactUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int coid = Integer.parseInt(request.getParameter("coid"));
		ContactDao dao = new ContactDao();
		Contact contact = dao.findOne(coid);
		if(contact == null) {
			System.out.println("Nothing");
		}
		String form = "<div><form>";
		form += "Contact.id <input type='text' name='coid' value='"+contact.getCoid()+"'readonly><br>";
		form += "Name <input type='text' name='coname' value='"+contact.getConame()+"'><br>";
		form += "Priphone <input type='text' name='priphone' value='"+contact.getPriphone()+"'><br>";
		form += "Subphone <input type='text' name='subphone' value '"+contact.getSubphone()+"'><br>";
		form += "Email <input type='email' name='email' value='"+contact.getEmail()+"'><br>";
		form += "Address <input type='text' name='address' value='"+contact.getAddress()+"'><br>";
		form += "Unused <input type='text' name='unsed' value='"+contact.getUnused()+"'><br>";
		form += "Opening <input type='text' name='opening' value='"+contact.getOpening()+"'><br>";
		form += "Weekday <input type='text' name='weekday' value='"+contact.getWeekday()+"'><br>";
		form += "Weekend <input type='text' name='weekend' value='"+contact.getWeekend()+"'><br>";
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

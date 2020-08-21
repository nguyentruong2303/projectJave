package tp.kits3.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/upload.do")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO show file form
		request.setAttribute("message", "comon comon");
		String prefix= getServletContext().getInitParameter("prefix");
		String postfix= getServletContext().getInitParameter("postfix");
		String viewName = prefix+"uploadform"+postfix; // path of jsp
		request.getRequestDispatcher(viewName).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO save file from client
		String uploadPath = getServletContext().getInitParameter("uploadPath");
		File uploadFilePath = new File(uploadPath);//is directory
		//System.out.println(uploadPath);
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(uploadFilePath);
		factory.setSizeThreshold(1024 * 1024); //1MegaByte max size
		//use ServletFileUpload class when File upload
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
		List<FileItem> items = upload.parseRequest(request); // form data from client
		for( int i = 0; i < items.size(); ++i) {
		FileItem fileItem = (FileItem) items.get(i); // FileItem[]
		if(fileItem.isFormField()) { //is not type "file" , so not save
			System.out.println(fileItem.getFieldName()+"="+fileItem.getString("utf-8"));
		} else {
			
		System.out.println("name :"+fileItem.getFieldName());
		System.out.println("fname :"+fileItem.getName());
		System.out.println("size :"+fileItem.getSize());
		if( fileItem.getSize() > 0 ) {
		int idx = fileItem.getName().lastIndexOf(File.separator); // String split
		String fileName = fileItem.getName().substring(idx + 1);
		File uploadFile = new File(uploadFilePath+File.separator+fileName);
		fileItem.write(uploadFile); // save file
				} //end inner if
			} //end outer if
		} //end loop
		}catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}

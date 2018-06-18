import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet
{
	public void init() throws ServletException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//This is just a dummy profile
		session.setAttribute("age","25"); 
		session.setAttribute("gender","Male"); 
		session.setAttribute("address","Bulacan"); 
		response.sendRedirect("profile.jsp");
	}

	public void destroy() {
	}
}

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LoginServlet extends HttpServlet
{
	UserDatabase ud;

	public void init() throws ServletException {
		ud = new UserDatabase();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try{
		UserModel userModel = new UserModel();
		userModel.setUsername(req.getParameter("un"));
		userModel.setPassword(req.getParameter("pw"));
		userModel = ud.login(userModel);
		if(userModel.isValid()) {
		HttpSession session = req.getSession(true);
		session.setAttribute("currentSessionUser",(String) userModel.getUsername()); 
		res.sendRedirect("userLogged.jsp");
	 	}
	 	else {
		  res.sendRedirect("error.jsp"); 
		}
		catch (Throwable theException) {
			System.out.println(theException); 
		}
	}

	public void destroy() {
		ud = null;
	}
}

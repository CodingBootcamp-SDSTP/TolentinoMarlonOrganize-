import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HomeServlet extends HttpServlet
{

	public void init() throws ServletException {
		//nothing to do here
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
	}

	public void destroy() {
		//nothing to do here
	}
}

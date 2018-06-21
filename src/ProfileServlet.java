import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class ProfileServlet extends HttpServlet
{
	public void init() throws ServletException {
		//nothing to do here
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		HttpSession session = req.getSession(true);
		PrintWriter out = res.getWriter();
		res.sendRedirect("profile.jsp");
	}

	public boolean readFromFile(String filename) {
		boolean f = false;
		StringBuilder sb = new StringBuilder();
		try {
			FileReader file = new FileReader(filename);
			BufferedReader br = new BufferedReader(file);
			String fileLine;
			while((fileLine = br.readLine()) != null) {
				sb.append(fileLine);
			}
			f = true;
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return(f);
	}

	public void destroy() {
		//nothing to do here
	}
}

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.sql.*;

public class RemoveURLServlet extends HttpServlet
{
	URLDatabase ud;
	URLCollection uc;
	PrintWriter out;
	ArrayList<URL> urls;
	SQLConnection sc;
	Connection conn;

	public void init() throws ServletException {
		ud = new URLDatabase();
		uc = ud.getURLCollection();
		urls = uc.getAllURLs();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		out = res.getWriter();
		if(req.getParameter("dn") != null) {
			out.print("<h1>Added URL Successfully!</h1>");
			removeURL(req.getParameter("dn"));
			out.print("<a href='/organize/profile.jsp'>return to your profile</a>");
		}
		else {
			out.print("<h1>Adding URL Failed!</h1>");
			out.print("<a href='/organize/profile.jsp'>return to your profile</a>");
		}
	}

	public boolean removeURL(String domain) {
		boolean result = false;
		PreparedStatement ps = null;
		try {
			sc = SQLConnection.instance();
			conn = sc.getConnection();
			ps = conn.prepareStatement("DELETE FROM urls WHERE domainname=?;");
			ps.setString(1, domain);
			ps.executeUpdate();
			result = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(ps !=null) {ps = null;}} catch(Exception e) {};
		}
		return(result);
	}

	public void destroy() {
		ud = null;
		uc = null;
		urls = null;
		sc = null;
		conn = null;
	}
}


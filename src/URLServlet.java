import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class URLServlet extends HttpServlet
{
	URLDatabase ud;
	URLCollection uc;
	PrintWriter out;
	ArrayList<URL> urls;

	public void init() throws ServletException {
		ud = new URLDatabase();
		uc = ud.getURLCollection();
		urls = uc.getAllURLs();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/xml");
		out = res.getWriter();
		if(req.getParameter("category") != null) {
			out.print(queryToXML(req.getParameter("category")));
		}
		else {
			out.print(exportToXML());
		}
	}

	public String exportToXML() {
		StringBuilder sb = new StringBuilder("<urls>");
		for(URL url : urls) {
			printURL(sb, url);
		}
		sb.append("</urls>");
		return(sb.toString());
	}

	public String queryToXML(String query) {
		StringBuilder sb = new StringBuilder("<urls>");
		for(URL url : urls) {
			if(query.toLowerCase().contains(url.getCategory().toLowerCase())) {
				printURL(sb, url);
			}
		}
		sb.append("</urls>");
		return(sb.toString());
	}

	public String printURL(StringBuilder sb, URL url) {
		sb.append("<url>");
		sb.append("<urlname>" + url.getURL() + "</urlname>");
		sb.append("<domainName>" + url.getDomainName() + "</domainName>");
		sb.append("<category>" + url.getCategory() + "</category>");
		sb.append("<counter>" + url.getCounter() + "</counter>");
		sb.append("</url>");
		return(sb.toString());
	}

	public void countByCategory(URL url) {
		if(url.getCategory() == null) {
			return;
		}
	}

	public void destroy() {
		ud = null;
		uc = null;
		urls = null;
		
	}
}

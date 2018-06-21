import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.*;

public class URLDatabase
{
	private URLCollection uc;
	private SQLConnection sc;
	Connection conn;

	public URLDatabase() {
		uc = new URLCollection();
		try {
			sc = SQLConnection.instance();
			conn = sc.getConnection();
			readFromSQL(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public URLCollection getURLCollection() {
		return(uc);
	}

	public boolean readFromSQL(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM urls;");
			while(rs.next()) {
				String[] str = {
					rs.getString("id"),
					rs.getString("url"),
					rs.getString("domainname"),
					rs.getString("category")
				};
				createObject(str);
			}
			v = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt != null) {stmt = null;}} catch(Exception e) {};
			try { if(rs != null) {rs = null;}} catch(Exception e) {};
		}
		return(v);
	}

	public void createObject(String... details) {
		URL url = new URL(details[0], details[1], details[2], details[3]);
		uc.addURL(url);
	}
}

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.*;

public class ChartDatabase
{
	private ChartCollection cc;
	Connection conn;
	ArrayList<String> x;
	ArrayList<Integer> y;

	public ChartDatabase() {
		cc = new UserCollection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/xandydb?user=marlont&password=tolentino&serverTimezone=UTC&useSSL=false");
			readFromSQL(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ChartCollection getChartCollection() {
		return(cc);
	}

	public boolean readFromSQL(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM grades;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("id"),
					rs.getString("subject"),
					rs.getInt("grades"),
					"student"
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

	public void createObject(int id, String x, int y) {
		int len = details.length - 1;
		String d = details[len];
		if("student".equals(d)) {
			Graph g = new Graph(details[0], details[1],details[2]);
			cc.addChart(u);
		}
	}
}

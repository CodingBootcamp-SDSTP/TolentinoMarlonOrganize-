import java.sql.*;

public class SQLConnection
{
	private static SQLConnection _instance = null;
	Connection conn;

	public static SQLConnection instance() {
		if(_instance == null) {
			_instance = new SQLConnection();
		}
		return(_instance);
	}

	private SQLConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/urlcollectiondb?user=marlont&password=tolentino&serverTimezone=UTC&useSSL=false");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return(conn);
	}
}

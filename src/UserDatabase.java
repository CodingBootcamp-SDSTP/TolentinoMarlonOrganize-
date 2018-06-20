import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.sql.*;

public class UserDatabase
{
	private UserCollection users;
	Connection conn;

	public UserDatabase() {
		users = new UserCollection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/organizedb?user=marlont&password=tolentino&serverTimezone=UTC&useSSL=false");
			readFromSQL(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public UserCollection getUserCollection() {
		return(users);
	}

	public boolean readFromSQL(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users;");
			while(rs.next()) {
				String[] str = {
					rs.getString("id"),
					rs.getString("username"),
					rs.getString("password"),
					"user"
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

	public UserModel login(UserModel um) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v=false;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users where username='"+ um.getUsername() + "' and password='" + um.getPassword() + "'");
			if(rs.next()) {
				um.setUsername(rs.getString("username"));
				um.setPassword(rs.getString("password"));
				v=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt != null) {stmt = null;}} catch(Exception e) {};
			try { if(rs != null) {rs = null;}} catch(Exception e) {};
		}
		um.setValid(v);
		return(um);
	}

	public void createObject(String... details) {
		int len = details.length - 1;
		String d = details[len];
		if("user".equals(d)) {
			User u = new User(details[0], details[1],details[2]);
			users.addUser(u);
		}
	}

}

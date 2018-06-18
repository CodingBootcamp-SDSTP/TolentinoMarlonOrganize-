public class User
{
	private final String ID;
	private String username;
	private String password;

	public User(String id, String un, String pw) {
		ID = id;
		username = un;
		password = pw;
	}

	public String getId() {
		return(ID);
	}

	public void setUsername(String un) {
		username = un;
	}

	public String getUsername() {
		return(username);
	}

	public void setPassword(String pw) {
		password = pw;
	}

	public String getPassword() {
		return(password);
	}

	public String toString() {
		return("ID: " + ID + ", User: " + username + ", Password: " + password);
	}

	public String getDetails() {
		return(ID + "@" + username + "@" + password + "@user");
	}
}

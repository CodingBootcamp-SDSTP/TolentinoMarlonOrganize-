
public class UserModel
{
	private String id;
	private String username;
	private String password;
	private boolean valid;

	public void setId(String i){
		id = i;
	}

	public String getId() {
		return(id);
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

	public boolean isValid() {
		return(valid);
	}

	public void setValid(boolean v){
		valid = v;
	}

	public String toString() {
		return("ID: " + id + ", User: " + username + ", Password: " + password);
	}

}

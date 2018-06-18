import java.util.ArrayList;

public class UserCollection
{
	ArrayList<User> users;

	public UserCollection() {
		users = new ArrayList<User>();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public ArrayList<User> getAllUsers() {
		return(users);
	}
}

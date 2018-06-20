public class URL
{
	private final String ID;
	private String domainName;
	private String url;
	private String category;
	private int counter;

	public URL(String id, String url, String dn, String c) {
		ID = id;
		this.url = url;
		domainName = dn;
		category = c;
		counter = 0;
	}

	public String getId() {
		return(ID);
	}

	public void setDomainName(String dn) {
		domainName = dn;
	}

	public String getDomainName() {
		return(domainName);
	}

	public void setURL(String url) {
		this.url = url;
	}

	public String getURL() {
		return(url);
	}

	public void setCategory(String c) {
		category = c;
	}

	public String getCategory() {
		return(category);
	}

	public void setCounter(int c) {
		counter = c;
	}

	public int getCounter() {
		return(counter);
	}

	// public String toString() {
	// 	return("ID: " + ID + ", User: " + username + ", Password: " + password);
	// }

	// public String getDetails() {
	// 	return(ID + "@" + username + "@" + password + "@user");
	// }
}

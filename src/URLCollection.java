import java.util.ArrayList;

public class URLCollection
{
	ArrayList<URL> urls;

	public URLCollection() {
		urls = new ArrayList<URL>();
	}

	public void addURL(URL url) {
		urls.add(url);
	}

	public ArrayList<URL> getAllURLs() {
		return(urls);
	}
}

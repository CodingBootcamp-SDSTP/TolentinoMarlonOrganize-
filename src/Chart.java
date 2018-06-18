import java.util.ArrayList;

public class Chart
{
	private final int COUNTER;
	private ArrayList<String> x;
	private ArrayList<Integer> y;

	public Chart(int id, ArrayList<String> x, ArrayList<Integer> y) {
		COUNTER = id;
		this.x = x;
		this.y = y;
	}

	public int getCounter() {
		return(COUNTER);
	}

	public void setX(ArrayList<String> x) {
		this.x = x;
	}

	public ArrayList<String> getX() {
		return(x);
	}

	public void setY(ArrayList<Integer> y) {
		this.y = y;
	}

	public ArrayList<Integer> getY() {
		return(y);
	}
}

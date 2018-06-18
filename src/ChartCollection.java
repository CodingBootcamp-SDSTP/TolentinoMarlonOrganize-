import java.util.ArrayList;

public class ChartCollection
{
	ArrayList<Chart> charts;

	public ChartCollection() {
		charts = new ArrayList<Chart>();
	}

	public void addChart(Chart chart) {
		charts.add(chart);
	}

	public ArrayList<Chart> getAllCharts() {
		return(charts);
	}
}

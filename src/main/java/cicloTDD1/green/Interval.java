package cicloTDD1.green;

public class Interval {

	private double d;
	private double e;

	public Interval(double d, double e) {
		this.d = d;
		this.e = e;
	}

	public boolean include(double value) {
		return true;
	}
}

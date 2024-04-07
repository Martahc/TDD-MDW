package cicloTDD4.green;

public class Interval {

	private double min;
	private double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public double getMax() {
		return max;
	}

	public boolean include(double value) {
		return value >= min && value <= max;
	}

	public boolean includeWithinMax(double value, boolean includeMax) {
		return includeMax ? value <= max : value < max;
	}

	public void updateMax(double newMax) {
		this.max = newMax;
	}

}

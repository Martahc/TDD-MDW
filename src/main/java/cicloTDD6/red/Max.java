package cicloTDD6.red;

public class Max {

	private double value;

	private boolean isClose;

	public Max(double value, boolean isClose) {
		this.value = value;
		this.isClose = isClose;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isClose() {
		return isClose;
	}

	public void setClose(boolean isClose) {
		this.isClose = isClose;
	}

	public boolean greaterThanOrEqualTo(double otherMax) {
		return this.value >= otherMax;
	}

}

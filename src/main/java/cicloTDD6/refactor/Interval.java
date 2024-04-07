package cicloTDD6.refactor;

public class Interval {

	private double min;
    private Max max;

    public Interval(double min, Max max) {
        this.min = min;
        this.max = max;
    }
    
    public Max getMax() {
		return max;
	}
 
    public boolean include(double value) {
        return value >= min && max.greaterThanOrEqualTo(value);
    }
    
    public boolean includeWithinMax(double value) {
		return max.greaterThanOrEqualTo(value);
	}

    public void updateMax(double newMax, boolean isClose) {
        max.setValue(newMax);
        max.setClose(isClose);
    }

}


package cicloTDD8.refactor;

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
        return value >= min && max.isValueWithinMax(value);
    }
    
    public boolean includeWithinMax(double value) {
		return max.isValueWithinMax(value);
	}

    public void updateMax(double newMax) {
        max.setValue(newMax);
    }

}


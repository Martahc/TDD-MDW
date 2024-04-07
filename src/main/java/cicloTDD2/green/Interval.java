package cicloTDD2.green;

public class Interval {

	private double min;
    private double max;

    public Interval(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean include(double value) {
        return value >= min && value <= max;
    }
    
    public boolean includeWithinMax(double value) {
        return true;
    }
}

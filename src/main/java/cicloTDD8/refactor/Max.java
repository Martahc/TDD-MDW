package cicloTDD8.refactor;

public abstract class Max {

    private double value;
   
    public Max(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public abstract boolean isValueWithinMax(double value);

}

package cicloTDD7.refactor;

public class InclusiveMax extends Max {

	
	public InclusiveMax(double value, boolean isClose) {
		super(value, isClose);
	}
	
	public boolean isValueWithinInclusiveMax(double value) {
		return this.getValue() >= value;
	}

}


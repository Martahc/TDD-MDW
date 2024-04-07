package cicloTDD8.refactor;

public class InclusiveMax extends Max {

	public InclusiveMax(double value) {
		super(value);
	}

	public boolean isValueWithinMax(double value) {
		return this.getValue() >= value;
	}

}

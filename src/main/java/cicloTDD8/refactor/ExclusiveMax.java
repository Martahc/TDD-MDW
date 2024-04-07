package cicloTDD8.refactor;

public class ExclusiveMax extends Max {

	public ExclusiveMax(double value) {
		super(value);
	}

	public boolean isValueWithinMax(double value) {
		return this.getValue() > value;
	}
}

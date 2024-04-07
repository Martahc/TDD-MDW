package cicloTDD8.green;

import cicloTDD6.refactor.Max;

public class ExclusiveMax extends Max{
	
	public ExclusiveMax(double value, boolean isClose) {
		super(value, isClose);
	}
	
	public boolean isValueWithinExclusiveMax(double value) {
		return this.getValue() > value;
	}
}


package cicloTDD8.red;

import cicloTDD6.refactor.Max;

public class ExclusiveMax extends Max{
	
	public ExclusiveMax(double value, boolean isClose) {
		super(value, isClose);
	}
	
	public boolean isValueWithinExclusiveMax(double value) {
		return false;
	}
}


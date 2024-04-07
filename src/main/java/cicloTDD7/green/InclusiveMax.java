package cicloTDD7.green;

import cicloTDD6.refactor.Max;

public class InclusiveMax extends Max {

	
	public InclusiveMax(double value, boolean isClose) {
		super(value, isClose);
	}
	
	public boolean greaterThanOrEqualTo(double otherMax) {
		return this.getValue() >= otherMax;
	}

}


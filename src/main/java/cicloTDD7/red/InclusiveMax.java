package cicloTDD7.red;

import cicloTDD6.refactor.Max;

public class InclusiveMax extends Max {

	public InclusiveMax(double value, boolean isClose) {
		super(value, isClose);
	}
	
	public boolean greaterThanOrEqualTo(double value) {
		return false;
	}

}


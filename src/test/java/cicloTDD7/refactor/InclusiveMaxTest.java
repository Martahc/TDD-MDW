package cicloTDD7.refactor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import cicloTDD7.refactor.InclusiveMax;


public class InclusiveMaxTest {

	 @Test
	  public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue(){		 
		 assertTrue(new InclusiveMax(20,true).isValueWithinInclusiveMax(20));
	  }
	 
	 @Test
	  public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsFalse(){		 
		 assertFalse(new InclusiveMax(20,true).isValueWithinInclusiveMax(25.5));
	  }
}

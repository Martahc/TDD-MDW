package cicloTDD8.refactor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import cicloTDD8.refactor.ExclusiveMax;


public class ExclusiveMaxTest {

	 @Test
	  public void givenMaxWhenComparingGreaterThanThenResultIsTrue(){		 
		 assertTrue(new ExclusiveMax(20).isValueWithinMax(11));
	  }
	 
	 @Test
	  public void givenMaxWhenComparingGreaterThanThenResultIsFalse(){		 
		 assertFalse(new ExclusiveMax(20).isValueWithinMax(22));
	  }
}

package cicloTDD7.green;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import cicloTDD7.green.InclusiveMax;


public class InclusiveMaxTest {

	 @Test
	  public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue(){		 
		 assertTrue(new InclusiveMax(20,true).greaterThanOrEqualTo(20));
	  }
}

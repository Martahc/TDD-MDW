package cicloTDD6.refactor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxTest {

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue() {
		assertTrue(new Max(16,true).greaterThanOrEqualTo(8.5));
	}

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsFalse() {
		assertFalse(new Max(16,false).greaterThanOrEqualTo(20));
	}
	
	@Test
	public void givenOpenIntervalWhenComparingMaxToEqualValueThenResultIsFalse() {
	    assertFalse(new Max(16,false).greaterThanOrEqualTo(16));
	}
	
	@Test
	public void givenCloseIntervalWhenComparingMaxToEqualValueThenResultIsTrue() {
	    assertTrue(new Max(16,true).greaterThanOrEqualTo(16));
	}

}

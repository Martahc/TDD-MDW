package cicloTDD7.refactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxTest {

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue() {
		assertTrue(new Max(16,true).isValueWithinMax(8.5));
	}

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsFalse() {
		assertFalse(new Max(16,false).isValueWithinMax(20));
	}

	@Test
	public void givenOpenIntervalWhenComparingMaxToEqualValueThenResultIsFalse() {
		assertFalse(new Max(16,false).isValueWithinMax(16));
	}

	@Test
	public void givenCloseIntervalWhenComparingMaxToEqualValueThenResultIsTrue() {
		assertTrue(new Max(16,true).isValueWithinMax(16));
	}

}

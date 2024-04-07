package cicloTDD5.refactor;

import org.junit.jupiter.api.Test;

import cicloTDD5.refactor.Max;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxTest {

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue() {
		assertTrue(new Max(16).greaterThanOrEqualTo(8.5));
	}

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsFalse() {
		assertFalse(new Max(16).greaterThanOrEqualTo(20));
	}
}

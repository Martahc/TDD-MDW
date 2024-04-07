package cicloTDD5.green;

import org.junit.jupiter.api.Test;

import cicloTDD5.green.Max;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxTest {

	@Test
	public void givenMaxWhenComparingGreaterThanOrEqualThenResultIsTrue() {
		assertTrue(new Max(16).greaterThanOrEqualTo(8.5));
	}
}

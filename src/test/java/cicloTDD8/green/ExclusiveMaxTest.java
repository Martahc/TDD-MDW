package cicloTDD8.green;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExclusiveMaxTest {

	@Test
	public void givenMaxWhenComparingGreaterThanThenResultIsTrue() {
		assertTrue(new ExclusiveMax(20, false).isValueWithinExclusiveMax(11));
	}
}

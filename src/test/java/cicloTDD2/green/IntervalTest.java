package cicloTDD2.green;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class IntervalTest {

	@Test
	public void givenIntervalwhenIncludeWithIncludedValueThenTrue() {
		assertTrue(new Interval(-10.5, 10.5).include(0.0));
	}

	@Test
	public void givenIntervalwhenIncludeWithNoIncludedValueThenFalse() {
		assertFalse(new Interval(-10.5, 10.5).include(11));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxValueIncludedThenTrue() {
		assertTrue(new Interval(0, 10).includeWithinMax(8));
	}

}
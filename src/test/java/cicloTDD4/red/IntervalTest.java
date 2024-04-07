package cicloTDD4.red;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
		assertTrue(new Interval(0, 10).includeWithinMax(8, true));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxValueNoIncludedThenFalse() {
		assertFalse(new Interval(0, 10).includeWithinMax(19, true));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueIncludedThenTrue() {
		assertTrue(new Interval(0, 10).includeWithinMax(10, true));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueNoIncludedThenTrue() {
		assertFalse(new Interval(0, 10).includeWithinMax(10, false));
	}

	@Test
	public void givenIntervalWhenUpdateMaxThenMaxIsUpdated() {
		Interval interval = new Interval(0, 10);
		interval.updateMax(15);
		assertEquals(15, interval.getMax());
	}

}
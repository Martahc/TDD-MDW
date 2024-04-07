package cicloTDD6.refactor;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class IntervalTest {

	@Test
	public void givenIntervalwhenIncludeWithIncludedValueThenTrue() {
		assertTrue(new Interval(-10.5, new Max(10.5, true)).include(0.0));
	}

	@Test
	public void givenIntervalwhenIncludeWithNoIncludedValueThenFalse() {
		assertFalse(new Interval(-10.5, new Max(10.5, true)).include(11));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxValueIncludedThenTrue() {
		assertTrue(new Interval(0, new Max(10, true)).includeWithinMax(8));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxValueNoIncludedThenFalse() {
		assertFalse(new Interval(0, new Max(10, true)).includeWithinMax(19));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueIncludedThenTrue() {
		assertTrue(new Interval(0, new Max(10, true)).includeWithinMax(10));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueNoIncludedThenTrue() {
		assertFalse(new Interval(0, new Max(10, false)).includeWithinMax(10));
	}

	@Test
	public void givenIntervalWhenUpdateMaxThenMaxIsUpdated() {
		Interval interval = new Interval(0, new Max(10, true));
		interval.updateMax(15, false);
		assertEquals(15, interval.getMax().getValue());
		assertEquals(false, interval.getMax().isClose());
	}

}
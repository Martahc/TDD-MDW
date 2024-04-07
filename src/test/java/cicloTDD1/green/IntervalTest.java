package cicloTDD1.green;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import cicloTDD1.refactor.Interval;

public class IntervalTest {

	@Test
	public void givenIntervalwhenIncludeWithIncludedValueThenTrue() {
		assertTrue(new Interval(-10.5, 10.5).include(0.0));
	}

}
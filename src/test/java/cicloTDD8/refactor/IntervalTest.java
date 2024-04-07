package cicloTDD8.refactor;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import cicloTDD8.refactor.ExclusiveMax;
import cicloTDD8.refactor.InclusiveMax;
import cicloTDD8.refactor.Interval;


public class IntervalTest {
  
	
	@Test
	public void givenIntervalWithInclusiveMaxWhenValueEqualsMaxThenIncludeReturnsTrue() {
	    assertTrue(new Interval(-10.5, new InclusiveMax(20)).include(20));
	}

	@Test
	public void givenIntervalWithInclusiveMaxWhenValueLessThanMaxThenIncludeReturnsTrue() {
	    assertTrue(new Interval(-10.5, new InclusiveMax(20)).include(19));
	}

	@Test
	public void givenIntervalWithInclusiveMaxWhenValueGreaterThanMaxThenIncludeReturnsFalse() {
	    assertFalse(new Interval(-10.5, new InclusiveMax(20)).include(21));
	}
	
	@Test
	public void givenIntervalWithExclusiveMaxWhenValueEqualsMaxThenIncludeReturnsFalse() {
	    assertFalse(new Interval(-10.5, new ExclusiveMax(10)).include(10));
	}

	@Test
	public void givenIntervalWithExclusiveMaxWhenValueLessThanMaxThenIncludeReturnsTrue() {
	    assertTrue(new Interval(-10.5, new ExclusiveMax(10)).include(7));
	}	

	@Test
	public void givenIntervalWithExclusiveMaxWhenValueGreaterThanMaxThenIncludeReturnsFalse() {
	    assertFalse(new Interval(-10.5, new ExclusiveMax(10)).include(13));
	}
	
	@Test
	public void givenIntervalWhenIncludeWithMaxValueIncludedThenTrue() {
		assertTrue(new Interval(0, new InclusiveMax(10)).includeWithinMax(8));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxValueNoIncludedThenFalse() {
		assertFalse(new Interval(0, new ExclusiveMax(10)).includeWithinMax(19));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueIncludedThenTrue() {
		assertTrue(new Interval(0, new InclusiveMax(10)).includeWithinMax(10));
	}

	@Test
	public void givenIntervalWhenIncludeWithMaxLimitValueNoIncludedThenTrue() {
		assertFalse(new Interval(0, new ExclusiveMax(10)).includeWithinMax(10));
	}

  
	@Test
	public void givenIntervalWhenUpdateMaxThenMaxIsUpdated() {
      Interval interval = new Interval(0, new ExclusiveMax(10));
      interval.updateMax(15);
      assertEquals(15, interval.getMax().getValue());
	}
  
 
}
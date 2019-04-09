package hu.bme.java.maven.statistics.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class StatisticsUtilTest {

	private static final double DELTA = 0.0001;

	@Test
	public void testAverage() {
		assertTrue("average should return NaN for null", Double.isNaN(StatisticsUtil.average(null)));
		assertTrue("average should return NaN for no args", Double.isNaN(StatisticsUtil.average()));

		assertEquals("average of one arg", 1.0, StatisticsUtil.average(1.0), DELTA);
		assertEquals("average of 2 args", 1.5, StatisticsUtil.average(1.0, 2.0), DELTA);
		assertEquals("average of 3 args", 2.0, StatisticsUtil.average(1.0, 2.0, 3.0), DELTA);
		assertEquals("average of 4 args", 3.0, StatisticsUtil.average(2.0, 1.0, 6.0, 3.0), DELTA);
	}

	@Test
	public void testSum() {
		assertTrue("sum should return NaN for null", Double.isNaN(StatisticsUtil.sum(null)));
		assertTrue("sum should return NaN for no args", Double.isNaN(StatisticsUtil.sum()));

		assertEquals("sum of one arg", 1.0, StatisticsUtil.sum(1.0), DELTA);
		assertEquals("sum of 2 args", 3.0, StatisticsUtil.sum(1.0, 2.0), DELTA);
		assertEquals("sum of 3 args", 6.0, StatisticsUtil.sum(1.0, 2.0, 3.0), DELTA);
		assertEquals("sum of 4 args", 12.0, StatisticsUtil.sum(2.0, 1.0, 6.0, 3.0), DELTA);
	}

	@Test
	public void testMedian() {
		assertTrue("median should return NaN for null", Double.isNaN(StatisticsUtil.median(null)));
		assertTrue("median should return NaN for no args", Double.isNaN(StatisticsUtil.median()));

		assertEquals("median of one arg", 1.0, StatisticsUtil.median(1.0), DELTA);
		assertEquals("median of 2 args", 1.5, StatisticsUtil.median(1.0, 2.0), DELTA);
		assertEquals("median of 3 args", 2.0, StatisticsUtil.median(1.0, 2.0, 120.0), DELTA);
		assertEquals("median of 4 args", 2.5, StatisticsUtil.median(2.0, 1.0, 120.0, 3.0), DELTA);
	}

	@Test
	public void testNullOrEmpty() {
		assertTrue("isNullOrEmpty should return true for null", StatisticsUtil.isNullOrEmpty(null));
		assertTrue("isNullOrEmpty should return true for no args", StatisticsUtil.isNullOrEmpty());
		assertTrue("isNullOrEmpty should return true for []", StatisticsUtil.isNullOrEmpty(new double[] {}));
		assertFalse("isNullOrEmpty should return false for one arg", StatisticsUtil.isNullOrEmpty(1));
		assertFalse("isNullOrEmpty should return false for some args", StatisticsUtil.isNullOrEmpty(0, 1, 2));
	}
}

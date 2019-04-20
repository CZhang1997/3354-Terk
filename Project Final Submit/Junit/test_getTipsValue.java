package tipsCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_getTipsValue {

	@Test
	public void test() {
		TipsCalculator test = new TipsCalculator(1213.23, 75, 75);
		
		Double value = test.getTipsValue();
		assertEquals(218.38, value, 0.01);
	}

}

package tipsCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_getTotal {

	@Test
	public void test() {
TipsCalculator test = new TipsCalculator(1213.23, 75, 75);
		
		Double value = test.getTotal();
		assertEquals(1431.61, value, 0.01);
	}

}

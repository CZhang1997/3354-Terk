package tipsCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_getTipsPercent {

	@Test
	public void test() {
			TipsCalculator test = new TipsCalculator(1213.23, 75, 75);
			
			int TipsPercent = test.getTipsPercent();
			assertEquals(18, TipsPercent);
	}

}

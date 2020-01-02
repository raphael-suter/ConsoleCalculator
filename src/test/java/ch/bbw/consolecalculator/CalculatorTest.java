package ch.bbw.consolecalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void summeZweiPositiveWerte_OK() {
		assertEquals(testee.summe(23, 2), 25);
	}

	@Test
	public void summePositivNegativ_OK() {
		assertEquals(testee.summe(23, -2), 21);
	}

	@Test
	public void differenzZweiPositiveWerte_OK() {
		assertEquals(testee.differenz(23, 2), 21);
	}

	@Test
	public void differenzPositivNegativ_OK() {
		assertEquals(testee.differenz(23, -2), 25);
	}

	@Test(expected = ArithmeticException.class)
	public void divisionDurch0_Exception() {
		testee.division(22, 0);
	}

	@Test
	public void division_NoException() {
		testee.division(0, 22);
	}
}

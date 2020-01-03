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
	public void summePositivPositiv_OK() {
		assertEquals(testee.summe(23, 2), 25);
	}

	@Test
	public void summePositivNegativ_OK() {
		assertEquals(testee.summe(23, -2), 21);
	}

	@Test
	public void summeNegativNegativ_OK() {
		assertEquals(testee.summe(-23, -2), -25);
	}

	@Test
	public void summe0Positiv_OK() {
		assertEquals(testee.summe(0, 25), 25);
	}

	@Test
	public void summe0Negativ_OK() {
		assertEquals(testee.summe(0, -25), -25);
	}

	@Test
	public void summeMaxValuePositiv_OK() {
		assertEquals(testee.summe(Integer.MAX_VALUE, 1), Integer.MIN_VALUE);
	}

	@Test
	public void summeMinValueNegativ_OK() {
		assertEquals(testee.summe(Integer.MIN_VALUE, -1), Integer.MAX_VALUE);
	}

	@Test
	public void summeMaxValueNegativ_OK() {
		assertEquals(testee.summe(Integer.MAX_VALUE, -1), 2147483646);
	}

	@Test
	public void summeMinValuePositiv_OK() {
		assertEquals(testee.summe(Integer.MIN_VALUE, 1), -2147483647);
	}

	@Test
	public void differenzPositivPositiv_OK() {
		assertEquals(testee.differenz(23, 2), 21);
	}

	@Test
	public void differenzPositivNegativ_OK() {
		assertEquals(testee.differenz(23, -2), 25);
	}

	@Test
	public void differenzNegativNegativ_OK() {
		assertEquals(testee.differenz(-23, -2), -21);
	}

	@Test
	public void differenz0Positiv_OK() {
		assertEquals(testee.differenz(0, 25), -25);
	}

	@Test
	public void differenz0Negativ_OK() {
		assertEquals(testee.differenz(0, -25), 25);
	}

	@Test
	public void differenzMaxValuePositiv_OK() {
		assertEquals(testee.differenz(Integer.MAX_VALUE, 1), 2147483646);
	}

	@Test
	public void differenzMinValueNegativ_OK() {
		assertEquals(testee.differenz(Integer.MIN_VALUE, -1), -2147483647);
	}

	@Test
	public void differenzMaxValueNegativ_OK() {
		assertEquals(testee.differenz(Integer.MAX_VALUE, -1), Integer.MIN_VALUE);
	}

	@Test
	public void differenzMinValuePositiv_OK() {
		assertEquals(testee.differenz(Integer.MIN_VALUE, 1), Integer.MAX_VALUE);
	}

	@Test
	public void divisionPositivPositiv_OK() {
		assertEquals(testee.division(25, 5), 5);
	}

	@Test
	public void divisionPositivNegativ_OK() {
		assertEquals(testee.division(25, -5), -5);
	}

	@Test
	public void divisionNegativNegativ_OK() {
		assertEquals(testee.division(-25, -5), 5);
	}

	@Test
	public void divisionNegativPositiv_OK() {
		assertEquals(testee.division(-25, 5), -5);
	}

	@Test
	public void division0Positiv_OK() {
		assertEquals(testee.division(0, 25), 0);
	}

	@Test
	public void division0Negativ_OK() {
		assertEquals(testee.division(0, -25), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void divisionPositiv0_Exception() {
		testee.division(25, 0);
	}

	@Test
	public void divisionPositivPositivAbrunden_OK() {
		assertEquals(testee.division(1, 3), 0);
	}

	@Test
	public void divisionNegativPositivAufrunden_OK() {
		assertEquals(testee.division(-1, 3), 0);
	}

	@Test
	public void protectedBooleanTrue_OK() {
		assertEquals(testee.protectedBoolean(true), false);
	}

	@Test
	public void protectedBooleanFalse_OK() {
		assertEquals(testee.protectedBoolean(false), true);
	}

	@Test
	public void privateBooleanTrueOrFalse_OK() {
		/*
		 * Private Methoden werden normalerweise nicht direkt getestet, sondern über die
		 * Mehtoden, von denen sie aufgerufen werden. Falls es trotzdem mal nötig sein
		 * sollte, gibt es APIs, welche das ermöglichen, indem sie private Methoden
		 * durch zugreifbare Kopien ersetzen.
		 */
	}

	@Test
	public void packageBooleanTrue_OK() {
		assertEquals(testee.packageBoolean(true), false);
	}

	@Test
	public void packageBooleanFalse_OK() {
		assertEquals(testee.packageBoolean(false), true);
	}
}

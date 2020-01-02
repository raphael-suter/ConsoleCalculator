package ch.bbw.consolecalculator;

public class Calculator {
	public int summe(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}

	public int differenz(int zahl1, int zahl2) {
		return zahl1 - zahl2;
	}

	public int division(int zahl1, int zahl2) {
		return zahl1 / zahl2;
	}

	protected boolean protectedBoolean(boolean value) {
		return !value;
	}

	private boolean privateBoolean(boolean value) {
		return !value;
	}

	boolean packageBoolean(boolean value) {
		return !value;
	}
}

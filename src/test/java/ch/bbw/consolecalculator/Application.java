package ch.bbw.consolecalculator;

public class Application {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int zahl1 = 10;
		int zahl2 = 20;

		System.out.println("Console Calculator");
		System.out.println("==================");
		System.out.println("Summe aus " + zahl1 + " und " + zahl2 + " = " + calculator.summe(zahl1, zahl2));
	}
}

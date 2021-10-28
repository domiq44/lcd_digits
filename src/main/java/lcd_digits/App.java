package lcd_digits;

public class App {

	public static void main(String[] args) {
		final LcdDigits lcdDigits = new LcdDigits();
		for (int number = 0; number < 10000; number++)
			System.out.println(lcdDigits.lcdify(number));
	}
}

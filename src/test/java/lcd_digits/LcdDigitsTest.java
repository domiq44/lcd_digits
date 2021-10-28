package lcd_digits;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class LcdDigitsTest {

	private static final String LS = System.getProperty("line.separator");

	@Test
	public void should_return_lcd_zero_for_zero() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"| |" + LS +
				"|_|";
		assertThat(lcdDigits.lcdify(0), is(expected));
	}

	@Test
	public void should_return_lcd_one_for_one() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				"   " + LS +
				"  |" + LS +
				"  |";
		assertThat(lcdDigits.lcdify(1), is(expected));
	}

	@Test
	public void should_return_lcd_two_for_two() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				" _|" + LS +
				"|_ ";
		assertThat(lcdDigits.lcdify(2), is(expected));
	}

	@Test
	public void should_return_lcd_three_for_three() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				" _|" + LS +
				" _|";
		assertThat(lcdDigits.lcdify(3), is(expected));
	}

	@Test
	public void should_return_lcd_four_for_four() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				"   " + LS +
				"|_|" + LS +
				"  |";
		assertThat(lcdDigits.lcdify(4), is(expected));
	}

	@Test
	public void should_return_lcd_five_for_five() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"|_ " + LS +
				" _|";
		assertThat(lcdDigits.lcdify(5), is(expected));
	}

	@Test
	public void should_return_lcd_six_for_six() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"|_ " + LS +
				"|_|";
		assertThat(lcdDigits.lcdify(6), is(expected));
	}

	@Test
	public void should_return_lcd_seven_for_seven() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"  |" + LS +
				"  |";
		assertThat(lcdDigits.lcdify(7), is(expected));
	}

	@Test
	public void should_return_lcd_eight_for_eight() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"|_|" + LS +
				"|_|";
		assertThat(lcdDigits.lcdify(8), is(expected));
	}

	@Test
	public void should_return_lcd_nine_for_nine() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _ " + LS +
				"|_|" + LS +
				"  |";
		assertThat(lcdDigits.lcdify(9), is(expected));
	}

	@Test
	public void should_return_lcd_ten_for_ten() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				"     _ " + LS +
				"  | | |" + LS +
				"  | |_|";
		assertThat(lcdDigits.lcdify(10), is(expected));
	}

	@Test
	public void should_return_lcd_eleven_for_eleven() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				"       " + LS +
				"  |   |" + LS +
				"  |   |";
		assertThat(lcdDigits.lcdify(11), is(expected));
	}

	@Test
	public void should_return_lcd_twelve_for_twelve() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				"     _ " + LS +
				"  |  _|" + LS +
				"  | |_ ";
		assertThat(lcdDigits.lcdify(12), is(expected));
	}

	@Test
	public void should_return_lcd_910_for_910() throws Exception {
		final LcdDigits lcdDigits = new LcdDigits();
		final String expected =
				" _       _ " + LS +
				"|_|   | | |" + LS +
				"  |   | |_|";
		assertThat(lcdDigits.lcdify(910), is(expected));
	}
}

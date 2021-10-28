package lcd_digits;

import java.util.HashMap;
import java.util.Map;

public class LcdDigits {

	// Allowed characters in 3x3 grid
	private static final String SPACE = " ";
	private static final String UNDERSCORE = "_";
	private static final String PIPE = "|";

	// All grids are built with the following lines
	private static final String SSS = SPACE + SPACE + SPACE;
	private static final String SUS = SPACE + UNDERSCORE + SPACE;
	private static final String SSP = SPACE + SPACE + PIPE;
	private static final String SUP = SPACE + UNDERSCORE + PIPE;
	private static final String PUS = PIPE + UNDERSCORE + SPACE;
	private static final String PSP = PIPE + SPACE + PIPE;
	private static final String PUP = PIPE + UNDERSCORE + PIPE;

	// Line separator
	private static final String LS = System.getProperty("line.separator");

	// Lines used for each decimal digit
	private static final Map<Integer, String> DIGIT_GRID = new HashMap<Integer, String>();
	static {
		DIGIT_GRID.put(0, SUS + LS + PSP + LS + PUP);
		DIGIT_GRID.put(1, SSS + LS + SSP + LS + SSP);
		DIGIT_GRID.put(2, SUS + LS + SUP + LS + PUS);
		DIGIT_GRID.put(3, SUS + LS + SUP + LS + SUP);
		DIGIT_GRID.put(4, SSS + LS + PUP + LS + SSP);
		DIGIT_GRID.put(5, SUS + LS + PUS + LS + SUP);
		DIGIT_GRID.put(6, SUS + LS + PUS + LS + PUP);
		DIGIT_GRID.put(7, SUS + LS + SSP + LS + SSP);
		DIGIT_GRID.put(8, SUS + LS + PUP + LS + PUP);
		DIGIT_GRID.put(9, SUS + LS + PUP + LS + SSP);
	}

	public String lcdify(final int number) {
		char[] numberAsArrayOfChars = String.valueOf(number).toCharArray();
		String[][] digitGrids = getDigitGrids(numberAsArrayOfChars);
		return joinDigitGrids(digitGrids, numberAsArrayOfChars.length);
	}

	private String[][] getDigitGrids(final char[] numberAsArray) {
		String[][] digitGrids = new String[numberAsArray.length][3];
		for (int digitIndex = 0; digitIndex < numberAsArray.length; digitIndex++) {
			final char charDigit = numberAsArray[digitIndex];
			final int index = charDigit - '0';
			digitGrids[digitIndex] = DIGIT_GRID.get(index).split(LS);
		}
		return digitGrids;
	}

	private String joinDigitGrids(final String[][] digitGrids, final int numberLength) {
		final StringBuilder sb = new StringBuilder();
		for (int gridIndex = 0; gridIndex < 3; gridIndex++) {
			if (0 != gridIndex) {
				sb.append(LS);
			}
			for (int digitIndex = 0; digitIndex < numberLength; digitIndex++) {
				if (0 != digitIndex) {
					sb.append(SPACE);
				}
				sb.append(digitGrids[digitIndex][gridIndex]);
			}
		}
		return sb.toString();
	}
}

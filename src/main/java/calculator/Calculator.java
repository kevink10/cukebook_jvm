package calculator;

public class Calculator {
	private String input;
	private static final String ADDITION_SIGN_REGEX = "\\+";
	private static final String DIVISION_SIGN_REGEX = "/";

	public Calculator(String input) {
		this.input = input;
	}

	public String run() {
		int result = 0;
		if (isAddition()) {
			String[] addens = input.split(ADDITION_SIGN_REGEX);
			result = Integer.parseInt(addens[0])
					+ Integer.parseInt(addens[1]);
		} else {
			String[] numbers = input.split(DIVISION_SIGN_REGEX);
			result = Integer.parseInt(numbers[0])
					/ Integer.parseInt(numbers[1]);
		}
		return String.valueOf(result);
	}

	private boolean isAddition() {
		return input.contains("+");
	}

}

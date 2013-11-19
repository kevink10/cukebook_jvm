package calculator;

public class Calculator {
	private String input;

	public Calculator(String input) {
		this.input = input;
	}

	public String run() {
		int result = 0;
		if (input.contains("+")) {
			String[] addens = input.split("\\+");
			result = Integer.parseInt(addens[0])
					+ Integer.parseInt(addens[1]);
		} else {
			String[] numbers = input.split("/");
			result = Integer.parseInt(numbers[0])
					/ Integer.parseInt(numbers[1]);
		}
		return String.valueOf(result);
	}

}

package calculator;

public class Calculator {
	private String input;

	public Calculator(String input) {
		this.input = input;
	}

	public String run() {
		String[] addens = input.split("\\+");
		int sum = Integer.parseInt(addens[0]) + Integer.parseInt(addens[1]);
		return String.valueOf(sum);
	}

}

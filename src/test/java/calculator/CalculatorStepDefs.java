package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

public class CalculatorStepDefs {
	private String input;
	private String result;
	
	@Given("^the input \"([^\"]*)\"$")
	public void the_input(String arg1) throws Throwable {
	    input = arg1;
	}

	@When("^the calculator is run$")
	public void the_calculator_is_run() throws Throwable {
		Calculator calc = new Calculator(input);
		String result = calc.run();
	}

	@Then("^the output is \"([^\"]*)\"$")
	public void the_output_is(String arg1) throws Throwable {
	    throw new PendingException();
	}
}

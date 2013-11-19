package calculator;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefs {
	private String input;
	private String calculatedResult;
	
	@Given("^the input \"([^\"]*)\"$")
	public void the_input(String input) throws Throwable {
	    this.input = input;
	}

	@When("^the calculator is run$")
	public void the_calculator_is_run() throws Throwable {
		Calculator calc = new Calculator(input);
		calculatedResult = calc.run();
	}

	@Then("^the output is \"([^\"]*)\"$")
	public void the_output_is(String expectedResult) throws Throwable {
	    assertThat(expectedResult, is(calculatedResult));
	}
}

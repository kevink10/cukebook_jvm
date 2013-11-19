$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027calculator/adding.feature\u0027");
formatter.feature({
  "id": "adding",
  "description": "",
  "name": "Adding",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "adding;add-two-numbers",
  "description": "",
  "name": "Add two numbers",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "the input \"2+2\"",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "the calculator is run",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "the output is \"4\"",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "2+2",
      "offset": 11
    }
  ],
  "location": "CalculatorStepDefs.the_input(String)"
});
formatter.result({
  "duration": 100510000,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefs.the_calculator_is_run()"
});
formatter.result({
  "duration": 29000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 15
    }
  ],
  "location": "CalculatorStepDefs.the_output_is(String)"
});
formatter.result({
  "duration": 469000,
  "status": "pending",
  "error_message": "cucumber.runtime.PendingException: TODO: implement me\n\tat calculator.CalculatorStepDefs.the_output_is(CalculatorStepDefs.java:25)\n\tat ✽.Then the output is \"4\"(calculator/adding.feature:6)\n"
});
});
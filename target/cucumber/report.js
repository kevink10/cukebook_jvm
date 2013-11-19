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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
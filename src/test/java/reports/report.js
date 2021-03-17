$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Features\MyTest.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Facebook Login Check Facebook Login",
  "description": "",
  "id": "facebook-login-check-facebook-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@Facebook_Login"
    }
  ]
});
formatter.scenario({
  "line": 69,
  "name": "Working with Widgets",
  "description": "",
  "id": "facebook-login-check-facebook-login;working-with-widgets",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 68,
      "name": "@Working_With_Widgets"
    }
  ]
});
formatter.step({
  "line": 70,
  "name": "Intialize Driver",
  "keyword": "Given "
});
formatter.step({
  "line": 71,
  "name": "Open to accordian in Widget",
  "keyword": "When "
});
formatter.step({
  "line": 72,
  "name": "Click all the Accordian",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Navigate to Autocomplete",
  "keyword": "And "
});
formatter.match({
  "location": "amazon_Login.intialize()"
});
formatter.result({
  "duration": 2696119201,
  "status": "passed"
});
formatter.match({
  "location": "working_with_widgets.navigate_To_Widgets()"
});
formatter.result({
  "duration": 4682102099,
  "status": "passed"
});
formatter.match({
  "location": "working_with_widgets.accordian()"
});
formatter.result({
  "duration": 35264201,
  "status": "passed"
});
formatter.match({
  "location": "working_with_widgets.autocomplete()"
});
formatter.result({
  "duration": 4185882701,
  "status": "passed"
});
});
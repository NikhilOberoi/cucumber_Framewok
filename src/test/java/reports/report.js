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
      "name": "@Functional_Test"
    }
  ]
});
formatter.scenario({
  "line": 114,
  "name": "this is dataTable Scenario",
  "description": "",
  "id": "facebook-login-check-facebook-login;this-is-datatable-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 113,
      "name": "@dataTable"
    }
  ]
});
formatter.step({
  "line": 115,
  "name": "Intialize Driver",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "I am on Facebook registrataion page",
  "keyword": "When "
});
formatter.step({
  "line": 117,
  "name": "registeration with invalid user details",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values",
        "Values 2"
      ],
      "line": 118
    },
    {
      "cells": [
        "First Name",
        "Tom",
        ""
      ],
      "line": 119
    },
    {
      "cells": [
        "Last Name",
        "Kenny",
        ""
      ],
      "line": 120
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com",
        "sometwo@someone.com"
      ],
      "line": 121
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com",
        ""
      ],
      "line": 122
    },
    {
      "cells": [
        "Password",
        "Password1",
        ""
      ],
      "line": 123
    },
    {
      "cells": [
        "Birthdate",
        "01",
        ""
      ],
      "line": 124
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "amazon_Login.intialize()"
});
formatter.result({
  "duration": 3265455100,
  "status": "passed"
});
formatter.match({
  "location": "working_with_CucumberDatatable.registrationPage()"
});
formatter.result({
  "duration": 2112628300,
  "status": "passed"
});
formatter.match({
  "location": "working_with_CucumberDatatable.fillForm_dataTable(DataTable)"
});
formatter.result({
  "duration": 951801800,
  "status": "passed"
});
formatter.match({
  "location": "amazon_Login.closeBrowser()"
});
formatter.result({
  "duration": 165821500,
  "status": "passed"
});
});
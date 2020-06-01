$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateOKR.feature");
formatter.feature({
  "line": 1,
  "name": "Create New OKR functionality",
  "description": "This feature verify to creat a new OKR",
  "id": "create-new-okr-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 80,
  "name": "Check functionality of viewing and commenting team member\u0027s OKRs",
  "description": "",
  "id": "create-new-okr-functionality;check-functionality-of-viewing-and-commenting-team-member\u0027s-okrs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 79,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "User is at OKR Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "User click on Team Managment tab",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "User search for Other Employee \"\u003cEmployeeName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "User click on view icon and go ahead",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "User should be able to view  \"\u003cEmployeeName\u003e\" Objectives",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "User click on Comment button on \"\u003cObjective\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User should be able to comment on key result",
  "keyword": "Then "
});
formatter.examples({
  "line": 89,
  "name": "",
  "description": "",
  "id": "create-new-okr-functionality;check-functionality-of-viewing-and-commenting-team-member\u0027s-okrs;",
  "rows": [
    {
      "cells": [
        "EmployeeName",
        "Objective"
      ],
      "line": 90,
      "id": "create-new-okr-functionality;check-functionality-of-viewing-and-commenting-team-member\u0027s-okrs;;1"
    },
    {
      "cells": [
        "Anurag",
        "Test Kr"
      ],
      "line": 91,
      "id": "create-new-okr-functionality;check-functionality-of-viewing-and-commenting-team-member\u0027s-okrs;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is at OKR login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter \"himanshu.kumar@infoprolearning.com\" in Email field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter \"abcd@1234\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "login should be sucessful",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.invokeApplication()"
});
formatter.result({
  "duration": 51285550800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "himanshu.kumar@infoprolearning.com",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefinition.user_Enter_in_Email_field(String)"
});
formatter.result({
  "duration": 402947400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@1234",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefinition.user_Enter_in_Password_field(String)"
});
formatter.result({
  "duration": 140083300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_click_on_Sign_In_Button()"
});
formatter.result({
  "duration": 25096662900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.login_should_be_sucessful()"
});
formatter.result({
  "duration": 20013377300,
  "status": "passed"
});
formatter.scenario({
  "line": 91,
  "name": "Check functionality of viewing and commenting team member\u0027s OKRs",
  "description": "",
  "id": "create-new-okr-functionality;check-functionality-of-viewing-and-commenting-team-member\u0027s-okrs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 79,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "User is at OKR Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "User click on Team Managment tab",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "User search for Other Employee \"Anurag\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "User click on view icon and go ahead",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "User should be able to view  \"Anurag\" Objectives",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "User click on Comment button on \"Test Kr\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User should be able to comment on key result",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateOKRDefinition.user_is_at_OKR_Home_page()"
});
formatter.result({
  "duration": 9783700,
  "status": "passed"
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
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateOKR.feature");
formatter.feature({
  "line": 1,
  "name": "Create New OKR functionality",
  "description": "This feature verify to creat a new OKR",
  "id": "create-new-okr-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 68,
  "name": "Check deleting OKR functionaliuty",
  "description": "",
  "id": "create-new-okr-functionality;check-deleting-okr-functionaliuty",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "User is at OKR Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "user click on \"\u003cObjective\u003e\" edit button",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "User should be able to navigate to edit OKR page",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user delete objective",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "\"\u003cObjective\u003e\" should not be visible at home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 74,
  "name": "",
  "description": "",
  "id": "create-new-okr-functionality;check-deleting-okr-functionaliuty;",
  "rows": [
    {
      "cells": [
        "Objective"
      ],
      "line": 75,
      "id": "create-new-okr-functionality;check-deleting-okr-functionaliuty;;1"
    },
    {
      "cells": [
        "Personal Growth"
      ],
      "line": 76,
      "id": "create-new-okr-functionality;check-deleting-okr-functionaliuty;;2"
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
  "duration": 79574363400,
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
  "duration": 423817400,
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
  "duration": 156601800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_click_on_Sign_In_Button()"
});
formatter.result({
  "duration": 25142342900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.login_should_be_sucessful()"
});
formatter.result({
  "duration": 20011348400,
  "status": "passed"
});
formatter.scenario({
  "line": 76,
  "name": "Check deleting OKR functionaliuty",
  "description": "",
  "id": "create-new-okr-functionality;check-deleting-okr-functionaliuty;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "User is at OKR Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "user click on \"Personal Growth\" edit button",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "User should be able to navigate to edit OKR page",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user delete objective",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "\"Personal Growth\" should not be visible at home page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateOKRDefinition.user_is_at_OKR_Home_page()"
});
formatter.result({
  "duration": 33972400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal Growth",
      "offset": 15
    }
  ],
  "location": "CreateOKRDefinition.user_click_on_edit_button(String)"
});
formatter.result({
  "duration": 59627246600,
  "status": "passed"
});
formatter.match({
  "location": "CreateOKRDefinition.user_should_be_able_to_navigate_to_edit_OKR_page()"
});
formatter.result({
  "duration": 2008303200,
  "status": "passed"
});
formatter.match({
  "location": "CreateOKRDefinition.user_delete()"
});
formatter.result({
  "duration": 108789426700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal Growth",
      "offset": 1
    }
  ],
  "location": "CreateOKRDefinition.objective_should_not_be_visible_at_home_page(String)"
});
formatter.result({
  "duration": 20049912800,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat stepDefinition.CreateOKRDefinition.objective_should_not_be_visible_at_home_page(CreateOKRDefinition.java:173)\r\n\tat ✽.Then \"Personal Growth\" should not be visible at home page(features/CreateOKR.feature:73)\r\n",
  "status": "failed"
});
});
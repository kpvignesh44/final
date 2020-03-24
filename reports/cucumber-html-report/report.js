$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the practice automation website",
  "description": "",
  "id": "testing-the-practice-automation-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 22,
  "name": "",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "The user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "testing-the-practice-automation-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 32,
      "id": "testing-the-practice-automation-website;;;1"
    },
    {
      "cells": [
        "vignesh@gmail.com",
        "9869868"
      ],
      "line": 33,
      "id": "testing-the-practice-automation-website;;;2"
    },
    {
      "cells": [
        "vicky@gmail.com",
        "sanjeev"
      ],
      "line": 34,
      "id": "testing-the-practice-automation-website;;;3"
    },
    {
      "cells": [
        "kpvic@gmail.com",
        "admin"
      ],
      "line": 35,
      "id": "testing-the-practice-automation-website;;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 21,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "The user enters \"vignesh@gmail.com\" and \"9869868\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 4549617548,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 17716797977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vignesh@gmail.com",
      "offset": 17
    },
    {
      "val": "9869868",
      "offset": 41
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7312618985,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 2073115172,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7087457210,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 21,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "The user enters \"vicky@gmail.com\" and \"sanjeev\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3432767541,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 21065786324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vicky@gmail.com",
      "offset": 17
    },
    {
      "val": "sanjeev",
      "offset": 39
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7251610950,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 2080179713,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7099358943,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 21,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "The user enters \"kpvic@gmail.com\" and \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3419526528,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 18912869397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kpvic@gmail.com",
      "offset": 17
    },
    {
      "val": "admin",
      "offset": 39
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7294298375,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 2077709200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7121970762,
  "status": "passed"
});
});
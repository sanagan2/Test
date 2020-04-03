$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sanagan2/eclipse-workspace/Jmhworkday/JMH_workday/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "workday login screen validations",
  "description": "",
  "id": "workday-login-screen-validations",
  "keyword": "Feature"
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
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.i_launch_the_application()"
});
formatter.result({
  "duration": 631644300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.util.TestBase.intialization(TestBase.java:92)\r\n\tat com.qa.stepdefinations.LoginPageStepDef.i_launch_the_application(LoginPageStepDef.java:18)\r\n\tat ✽.Given I launch the application(/Users/sanagan2/eclipse-workspace/Jmhworkday/JMH_workday/src/main/java/com/qa/features/login.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "workday-login-screen-validations;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i enter valid username \"username\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i enter valid password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i should see the alert error message \"Unrecognized username or password.\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 24
    }
  ],
  "location": "LoginPageStepDef.i_enter_valid_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 24
    }
  ],
  "location": "LoginPageStepDef.i_enter_valid_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageStepDef.i_click_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Unrecognized username or password.",
      "offset": 38
    }
  ],
  "location": "LoginPageStepDef.i_should_see_the_alert_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
});
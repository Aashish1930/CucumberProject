$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sharekhan.feature");
formatter.feature({
  "line": 1,
  "name": "Test sharekhan Application",
  "description": "",
  "id": "test-sharekhan-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Home Page",
  "description": "",
  "id": "test-sharekhan-application;validate-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on Loginpage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user login app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is On Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User check All Top Panel Link Verify",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Check All Left Panel Link Verify",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 59931909669,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_is_on_Loginpage()"
});
formatter.result({
  "duration": 1498966470,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.enter_username_and_password()"
});

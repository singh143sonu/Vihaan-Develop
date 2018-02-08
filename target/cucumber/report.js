$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "github login",
  "description": "",
  "id": "github-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login with username and password",
  "description": "",
  "id": "github-login;login-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on github homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is displayed login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GitHubLoginSD.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 12126628526,
  "status": "passed"
});
formatter.match({
  "location": "GitHubLoginSD.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 1335821494,
  "status": "passed"
});
formatter.match({
  "location": "GitHubLoginSD.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 5106256244,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "invalid login",
  "description": "",
  "id": "github-login;invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he login with invalid details",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "an error message is displayed",
  "keyword": "Then "
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
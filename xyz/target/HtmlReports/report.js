$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Composeemail.feature");
formatter.feature({
  "name": "Compose and send the mail through gmail account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User logs in and send mails",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is a user who visits the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.composeemail.there_is_a_user_who_visits_the_login_page()"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from https://chromedriver.storage.googleapis.com/index.html\r\n\tat org.openqa.selenium.internal.Require$StateChecker.nonNull(Require.java:280)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:132)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:38)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:231)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:434)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:127)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:46)\r\n\tat stepdefinition.composeemail.there_is_a_user_who_visits_the_login_page(composeemail.java:13)\r\n\tat ✽.there is a user who visits the login page(file:///C:/Users/heet1/eclipse-workspace/xyz/src/test/resources/Features/Composeemail.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user login with username\"Incubyte.demo\"with password\"incubyte123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.composeemail.user_login_with_username_Incubyte_demo_with_password_incubyte123()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sends an email to \"abc123@Incubyte.com\" with subject \"Incubyte\" with body\"Automation QA test for Incubyte\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.composeemail.user_sends_an_email_to_with_subject_with_body_Automation_QA_test_for_Incubyte(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the email appears in sent folder of gmail with subject\"Incubyte\" with body\"Automation QA test for Incubyte\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.composeemail.the_email_appears_in_sent_folder_of_gmail_with_subject_Incubyte_with_body_Automation_QA_test_for_Incubyte()"
});
formatter.result({
  "status": "skipped"
});
});
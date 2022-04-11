#Author :Dhyuti Shukla
#Date:10/04/2022
#Description:Compose and send the mail through gmail account
Feature: Compose and send the mail through gmail account
  Scenario: User logs in and send mails
  Given there is a user who visits the login page
  And user login with username "demoincubyte@gmail.com" with password "incubyte123"
    And user enter on clicks button
  When user sends an email to "dhyutishukla1996@gmail.com" with subject "Incubyte" with body"Automation QA test for Incubyte"
  Then the email appears in sent folder of gmail with subject "Incubyte" with body "Automation QA test for Incubyte"

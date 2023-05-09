#Author
#Date
#Description
@SmokeScenario
Feature: feature to test login functionality
  @SmokeTest
  Scenario: Check login and contact is successful with valid credentials
    Given browser open
    And user on login page
    When user enterss fiora@gmail.com and fiora
    And clickss on login button
    And clicks on contactus
    And clicks on whatsapp button
    Then go to whatsapp

  Scenario Outline: Check login and contact is successful with valid credentials
    Given browser open
    And user on login page
    When user enterss <Username> and <Password>
    And clickss on login button
    And clicks on contactus
    And clicks on whatsapp button
    Then go to whatsapp

    Examples:
      | Username |    | Password |
      | fiora@gmail.com |    | fiora |
      | user2    |    | pass2    |

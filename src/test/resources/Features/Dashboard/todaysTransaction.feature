#Author
#Date
#Description
@SmokeScenario
Feature: feature to test todaysTransaction funcionality

  @SmokeTest
  Scenario: check today Transaction is successful with valid credentials
    Given user is logged in
    When user clicks on today transaction
    Then user is navigated to reporting page
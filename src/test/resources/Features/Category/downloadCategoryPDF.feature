#Author
#Date
#Description
@SmokeScenario
Feature: feature to test download pdf functionality
    @SmokeTest
    Scenario: Check login and category is successful with valid credentials
        Given browser is open
        And user is on login page
        When user enters fiora@gmail.com and fiora
        And clicks on login button
        And clicks on category
        Then user get pdf

     Scenario Outline: Check login and category is successful with valid credentials
            Given browser is open
            And user is on login page
            When user enters <Username> and <Password>
            And clicks on login button
            And clicks on category
            Then user get pdf

            Examples:
                | Username |    | Password |
                | fiora@gmail.com |    | fiora |
                | user2    |    | pass2    |

#Author
#Date
#Description

@SearchCategoryScenario
Feature: feature to search category
	

  Scenario Outline: check login is succesful with valid credentials
    Given browser is open
    And user is on login page
    When user enters "fiora@gmail.com" and "fiora"
    And clicks on login button
    Then user is navigated to the home page
    
   Scenario: search category exist
    Given user is on home page
    And user click category button
  	When user enters "<keyword>"
  	Then user is showed category matched "<keyword>"
  	
  	Examples:
  		| keyword							 	|
  		| Medicine              |
  	
  Scenario: search category does not exist
    Given user is on home page
    And user click category button
  	When user enters "<keyword>"
  	Then show category does not exist "<keyword>"
  	
  	
  	Examples:
  		| keyword							 	|
  		| Snack		 	            |


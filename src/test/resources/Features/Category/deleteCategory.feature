#Author
#Date
#Description

@DeleteCategoryScenario
Feature: feature to search category
	

  Scenario Outline: check login is succesful with valid credentials and search category from search field 
    Given browser is open
    And user is on login page
    When user enters "fiora@gmail.com" and "fiora"
    And clicks on login button
    Then user is navigated to the home page
 
   Scenario: delete category exist
   	Given user is on home page
    And user click category button
  	When user enters "<keyword>"
    Given user found category matched
    When user click delete
    Then category deleted
    
  	Examples:
  		| keyword							 	|
  		| Fruit                 |  		
  	
  Scenario: delete category does not exist
    Given user is on home page
    And user click category button
  	When user enters "<keyword>"
  	Then show category does not exist "<keyword>"
  	
  	 Examples:
  		| keyword							 	|
  		| Snack		 	            |
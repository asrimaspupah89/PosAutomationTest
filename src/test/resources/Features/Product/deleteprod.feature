#Author
#Date
#Description

@SmokeScenario
Feature: feature to test delete product button funcionality
	
	@SmokeTest1
  Scenario: check delete product button is works
    Given browser is open and login succesfully for delete product
    When product page is open for delete product
    And able to click delete button
    Then click ok to delete product
    Then product deleted
    
  @SmokeTest2
  Scenario: check delete product button is works
    Given browser is open and login succesfully for delete product
    When product page is open for delete product
    And able to click delete button
    Then click cancel to cancel delete product
    Then cancel deleted  
    
   @SmokeTest3
   Scenario: check delete product button
   	Given browser is open and login succesfully for delete product
   	When product page is open for delete product
   	Then delete button found
   	

#Author				: Adriana Anggita Daeli
#Date					: 01/05/23
#Description	: Dashboard feature scenarios

@SmokeProfile
Feature: feature to test profile page

	@SmokeTestProfileButton
  Scenario: check navigate to profile page 
   	Given browser is open and user already logged in for profile page
   	When user click profile button
  	Then user should be navigated to profile page
  	
  @SmokeTestProfileUI
  Scenario: check user profile UI
 		Given browser is open and user already logged in for profile page
 		When user click profile button
 		Then print message information found 
  
  @SmokeTestEditButton
  Scenario: check user profile edit button
  	Given browser is open and user already logged in for profile page
  	When user click profile button
  	And Able to click edit profile button
  	Then navigate to edit profile page
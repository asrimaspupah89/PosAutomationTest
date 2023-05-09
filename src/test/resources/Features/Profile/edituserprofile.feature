#Author				: Adriana Anggita Daeli
#Date					: 01/05/23
#Description	: Dashboard feature scenarios

@SmokeProfile
Feature: feature to test edit profile page

	@SmokeTestEditProfileBackButton
  Scenario: check navigate to profile page from edit 
   	Given browser is open and user already logged in for edit profile page
   	When user is on edit profile page
   	And click back button in edit profile page
  	Then user should be navigated to profile page from edit profile page
  	
  @SmokeTestEditUserNameandPassword
  Scenario: check name and password
  	Given browser is open and user already logged in for edit profile page
   	When user is on edit profile page
   	And user fill name and password and click save changes
   	Then throw message
  
  	


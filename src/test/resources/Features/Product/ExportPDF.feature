#Author
#Date
#Description
@NavNextProd
Feature: feature to test PDF download product functionality

  @NavNextProd1
  Scenario: check PDF donwload is working
    Given user open browser
    And user is on table product page
    When clicks PDF button on table product
    
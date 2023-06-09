#Author : Rusyda Jasmine Rachmat
#Date : 28/04/2023
#Description : Testing in Stock Alerts in Product

@StockAlert
Feature: feature to test displaying data stock alert functionality

  @StockAlert1
  Scenario: check data stock alert is showed on product page
    Given user product has opened the browser
    And user product on the dashboard page
    When user product clicks product button
    Then user product is navigated to the product page
    And user product should be able to see product data stock alert

  @StockAlert2
  Scenario Outline: check data stock alert is showed on product page <conditions>
    Given user product has opened the browser
    And user product on the product page
    And user product clicks add product button
    And user product has showed modal pop up add product
    When user product enters "<image>", "<productCode>", "<productName>", "<category>", "<expireDate>", "<stocks>", "<capitalPrice>", and "<price>"
    And user product clicks on add products button
    Then user product should be "<ability>" to see product "<productName>" in data stock alert

    Examples: 
      | image                                   | productCode | productName | category | expireDate | stocks | capitalPrice | price | ability  | conditions                                |
      | C:/Users/mirva/Downloads/ultramilk.jpeg |        1231 | ultramilk   | Milk     | 30/04/2024 |      5 |         1200 |  2500 | able     | within add product and the stock is < 100 |
      | C:/Users/mirva/Downloads/ultramilk.jpeg |        1232 | ultramilk2  | Milk     | 30/04/2024 |    150 |         1200 |  2500 | not able | within add product and the stock is > 100 |

#Author: your.email@your.domain.com
Feature: 
  Mobile Validation


  Scenario: 
    Given launch the URL
    When search product
    And select product & add that to cart
    And place order & login to the application
    And Select address & Select payment option
    And Remove product from the cart
    Then user closes application

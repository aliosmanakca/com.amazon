Feature: user should be able to use filters and sort options

  Background:
    Given user goes to amazon page
    Then searches a keyword "computer"

  Scenario: user should be able to use filters
    And randomly choose a filter

  Scenario: user should be able to sort the products in ascending order of price
    And clicks sort button
    Then clicks low to high
    And sees products in ascending order


  Scenario: user should be able to sort the products in descending order of price
    And clicks sort button
    Then  clicks high to low
    And sees products in descending order


Feature: user should be able to use filters and sort options

  Background:
    Given user goes to amazon page
    Then searches a keyword "computer"

  @TC_0501
  Scenario: user should be able to use filters
    And randomly choose a filter

  @TC_0502
  Scenario: user should be able to sort the products in ascending order of price
    And clicks sort button
    Then clicks low to high
    And sees products in ascending order


  @TC_0503
  Scenario: user should be able to sort the products in descending order of price
    And clicks sort button
    Then  clicks high to low
    And sees products in descending order


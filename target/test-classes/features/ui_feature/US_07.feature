Feature: user should be able to access the correct pages from the links bottom of the page

  @TC_0701
  Scenario:
    Given user goes to amazon page
    Then goes to the bottom of the page
    And click a link
    Then sees the correct page

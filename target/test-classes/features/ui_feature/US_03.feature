Feature: user should be able to choose a category from ALL menu and see the subcategories.

  @TC_0301
  Scenario: user should be able to choose a category from ALL menu and see the subcategories.
    Given user goes to amazon page
    Then clicks ALL button
    And randomly choose a category
    Then sees subcategories
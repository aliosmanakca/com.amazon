Feature: trello test

  Scenario: create a board
    Given send request to create "automationTest3" board
    Then assert status code 200
    And assert board name is "automationTest3"
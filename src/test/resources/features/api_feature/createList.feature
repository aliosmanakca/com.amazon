Feature: trello creating a list

  Scenario: trello creating a list
    Given send request to create "list1" list in "automationTest6" board
    Then verify list name is "list1"
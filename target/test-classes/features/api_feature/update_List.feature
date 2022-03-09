@updateList
Feature: trello updating a list

  Scenario: trello updating a list
    Given send request to update "newList3" list to new name "newList4"
    Then verify updated list name is "newList4"
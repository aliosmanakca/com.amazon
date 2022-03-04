Feature: trello testi

  Scenario: create a board
    Given send request to create "automationTest1" board
    Then assert status code 200
    And assert board name is "automationTest1"
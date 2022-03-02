Feature: trello testi

  Scenario: create a board
    Given send request to create "api" board
    Then assert status code
    And assert board name is "api"
Feature: trello testi

  Scenario: create a board with pojo
    Given send request to create "automationTest2" board with pojo
    Then get response with pojo
    And assert board name is "automationTest2" with pojo
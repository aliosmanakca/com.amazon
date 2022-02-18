Feature: when the user searches for a keyword, results must contain the keyword

  @TC_0401
  Scenario Outline: when the user searches for a keyword, results must contain the keyword
    Given user goes to amazon page
    Then searches a keyword "<keyword>"
    And results contain "<keyword>"
    Examples:
      | keyword |
    |   java      |
    |   apple     |
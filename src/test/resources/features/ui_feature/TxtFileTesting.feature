@txt
Feature: user shouldn't be able to login with invalid credentials. (txt attempt)


  Scenario Outline: user shouldn't be able to login with invalid credentials (txt attempt)
    Given user goes to amazon page
    Then clicks login button
    And fills the credentials from given text file "src/test/resources/test_data/username.txt" and "<rownumber>"
    And fills the credentials from given text file "src/test/resources/test_data/password.txt" and "<rownumber>"
    Then sees the alert
    Examples:
      | rownumber |
      | 1         |
      | 2         |
      | 3         |
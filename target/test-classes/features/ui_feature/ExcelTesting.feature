@excel
Feature: user shouldn't be able to login with invalid credentials. (Excel attempt)

  @TC_0201
  Scenario Outline: user shouldn't be able to login with invalid credentials (Excel attempt)
    Given user goes to amazon page
    Then clicks login button
    And fills the credentials from given "<sheetname>" and "<rownumber>"
    Examples:
      | sheetname |  | rownumber |
      | Sheet1    |  | 1         |
      | Sheet1    |  | 2         |
      | Sheet1    |  | 3         |

Feature: user shouldn't be able to login with invalid credentials

  @TC_0201 @smoke
  Scenario Outline: user shouldn't be able to login with invalid credentials
    Given user goes to amazon page
    Then clicks login button
    And enters "<username>" for username and "<password>" for password
    Examples:
      | username        |  | password           |
      | asd@gmail.com   |  | wrongpassword123   |
      | wrong@gmail.com |  | correctpassword123 |
      | wrong@gmail.com |  | wrongpassword123   |

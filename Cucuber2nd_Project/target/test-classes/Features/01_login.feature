@E2E
Feature: To validate the functionally of the jamboshop application.

  @smoke
  Scenario Outline: To validate the login functionally with valid crendtials
    Given The user should be in the jamboshop loginpage
    When The user should click the login
    And The user should fill the "<username>" and "<password>"
    Then The user to click the login button

    Examples: 
      | username          | password      |
      | dvkme75@gmail.com | 9087345075 |

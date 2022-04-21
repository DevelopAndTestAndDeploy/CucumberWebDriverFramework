@login @regression
Feature: Webdriver university - Login Page.

  Background:
    Given I access the webdriver university login page

  Scenario: Validate successful Login.
    When  I enter a username webdriver
    And   I enter a password webdriver123
    And   I click on the login button
    Then  I should be presented with a successful login message


  Scenario: Validate unsuccessful.
    When  I enter a username webdriver
    And   I enter a password password123
    And   I click on the login button
    Then  I should be presented with an unsuccessful login message

  @smoke
  Scenario Outline: Validate - Successful and Unsuccessful Login
    When I enter a username <username>
    And  I enter a password <password>
    And  I click on the login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | joe_blogs | password1    | validation failed      |
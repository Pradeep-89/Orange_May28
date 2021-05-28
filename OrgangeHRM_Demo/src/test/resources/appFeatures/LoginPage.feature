Feature: Login page feature

  @Smoke
  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "OrangeHRM"

  @Regression
  Scenario: Forgot Password Link
    Given user is on login page
    Then forgot your password link should be displayed

  @Sanity
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on Login button
    And page title should be "OrangeHRM"

  Scenario Outline: Check multiple Invalid login
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on Login button

    Examples: 
      | username | password |
      | Admin    | Adkk@123 |
      | Admih    | admin123 |

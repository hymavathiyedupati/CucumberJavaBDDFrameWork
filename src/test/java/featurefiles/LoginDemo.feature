Feature: Test Login Functionality
  Scenario Outline: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on submit button
    Then user is navigated to the home page
    Examples:
      | username | password |
      | student    | Password123  |

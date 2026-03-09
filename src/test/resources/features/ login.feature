Feature: Login and Logout

  Scenario: Login with valid credentials
    Given User launches the shopping website
    When User clicks on Sign in
    And User enters valid email and password
    And User clicks login button
    Then User should be logged in

  Scenario: Login with invalid credentials
    Given User launches the shopping website
    When User clicks on Sign in
    And User enters invalid credentials
    And User clicks login button
    Then Error message should appear

  Scenario: Logout successfully
    Given User is logged in
    When User clicks logout
    Then User should be logged out
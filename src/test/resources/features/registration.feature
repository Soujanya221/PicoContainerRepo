Feature: User Registration

  Scenario: Register new user successfully
    Given User launches the shopping website
    When User clicks on Sign in
    And User enters email to create account
    And User clicks create account button
    And User fills registration form
    And User submits registration form
    Then Account should be created successfully

  Scenario: Registration with existing email
    Given User launches the shopping website
    When User clicks on Sign in
    And User enters existing email
    And User clicks create account button
    Then Error message should be displayed
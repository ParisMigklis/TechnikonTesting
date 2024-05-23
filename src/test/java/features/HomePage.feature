Feature: Home Page

  Scenario: Home Page Title
    Given The home page is displayed
    Then  We can see the title "Welcome to Technikon"

  Scenario: Login Button Functionality
    Given The home page is displayed
    And The login button is visible
    When We click on the login button
    Then The login form is displayed

  Scenario: Sign up Button Functionality
    Given The home page is displayed
    And The signup button is visible
    When We click on the sign up button
    Then The signup form is displayed


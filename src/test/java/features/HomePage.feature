Feature: Home Page

  Scenario: Home Page Title
    Given The home page is displayed
    Then  We can see the title "Welcome to Technikon"

  Scenario: Login Button Functionality
    Given The home page is displayed
    When We click on the login button
    Then We are at the "/login" page

  Scenario: Sign up Button Functionality
    Given The home page is displayed
    When We click on the signup button
    Then We are at the "/signup" page



Feature: We will implement a high risk scenario where a user signs up ands tries to perform admin actions

  Scenario:Simple User tries to perform admin actions
    Given The home page is displayed
    And We click on the signup button
    And We signup as new user
    And We login with our new credentials
    When We click the admin button
#    Then We receive a security error
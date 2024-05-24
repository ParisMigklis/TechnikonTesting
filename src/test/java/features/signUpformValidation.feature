Feature: SignUp Form Validation

  Scenario: Test empty Username field in Sign-Up form
    Given The signup form is displayed
    When I click the signup button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test empty email field after we enter username in Sign Up form
    Given The signup form is displayed
    And I enter a valid username "pariss"
    When I click the signup button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test empty password field after we enter valid username and email in Sign Up form
    Given The signup form is displayed
    And I enter a valid username "pariss"
    And I enter a valid email "paris@gmail.com"
    When I click the signup button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test empty confirm password field after we enter valid username and email and password in Sign Up form
    Given The signup form is displayed
    And I enter a valid username "pariss"
    And I enter a valid email "paris@gmail.com"
    And I enter a pass "1234"
    When I click the signup button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test invalid Confirm Password field after we have filled all the previous fields in Sign Up form
    Given The signup form is displayed
    And I enter a valid username "pariss"
    And I enter a valid email "paris@gmail.com"
    And I enter a pass "1234"
    And I enter a different pass "123"
    When I click the signup button
    Then An  invalid password error message is displayed saying "Passwords do not match"

  Scenario: Test filling the form with valid credentials and creating new User
    Given The signup form is displayed
    And I enter a valid username "pariss"
    And I enter a valid email "paris@gmail.com"
    And I enter a pass "1234"
    And I confirm pass "1234"
    When I click the signup button
    Then A new user is created

#  Scenario: Test entering a username that already exists while creating a new User
#  Scenario: Test entering an email that is already in use while creating a new User
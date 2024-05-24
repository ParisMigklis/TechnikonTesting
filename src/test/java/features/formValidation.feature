Feature:Login Form Validation

  Scenario: Test Empty e-mail Field in Login Form
    Given The login form is displayed
    When I click the login button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test Empty Password Field after we enter e-mail on Login Form
    Given The login form is displayed
    And I have already entered a valid email "pariss"
    When I click the login button
    Then An error message is displayed saying "Please fill out this field"

  Scenario: Test Entering invalid e-mail in Login Form
    Given The login form is displayed
    And I enter an invalid e-mail "invalidEmail"
    When I click the login button
    Then An error message is displayed saying "Please enter an email address"

        #Scenario:Test entering an already in-use e-mail

  Scenario: Test entering valid fields and logging in
    Given The login form is displayed
    And I have already entered a valid email "paris@gmail.com"
    And I enter a password "1234"
    When I click the login button
    Then The user is logged in
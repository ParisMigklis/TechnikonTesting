Feature:Login Form Validation

  Scenario: Test Empty E-mail Field in Login Form
    Given The login form is displayed
    When I click the login button
    Then An error message is displayed saying "Please fill out this field"


    Scenario: Test Empty Password Field after we enter E-mail on Login Form
      Given The login form is displayed
      And I have already entered a valid email "paris@gmail.com"
      When I click the login button
      Then An error message is displayed saying "Please fill out this field"
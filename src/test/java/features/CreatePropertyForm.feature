Feature: Checking functionality of create a Property form.

  Scenario: Go to the add a new Property
    Given The home page is displayed
    And We click on the login button
    And We enter username "paris" and pass "1234" and login
    And I see the login confirmation
    And We click the properties button
    And We click the create property button
    Then We are at the create Property form
    And We fill the property E9 "12345678910"
    And We fill the property Address "Omirou 6"
    And We fill the property Year "1995"
    And We fill Type as a "Maisonette"
    And We fill the URL as "https://yt3.ggpht.com/a-/AAuE7mAvGZ8ytkhpG75l0NBfcz63sJiLRJV5kD6tyQ=s900-mo-c-c0xffffffff-rj-k-no"
    And We fill the property Latitude "55"
    And We fill the property Longitude "45"
    When We click the submit button to create a property
    Then We get a confirmation that the property was created

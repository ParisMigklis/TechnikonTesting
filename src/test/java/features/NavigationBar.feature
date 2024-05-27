Feature: Navigation Bar

#  Scenario: Admin from navigation bar
#    Given The navigation bar is displayed
#    When We click the admin button
#    Then We get transferred to the "/home" page
#
  Scenario: Admin from navigation bar
    Given The navigation bar is displayed
    When We click the admin button
    Then We are at the "/admin" page

  Scenario: Owner from navigation bar
    Given The navigation bar is displayed
    When  We click the owner button
    Then We are at the "/owner" page

  Scenario: Login from navigation bar
    Given The navigation bar is displayed
    When  We click on the navigation login button
    Then We are at the "/login" page

  Scenario: Signup from navigation bar
    Given The navigation bar is displayed
    When We click on the navigation signup button
    Then We are at the "/signup" page

  Scenario:Repairs  from navigation bar
    Given The navigation bar is displayed
    When We click the repairs button
    Then We are at the "/repairs" page

  Scenario:Properties  from navigation bar
    Given The navigation bar is displayed
    When We click the properties button
    Then We are at the "/properties" page

  Scenario:Home from navigation bar
    Given The navigation bar is displayed
    When We click on the navigation home button
    Then The home page is displayed




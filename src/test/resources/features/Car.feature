@smoke
  Feature: Login Functionality

    Scenario: Login with valid credentials
      Given The user is on homepage
      When the user enters the valid username
      And the user enters the valid password
      And the user clicks on Login button
      Then the user should see the user name on clubs page
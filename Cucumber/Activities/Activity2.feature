@Activity2
  Feature: Login Test

    Scenario: Testing login
      Given User is on login page
      When User enters Username and password
      Then Read the page title and confirmation message
      And Close the browser
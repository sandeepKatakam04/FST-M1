@Activity4
  Feature: Login Test
    Scenario: Testing login without Examples
      Given User is on login page
      When User enters "admin" and "password"
      Then Read the page title and confirmation message
      And Close the browser
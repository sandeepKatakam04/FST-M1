@Activity5
  Feature: Login Test
    Scenario Outline: Testing login with examples
      Given User is on login page
      When User enters "<username>" and "<password>"
      Then Read the page title and confirmation message
      And Close the browser
      Examples:
        | username | password |
        |  admin   | password |
        |adminUser | Password |
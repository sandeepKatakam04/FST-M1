@Activity3
  Feature: Testing with tags

    @Simplealert
    Scenario: Testing with simple alert
      Given User is on the page
      When User clicks the Simple Alert button
      Then Alert opens
      And Read the text from it and print it
      And Close the alert
      And Close browser

    @Confirmalert
    Scenario: Testing with confirm alert
      Given User is on the page
      When User clicks the Confirm Alert button
      Then Alert opens
      And Read the text from it and print it
      And Close the alert with Cancel
      And Close browser

    @Promptalert
    Scenario: testing with prompt alert
      Given User is on the page
      When User clicks the Prompt Alert button
      Then Alert opens
      And Read the text from it and print it
      And Write a custom message in it
      And Close the alert
      And Close browser

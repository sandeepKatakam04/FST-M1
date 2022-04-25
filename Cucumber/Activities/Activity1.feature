@Activity1
  Feature: Google Search

  Scenario: searching for something on google webpage
    Given User is on Google Home Page
    When user types in cheese and hits enter
    Then Show how many search results were shown
    And close the browser
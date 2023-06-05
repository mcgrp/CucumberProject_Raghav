Feature: Feature to test login functionality

  Scenario: login functionality
    Given User is on login page
    When User provides valid "username" and "password"
    And User clicks on Login button
    Then User should navigate to home page

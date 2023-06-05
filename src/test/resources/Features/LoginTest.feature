Feature: Login functionality validation

  Scenario Outline: 
    Given Launch any browser
    And Launch the URL
    When User gives  <Username> and <password>
    And User Clicks on Login button
    Then Logout button should be displayed

    Examples: 
      | Username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |

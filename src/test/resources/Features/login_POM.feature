Feature: 
  feature to test login functionality using POM

  Scenario Outline: 
    Given open chrome browser
    And open app URL
    When User sends <userid> and <pwd>
    And hit login button
    Then Logout button will be displayed

    Examples: 
      | userid | pwd   |
      | Raghav | 12345 |
      | Ele    | 12345 |

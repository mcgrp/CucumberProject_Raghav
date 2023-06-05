Feature: feature to test googlesearch functionality

  Scenario: google search functionality
    Given launch Chromedriver
    And Launch the url for google
    When User provides facebook in the searchbox
    And clicks enter key
    Then search results should display

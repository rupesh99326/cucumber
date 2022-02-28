Feature: feature to test google search functionality
Scenario: Validate google search is working
    Given browser is open
    And user is on google serch page
    When user enters a text in serch box
    And hits enter
    Then user is navigated to serch results

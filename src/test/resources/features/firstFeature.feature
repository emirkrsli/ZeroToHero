Feature: first feature

  Scenario: Google search
    Given Browser is open
    When I navigate to Google Home Page
    And I search for "emir"
    Then I should see search results

  Scenario: Google search parallel
    Given Browser is open
    When I navigate to Google Home Page
    And I search for "berkay"
    Then I should see search results
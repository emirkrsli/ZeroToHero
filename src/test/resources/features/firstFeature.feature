Feature: first feature

  Scenario: Google search
    Given Browser is open
    And log "emir"
    When I navigate to Google Home Page
    And I search for "emir"
    Then I should see search results

  Scenario: Google search 2
    Given Browser is open
#    And log "Berkay"
    When I navigate to Google Home Page
    And I search for "berkay"
    Then I should see search results




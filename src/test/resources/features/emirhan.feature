Feature: Amazon Search Functionality

  Scenario Outline: Amazon Search And Add Card Functionality
    Given  User is on the amazon page
    And Verify the title has Amazon
    And User must sign in
    And User search for "<search_item>"
    Then Verify the result has "<search_item>"
    Then Add to card
    Then Close the application

    Examples:
      |search_item|
      |Apple AirPods Pro (2. nesil)|

    #didn't give the username and password credentials on purpose




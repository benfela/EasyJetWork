Feature: Flights information

  Scenario: As a user I want to be able to view information about flights
    from Amsterdam to London So that I can see arrivals information for the current day

    Given I am on the Homepage
    And I mouse over Flight info
    And I see a FLIGTS & TRAVEL INFO
    When I click on  FLIGHT TRACKER
    And I see an Arrival & Departure Information banner
    When I enter  Amsterdam on the depature text field
    And I enter London on the arrival text field
    And I click the search button
    Then I should see arrivals information for the current day

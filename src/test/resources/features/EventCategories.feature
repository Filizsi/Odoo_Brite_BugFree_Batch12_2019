@Events_Categories
Feature: Create an event in Event Categories
  As user, I want to be able to pick and create an Event

  Scenario: User is able to create an event in Event Categories

    Given user is on the login page
    Then  user logs in as events manager
    Then  user navigates to "Events" module
    Then  user clicks on "Event Categories"
    Then  user clicks on "seminar"
    Then  user clicks on create button
    Then  user creates an event called "Seminar" under Event Category
    Then  user clicks on "Automatically Send Emails" under "Communication"
    Then  user clicks "Automatically Confirm Registrations" under "Attendees"
    And   user clicks on save button
    And   user verifies that event is created




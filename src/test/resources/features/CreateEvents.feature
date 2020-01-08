@create_event
Feature: Events manager creates an event
  Scenario: User able to create an events under events module

    Scenario: event create
      Given user is on the login page
      Then user logs in as events manager
      Then user navigates to "Events" module
      Then user clicks on create button
      Then user enters "Bugs 12" in events name box
      Then user enters organizer name
      Then user picks location
      Then user picks who is responsible
      And  user enters start date "4-12-2019"
      Then user enters the end date "5-15-2019"
      And  user clicks the confirm event button
      And user verifies that event is created
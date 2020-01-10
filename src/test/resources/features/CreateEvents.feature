@create_event
Feature: Events manager creates an event
  Background:
    Given user is on the login page
    Then user logs in as events manager
    Then user navigates to "Events" module

  Scenario: User able to create an events under events module

      Then user clicks on create button
      And  user enters events name as"Batch 12"
      Then user click on Organize button then Create and Edit button
      Then user enters the organizer name as "Bug Free"then clicks save button
      Then user clicks on  location button then Create and Edit button
      Then user enters the location name"Virginia" then click save button
      Then user picks who is responsible
      And  user enters start date "1-08-2020"
      Then user enters the end date "1-15-2020"
      And  user clicks the confirm event button
      And user verifies that event is created
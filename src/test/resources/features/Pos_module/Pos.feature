
@Pos_page
Feature: Pos page testing

   @page_limit_is_16
   Scenario: verify that page limit is 16
     Given user is on the login page
     And user logs in as Pos manager
     Then user navigates to Pos Module
     And verify that page limit is 16

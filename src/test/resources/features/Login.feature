Feature: Login
  As user,i want to able to be login into Odoo_Brite
  under  with username and password
  @pos_manager
  Scenario: Login as a posmanager
    Given user is on the login page
    Then user logs in as posmanager
    And user verifies that "#Inbox" page subtitle is displayed

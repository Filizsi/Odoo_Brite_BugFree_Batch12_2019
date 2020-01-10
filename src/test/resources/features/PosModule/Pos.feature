@Pos_page
Feature:Pos page testing

  #Viktoria
  @page_limit_is_32
  Scenario: verify that page limit is 32
    Given user is on the login page
    And user logs in as Pos manager
    Then user navigates to Pos Module
    And verify that page limit is "32"

    #Viktoria
    Scenario: verify that message is displayed
      Given user is on the login page
      And user logs in as Pos manager
      Then user navigates to Pos Module
      And user types "iphone" in search box
      And user verifies that  message is displayed

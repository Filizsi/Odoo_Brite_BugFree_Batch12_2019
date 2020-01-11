@create_product
  Feature: Create product

  User should be able to create new product on Purchases module, Products submodule

  Scenario: Create new product
    Given user is on the login page
    And user logs in as posmanager
    Then user navigates to Purchases then to Products
    And user clicks on Create button
    Then user adds new product information
      |Product Name|Product Type| Sales Price|
      |Laptop      |Consumable  | 600        |
    And verify that product created




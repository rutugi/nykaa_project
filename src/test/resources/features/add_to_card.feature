Feature: Add to card product feature
  @smoke
  Scenario: Verify that the user can able to search a product
   Given the user navigates to the home page
   When the user enter the product name
   Then the product results should be displayed

  Scenario: User able to click makeup
    Given the user navigates to home page
    When user enter the makeup page
    Then the result should be display


  Scenario:User enter the invalid item name
    Given user navigate to nykaa website
    When the user search for invalid item name
    Then  Qqqq is displayed


    Scenario:
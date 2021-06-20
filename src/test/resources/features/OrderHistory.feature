Feature: Order Confirmation

  @Regression
  Scenario Outline: Order T-Shirt and verify detail in Order History 
    Given I launch the application <url>
    And I login to the application using <userName> and <password>
    And I clear the cart if present
    When I navigate to T-Shirts menu and add a product to basket
    And I validate the summary and confirm order
    Then I navigate to order History page and validate the details
    And I signout from the application
    Examples:
      |url				   |userName         |password   |
      |StoreFrontUrl |arkzum@gmail.com |Test1234   |

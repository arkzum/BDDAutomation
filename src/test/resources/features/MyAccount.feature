Feature: My Account

  @Smoke @Regression
  Scenario Outline: Update Personal Information (First Name) in my account
    Given I launch the application <url>
    And I login to the application using <userName> and <password>
    When I navigate to personal information page
    And I update FirstName <FirstName> in personal information page using password <password> and submit
    Then I navigate to personal information page
    And I validate the updated first name
    Examples:
      |url		       |userName         |password |FirstName |
      |StoreFrontUrl |arkzum@gmail.com |Test1234 |Arun      |

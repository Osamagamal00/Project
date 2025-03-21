Feature: E2EFlow

  Scenario: validate that user register
    Given User Navigate to register page
    When  User Fill Data
    Then User register sucssefully

  Scenario: validate that user login
      Given User navigate to login page
      When  User enter user name and password
      Then User validate that login sucssefully

  Scenario: user do flow to buy product
    Given User Navigate to register page
    When User Fill Data
    And User register sucssefully
    And User go to home and buy product
    Then User validate Purchase process succfully and log out
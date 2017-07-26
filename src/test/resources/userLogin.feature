Feature: Login Action
Description: This feature will test a LogIn and LogOut functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "test_user1" and "Test@123"
    Then Message displayed Login Successfully

  Scenario Outline: Successful Login for multiple Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
  Examples:
    | username  | password |
    | user1     | Test@123 |
    | user2     | Test@321 |

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed Logout Successfully

  
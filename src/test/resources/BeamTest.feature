@beam_test
Feature: Beam App Login Functionality Test
  As a beam user
  I want to login to system

  Background: Open the Login Page
    Given I am on the sign in page
    And I click on login with email button

  Scenario: Beam App Login
    Given I am on the login page
    When I type my email as "test@test.test"
    And I type my password as "1538"
    Then I am on the my account page







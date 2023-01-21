Feature: To Verify Login Functionality


  Background:
    Given user open website
    And verify user is on login page


#    grouping tests
  @Smoke   @Chirag
  Scenario: Verify User Can Login Into Application
    When user enter valid credentials
    Then verify home page is displayed

#you can reuse steps as many times as you want

  @Regression   @Paulina
  Scenario: Verify user cannot login with invalid credentials
    When user enter invalid credentials
    Then verify invalid login error message is displayed

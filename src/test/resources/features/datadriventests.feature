Feature: Demonstration of Cucumber Data Driven Capabilities
  Sample Demo For Data Driven Tests

  Background:
    Given I am a registered user of "http://vistacommerce-qa.rf.gd/"

  Scenario: To validate login with Valid credentials
    And I click on "Sign in" link
    When I enter valid "abc@def.com" and "demopass" and click on login

  Scenario Outline: To validate login with Valid and Invalid credential combinations
    And I click on "Sign in" link
    When I enter valid "<username>" and "<password>" and click on login

    Examples:
      | username      | password  |
      | demo@t.com    | demopass  |
      | abc@gmail.com | demopass2 |
      | def@pqr.com   | demopass3 |
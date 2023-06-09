Feature: Setup_Services

  Background:Pref- User Successfully logs in to the Provider Portal

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_RRP_SCRIPT_FEE_SETTING
  Scenario Template: S1- RRP Script Instructions Settings - Enable.
    Given As a Provider I am on HomePage and navigate to Setup services in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click edit button
    When I disable the RRP Script Instructions Settings "<Details>"
    Then I should verify disabled RRP Script Instructions Settings "<Details>"
    And  I Navigate to Provider Home Page
    Examples:
      | System_Menu      | Details                   |
      | Secure Messaging | &RRP_SCRIPT_INSTRUCTIONS& |
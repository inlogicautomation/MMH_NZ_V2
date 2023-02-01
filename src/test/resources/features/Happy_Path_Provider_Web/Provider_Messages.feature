Feature: Provider_Messages

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_MESSAGES @PROVIDER_HAPPY_PATH
  Scenario Template: S1- Patient Sending Message

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Compose Details>" to compose an email
    When I Click Send Message Button
    Then I should see message sent Successfully popup
    And I navigate to Patient Sent items and verify the Sent "<Compose Details>"

    Examples:
      | Compose Details   |
      | &COMPOSE_MESSAGE& |

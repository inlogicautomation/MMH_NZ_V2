Feature: Phone Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal



  @WEB @PROVIDER_HAPPY_PATH @PHONE_APPOINTMENTS_MESSAGE
  Scenario Template:S1-As a User I have to enable Patient Portal(Web) Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page

    Examples:
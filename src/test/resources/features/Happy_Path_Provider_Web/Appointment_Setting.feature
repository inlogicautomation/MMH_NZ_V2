Feature: Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S1-Provider Enable Rule A verify Patient Book Visit Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the visit appointment details "<Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Appointment_Details>" and Verify without payment

    Examples:
      | Appointment_Details    |
      | BOOK_VISIT_APPOINTMENT |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S2-Provider Enable Rule A verify Patient Book Phone Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the visit appointment details "<Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Appointment_Details>" and Verify without payment

    Examples:
      | Appointment_Details    |
      | BOOK_VISIT_APPOINTMENT |
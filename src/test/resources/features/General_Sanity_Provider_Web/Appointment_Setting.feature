Feature: Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S0-Provider Enable Rule A verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location         | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button                      | Appointment_After_Cancel              |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &AUTO_PRA_LOC2_APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |





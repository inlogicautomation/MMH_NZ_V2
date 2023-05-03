Feature: My Appointment Page

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT_PAGE
  Scenario Template:S1-Provider My Appointments

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the search "<My_Appointment_Details>"



    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login | Password           | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_EMAIL&    | &PATIENT_PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |
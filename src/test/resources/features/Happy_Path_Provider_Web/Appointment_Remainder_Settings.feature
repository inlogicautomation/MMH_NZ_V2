Feature: Appointment Reminder Setting Page

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S1- Set First Appointment Remainder without Remainder Time

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First Appointment Remainder checkbox and hours "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S2- Set First Appointment Remainder with Remainder Time

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First Appointment Remainder checkbox and Days "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S3- Set First & Second Appointment Remainder without Remainder Time

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First and Second Appointment Remainder checkbox and hours "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S4- Set First & Second Appointment Remainder with Remainder Time

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First and Second Appointment Remainder checkbox and Days "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S5- Set First Appointment Remainder and set Remainder Time then I Enable Skip weekends

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First Appointment Remainder Enable Skip weekends "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |





  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REMINDER_SETTING
  Scenario Template:S6- Set First Appointment Remainder and set Remainder Time then I Disable Skip weekends

    Given As a Provider I am on HomePage and navigate to Appointment Reminder Setting page
    And I click on the edit button then i Enable First Appointment Remainder Disable Skip weekends "<Appointment_Reminder_Details>"
    When I click the save Button then verify the Success message Popup should be displayed
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Visit Appointments Details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    Examples:
      | Appointment_Reminder_Details | Appointment_Details      | Details_For_Appointment     | Future_Date   | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | &APPOINTMENT_REMINDER_DATA&  | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |
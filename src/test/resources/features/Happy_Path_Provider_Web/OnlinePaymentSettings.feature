Feature: Appointment Message

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @ONLINE_PAYMENTS_SETTING
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |


  @WEB @PROVIDER_HAPPY_PATH @ONLINE_PAYMENTS_SETTING
  Scenario Template:S1-Provider Enable Online payment for Appointments

    Given As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for Appointments by clicking Yes button and click the save button "<Location>"
    And I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    Examples:
      | Location         | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | Automation1_Loc1 | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |

  @WEB @PROVIDER_HAPPY_PATH @ONLINE_PAYMENTS_SETTING
  Scenario Template:S2-Provider Disable Online payment for Appointments

    Given As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for Appointments by clicking No button and click the save button "<Location>"
    And I navigate to Appointment setting page verify the Payonline or Payhealthcentre options Not displayed
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    Examples:
      | Location         | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        |
      | Automation1_Loc1 | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |

  @WEB @PROVIDER_HAPPY_PATH @ONLINE_PAYMENTS_SETTING
  Scenario Template:S3-Provider Disable Online payment for RRP

    Given As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for RRP by clicking No button and click the save button "<Location>"
    And I navigate to RRP setting page verify the only show Payhealthcentre options displayed
    When As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    And  I select the Medication details"<Medication Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    Then I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | Location         | Medication Details                            | Verification Medication Details                         |
      | Automation1_Loc1 | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |

  @WEB @PROVIDER_HAPPY_PATH @ONLINE_PAYMENTS_SETTING
  Scenario Template:S4-Provider Enable Online payment for RRP

    Given As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for RRP by clicking Yes button and click the save button "<Location>"
    And I navigate to RRP setting page verify the Payonline or Payhealthcentre options displayed
    When As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    And  I select the Medication details"<Medication Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    Then I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | Location         | Medication Details                            | Verification Medication Details                         |
      | Automation1_Loc1 | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |




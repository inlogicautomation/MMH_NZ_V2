Feature: Phone Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @PHONE_APPOINTMENTS_SETTING
  Scenario Template:S1-Provider Enable Phone Appointment Settings - Rule 1 and verify Patient side

    Given As a Provider I am on HomePage and navigate to Phone Appointment Setting page
    And I click edit button select the Phone Appointment Rule MMHPA "<Phone_Appointment_setting_data>"
    When I select the phone call initiated by Practice radio button and click the save button "<Phone_Appointment_setting_data>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I enter the phone appointment details "<Phone_Appointments_Data>" and verify Appointment Session Name as MMHPA will be displayed Phone Appointments

    Examples:
      | Phone_Appointment_setting_data      | Phone_Appointments_Data  |
      | &PHONE_APPOINTMENT_SETTING_DETAILS& | &BOOK_PHONE_APPOINTMENT& |


  @WEB @PROVIDER_HAPPY_PATH @PHONE_APPOINTMENTS_SETTING
  Scenario Template:S2-Provider Enable Phone Appointment Settings - Rule 2 and verify Patient side

    Given As a Provider I am on HomePage and navigate to Phone Appointment Setting page
    And I click edit button select the Phone Appointment Rule BLANK"<Phone_Appointment_setting_data>"
    When I select the phone call initiated by Practice radio button and click the save button "<Phone_Appointment_setting_data>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I enter the phone appointment details "<Phone_Appointments_Data>" and verify Appointment Session Name as BLANK will be displayed Phone Appointments

    Examples:
      | Phone_Appointment_setting_data      | Phone_Appointments_Data  |
      | &PHONE_APPOINTMENT_SETTING_DETAILS& | &BOOK_PHONE_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @PHONE_APPOINTMENTS_SETTING
  Scenario Template:S3-Provider Enable Phone Appointment Settings - Rule 1 and verify Patient side

    Given As a Provider I am on HomePage and navigate to Phone Appointment Setting page
    And I click edit button select the Phone Appointment Rule MMHPA "<Phone_Appointment_setting_data>"
    When I select the phone call initiated by Patient radio button and click the save button "<Phone_Appointment_setting_data>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I enter the phone appointment details "<Phone_Appointments_Data>" and verify Appointment Session Name as MMHPA will be displayed Phone Appointments

    Examples:
      | Phone_Appointment_setting_data      | Phone_Appointments_Data  |
      | &PHONE_APPOINTMENT_SETTING_DETAILS& | &BOOK_PHONE_APPOINTMENT& |
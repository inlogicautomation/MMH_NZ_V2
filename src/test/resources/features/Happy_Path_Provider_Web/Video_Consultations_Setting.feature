Feature: Video Consultations Setting Page

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S1-Provider Enable Video Consultations yes Button Check Video appointment slots are displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking Yes button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are displayed in All tab

    Examples:
      | Location         | Appointment_Details      |
      | Automation1_Loc1 | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S2-Provider Enable Video Consultations No Button Check Video appointment slots are Not displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking No button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are Not displayed in All tab

    Examples:
      | Location         | Appointment_Details      |
      | Automation1_Loc1 | &BOOK_VIDEO_APPOINTMENT& |
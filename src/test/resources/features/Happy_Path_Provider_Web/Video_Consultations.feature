Feature: Video Consultations

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS
  Scenario Template:S1-Provider Video Consultations & Provider Search Booked Appointments

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the video appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>" "<Appointment_Details>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And As a Provider I am on HomePage and navigate to Video Consultations page
    Then I should see Video consultations details in My appointments grid based on the select provider name "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login | Password   | My_Appointment_Details   |
      | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& | &EMAIL&            | &PASSWORD& | &MY_APPOINTMENT_DETAILS& |
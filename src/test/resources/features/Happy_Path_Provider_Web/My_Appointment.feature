Feature: My Appointment Page

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template:S1-Provider My Appointments & Provider Search Booked Appointments

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the select provider name "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |


  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template:S2-Provider My Appointments & Provider Enter Patient Name Booked Appointments

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the search "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template:S3-Provider Search for any specific patient

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the search and Enter Patient Name "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |


  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |


  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template:S4-Provider View clear Search

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the visit appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the View clear search "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @MY_APPOINTMENT
  Scenario Template:S5-Provider Join for Video Consultation

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    And I enter the video appointment details "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>" "<Appointment_Details>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page verify the appointment status Approved "<Appointment_Cancel_Button>"
    And As a Provider I am on HomePage and navigate to My Appointment page
    Then I should see View Appointments details in My appointments grid based on the View clear search "<My_Appointment_Details>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button        | My_Appointment_Details   |
      | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &MY_APPOINTMENT_DETAILS& |
Feature: Mobile_Appointments_Scenarios

  @MOBILE @Mobile_Appointment @Mobile_Appointment_Visit @Mobile_Appointment_Phone
  Scenario Outline: S1 - User login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username                | Password   |
      | harryharry@mmh-demo.com | Manage@123 |

  @MOBILE @Mobile_Appointment_Visit
  Scenario Outline: S2 - Patient Booking Appointment - Visit Appointment [Mobile]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Visit" "<Appointment Details>"
    And I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    When I send Appointment Request through pay at health centre
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Appointment Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | VISIT       | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& |


  @MOBILE @Mobile_Appointment_Phone
  Scenario Outline: S3 - Patient Booking Appointment - Phone Appointment & Pay at Health centre [Mobile]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Phone" "<Appointment Details>"
    And I enter the "<Contact Number>" in Confirm Appointment
    And I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    When I send Appointment Request through pay at health centre
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Appointment Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Contact Number |
      | PHONE       | &BOOK_PHONE_APPOINTMENT& | &PHONE_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PHONE_APPOINTMENT_SUMMARY& | 784512369      |
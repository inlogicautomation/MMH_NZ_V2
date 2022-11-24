    Feature: Mobile_Appointments_Scenarios

  @MOBILE @RELAUNCH @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S1 - User login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username | Password   |
      | &EMAIL&  | &PASSWORD& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S2 - Patient Send the Appointment Request [Mobile-Visit]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    When I enter the "Visit" "<Appointment Details>"
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    And I Send Appointment Request

    Examples:
      | Appointment Details                         | Details_For_Appointment                        | Future_Date                     |
      | &BOOK_VISIT_APPOINTMENT_USING_CARD_PAYMENT& | &VISIT_APPOINTMENT_DETAILS_USING_CARD_PAYMENT& | &FUTURE_DATE_PAYMENT_FOR_VISIT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S2 - Patient Booking Appointment - Visit Appointment Using Card Payment with $X amount [Mobile]

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see payment "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Card Details   | Future_Date                     | Appointment_Summary                            |
      | VISIT       | &CARD_DETAILS& | &FUTURE_DATE_PAYMENT_FOR_VISIT& | &VISIT_APPOINTMENT_SUMMARY_USING_CARD_PAYMENT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S3 - Patient Send the Appointment Request [Mobile-Phone]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Phone" "<Appointment Details>"
    When I enter the "<Contact Number>" in Confirm Appointment
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    And I Send Appointment Request

    Examples:
      | Appointment Details                         | Details_For_Appointment                        | Future_Date                     | Contact Number   |
      | &BOOK_PHONE_APPOINTMENT_USING_CARD_PAYMENT& | &PHONE_APPOINTMENT_DETAILS_USING_CARD_PAYMENT& | &FUTURE_DATE_PAYMENT_FOR_PHONE& | &CONTACT_NUMBER& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S3 - Patient Booking Appointment - Phone Appointment Using Card Payment with $X amount [Mobile]

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see payment "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Card Details   | Future_Date                     | Appointment_Summary                            |
      | PHONE       | &CARD_DETAILS& | &FUTURE_DATE_PAYMENT_FOR_PHONE& | &PHONE_APPOINTMENT_SUMMARY_USING_CARD_PAYMENT& |


  @MOBILE @HAPPY_PATH_MOBILE
  Scenario Outline: S4 - Patient Send the Appointment Request [Mobile-Video]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    When I enter the "Video" "<Appointment Details>"
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    And I Send Appointment Request

    Examples:
      | Appointment Details                         | Details_For_Appointment                        | Future_Date                     |
      | &BOOK_VIDEO_APPOINTMENT_USING_CARD_PAYMENT& | &VIDEO_APPOINTMENT_DETAILS_USING_CARD_PAYMENT& | &FUTURE_DATE_PAYMENT_FOR_VIDEO& |


  @MOBILE @HAPPY_PATH_MOBILE
  Scenario Outline: S4 - Patient Booking Appointment - Video Appointment Using Card Payment with $X amount [Mobile]

    Given I am on Confirm Appointment screen
    And I tap ok button on popup
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see payment "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Card Details   | Future_Date                     | Appointment_Summary                            |
      | VIDEO       | &CARD_DETAILS& | &FUTURE_DATE_PAYMENT_FOR_VIDEO& | &VIDEO_APPOINTMENT_SUMMARY_USING_CARD_PAYMENT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S5 - Patient Booking Appointment - Visit Appointment & Pay at Health centre [Mobile]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Visit" "<Appointment Details>"
    And I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    When I Send Appointment Request through pay at health centre
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Appointment Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | VISIT       | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE @CHECK1
  Scenario Outline: S6 - Patient Booking Appointment - Phone Appointment & Pay at Health centre [Mobile]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Phone" "<Appointment Details>"
    And I enter the "<Contact Number>" in Confirm Appointment
    And I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    When I Send Appointment Request through pay at health centre
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Appointment Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Contact Number   |
      | PHONE       | &BOOK_PHONE_APPOINTMENT& | &PHONE_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PHONE_APPOINTMENT_SUMMARY& | &CONTACT_NUMBER& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S7 - Patient Booking Appointment - Video Appointment & Pay at Health centre [Mobile]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Video" "<Appointment Details>"
    And I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"
    When I Send Appointment Request through pay at health centre
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Appointment Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | VIDEO       | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S8 - Patient verify the Confirm Appointment details [Mobile-Visit]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    When I enter the "Visit" "<Appointment Details>"
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"


    Examples:
      | Appointment Details               | Details_For_Appointment              | Future_Date            |
      | &BOOK_VISIT_APPOINTMENT_0_AMOUNT& | &VISIT_APPOINTMENT_DETAILS_0_AMOUNT& | &FUTURE_DATE_0_AMOUNT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S8 - Patient Booking Appointment - Visit Appointment & $0 Amount [Mobile-Visit]

    Given I am on Confirm Appointment screen
    And I Send Appointment Request
    When I verify Appointment Request Submitted Successfully popup message
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Future_Date            | Appointment_Summary                  |
      | VISIT       | &FUTURE_DATE_0_AMOUNT& | &VISIT_APPOINTMENT_SUMMARY_0_AMOUNT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S9 - Patient verify the Confirm Appointment details [Mobile-Phone]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    And I enter the "Phone" "<Appointment Details>"
    When I enter the "<Contact Number>" in Confirm Appointment
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"


    Examples:
      | Appointment Details               | Details_For_Appointment              | Future_Date            | Contact Number   |
      | &BOOK_PHONE_APPOINTMENT_0_AMOUNT& | &PHONE_APPOINTMENT_DETAILS_0_AMOUNT& | &FUTURE_DATE_0_AMOUNT& | &CONTACT_NUMBER& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S9 - Patient Booking Appointment - Phone Appointment & $0 Amount [Mobile-Phone]

    Given I am on Confirm Appointment screen
    And I Send Appointment Request
    When I verify Appointment Request Submitted Successfully popup message
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Future_Date            | Appointment_Summary                  |
      | PHONE       | &FUTURE_DATE_0_AMOUNT& | &PHONE_APPOINTMENT_SUMMARY_0_AMOUNT& |

  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S10 - Patient verify the Confirm Appointment details [Mobile-Video]

    Given I am on MMH Home screen
    And I tap on "Book Appointment" option in home screen
    And I tap Book Appointment under Future tab
    When I enter the "Video" "<Appointment Details>"
    Then I should see Confirm Appointment details "<Details_For_Appointment>" "<Future_Date>"


    Examples:
      | Appointment Details               | Details_For_Appointment              | Future_Date            |
      | &BOOK_VIDEO_APPOINTMENT_0_AMOUNT& | &VIDEO_APPOINTMENT_DETAILS_0_AMOUNT& | &FUTURE_DATE_0_AMOUNT& |


  @MOBILE @Mobile_Appointment @HAPPY_PATH_MOBILE
  Scenario Outline: S10 - Patient Booking Appointment - Video Appointment & $0 Amount [Mobile-Video]

    Given I am on Confirm Appointment screen
    And I Send Appointment Request
    When I verify Appointment Request Submitted Successfully popup message
    Then I should see booked "<Appointment>" displayed under Service Tab "<Appointment_Summary>" "<Future_Date>"

    Examples:
      | Appointment | Future_Date            | Appointment_Summary                  |
      | VIDEO       | &FUTURE_DATE_0_AMOUNT& | &VIDEO_APPOINTMENT_SUMMARY_0_AMOUNT& |
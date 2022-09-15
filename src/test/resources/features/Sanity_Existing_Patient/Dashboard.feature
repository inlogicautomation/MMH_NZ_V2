Feature: Dashboard


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address         | Password                 |
      | &EMAIL FOR DASHBOARD& | &PASSWORD FOR DASHBOARD& |


#  9	Dashboard	Login as Existing patient & click on Dashboard
#  11	Dashboard	Navigate to book appointment page by clicking Book appointment Option(text) in Upcoming appointments card in dash board
#  20	Dashboard	Navigate to My Health Indicators page by clicking View all Indicators option (text) in My Health Indicators card
#  22	Dashboard	Navigate to Health Summary page by clicking View Health Summary option (text)in Health Records card


  @WEB @DASHBOARD @SANITY_PATH
  Scenario: Dashboard

    Given As a Existing user I am on HomePage and I click Dashboard
    And Navigate to book appointment page in Upcoming appointments card from dashboard
    And Navigate to Inbox bar by clicking View Message from text dashboard
    And Navigate to Request Medication page by Clicking on New Repeat Prescription text from dashboard
    And Navigate to My Health Indicators page by clicking View all Indicators text from dashboard
    And Navigate to Health Summary page by clicking View Health Summary text from dashboard



    #  15	Dashboard	View patient connected Health Centre list in My Health Centre card
#  16	Dashboard	Navigate to Connect health centre page by clicking Connect Health Centre option(text) in My Health Centres card

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_HEALTH-CENTRE
  Scenario Outline: View patient connected Health Centre

    Given As a Existing user I am on HomePage and I click Dashboard
    And View patient connected Health Centre list in My Health Centre card "<Details>"
    And Navigate to Connect health centre page by clicking Connect Health Centre text from dashboard
    And I log out from Patient Portal

    Examples:
      | Details                  |
      | &HEALTH_CENTRE_LOCATION& |


#    =========================================================================================


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_RRP
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_RRP
  Scenario Outline: S2- Patient to collect the Prescription

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"

    Examples:
      | Medication Details                            | Verification Medication Details                         | More info details                                                 |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &MORE INFO VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_RRP
  Scenario Outline: S3- Patient Collect the medication by Sent Script by Post

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status Sent Script by Post"<Verification Medication Details>"
    Examples:
      | Medication Details             | Verification Medication Details             | More info details                                     |
      | &DATA FOR SENT SCRIPT BY POST& | &VERIFICATION DATA FOR SENT SCRIPT BY POST& | &MORE INFO VERIFICATION DATA FOR SENT SCRIPT BY POST& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_RRP
  Scenario Outline: S4- Patient Collect the medication by Sent Script by Pharmacy

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details for Sent Script by Pharmacy "<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status for Sent Script by Pharmacy"<Verification Medication Details>"
    Examples:
      | Medication Details                                 | Verification Medication Details                 | More info details                                            |
      | &DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& | &VERIFICATION DATA FOR SENT SCRIPT TO PHARMACY& | &MORE INFO DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& |



#  17	Dashboard	View latest 3 My Repeat Prescription in Repeat Prescription card
#  18	Dashboard	Navigate to Request Medication page by Clicking on New Repeat Prescription option(Text) in Repeat Prescription card
#  19	Dashboard	Navigate to view history page and View Specified Requested RRP Details by clicking any Request From Repeat Prescription card

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_RRP
  Scenario: View My Repeat Prescription in Repeat Prescription card

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three My Repeat Prescription in Repeat Prescription card
      | &VERIFY_DASHBOARD_RRP& |
    And Navigate to view history page and View Specified Requested RRP Details in Dashboard
      | &VERIFY_DASHBOARD_RRP& |
    And Navigate to Request Medication page by Clicking on New Repeat Prescription text from dashboard
    And I log out from Patient Portal



    #Messages
#================================================================================================



  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_MESSAGES
  Scenario Template: S3- User Successfully logs in to the DEV Portal.
    Given As a user I am on MMH login Page "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_MESSAGES
  Scenario: S3- Preparation for Received Message

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    When I enter the Compose Message Details and I Click the send message and verify success pop up
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_1& |
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_2& |
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_3& |

    Then I navigate to Sent items and verify the Sent Message Details
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_1& |
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_2& |
      | &SENT_MESSAGE_DETAILS_FOR_DASHBOARD_3& |
    And I log out from Doctor Portal


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_MESSAGES
  Scenario Template: S1- User Successfully logs in to the V2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address       | Password               |
      | &EMAIL FOR MESSAGE& | &PASSWORD FOR MESSAGE& |


#  12	Dashboard	View latest 3 New messages received in new message card
#  13	Dashboard	Navigate to Inbox Side bar by clicking View Message Option(text) in New Messages card in dash board
#  14	Dashboard	Check Unread message count in New Messages Card


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_MESSAGES
  Scenario: View latest three New messages received in new message card

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three New messages received in new message card
      | &VERIFY_DASHBOARD_MESSAGE_1& |
      | &VERIFY_DASHBOARD_MESSAGE_2& |
      | &VERIFY_DASHBOARD_MESSAGE_3& |
    And Check Unread message count in New Messages Card
    And Navigate to Inbox bar by clicking View Message from text dashboard


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_HEALTH-RECORDS
  Scenario: View patient Health Records

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three patient Health Records in Health records card
      | &VERIFY_DASHBOARD_HEALTH_RECORD_1& |
      | &VERIFY_DASHBOARD_HEALTH_RECORD_1& |
      | &VERIFY_DASHBOARD_HEALTH_RECORD_1& |
    And Navigate to View Specific health Record Details in Dashboard
      | &VERIFY_DASHBOARD_HEALTH_RECORD_1& |
    And Navigate to Health Summary page by clicking View Health Summary text from dashboard




#    Note: {
#    Preparation for the patient received message
#    These test Case Covered The Scenario NO: S3
#  }

  @WEB @DASHBOARD12 @SANITY_PATH12
  Scenario: S2-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder in My entries Alcohol Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button
    When I click on add new Button & Enter the Medicine Details
      | &ALCOHOL_MY_ENTRIES_DATA&        |
      | &BLOOD_SUGAR_MY_ENTRIES_DATA&    |
      | &BLOOD_PRESSURE_MY_ENTRIES_DATA& |
    Then I should see all My Entries Medicine details in the grid view
      | &ALCOHOL_MY_ENTRIES_DATA&        |
      | &BLOOD_SUGAR_MY_ENTRIES_DATA&    |
      | &BLOOD_PRESSURE_MY_ENTRIES_DATA& |
    And I navigate to Dashboard
    And I should see last three Entries of Medicine details in the dashboard
      | &BLOOD_DASHBOARD_DATA&       |
      | &BLOOD_SUGAR_DASHBOARD_DATA& |
      | &ALCOHOL_DASHBOARD_DATA&     |





#  10	Dashboard	View latest 3 upcoming appointments booked list in appointments card
#  21	Dashboard	View latest 3 updated Health records in Health records card
#  23	Dashboard	View Specific health Record details

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address            | Password                    |
      | &EMAIL_FOR_APPOINTMENTS& | &PASSWORD_FOR_APPOINTMENTS& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I canceling all the available appointments

    Examples:
      | Appointment         |
      | Future Appointments |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S1 Patient Booking Appointment - Visit Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the visit appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And I logout from tha application

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
      | Book Appointment | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address            | Password                    |
      | &EMAIL_FOR_APPOINTMENTS& | &PASSWORD_FOR_APPOINTMENTS& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S6 - Patient Cancel Appointment

    And I navigate to the "<Appointment>" page
    And I click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I enter reason to cancel appointment
    When I click cancel your appointment button
    Then I should see Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Appointment         | Appointment_Cancel_Button        | Appointment_After_Cancel              |
      | Future Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S2 - Patient Booking Appointment - Video Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the video appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And I logout from tha application

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
      | Book Appointment | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &VIDEO_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: Changing machines timezone
    Given I change Windows "<TimeZone>"
    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address            | Password                    |
      | &EMAIL_FOR_APPOINTMENTS& | &PASSWORD_FOR_APPOINTMENTS& |

  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario Template: S3 - Patient Booking Appointment - Visit in video slot Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the video appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details               | Details_For_Appointment              | Appointment_Summary                  | Future_Date   |
      | Book Appointment | &BOOK_VISIT_IN_VIDEO_APPOINTMENT& | &VISIT_IN_VIDEO_APPOINTMENT_DETAILS& | &VISIT_IN_VIDEO_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @DASHBOARD @SANITY_PATH @DASHBOARD_APPOINTMENTS
  Scenario: View patient Appointments Records

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three patient Appointments in upcoming appointments card
      | &VERIFY_DASHBOARD_APPOINTMENTS_1& |
      | &VERIFY_DASHBOARD_APPOINTMENTS_2& |
      | &VERIFY_DASHBOARD_APPOINTMENTS_3& |
    And Navigate to book appointment page in Upcoming appointments card from dashboard

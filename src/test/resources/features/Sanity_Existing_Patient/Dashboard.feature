Feature: Dashboard


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template: pref- User Successfully logs in to the beta v2 Portal.

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
  Scenario:S1-Dashboard

    Given As a Existing user I am on HomePage and I click Dashboard
    And Navigate to book appointment page in Upcoming appointments card from dashboard
    When Navigate to Inbox bar by clicking View Message from text dashboard
    And Navigate to Request Medication page by Clicking on New Repeat Prescription text from dashboard
    Then Navigate to My Health Indicators page by clicking View all Indicators text from dashboard
    And Navigate to Health Summary page by clicking View Health Summary text from dashboard



    #  15	Dashboard	View patient connected Health Centre list in My Health Centre card
#  16	Dashboard	Navigate to Connect health centre page by clicking Connect Health Centre option(text) in My Health Centres card

  @WEB @DASHBOARD12 @SANITY_PATH
  Scenario Outline:S2-View patient connected Health Centre

    Given As a Existing user I am on HomePage and I click Dashboard
    And View patient connected Health Centre list in My Health Centre card "<Details>"
    And Navigate to Connect health centre page by clicking Connect Health Centre text from dashboard
    And I log out from Patient Portal

    Examples:
      | Details                  |
      | &HEALTH_CENTRE_LOCATION& |


#    =========================================================================================


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template:S3-User Successfully logs in to the MMH Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |

  @WEB @DASHBOARD @SANITY_PATH
  Scenario Outline: S4- Patient to collect the Prescription

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"

    Examples:
      | Medication Details                            | Verification Medication Details                         | More info details                                                 |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &MORE INFO VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Outline: S5- Patient Collect the medication by Sent Script by Post

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status Sent Script by Post"<Verification Medication Details>"
    Examples:
      | Medication Details             | Verification Medication Details             | More info details                                     |
      | &DATA FOR SENT SCRIPT BY POST& | &VERIFICATION DATA FOR SENT SCRIPT BY POST& | &MORE INFO VERIFICATION DATA FOR SENT SCRIPT BY POST& |

  @WEB @DASHBOARD @SANITY_PATH
  Scenario Outline: S6- Patient Collect the medication by Sent Script by Pharmacy

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

  @WEB @DASHBOARD @SANITY_PATH
  Scenario:S7-View My Repeat Prescription in Repeat Prescription card

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three My Repeat Prescription in Repeat Prescription card
      | &VERIFY_DASHBOARD_RRP& |
    And Navigate to view history page and View Specified Requested RRP Details in Dashboard
      | &VERIFY_DASHBOARD_RRP& |
    And Navigate to Request Medication page by Clicking on New Repeat Prescription text from dashboard
    And I log out from Patient Portal



    #Messages
#================================================================================================



  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template:pref- User Successfully logs in to the DEV Portal.
    Given As a user I am on MMH login Page "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |

  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S8- Preparation for Received Message

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


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template:pref- User Successfully logs in to the V2 Portal.

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


  @WEB @DASHBOARD @SANITY_PATH
  Scenario:S9-View patient connected Health Centre

    Given As a Existing user I am on HomePage and I click Dashboard
    And View latest three New messages received in new message card
      | &VERIFY_DASHBOARD_MESSAGE_1& |
      | &VERIFY_DASHBOARD_MESSAGE_2& |
      | &VERIFY_DASHBOARD_MESSAGE_3& |
    And Check Unread message count in New Messages Card
    And Navigate to Inbox bar by clicking View Message from text dashboard


  @WEB @DASHBOARD @SANITY_PATH
  Scenario:S10-View patient Health Records

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

  @WEB @DASHBOARD12 @SANITY_PATH
  Scenario: S11-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder in My entries Alcohol Details

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


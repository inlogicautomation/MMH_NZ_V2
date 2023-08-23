Feature: Messages_Scenarios

  @WEB @Mobile_Message @HAPPY_PATH_MOBILE1
  Scenario Template: Pre-Req - Preparation for Group Message, Login as a Provider user

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address  | Password          |
      | &V1 URL&  | &DOCTOR_EMAIL& | &DOCTOR_PASSWORD& |


  @WEB @Mobile_Message1 @HAPPY_PATH_MOBILE1
  Scenario Template: Pre-Req - Preparation for Group Message, Sending a Group of E-Mail's to the Patient from provider login

    Given As a user I am on Doctor portal homepage and Navigate to GroupMessage
    When I enter the Compose GroupMessage "<Message Details>"
    Then I send the group message to the patient users
    And I log out from Doctor Portal

    Examples:
      | Message Details              |
      | &SENT_GROUP_MESSAGE_DETAILS& |


  @MOBILE @RELAUNCH @Mobile_Message @HAPPY_PATH_MOBILE1
  Scenario Outline: Pre-Req - Doctor login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username       | Password          |
      | &DOCTOR_EMAIL& | &DOCTOR_PASSWORD& |


  @MOBILE @Mobile_Message1 @HAPPY_PATH_MOBILE1
  Scenario Outline: Pre-Req - Doctor Sending Message [Receive and Reply]

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Inbox" tab
    And I select the "<Message Details>" for Doctor Sending Message
    And I enter "<Message>" and attach the file
    When I tap send message button
    Then I should Message sent Successfully info message
    And I should see sent "<Sent Message Details>" under "Sent" tab

    Examples:
      | Message Details               | Message               | Sent Message Details          |
      | &DOCTOR_SEND_MESSAGE_DETAILS& | &DOCTOR_SEND_MESSAGE& | &DOCTOR_SENT_MESSAGE_DETAILS& |
      | &REPLY_SEND_MESSAGE_DETAILS&  | &REPLY_SEND_MESSAGE&  | &REPLY_SENT_MESSAGE_DETAILS&  |


  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE1
  Scenario: Pre-Req - Doctor Sending Message

    Given I am on MMH Home screen
    Then I tap on logout icon in Home screen


  @MOBILE @RELAUNCH @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: Pre-Req - User login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username | Password   |
      | &EMAIL&  | &PASSWORD& |


  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S1 - Patient Sending Message

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Inbox" tab
    And I select the "<Message Details>" for Patient Sending Message
    And I enter "<Message>" and attach the file
    When I tap send message button
    Then I should Message sent Successfully info message
    And I should see sent "<Sent Message Details>" under "Sent" tab

    Examples:
      | Message Details        | Message        | Sent Message Details   |
      | &SEND_MESSAGE_DETAILS& | &SEND_MESSAGE& | &SENT_MESSAGE_DETAILS& |


  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S2 - Patient Sent Message

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Sent" tab
    And I tap on "<Message>" to view the details
    And I should see specific "<Message>" in details
    When I tap Achieve icon for the specific message
    Then I should see sent "<Message>" under "Archive" tab

    Examples:
      | Message                |
      | &SENT_MESSAGE_DETAILS& |


  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S3 - Patient Archive Message

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Archive" tab
    When I tap on "<Message>" to view the details
    Then I should see specific "<Message>" in details

    Examples:
      | Message                |
      | &SENT_MESSAGE_DETAILS& |

  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S5 - Patient Reply Message

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Inbox" tab
    And I should see "<Message>" received by patient
    And I tap on "<Message>" to view the details
    And I should see specific "<Message>" in details
    And I tap Reply and enter "<Reply Message>"
    When I tap send message button
    Then I should Message sent Successfully info message
    And I should see specific "<Reply Message>" navigate to "Sent" message

    Examples:
      | Reply Message   | Message             |
      | &REPLY_MESSAGE& | &PRE_REPLY_MESSAGE& |


  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S6 - Patient Group Message

    Given I am on MMH Home screen
    And I tap on Notification icon in Home screen
    When I tap on "<Group Message>" to view the details
    Then I should see specific "<Group Message>" in details

    Examples:
      | Group Message   |
      | &GROUP_MESSAGE& |

  @MOBILE @Mobile_Message @HAPPY_PATH_MOBILE
  Scenario Outline: S4 - Patient Received Message

    Given I am on MMH Home screen
    And I tap on "Inbox" option in home screen
    And I tap on "Inbox" tab
    And I should see "<Message>" received by patient
    And I tap on "<Message>" to view the details
    And I should see specific "<Message>" in details
    And I tap on on attached file and file gets downloaded
    When I tap Achieve icon for the specific message
    Then I should see specific "<Message>" navigate to "Archive" message

    Examples:
      | Message           |
      | &RECEIVE_MESSAGE& |
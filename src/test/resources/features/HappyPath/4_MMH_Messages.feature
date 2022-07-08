Feature: Messages

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S1- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address       | Password               |
      | &EMAIL FOR MESSAGE& | &PASSWORD FOR MESSAGE& |

#  @WEB @S1 @Mobile @BETA
#  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.
#
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address       | Password               |
#      | &EMAIL FOR MESSAGE& | &PASSWORD FOR MESSAGE& |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S1- Patient Sending Message
    Given As a user I am on HomePage
    And I navigate to the "<Sub_tab>" in Messages page
    And I enter the "<Details>" to compose an email
    When I Click Send Message Button
    Then I should see message sent Successfully popup
    And  I am on "<Tab>" Inbox page
    And I should see all the Messages future Grid View in Send page
      | &SEND_DATA& |
    And I Navigate to Home Page
    Examples:
      | Sub_tab | Details   | Tab    |
      | Compose | &MESSAGE& | Dr Tim |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S2- Patient Save Message as Draft
    Given As a user I am on HomePage
    And I navigate to the "<Sub_tab>" in Messages page
    When I enter the "<Details>" to compose an email
    And I Click Draft Message Button
    Then I should see message Drop Successfully popup
    And  I am on "<Tab>" Draft page
    And I should see all the Messages future Grid View in Draft page
      | &DRAFT_DATA& |
    And I Navigate to Home Page

    Examples:
      | Sub_tab | Details   | Tab    |
      | Compose | &MESSAGE& | Dr Tim |

  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S3- Preparation for Received Message

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |

  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S3- Preparation for Received Message

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Message Details>"
    When I Click the send message and verify success pop up
    Then I navigate to Sent items and verify the Sent Message
    And I log out from Doctor Portal

    Examples:
      | Message Details        |
      | &SENT_MESSAGE_DETAILS& |

  @WEB @MESSAGES @HAPPY_PATH
  Scenario: S3- User verify the Received Message
    Given As a user I am on HomePage and navigate to Inbox
    When I verify received Message in the Patient Inbox
    Then I download the attachment file and delete the downloaded attachment file


  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S4- Preparation for Patient Reply Message
    Given As a user I am on HomePage and navigate to Inbox
    And I click the Received message and I "<Reply>" to the received message
    When I Click the Reply send message
    Then I should verify the sent reply message in Sent items

    Examples:
      | Reply           |
      | &REPLY MESSAGE& |


  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S5- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address       | Password               |
      | &EMAIL FOR MESSAGE& | &PASSWORD FOR MESSAGE& |

  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S5- Patient Group Message

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |


  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S5- Patient Group Message

    Given As a user I am on Doctor portal homepage and Navigate to GroupMessage
    When I enter the Compose GroupMessage "<Message Details>"
    Then I send the group message to the patient users
    And I log out from Doctor Portal

    Examples:
      | Message Details              |
      | &SENT_GROUP_MESSAGE_DETAILS& |

  @WEB @MESSAGES @HAPPY_PATH
  Scenario Template: S5-  Patient Group Message
    Given As a user I am on HomePage and navigate to GroupMessage
    And I verify the provider sent "<Group Message Details>"

    Examples:
      | Group Message Details        |
      | &SENT_GROUP_MESSAGE_DETAILS& |


  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S6- Patient Session Settings

    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Session Setting and select the Customise Session "<Time Out Setting>"
    When I click the Save Button
#    Then Browser session gets timed out Based on selected Customise session Timeout
    Examples:
      | Time Out Setting   |
      | &TIME_OUT_SETTING& |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S7- Patient Alert Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Alert Setting and select the "<Alert Type>"
    Then I click the Save Button
    Examples:
      | Alert Type   |
      | &ALERT TYPE& |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S8- Patient Signature Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Signature Setting and Enter the "<Signature Message>"
    When I click the Save Button
    Then I Should see the Signature Based on "<Signature Message>" entered and signature must get auto populated in Compose mail
    Examples:
      | Signature Message   |
      | &SIGNATURE MESSAGE& |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S10- Patient Automatic Reply Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Automatic Replies Settings and Enable Replies Settings option
    And I Enter the Automatic Replies "<Message>"
    When I click the Save Button
    Then I Should Verify the Automatic Replies "<Message>"
    Examples:
      | Message                   |
      | &AUTOMATIC REPLY MESSAGE& |

  @WEB @HAPPY_PATH @MESSAGES
  Scenario Template: S10- Patient Automatic Reply Settings.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |

  @WEB @HAPPY_PATH @MESSAGES
  Scenario Template: S10- Patient verifies the Automatic Reply Messages.

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Message Details>"
    When I Click the send message and verify success pop up
    Then I Should verify the Patient "<Automatic Reply Message>" in the Inbox
    And I log out from Doctor Portal


    Examples:
      | Message Details             | Automatic Reply Message |
      | &AUTOMATIC_MESSAGE_DETAILS& | &AUTOMATIC REPLY MESSAGE&   |

  @WEB @MESSAGES @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S9- Patient Out Of Office Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Out of Office Settings and Enable Out Of Office Reply option
    And I select the Out of office "<Start Date>" and "<End Date>" and Enter the"<Message>"
    When I click the Save Button
    Then I Should Verify the Out Of Office Reply "<Message>"
    Examples:
      | Start Date   | End Date   | Message          |
      | &START DATE& | &END DATE& | &OUT OF MESSAGE& |

#  @MESSAGES @LAST
#  Scenario Template: S9- Patient Out Of Office Settings
#
#    Given As a user Launch the "<V1 Portal>"
#    And I enter "<Email Address>" and "<Password>"
#    When I click login button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | V1 Portal | Email Address      | Password              |
#      | &V1 URL&  | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |
#
#  @MESSAGES @LAST
#  Scenario Template: S9- Patient verifies the out of office Reply Messages.
#
#    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
#    And As I enter the Compose "<Message Details>"
#    When I Click the send message
#    Then I Should verify the Patient "<Out of Office Reply Message>" in the Inbox
#
#    Examples:
#      | Message Details                 | Out of Office Reply Message |
#      | &OUT_OF_OFFICE_MESSAGE_DETAILS& | &&                          |













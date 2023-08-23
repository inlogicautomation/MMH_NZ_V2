Feature: Provider_Messages

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Template: S1-Provider Sending Message

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Compose Details>"
    When I Click the send message and verify success pop up
    Then I navigate to Sent items and verify the Sent "<Compose Details>"

    Examples:
      | Compose Details            |
      | &RECEIVED_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Template: S2-Provider Save Message as Draft

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Compose Details>"
    When I Click the Draft message and verify success pop up
    Then I navigate to Draft items and verify the Sent "<Compose Details>"

    Examples:
      | Compose Details            |
      | &RECEIVED_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Template: S3- Provider Received Message & Provider Reply Message

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Compose Details>" to compose an email
    And I Click Patient Send Message Button then I should see message sent Successfully popup
    When I navigate to Patient Sent items and verify the Sent "<Compose Details>"
    And I navigate to provider portal and verify the Reply message "<Message Details>"
    Then I navigate to inbox items and create a reply message "<Message Details>"
    And I navigate to Sent Items and verify the reply message "<Message Details>"

    Examples:
      | Compose Details            | Message Details            |
      | &PROVIDER_COMPOSE_MESSAGE& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Template: S4- Preparation for Group Message, Sending a Group of E-Mail's to the Patient from provider login

    Given As a user I am on Doctor portal homepage and Navigate to GroupMessage Page
    And I enter the Compose GroupMessage "<Message Details>"
    When I send the group message to the patient users
    And As a user I am on HomePage and navigate to GroupMessage
    Then I verify the provider sent "<Group Message Details>"
    Examples:
      | Message Details              | Group Message Details        |
      | &SENT_GROUP_MESSAGE_DETAILS& | &SENT_GROUP_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Outline: S5- Provider Alert Settings
    Given As a user I am on Doctor portal HomePage and navigate to Messages Setting
    And I click the Alert Setting and select the "<Alert Type>"
    Then I click the Save Button

    Examples:
      | Alert Type            |
      | &PROVIDER_ALERT TYPE& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Outline: S6- Provider Signature Settings
    Given As a user I am on Doctor portal HomePage and navigate to Messages Setting
    And I click the Signature Setting and Enter the "<Signature Message>"
    When I click the Save Button
    Then I Should see the Provider Signature Based on "<Signature Message>" entered and signature must get auto populated in Compose mail

    Examples:
      | Signature Message            |
      | &PROVIDER_SIGNATURE MESSAGE& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Outline: S7- Provider Out Of Office Settings

    Given As a user I am on Doctor portal HomePage and navigate to Messages Setting
    And I click the Out of Office Settings and Enable Out Of Office Reply option
    And I select the Out of office "<Start Date>" and "<End Date>" and Enter the"<Message>"
    When I click the Save Button
    Then I Should Verify the Provider Out Of Office Reply "<Message>"

    Examples:
      | Start Date   | End Date   | Message                   |
      | &START DATE& | &END DATE& | &PROVIDER_OUT OF MESSAGE& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES
  Scenario Outline: S8- Provider Automatic Reply Settings

    Given As a user I am on Doctor portal HomePage and navigate to Messages Setting
    And I click the Automatic Replies Settings and Enable Replies Settings option
    And I Enter the Automatic Replies "<Message>"
    When I click the Save Button and Verify the Automatic Replies "<Message>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Compose Details>" to compose an email
    Then I Click Patient Send Message Button then I should see message sent Successfully popup
    And As a user I am on Doctor portal HomePage and navigate to Messages Setting


    Examples:
      | Message                   | Compose Details            |
      | &AUTOMATIC REPLY MESSAGE& | &PROVIDER_COMPOSE_MESSAGE& |
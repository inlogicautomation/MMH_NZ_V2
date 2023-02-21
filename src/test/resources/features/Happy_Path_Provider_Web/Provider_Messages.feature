Feature: Provider_Messages

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES1
  Scenario Template: S1-Provider Sending Message

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Message Details>"
    When I Click the send message and verify success pop up
    Then I navigate to Sent items and verify the Sent "<Message Details>"

    Examples:
      | Message Details            |
      | &RECEIVED_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES1
  Scenario Template: S2-Provider Save Message as Draft

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Message Details>"
    When I Click the Draft message and verify success pop up
    Then I navigate to Draft items and verify the Sent "<Message Details>"

    Examples:
      | Message Details            |
      | &RECEIVED_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_MESSAGES1
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
      | Message Details              | Group Message Details      |
      | &SENT_GROUP_MESSAGE_DETAILS& | SENT_GROUP_MESSAGE_DETAILS |
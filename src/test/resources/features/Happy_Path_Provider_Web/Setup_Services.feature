Feature: Setup_Services

  Background:Pref- User Successfully logs in to the Provider Portal

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S1- Provider Add New Service (Initiated by Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S2- Provider Add New Service (Initiated by Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Patient radio button "<Setup_Service>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    When I Click Send Message Button
    And I navigate to provider portal and verify the Patient message "<Message>"
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details           | Message                   |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &COMPOSE_MESSAGE_DETAILS& | &PATIENT_MESSAGE_DETAILS& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S3-Provider Add New Service (Initiated by Non-Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Non Clinical "<Setup_Service>"
    When As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    Then I Click Send Message Button
    And I navigate to provider portal and verify the Patient message "<Message>"


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details           | Message                   |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &COMPOSE_MESSAGE_DETAILS& | &PATIENT_MESSAGE_DETAILS& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1
  Scenario Template: S4- Provider Add New Service (Initiated by Non-Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Non Clinical to Patient Staff "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |


  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S5- Provider  Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    And I Click Reply button and Send Reply message to provider "<Reply Message>"
    And As a user I am on Doctor portal homepage and Navigate to Provider inbox "<Reply Message>"
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           | Reply Message              |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S6- Provider Do Not Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Do Not Allow to patient to Reply  "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    And I Click Reply button and verify Excepted Message Displayed

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S7 -Provider Restrict to patient default location
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Restrict to patient default location "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    And I Click Reply button and verify Excepted Message Displayed

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |



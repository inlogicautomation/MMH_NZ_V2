Feature: Repeat_Request_Prescription_Scenarios

  @MOBILE @RELAUNCH @Mobile_RRP @HAPPY_PATH_MOBILE @TestRPP
  Scenario Outline: Pre-Req - User login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username | Password   |
      | &EMAIL&  | &PASSWORD& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S1 - Request Repeat Prescription - Patient to collect script

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Patient to collect script"
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                  | Message       | Repeat Prescription Status            |
      | &PATIENT_TO_COLLECT_SCRIPT_DETAILS& | &RPR_MESSAGE& | &RP_PATIENT_TO_COLLECT_SCRIPT_STATUS& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S2 - Request Repeat Prescription - Sent script by post

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send Script by Post"
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details            | Message       | Repeat Prescription Status      |
      | &SEND_SCRIPT_BY_POST_DETAILS& | &RPR_MESSAGE& | &RP_SEND_SCRIPT_BY_POST_STATUS& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE @TestRPP
  Scenario Outline: S3 - Request Repeat Prescription - Sent script to pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send Script to Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                | Message       | Repeat Prescription Status          | Pharmacy Details                          |
      | &SEND_SCRIPT_TO_PHARMACY_DETAILS& | &RPR_MESSAGE& | &RP_SEND_SCRIPT_TO_PHARMACY_STATUS& | &SEND_SCRIPT_TO_PHARMACY_ADDRESS_DETAILS& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S4 - Request Repeat Prescription - Delivery Meds by pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver Meds by Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                 | Message       | Repeat Prescription Status           | Pharmacy Details                           |
      | &DELIVERY_MED_BY_PHARMACY_DETAILS& | &RPR_MESSAGE& | &RP_DELIVERY_MED_BY_PHARMACY_STATUS& | &DELIVERY_MED_BY_PHARMACY_ADDRESS_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S5 - Request Repeat Prescription - Deliver via Zoom Pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver via Zoom Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                  | Message       | Repeat Prescription Status            | Pharmacy Details                            |
      | &DELIVER_VIA_ZOOM_PHARMACY_DETAILS& | &RPR_MESSAGE& | &RP_DELIVER_VIA_ZOOM_PHARMACY_STATUS& | &DELIVER_VIA_ZOOM_PHARMACY_ADDRESS_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S11 - Request Repeat Prescription - Patient to collect script & $0 payment

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Patient to collect script"
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                                     | Message       | Repeat Prescription Status                       |
      | &PATIENT_TO_COLLECT_SCRIPT_DETAILS_PAYMENT_$0_PAYMENT& | &RPR_MESSAGE& | &RP_PATIENT_TO_COLLECT_SCRIPT_STATUS_$0_PAYMENT& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S12 - Request Repeat Prescription - Send script by post & $0 payment

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send Script by Post"
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                       | Message       | Repeat Prescription Status                 |
      | &SEND_SCRIPT_BY_POST_DETAILS_$0_PAYMENT& | &RPR_MESSAGE& | &RP_SEND_SCRIPT_BY_POST_STATUS_$0_PAYMENT& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S13 - Request Repeat Prescription - Send script to Pharmacy $0 Payment

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send Script to Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                                   | Message       | Repeat Prescription Status                     | Pharmacy Details                          |
      | &SEND_SCRIPT_TO_PHARMACY_DETAILS_PAYMENT_$0_PAYMENT& | &RPR_MESSAGE& | &RP_SEND_SCRIPT_TO_PHARMACY_STATUS_$0_PAYMENT& | &SEND_SCRIPT_TO_PHARMACY_ADDRESS_DETAILS& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S14 - Request Repeat Prescription - Deliver meds by Pharmacy & $0 payment

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver Meds by Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                            | Message       | Repeat Prescription Status                      | Pharmacy Details                           |
      | &DELIVERY_MED_BY_PHARMACY_DETAILS_$0_PAYMENT& | &RPR_MESSAGE& | &RP_DELIVERY_MED_BY_PHARMACY_STATUS_$0_PAYMENT& | &DELIVERY_MED_BY_PHARMACY_ADDRESS_DETAILS& |


  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S15 - Request Repeat Prescription - Deliver via Zoom Pharmacy $0 Payment

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver via Zoom Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    And I enter "<Message>" and accept the terms & conditions
    When I Send Prescription Request through pay at health centre for zero payment
    Then I should see Repeat prescription request sent successfully popup message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Medication Details                             | Message       | Repeat Prescription Status                       | Pharmacy Details                            |
      | &DELIVER_VIA_ZOOM_PHARMACY_DETAILS_$0_PAYMENT& | &RPR_MESSAGE& | &RP_DELIVER_VIA_ZOOM_PHARMACY_STATUS_$0_PAYMENT& | &DELIVER_VIA_ZOOM_PHARMACY_ADDRESS_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S16 - Request Repeat Prescription - Pay Online (A2A) - Patient to collect script
    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Patient to collect script"
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                          | Message       |
      | &PATIENT_TO_COLLECT_SCRIPT_DETAILS_PAYMENT& | &RPR_MESSAGE& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S16 -Request Repeat Prescription - Pay Online (A2A) - Patient to collect script

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    And I switch to Account to Account payment method
    And I select bank "<Details>" and Next
    When I enter the Account"<Details>" and Next
    Then I should select the Bank account "<Details>"
    And I should see the Transaction Approved message for AtoA Payment
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                    | Details               | Card Details   |
      | &RP_PATIENT_TO_COLLECT_SCRIPT_STATUS_PAYMENT& | &NET_BANKING_DETAILS& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S6 - Patient Send Prescription Request - Patient to collect script

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Patient to collect script"
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                          | Message       |
      | &PATIENT_TO_COLLECT_SCRIPT_DETAILS_PAYMENT& | &RPR_MESSAGE& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S6 -Request Repeat Prescription - Patient to collect script - Pay online (card) $X Payment

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                    | Card Details   |
      | &RP_PATIENT_TO_COLLECT_SCRIPT_STATUS_PAYMENT& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S7 - Patient Send Prescription Request - Send script by post

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send script by post"
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                    | Message       |
      | &SEND_SCRIPT_BY_POST_DETAILS_PAYMENT& | &RPR_MESSAGE& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S7 -Request Repeat Prescription - Send script by post - Pay online (card) $X Payment

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                    | Card Details   |
      | &RP_PATIENT_TO_COLLECT_SCRIPT_STATUS_PAYMENT& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S8 - Patient Send Prescription Request - Send script to Pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Send script to Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                        | Message       | Pharmacy Details                                  |
      | &SEND_SCRIPT_TO_PHARMACY_DETAILS_PAYMENT& | &RPR_MESSAGE& | &SEND_SCRIPT_TO_PHARMACY_ADDRESS_DETAILS_PAYMENT& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S8 -Request Repeat Prescription - Send script to Pharmacy - Pay online (card)  $X Payment

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                  | Card Details   |
      | &RP_SEND_SCRIPT_TO_PHARMACY_STATUS_PAYMENT& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S9 - Patient Send Prescription Request - Delivery Meds by pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver Meds by Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                         | Message       | Pharmacy Details                                   |
      | &DELIVERY_MED_BY_PHARMACY_DETAILS_PAYMENT& | &RPR_MESSAGE& | &DELIVERY_MED_BY_PHARMACY_ADDRESS_DETAILS_PAYMENT& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S9 - Request Repeat Prescription - Deliver med by Pharmacy - Pay online (card) $X Payment

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                   | Card Details   |
      | &RP_DELIVERY_MED_BY_PHARMACY_STATUS_PAYMENT& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S10 - Patient Send Prescription Request - Deliver via Zoom Pharmacy

    Given I am on MMH Home screen
    And I tap on "Repeat Prescriptions" option in home screen
    And I select the "<Medication Details>" for "Deliver via Zoom Pharmacy"
    And I select the "<Pharmacy Details>" to send script
    When I enter "<Message>" and accept the terms & conditions
    Then I Send Prescription Request

    Examples:
      | Medication Details                           | Message       | Pharmacy Details                                    |
      | &DELIVERY_VIA_ZOOM_PHARMACY_DETAILS_PAYMENT& | &RPR_MESSAGE& | &DELIVER_VIA_ZOOM_PHARMACY_ADDRESS_DETAILS_PAYMENT& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario Outline: S10 - Request Repeat Prescription - Deliver via Zoom Pharmacy - Pay online (card) $X Payment

    Given I am on Payment Options screen
    And I tap Pay Now button and tap OK in payment info popup message
    When I enter the "<Card Details>" and submit
    Then I should see Transaction Approved message
    And I should see "<Repeat Prescription Status>" displayed under Service Tab

    Examples:
      | Repeat Prescription Status                     | Card Details   |
      | &RP_DELIVERY_VIA_ZOOM_PHARMACY_STATUS_PAYMENT& | &CARD_DETAILS& |

  @MOBILE @Mobile_RRP @HAPPY_PATH_MOBILE
  Scenario: Pre-Req - Doctor Sending Message

    Given I am on MMH Home screen
    Then I tap on logout icon in Home screen

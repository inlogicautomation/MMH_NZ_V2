Feature: Appointments

  @WEB @Mobile @APPOINTMENTS @MobileResponse @HAPPY_PATH
  Scenario Template: Prep- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @APP @APPOINTMENTS @MobileResponse @HAPPY_PATH
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

  @WEB @Mobile @APPOINTMENTS @HAPPY_PATH
  Scenario Template: Prep- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @Mobile @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S6 - Patient Cancel Appointment

    And I navigate to the "<Appointment>" page
    And I click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I enter reason to cancel appointment
    When I click cancel your appointment button
    Then I should see Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Appointment         | Appointment_Cancel_Button        | Appointment_After_Cancel              |
      | Future Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |

  @WEB @APP @APPOINTMENTS @TestVideoJoin @HAPPY_PATH
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

  @WEB @Mobile @APPOINTMENTS @TestVideoJoin @HAPPY_PATH
  Scenario Template: Prep- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @Mobile @APPOINTMENTS @TestVideoJoin @HAPPY_PATH
  Scenario Template: S2 - Join Video Appointment

    And I navigate to the "<Appointment>" page
    And I join now button for video consultation "<Join_Consultation>"
    Then I should see video consultation window with icons "<All_Icons>"

    Examples:
      | Appointment         | Join_Consultation                                 | All_Icons     |
      | Future Appointments | &APPOINTMENT_DETAILS_FOR_JOIN_VIDEO_CONSULTATION& | &VIDEO_ICONS& |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
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

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S4 - Patient Booking Appointment - Phone Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the phone appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
      | Book Appointment | &BOOK_PHONE_APPOINTMENT& | &PHONE_APPOINTMENT_DETAILS& | &PHONE_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S5 - Patient Booking Appointment - Using Card Payment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the visit appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"

    Examples:
      | Appointment      | Appointment_Details                         | Details_For_Appointment                        | Future_Date   |
      | Book Appointment | &BOOK_VISIT_APPOINTMENT_USING_CARD_PAYMENT& | &VISIT_APPOINTMENT_DETAILS_USING_CARD_PAYMENT& | &FUTURE_DATE& |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S5 - Patient Booking Appointment - Using Card Payment

    And I select payment option "<Payment_Option>"
    And I accept the terms & conditions and confirm my booking
    And I see page navigated to the payment option
    When I enter the card details and confirm payment "<Payment_Details>"
    Then I should see payment has been processed successfully with appointment details

    Examples:
      | Payment_Option   | Payment_Details |
      | &PAYMENT_OPTION& | &CARD_DETAILS&  |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S7 - Patient can view all the future date booked appointments in card view

    Given As a user I am on HomePage
    And I navigate to the "<Appointments>" page
    When I switch to card view in future appointments page
    Then I should see all the future date appointments in card view
    Examples:
      | Appointments        |
      | Future Appointments |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S7 - Patient can view all the future date booked appointments in grid view

    Given I am on "<Tab>" page
    When I switch to grid view in future appointments page
    Then I should see all the future date appointments in grid view
    Examples:
      | Tab                 |
      | Future Appointments |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S8 - Patient can view all the past date booked appointments in card view

    Given As a user I am on HomePage
    And I navigate to "<Appointments>" page
    When I switch to card view in past appointments page
    Then I should see all the past date appointments in card view
    Examples:
      | Appointments      |
      | Past Appointments |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S8 - Patient can view all the past date booked appointments in card view

    Given I am on "<Tab>" page
    When I switch to grid view in past appointments page
    Then I should see all the past date appointments in grid view
    Examples:
      | Tab               |
      | Past Appointments |

  @WEB @APP @APPOINTMENTS @HAPPY_PATH
  Scenario Template: S9 - Patient can view all the video appointments invites sent from PMS/Provider in grid view

    Given As a user I am on HomePage
    When I navigate to "<Appointments>" page
    Then I should see all the all the video appointments invites sent from PMS Provider in grid view
    And I join Video Consultation by clicking Join now Icon in Video invitations Gid "<All_Icons>"

    Examples:
      | Appointments      | All_Icons     |
      | Video Invitations | &VIDEO_ICONS& |
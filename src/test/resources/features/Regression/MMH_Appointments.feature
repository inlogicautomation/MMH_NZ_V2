Feature: Appointments

  @WEB @Mobile @Batch11
  Scenario Template: S1- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @APP @Batch11
  Scenario Template: S1 Patient Booking Appointment - Visit Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the visit appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And I logout from tha application

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         |
      | Book Appointment | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &VISIT_APPOINTMENT_SUMMARY& |

  @WEB @Mobile @Batch11
  Scenario Template: S1- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @Mobile @Batch11
  Scenario Template: Patient Cancel Appointment

    And I navigate to the "<Appointment>" page
    And I click cancel button for the created appointment "<Appointment_Cancel_Button>"

    Examples:
      | Appointment         | Appointment_Cancel_Button        |
      | Future Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& |


  @WEB @APP @Batch1
  Scenario Template: S2 Patient Booking Appointment - Video Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the video appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         |
      | Book Appointment | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &VIDEO_APPOINTMENT_SUMMARY& |

  @WEB @APP @Batch1
  Scenario Template: S3 Patient Booking Appointment - Visit in video slot Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the video appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details               | Details_For_Appointment              | Appointment_Summary                  |
      | Book Appointment | &BOOK_VISIT_IN_VIDEO_APPOINTMENT& | &VISIT_IN_VIDEO_APPOINTMENT_DETAILS& | &VISIT_IN_VIDEO_APPOINTMENT_SUMMARY& |

  @WEB @APP @Batch1
  Scenario Template: S4 Patient Booking Appointment - Phone Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the phone appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         |
      | Book Appointment | &BOOK_PHONE_APPOINTMENT& | &PHONE_APPOINTMENT_DETAILS& | &PHONE_APPOINTMENT_SUMMARY& |


  @WEB @APP @Batch1
  Scenario Template: S5 Patient Booking Appointment - Using Card Payment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the visit appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>"

    Examples:
      | Appointment      | Appointment_Details                         | Details_For_Appointment                        |
      | Book Appointment | &BOOK_VISIT_APPOINTMENT_USING_CARD_PAYMENT& | &VISIT_APPOINTMENT_DETAILS_USING_CARD_PAYMENT& |

  @WEB @APP @S1 @Batch1
  Scenario Template: S5 Patient Booking Appointment - Using Card Payment

    And I select payment option "<Payment_Option>"
    And I accept the terms & conditions and confirm my booking
    And I see page navigated to the payment option
    When I enter the card details and confirm payment "<Payment_Details>"
#   Then I should see payment has been processed successfully with appointment details

    Examples:
      | Payment_Option   | Payment_Details |
      | &PAYMENT_OPTION& | &CARD_DETAILS&  |

  @WEB @APP
  Scenario Template: S2 Patient can view all the future date booked appointments in card view

    Given As a user I am on HomePage
    And I navigate to the "<Appointments>" page
    When I switch to card view in future appointments page
    Then I should see all the future date appointments in card view
    Examples:
      | Appointments        |
      | Future Appointments |

  @WEB @APP
  Scenario Template: S3 Patient can view all the future date booked appointments in grid view

    Given I am on "<Tab>" page
    When I switch to grid view in future appointments page
    Then I should see all the future date appointments in grid view
    Examples:
      | Tab                 |
      | Future Appointments |

  @WEB @APP
  Scenario Template: S4 Patient can view all the past date booked appointments in card view
    Given I am on "<Tab>" page
    And I navigate to "<Appointments>" page
    When I switch to card view in past appointments page
    Then I should see all the past date appointments in card view
    Examples:
      | Tab                 | Appointments      |
      | Future Appointments | Past Appointments |

  @WEB @APP
  Scenario Template: S4 Patient can view all the past date booked appointments in card view

    Given I am on "<Tab>" page
    When I switch to grid view in past appointments page
    Then I should see all the past date appointments in grid view
    Examples:
      | Tab               |
      | Past Appointments |

  @WEB @APP
  Scenario Template: Patient can view all the video appointments invites sent from PMS/Provider in grid view

    Given I am on "<Tab>" page
    When I navigate to "<Appointments>" page
    Then I should see video icon in join tab in all appointment time
    And I should navigate to new window with Icons.

    Examples:
      | Tab               | Appointments      |
      | Past Appointments | Video Invitations |
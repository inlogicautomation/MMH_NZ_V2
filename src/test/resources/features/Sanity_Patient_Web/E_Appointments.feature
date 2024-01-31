Feature: Appointments

  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @SANITY_PAT @SANITY_PATH_APPOINTMENTS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |


  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

#    Note: {
#    25:Login as Existing patient & view/click on Appointments
#    26:Click on Book Appointment & Select the Health Centre
#    27:Select the Location in Book appointment page
#    28:Select Appointment For Whom in Book appointment page
#    29:Select reason for booking in Book appointment page
#    30:Select the type of an  appointment need to be booked in Book appointment page
#    31:Select Doctor in Book appointment page
#    32:Select the date & check the slots availability
#    33:Verify the fees displayed
#    34:Check the details of appointment
#    35:Click pay At Clinic or pay Credit Card
#    36:Click on confirm & get Appointment Confirmed details
#    These test Case Covered The Scenario NO: S1
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S1 Patient Booking Appointment - Visit Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the visit appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And I logout from the application

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
      | Book Appointment | &BOOK_VISIT_APPOINTMENT& | &VISIT_APPOINTMENT_DETAILS& | &VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |

  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address            | Password   |
      | &EMAIL FOR APPOINTMENTS& | &PASSWORD& |

  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S1 - Patient Cancel Appointment

    And I navigate to the "<Appointment>" Future Appointments page
    And I click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I enter reason to cancel appointment
    When I click cancel your appointment button
    Then I should see Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Appointment           | Appointment_Cancel_Button        | Appointment_After_Cancel              |
      | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |


#    Note: {
#    37:Click on future appointments & view card details of future date appointments
#    These test Case Covered The Scenario NO: S2
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S2 - Patient can view all the future date booked appointments in card view

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    When I switch to card view in future appointments page
    Then I should see all the future date appointments in card view
    Examples:
      | Appointment           |
      | Upcoming Appointments |


#    Note: {
#    37:Click on future appointments & view card details of future date appointments
#    These test Case Covered The Scenario NO: S2
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S2 - Patient can view all the future date booked appointments in grid view

    Given I am on "<Tab>" page
    When I switch to grid view in future appointments page
    Then I should see all the future date appointments in grid view
    Examples:
      | Tab                   |
      | Upcoming Appointments |


#    Note: {
#    40:Click on video invitations & view grid details of Video invite appointments
#    These test Case Covered The Scenario NO: S3
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S3 - Patient Booking Appointment - Video Appointment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the video appointment details "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And I logout from the application

    Examples:
      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
      | Book Appointment | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &VIDEO_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S3- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

#    Note: {
#    40:Click on video invitations & view grid details of Video invite appointments
#    These test Case Covered The Scenario NO: S3
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S3 - Join Video Appointment

    And I navigate to the "<Appointment>" Future Appointments page
    And I join now button for video consultation "<Join_Consultation>"
    Then I should see Appointment is not for today popup in future appointments page
#    Then I should see video consultation window with icons "<All_Icons>"

    Examples:
      | Appointment           | Join_Consultation                | All_Icons     |
      | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &VIDEO_ICONS& |


#    Note: {
#    39:Click on past appointments & view card details of past date appointments
#    These test Case Covered The Scenario NO: S4
#  }
  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
  Scenario Template: S4 - Patient can view all the past date booked appointments in card view

    Given As a user I am on HomePage
    And  I navigate to the "<Appointments>" page Card View
    When I switch to card view in past appointments page
    Then I should see all the past date appointments in card view
    Examples:
      | Appointments      |
      | Past appointments |

#    Note: {
#    39:Click on past appointments & view grid details of past date appointments
#    These test Case Covered The Scenario NO: S4
#  }
#  @WEB @SANITY_PATH @SANITY_PATH_APPOINTMENTS
#  Scenario Template: S4 - Patient can view all the past date booked appointments in grid view
#
#    Given I am on "<Tab>" page
#    When I switch to grid view in past appointments page
#    Then I should see all the past date appointments in grid view
#    Examples:
#      | Tab               |
#      | Past Appointments |

  @WEB @SANITY_PATH1 @SANITY_PATH_APPOINTMENTS
  Scenario Template: S5 - Patient can view all the video appointments invites sent from PMS/Provider in grid view

    Given As a user I am on HomePage
    When I navigate to the "<Appointments>" page Card View
    Then I should see all the all the video appointments invites sent from PMS Provider in grid view
#   And I join Video Consultation by clicking Join now Icon in Video invitations Gid "<All_Icons>"
    And I should see Appointment is not for today popup

    Examples:
      | Appointments      | All_Icons     |
      | Video invitations | &VIDEO_ICONS& |

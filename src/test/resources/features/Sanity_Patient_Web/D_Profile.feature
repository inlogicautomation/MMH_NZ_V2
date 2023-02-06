Feature: Patient Profile

  @WEB  @PROFILE @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address       | Password               |
      | &EMAIL_FOR_PROFILE& | &PASSWORD_FOR_PROFILE& |

#    Note: {
#    388:Login as Existing patient & view/click on My Profile on right top
#    389:Navigate to profile & click on Change password - Enter current password, new password & confirm new password & click on change
#    These test Case Covered The Scenario NO: S1
#  }
  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S1- Existing Patient change the password.

    Given As a Existing user I am on HomePage and I navigate to change password in the My Profile
    And I enter the "<Current Password>" and New "<Password>"
    When I click Update Button
    Then I should see the Password changed Success Popup
#    And I log out from Patient Portal

    Examples:
      | Current Password       | Password                   |
      | &PASSWORD_FOR_PROFILE& | &NEW_PASSWORD_FOR_PROFILE& |

  @WEB  @PROFILE12 @SANITY_PATH12
  Scenario Template: S1- Existing Patient Login with new password.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address       | Password               |
      | &EMAIL_FOR_PROFILE& | &PASSWORD_FOR_PROFILE& |


#    Note: {
#    391:Navigate to profile & click on Change address - Enter New address details accordingly & click on update
#    These test Case Covered The Scenario NO: S2
#  }
  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S2- Existing Patient change the Address.

    Given As a Existing user I am on HomePage and I navigate to change address in the My Profile
    And I enter the New "<Address>"
    When I click Update Button
    Then I should see the Address changed Success Popup
    And I verify the New "<Address>"
    Examples:
      | Address               |
      | &ADDRESS_FOR_PROFILE& |


#    Note: {
#    392:Navigate to profile & click on Change phone number - Enter New phone number details accordingly & click on update#    These test Case Covered The Scenario NO: S3
#    394:Navigate to profile & click on View Profile - View profile tab is displayed
#    396:Navigate to profile & click on View Profile - & click on My Health Centre
#    398:Navigate to profile & click on View Profile - & click on My Subscription
#    400:Navigate to profile & click on View Profile - & click on Access Information
#    These test Case Covered The Scenario NO: S3
#  }
  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S3- Existing Patient change the Phone Number.

    Given As a Existing user I am on HomePage and I navigate to change Phone number in the My Profile
    And I enter the New Phone "<Number>"
    When I click Update Button
    Then I should see the Phone number changed Success Popup
    And I navigate to Profile and I see View Profile tab
    And I navigate to View Profile and I see My Health Centres
    And I navigate to View Profile and I see My Subscriptions
    And I navigate to View Profile and I see Access Information
    Examples:
      | Number                     |
      | &PHONE_NUMBER_FOR_PROFILE& |


#    Note: {
#  403:Navigate to profile & click on View Profile - & click on Emergency Contacts
#  404:Click on add new contact - enter name, phone number & address details & click on Add Contact
#  405:Contact must get added in the Emergency Contact grid
#  These test Case Covered The Scenario NO: S4
#  }

  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S4- Existing Patient Add the New Emergency Contacts.

    Given As a Existing user I am on HomePage and I navigate to Emergency Contacts in the My Profile
    And I click Add New Contact Button
    And I enter the New Emergency Contact"<Details>"
    When I click Add Contact Button and verify the Success Popup
    Then I verify the Added Emergency Contact Details "<In Grid>" view
    And I verify the Added Emergency Contact details In "<In Grid>" And "<More Info>"

    Examples:
      | Details                         | In Grid                                        | More Info                                          |
      | &EMERGENCY_CONTACT_FOR_PROFILE& | &VERIFY_EMERGENCY_CONTACT_FOR_PROFILE_IN_GRID& | &VERIFY_EMERGENCY_CONTACT_FOR_PROFILE_IN_MOREINFO& |


#    Note: {
#  406:Navigate to profile & click on Calendar(Navigate to Calendar)
#  407Calendar view--Day/Week/Month
#  408:General Settings--Date & Time format/Default view/Week start on--Save& Cancel
#  409:Add Category in calendar settings- update Category /Cancel
#  These test Case Covered The Scenario NO: S5
#  }
  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S5- Existing Patient view the Calendar and calendar setting.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I view the calendar in the Day,Week and Month view format
    And I navigate to Calendar settings
    And I modify the General calendar settings "<Details>"
    When I click the save button for General Calendar settings and Verify the Success Popup
    Then I navigate to General setting and verify the modified General calendar settings "<Details>"

    Examples:
      | Details                     |
      | &CALENDAR_GENERAL_SETTINGS& |

  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S5- Existing Patient Add Category in calendar settings- update Category /Cancel.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I navigate to Calendar settings
    And I add the Categories "<Details>" in the calendar settings
    When I click the Update button for category Calendar settings and Verify the Success Popup
    Then I navigate to categories and verify the Added Category "<Details>"

    Examples:
      | Details                             |
      | &ADD_CATEGORY_FOR_CALENDAR_SETTING& |


#  Note: {
#  410:Add/Edit Event in Calendar
#  411:Delete Event in Calendar
#  These test Case Covered The Scenario NO: S6
#  }
  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S6- Existing Patient Add Event in calendar and Delete the Event.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I open the event page in the calendar
    And I enter the Event "<Details>" in the calendar
    When I click the Event save button
    Then I verify the created event "<Details>" in the calendar
    And I Edit the created event "<Details>" in the calendar
    And I click the Event save button
    And I delete the create event "<Details>" in the calendar

    Examples:
      | Details                    |
      | &CREATE_EVENT_IN_CALENDAR& |



# 393:  Navigate to profile & click on My Payment - Enter Health centre, location, from date, to date, or text to search & click on search - All payments details must be displayed in grid
# 395: Click on update profile under view profile tab & update personal details, contact details, additional details & click on save
# 401: click on who accessed my records & grid is displayed





  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S10- Preparation for Patient Automatic Reply Settings, Login as a Provider user

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal       | Email Address      | Password              |
      | &V1 URL& | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |

  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S3- Preparation for Profile Access

    Given As a user I am on Doctor portal homepage and Navigate to Search Patient
    And As I enter the Search Patient "<Details>"
    When I Click the Search button and verify result
    Then I navigate to view goals
    And I log out from Doctor Portal
    Examples:
      | Details                      |
      | &PROFILE_ACCESS_INFORMATION& |


  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |


  @WEB @PROFILE @SANITY_PATH
  Scenario Template: S3- Verify for Profile Access

    Given I navigate to View Profile and I see Access Information
    And I verify the provider Access Information of patient "<Details>"
    Examples:
      | Details                     |
      | &VERIFY_ACCESS_INFORMATION& |


#  Navigate to profile & click on My Payment - Enter Health centre, location, from date, to date, or text to search
#  & click on search - All payments details must be displayed in grid
#
#  Click on update profile under view profile tab & update personal details, contact details, additional details
#  & click on save
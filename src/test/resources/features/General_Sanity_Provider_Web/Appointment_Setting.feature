Feature: Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S0- Verify if location & Provider are displayed based on Rule A

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    Then Verify if Location "<Any_Location_with_Any_Provider_Appointment_Details>" and Provider are Displayed based on Rule A "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location         | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |  |  |  |  |  |  |  |  |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |  |  |  |  |  |  |  |  |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S1- Verify if location & Provider are displayed based on Rule B

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    Then Verify if Location "<Default_Location_with_Default_Provider_Appointment_Details>" and Provider are Displayed based on Rule B "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"

    Examples:
      | Default_Location_with_Default_Provider_Appointment_Details      | Location         | Automation_Practice_Loc1_Doctor_Name |
      | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S2- Verify if location & Provider are displayed based on Rule C

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleC Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    Then Verify if Location "<Default_Location_with_Default_Provider_Appointment_Details>" and Provider are Displayed based on Rule C "<Automation_Practice_Loc1_Doctor_Name>"

    Examples:
      | Default_Location_with_Default_Provider_Appointment_Details             | Location         | Automation_Practice_Loc1_Doctor_Name |
      | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S3- Verify if location & Provider are displayed based on Rule D

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleD Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    Then Verify if Location "<Default_Location_with_Default_Provider_Appointment_Details>" and Provider are Displayed based on Rule D "<Automation_Practice_Loc1_Doctor_Name>"
    Examples:
      | Default_Location_with_Default_Provider_Appointment_Details             | Location         | Automation_Practice_Loc1_Doctor_Name |
      | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S4- Verify if location & Provider are displayed based on Rule E

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I click restrict providers checkbox"<Location>" click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    Then Verify if Location "<Default_Location_with_Default_Provider_Appointment_Details>" and Provider are Displayed based on Rule D "<Automation_Practice_Loc1_Doctor_Name>"
    Examples:
      | Default_Location_with_Default_Provider_Appointment_Details             | Location         | Automation_Practice_Loc1_Doctor_Name | Restrict_Provider_Details    |
      | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | Automation1_Loc1 | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &NON_RESTRICT_PROVIDER_DATA& |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S5-Verify the no of Appointments allowed per day & Terms Conditions are reflected in the book appointment

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button select the no of appointments and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" and I click confirm button
    And I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    Then I navigate to the "<Appointment>" Future Appointments page and I click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" and verify No of Appointment allowed perday
    Examples:
      |  | Location         | Appointment_Details      | Appointment           | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment_Cancel_Button        |  |  |
      |  | Automation1_Loc1 | &BOOK_VISIT_APPOINTMENT& | Upcoming Appointments | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | &APPOINTMENT_DETAILS_FOR_CANCEL& |  |  |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S6-Select the Reason Mandatory No Radio Button Provider side verify without Enter Reason Book Appointment From Patient side

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable Reason Mandatory No Radio button select the no of appointments and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" Without Enter Reason and I click confirm button
    And I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    Then I navigate to the "<Appointment>" Future Appointments page and I click cancel button for the created appointment "<Appointment_Cancel_Button>"

    Examples:
      |  | Location         | Appointment_Details      | Appointment           | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment_Cancel_Button        |  |  |
      |  | Automation1_Loc1 | &BOOK_VISIT_APPOINTMENT& | Upcoming Appointments | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | &APPOINTMENT_DETAILS_FOR_CANCEL& |  |  |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S7-Select the Reason Mandatory yes Radio Button Provider side verify without Enter Reason Book Appointment From Patient side

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable Reason Mandatory yes Radio button select the no of appointments and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Appointment_Details>" and I click confirm button
    And I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    Then I navigate to the "<Appointment>" Future Appointments page and I click cancel button for the created appointment "<Appointment_Cancel_Button>"

    Examples:
      |  | Location         | Appointment_Details      | Appointment           | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment_Cancel_Button        |  |  |
      |  | Automation1_Loc1 | &BOOK_VISIT_APPOINTMENT& | Upcoming Appointments | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | &APPOINTMENT_DETAILS_FOR_CANCEL& |  |  |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S8-Provider Turn Off Online Appointments verify No Available appointment slot Text is displayed in Appointment Page

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    And I Log Out from Provider and Search for Health Centre Verify Online Appointment is not displayed for Easy booking"<Location1>"and"<Provider_Login>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
    Examples:
      | Location         | Provider_Login           | Appointment_Details      | Appointment      | Location1  |
      | Automation1_Loc1 | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment | Automation |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S9-Provider View Turn Off Appointments Audit verify Check Turn Off Appointments audit grid displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    When I navigate to Turn Off Appointment Audit page
    Then I Should see Turn Off Appointments audit details displayed grid view "<Appointments_Audit_Details>"

    Examples:
      | Location         | Appointments_Audit_Details |
      | Automation1_Loc1 | &APPOINTMENT_AUDIT_DATA&   |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S10-Provider Enable Phone Appointment Settings - Rule 1 and verify Patient side

    Given As a Provider I am on HomePage and navigate to Phone Appointment Setting page
    And I click edit button select the Phone Appointment Rule MMHPA "<Phone_Appointment_setting_data>"
    When I select the phone call initiated by Practice radio button and click the save button "<Phone_Appointment_setting_data>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I enter the phone appointment details "<Phone_Appointments_Data>" and verify Appointment Session Name as MMHPA will be displayed Phone Appointments

    Examples:
      | Phone_Appointment_setting_data      | Phone_Appointments_Data  |
      | &PHONE_APPOINTMENT_SETTING_DETAILS& | &BOOK_PHONE_APPOINTMENT& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S11-Provider Enable Phone Appointment Settings - Rule 2 and verify Patient side

    Given As a Provider I am on HomePage and navigate to Phone Appointment Setting page
    And I click edit button select the Phone Appointment Rule BLANK"<Phone_Appointment_setting_data>"
    When I select the phone call initiated by Practice radio button and click the save button "<Phone_Appointment_setting_data>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I enter the phone appointment details "<Phone_Appointments_Data>" and verify Appointment Session Name as BLANK will be displayed Phone Appointments

    Examples:
      | Phone_Appointment_setting_data      | Phone_Appointments_Data  |
      | &PHONE_APPOINTMENT_SETTING_DETAILS& | &BOOK_PHONE_APPOINTMENT& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S12-As a User I have to enable Easy Booking Banner Message to Yes in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Banner Message to Yes
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    Then I Enter the Location in search box and I verify the created Appointment "<Location>"
    And I click the Book Now button "<Location>"
    And I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are saved

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   | Location                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S13-As a User I have to enable Easy Booking Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Banner Message to No
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    And I Enter the Location in search box and I verify the created Appointment "<Location>"
    Then I click the Book Now button "<Location>"
    And I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   | Location                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S14-As a User I have to enable Patient Portal(Web) Banner Message to yes in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Patient Portal Web Banner Message to yes
    And I fill Patient Portal Web Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I should verify the Patient Portal Web Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S15-As a User I have to enable Patient Portal(Web) Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Patient Portal Web Banner Message to No
    And I fill Patient Portal Web Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I should verify the Patient Portal Web Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S16-Provider Enable Video Consultations No Button Check Video appointment slots are Not displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking No button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are Not displayed in All tab

    Examples:
      | Location         | Appointment_Details      |
      | Automation1_Loc1 | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S17-Provider Enable Video Consultations yes Button Check Video appointment slots are displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking Yes button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are displayed in All tab

    Examples:
      | Location         | Appointment_Details      |
      | Automation1_Loc1 | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING111
  Scenario Template:S18-Provider Enable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S6-Provider Disable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING
  Scenario Template:S7-Provider Enable SMS Video Invite Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S8-Provider Disable SMS Video Invite Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S1-Enable Pre-Screening Covid PopUp Settings in Provider
    Given As a Provider I am on HomePage and navigate to  Pre-Screening Settings
    And I click Systems Menu and I navigating to Pre-Screening Settings page
    And I click Edit button to select "<Health_Centre>" and "<Location>" and Enable Appointment Pre-Screening Popup
    When As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I select "<Health_Centre>" and "<Location>" and verify the Covid Pre-Screening popup is Undisplayed


    Examples:
      | Health_Centre                 | Location        |
      | &PRE_SCREENING_HEALTH_CENTRE& | &PRE_SCREENING& |

  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S2-Disable Pre-Screening Covid PopUp Settings in Provider

    Given As a Provider I am on HomePage and navigate to  Pre-Screening Settings
    And I click Systems Menu and I navigating to Pre-Screening Settings page
    And I click Edit button to select "<Health_Centre>" and "<Location>" and Disable Appointment Pre-Screening Popup
    When As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I select "<Health_Centre>" and "<Location>" and verify the Covid Pre-Screening popup is Undisplayed

    Examples:
      | Health_Centre                 | Location        |
      | &PRE_SCREENING_HEALTH_CENTRE& | &PRE_SCREENING& |


  @WEB @PROVIDER_SANITY @APPOINTMENTS_SETTING1
  Scenario Template:S13-Set Minimum notice for Cancellation

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
    And I verify Myself and Friends and Family option is displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
    And I select the friends and family dropdown enter the visit appointment details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
    Examples:
      | SET_MINIMUM_DATA               | Location         | Appointment_Reason | Appointment_Is_For_Details    | Appointment_Details                         | Details_For_Appointment                        | Future_Date                      | Appointment_Summary                            | Patient_User_Login   | Password   | Appointment         | Appointment_Cancel_Button                           | Appointment_After_Cancel                                 |
      | &APPOINTMENT_SET_MINIMUM_DATA& | Automation1_Loc1 | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_DETAILS& | &FRIENDS_AND_FAMILY_FUTURE_DATE& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Future Appointments | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_FOR_CANCEL& | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_AFTER_CANCELLED& |





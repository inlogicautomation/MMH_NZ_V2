Feature: Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S0-Provider Enable Rule A verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<VM03Location_Doctor_Name>" "<VM03Location2_Doctor_Name>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | VM03Location_Doctor_Name    | VM03Location2_Doctor_Name    | Details_For_Appointment            | Future_Date          | Appointment_Summary                | Patient_User_Login | Password           | Appointment         | Appointment_Cancel_Button               | Appointment_After_Cancel                     |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | VM03Location | &VM03LOCATION_DOCTOR_NAMES& | &VM03LOCATION2_DOCTOR_NAMES& | &VMO3L2_VISIT_APPOINTMENT_DETAILS& | &VM03L2_FUTURE_DATE& | &VM03L2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_EMAIL&    | &PATIENT_PASSWORD& | Future Appointments | &VM03L2_APPOINTMENT_DETAILS_FOR_CANCEL& | &VM03L2_APPOINTMENT_DETAILS_AFTER_CANCELLED& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S1-Provider Enable Rule A verify Patient Book Visit Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<VM03Location_Doctor_Name>" "<VM03Location2_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    | VM03Location2_Doctor_Name    |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& | &VM03LOCATION2_DOCTOR_NAMES& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S2-Provider Enable Rule A verify Patient Book Phone Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the phone appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<VM03Location_Doctor_Name>" "<VM03Location2_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the phone appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    | VM03Location2_Doctor_Name    |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& | &VM03LOCATION2_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S3-Provider Enable Rule A verify Patient Book Video Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the video appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<VM03Location_Doctor_Name>" "<VM03Location2_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the video appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the video appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    | VM03Location2_Doctor_Name    |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& | &VM03LOCATION2_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S4-Provider Enable Rule B verify Patient Book Visit Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    Then I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S5-Provider Enable Rule B verify Patient Book Phone Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    Then I navigate to Book Appointment select Default Location with Any Provider
    And I enter the phone appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S6-Provider Enable Rule B verify Patient Book Video Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    Then I navigate to Book Appointment select Default Location with Any Provider
    And I enter the video appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | VM03Location_Doctor_Name    |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &VM03LOCATION_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S7-Provider Enable Rule C verify Patient Book Visit,Phone and video Appointment based on Rule C (Default Location with Default Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleC Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details             | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | VM03Location_Doctor_Name    |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &VM03LOCATION_DOCTOR_NAMES& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S8-Provider Enable Rule D verify Patient Book Visit,Phone and video Appointment based on Rule D (Default Location with Default Provider) & (Income Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleD Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details             | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | VM03Location_Doctor_Name    |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &VM03LOCATION_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S9-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Restricted provider are not displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I click restrict providers checkbox"<Location>" click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"
    And I Check restricted providers are not visible for phone and video appointments made online "<Restrict_Provider_Details>"
    Then I navigate to Book Appointment select Default Provider based on Rule E
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are not displayed Check Payments "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Restrict_Provider_Details | Default_Location_with_Default_Provider_Appointment_Details             | VM03Location_Doctor_Name    |
      | VM03Location | &RESTRICT_PROVIDER_DATA&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &VM03LOCATION_DOCTOR_NAMES& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S10-Provider Enable Rule E verify Patient Book Phone and video Appointment based on Rule E Check Restricted provider are not displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I click restrict providers checkbox"<Location>" click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"
    And I Check restricted providers are not visible for phone and video appointments made online "<Restrict_Provider_Details>"
    And I navigate to Book Appointment select Default Provider based on Rule E
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Restrict_Provider_Details | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | VM03Location_Doctor_Name    | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c |
      | VM03Location | &RESTRICT_PROVIDER_DATA&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &VM03LOCATION_DOCTOR_NAMES& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S11-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Not Restricted provider are displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I check Non restrict providers checkbox"<Location>"and click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"
    And I Check not restricted providers are visible for phone and video appointments made online "<Restrict_Provider_Details>"
    Then I navigate to Book Appointment select Default Provider based on Rule E
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are not displayed Check Payments "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Restrict_Provider_Details    | Default_Location_with_Default_Provider_Appointment_Details             | VM03Location_Doctor_Name    |
      | VM03Location | &NON_RESTRICT_PROVIDER_DATA& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &VM03LOCATION_DOCTOR_NAMES& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S12-Provider Enable Rule E verify Patient Book Phone and video Appointment based on Rule E Check Not Restricted provider are displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I check Non restrict providers checkbox"<Location>"and click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"
    And  I Check not restricted providers are visible for phone and video appointments made online "<Restrict_Provider_Details>"
    And I navigate to Book Appointment select Default Provider based on Rule E
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<VM03Location_Doctor_Name>"

    Examples:
      | Location     | Restrict_Provider_Details    | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | VM03Location_Doctor_Name    | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c |
      | VM03Location | &NON_RESTRICT_PROVIDER_DATA& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &VM03LOCATION_DOCTOR_NAMES& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S13-Provider Allow to book for family / friends verify Friends and Family option is displayed in Appointment is for dropdown

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable allow to book friends yes radio button"<Location>" and click save button then I see Saved Successfully message
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
    And I verify Myself and Friends and Family option is displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
    And I select the friends and family dropdown enter the visit appointment details "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Location     | Appointment_Reason | Appointment_Is_For_Details    | Appointment_Details                         | Details_For_Appointment                        | Future_Date                      | Appointment_Summary                            | Patient_User_Login | Password           | Appointment         | Appointment_Cancel_Button                           | Appointment_After_Cancel                                 |
      | VM03Location | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_DETAILS& | &FRIENDS_AND_FAMILY_FUTURE_DATE& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_EMAIL&    | &PATIENT_PASSWORD& | Future Appointments | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_FOR_CANCEL& | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_AFTER_CANCELLED& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S13-Provider Allow to book for family / friends verify Friends and Family option is displayed in Appointment is for dropdown

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable allow to book friends No radio button"<Location>" and click save button then I see Saved Successfully message
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
    Then I verify Myself and Friends and Family option is Not displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"

    Examples:
      | Location     | Appointment_Reason | Appointment_Is_For_Details    |
      | VM03Location | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S14-Provider Turn Off Online Appointments verify No Available appointment slot Text is displayed in Appointment Page

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    And I Log Out from Provider and Search for Health Centre Verify Online Appointment is not displayed for Easy booking"<Location>"and"<Provider_Login>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
    Examples:
      | Location     | Provider_Login           | Appointment_Details      | Appointment      |
      | VM03Location | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S15-Provider Turn on Online Appointments verify Available appointment slot Text is displayed in Appointment Page

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-on online appointments checkbox click save button then I see turned-off Message
    And I Log Out from Provider and Search for Health Centre Verify Online Appointment Slot is displayed for Easy booking"<Location>"and"<Provider_Login>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
    Examples:
      | Location     | Provider_Login           | Appointment_Details      | Appointment      |
      | VM03Location | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S16-Provider View Turn Off Appointments Audit verify Check Turn Off Appointments audit grid displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    When I navigate to Turn Off Appointment Audit page
    Then I Should see Turn Off Appointments audit details displayed grid view "<Appointments_Audit_Details>"

    Examples:
      | Location     | Appointments_Audit_Details |
      | VM03Location | &APPOINTMENT_AUDIT_DATA&   |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S17-Provider View Turn On Appointments Audit verify Check Turn On Appointments audit grid view displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-On online appointments checkbox click save button then I see turned-On Message
    When I navigate to Turn Off Appointment Audit page
    Then I Should see Turn On Appointments audit details displayed grid view "<Appointments_Audit_Details>"
    Examples:
      | Location     | Appointments_Audit_Details |
      | VM03Location | &APPOINTMENT_AUDIT_DATA&   |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S17-Provider Block Appointments doctor Name verify Check Turn On Appointments audit grid displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Block Appointments for Provider and enter the all details"<Appointment_Details>" click save button then i see Setting saved successfully message



    Examples:
      | Appointment_Details |
      | &BLOCK_APPOINTMENT& |

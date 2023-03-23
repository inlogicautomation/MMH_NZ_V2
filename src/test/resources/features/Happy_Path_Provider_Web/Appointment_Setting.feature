Feature: Appointment Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

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

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S9-Provider Enable Rule E verify Patient Book Visit,Phone and video Appointment based on Rule E Check Restricted provider are not displayed

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


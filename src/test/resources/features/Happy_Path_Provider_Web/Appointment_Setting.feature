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
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify without payment

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S2-Provider Enable Rule A verify Patient Book Phone Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the phone appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the phone appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify without payment

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1
  Scenario Template:S3-Provider Enable Rule A verify Patient Book Video Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And I enter the video appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Default Provider
    Then I enter the video appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify without payment
    And I navigate to Book Appointment select Default Location with Any Provider
    And I enter the video appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify without payment

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S4-Provider Enable Rule B verify Patient Book Visit Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location with Default Provider
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify without payment
    Then I navigate to Book Appointment select Default Location with Any Provider
    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify without payment

    Examples:
      | Location     | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      |
      | VM03Location | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& |
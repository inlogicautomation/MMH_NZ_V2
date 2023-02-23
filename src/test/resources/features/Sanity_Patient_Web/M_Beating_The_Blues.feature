Feature: Beating_The_Blues

  @WEB  @BEATING_THE_BLUES @SANITY_PATH @SANITY_PATH_JENKINS
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password                         |
      | &EMAIL FOR BEATING_THE_BLUES& | &PASSWORD FOR BEATING_THE_BLUES& |

  @WEB @BEATING_THE_BLUES @SANITY_PATH @SANITY_PATH_JENKINS
  Scenario:S1-Existing Patient Click on Beating the Blues & click on View Session 1 & view all the steps of session in Beating the Blues

    Given As a Existing user I am on HomePage and I click the Health Tools
    When click on Beating the Blues & click on View Session
    Then click view all the steps of session in Beating the Blues
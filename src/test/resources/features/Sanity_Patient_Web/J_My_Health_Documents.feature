Feature: My Health Documents

  @WEB  @MY_HEALTH_DOCUMENT @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |



#    Note: {
#  320 : Login as Existing patient & view/click on My Health Documents
#  321 : Click on attach document to add new document - Enter doc name, doc type, Doc validity date, attach file & click save
#  322 : Click on Keep this private to not to share with provider & added doc is not shared to others
#  324 : Attach files that are supported & max size of 5MB
#  325 : Added doc must be displayed in my document grid

#    These test Case Covered The Scenario NO: S2
#    }
  @WEB  @MY_HEALTH_DOCUMENT @SANITY_PATH
  Scenario Template: S2- Add new document with Keep this private of Privacy setting.

    Given As a Existing user I am on HomePage and navigate to My Health Documents
    When I Click on attach document to add New document "<Details>"
    Then I should verify the newly added document "<Added Details>"
    And Click on more info icon in grid to Verify the details of the specific added Document "<More Info Details>"

    Examples:
      | Details                | Added Details             | More Info Details                   |
      | &NEW_DOCUMENT_DETAILS& | &VERIFY_DOCUMENT_DETAILS& | &VERIFY_DOCUMENT_DETAILS_MORE_INFO& |


#    Note: {
#  323 : Click on Share this to my provider to share the added doc to provider
#  326 : Click & select All to filter - Displays all doc (added by provider, patient & Inactive doc)
#  327 : Click & select Health facility docs to filter - Displays all doc (added by provider)
#  328 : Click & select My docs to filter - Displays all doc (added by patient)
#  329 : Click & select Inactive docs to filter - Displays all doc (Validity expired docs)
#  330 : Click on more info icon in grid to view the details of the specific document added
#  331 : click on edit icon in grid to edit the document that is added

#    These test Case Covered The Scenario NO: S3
#    }
  @WEB  @MY_HEALTH_DOCUMENT @SANITY_PATH
  Scenario Template: S3- Add new document and share with provider

    Given As a Existing user I am on HomePage and navigate to My Health Documents
    When I Click on attach document to add New document "<Details>"
    Then I should verify the newly added document "<Added Details>"
    And Click on more info icon in grid to Verify the details of the specific added Document "<More Info Details>"
    And Click & select All to filter "All"
    And Click & select Health facility docs to filter "Health Facility Documents"
    And Click & select My docs to filter "My Documents"
    And Click & select Inactive docs to filter "Inactive Documents"

    Examples:
      | Details                                    | Added Details                                 | More Info Details                                       |
      | &NEW_DOCUMENT_DETAILS_SHARE_WITH_PROVIDER& | &VERIFY_DOCUMENT_DETAILS_SHARE_WITH_PROVIDER& | &VERIFY_DOCUMENT_DETAILS_MORE_INFO_SHARE_WITH_PROVIDER& |


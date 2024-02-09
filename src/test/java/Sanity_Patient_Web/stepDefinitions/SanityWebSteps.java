package Sanity_Patient_Web.stepDefinitions;


import Sanity_Patient_Web.SanityPageContainer;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class SanityWebSteps {

    private SanityPageContainer sanityPageContainer;

    public SanityWebSteps(SanityPageContainer sanityPageContainer) {

        this.sanityPageContainer = sanityPageContainer;
    }


    @When("I click pay now Button")
    public void iClickPayNowButton() {
        Assert.assertTrue(sanityPageContainer.repeatPrescription.clickPayNow());
        Assert.assertTrue(sanityPageContainer.repeatPrescription.verifyTheSuccessAndNavigateToPaymentPage());

    }

    @Then("I verify Medication Fees and I confirm the Payment details")
    public void iVerifyMedicationFeesAndIConfirmThePaymentDetails() {
    }

    @When("I click pay at health centre Button")
    public void iClickPayAtHealthCentreButton() {
        Assert.assertTrue(sanityPageContainer.repeatPrescription.clickPayAtHealthCentre());
    }

    @And("I should see the status of the Prescription and Verify the Medication{string}")
    public void iShouldSeeTheStatusOfThePrescriptionAndVerifyTheMedication(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(sanityPageContainer.repeatPrescription.verifyThePrescriptionDetails(strMedicationDetails));
    }


//    @And("I enter the Card details on the Payment Page {string}")
//    public void EnterTheCardDetailsOnThePaymentPage(String strCardDetails) {
//
//        System.out.println("strCardDetails " + strCardDetails);
//        List<String> lstStrCardDetails = TestDataUtil.getListOfValue(strCardDetails);
//
//        System.out.println("\n >>> lstStrCardDetails : " + lstStrCardDetails);
//        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectPaymentMethod(lstStrCardDetails.get(0)));
//        Assert.assertTrue(sanityPageContainer.repeatPrescription.enterCardDetails(lstStrCardDetails.get(1), lstStrCardDetails.get(2), lstStrCardDetails.get(3), lstStrCardDetails.get(4), lstStrCardDetails.get(5)));
//        Assert.assertTrue(sanityPageContainer.repeatPrescription.verifyPaymentSuccessForCard());
//        Assert.assertTrue(sanityPageContainer.repeatPrescription.verifyThePrescriptionDetails());
//
//    }


    @Given("As a Existing user I am on HomePage and I click Dashboard")
    public void asAExistingUserIAmOnHomePageAndIClickDashboard() {

//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            Assert.assertTrue(sanityPageContainer.homePage.clickHamburgerIcon());
        }
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());

    }

    @And("View latest three My Repeat Prescription in Repeat Prescription card")
    public void viewLatestThreeMyRepeatPrescriptionInRepeatPrescriptionCard(String strValue) {
        System.out.println("strValue >>> :: " + TestDataUtil.getValue(strValue));
        List<String> lstDetails = TestDataUtil.getListOfValue(strValue);
        System.out.println("lstDetails >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.dashboardPage.verifyRRPInDashboard(lstDetails));
    }

    @And("Navigate to view history page and View Specified Requested RRP Details in Dashboard")
    public void navigateToViewHistoryPageAndViewSpecifiedRequestedRRPDetailsInDashboard(String strValue) {
        System.out.println("strValue >>> :: " + TestDataUtil.getValue(strValue));
        List<String> lstDetails = TestDataUtil.getListOfValue(strValue);
        System.out.println("lstDetails >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.dashboardPage.selectRRP(lstDetails));

    }

    @And("View patient connected Health Centre list in My Health Centre card {string}")
    public void viewPatientConnectedHealthCentreListInMyHealthCentreCard(String strValue) {
        List<String> lstValue = TestDataUtil.getListOfValue(strValue);
        for (String value : lstValue) {
            System.out.println("HEALTH_CENTRE_LOCATION >>> :: " + value);
            Assert.assertTrue(sanityPageContainer.dashboardPage.verifyMyHealthCentreInDashboard((value)));

        }
    }


//    @And("I am on {string} Inbox page")
//    public void iAmOnInboxPage(String strTab) {
//        sanityPageContainer.messagesPage.verifyPatientSentMessage(strTab);
//    }

//    @Then("I should see all the Messages future Grid View in Send page")
//    public void iShouldSeeAllTheMessagesFutureGridViewInSendPage(List<String> locDetails) {
//        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//
//            for (String String : locDetails) {
//                System.out.println(String);
//
//                Assert.assertTrue(sanityPageContainer.messagesPage.VerifySendData(TestDataUtil.getListOfValue(String)));
//            }
//        }
//        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
//            for (String String : locDetails) {
//                System.out.println(String);
//
//                Assert.assertTrue(sanityPageContainer.messagesPage.VerifyMobileSendData(TestDataUtil.getListOfValue(String)));
//            }
//        }
//    }

//    @Given("As a user Launch the {string}")
//    public void asAUserLaunchTheAndLoginWith(String strURL) {
//        Assert.assertTrue(sanityPageContainer.messagesPage.launchInNewTab(TestDataUtil.getValue(strURL)));
//
//    }


    @And("I enter the Compose Message Details and I Click the send message and verify success pop up")
    public void iEnterTheComposeMessageDetailsAndIClickTheSendMessageAndVerifySuccessPopUp(List<String> strDetail) {


        for (String strMessageDetails : strDetail) {
            System.out.println("SENT_MESSAGE_DETAILS_FOR_DASHBOARD >>> :: " + strMessageDetails);
            List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
            System.out.println("List Message Details >>> :: " + lstMessageDetails);
//            Assert.assertTrue(sanityPageContainer.messagesPage.selectHealthCenter(TestDataUtil.getValue(lstMessageDetails.get(0))));
            Assert.assertTrue(sanityPageContainer.messagesPage.selectHealthCenterLocation(TestDataUtil.getValue(lstMessageDetails.get(1))));
            Assert.assertTrue(sanityPageContainer.messagesPage.selectServiceName(TestDataUtil.getValue(lstMessageDetails.get(2))));
            Assert.assertTrue(sanityPageContainer.messagesPage.selectRole(TestDataUtil.getValue(lstMessageDetails.get(3))));
            Assert.assertTrue(sanityPageContainer.messagesPage.selectTo(TestDataUtil.getValue(lstMessageDetails.get(4))));
            Assert.assertTrue(sanityPageContainer.messagesPage.enterSubjectDoctor(TestDataUtil.getValue(lstMessageDetails.get(5))));
            Assert.assertTrue(sanityPageContainer.messagesPage.enableTermAndConditions());
            Assert.assertTrue(sanityPageContainer.messagesPage.enterBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(6))));
            Assert.assertTrue(sanityPageContainer.messagesPage.attachTheFile(TestDataUtil.getValue(lstMessageDetails.get(7))));

            Assert.assertTrue(sanityPageContainer.messagesPage.clickSendMessageAndNavigateToHomePage());

        }
    }

    @Then("I navigate to Sent items and verify the Sent Message Details")
    public void iNavigateToSentItemsAndVerifyTheSentMessageDetails(List<String> strDetails) {

//        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToDoctorHomepage());
        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToSentItems());
        for (String strMessageDetails : strDetails) {
            List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
            System.out.println("List Message Details >>> :: " + lstMessageDetails);
            Assert.assertTrue(sanityPageContainer.messagesPage.verifySentMessages(TestDataUtil.getValue(lstMessageDetails.get(5))));

        }
    }


//    @Then("I download the attachment file and delete the downloaded attachment file")
//    public void iDownloadTheAttachmentFileAndDeleteTheDownloadedAttachmentFile() {
//        sanityPageContainer.messagesPage.clickInboxAttachButton();
//        sanityPageContainer.messagesPage.VerifyAttachdowloadSuccessfully();
//        sanityPageContainer.messagesPage.DeleteFile();
//    }

    @And("I move the Received {string} into Archive")
    public void iMoveTheReceivedIntoArchive(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(sanityPageContainer.messagesPage.moveReceivedMessageIntoArchive(TestDataUtil.getValue(lstMessageDetails.get(5))));

    }


    @And("I move the Sent Message into Archive and verify the Archive {string}")
    public void iMoveTheSentMessageIntoArchiveAndVerifyTheArchive(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(sanityPageContainer.messagesPage.moveSentMessageIntoArchive(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToArchive());
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyPatientSentMessageInArchive(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.messagesPage.VerifyBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(6))));

    }

    @And("I move Archive Message into sent Items and Verify the Sent {string}")
    public void iMoveArchiveMessageIntoSentItemsAndVerifyTheSent(String strMessageDetails) {

        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToArchive());
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyPatientSentMessageInArchive(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.messagesPage.VerifyBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(6))));
        Assert.assertTrue(sanityPageContainer.messagesPage.moveArchiveIntoSentMessage(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToPatientSentItems());
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyArchivedMovedToSent(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.messagesPage.VerifyBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(6))));


    }


    @And("I Select multiple messages in the Inbox")
    public void iSelectMultipleMessagesInTheInbox() {
        Assert.assertTrue(sanityPageContainer.messagesPage.SelectAllInboxMessage());
    }

    @When("I Click Mark as UnRead")
    public void iClickMarkAsUnRead() {
        Assert.assertTrue(sanityPageContainer.messagesPage.ClickMarkAsUnRead());
    }


    @Then("I should verify the UnRead Messages")
    public void iShouldVerifyTheUnReadMessages() {
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyMarkAsUnRead());
    }

    @Then("I should verify the Read Messages")
    public void iShouldVerifyTheReadMessages() {
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyMarkAsRead());
    }

    @When("I Click Archive")
    public void iClickArchive() {
        Assert.assertTrue(sanityPageContainer.messagesPage.ClickArchive());
    }

    @Then("I should see the Archive Success Pop message")
    public void iShouldSeeTheArchiveSuccessPopMessage() {
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyArchive());
        Assert.assertTrue(sanityPageContainer.messagesPage.navigateToArchiveAndUndoAllArchiveMessages());

    }

    @When("I Click Mark as Read")
    public void iClickMarkAsRead() {

        Assert.assertTrue(sanityPageContainer.messagesPage.ClickMarkAsRead());
    }


    @When("I am on Draft page {string}")
    public void iAmOnDraftPage(String strMessage) {
        List<String> lstStrMessage = TestDataUtil.getListOfValue(strMessage);
        System.out.println(lstStrMessage);
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyDraftHeader(TestDataUtil.getValue(lstStrMessage.get(4))));
    }


//    @Then("I should see all the Messages future Grid View in Draft page")
//    public void iShouldSeeAllTheMessagesFutureGridViewInDraftPage(String strMessageDetails) {
//        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
//            System.out.println("List Message Details >>> :: " + lstMessageDetails);
//
//            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(strMessageDetails));
//            Assert.assertTrue(sanityPageContainer.messagesPage.VerifyDraftMessage(TestDataUtil.getListOfValue(strMessageDetails)));
//            Assert.assertTrue(sanityPageContainer.messagesPage.VerifyBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(4))));
//
//        }
//        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
//            List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
//            System.out.println("List Message Details >>> :: " + lstMessageDetails);
//
//            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(strMessageDetails));
//            Assert.assertTrue(sanityPageContainer.messagesPage.VerifyMobileDraftMessage(TestDataUtil.getListOfValue(strMessageDetails)));
//            Assert.assertTrue(sanityPageContainer.messagesPage.VerifyBodyMessage(TestDataUtil.getValue(lstMessageDetails.get(4))));
//
//        }
//    }

    @And("I Click Delete All under draft")
    public void iClickDeleteAllUnderDraft() {
        Assert.assertTrue(sanityPageContainer.messagesPage.clickDeleteAllUnderDraft());
    }


//    @And("I send the group message to the patient users")
//    public void iSendTheGroupMessageToThePatientUsers() {
//        Assert.assertTrue(sanityPageContainer.messagesPage.clickGroupMessageAndNavigateToHomePage());
//    }


    @And("I verify the provider sent Group{string}")
    public void iVerifyTheProviderSentGroup(String strGroupMesssage) {
        List<String> listGroupMessage = TestDataUtil.getListOfValue(strGroupMesssage);
        Assert.assertTrue(sanityPageContainer.messagesPage.verifyPatientReceivedGroupMessage((listGroupMessage.get(4)), listGroupMessage.get(5)));


    }

    @And("I move the Received Group {string} into Archive")
    public void iMoveTheReceivedGroupIntoArchive(String strMessageDetails) {

        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(sanityPageContainer.messagesPage.moveReceivedMessageIntoArchive(TestDataUtil.getValue(lstMessageDetails.get(5))));

    }


    @And("I log out from Patient Portal")
    public void iLogOutFromPatientPortal() {
        Assert.assertTrue(sanityPageContainer.messagesPage.patientLogOut());
    }

    @And("I Disable Out of Setting")
    public void iDisableOutOfSetting() {

        Assert.assertTrue(sanityPageContainer.messagesPage.selectOutOfOfficeSetting());
        Assert.assertTrue(sanityPageContainer.messagesPage.disableOutOfOfficeChkBox());
        Assert.assertTrue(sanityPageContainer.messagesPage.clickSaveButton());

    }

//    @And("I click the Out of Office Settings and Enable Out Of Office Reply option")
//    public void iClickTheOutOfOfficeSettingsAndEnableOutOfOfficeReplyOption() {
//        Assert.assertTrue(sanityPageContainer.messagesPage.selectOutOfOfficeSetting());
//        Assert.assertTrue(sanityPageContainer.messagesPage.enableOutOfOfficeChkBox());
//    }


    @And("I log out from Patient Portal and Verify the Login page")
    public void iLogOutFromPatientPortalAndVerifyTheLoginPage() {
        Assert.assertTrue(sanityPageContainer.messagesPage.patientLogOut());

    }


    @Given("As a Existing user I am on HomePage and I navigate to change password in the My Profile")
    public void asAExistingUserIAmOnHomePageAndINavigateToChangePasswordInTheMyProfile() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToChangePassword());

    }

    @When("I click Update Button")
    public void iClickUpdateButton() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickPasswordUpdateButton());
    }

    @And("I enter the {string} and New {string}")
    public void iEnterTheAndNew(String strCurrentPassword, String strNewPassword) {

        System.out.println("strCurrentPassword >>> :: " + TestDataUtil.getValue(strCurrentPassword));
        System.out.println("strNewPassword >>> :: 1 " + TestDataUtil.getValue(strNewPassword));

        Assert.assertTrue(sanityPageContainer.profilesPage.enterCurrentPassword(TestDataUtil.getValue(strCurrentPassword)));
        Assert.assertTrue(sanityPageContainer.profilesPage.enterNewPassword(TestDataUtil.getValue(strNewPassword)));

    }

    @Then("I should see the Password changed Success Popup")
    public void iShouldSeeThePasswordChangedSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyPasswordSuccess());
    }

    @Then("I should see the Address changed Success Popup")
    public void iShouldSeeTheAddressChangedSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyAddressSuccess());
    }

    @And("I enter the New {string}")
    public void iEnterTheNew(String strNewAddress) {
        System.out.println("strNewAddress >>> :: " + TestDataUtil.getValue(strNewAddress));
        Assert.assertTrue(sanityPageContainer.profilesPage.enterNewAddress(strNewAddress));
    }

    @Given("As a Existing user I am on HomePage and I navigate to change address in the My Profile")
    public void asAExistingUserIAmOnHomePageAndINavigateToChangeAddressInTheMyProfile() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToChangeAddress());

    }

    @And("I verify the New {string}")
    public void iVerifyTheTheNew(String strNewAddress) {
        System.out.println("strNewAddress >>> :: " + strNewAddress);
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyTheNewAddress(strNewAddress));

    }

    @Given("As a Existing user I am on HomePage and I navigate to change Phone number in the My Profile")
    public void asAExistingUserIAmOnHomePageAndINavigateToChangePhoneNumberInTheMyProfile() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToChangePhoneNumber());

    }

    @Then("I should see the Phone number changed Success Popup")
    public void iShouldSeeThePhoneNumberChangedSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyPhoneNumberSuccess());
    }

    @And("I enter the New Phone {string}")
    public void iEnterTheNewPhone(String strNewPhoneNumber) {
        Assert.assertTrue(sanityPageContainer.profilesPage.enterNewPhoneNumber(strNewPhoneNumber));

    }

    @And("I navigate to Profile and I see View Profile tab")
    public void iNavigateToProfileAndISeeViewProfileTab() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToViewProfile());
    }

    @And("I navigate to View Profile and I see My Health Centres")
    public void iNavigateToViewProfileAndISeeMyHealthCentres() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyHealthCentres());

    }

    @And("I navigate to View Profile and I see My Subscriptions")
    public void iNavigateToViewProfileAndISeeMySubscriptions() {

//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMySubscriptions());
    }

    @And("I navigate to View Profile and I see Access Information")
    public void iNavigateToViewProfileAndISeeAccessInformation() {

//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToAccessInformation());
    }

    @Given("As a Existing user I am on HomePage and I navigate to Emergency Contacts in the My Profile")
    public void asAExistingUserIAmOnHomePageAndINavigateToEmergencyContactsInTheMyProfile() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToEmergencyContacts());
        Assert.assertTrue(sanityPageContainer.profilesPage.deleteAllEmergencyContact());
    }

    @And("I enter the New Emergency Contact{string}")
    public void iEnterTheNewEmergencyContact(String strContactDetails) {
        System.out.println("strContactDetails >>> :: " + TestDataUtil.getValue(strContactDetails));
        Assert.assertTrue(sanityPageContainer.profilesPage.enterTheNewEmergencyContactDetails(strContactDetails));

    }

    @And("I click Add New Contact Button")
    public void iClickAddNewContactButton() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickEmergencyContacts());
    }

    @When("I click Add Contact Button and verify the Success Popup")
    public void iClickAddContactButtonAndVerifyTheSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickAddContactButton());

    }

    @Then("I verify the Added Emergency Contact Details {string} view")
    public void iVerifyTheAddedEmergencyContactDetailsView(String strContactDetails) {
        System.out.println("strContactDetails >>> :: " + TestDataUtil.getValue(strContactDetails));
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyAddedContactDetailsInGrid(strContactDetails));

    }

    @And("I verify the Added Emergency Contact details In {string} And {string}")
    public void iVerifyTheAddedEmergencyContactDetailsInAnd(String strGridDetails, String strMoreInfo) {
        System.out.println("strContactDetails step >>> :: " + TestDataUtil.getValue(strGridDetails));
        System.out.println("strContactDetails step >>> :: " + TestDataUtil.getValue(strMoreInfo));

        Assert.assertTrue(sanityPageContainer.profilesPage.verifyAddedMoreInfoContactDetails(strGridDetails, strMoreInfo));

    }

    @Given("As a Existing user I am on HomePage and I navigate to Calendar in the Profile module")
    public void asAExistingUserIAmOnHomePageAndINavigateToCalendarInTheProfileModule() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToMyProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.mouseOverProfile());
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToCalendar());
    }

    @And("I view the calendar in the Day,Week and Month view format")
    public void iViewTheCalendarInTheDayWeekAndMonthViewFormat() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickDayView());
        Assert.assertTrue(sanityPageContainer.profilesPage.clickWeekView());
        Assert.assertTrue(sanityPageContainer.profilesPage.clickMonthView());
    }

    @And("I navigate to Calendar settings")
    public void iNavigateToCalendarSettings() {
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToCalendarSettings());
    }

    @When("I modify the General calendar settings {string}")
    public void iModifyTheGeneralCalendarSettings(String strDetails) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.clickGeneral());
        Assert.assertTrue(sanityPageContainer.profilesPage.selectDateFormat(lstDetails.get(0)));
        Assert.assertTrue(sanityPageContainer.profilesPage.selectTimeFormat(lstDetails.get(1)));
        Assert.assertTrue(sanityPageContainer.profilesPage.selectWeekStarts(lstDetails.get(2)));
        Assert.assertTrue(sanityPageContainer.profilesPage.selectDefaultView(lstDetails.get(3)));
        Assert.assertTrue(sanityPageContainer.profilesPage.selectCustomView(lstDetails.get(4)));


    }

    @Then("I navigate to General setting and verify the modified General calendar settings {string}")
    public void iNavigateToGeneralSettingAndVerifyTheModifiedGeneralCalendarSettings(String strDetails) {
        System.out.println("lstDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToCalendarSettings());
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyCalendarSetting(strDetails));

    }

    @When("I click the save button for General Calendar settings and Verify the Success Popup")
    public void iClickTheSaveButtonForGeneralCalendarSettingsAndVerifyTheSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickSaveButton());

    }

    @And("I add the Categories {string} in the calendar settings")
    public void iAddTheCategoriesInTheCalendarSettings(String strDetails) {

        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);

        Assert.assertTrue(sanityPageContainer.profilesPage.clickCategories());
        Assert.assertTrue(sanityPageContainer.profilesPage.deleteAllCategories());
        Assert.assertTrue(sanityPageContainer.profilesPage.clickAddCategoryButton());
        Assert.assertTrue(sanityPageContainer.profilesPage.addCategory(strDetails));

    }

    @When("I click the Update button for category Calendar settings and Verify the Success Popup")
    public void iClickTheUpdateButtonForCategoryCalendarSettingsAndVerifyTheSuccessPopup() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickUpdateButton());
    }

    @Then("I navigate to categories and verify the Added Category {string}")
    public void iNavigateToCategoriesAndVerifyTheAddedCategory(String strDetails) {

        Assert.assertTrue(sanityPageContainer.profilesPage.verifyCategories((strDetails)));
    }

    @And("I open the event page in the calendar")
    public void iOpenTheEventPageInTheCalendar() {
        Assert.assertTrue(sanityPageContainer.profilesPage.openEventPage());

    }

    @And("I enter the Event {string} in the calendar")
    public void iEnterTheEventInTheCalendar(String strDetails) {
        System.out.println("strDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.enterEventDetails(strDetails));
    }

    @When("I click the Event save button")
    public void iClickTheEventSaveButton() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickEventSaveButton());
    }


    @And("I delete the create event {string} in the calendar")
    public void iDeleteTheCreateEventInTheCalendar(String strDetails) {

        System.out.println("strDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.deleteCreatedEvent(strDetails));
    }

    @Then("I verify the created event {string} in the calendar")
    public void iVerifyTheCreatedEventInTheCalendar(String strDetails) {
        System.out.println("strDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.verifyCreatedEvent(strDetails));
    }

    @And("I Edit the created event {string} in the calendar")
    public void iEditTheCreatedEventInTheCalendar(String strDetails) {
        System.out.println("strDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.editEventDetails(strDetails));

    }

    @Given("As a Existing user I am on HomePage and I click to Practice {string} under the My health menu")
    public void asAExistingUserIAmOnHomePageAndIClickToPracticeUnderTheMyHealthMenu(String strName) {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.clickPracticeName(TestDataUtil.getValue(strName)));


    }

    @And("I am on HomePage and I click Notice board under the My health menu")
    public void iAmOnHomePageAndIClickNoticeBoardUnderTheMyHealthMenu() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.clickNoticeBoard());

    }

    @And("I am on HomePage and I click connect health centre under the My health menu")
    public void iAmOnHomePageAndIClickConnectHealthCentreUnderTheMyHealthMenu() {

//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.clickConnectToHealthCentre());
    }


    @Given("As a Existing user I am on HomePage and I click the Health Records")
    public void asAExistingUserIAmOnHomePageAndIClickTheHealthRecords() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
            Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            Assert.assertTrue(sanityPageContainer.homePage.clickDashBoardForMobile());
            Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());

        }
    }

    ////
////
    @When("I click on {string} Prescription Page")
    public void iClickOnPrescriptionPage(String strHealthCenter) {
//        List<String> lstFilterDropDown = TestDataUtil.getListOfValue(strHealthCenter);
        sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenu(strHealthCenter);
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectEntriesFromHealthCentre());
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(lstFilterDropDown.get(0))));
    }


    @And("I click on the more info icon to see all the Prescription Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllThePrescriptionEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickPrescriptionsIcon(list1, list2));
            }
        }
    }


    @And("I select My Entries {string} & I Should see all My entries Prescription medicine details")
    public void iSelectMyEntriesIShouldSeeAllMyEntriesPrescriptionMedicineDetails(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));
    }

    @And("I click on add record & Enter the Medicine Details")
    public void iClickOnAddRecordEnterTheMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionsMedicationName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDose());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionsDose(TestDataUtil.getValue(listCreateData.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectPrescriptiondropdown(TestDataUtil.getValue(listCreateData.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectPrescriptiondropdown1(TestDataUtil.getValue(listCreateData.get(3))));
            sanityPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
            sanityPageContainer.myHealthRecordsPage.enterPrescriptionEndDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionAdditionalInformation(TestDataUtil.getValue(listCreateData.get(4))));
            sanityPageContainer.myHealthRecordsPage.clickPrescriptionCheckBox();

        }
    }


    @And("I click on Confirm & Save Button")
    public void iClickOnConfirmSaveButton() {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickPrescriptionSave());

    }

    @When("I click on {string}edit icon & I Edit Prescription of My Entries records {string}")
    public void iClickOnEditIconIEditPrescriptionOfMyEntriesRecords(String strCreatedRecord, String strFrequencyLocation) {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickPrescriptionsEditButton(TestDataUtil.getValue(strCreatedRecord)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFrequency(TestDataUtil.getValue(strFrequencyLocation)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickPrescriptionsSaveButton());
        }

    }


    @And("I click on Delete Icon {string}& I verify the Prescription My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyThePrescriptionMyEntriesRecordIsDeleted(String strCreatedRecord) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());
    }

    @And("I select My Entries {string}")
    public void iSelectMyEntries(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenu(strOption));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));
    }

    @And("I click on Add record & Enter the Medicine Details")
    public void iClickOnaddRecordEnterTheMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionsMedicationName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDose());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionsDose(TestDataUtil.getValue(listCreateData.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectPrescriptiondropdown(TestDataUtil.getValue(listCreateData.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectPrescriptiondropdown1(TestDataUtil.getValue(listCreateData.get(3))));
            sanityPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionEndDate());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterPrescriptionAdditionalInformation(TestDataUtil.getValue(listCreateData.get(4))));
            sanityPageContainer.myHealthRecordsPage.unCheckSharePrescription();

        }

    }

    //
    @And("I click on the more info icon to see all the Allergies Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheAllergiesEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickAllergiesIconLocator(list1, list2));
            }
        }

    }

    @And("I click on add record & Enter the Allergies Medicine Details")
    public void iClickOnaddRecordEnterTheAllergiesMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAllergicConditionName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectAllergicdropdown(TestDataUtil.getValue(listCreateData.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectAllergicdropdown1(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.enterAllergiesStartDate();
            sanityPageContainer.myHealthRecordsPage.enterAllergiesEndDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAllergiesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(3))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAllergiesCheckBox());

        }

    }

    @And("I click on Allergies Confirm & Save Button")
    public void iClickOnAllergiesConfirmSaveButton() {

        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAllergiesSave());
    }

    @And("I select the Medication details {string}")
    public void iSelectTheMedicationDetails(String strMedicationDetails) {
        System.out.println("\nMedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("\nlstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("\nSize Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));
        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectUrgency(lstMedicationDetails.get(3)));
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            Assert.assertTrue(sanityPageContainer.repeatPrescription.clickNextButton());
            Assert.assertTrue(sanityPageContainer.repeatPrescription.selectMedicationsToRepeatForMobile(lstMedicationDetails.get(4)));
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.repeatPrescription.selectMedicationsToRepeat(lstMedicationDetails.get(4)));
        }
        Assert.assertTrue(sanityPageContainer.repeatPrescription.addMessage(lstMedicationDetails.get(5)));
        Assert.assertTrue(sanityPageContainer.repeatPrescription.selectTermsAndCondition());

    }

    @When("I click on {string}edit icon & I Edit Allergies of My Entries records {string}")
    public void iClickOnEditIconIEditAllergiesOfMyEntriesRecords(String strCreatedRecord, String strFrequencyLocation) {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAllergiesEditButton(TestDataUtil.getValue(strCreatedRecord)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectSeverity(TestDataUtil.getValue(strFrequencyLocation)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAllergiesSaveButton());
        }

    }

    @Then("I should see all the  Allergies My Entries Medicine details in more info")
    public void iShouldSeeAllTheAllergiesMyEntriesMedicineDetailsInMoreInfo(DataTable dataTable) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                System.out.println(strKey);
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(list1);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyAllergiesShareDoctorData(list1, list2));
            }
        }
    }

    @And("I click on Delete Icon {string}& I verify the  Allergies My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheAllergiesMyEntriesRecordIsDeleted(String strCreatedRecord) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());
    }

    @And("I click on Add record & Enter the Allergies Medicine Details")
    public void iClickOnAddRecordEnterTheAllergiesMedicineDetails(List<String> listCreateData) {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAllergicConditionName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectAllergicdropdown(TestDataUtil.getValue(listCreateData.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectAllergicdropdown1(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.enterAllergiesStartDate();
            sanityPageContainer.myHealthRecordsPage.enterAllergiesEndDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAllergiesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(3))));
            sanityPageContainer.myHealthRecordsPage.clickAllergiesUnCheckBox();

        }

    }


    @When("I click on {string} Allergies Page")
    public void iClickOnAllergiesPage(String lstAppointmentDetails) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuAllergies(lstAppointmentDetails));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectEntriesFromHealthCentre());
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(lstAppointmentDetails)));
    }

    @And("I select My Entries {string} Allergies Page")
    public void iSelectMyEntriesAllergiesPage(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuAllergies(strOption));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));
    }

    @When("I click on {string}Immunisations Page")
    public void iClickOnImmunisationsPage(String lstAppointmentDetails) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuImmunisations(lstAppointmentDetails));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectEntriesFromHealthCentre());
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(lstAppointmentDetails)));
    }


    @And("I click on the more info icon to see all the Immunisations Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheImmunisationsEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickImmunisationsIconLocator(list1, list2));
            }
        }
//
    }

    @And("I select My Entries {string}Immunisations Page")
    public void iSelectMyEntriesImmunisationsPage(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuImmunisations(strOption));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));

    }

    @And("I click on add record & Enter the Immunisations Medicine Details")
    public void iClickOnaddRecordEnterTheImmunisationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterImmunisationVaccineName(TestDataUtil.getValue(listCreateData.get(0))));
            sanityPageContainer.myHealthRecordsPage.enterImmunisationDateGiven();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAdditionalInformation(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.clickImmuCheckBox();

        }
    }

    @And("I click on Immunisations Confirm & Save Button")
    public void iClickOnImmunisationsConfirmSaveButton() {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickImmunisationSave());
//        sanityPageContainer.myHealthRecordsPage.RefreshPage();
    }

    @When("I click on {string}edit icon & I Edit Immunisations of My Entries records {string}")
    public void iClickOnEditIconIEditImmunisationsOfMyEntriesRecords(String strCreatedRecord, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickEditButton(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAdditionalInformation(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickImmunisationsSaveButton());
    }

    @Then("I should see all the  Immunisations My Entries Medicine details in more info")
    public void iShouldSeeAllTheImmunisationsMyEntriesMedicineDetailsInMoreInfo(DataTable dataTable) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                System.out.println(strKey);
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(list1);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyImmunisationShareDoctorData(list1, list2));
            }
        }
    }

    @And("I click on Delete Icon {string}& I verify the Immunisations My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheImmunisationsMyEntriesRecordIsDeleted(String strCreatedRecord) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());


    }

    @And("I click on Add record & Enter the Immunisations Medicine Details")
    public void iClickOnAddRecordEnterTheImmunisationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterImmunisationVaccineName(TestDataUtil.getValue(listCreateData.get(0))));
            sanityPageContainer.myHealthRecordsPage.enterImmunisationDateGiven();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterAdditionalInformation(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.clickImmuUnCheckBox();
        }
    }

    @And("I click on add record & Enter the COVIDImmunisations Medicine Details")
    public void iClickOnaddRecordEnterTheCOVIDImmunisationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectCovidImmunisationsdropdown(TestDataUtil.getValue(listCreateData.get(0))));
//            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidDose());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterCovidImmunisationBatchNo(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterCovidImmunisationDateGiven();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterCovidClinicalSite(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.clickCovidCheckBox();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidAddFile(TestDataUtil.getValue(listCreateData.get(3))));


        }
    }

    @And("I click on COVIDImmunisations Confirm & Save Button")
    public void iClickOnCOVIDImmunisationsConfirmSaveButton() {
        sanityPageContainer.myHealthRecordsPage.clickCovidSave();
//        sanityPageContainer.myHealthRecordsPage.RefreshPage();
    }

    @When("I click on edit icon & I Edit COVIDImmunisations of My Entries records {string}")
    public void iClickOnEditIconIEditCOVIDImmunisationsOfMyEntriesRecords(String listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidEditButton());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterCovidClinicalSite(TestDataUtil.getValue(listCreateData)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidImmunisationsUpdateButton());
        }
    }


    @And("I click on Delete Icon & I verify the COVIDImmunisations My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheCOVIDImmunisationsMyEntriesRecordIsDeleted() {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidDelete());
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());
    }

    @And("I click on Add record & Enter the COVIDImmunisations Medicine Details")
    public void iClickOnAddRecordEnterTheCOVIDImmunisationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectCovidImmunisationsdropdown(TestDataUtil.getValue(listCreateData.get(0))));
//            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidDose());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterCovidImmunisationBatchNo(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterCovidImmunisationDateGiven();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterCovidClinicalSite(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.clickCovidUnCheckBox();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCovidAddFile(TestDataUtil.getValue(listCreateData.get(3))));

        }

    }


    @When("I click on {string} Classifications Page")
    public void iClickOnClassificationsPage(String lsClassificationsDetails) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClassifications(lsClassificationsDetails));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectEntriesFromHealthCentre());
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(lsClassificationsDetails)));

    }


    @And("I click on the more info icon to see all the Classifications Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheClassificationsEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickClassificationsIconLocator(list1, list2));
            }
        }

    }

    @And("I select My Entries {string} Classifications Page")
    public void iSelectMyEntriesClassificationsPage(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClassifications(strOption));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));
    }

    @And("I click on add record & Enter the  Classifications Medicine Details")
    public void iClickOnaddRecordEnterTheClassificationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterConditionName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectClassificationsdropdown(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterStartDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterEndDate());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterClassiAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickClassiCheckBox());
        }

    }

    @And("I click on Classifications Confirm & Save Button")
    public void iClickOnClassificationsConfirmSaveButton() {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickClassificationsSave());
    }

    @When("I click on {string}edit icon & I Edit  Classifications of My Entries records {string}")
    public void iClickOnEditIconIEditClassificationsOfMyEntriesRecords(String strCreatedRecord, String strStatusLocation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickClassificationsEditButton(TestDataUtil.getValue(strCreatedRecord)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectStatus(TestDataUtil.getValue(strStatusLocation)));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickClassificationsSaveButton());
        }

    }

    @Then("I should see all the  Classifications My Entries Medicine details in more info")
    public void iShouldSeeAllTheClassificationsMyEntriesMedicineDetailsInMoreInfo(DataTable dataTable) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                System.out.println(strKey);
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(list1);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyClassificationShareDoctorData(list1, list2));
            }
        }

    }

    @And("I click on Delete Icon {string}& I verify the  Classifications My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheClassificationsMyEntriesRecordIsDeleted(String strCreatedRecord) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());

    }

    @And("I click on Add record & Enter the  Classifications Medicine Details")
    public void iClickOnAddRecordEnterTheClassificationsMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterConditionName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectClassificationsdropdown(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterStartDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterEndDate());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterClassiAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.clickClassiUnCheckBox();

        }

    }

    @When("I click on Lab Results Page")
    public void iClickOnLabResultsPage() {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuLabResults());

    }

    @Then("I should see all theLab Results Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheLabResultsEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> LabResultsDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            for (String String : LabResultsDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyLabResultsTableData(TestDataUtil.getListOfValue(String)));
            }
        }

    }

    @And("I click on the more info icon to see all the Lab Results Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheLabResultsEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(">> TestDataUtil list2 : " + list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickLabResultsIconLocator(list1, list2));
            }
        }

    }

    @And("I click on the more info icon to see all the Test Results Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheTestResultsEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickLabResultsIconLocatorVerifyTestResults(list1, list2));
            }
        }

    }


    @When("I click on {string} Clinic Notes Page")
    public void iClickOnClinicNotesPage(String lstClinicNotesDetails) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClinicNotes(lstClinicNotesDetails));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(lstClinicNotesDetails)));
    }


    @And("I click on the more info icon to see all theClinic Notes Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheClinicNotesEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickClinicNotesIconLocator(list1, list2));
            }
        }

    }

    @And("I select My Entries {string} Clinic Notes Page")
    public void iSelectMyEntriesClinicNotesPage(String strOption) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClinicNotes(strOption));
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.selectFilter(TestDataUtil.getValue(strOption)));
    }

    @And("I click on add record & Enter the Clinic Notes Medicine Details")
    public void iClickOnaddRecordEnterTheClinicNotesMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterVistedName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterVisitedLocation(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterVisitedDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterClinicianNotesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickCheckBox());

        }

    }

    @And("I click on Clinic Notes Confirm & Save Button")
    public void iClickOnClinicNotesConfirmSaveButton() {

        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickSave());
    }

    @When("I click on {string}edit icon & I Edit  Clinic Notes of My Entries records {string}")
    public void iClickOnEditIconIEditClinicNotesOfMyEntriesRecords(String strCreatedRecord, String strEditLocation) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickEditButton(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterVisitedLocation(TestDataUtil.getValue(strEditLocation)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickClinicianNotesSaveButton());
    }

    @Then("I should see all the  Clinic Notes My Entries Medicine details in more info")
    public void iShouldSeeAllTheClinicNotesMyEntriesMedicineDetailsInMoreInfo(DataTable dataTable) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                System.out.println(strKey);
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(list1);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyClinicanNotesShareDoctorData(list1, list2));
            }
        }

    }

    @And("I click on Delete Icon {string}& I verify the Clinic Notes My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheClinicNotesMyEntriesRecordIsDeleted(String strCreatedRecord) {
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord)));
        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.verifyDeletedRecord());

    }

    @And("I click on Add record & Enter the Clinic Notes Medicine Details")
    public void iClickOnAddRecordEnterTheClinicNotesMedicineDetails(List<String> listCreateData) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickAddRecord());
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterVistedName(TestDataUtil.getValue(listCreateData.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterVisitedLocation(TestDataUtil.getValue(listCreateData.get(1))));
            sanityPageContainer.myHealthRecordsPage.enterVisitedDate();
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.enterClinicianNotesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2))));
            sanityPageContainer.myHealthRecordsPage.clickUnCheckBox();

        }

    }

    @When("I click on Recalls Page")
    public void iClickOnRecallsPage() {

    }


    @And("I click on the more info icon to see all the Recalls Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheRecallsEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue1());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(">> TestDataUtil list2 : " + list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickRecallsIconLocator(list1, list2));
            }
        }

    }

    @And("I should see all the Recall Remainder Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheRecallRemainderEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> RecallsRemainderDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            for (String String : RecallsRemainderDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.VerifyRecallsTableData(TestDataUtil.getListOfValue(String)));
            }
        }

    }

    @And("I click on the more info icon to see all the Recall Remainder Entries From the Health center Medicine details")
    public void iClickOnTheMoreInfoIconToSeeAllTheRecallRemainderEntriesFromTheHealthCenterMedicineDetails(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(">> TestDataUtil list2 : " + list2);
                Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.ClickRecallsRemainderIconLocator(list1, list2));
            }
        }


    }


//    @And("I navigate to the Homepage")
//    public void iNavigateToTheHomepage() {
//
//        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionMenu());
//            Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickDashboardFromMenu());
//        }
//
//    }

    @Then("Navigate to Edit Profile page from Health Summary page")
    public void navigateToEditProfilePageFromHealthSummaryPage() {
//        Assert.assertTrue(sanityPageContainer.myHealthRecordsPage.clickEditProfile());
//        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
    }

    @Given("As a Existing user I am on HomePage and I click the My Health Indicators")
    public void asAExistingUserIAmOnHomePageAndIClickTheMyHealthIndicators() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMyHealthIndicatorsOptionFromMenu());
    }

    @And("I click the view summary button")
    public void iClickTheViewSummaryButton() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());

    }

    @And("I should see last three Entries of Medicine details in the dashboard")
    public void iShouldSeeLastThreeEntriesOfMedicineDetailsInTheDashboard(List<String> strValue) {

        for (String value : strValue) {
            List<String> lstValue = TestDataUtil.getListOfValue(value);
            Assert.assertTrue(sanityPageContainer.dashboardPage.verifyMyHealthIndicatorEntriesInDashboard((lstValue)));

        }
    }

    @And("I navigate to Dashboard")
    public void iNavigateToDashboard() {
        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            Assert.assertTrue(sanityPageContainer.homePage.clickHamburgerIcon());
        }
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
    }

    @And("I click on add new Button & Enter the Medicine Details")
    public void iClickOnAddNewButtonEnterTheMedicineDetails(List<String> lstValue) {

        System.out.println("str >>> :: " + lstValue);

        String strValueForAlcohol = lstValue.get(0);
        String strValueForBloodSugar = lstValue.get(1);
        String strValueForBloodPressure = lstValue.get(2);

        System.out.println("strValueForBloodSugar >>> :: " + strValueForAlcohol);
        System.out.println("strValueForBloodSugar >>> :: " + strValueForBloodSugar);
        System.out.println("strValueForBloodSugar >>> :: " + strValueForBloodPressure);


        if (strValueForAlcohol.contains("ALCOHOL")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForAlcohol);
            System.out.println("List str Value For Alcohol >>> :: " + lstStrValue);
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectAlcoholHealthIndicator(TestDataUtil.getValue(lstStrValue.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.SelectAlcohol(TestDataUtil.getValue(lstStrValue.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectAlcoholComments(TestDataUtil.getValue(lstStrValue.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(lstStrValue.get(3))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcoholConfirmButton());

        } else {
            System.out.println("Failed to enter into ALCOHOL >>> :: ");
        }

        if (strValueForBloodSugar.contains("BLOOD_SUGAR")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForBloodSugar);
            System.out.println("List str Value For BLOOD SUGAR >>> :: " + lstStrValue);

            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugar());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());

            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarHealthIndicator(TestDataUtil.getValue(lstStrValue.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(lstStrValue.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarComments(TestDataUtil.getValue(lstStrValue.get(2))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(lstStrValue.get(3))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugarConfirmButton());

        } else {
            System.out.println("Failed to enter into BLOOD_SUGAR >>> :: ");
        }


        if (strValueForBloodPressure.contains("BLOOD_PRESSURE")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForBloodPressure);

            System.out.println("List strValue For BloodPressure >>> :: " + lstStrValue);
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());

            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureHealthIndicator(TestDataUtil.getValue(lstStrValue.get(0))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterSystolicMedicationName(TestDataUtil.getValue(lstStrValue.get(1))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterDiatolicMedicationName(TestDataUtil.getValue(lstStrValue.get(2))));
//        sanityPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureComments(TestDataUtil.getValue(lstStrValue.get(3))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(lstStrValue.get(4))));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureConfirmButton());
        } else {
            System.out.println("Failed to enter into BLOOD Pressure >>> :: ");
        }

    }

    @Then("I should see all My Entries Medicine details in the grid view")
    public void iShouldSeeAllMyEntriesMedicineDetailsInTheGridView(List<String> lstValue) {
        System.out.println("str >>> :: " + lstValue);

        String strValueForAlcohol = lstValue.get(0);
        String strValueForBloodSugar = lstValue.get(1);
        String strValueForBloodPressure = lstValue.get(2);

        System.out.println("strValueForBloodSugar >>> :: " + strValueForAlcohol);
        System.out.println("strValueForBloodSugar >>> :: " + strValueForBloodSugar);
        System.out.println("strValueForBloodSugar >>> :: " + strValueForBloodPressure);

        if (strValueForAlcohol.contains("ALCOHOL")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForAlcohol);
            System.out.println("List str Value For Alcohol >>> :: " + lstStrValue);
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyAlcoholMyEntriesTableData(TestDataUtil.getListOfValue(strValueForAlcohol)));

        } else {
            System.out.println("Failed to enter into ALCOHOL >>> :: ");
        }


        if (strValueForBloodSugar.contains("BLOOD_SUGAR")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForBloodSugar);
            System.out.println("List str Value For Anxiety >>> :: " + lstStrValue);
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugar());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodSugarMyEntriesTableData(TestDataUtil.getListOfValue(strValueForBloodSugar)));

        } else {
            System.out.println("Failed to enter into BLOOD_SUGAR >>> :: ");
        }
        if (strValueForBloodPressure.contains("BLOOD_PRESSURE")) {
            List<String> lstStrValue = TestDataUtil.getListOfValue(strValueForBloodPressure);

            System.out.println("List strValue For BloodPressure >>> :: " + lstStrValue);
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureMyEntriesTableData(TestDataUtil.getListOfValue(strValueForBloodPressure)));

        } else {
            System.out.println("Failed to enter into BLOOD Pressure >>> :: ");
        }
    }

    @When("I Click on Active to view all active indicators in card view")
    public void iClickOnActiveToViewAllActiveIndicatorsInCardView(List<String> ActiveCardData) {
//        sanityPageContainer.myHealthIndicators.clickMyHealthIndicatorsOptionFromMenu();
        for (String strActiveCardData : ActiveCardData) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBMIActiveIcon(TestDataUtil.getListOfValue(strActiveCardData)));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickActiveTab());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyActiveData(TestDataUtil.getListOfValue(strActiveCardData)));
        }


    }

    @Then("I Click on Inactive to view all inactive indicators in card view")
    public void iClickOnInactiveToViewAllInactiveIndicatorsInCardView(List<String> InActiveCardData) {
        for (String strActiveCardData : InActiveCardData) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickInActiveIcon(TestDataUtil.getListOfValue(strActiveCardData)));
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyActiveData(TestDataUtil.getListOfValue(strActiveCardData)));
        }
    }

    @When("I Navigate to all My Health indicators from the summary tab")
    public void iNavigateToAllMyHealthIndicatorsFromTheSummaryTab() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());

    }

    @And("I Navigate to My Health indicators from the Blood Pressure")
    public void iNavigateToMyHealthIndicatorsFromTheBloodPressure() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHealthCentre());
    }

    @Then("I should see all the Blood Pressure Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheBloodPressureEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> locDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMaxvalue());
            for (String String : locDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureTableData(TestDataUtil.getListOfValue(String)));
            }

        }
    }

    @And("I Navigate to My Health indicators from the BMI")
    public void iNavigateToMyHealthIndicatorsFromTheBMI() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMI());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHealthCentre());
    }

    @Then("I should see all the BMI Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheBMIEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> locDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMaxvalue());
            for (String String : locDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBMITableData(TestDataUtil.getListOfValue(String)));
            }

        }
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Blood Pressure")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheBloodPressure() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());
    }


    @And("I click on add new Button & Enter the Blood Pressure Medicine Details")
    public void iClickOnAddNewButtonEnterTheBloodPressureMedicineDetails(String listCreateData) {
        List<String> BloodpressureData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
//        System.out.println(TestDataUtil.getListOfValue(listCreateData.get(0)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureHealthIndicator(TestDataUtil.getValue(BloodpressureData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterSystolicMedicationName(TestDataUtil.getValue(BloodpressureData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterDiatolicMedicationName(TestDataUtil.getValue(BloodpressureData.get(2))));
//        sanityPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureComments(TestDataUtil.getValue(BloodpressureData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodpressureData.get(4))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickConfirmButton());
    }

    @When("I click on the menu in the Blood Pressure card & set a reminder")
    public void iClickOnTheMenuInTheBloodPressureCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBloodPressureData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());

    }

    @And("I change the status to Active and Inactive from the My entries Blood Pressure Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesBloodPressureDetails(List<String> details) {
//        List<String> BloodpressureData = TestDataUtil.getListOfValue(details);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardBloodPressureData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBloodPressureInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));

    }

    @Then("I should see all the Blood Pressure My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheBloodPressureMyEntriesMedicineDetailsInTheGridView(String details) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>" + details);
//        List<String>data=TestDataUtil.getListOfValue(details);

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }


    @And("I click on {string} edit icon & I Edit Blood Pressure of My Entries records {string}")
    public void iClickOnEditIconIEditBloodPressureOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditBloodPressureMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditSystolicMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickEditSaveButton());

    }

    @And("I click on Delete Icon {string}& I verify the Blood Pressure My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheBloodPressureMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteBloodPressureMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the BMI")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheBMI() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMI());
    }

    @And("I click on add new Button & Enter the BMI Medicine Details")
    public void iClickOnAddNewButtonEnterTheBMIMedicineDetails(String listCreateData) {
        List<String> BloodpressureData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBMIHealthIndicator(TestDataUtil.getValue(BloodpressureData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBMIheight(TestDataUtil.getValue(BloodpressureData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBMIWeight(TestDataUtil.getValue(BloodpressureData.get(2))));
//        sanityPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureComments(TestDataUtil.getValue(BloodpressureData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodpressureData.get(4))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMIConfirmButton());
    }

    @When("I click on the menu in the BMI card & set a reminder")
    public void iClickOnTheMenuInTheBMICardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBMIData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMIReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries BMI Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesBMIDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardBMIData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBMIInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));

    }

    @Then("I should see all the BMI My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheBMIMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBMIMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit BMI of My Entries records {string}")
    public void iClickOnEditIconIEditBMIOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditBMIMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMIEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the BMI My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheBMIMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteBMIMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMIYesButton());
    }

    @And("I Navigate to My Health indicators from the HBAC")
    public void iNavigateToMyHealthIndicatorsFromTheHBAC() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHBA1C());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHealthCentre());
    }

    @Then("I should see all the HBAC Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheHBACEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> locDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMaxvalue());
            for (String String : locDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHBACTableData(TestDataUtil.getListOfValue(String)));
            }

        }
    }

    @And("I click the view summary button & Navigate to My Health indicators from the HBAC")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheHBAC() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHBA1C());
    }

    @And("I click on add new Button & Enter the HBAC Medicine Details")
    public void iClickOnAddNewButtonEnterTheHBACMedicineDetails(String listCreateData) {
        List<String> HBA1CData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHBA1CHealthIndicator(TestDataUtil.getValue(HBA1CData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterHba1cMeasurement(TestDataUtil.getValue(HBA1CData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHbd1cComments(TestDataUtil.getValue(HBA1CData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(HBA1CData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHba1cConfirmButton());
    }

    @When("I click on the menu in the HBAC card & set a reminder")
    public void iClickOnTheMenuInTheHBACCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHba1cData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHba1cReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries HBAC Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesHBACDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardHba1cData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHba1cInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));

    }

    @Then("I should see all the HBAC My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheHBACMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBda1cMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit HBAC of My Entries records {string}")
    public void iClickOnEditIconIEditHBACOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditHBACMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHba1cEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the HBAC My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheHBACMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteHBA1CMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHba1cYesButton());
    }

    @And("I Navigate to My Health indicators from the LDL")
    public void iNavigateToMyHealthIndicatorsFromTheLDL() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDL());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHealthCentre());
    }

    @Then("I should see all the LDL Entries From Health center Medicine Details in a grid view")
    public void iShouldSeeAllTheLDLEntriesFromHealthCenterMedicineDetailsInAGridView(List<String> locDetails) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMaxvalue());
            for (String String : locDetails) {
                System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
                Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyLDLTableData(TestDataUtil.getListOfValue(String)));
            }

        }
    }

    @And("I click the view summary button & Navigate to My Health indicators from the LDL")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheLDL() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDL());
    }

    @And("I click on add new Button & Enter the LDL Medicine Details")
    public void iClickOnAddNewButtonEnterTheLDLMedicineDetails(String listCreateData) {
        List<String> HBA1CData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectLDLHealthIndicator(TestDataUtil.getValue(HBA1CData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterLDLMeasurement(TestDataUtil.getValue(HBA1CData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectLDLComments(TestDataUtil.getValue(HBA1CData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(HBA1CData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDLConfirmButton());
    }

    @When("I click on the menu in the LDL card & set a reminder")
    public void iClickOnTheMenuInTheLDLCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickLDLData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDLReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries LDL Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesLDLDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardLDLData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyLDLActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickInActiveCardLDLData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyLDLActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the LDL My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheLDLMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBda1cMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit LDL of My Entries records {string}")
    public void iClickOnEditIconIEditLDLOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditLDLMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDLEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the LDL My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheLDLMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteLDLMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDLYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Alcohol")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheAlcohol() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
    }

    @And("I click on add new Button & Enter the Alcohol Medicine Details")
    public void iClickOnAddNewButtonEnterTheAlcoholMedicineDetails(String listCreateData) {
        List<String> AlcoholData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectAlcoholHealthIndicator(TestDataUtil.getValue(AlcoholData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.SelectAlcohol(TestDataUtil.getValue(AlcoholData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectAlcoholComments(TestDataUtil.getValue(AlcoholData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(AlcoholData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcoholConfirmButton());
    }

    @When("I click on the menu in the Alcohol card & set a reminder")
    public void iClickOnTheMenuInTheAlcoholCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcoholReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Alcohol Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesAlcoholDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardAlcoholData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Alcohol My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheAlcoholMyEntriesMedicineDetailsInTheGridView(String details) {
//        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
//        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyAlcoholMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Alcohol of My Entries records {string}")
    public void iClickOnEditIconIEditAlcoholOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditAlcoholMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcoholEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Alcohol My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheAlcoholMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteAlcoholMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcoholYesButton());
    }


    @And("I click the view summary button & Navigate to My Health indicators from the Anxiety Severity")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheAnxietySeverity() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxiety());
    }

    @And("I click on add new Button & Enter the Anxiety Severity Medicine Details")
    public void iClickOnAddNewButtonEnterTheAnxietySeverityMedicineDetails(String listCreateData) {
        List<String> AlcoholData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectAnxietyHealthIndicator(TestDataUtil.getValue(AlcoholData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectFeelingnervousrestlessorstressed());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectNotbeingabletostoporcontrolworrying());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectWorryingtoomuchaboutdifferentthings());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectTroublerelaxing());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBeingsorestlessthatitshardtositstill());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBecomingeasilyannoyedorirritable());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectFeelingafraidasifsomethingawfulmighthappen());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxietyConfirmButton());
    }

    @When("I click Connect a health centre")
    public void iClickConnectAHealthCentre() {
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.clickConnectAHealthCentre());
    }

    @Then("I search for the Health Centre {string}and click connect")
    public void iSearchForTheHealthCentreAndClickConnect(String strDetails) {
//        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.searchHealthCentre(TestDataUtil.getValue(strDetails)));
//        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.connectHealthCentre(TestDataUtil.getValue(strDetails)));
    }

    @Given("As a Existing user I am on HomePage and navigate to Resources")
    public void asAExistingUserIAmOnHomePageAndNavigateToResources() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "")
                .equalsIgnoreCase("MOBILEVIEW")) {

            Assert.assertTrue(sanityPageContainer.homePage.clickHamburgerIcon());
        }
        Assert.assertTrue(sanityPageContainer.resourcesPage.navigateToResources());

    }

    @And("I view the Activated resources.")
    public void iViewTheActivatedResources() {
        Assert.assertTrue(sanityPageContainer.resourcesPage.viewActivatedResources());
    }

    @And("Navigate to Health Navigator resource")
    public void navigateToHealthNavigatorResource() {
        Assert.assertTrue(sanityPageContainer.resourcesPage.navigateToHealthNavigator());
    }

    @Given("As a Existing user I am on HomePage and navigate to My Health Documents")
    public void asAExistingUserIAmOnHomePageAndNavigateToMyHealthDocuments() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "")
                .equalsIgnoreCase("MOBILEVIEW")) {

            Assert.assertTrue(sanityPageContainer.homePage.clickHamburgerIcon());
        }
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.navigateToMyHealthDocuments());

    }

    @And("I Click on attach document to add New document {string}")
    public void IclickOnAttachDocumentToAddNewDocument(String strDetails) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);

        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.clickAttachDocument());

        sanityPageContainer.myHealthDocumentsPage.enterDocumentName(TestDataUtil.getValue(lstDetails.get(0)));
        sanityPageContainer.myHealthDocumentsPage.selectDocumentType(TestDataUtil.getValue(lstDetails.get(1)));
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectDocumentValidityDate());
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.addFiles(TestDataUtil.getValue(lstDetails.get(3))));
        sanityPageContainer.myHealthDocumentsPage.enterAdditionalInformation(TestDataUtil.getValue(lstDetails.get(4)));
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectPrivacySetting(TestDataUtil.getValue(lstDetails.get(5))));
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.clickSaveButton());

//        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.attachNewDocument(lstDetails));


    }

    @Then("I should verify the newly added document {string}")
    public void iShouldVerifyTheNewlyAddedDocument(String strDetails) {

        System.out.println("strDetails >>> :: " + TestDataUtil.getValue(strDetails));
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        int size = lstDetails.size();
        System.out.println("Size of lst >>> :: " + size);

        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.verifyAddedDocument(strDetails));

        if (size == 5) {
            String privacySetting = lstDetails.get(5);
            System.out.println("Privacy Setting >>> ::" + privacySetting);
            if (privacySetting.equalsIgnoreCase("Show this entry to my care providers")) {
                Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.editAttachedDocument(strDetails));
            }
        }

    }


    @And("Click on more info icon in grid to Verify the details of the specific added Document {string}")
    public void clickOnMoreInfoIconInGridToVerifyTheDetailsOfTheSpecificAddedDocument(String strDetails) {
        System.out.println("strDetails >>> :: " + strDetails);
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.clickMoreInfo(strDetails));

        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.verifyMoreInfoDetails(strDetails));
    }

    @And("Navigate to Everybody Patient sheet Resource")
    public void navigateToEverybodyPatientSheetResource() {
        Assert.assertTrue(sanityPageContainer.resourcesPage.navigateToPatientSheet());

    }

    @And("Navigate to Unite against Covid resource")
    public void navigateToUniteAgainstCovidResource() {
        Assert.assertTrue(sanityPageContainer.resourcesPage.navigateToCovid19());
    }

    @And("Click & select All to filter - Displays all doc")
    public void clickSelectAllToFilterDisplaysAllDoc() {

    }

    @And("Click & select All to filter {string}")
    public void clickSelectAllToFilter(String strValue) {
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectFilter(strValue));
    }

    @And("Click & select Health facility docs to filter {string}")
    public void clickSelectHealthFacilityDocsToFilter(String strValue) {
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectFilter(strValue));

    }

    @And("Click & select My docs to filter {string}")
    public void clickSelectMyDocsToFilter(String strValue) {
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectFilter(strValue));

    }

    @And("Click & select Inactive docs to filter {string}")
    public void clickSelectInactiveDocsToFilter(String strValue) {
        Assert.assertTrue(sanityPageContainer.myHealthDocumentsPage.selectFilter(strValue));

    }

    @And("Navigate to book appointment page in Upcoming appointments card from dashboard")
    public void navigateToBookAppointmentPageInUpcomingAppointmentsCardFromDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToBookAppointmentPage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.declineCovidPreScreeningPopup());


    }

    @And("Navigate to Inbox bar by clicking View Message from text dashboard")
    public void navigateToInboxBarByClickingViewMessageFromTextDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
//        Assert.assertTrue(sanityPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToViewMessages());
    }

    @And("Navigate to Connect health centre page by clicking Connect Health Centre text from dashboard")
    public void navigateToConnectHealthCentrePageByClickingConnectHealthCentreTextFromDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToMyHealthCentre());
    }

    @And("View latest three New messages received in new message card")
    public void viewLatestThreeNewMessagesReceivedInNewMessageCard(List<String> strDetails) {
        for (String strData : strDetails) {

            System.out.println("strData >>> :: " + strData);
            Assert.assertTrue(sanityPageContainer.dashboardPage.verifyMessagesInDashboard(strData));

        }
    }

    @And("Check Unread message count in New Messages Card")
    public void checkUnreadMessageCountInNewMessagesCard() {
        sanityPageContainer.dashboardPage.verifyUnreadMessageCount();

    }

    @And("Navigate to Request Medication page by Clicking on New Repeat Prescription text from dashboard")
    public void navigateToRequestMedicationPageByClickingOnNewRepeatPrescriptionTextFromDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToNewRepeatPrescription());
    }

    @And("Navigate to My Health Indicators page by clicking View all Indicators text from dashboard")
    public void navigateToMyHealthIndicatorsPageByClickingViewAllIndicatorsTextFromDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToMyHealthIndicators());
    }

    @And("Navigate to Health Summary page by clicking View Health Summary text from dashboard")
    public void navigateToHealthSummaryPageByClickingViewHealthSummaryTextFromDashboard() {
//        Assert.assertTrue(sanityPageContainer.homePage.navigateToHomePage());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToDashboard());
        Assert.assertTrue(sanityPageContainer.dashboardPage.navigateToMyHealthRecords());
    }

    @And("Navigate to View Specific health Record Details in Dashboard")
    public void navigateToViewSpecificHealthRecordDetailsInDashboard(String strValue) {
        System.out.println("strValue >>> :: " + TestDataUtil.getValue(strValue));
        List<String> lstDetails = TestDataUtil.getListOfValue(strValue);
        System.out.println("lstDetails >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.dashboardPage.selectHealthRecords(lstDetails));
    }

    @Given("As a Existing user I am on HomePage and I click the Health Tools")
    public void asAExistingUserIAmOnHomePageAndIClickTheHealthTools() {
        Assert.assertTrue(sanityPageContainer.viewJournal.clickDashBoard());
        Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityPageContainer.viewJournal.clickMyHealthToolsOptionFromMenu());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
    }

    //
    @And("View latest three patient Health Records in Health records card")
    public void viewLatestThreePatientHealthRecordsInHealthRecordsCard(List<String> strDetails) {

        for (String strData : strDetails) {

            System.out.println("strData >>> :: " + strData);
            Assert.assertTrue(sanityPageContainer.dashboardPage.verifyDashboardHealthRecords(strData));

        }

    }

    @When("I click on view Journal & Add Journal Details kept private are not shared with the provider")
    public void iClickOnViewJournalAddJournalDetailsKeptPrivateAreNotSharedWithTheProvider(String viewJournal) {
        List<String> strviewjournalData = TestDataUtil.getListOfValue(viewJournal);
        Assert.assertTrue(sanityPageContainer.viewJournal.clickViewJournal());
        Assert.assertTrue(sanityPageContainer.viewJournal.clickADDJournal());
        Assert.assertTrue(sanityPageContainer.viewJournal.enterSubjectName(TestDataUtil.getValue(strviewjournalData.get(0))));
        Assert.assertTrue(sanityPageContainer.viewJournal.selectCategoryName(TestDataUtil.getValue(strviewjournalData.get(1))));
        Assert.assertTrue(sanityPageContainer.viewJournal.enterNotes(TestDataUtil.getValue(strviewjournalData.get(2))));
        sanityPageContainer.viewJournal.enterviewJournalDateTaken();
        Assert.assertTrue(sanityPageContainer.viewJournal.selectTime(TestDataUtil.getValue(strviewjournalData.get(3))));
        sanityPageContainer.viewJournal.checkScheduleevent();
        Assert.assertTrue(sanityPageContainer.viewJournal.selectremindme(TestDataUtil.getValue(strviewjournalData.get(4))));
        Assert.assertTrue(sanityPageContainer.viewJournal.selectEmail(TestDataUtil.getValue(strviewjournalData.get(5))));
        sanityPageContainer.viewJournal.checkPrivacySetting();
        sanityPageContainer.viewJournal.ClickSaveButton();

    }

    @And("I should see all the Added journal Details must be displayed in the grid view")
    public void iShouldSeeAllTheAddedJournalDetailsMustBeDisplayedInTheGridView(List<String> viewjournalDetails) {
        sanityPageContainer.viewJournal.clickMaxvalue();
        for (String String : viewjournalDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            Assert.assertTrue(sanityPageContainer.viewJournal.VerifyviewjournalTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @Then("I should see all the Added journal Details in more info")
    public void iShouldSeeAllTheAddedJournalDetailsInMoreInfo(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.viewJournal.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                Assert.assertTrue(sanityPageContainer.viewJournal.ClickviewjournalMoreInfoIcon(list1, list2));
            }
        }

    }

    @And("I click on {string} edit icon & I Edit view Journal records {string}")
    public void iClickOnEditIconIEditViewJournalRecords(String details, String listCreateData) {
        List<String> data = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.viewJournal.ClickEditViewJournalTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.viewJournal.EditNotes(TestDataUtil.getValue(data.get(0))));
        Assert.assertTrue(sanityPageContainer.viewJournal.clickEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the view Journal Record is deleted")
    public void iClickOnDeleteIconIVerifyTheViewJournalRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.viewJournal.ClickDeleteViewJournalTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.viewJournal.clickYesButton());
        Assert.assertTrue(sanityPageContainer.viewJournal.verifyDeletedRecord());

    }

    @When("I click on view Journal & Add Journal Details shared with provider")
    public void iClickOnViewJournalAddJournalDetailsSharedWithProvider(String viewJournal) {
        List<String> strviewjournalData = TestDataUtil.getListOfValue(viewJournal);
        Assert.assertTrue(sanityPageContainer.viewJournal.clickViewJournal());
        Assert.assertTrue(sanityPageContainer.viewJournal.clickADDJournal());
        Assert.assertTrue(sanityPageContainer.viewJournal.enterSubjectName(TestDataUtil.getValue(strviewjournalData.get(0))));
        Assert.assertTrue(sanityPageContainer.viewJournal.selectCategoryName(TestDataUtil.getValue(strviewjournalData.get(1))));
        Assert.assertTrue(sanityPageContainer.viewJournal.enterNotes(TestDataUtil.getValue(strviewjournalData.get(2))));
        sanityPageContainer.viewJournal.enterviewJournalDateTaken();
        Assert.assertTrue(sanityPageContainer.viewJournal.selectTime(TestDataUtil.getValue(strviewjournalData.get(3))));
        sanityPageContainer.viewJournal.checkScheduleevent();
        Assert.assertTrue(sanityPageContainer.viewJournal.selectremindme(TestDataUtil.getValue(strviewjournalData.get(4))));
        Assert.assertTrue(sanityPageContainer.viewJournal.selectEmail(TestDataUtil.getValue(strviewjournalData.get(5))));
        sanityPageContainer.viewJournal.checkShareProviderSetting();
        sanityPageContainer.viewJournal.ClickSaveButton();
    }


    @When("I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider")
    public void iClickOnGoalTrackingAddGoalTrackingDetailsKeptPrivateAreNotSharedWithTheProvider(String viewJournal) {
        List<String> strviewjournalData = TestDataUtil.getListOfValue(viewJournal);
//        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickADDGoal());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGaolName(TestDataUtil.getValue(strviewjournalData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectType(TestDataUtil.getValue(strviewjournalData.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterDescription(TestDataUtil.getValue(strviewjournalData.get(2))));
        sanityPageContainer.goalTracking.enterAddTaskStartDateTaken();
        sanityPageContainer.goalTracking.enterAddTaskEndTaken();
        sanityPageContainer.goalTracking.checkWhatistheunitofmeasurementforthisgoal();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectUnitMeasurement(TestDataUtil.getValue(strviewjournalData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterInitialValue(TestDataUtil.getValue(strviewjournalData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTargetValue(TestDataUtil.getValue(strviewjournalData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.checkGoalTrackingPrivacySetting());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingSaveButton());
    }

    @And("I should see all the Goal Tracking Details must be displayed in the grid view")
    public void iShouldSeeAllTheGoalTrackingDetailsMustBeDisplayedInTheGridView(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.viewJournal.clickMaxvalue());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingMoreInfoIcon(list1, list2));
            }
        }

    }

    @And("click on the filter by current goals will display goals that are currently active in the grid view")
    public void clickOnTheFilterByCurrentGoalsWillDisplayGoalsThatAreCurrentlyActiveInTheGridView(List<String> GoalTracking) {
//       List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        System.out.println(">>>>>>>>>>GoalTracking" + GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFliterCurrentGoals(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        sanityPageContainer.viewJournal.clickMaxvalue();
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.VerifyGoalTrackingTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @And("click on the filter by Show All goal will display goals that are current & previous in the grid view")
    public void clickOnTheFilterByShowAllGoalWillDisplayGoalsThatAreCurrentPreviousInTheGridView(List<String> GoalTracking) {
//        List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFliterShowAllGoals(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        sanityPageContainer.viewJournal.clickMaxvalue();
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.VerifyGoalTrackingTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @And("I click on {string} edit icon & I Edit goal tracking records {string}")
    public void iClickOnEditIconIEditGoalTrackingRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickEditViewJournalTableData(TestDataUtil.getListOfValue(details)));
        Assert.assertTrue(sanityPageContainer.goalTracking.EditDescription(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalEditSaveButton());
    }

    @And("I click on Delete Icon {string} in the goal tracking grid for a specific goal will delete the goal from the grid")
    public void iClickOnDeleteIconInTheGoalTrackingGridForASpecificGoalWillDeleteTheGoalFromTheGrid(String details) {

        Assert.assertTrue(sanityPageContainer.goalTracking.ClickDeleteViewJournalTableData(TestDataUtil.getListOfValue(details)));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickYesButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.verifyDeletedRecord());
    }

    //
    @And("I click on Goal Tracking & Add Goal Tracking Details kept private are shared with the provider")
    public void iClickOnGoalTrackingAddGoalTrackingDetailsKeptPrivateAreSharedWithTheProvider(String GoalTracking) {
        List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickADDGoal());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGaolName(TestDataUtil.getValue(strGoalTrackingData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectType(TestDataUtil.getValue(strGoalTrackingData.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterDescription(TestDataUtil.getValue(strGoalTrackingData.get(2))));
        sanityPageContainer.goalTracking.enterGaolTrackingDateTaken();
        sanityPageContainer.goalTracking.enterGaolTrackingEndTaken();
        sanityPageContainer.goalTracking.checkWhatistheunitofmeasurementforthisgoal();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectUnitMeasurement(TestDataUtil.getValue(strGoalTrackingData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterInitialValue(TestDataUtil.getValue(strGoalTrackingData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTargetValue(TestDataUtil.getValue(strGoalTrackingData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ShowEntryGoalTrackingPrivacySetting());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingSaveButton());
    }

    @When("I click on Goal Tracking & Add Previous Goal Details kept private are not shared with the provider")
    public void iClickOnGoalTrackingAddPreviousGoalDetailsKeptPrivateAreNotSharedWithTheProvider(String PreviousGoaldata) {
        List<String> strPreviousGoaldata = TestDataUtil.getListOfValue(PreviousGoaldata);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickADDGoal());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGaolName(TestDataUtil.getValue(strPreviousGoaldata.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectType(TestDataUtil.getValue(strPreviousGoaldata.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterDescription(TestDataUtil.getValue(strPreviousGoaldata.get(2))));
        sanityPageContainer.goalTracking.enterPreviousGaolTrackingDateTaken();
        sanityPageContainer.goalTracking.enterPreviousGaolTrackingEngDateTaken();
        sanityPageContainer.goalTracking.checkWhatistheunitofmeasurementforthisgoal();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectUnitMeasurement(TestDataUtil.getValue(strPreviousGoaldata.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterInitialValue(TestDataUtil.getValue(strPreviousGoaldata.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTargetValue(TestDataUtil.getValue(strPreviousGoaldata.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.checkGoalTrackingPrivacySetting());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingSaveButton());
    }

    @Then("click on the filter by the previous goal will display goals that have crossed the end date in the grid view")
    public void clickOnTheFilterByThePreviousGoalWillDisplayGoalsThatHaveCrossedTheEndDateInTheGridView(List<String> GoalTracking) {
//        List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFliterPreviousGoals(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        sanityPageContainer.viewJournal.clickMaxvalue();
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.VerifyGoalTrackingTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @When("I click on Goal Tracking & Add Previous Goal Details kept private are shared with the provider")
    public void iClickOnGoalTrackingAddPreviousGoalDetailsKeptPrivateAreSharedWithTheProvider(String PreviousGoaldata) {
        List<String> strPreviousGoaldata = TestDataUtil.getListOfValue(PreviousGoaldata);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickADDGoal());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGaolName(TestDataUtil.getValue(strPreviousGoaldata.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectType(TestDataUtil.getValue(strPreviousGoaldata.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterDescription(TestDataUtil.getValue(strPreviousGoaldata.get(2))));
        sanityPageContainer.goalTracking.enterPreviousGaolTrackingDateTaken();
        sanityPageContainer.goalTracking.enterPreviousGaolTrackingEngDateTaken();
        sanityPageContainer.goalTracking.checkWhatistheunitofmeasurementforthisgoal();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectUnitMeasurement(TestDataUtil.getValue(strPreviousGoaldata.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterInitialValue(TestDataUtil.getValue(strPreviousGoaldata.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTargetValue(TestDataUtil.getValue(strPreviousGoaldata.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ShowEntryGoalTrackingPrivacySetting());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingSaveButton());
    }

    @And("I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider click save the set reminder")
    public void iClickOnGoalTrackingAddGoalTrackingDetailsKeptPrivateAreNotSharedWithTheProviderClickSaveTheSetReminder(String GoalTracking) {
        List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickADDGoal());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGaolName(TestDataUtil.getValue(strGoalTrackingData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectType(TestDataUtil.getValue(strGoalTrackingData.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterDescription(TestDataUtil.getValue(strGoalTrackingData.get(2))));
        sanityPageContainer.goalTracking.enterSetReminderDateTaken();
        sanityPageContainer.goalTracking.enterSetReminderEndTaken();
        sanityPageContainer.goalTracking.checkWhatistheunitofmeasurementforthisgoal();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectUnitMeasurement(TestDataUtil.getValue(strGoalTrackingData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterInitialValue(TestDataUtil.getValue(strGoalTrackingData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTargetValue(TestDataUtil.getValue(strGoalTrackingData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ShowEntryGoalTrackingPrivacySetting());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickGoalTrackingSaveAndSetReminderButton());
    }

    @When("I click on set reminder & Add the set reminder details click the save button")
    public void iClickOnSetReminderAddTheSetReminderDetailsClickTheSaveButton(String SetReminderdata) {
        List<String> strSetReminderdata = TestDataUtil.getListOfValue(SetReminderdata);
        Assert.assertTrue(sanityPageContainer.goalTracking.selectReminderType(TestDataUtil.getValue(strSetReminderdata.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFrequency(TestDataUtil.getValue(strSetReminderdata.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTime(TestDataUtil.getValue(strSetReminderdata.get(2))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterMessage(TestDataUtil.getValue(strSetReminderdata.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickSetReminderSaveButton());
    }

    @When("I click on the menu in the Anxiety Severity card & set a reminder")
    public void iClickOnTheMenuInTheAnxietySeverityCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAnxietySeverityData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxietyReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @Then("I should see all the Anxiety Severity My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheAnxietySeverityMyEntriesMedicineDetailsInTheGridView(String details) {
//        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyAnxietyMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I change the status to Active and Inactive from the My entries Anxiety Severity Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesAnxietySeverityDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardAnxietyData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAnxietyInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on {string} edit icon & I Edit Anxiety Severity of My Entries records {string}")
    public void iClickOnEditIconIEditAnxietySeverityOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditAnxietyMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxietyEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Anxiety Severity My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheAnxietySeverityMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteAnxietyMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxietyYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Blood Sugar")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheBloodSugar() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugar());
    }

    @And("I click on add new Button & Enter the Blood Sugar Medicine Details")
    public void iClickOnAddNewButtonEnterTheBloodSugarMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugarConfirmButton());

    }

    @When("I click on the menu in the Blood Sugar card & set a reminder")
    public void iClickOnTheMenuInTheBloodSugarCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBloodSugarData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugarReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Blood Sugar Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesBloodSugarDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardBloodSugarData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickBloodSugarInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Blood Sugar My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheBloodSugarMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodSugarMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Blood Sugar of My Entries records {string}")
    public void iClickOnEditIconIEditBloodSugarOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditBloodSugarMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSuagrEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Blood Sugar My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheBloodSugarMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteBloodSugarMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugarYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Depression")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheDepression() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepression());
    }

    @And("I click on add new Button & Enter the Depression Medicine Details")
    public void iClickOnAddNewButtonEnterTheDepressionMedicineDetails(String listCreateData) {
        List<String> AlcoholData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectDepressionHealthIndicator(TestDataUtil.getValue(AlcoholData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectLittleinterestorpleasureindoingthing());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectFeelingdowndepressedorhopeless());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectTroublefallingorstayingasleeporsleepingtoomuch());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectFeelingtiredorhavinglittleenergy());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectPoorappetiteorovereating());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectFeelingbadaboutyourselforthatyouareafailureorhaveletyourselforyourfamilydown());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectTroubleconcentratingonthingssuchasreadingthenewspaperorwatchingtelevision());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectMovingorspeakingsoslowly());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectThoughtsthatYouwouldbebetteroffdead());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepressionConfirmButton());
    }

    @When("I click on the menu in the Depression card & set a reminder")
    public void iClickOnTheMenuInTheDepressionCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDepressionData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepressionReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Depression Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesDepressionDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardDepressionData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDepressionInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Depression My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheDepressionMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyDepressionMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Depression of My Entries records {string}")
    public void iClickOnEditIconIEditDepressionOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditDepressionMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepressionEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Depression My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheDepressionMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteDepressionMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepressionYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Drinking Survey")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheDrinkingSurvey() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurvey());
    }

    @And("I click on add new Button & Enter the Drinking Survey Medicine Details")
    public void iClickOnAddNewButtonEnterTheDrinkingSurveyMedicineDetails(String listCreateData) {
        List<String> AlcoholData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectDrinkingSurveyHealthIndicator(TestDataUtil.getValue(AlcoholData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowoftendoyouhaveadrinkcontainingalcohol());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowmanyStandardDrinkscontainingalcohol());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowoftendoyouhavesixormoredrinksononeoccasion());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowoftenduringthelastyearhaveyoufound());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowofteninthelastyearhaveyoufailedtodo());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowofteninthelastyearhaveyouneededadrink());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowofteninthelastyearhaveyouhadafeeling());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHowofteninthelastyearhaveyoubeenunable());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHaveyouorsomeoneelsebeeninjuredasaresult());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHasarelativefriendordoctor());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurveyConfirmButton());
    }

    @When("I click on the menu in the Drinking Survey card & set a reminder")
    public void iClickOnTheMenuInTheDrinkingSurveyCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDrinkingSurveyData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurveyReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Drinking Survey Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesDrinkingSurveyDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardDrinkingSurveyData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDrinkingSurveyInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Drinking Survey My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheDrinkingSurveyMyEntriesMedicineDetailsInTheGridView(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyDrinkingSurveyMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Drinking Survey of My Entries records {string}")
    public void iClickOnEditIconIEditDrinkingSurveyOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditDrinkingMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurveyEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Drinking Survey My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheDrinkingSurveyMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteDrinkingSurveyMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurveyYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the HDL")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheHDL() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDL());

    }

    @And("I click on add new Button & Enter the HDL Medicine Details")
    public void iClickOnAddNewButtonEnterTheHDLMedicineDetails(String listCreateData) {
        List<String> HBA1CData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHDLHealthIndicator(TestDataUtil.getValue(HBA1CData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterHDLMeasurement(TestDataUtil.getValue(HBA1CData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectHDLComments(TestDataUtil.getValue(HBA1CData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(HBA1CData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDLConfirmButton());
    }

    @When("I click on the menu in the HDL card & set a reminder")
    public void iClickOnTheMenuInTheHDLCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHDLData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDLReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries HDL Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesHDLDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickActiveCardHDLData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHDLInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the HDL My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheHDLMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBda1cMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit HDL of My Entries records {string}")
    public void iClickOnEditIconIEditHDLOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditHDLMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDLEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the HDL My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheHDLMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteHDLMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDLYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Peak Flow")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromThePeakFlow() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlow());
    }

    @And("I click on add new Button & Enter the Peak Flow Medicine Details")
    public void iClickOnAddNewButtonEnterThePeakFlowMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectPeakFlowHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlowConfirmButton());
    }

    @When("I click on the menu in the Peak Flow card & set a reminder")
    public void iClickOnTheMenuInThePeakFlowCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickPeakFlowData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlowReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Peak Flow Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesPeakFlowDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickPeakFlowData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickPeakFlowInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Peak Flow My Entries Medicine details in the grid view")
    public void iShouldSeeAllThePeakFlowMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyPeakFlowMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Peak Flow of My Entries records {string}")
    public void iClickOnEditIconIEditPeakFlowOfMyEntriesRecords(String details, String listCreateData) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditPeakFlowMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlowEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Peak Flow My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyThePeakFlowMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeletePeakFlowMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlowYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Smoking")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheSmoking() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmoking());
    }

    @And("I click on add new Button & Enter the Smoking Medicine Details")
    public void iClickOnAddNewButtonEnterTheSmokingMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectSmokingHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectSmokingComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmokingConfirmButton());
    }

    @When("I click on the menu in the Smoking card & set a reminder")
    public void iClickOnTheMenuInTheSmokingCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickSmokingData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmokingReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Smoking Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesSmokingDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickSmokingData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickSmokingInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Smoking My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheSmokingMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifySmokingMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Smoking of My Entries records {string}")
    public void iClickOnEditIconIEditSmokingOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditSmokingMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmokingEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Smoking My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheSmokingMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteSmokingMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmokingYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Total Cholesterol")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheTotalCholesterol() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterol());
    }

    @And("I click on add new Button & Enter the Total Cholesterol Medicine Details")
    public void iClickOnAddNewButtonEnterTheTotalCholesterolMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectTotalCholesterolHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterolConfirmButton());
    }

    @When("I click on the menu in the Total Cholesterol card & set a reminder")
    public void iClickOnTheMenuInTheTotalCholesterolCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTotalCholesterolData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterolReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Total Cholesterol Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesTotalCholesterolDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTotalCholesterolData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTotalCholesterolInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Total Cholesterol My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheTotalCholesterolMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyTotalCholesterolMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I EditTotal Cholesterol of My Entries records {string}")
    public void iClickOnEditIconIEditTotalCholesterolOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditTotalCholesterolMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterolEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Total Cholesterol My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheTotalCholesterolMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteTotalCholesterolMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterolYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Triglycerides")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheTriglycerides() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglycerides());
    }

    @And("I click on add new Button & Enter the Triglycerides Medicine Details")
    public void iClickOnAddNewButtonEnterTheTriglyceridesMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectTriglyceridesHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodSugarComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglyceridesConfirmButton());
    }

    @When("I click on the menu in the Triglycerides card & set a reminder")
    public void iClickOnTheMenuInTheTriglyceridesCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTriglyceridesData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglyceridesReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Triglycerides Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesTriglyceridesDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTriglyceridesData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickTriglyceridesInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Triglycerides My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheTriglyceridesMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyTriglyceridesMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Triglycerides of My Entries records {string}")
    public void iClickOnEditIconIEditTriglyceridesOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditTriglyceridesMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglyceridesEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Triglycerides My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheTriglyceridesMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteTriglyceridesMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglyceridesYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Waist Size")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheWaistSize() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSize());
    }

    @And("I click on add new Button & Enter the Waist Size Medicine Details")
    public void iClickOnAddNewButtonEnterTheWaistSizeMedicineDetails(String listCreateData) {
        List<String> BloodSugarData = TestDataUtil.getListOfValue(listCreateData);
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAddnew());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectWaistSizeHealthIndicator(TestDataUtil.getValue(BloodSugarData.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterBloodSugarMeasurement(TestDataUtil.getValue(BloodSugarData.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectWaistSizeComments(TestDataUtil.getValue(BloodSugarData.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterComments(TestDataUtil.getValue(BloodSugarData.get(3))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSizeConfirmButton());
    }

    @When("I click on the menu in the Waist Size card & set a reminder")
    public void iClickOnTheMenuInTheWaistSizeCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWaistSizeData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSizeReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Waist Size Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesWaistSizeDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWaistSizeData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWaistSizeInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyBloodPressureActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Waist Size My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheWaistSizeMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyWaistSizeMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Waist Size of My Entries records {string}")
    public void iClickOnEditIconIEditWaistSizeOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditWaistSizeMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSizeEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Waist Size My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheWaistSizeMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteWaistSizeMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSizeYesButton());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeletedRecord());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Height card")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheHeightCard() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightCard());
    }

    @When("I click on the menu in the Height card card & set a reminder")
    public void iClickOnTheMenuInTheHeightCardCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHeightCardData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Height card Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesHeightCardDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHeightCardData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHeightActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickHeightCardInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHeightActiveData(TestDataUtil.getListOfValue(details.get(0))));

    }

    @Then("I should see all the Height card My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheHeightCardMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHeightMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Height card of My Entries records {string}")
    public void iClickOnEditIconIEditHeightCardOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditHeightMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Height card My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheHeightCardMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteHeightMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightYesButton());
    }

    @And("I click the view summary button & Navigate to My Health indicators from the Weight card")
    public void iClickTheViewSummaryButtonNavigateToMyHealthIndicatorsFromTheWeightCard() {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightCard());
    }

    @When("I click on the menu in the Weight card card & set a reminder")
    public void iClickOnTheMenuInTheWeightCardCardSetAReminder(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWeightCardData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightReminderSetting());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureReminderType(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureFrequency(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.selectBloodPressureTime(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.enterReminderComments(TestDataUtil.getListOfValue(details.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickReminderSave());
    }

    @And("I change the status to Active and Inactive from the My entries Weight card Details")
    public void iChangeTheStatusToActiveAndInactiveFromTheMyEntriesWeightCardDetails(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWeightCardData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressureActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHeightActiveData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickWeightCardInActiveIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickInActiveTab());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyHeightActiveData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @Then("I should see all the Weight card My Entries Medicine details in the grid view")
    public void iShouldSeeAllTheWeightCardMyEntriesMedicineDetailsInTheGridView(String details) {

        Assert.assertTrue(sanityPageContainer.myHealthIndicators.VerifyWeightMyEntriesTableData(TestDataUtil.getListOfValue(details)));
    }

    @And("I click on {string} edit icon & I Edit Weight card of My Entries records {string}")
    public void iClickOnEditIconIEditWeightCardOfMyEntriesRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickEditWeightMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.EditBMIheightMedicationName(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightEditSaveButton());
    }

    @And("I click on Delete Icon {string}& I verify the Weight card My Entries Record is deleted")
    public void iClickOnDeleteIconIVerifyTheWeightCardMyEntriesRecordIsDeleted(String details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickDeleteWeightMyEntriesTableData(TestDataUtil.getValue(details)));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightYesButton());
    }

    @Then("I should see all the Added set reminder Details must be displayed in the grid view")
    public void iShouldSeeAllTheAddedSetReminderDetailsMustBeDisplayedInTheGridView(List<String> SetReminderData) {
        sanityPageContainer.viewJournal.clickMaxvalue();
        for (String String : SetReminderData) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.VerifyGoalTrackingTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @When("I click on set reminder & Add the set reminder details click on reminder preview")
    public void iClickOnSetReminderAddTheSetReminderDetailsClickOnReminderPreview(String SetReminderdata) {
        List<String> strSetReminderdata = TestDataUtil.getListOfValue(SetReminderdata);
        Assert.assertTrue(sanityPageContainer.goalTracking.selectReminderType(TestDataUtil.getValue(strSetReminderdata.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFrequency(TestDataUtil.getValue(strSetReminderdata.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTime(TestDataUtil.getValue(strSetReminderdata.get(2))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterMessage(TestDataUtil.getValue(strSetReminderdata.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickSetReminderPreviewSaveButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickHereButton());

    }

    @And("click on Add Value icon & Add measured value, date, comments & click on save")
    public void clickOnAddValueIconAddMeasuredValueDateCommentsClickOnSave(List<String> GoalTracking) {
//        List<String> strGoalTrackingData = TestDataUtil.getListOfValue(GoalTracking);
        System.out.println(">>>>>>>>>>>>>>>>>GoalTracking" + GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickRadioButton(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddValueTableData(TestDataUtil.getListOfValue(String)));
        }

        Assert.assertTrue(sanityPageContainer.goalTracking.enterMeasurement(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterComments(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddValueSaveButton());
    }


    @And("click on Graph Icon & Click on export to Excel under data tab to download the excel file")
    public void clickOnGraphIconClickOnExportToExcelUnderDataTabToDownloadTheExcelFile(List<String> GoalTracking) {
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.ClickGraphIconTableData(TestDataUtil.getListOfValue(String)));
        }
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickDataRadioButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickExporttoExcelButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.DeleteFile());
    }

    @And("I click on the edit icon & I Edit goal Analysis records and Delete the Goal Analysis Records")
    public void iClickOnTheEditIconIEditGoalAnalysisRecordsAndDeleteTheGoalAnalysisRecords(List<String> GoalTracking) {
        for (String String : GoalTracking) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getValue(String));
            Assert.assertTrue(sanityPageContainer.goalTracking.EditGoalAnalysisTableData(TestDataUtil.getListOfValue(String)));
        }
        Assert.assertTrue(sanityPageContainer.goalTracking.enterGoalAnalysisValue(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.DeleteGoalAnalysisTableData(TestDataUtil.getListOfValue(GoalTracking.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalAnalysisYesButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalAnalysisBackIcon());

    }

    @When("click on Add task icon & Add enter new task details and click on save")
    public void clickOnAddTaskIconAddEnterNewTaskDetailsAndClickOnSave(String TaskDetails) {
//        Assert.assertTrue(sanityPageContainer.viewJournal.clickDashBoard());
//        Assert.assertTrue(sanityPageContainer.homePage.verifyHomePageOfMMHPortal());
//        Assert.assertTrue(sanityPageContainer.viewJournal.clickMyHealthToolsOptionFromMenu());
//        Assert.assertTrue(sanityPageContainer.goalTracking.clickGoalTracking());

        List<String> strTaskData = TestDataUtil.getListOfValue(TaskDetails);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickAddTaskIcon());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskName(TestDataUtil.getValue(strTaskData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskDescription(TestDataUtil.getValue(strTaskData.get(1))));
        sanityPageContainer.goalTracking.enterTaskFuturedateTaken();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskReminderType(TestDataUtil.getValue(strTaskData.get(2))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskRemindMe(TestDataUtil.getValue(strTaskData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskTime(TestDataUtil.getValue(strTaskData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskMessage(TestDataUtil.getValue(strTaskData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.VeriflyAddthistasktoCalendar());
//        Assert.assertTrue(sanityPageContainer.goalTracking.clickStatusCompleted());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddTaskSaveButton());
    }

    @And("click on Reminder setting icon & Add enter new task details and click on save")
    public void clickOnReminderSettingIconAddEnterNewTaskDetailsAndClickOnSave(String GoalTracking) {
        List<String> strReminderSettingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickReminderSettingIconTableData(TestDataUtil.getValue(strReminderSettingData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFrequency(TestDataUtil.getValue(strReminderSettingData.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddTaskSetReminderSaveButton());
    }

    @Then("I should see all the Added future task grid Details must be displayed in more info")
    public void iShouldSeeAllTheAddedFutureTaskGridDetailsMustBeDisplayedInMoreInfo(DataTable dataTable) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(sanityPageContainer.viewJournal.clickMaxvalue1());
            List<List<String>> tableData = dataTable.asLists(String.class);
            for (int i = 0; i < tableData.size(); i++) {
                String strKey = tableData.get(i).get(0).trim();
                String strKey2 = tableData.get(i).get(1).trim();
                List<String> list1 = TestDataUtil.getListOfValue(strKey);
                List<String> list2 = TestDataUtil.getListOfValue(strKey2);
                System.out.println(">>>>>>>>>>>>>>>>>>>>list1" + list1);
                System.out.println(">>>>>>>>>>>>>>>>>>>>list2" + list2);
                Assert.assertTrue(sanityPageContainer.goalTracking.ClickFutureTaskMoreInfoIcon(list1, list2));
            }
        }
    }

    @And("I click on {string} edit icon & I Edit future task records {string}")
    public void iClickOnEditIconIEditFutureTaskRecords(String details, String listCreateData) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>details" + details);
        System.out.println(">>>>>>>>>>>>>>>>>>>>listCreateData" + listCreateData);
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickEditFutureTaskTableData(TestDataUtil.getListOfValue(details)));
        Assert.assertTrue(sanityPageContainer.goalTracking.EditFutureTaskDescription(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickFutureTaskEditSaveButton());
    }

    @When("click on Add task icon & Add enter Previous task details and click on save")
    public void clickOnAddTaskIconAddEnterPreviousTaskDetailsAndClickOnSave(String TaskDetails) {

        List<String> strTaskData = TestDataUtil.getListOfValue(TaskDetails);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickAddTaskIcon());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskName(TestDataUtil.getValue(strTaskData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskDescription(TestDataUtil.getValue(strTaskData.get(1))));
        sanityPageContainer.goalTracking.enterTaskFuturedateTaken();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskReminderType(TestDataUtil.getValue(strTaskData.get(2))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskRemindMe(TestDataUtil.getValue(strTaskData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskTime(TestDataUtil.getValue(strTaskData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskMessage(TestDataUtil.getValue(strTaskData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.VeriflyAddthistasktoCalendar());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickStatusCompleted());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddTaskSaveButton());
    }

    @When("click on Add task icon & Add enter Previous task details and click on Add another task")
    public void clickOnAddTaskIconAddEnterPreviousTaskDetailsAndClickOnAddAnotherTask(String TaskDetails) {
        List<String> strTaskData = TestDataUtil.getListOfValue(TaskDetails);
        Assert.assertTrue(sanityPageContainer.goalTracking.clickAddTaskIcon());
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskName(TestDataUtil.getValue(strTaskData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskDescription(TestDataUtil.getValue(strTaskData.get(1))));
        sanityPageContainer.goalTracking.enterTaskFuturedateTaken();
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskReminderType(TestDataUtil.getValue(strTaskData.get(2))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskRemindMe(TestDataUtil.getValue(strTaskData.get(3))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectTaskTime(TestDataUtil.getValue(strTaskData.get(4))));
        Assert.assertTrue(sanityPageContainer.goalTracking.enterTaskMessage(TestDataUtil.getValue(strTaskData.get(5))));
        Assert.assertTrue(sanityPageContainer.goalTracking.VeriflyAddthistasktoCalendar());
        Assert.assertTrue(sanityPageContainer.goalTracking.clickStatusCompleted());
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddAnotherTaskSaveButton());
    }

    @And("click on Reminder setting icon & Add enter Previous task details and click on save")
    public void clickOnReminderSettingIconAddEnterPreviousTaskDetailsAndClickOnSave(String GoalTracking) {
        List<String> strReminderSettingData = TestDataUtil.getListOfValue(GoalTracking);
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickPreviousTaskReminderSettingIconTableData(TestDataUtil.getValue(strReminderSettingData.get(0))));
        Assert.assertTrue(sanityPageContainer.goalTracking.selectFrequency(TestDataUtil.getValue(strReminderSettingData.get(1))));
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickAddTaskSetReminderSaveButton());
    }

    @Then("I should see all the Added Previous task grid Details must be displayed in more info")
    public void iShouldSeeAllTheAddedPreviousTaskGridDetailsMustBeDisplayedInMoreInfo(DataTable dataTable) {
        Assert.assertTrue(sanityPageContainer.viewJournal.clickMaxvalue1());
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            System.out.println(">>>>>>>>>>>>>>>>>>>>list1" + list1);
            System.out.println(">>>>>>>>>>>>>>>>>>>>list2" + list2);
            Assert.assertTrue(sanityPageContainer.goalTracking.ClickPreviousTaskMoreInfoIcon(list1, list2));
        }
    }

    @And("I click on {string} edit icon & I Edit Previous task records {string}")
    public void iClickOnEditIconIEditPreviousTaskRecords(String details, String listCreateData) {
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickEditPreviousTaskTableData(TestDataUtil.getListOfValue(details)));
        Assert.assertTrue(sanityPageContainer.goalTracking.EditFutureTaskDescription(TestDataUtil.getValue(listCreateData)));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickPreviousTaskEditSaveButton());
    }

    @And("I click on Delete Icon {string} in the Previous Task goal tracking grid for a specific goal will delete the goal from the grid")
    public void iClickOnDeleteIconInThePreviousTaskGoalTrackingGridForASpecificGoalWillDeleteTheGoalFromTheGrid(String details) {
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickDeletePreviousTableData(TestDataUtil.getListOfValue(details)));
        Assert.assertTrue(sanityPageContainer.goalTracking.clickYesButton());
        Assert.assertTrue(sanityPageContainer.goalTracking.verifyDeletedRecord());
    }

    @And("I click on menu in Alcohol card & change privacy settings")
    public void iClickOnMenuInAlcoholCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyAlcoholShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAlcohol());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconAlcoholMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Anxiety Severity card & change privacy settings")
    public void iClickOnMenuInAnxietySeverityCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxiety());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyAnxietySeverityShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickAnxiety());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconAnxietySeverityMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in  Blood Pressure card & change privacy settings")
    public void iClickOnMenuInBloodPressureCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodPressureShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodPressure());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconBloodPressureMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Blood Sugar card & change privacy settings")
    public void iClickOnMenuInBloodSugarCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugar());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBloodSugar());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconBloodSugarMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Depression card & change privacy settings")
    public void iClickOnMenuInDepressionCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepression());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyAnxietySeverityShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDepression());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconDepressionMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Drinking Survey card & change privacy settings")
    public void iClickOnMenuInDrinkingSurveyCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurvey());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyAnxietySeverityShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickDrinkingSurvey());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconDrinkingSurveyMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in HBAC card & change privacy settings")
    public void iClickOnMenuInHBACCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHBA1C());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHBA1C());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconHBA1CMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in HDL card & change privacy settings")
    public void iClickOnMenuInHDLCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDL());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHDL());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconHDLMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in LDL card & change privacy settings")
    public void iClickOnMenuInLDLCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDL());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickLDL());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconLDLMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Peak Flow card & change privacy settings")
    public void iClickOnMenuInPeakFlowCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlow());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickPeakFlow());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconPeakFlowMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Smoking card & change privacy settings")
    public void iClickOnMenuInSmokingCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmoking());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickSmoking());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconSmokingMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Total Cholesterol card & change privacy settings")
    public void iClickOnMenuInTotalCholesterolCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterol());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTotalCholesterol());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconTotalCholesterolMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Triglycerides card & change privacy settings")
    public void iClickOnMenuInTriglyceridesCardChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglycerides());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickTriglycerides());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconTriglyceridesMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Waist Size & change privacy settings")
    public void iClickOnMenuInWaistSizeChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSize());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWaistSize());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconWaistSizeMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in BMI & change privacy settings")
    public void iClickOnMenuInBMIChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMI());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickBMI());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconBMIMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Height & change privacy settings")
    public void iClickOnMenuInHeightChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightCard());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickHeightCard());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconHeightMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("I click on menu in Weight & change privacy settings")
    public void iClickOnMenuInWeightChangePrivacySettings(List<String> details) {
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholChangePrivateSettingIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightCard());
        Assert.assertFalse(sanityPageContainer.myHealthIndicators.VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickMenuMyHealthIndicators());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.ClickAlcoholKeepthisprivateIcon(TestDataUtil.getListOfValue(details.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickViewsummary());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.clickWeightCard());
        Assert.assertTrue(sanityPageContainer.myHealthIndicators.verifyDeleteIconWeightMyEntriesTableData(TestDataUtil.getListOfValue(details.get(0))));
    }

    @And("View latest three patient Appointments in upcoming appointments card")
    public void viewLatestThreePatientAppointmentsInUpcomingAppointmentsCard(List<String> strDetails) {
        for (String strData : strDetails) {

            System.out.println("strData >>> :: " + strData);
            Assert.assertTrue(sanityPageContainer.dashboardPage.verifyAppointmentsInDashboard(strData));

        }
    }

    @Given("As a user I am on Doctor portal homepage and Navigate to Search Patient")
    public void asAUserIAmOnDoctorPortalHomepageAndNavigateToSearchPatient() {
        Assert.assertTrue(sanityPageContainer.profilesPage.navigateToSearchPatient());

    }

    @And("As I enter the Search Patient {string}")
    public void asIEnterTheSearchPatient(String strDetail) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("List Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(sanityPageContainer.profilesPage.selectHealthCenter(TestDataUtil.getValue(lstMessageDetails.get(0))));
        sanityPageContainer.profilesPage.SearchOrder(TestDataUtil.getValue(lstMessageDetails.get(1)));
        sanityPageContainer.profilesPage.enterPatientName(TestDataUtil.getValue(lstMessageDetails.get(2)));
    }

    @When("I Click the Search button and verify result")
    public void iClickTheSearchButtonAndVerifyResult() {
        Assert.assertTrue(sanityPageContainer.profilesPage.clickSearchButton());
    }

    @Then("I navigate to view goals")
    public void iNavigateToViewGoals() {

        Assert.assertTrue(sanityPageContainer.profilesPage.selectViewGoals());
    }


    @And("I verify the provider Access Information of patient {string}")
    public void iVerifyTheProviderAccessInformationOfPatient(String strDetail) {

        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("List Details >>> :: " + lstMessageDetails);
//        Assert.assertTrue(sanityPageContainer.profilesPage.verifyWhoAccessedMyRecords(strDetail));

    }

    @Given("As a user I am on Doctor portal homepage and Navigate to Post notice board")
    public void asAUserIAmOnDoctorPortalHomepageAndNavigateToPostNoticeBoard() {
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.navigateToPostNoticeBoard());

    }

    @And("I Enter the notice board message {string}")
    public void iEnterTheNoticeBoardMessage(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("List Details >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.selectHealthCenter(TestDataUtil.getValue(lstDetails.get(0))));
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.clickNewPost());
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.selectContentType(TestDataUtil.getValue(lstDetails.get(1))));
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.selectContentHeader(TestDataUtil.getValue(lstDetails.get(2))));
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.selectDate());
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.enterBodyMessage(TestDataUtil.getValue(lstDetails.get(3))));
        sanityPageContainer.myHealthCentresPage.clickSave();
    }

    @And("I verify the notice board message {string}")
    public void iVerifyTheNoticeBoardMessage(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("List Details >>> :: " + lstDetails);
        Assert.assertTrue(sanityPageContainer.myHealthCentresPage.verifyNoticeBoardMessage(strDetail));

    }

    @And("click on Beating the Blues & click on View Session")
    public void clickOnBeatingTheBluesClickOnViewSession() {
        Assert.assertTrue(sanityPageContainer.beatingTheBlues.clickViewsummary());
        sanityPageContainer.beatingTheBlues.clickViewsession();
    }

    @Then("click view all the steps of session in Beating the Blues")
    public void clickViewAllTheStepsOfSessionInBeatingTheBlues() {
        Assert.assertTrue(sanityPageContainer.beatingTheBlues.clickContinuesession1());
        Assert.assertTrue(sanityPageContainer.viewJournal.clickDashBoard());
    }

    @And("I click on {string} Add Task delete icon")
    public void iClickOnAddTaskDeleteIcon(String Taskdetails) {
        Assert.assertTrue(sanityPageContainer.goalTracking.ClickDeleteFutureTaskTableData(TestDataUtil.getValue(Taskdetails)));
        System.out.println(">>>>>>>>>>>>>"+TestDataUtil.getValue(Taskdetails));


    }


}




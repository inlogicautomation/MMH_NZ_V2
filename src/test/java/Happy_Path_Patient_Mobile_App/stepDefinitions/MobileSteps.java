package Happy_Path_Patient_Mobile_App.stepDefinitions;

import Happy_Path_Patient_Mobile_App.DemoScreenContainer;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class MobileSteps {

    private DemoScreenContainer demoScreenContainer;

    public MobileSteps(DemoScreenContainer demoScreenContainer) {
        this.demoScreenContainer = demoScreenContainer;
    }


    @Given("I am on MMH Login screen")
    public void iAmOnMMHLoginScreen() {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.loginScreen.verifyMMHLoginScreenForiOS());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.loginScreen.verifyMMHLoginScreen());
        }
    }

    @When("I enter {string} and {string} in login screen")
    public void iEnterAndInLoginScreen(String strUserName, String strPassword) {
        demoScreenContainer.loginScreen.enterUserName(TestDataUtil.getValue(strUserName));
        demoScreenContainer.loginScreen.enterPassword(TestDataUtil.getValue(strPassword));
    }

    @Then("I should see MMH Home screen")
    public void iShouldSeeMMHHomeScreen() {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.homeScreen.verifyMMHHomeScreen());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("iOS")) {
            Assert.assertTrue(demoScreenContainer.homeScreen.verifyMMHHomeScreeniOS());
        }
    }

    @Given("I am on MMH Home screen")
    public void iAmOnMMHHomeScreen() {
        Assert.assertTrue(demoScreenContainer.homeScreen.gotoAndVerifyMMHHomeScreen());
    }

    @And("I tap on {string} option in home screen")
    public void iTapOnOptionInHomeScreen(String strOption) {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.homeScreen.tapOptionsInHomeScreen(TestDataUtil.getValue(strOption));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.homeScreen.tapOptionsInHomeScreeniOS(TestDataUtil.getValue(strOption));
        }
    }

    @Then("I should see Future and Past tabs")
    public void iShouldSeeFutureAndPastTabs() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyFutureAndPastTab());
    }

    @When("I tap on Sign-In button")
    public void iTapOnSignInButton() {
        demoScreenContainer.loginScreen.tapSignIn();
    }

    @And("I tap on {string} tab in Book Appointment")
    public void iTapOnTabInBookAppointment(String strTab) {
        demoScreenContainer.appointmentsScreen.tapTabInBookAppointment(TestDataUtil.getValue(strTab));
    }

    @And("I tap Book Appointment under Future tab")
    public void iTapBookAppointmentUnderFutureTab() {
        demoScreenContainer.appointmentsScreen.tapBookAppointmentButton();
    }

    @And("I enter the {string} {string}")
    public void iEnterTheVisitAppointmentDetails(String strAppointment, String strAppointmentDetails) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.appointmentsScreen.selectLocation(lstAppointmentDetails.get(0));
            demoScreenContainer.appointmentsScreen.selectAppointmentsPolicy();
            demoScreenContainer.appointmentsScreen.selectProvider(lstAppointmentDetails.get(1));
            demoScreenContainer.appointmentsScreen.tapNoInAppointmentPreScreening();
            demoScreenContainer.appointmentsScreen.selectAppointmentDate(lstAppointmentDetails.get(1), lstAppointmentDetails.get(2));
            demoScreenContainer.appointmentsScreen.selectAppointmentOption(TestDataUtil.getValue(strAppointment));
            demoScreenContainer.appointmentsScreen.selectAvailableTimeSlot();
            demoScreenContainer.appointmentsScreen.selectReason(lstAppointmentDetails.get(3));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.appointmentsScreen.selectLocationIOS(lstAppointmentDetails.get(0));
            demoScreenContainer.appointmentsScreen.tapNoInAppointmentPreScreening();
            demoScreenContainer.appointmentsScreen.selectProviderIOS(lstAppointmentDetails.get(1));
            demoScreenContainer.appointmentsScreen.selectAppointmentDateIOS(lstAppointmentDetails.get(1), lstAppointmentDetails.get(2));
            demoScreenContainer.appointmentsScreen.selectAppointmentOptionIOS(TestDataUtil.getValue(strAppointment));
            demoScreenContainer.appointmentsScreen.selectAvailableTimeSlotIOS();
            demoScreenContainer.appointmentsScreen.selectReasonIOS(lstAppointmentDetails.get(3));
        }
    }

    @And("I should see Confirm Appointment details {string} {string}")
    public void iShouldSeeConfirmAppointmentDetails(String strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyDetailsOfConfirmAppointment(lstDetails, TestDataUtil.getValue(strFutureDate)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyDetailsOfConfirmAppointmentIOS(lstDetails, TestDataUtil.getValue(strFutureDate)));
        }
    }

    @And("I Send Appointment Request through pay at health centre")
    public void iSendAppointmentRequestThroughPayAtHealthCentre() {
        demoScreenContainer.appointmentsScreen.tapSendAppointmentRequest();
        demoScreenContainer.appointmentsScreen.tapPayHealthCentre();
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyAppointmentInformation());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @Then("I should see booked {string} displayed under Service Tab {string} {string}")
    public void iShouldSeeBookedAppointmentDisplayedUnderServiceTab(String strAppointment, String
            strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedAppointmentInServiceTab(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
            Assert.assertTrue(demoScreenContainer.homeScreen.gotoAndVerifyMMHHomeScreen());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedAppointmentInServiceTabIOS(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
        }
    }

    @And("I enter the {string} in Confirm Appointment")
    public void iEnterTheInConfirmAppointment(String strContactNumber) {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.appointmentsScreen.enterContactNumber(TestDataUtil.getValue(strContactNumber));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.appointmentsScreen.enterContactNumberIOS(TestDataUtil.getValue(strContactNumber));
        }
    }
    @Given("I am on Payment Options screen")
    public void iAmOnPaymentOptionsScreen() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyPaymentOptions());
    }

    @When("I Send Appointment Request")
    public void iSendAppointmentRequest() {
        demoScreenContainer.appointmentsScreen.tapSendAppointmentRequest();
    }

    @When("I tap Pay Now button and tap OK in payment info popup message")
    public void iTapPayNowButtonAndTapOKInPaymentInfoPopupMessage() {
        demoScreenContainer.appointmentsScreen.tapPayNow();
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyPaymentInformation());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @When("I enter the {string} and submit")
    public void iEnterTheAndSubmit(String strCardDetails) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strCardDetails);
        demoScreenContainer.appointmentsScreen.enterCardNumber(lstDetails.get(0));
        demoScreenContainer.appointmentsScreen.enterCardName(lstDetails.get(1));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.appointmentsScreen.selectExpiryDate(lstDetails.get(2), lstDetails.get(3));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.appointmentsScreen.selectExpiryDateIOS(lstDetails.get(2), lstDetails.get(3));
        }
        demoScreenContainer.appointmentsScreen.enterCVCNumber(lstDetails.get(4));
        demoScreenContainer.appointmentsScreen.tapSubmit();
    }

    @Then("I should see Transaction Approved message")
    public void iShouldSeeTransactionApprovedMessage() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyTransactionApproved());
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.verifyPaymentStatus());
        demoScreenContainer.appointmentsScreen.tapContinue();
    }

    @And("I should see payment {string} displayed under Service Tab {string} {string}")
    public void iShouldSeePaymentDisplayedUnderServiceTab(String strAppointment, String
            strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedPaymentAppointmentInServiceTab(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedPaymentAppointmentInServiceTabIOS(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
        }
    }

    @Given("I am on Confirm Appointment screen")
    public void iAmOnConfirmAppointmentScreen() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyConfirmAppointment());
    }

    @And("I verify Appointment Request Submitted Successfully popup message")
    public void iVerifyAppointmentRequestSubmittedSuccessfullyPopupMessage() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyAppointmentInformation());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @And("I tap on {string} in Health Records")
    public void iTapOnInHealthRecords(String strHealthRecordOption) {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.healthRecordsScreen.tapHealthRecordOption(TestDataUtil.getValue(strHealthRecordOption));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.healthRecordsScreen.tapHealthRecordOptionIOS(TestDataUtil.getValue(strHealthRecordOption));
        }
    }

    @Then("I should see {string} and {string} in {string}")
    public void iShouldSeeAnd(String strRecords, String strDetails, String strRecordOption) {
        List<String> lstRecords = TestDataUtil.getListOfValue(strRecords);
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecords(TestDataUtil.getValue(strRecordOption), lstRecords));
            demoScreenContainer.healthRecordsScreen.tapRecordView(lstRecords);
            Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecordDetails(lstDetails));
            Assert.assertTrue(demoScreenContainer.homeScreen.gotoAndVerifyMMHHomeScreen());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecordsIOS(TestDataUtil.getValue(strRecordOption), lstRecords));
            demoScreenContainer.healthRecordsScreen.tapRecordViewIOS(lstRecords);
            Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecordDetailsIOS(lstDetails));
        }
    }

    @And("I should see Pathology Tests Explanation under Help")
    public void iShouldSeePathologyTestsExplanationUnderHelp() {
        demoScreenContainer.healthRecordsScreen.tapHelp();
        Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyPathologyTestsExplained());
        demoScreenContainer.healthRecordsScreen.tapClose();
    }

    @And("I select the {string} for {string}")
    public void iSelectTheFor(String strMedicationDetails, String strPickUpMethod) {
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.repeatRequestPrescriptionScreen.selectRepeatNewPrescription();
            demoScreenContainer.repeatRequestPrescriptionScreen.selectLocation(lstMedicationDetails.get(0));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectProvider(lstMedicationDetails.get(1));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectMedications(lstMedicationDetails.get(2));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectPickUpMethod(lstMedicationDetails.get(3));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectUrgency(lstMedicationDetails.get(4));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.repeatRequestPrescriptionScreen.selectLocationIOS(lstMedicationDetails.get(0));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectProviderIOS(lstMedicationDetails.get(1));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectMedicationsIOS(lstMedicationDetails.get(2));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectPickUpMethodIOS(lstMedicationDetails.get(3));
            demoScreenContainer.repeatRequestPrescriptionScreen.selectUrgencyIOS(lstMedicationDetails.get(4));
        }
    }

    @And("I enter {string} and accept the terms & conditions")
    public void iEnterAndAcceptTheTermsConditions(String strMessage) {
        demoScreenContainer.repeatRequestPrescriptionScreen.enterMessage(TestDataUtil.getValue(strMessage));
        demoScreenContainer.repeatRequestPrescriptionScreen.tapTermsAndConditions();
    }

    @When("I Send Prescription Request through pay at health centre")
    public void iSendPrescriptionRequestThroughPayAtHealthCentre() {
        demoScreenContainer.repeatRequestPrescriptionScreen.tapSendPrescriptionRequest();
        demoScreenContainer.appointmentsScreen.tapPayHealthCentre();
    }

    @Then("I should see Repeat prescription request sent successfully popup message")
    public void iShouldSeeRepeatPrescriptionRequestSentSuccessfullyPopupMessage() {
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.verifyRepeatPrescriptionRequestInformation());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @And("I should see {string} displayed under Service Tab")
    public void iShouldSeeDisplayedUnderServiceTab(String strStatusDetails) {
        List<String> lstStatusDetails = TestDataUtil.getListOfValue(strStatusDetails);
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.verifyRPStatus(lstStatusDetails));
    }

    @And("I select the {string} to send script")
    public void iSelectTheToSendScript(String strPharmacyDetails) {
        List<String> lstPharmacyDetails = TestDataUtil.getListOfValue(strPharmacyDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            if (strPharmacyDetails.contains("SEND_SCRIPT_TO_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectPharmacy(lstPharmacyDetails);
            } else if (strPharmacyDetails.contains("DELIVERY_MED_BY_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectMedByPharmacy(lstPharmacyDetails);
            } else if (strPharmacyDetails.contains("DELIVER_VIA_ZOOM_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectDeliveryAddress(lstPharmacyDetails);
            }
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            if (strPharmacyDetails.contains("SEND_SCRIPT_TO_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectPharmacyIOS(lstPharmacyDetails);
            } else if (strPharmacyDetails.contains("DELIVERY_MED_BY_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectMedByPharmacyIOS(lstPharmacyDetails);
            } else if (strPharmacyDetails.contains("DELIVER_VIA_ZOOM_PHARMACY")) {
                demoScreenContainer.repeatRequestPrescriptionScreen.selectDeliveryAddress(lstPharmacyDetails);
            }
        }
    }

    @And("I Send Prescription Request")
    public void iSendPrescriptionRequest() {
        demoScreenContainer.repeatRequestPrescriptionScreen.tapSendPrescriptionRequest();

    }

    @And("I tap on {string} tab")
    public void iTapOnTab(String strTab) {
        demoScreenContainer.messageScreen.tapTabInInbox(TestDataUtil.getValue(strTab));
    }

    @And("I select the {string} for Patient Sending Message")
    public void iSelectTheForPatientSendingMessage(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        demoScreenContainer.messageScreen.tapCompose();
        demoScreenContainer.messageScreen.selectLocation(lstMessageDetails.get(0));
        demoScreenContainer.messageScreen.selectService(lstMessageDetails.get(1));
        demoScreenContainer.messageScreen.verifyInformation();
        demoScreenContainer.appointmentsScreen.tapOK();
        demoScreenContainer.messageScreen.selectRole(lstMessageDetails.get(2));
        demoScreenContainer.messageScreen.selectStaff(lstMessageDetails.get(3));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifyDetails(lstMessageDetails));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifyDetailsIOS(lstMessageDetails));
        }
    }

    @And("I enter {string} and attach the file")
    public void iEnterAndAttachTheFile(String strMessageAndImage) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageAndImage);
        demoScreenContainer.messageScreen.enterMessage(TestDataUtil.getValue(lstMessageDetails.get(0)));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.messageScreen.uploadFile(lstMessageDetails.get(1));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.messageScreen.uploadFileIOS(lstMessageDetails.get(1));
        }
    }

    @When("I tap send message button")
    public void iTapSendMessageButton() {
        demoScreenContainer.messageScreen.tapSend();
    }

    @Given("I am on Service Screen")
    public void iAmOnServiceScreen() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyServiceScreen());
    }

    @When("I cancel the created appointment")
    public void iCancelTheCreatedAppointment() {
        demoScreenContainer.appointmentsScreen.tapCancelAppointment();
    }

    @Then("I should see Appointment cancelled message")
    public void iShouldSeeAppointmentCancelledMessage() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCancelMessage());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @Then("I should Message sent Successfully info message")
    public void iShouldMessageSentSuccessfullyInfoMessage() {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
//            Assert.assertTrue(demoScreenContainer.messageScreen.verifySuccessfullMessage());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifySuccessfullMessageIOS());
        }
    }

    @And("I should see sent {string} under {string} tab")
    public void iShouldSeeSentUnderTab(String strMessageDetails, String strTab) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        demoScreenContainer.messageScreen.tapTabInInbox(TestDataUtil.getValue(strTab));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifySentMessage(lstMessageDetails));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifySentMessageIOS(lstMessageDetails));
        }

    }

    @And("I select the {string} for Doctor Sending Message")
    public void iSelectTheForDoctorSendingMessage(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        demoScreenContainer.messageScreen.tapCompose();
        demoScreenContainer.messageScreen.selectLocation(lstMessageDetails.get(0));
        demoScreenContainer.messageScreen.selectService(lstMessageDetails.get(1));
        demoScreenContainer.messageScreen.verifyInformation();
        demoScreenContainer.appointmentsScreen.tapOK();
        demoScreenContainer.messageScreen.selectRole(lstMessageDetails.get(2));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.messageScreen.enterPatient(lstMessageDetails.get(3));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.messageScreen.enterPatientIOS(lstMessageDetails.get(3));
        }
//        Assert.assertTrue(demoScreenContainer.messageScreen.verifyDetails(lstMessageDetails));
    }

    @Then("I tap on logout icon in Home screen")
    public void iTapOnLogoutIconInHomeScreen() {
        demoScreenContainer.homeScreen.tapLogout();
        Assert.assertTrue(demoScreenContainer.loginScreen.verifyMMHLoginScreen());
    }

    @Then("I should see {string} received by patient")
    public void iShouldSeeReceivedByPatient(String strReceivedMessageDetails) {
        List<String> lstReceivedMessageDetails = TestDataUtil.getListOfValue(strReceivedMessageDetails);
        Assert.assertTrue(demoScreenContainer.messageScreen.verifyReceivedMessage(lstReceivedMessageDetails));
    }

    @And("I tap on {string} to view the details")
    public void iTapOnToViewTheDetails(String strReceivedMessageDetails) {
        List<String> lstReceivedMessageDetails = TestDataUtil.getListOfValue(strReceivedMessageDetails);
        demoScreenContainer.messageScreen.tapReceivedMessage(lstReceivedMessageDetails);
    }

    @And("I tap on on attached file and file gets downloaded")
    public void iTapOnOnAttachedFileAndFileGetsDownloaded() {
        demoScreenContainer.messageScreen.tapAttachedFile();
        demoScreenContainer.messageScreen.verifyDownloadedFile();
    }

    @When("I tap Achieve icon for the specific message")
    public void iTapAchieveIconForTheSpecificMessage() {
        demoScreenContainer.messageScreen.tapArchiveIcon();
        demoScreenContainer.messageScreen.verifyInformation();
        demoScreenContainer.messageScreen.tapYes();
    }

    @Then("I should see specific {string} navigate to {string} message")
    public void iShouldSeeSpecificMessageNavigateToArchiveMessage(String strReceivedMessageDetails, String strTab) {
        List<String> lstReceivedMessageDetails = TestDataUtil.getListOfValue(strReceivedMessageDetails);
        demoScreenContainer.messageScreen.tapTabInInbox(TestDataUtil.getValue(strTab));
        if (strReceivedMessageDetails.contains("REPLY_MESSAGE")) {
            demoScreenContainer.messageScreen.verifyReplyMessage(lstReceivedMessageDetails);
        } else {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifyReceivedMessage(lstReceivedMessageDetails));
        }
    }

    @And("I tap Reply and enter {string}")
    public void iTapReplyAndEnter(String strReplyMessageDetails) {
        List<String> lstReplyMessageDetails = TestDataUtil.getListOfValue(strReplyMessageDetails);
        demoScreenContainer.messageScreen.tapReplyIcon();
        demoScreenContainer.messageScreen.enterReplyMessage(TestDataUtil.getValue(lstReplyMessageDetails.get(1)));
    }


    @And("I should see specific {string} in details")
    public void iShouldSeeSpecificInDetails(String strReceivedMessageDetails) {
        List<String> lstReceivedMessageDetails = TestDataUtil.getListOfValue(strReceivedMessageDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifySpecificMsgDetails(lstReceivedMessageDetails));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            if (strReceivedMessageDetails.contains("GROUP_MESSAGE")) {
                Assert.assertTrue(demoScreenContainer.messageScreen.verifyGroupMsgDetailsIOS(lstReceivedMessageDetails));
            } else {
                Assert.assertTrue(demoScreenContainer.messageScreen.verifySpecificMsgDetailsIOS(lstReceivedMessageDetails));
            }
        }
    }

    @And("I tap on Notification icon in Home screen")
    public void iTapOnNotificationIconInHomeScreen() {

        demoScreenContainer.messageScreen.tapNotification();
    }

    @And("I switch to Account to Account payment method")
    public void iSwitchToAccountToAccountPaymentMethod() {
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.selectAccountToAccount());
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.repeatRequestPrescriptionScreen.selectAccountToAccountIOS();
        }
    }


    @When("I enter the Account{string} and Next")
    public void iEnterTheAccountAndNext(String strDetails) {
        List <String> lstDetails=TestDataUtil.getListOfValue(strDetails);
        demoScreenContainer.repeatRequestPrescriptionScreen.enterCustomerNumber(lstDetails.get(1));
        demoScreenContainer.repeatRequestPrescriptionScreen.enterPassword(lstDetails.get(2));
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.clickNext());
    }


    @Then("I should select the Bank account {string}")
    public void iShouldSelectTheBankAccount(String strBankAccount) {
        List <String> lstDetails=TestDataUtil.getListOfValue(strBankAccount);
//        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.selectBankAccount(lstDetails.get(3)));
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.clickNext());
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.clickNext());
//        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.clickNext());

    }

    @And("I select bank {string} and Next")
    public void iSelectBankAndNext(String strDetails) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.selectBank(lstDetails.get(0)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.selectBankIOS(lstDetails.get(0)));
        }
    }

    @Then("I should see the Transaction Approved message for AtoA Payment")
    public void iShouldSeeTheTransactionApprovedMessageForAAPayment() {
        Assert.assertTrue(demoScreenContainer.repeatRequestPrescriptionScreen.verifyPaymentStatus());
        demoScreenContainer.appointmentsScreen.tapContinue();
    }

    @When("I Send Prescription Request through pay at health centre for zero payment")
    public void iSendPrescriptionRequestThroughPayAtHealthCentreForZeroPayment() {
        demoScreenContainer.repeatRequestPrescriptionScreen.tapSendPrescriptionRequest();
    }

    @And("I tap ok button on popup")
    public void iTapOkButtonOnPopup() {
        demoScreenContainer.appointmentsScreen.tapOK();
    }


    @And("I select the {string} for Patient Sending Message {string}")
    public void iSelectTheForPatientSendingMessage(String strMessageDetails, String strVerifyMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        List<String> lstVerifyMessageDetails = TestDataUtil.getListOfValue(strVerifyMessageDetails);
        demoScreenContainer.messageScreen.tapCompose();
        demoScreenContainer.messageScreen.selectLocation(lstMessageDetails.get(0));
        demoScreenContainer.messageScreen.selectService(lstMessageDetails.get(1));
        demoScreenContainer.messageScreen.verifyInformation();
        demoScreenContainer.appointmentsScreen.tapOK();
        demoScreenContainer.messageScreen.selectRole(lstMessageDetails.get(2));
        demoScreenContainer.messageScreen.selectStaff(lstMessageDetails.get(3));
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifyDetails(lstVerifyMessageDetails));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            Assert.assertTrue(demoScreenContainer.messageScreen.verifyDetailsIOS(lstVerifyMessageDetails));
        }
    }

    @When("I enter the video Appointment {string} {string}")
    public void iEnterTheVideoAppointment(String strAppointment, String strAppointmentDetails) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            demoScreenContainer.appointmentsScreen.selectLocation(lstAppointmentDetails.get(0));
            demoScreenContainer.appointmentsScreen.selectAppointmentsPolicy();
            demoScreenContainer.appointmentsScreen.selectProvider(lstAppointmentDetails.get(1));
            demoScreenContainer.appointmentsScreen.tapNoInAppointmentPreScreening();
            demoScreenContainer.appointmentsScreen.selectAppointmentDate(lstAppointmentDetails.get(1), lstAppointmentDetails.get(2));
            demoScreenContainer.appointmentsScreen.selectAppointmentOption(TestDataUtil.getValue(strAppointment));
            demoScreenContainer.appointmentsScreen.selectAvailableTimeSlot();
            demoScreenContainer.appointmentsScreen.selectAppointmentVideoCallOptions(TestDataUtil.getValue(lstAppointmentDetails.get(3)));
            demoScreenContainer.appointmentsScreen.selectReason(lstAppointmentDetails.get(4));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            demoScreenContainer.appointmentsScreen.selectLocationIOS(lstAppointmentDetails.get(0));
            demoScreenContainer.appointmentsScreen.tapNoInAppointmentPreScreening();
            demoScreenContainer.appointmentsScreen.selectProviderIOS(lstAppointmentDetails.get(1));
            demoScreenContainer.appointmentsScreen.selectAppointmentDateIOS(lstAppointmentDetails.get(1), lstAppointmentDetails.get(2));
            demoScreenContainer.appointmentsScreen.selectAppointmentOptionIOS(TestDataUtil.getValue(strAppointment));
            demoScreenContainer.appointmentsScreen.selectAvailableTimeSlotIOS();
            demoScreenContainer.appointmentsScreen.selectReasonIOS(lstAppointmentDetails.get(3));
        }


    }
}

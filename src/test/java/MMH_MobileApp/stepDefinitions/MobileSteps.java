package MMH_MobileApp.stepDefinitions;

import MMH_MobileApp.DemoScreenContainer;
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
        Assert.assertTrue(demoScreenContainer.loginScreen.verifyMMHLoginScreen());

    }

    @When("I enter {string} and {string} in login screen")
    public void iEnterAndInLoginScreen(String strUserName, String strPassword) {
        demoScreenContainer.loginScreen.enterUserName(TestDataUtil.getValue(strUserName));
        demoScreenContainer.loginScreen.enterPassword(TestDataUtil.getValue(strPassword));
    }

    @Then("I should see MMH Home screen")
    public void iShouldSeeMMHHomeScreen() {
        Assert.assertTrue(demoScreenContainer.homeScreen.verifyMMHHomeScreen());
    }

    @Given("I am on MMH Home screen")
    public void iAmOnMMHHomeScreen() {
        Assert.assertTrue(demoScreenContainer.homeScreen.gotoAndVerifyMMHHomeScreen());
    }

    @And("I tap on {string} option in home screen")
    public void iTapOnOptionInHomeScreen(String strOption) {
        demoScreenContainer.homeScreen.tapOptionsInHomeScreen(TestDataUtil.getValue(strOption));
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
        demoScreenContainer.appointmentsScreen.tapLocation(lstAppointmentDetails.get(0));
        demoScreenContainer.appointmentsScreen.tapNoInAppointmentPreScreening();
        demoScreenContainer.appointmentsScreen.selectProvider(lstAppointmentDetails.get(1));
        demoScreenContainer.appointmentsScreen.selectAppointmentDate(lstAppointmentDetails.get(1), lstAppointmentDetails.get(2));
        demoScreenContainer.appointmentsScreen.selectAppointmentOption(TestDataUtil.getValue(strAppointment));
        demoScreenContainer.appointmentsScreen.selectAvailableTimeSlot();
        demoScreenContainer.appointmentsScreen.selectReason(lstAppointmentDetails.get(3));
    }

    @And("I should see Confirm Appointment details {string} {string}")
    public void iShouldSeeConfirmAppointmentDetails(String strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyDetailsOfConfirmAppointment(lstDetails, TestDataUtil.getValue(strFutureDate)));
    }

    @And("I Send Appointment Request through pay at health centre")
    public void iSendAppointmentRequestThroughPayAtHealthCentre() {
        demoScreenContainer.appointmentsScreen.tapSendAppointmentRequest();
        demoScreenContainer.appointmentsScreen.tapPayHealthCentre();
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyAppointmentInformation());
        demoScreenContainer.appointmentsScreen.tapOK();
    }

    @Then("I should see booked {string} displayed under Service Tab {string} {string}")
    public void iShouldSeeBookedAppointmentDisplayedUnderServiceTab(String strAppointment, String strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedAppointmentInServiceTab(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
    }

    @And("I enter the {string} in Confirm Appointment")
    public void iEnterTheInConfirmAppointment(String strContactNumber) {
        demoScreenContainer.appointmentsScreen.enterContactNumber(TestDataUtil.getValue(strContactNumber));
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
        demoScreenContainer.appointmentsScreen.selectExpiryDate(lstDetails.get(2), lstDetails.get(3));
        demoScreenContainer.appointmentsScreen.enterCVCNumber(lstDetails.get(4));
        demoScreenContainer.appointmentsScreen.tapSubmit();

    }

    @Then("I should see Transaction Approved message")
    public void iShouldSeeTransactionApprovedMessage() {
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyTransactionApproved());
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyPaymentStatus());
        demoScreenContainer.appointmentsScreen.tapContinue();
    }

    @And("I should see payment {string} displayed under Service Tab {string} {string}")
    public void iShouldSeePaymentDisplayedUnderServiceTab(String strAppointment, String strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        Assert.assertTrue(demoScreenContainer.appointmentsScreen.verifyCreatedPaymentAppointmentInServiceTab(lstDetails, TestDataUtil.getValue(strFutureDate), TestDataUtil.getValue(strAppointment)));
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
        demoScreenContainer.healthRecordsScreen.tapHealthRecordOption(TestDataUtil.getValue(strHealthRecordOption));
    }

    @Then("I should see {string} and {string} in {string}")
    public void iShouldSeeAnd(String strRecords, String strDetails, String strRecordOption) {
        List<String> lstRecords = TestDataUtil.getListOfValue(strRecords);
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecords(TestDataUtil.getValue(strRecordOption), lstRecords));
        demoScreenContainer.healthRecordsScreen.tapRecordView(lstRecords);
        Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyRecordDetails(lstDetails));
    }

    @And("I should see Pathology Tests Explanation under Help")
    public void iShouldSeePathologyTestsExplanationUnderHelp() {
        demoScreenContainer.healthRecordsScreen.tapHelp();
        Assert.assertTrue(demoScreenContainer.healthRecordsScreen.verifyPathologyTestsExplained());
        demoScreenContainer.healthRecordsScreen.tapClose();
    }
}

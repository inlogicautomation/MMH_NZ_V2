package MMH.stepDefinitions;

import cap.utilities.TestDataUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import MMH.DemoPageContainer;

import java.util.List;

/*
 * Created by Codoidian-pc on 05/03/2022.
 */
public class WebSteps {

    private DemoPageContainer demoPageContainer;

    public WebSteps(DemoPageContainer demoPageContainer) {
        this.demoPageContainer = demoPageContainer;
    }

    @Given("As a user I am on MMH login Page")
    public void asAUserIAmOnMMHLoginPage() {
        demoPageContainer.homePage.visit();
//        Assert.assertTrue(demoPageContainer.homePage.waitForMMHLoginPage());

    }

    @When("I enter {string} and {string}")
    public void iEnterEmailAddressAndPassword(String strEmail, String strPassword) {
        demoPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
        demoPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));

    }

    @Then("I should see user successfully logs in to the MMH portal")
    public void iShouldSeeUserSuccessfullyLogsInToTheMMHPortal() {
        Assert.assertTrue(demoPageContainer.homePage.verifyHomePageOfMMHPortal());
    }

    @When("I click login button")
    public void iClickLoginButton() {
        demoPageContainer.homePage.clickLoginButton();
    }

    @Given("As a user I am on HomePage")
    public void asAUserIAmOnHomePage() {
        Assert.assertTrue(demoPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(demoPageContainer.homePage.verifyHomePageOfMMHPortal());

    }

    @When("I navigate to the Future Appointments page")
    public void iNavigateToTheFutureAppointmentsPage() {
        demoPageContainer.homePage.clickAppointmentOptionFromMenu();
    }

    @Then("I should see all the future date booked appointments in future appointment page")
    public void iShouldSeeAllTheFutureDateBookedAppointmentsInFutureAppointmentPage() {
        Assert.assertTrue(demoPageContainer.homePage.verifyFutureAppoinmentsPage());
    }

//    @And("I switch to card view to see future appointments in card view")
//    public void iSwitchToCardViewToSeeFutureAppointmentsInCardView() {
//        demoPageContainer.homePage.clickCardView();
//        Assert.assertTrue(demoPageContainer.homePage.verifyAppointmentsInCardView());
//    }

//    @And("I switch to grid view to see future appointments in grid view")
//    public void iSwitchToGridViewToSeeFutureAppointmentsInGridView() {
//        demoPageContainer.homePage.clickGridView();
//        Assert.assertTrue(demoPageContainer.homePage.verifyAppointmentsInGridView());
//    }

    @And("I navigate to the {string} page")
    public void iNavigateToTheBookAAppointmentPage(String strAppointments) {
        Assert.assertTrue(demoPageContainer.homePage.clickAppointmentsExpandIcon());
        Assert.assertTrue(demoPageContainer.appointmentsPage.navigateToBookAppointmentPage(strAppointments));

    }

    @And("I enter the visit appointment details {string}")
    public void iEnterTheVisitAppointmentDetails(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
//        Assert.assertTrue(demoPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(lstAppointmentDetails.get(1))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAppointmentIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(2))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectReasonForBooking(TestDataUtil.getValue(lstAppointmentDetails.get(3))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectTypeOfAppointment(TestDataUtil.getValue(lstAppointmentDetails.get(4))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectProvider(TestDataUtil.getValue(lstAppointmentDetails.get(6))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectFutureDateOnCalender(TestDataUtil.getValue(lstAppointmentDetails.get(7))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAvialableSlotDateTime(TestDataUtil.getValue(lstAppointmentDetails.get(5))));
    }

    @When("I click confirm button")
    public void iClickConfirmButton() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickConfirmButton());
    }

    @Then("I should see details of created appointment {string} {string}")
    public void iShouldSeeDetailsOfCreatedAppointment(String strAppointmentDetails, String strFutureDate) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentDetails);
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyDetailsOfCreatedAppointment(lstDetails, (strFutureDate)));
    }

    @And("I accept the terms & conditions and confirm my booking")
    public void iAcceptTheTermsConditionsAndConfirmMyBooking() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.acceptTermsAndConditionsForAppointment());
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickConfirmYourBookingButton());
    }

    @And("I should see booked appointment displayed under the future tab {string}")
    public void iShouldSeeBookedAppointmentDisplayedUnderTheFutureTab(String strAppointmentSummary) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentSummary);
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyCreatedAppointmentInFutureAppointmentTab(lstDetails));
    }

    @And("I enter the video appointment details {string}")
    public void iEnterTheVideoAppointmentDetails(String strVideoAppointmentDetails) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strVideoAppointmentDetails);
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
//        Assert.assertTrue(demoPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(lstAppointmentDetails.get(1))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAppointmentIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(2))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectReasonForBooking(TestDataUtil.getValue(lstAppointmentDetails.get(3))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectTypeOfAppointment(TestDataUtil.getValue(lstAppointmentDetails.get(4))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectTypeOfVideoAppointment(TestDataUtil.getValue(lstAppointmentDetails.get(6))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectProvider(TestDataUtil.getValue(lstAppointmentDetails.get(7))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectFutureDateOnCalender(TestDataUtil.getValue(lstAppointmentDetails.get(8))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAvialableSlotDateTime(TestDataUtil.getValue(lstAppointmentDetails.get(5))));
    }

    @Given("I am on {string} page")
    public void iAmOnPage(String strTab) {
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyHeader(strTab));
    }

    @When("I switch to card view in future appointments page")
    public void iSwitchToCardViewInFutureAppointmentsPage() {
        demoPageContainer.appointmentsPage.clickCardView();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyCardView());
    }

    @When("I switch to grid view in future appointments page")
    public void iSwitchToGridViewInFutureAppointmentsPage() {
        demoPageContainer.appointmentsPage.clickGrid();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyGridView());
        demoPageContainer.appointmentsPage.clickMaxvalue();
    }

    @When("I switch to card view in past appointments page")
    public void iSwitchToCardViewInPastAppointmentsPage() {
        demoPageContainer.appointmentsPage.clickCardView();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyCardView());
    }

    @Then("I should see all the past date appointments in card view")
    public void iShouldSeeAllThePastDateAppointmentsInCardView() {
        demoPageContainer.appointmentsPage.getAllAppointmentDatesInCard();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAllAppointmentDatesInCardForPast());
    }

    @When("I switch to grid view in past appointments page")
    public void iSwitchToGridViewInPastAppointmentsPage() {
        demoPageContainer.appointmentsPage.clickGrid();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyGridView());
        demoPageContainer.appointmentsPage.clickMaxvalue();
    }

    @Then("I should see all the past date appointments in grid view")
    public void iShouldSeeAllThePastDateAppointmentsInGridView() {
        demoPageContainer.appointmentsPage.getAllAppointmentDatesInGrid();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAllAppointmentDatesInGridForPast());
    }

    @And("I navigate to {string} page")
    public void iNavigateToPage(String strAppointments) {
        Assert.assertTrue(demoPageContainer.homePage.clickAppointmentsExpandIcon());
        Assert.assertTrue(demoPageContainer.appointmentsPage.navigateToBookAppointmentPage(strAppointments));
    }

    @Then("I should see all the future date appointments in card view")
    public void iShouldSeeAllTheFutureDateAppointmentsInCardView() {
        demoPageContainer.appointmentsPage.getAllAppointmentDatesInCard();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAllAppointmentDatesInCard());
    }

    @Then("I should see all the future date appointments in grid view")
    public void iShouldSeeAllTheFutureDateAppointmentsInGridView() {
        demoPageContainer.appointmentsPage.getAllAppointmentDatesInGrid();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAllAppointmentDatesInGrid());

    }

    @And("I enter the phone appointment details {string}")
    public void iEnterThePhoneAppointmentDetails(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(lstAppointmentDetails.get(1))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAppointmentIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(2))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectReasonForBooking(TestDataUtil.getValue(lstAppointmentDetails.get(3))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectTypeOfAppointment(TestDataUtil.getValue(lstAppointmentDetails.get(4))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectPhoneCode(TestDataUtil.getValue(lstAppointmentDetails.get(7))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.enterPhoneNumber(TestDataUtil.getValue(lstAppointmentDetails.get(8))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectProvider(TestDataUtil.getValue(lstAppointmentDetails.get(6))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectFutureDateOnCalender(TestDataUtil.getValue(lstAppointmentDetails.get(9))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectAvialableSlotDateTime(TestDataUtil.getValue(lstAppointmentDetails.get(5))));
    }

    @And("I select payment option {string}")
    public void iSelectPaymentOption(String strPaymentOption) {
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectPaymentOption(TestDataUtil.getValue(strPaymentOption)));
    }

    @And("I see page navigated to the payment option")
    public void iSeePageNavigatedToThePaymentOption() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.acceptThePaymentPopup());
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyPageNavigatedToPaymentWindow());
    }

    @When("I enter the card details and confirm payment {string}")
    public void iEnterTheCardDetailsAndConfirmPayment(String strPayOnlineDetails) {
        List<String> lstPayOnlineDetails = TestDataUtil.getListOfValue(strPayOnlineDetails);
        Assert.assertTrue(demoPageContainer.appointmentsPage.vreifyAmount(TestDataUtil.getValue(lstPayOnlineDetails.get(0))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.enterCardNumber(TestDataUtil.getValue(lstPayOnlineDetails.get(1))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.enterNameOnCard(TestDataUtil.getValue(lstPayOnlineDetails.get(2))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.selectExpiryDate());
        Assert.assertTrue(demoPageContainer.appointmentsPage.enterCVCNumber(TestDataUtil.getValue(lstPayOnlineDetails.get(3))));
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickSubmitPayment());
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickPaymentCheckOut());
    }

    @Then("I should see payment has been processed successfully with appointment details {string}")
    public void iShouldSeePaymentHasBeenProcessedSuccessfullyWithAppointmentDetails(String strPaymentMessage) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strPaymentMessage);
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyPaymentSucessfullMessage(lstDetails));
    }

    @And("I click cancel button for the created appointment {string}")
    public void iClickCancelButtonForTheCreatedAppointment(String strAppointmentCancel) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentCancel);
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickCancelButtonForTheCreatedAppointment(lstDetails));
    }

    @And("I logout from tha application")
    public void iLogoutFromThaApplication() {

        Assert.assertTrue(demoPageContainer.homePage.clickLogoutButton());
    }

    @And("I enter reason to cancel appointment")
    public void iEnterReasonToCancelAppointment() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.entereasonForCancelAppointment());
    }

    @When("I click cancel your appointment button")
    public void iClickCancelYourAppointmentButton() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.clickCancelYourAppointment());
    }

    @Then("I should see Appointment cancelled message {string}")
    public void iShouldSeeAppointmentCancelledMessage(String strAppointmentCancel) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strAppointmentCancel);
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyCancelAppointmentMessage(lstDetails));
    }

    @Then("I should see all the all the video appointments invites sent from PMS Provider in grid view")
    public void iShouldSeeAllTheAllTheVideoAppointmentsInvitesSentFromPMSProviderInGridView() {
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyVideoPage());
        demoPageContainer.appointmentsPage.clickMaxvalue();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAlltheVideoAppointments());
    }

    @And("I join Video Consultation by clicking Join now Icon in Video invitations Gid {string}")
    public void iJoinVideoConsultationByClickingJoinNowIconInVideoInvitationsGid(String strAllIcons) {
        System.out.println("All Icons Value:::>>" + strAllIcons);
        List<String> lstIcons = TestDataUtil.getListOfValue(strAllIcons);
        demoPageContainer.appointmentsPage.clickFirstIcon();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyAllIcons(lstIcons));
        demoPageContainer.appointmentsPage.clickEndIcon();
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyVideoPage());
    }

    @And("I navigate to Messages page {string}")
    public void iNavigateToMessagesPage(String strMessages) {
        Assert.assertTrue(demoPageContainer.homePage.clickMesagesExpandIcon());
        Assert.assertTrue(demoPageContainer.appointmentsPage.navigateToMessagesPage(strMessages));
    }

//    @Given("As a user I am on MMH login Page")
//    public void asAUserIAmOnMMHLoginPage() {
//        demoPageContainer.homePage.visit();
////        Assert.assertTrue(demoPageContainer.homePage.waitForMMHLoginPage());
//
//    }

//    @When("I enter {string} and {string}")
//    public void iEnterEmailAddressAndPassword(String strEmail, String strPassword) {
//        demoPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
//        demoPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
//
//    }

    @When("I enter {string} and {string} For Beta")
    public void iEnterEmailAddressAndPasswordForBeta(String strEmail, String strPassword) {
        demoPageContainer.homePage.enterEmailForBeta(TestDataUtil.getValue(strEmail));
        demoPageContainer.homePage.enterpasswordForBeta(TestDataUtil.getValue(strPassword));

    }

//    @Then("I should see user successfully logs in to the MMH portal")
//    public void iShouldSeeUserSuccessfullyLogsInToTheMMHPortal() {
//        Assert.assertTrue(demoPageContainer.homePage.verifyHomePageOfMMHPortal());
//    }

//    @When("I click login button")
//    public void iClickLoginButton() {
//        demoPageContainer.homePage.clickLoginButton();
//    }

    @When("I click SignIn button")
    public void iClickSignInButton() {
        demoPageContainer.homePage.clickSignInButton();
    }

//    @Given("As a user I am on HomePage")
//    public void asAUserIAmOnHomePage() {
//        Assert.assertTrue(demoPageContainer.homePage.verifyHomePageOfMMHPortal());
//    }
//
//    @When("I navigate to the Future Appointments page")
//    public void iNavigateToTheFutureAppointmentsPage() {
//        demoPageContainer.homePage.clickAppointmentOptionFromMenu();
//    }
//
//    @Then("I should see all the future date booked appointments in future appointment page")
//    public void iShouldSeeAllTheFutureDateBookedAppointmentsInFutureAppointmentPage() {
//        Assert.assertTrue(demoPageContainer.homePage.verifyFutureAppoinmentsPage());
//    }

    @And("I switch to card view to see future appointments in card view")
    public void iSwitchToCardViewToSeeFutureAppointmentsInCardView() {
        demoPageContainer.homePage.clickCardView();
        Assert.assertTrue(demoPageContainer.homePage.verifyAppointmentsInCardView());
    }

    @And("I switch to grid view to see future appointments in grid view")
    public void iSwitchToGridViewToSeeFutureAppointmentsInGridView() {
        demoPageContainer.homePage.clickGridView();
        Assert.assertTrue(demoPageContainer.homePage.verifyAppointmentsInGridView());
    }


    @And("As a user I Accept Terms & Conditions and Click on Pay At Clinic")
    public void asAUserIAcceptTermsConditionsAndClickOnPayAtClinic() {

    }

    @Then("As user I should see the created Appointment under the future Appointment Tab")
    public void asUserIShouldSeeTheCreatedAppointmentUnderTheFutureAppointmentTab() {
    }


    @Given("As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription")
    public void NavigateToRepeatMedicationPage() {
        Assert.assertTrue(demoPageContainer.repeatPrescription.navigateToHomePage());
        Assert.assertTrue(demoPageContainer.repeatPrescription.navigateToRequestNewScript());

    }

    @And("I select the Medication details{string}")
    public void SelectTheMedicationDetails(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectUrgency(lstMedicationDetails.get(3)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectMedicationsToRepeat(lstMedicationDetails.get(4)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.addMessage(lstMedicationDetails.get(5)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectTermsAndCondition());
        Assert.assertTrue(demoPageContainer.repeatPrescription.clickPayAtHealthCentre());
    }

    @And("I should see the successful message and I navigate to view history of the Prescription")
    public void NavigateToViewHistoryOfThePrescription() {
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyTheSuccessAndNavigateToViewHistory());


    }


    @Then("I should see the Prescription status Sent Script by Post{string}")
    public void StatusOfThePrescription(String strMedicationDetails) {

        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetailsForSentScriptByPostInCardView(strMedicationDetails));


    }


    @And("I select the Medication details for Sent Script by Pharmacy {string}")
    public void MedicationDetailsForSentScriptByPharmacy(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyForSentScriptToPharmacy());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedListForSentScript(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectUrgency(lstMedicationDetails.get(5)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectMedicationsToRepeat(lstMedicationDetails.get(6)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.addMessage(lstMedicationDetails.get(7)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectTermsAndCondition());
        Assert.assertTrue(demoPageContainer.repeatPrescription.clickPayAtHealthCentre());
    }

    @And("I select the Medication details for Delivery Meds by Pharmacy {string}")
    public void MedicationDetailsForDeliveryMedsByPharmacy(String strMedicationDetails) {

        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyForDeliveryMedsByPharmacy());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedListForDelivery(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectAddress(lstMedicationDetails.get(5)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectUrgency(lstMedicationDetails.get(6)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectMedicationsToRepeat(lstMedicationDetails.get(7)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.addMessage(lstMedicationDetails.get(8)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectTermsAndCondition());
        Assert.assertTrue(demoPageContainer.repeatPrescription.clickPayAtHealthCentre());
    }

    @And("I select the Medication details for Delivery Meds by Pharmacy and Pay Online with Card {string}")
    public void DeliveryMedsByPharmacyAndPayOnlineWithCard(String strMedicationDetails) {

        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyForDeliveryMedsByPharmacy());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedListForDelivery(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectAddress(lstMedicationDetails.get(5)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectUrgency(lstMedicationDetails.get(6)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectMedicationsToRepeat(lstMedicationDetails.get(7)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.addMessage(lstMedicationDetails.get(8)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectTermsAndCondition());
        Assert.assertTrue(demoPageContainer.repeatPrescription.clickPayNow());
    }

    @And("I enter the Card details on the Payment Page {string}")
    public void EnterTheCardDetailsOnThePaymentPage(String strCardDetails) {

        System.out.println("strCardDetails " + strCardDetails);
        List<String> lstStrCardDetails = TestDataUtil.getListOfValue(strCardDetails);

        System.out.println("\n >>> lstStrCardDetails : " + lstStrCardDetails);
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPaymentMethod(lstStrCardDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.enterCardDetails(lstStrCardDetails.get(1), lstStrCardDetails.get(2), lstStrCardDetails.get(3), lstStrCardDetails.get(4), lstStrCardDetails.get(5)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyPaymentSuccessForCard());
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetails());

    }

    @And("I see the successful message and I navigate to Payment Page")
    public void NavigateToPaymentPage() {
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyTheSuccessAndNavigateToPaymentPage());


    }

    @And("I enter the Account details on the Payment Page {string}")
    public void iShouldEnterTheAccountDetailsOnThePaymentPage(String strAccountDetails) {

        System.out.println("strCardDetails " + strAccountDetails);
        List<String> lstStrAccountDetails = TestDataUtil.getListOfValue(strAccountDetails);

        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPaymentMethod(lstStrAccountDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectBank(lstStrAccountDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.enterAccountDetails(lstStrAccountDetails.get(2), lstStrAccountDetails.get(3)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectAccountForPayment(lstStrAccountDetails.get((4))));
        Assert.assertTrue(demoPageContainer.repeatPrescription.referenceDetails());
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyPaymentSuccessForA2A());
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetails());
    }

    @Given("As a user I am on HomePage and navigate to View History Page in Repeat Prescription")
    public void NavigateToViewHistoryPageInRepeatPrescription() {

        Assert.assertTrue(demoPageContainer.repeatPrescription.navigateToHomePage());
        Assert.assertTrue(demoPageContainer.repeatPrescription.navigateToViewPreviousRequests());

    }

    @And("I click the more info option for Request repeat prescription on the view history")
    public void iClickTheMoreInfoOptionForRequestRepeatPrescriptionOnTheViewHistory() {

        Assert.assertTrue(demoPageContainer.repeatPrescription.clickMoreInfo());

    }

    @And("I select the {string}")
    public void iSelectTheMedicationDetailsAndVerifyTheScriptUrgencyPrice(String strMedicationDetails) {

        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectHealthCentreLocation(lstMedicationDetails.get(0)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectDoctor(lstMedicationDetails.get(1)));
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectInstructions(lstMedicationDetails.get(2)));


    }

    @Then("I should see the Prescription status for Sent Script by Pharmacy{string}")
    public void iShouldSeeThePrescriptionStatusForSentScriptByPharmacy(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetailsForSentScriptToPharmacyInCardView(strMedicationDetails));

    }

    @Then("I should see the Prescription status for Delivery Meds by Pharmacy{string}")
    public void iShouldSeeThePrescriptionStatusForDeliveryMedsByPharmacy(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetailsForDeliverMedsByPharmacyInCardView(strMedicationDetails));

    }

    @Then("I see the status for Patient to collect the Prescription{string}")
    public void iShouldSeeThePrescriptionStatusForPatientToCollectThePrescription(String strMedicationDetails) {

//        System.out.println("MedicationDetails >>> :" +strMedicationDetails);
//        List<String> lstMedicationDetails=TestDataUtil.getListOfValue(strMedicationDetails);
//        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
//        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetailsForPatientToCollectTheScriptInCardView(strMedicationDetails));
    }

    @Given("As a user I am on beta MMH login Page")
    public void asAUserIAmOnBetaMMHLoginPage() {

        demoPageContainer.homePage.visit();
        demoPageContainer.homePage.clickBetaLoginButton();


    }


    @Then("I should see the Prescription status for Request by card {string}")
    public void iShouldSeeThePrescriptionStatusForRequestByCard(String strMedicationDetails) {
        System.out.println("MedicationDetails >>> :" + strMedicationDetails);
        List<String> lstMedicationDetails = TestDataUtil.getListOfValue(strMedicationDetails);
        System.out.println("lstMedicationDetails >>> " + lstMedicationDetails);
        System.out.println("Size Of lstMedicationDetails >>> " + lstMedicationDetails.size());

        Assert.assertTrue(demoPageContainer.repeatPrescription.navigateToViewPreviousRequests());
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyThePrescriptionDetailsForDeliverMedsByPharmacyByUsingCardInCardView(strMedicationDetails));

    }

    @Then("I should see the more info details of the prescription in view history{string}")
    public void iShouldSeeTheMoreInfoDetailsOfThePrescriptionInViewHistory(String strMoreInfoDetails) {

        Assert.assertTrue(demoPageContainer.repeatPrescription.clickMoreInfo());
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyMoreInfoDetails(strMoreInfoDetails));
    }

    @Then("I should verify the Script {string}")
    public void iShouldVerifyTheScript(String strUrgencyDetails) {

        System.out.println("MedicationDetails >>> :" + strUrgencyDetails);
        List<String> lstUrgencyDetails = TestDataUtil.getListOfValue(strUrgencyDetails);
        System.out.println("lstMedicationDetails >>> " + lstUrgencyDetails);
        Assert.assertTrue(demoPageContainer.repeatPrescription.verifyScriptUrgencyPrice(lstUrgencyDetails));
    }

    @Then("I should see all the Entries From Health Centre future Grid View in Prescription page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInPrescriptionPage(List<String> locDetails) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String String : locDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyPrescriptionsTableData(TestDataUtil.getListOfValue(String)));
        }
    }

    @And("I Click Info Icon to see Prescription page")
    public void iClickInfoIconToSeePrescriptionPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickPrescriptionsIcon(list1, list2);
        }


    }

    @And("I navigate to the Homepage")
    public void iNavigateToTheHomepage() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionMenu();
        demoPageContainer.myHealthRecordsPage.clickDashboardFromMenu();
    }


    @When("I navigate to the {string} Classifications page Dropdown")
    public void iNavigateToTheClassificationsPageDropdown(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);

        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClassifications();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(0))));

    }

    @Then("I should see all the Entries From Health Centre future Grid View in Classifications page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInClassificationsPage(List<String> ClassificationsDetails) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String String : ClassificationsDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyClassificationsTableData(TestDataUtil.getListOfValue(String));
        }


    }

    @And("I Click Info Icon to see Classifications page")
    public void iClickInfoIconToSeeClassificationsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickClassificationsIconLocator(list1, list2);
        }
    }


    @When("I navigate to the {string}Clinic Notes page dropdown")
    public void iNavigateToTheClinicNotesPageDropdown(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);

        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClinicNotes();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
    }

    @Then("I should see all the Entries From Health Centre future Grid View in Clinic Notes page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInClinicNotesPage(List<String> ClinicNotesDetails) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String String : ClinicNotesDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyClinicNotesTableData(TestDataUtil.getListOfValue(String));
        }
    }

    @And("I Click Info Icon to see Clinic Notes page")
    public void iClickInfoIconToSeeClinicNotesPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickClinicNotesIconLocator(list1, list2);
        }
    }


    @When("I navigate to the {string}Allergies page dropdown")
    public void iNavigateToTheAllergiesPageDropdown(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);

        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuAllergies();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
    }

    @Then("I should see all the Entries From Health Centre future Grid View in Allergies page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInAllergiesPage(List<String> AllergiesDetails) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String String : AllergiesDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyAllergiesTableData(TestDataUtil.getListOfValue(String));
        }

    }

    @And("I Click Info Icon to see Allergies page")
    public void iClickInfoIconToSeeAllergiesPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickAllergiesIconLocator(list1, list2);
        }

    }

    @When("I navigate to the {string}Immunisations page dropdown")
    public void iNavigateToTheImmunisationsPageDropdown(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);

        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuImmunisations();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
    }


    @When("I navigate to the Lab Results page")
    public void iNavigateToTheLabResultsPage() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuLabResults();
    }

    @Then("I should see all the Entries From Health Centre future Grid View in Immunisations page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInImmunisationsPage(List<String> ImmunisationsDetails) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String String : ImmunisationsDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyImmunisationsTableData(TestDataUtil.getListOfValue(String));
        }

    }

    @And("I Click Info Icon to see Immunisations page")
    public void iClickInfoIconToSeeImmunisationsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickImmunisationsIconLocator(list1, list2);
        }
    }

    @Then("I should see all the Entries From Health Centre future Grid View in Lab Results page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInLabResultsPage(List<String> LabResultsDetails) {
        for (String String : LabResultsDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyLabResultsTableData(TestDataUtil.getListOfValue(String));
        }

    }

    @And("I Click Info Icon to see Lab Results page")
    public void iClickInfoIconToSeeLabResultsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickLabResultsIconLocator(list1, list2);
        }
    }

    @When("I navigate to the Recalls page")
    public void iNavigateToTheRecallsPage() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuRecalls();
//        demoPageContainer.myHealthRecordsPage.jsScrollDown();
    }

//    @Then("I should see all the Entries From Health Centre future Grid View in Recalls page")
//    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInRecallsPage(List<String> RecallsDetails) {
//        for (String String : RecallsDetails) {
//            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
//            demoPageContainer.myHealthRecordsPage.VerifyRecallsTableData(TestDataUtil.getListOfValue(String));
//        }
//


    @And("I should see all the Entries From Health Centre future Grid View in Recalls page")
    public void iShouldSeeAllTheEntriesFromHealthCentreFutureGridViewInRecallsPage(List<String> RecallsDetails) {
        for (String String : RecallsDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyRecallsTableData(TestDataUtil.getListOfValue(String));
        }
    }

    @When("I should see all the Entries From Health Centre Recall Remainder Details future Grid View in Recalls page")
    public void iShouldSeeAllTheEntriesFromHealthCentreRecallRemainderDetailsFutureGridViewInRecallsPage(List<String> RecallsRemainderDetails) {
        for (String String : RecallsRemainderDetails) {
            System.out.println(">> TestDataUtil.getListOfValue(String) : " + TestDataUtil.getListOfValue(String));
            demoPageContainer.myHealthRecordsPage.VerifyRecallsTableData(TestDataUtil.getListOfValue(String));
        }
    }

    @And("I Click Info Icon to see Recall Remainder Details in Recalls page")
    public void iClickInfoIconToSeeRecallRemainderDetailsInRecallsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            System.out.println(">> TestDataUtil list2 : " + list2);
            demoPageContainer.myHealthRecordsPage.ClickRecallsRemainderIconLocator(list1, list2);
        }
    }

    @And("I Click Info Icon to see Recalls page")
    public void iClickInfoIconToSeeRecallsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue1();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            System.out.println(">> TestDataUtil list2 : " + list2);
            demoPageContainer.myHealthRecordsPage.ClickRecallsIconLocator(list1, list2);
        }
    }

    @When("I navigate to the Clinic Notes")
    public void iNavigateToTheClinicNotes() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClinicNotes();

    }

    @When("I select {string} filter dropdown")
    public void iSelectFilterDropdown(String strOption) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(strOption)));

    }

    @Then("I sholud see all My Entries in my health records")
    public void iSholudSeeAllMyEntriesInMyHealthRecords(List<String> ClinicMyEntriesClinicNotes) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ClinicMyEntriesClinicNotes) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I Click Info Icon in My Entries to see my health records")
    public void iClickInfoIconInMyEntriesToSeeMyHealthRecords(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.ClickAndVerifycMyEntriesDataIcon(list1, list2));
        }
    }

    @And("I navigate to the Prescriptions")
    public void iNavigateToThePrescriptions() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenu();
    }

    @Then("I sholud see all My Entries in Prescription page")
    public void iSholudSeeAllMyEntriesInPrescriptionPage(List<String> PrescriptionsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : PrescriptionsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyPrescriptionsMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I Click Info Icon in My Entries to see Prescription page")
    public void iClickInfoIconInMyEntriesToSeePrescriptionPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyPrescriptionsMyEntriesDataIcon(list1, list2));
        }
    }

    @And("I navigate to the Allergies")
    public void iNavigateToTheAllergies() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuAllergies();
    }

    @Then("I sholud see all My Entries Allergies page")
    public void iSholudSeeAllMyEntriesAllergiesPage(List<String> AllergiesMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : AllergiesMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyAllergiesMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I Click Info Icon in My Entries to see Allergies page")
    public void iClickInfoIconInMyEntriesToSeeAllergiesPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyAllergiesMyEntriesDataIcon(list1, list2));
        }
    }

    @And("I navigate to the Immunisations")
    public void iNavigateToTheImmunisations() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuImmunisations();
    }


    @Then("I sholud see all My Entries Immunisations page")
    public void iSholudSeeAllMyEntriesImmunisationsPage(List<String> ImmunisationsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ImmunisationsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyImmunisationsMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I Click Info Icon in My Entries to see Immunisations page")
    public void iClickInfoIconInMyEntriesToSeeImmunisationsPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyImmunisationsMyEntriesDataIcon(list1, list2));
        }
    }

    @And("I navigate to the Classifications")
    public void iNavigateToTheClassifications() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuClassifications();
    }

    @Then("I sholud see all My Entries Classifications page")
    public void iSholudSeeAllMyEntriesClassificationsPage(List<String> ClassificationsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ClassificationsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyClassificationsMyEntitiesNotesDetails(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I Click Info Icon in My Entries to see Classifications page")
    public void iClickInfoIconInMyEntriesToSeeClassificationsPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyClassificationsMyEntriesDataIcon(list1, list2));
        }

    }


    @And("I Click Info Icon to see Test Results in Lab Results page")
    public void iClickInfoIconToSeeTestResultsInLabResultsPage(DataTable dataTable) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
//            System.out.println(">> TestDataUtil list2 : "+list2);
            demoPageContainer.myHealthRecordsPage.ClickLabResultsIconLocatorVerifyTestResults(list1, list2);
        }
    }


    @When("I navigate to the Summary")
    public void iNavigateToTheSummary() {
        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenuSummary();
    }

    @Then("I click Export button")
    public void iClickExportButton() {
        demoPageContainer.myHealthRecordsPage.clickExportButton();

    }

    @When("I Create New Record in My Health Records")
    public void iCreateNewRecordInMyHealthRecords(List<String> listCreateData) {
        demoPageContainer.myHealthRecordsPage.clickAddRecord();
        demoPageContainer.myHealthRecordsPage.enterVistedName(TestDataUtil.getValue(listCreateData.get(0)));
        demoPageContainer.myHealthRecordsPage.enterVisitedLocation(TestDataUtil.getValue(listCreateData.get(1)));
        demoPageContainer.myHealthRecordsPage.enterVisitedDate();
        demoPageContainer.myHealthRecordsPage.enterClinicianNotesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2)));
        demoPageContainer.myHealthRecordsPage.clickCheckBox();
        demoPageContainer.myHealthRecordsPage.clickSave();
    }

    @Then("I should see created Record in My Health Records")
    public void iShouldSeeCreatedRecordInMyHealthRecords(List<String> listCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyHealthRecord(listCreatedRecord));
    }

//    @Given("I am on {string} page")
//    public void iAmOnPage(String strTab) {
//        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyHeader(strTab));
//    }


    @When("I edit Created {string} in My Health Records")
    public void iEditCreatedInMyHealthRecords(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @When("I change {string} in Clinic Notes")
    public void iChangeInClinicNotes(String strEditLocation) {
        demoPageContainer.myHealthRecordsPage.enterVisitedLocation(TestDataUtil.getValue(strEditLocation));
        demoPageContainer.myHealthRecordsPage.clickClinicianNotesSaveButton();
    }

    @Then("I sholud see Edited {string} record in Clinic Notes")
    public void iSholudSeeEditedRecordInClinicNotes(String strEditedLocation) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyEditedLocation(TestDataUtil.getValue(strEditedLocation)));
    }


    @When("I delete Created {string} in Clinic Notes")
    public void iDeleteCreatedInClinicNotes(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord));
    }


    @And("I Create New Record in My Entries in Immunisations page")
    public void iCreateNewRecordInMyEntriesInImmunisationsPage(List<String> listCreateData) {


    }

    @And("I Create New Record in My Entries in Classifications page")
    public void iCreateNewRecordInMyEntriesInClassificationsPage(List<String> listCreateData) {
        demoPageContainer.myHealthRecordsPage.clickAddRecord();
        demoPageContainer.myHealthRecordsPage.enterConditionName(TestDataUtil.getValue(listCreateData.get(0)));
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectClassificationsdropdown(TestDataUtil.getValue(listCreateData.get(1))));
        demoPageContainer.myHealthRecordsPage.enterStartDate();
        demoPageContainer.myHealthRecordsPage.enterEndDate();
        demoPageContainer.myHealthRecordsPage.enterClassiAdditionalInformation(TestDataUtil.getValue(listCreateData.get(2)));
        demoPageContainer.myHealthRecordsPage.clickClassiCheckBox();
        demoPageContainer.myHealthRecordsPage.clickClassificationsSave();
    }

    @Then("I should see created Record in Classifications page")
    public void iShouldSeeCreatedRecordInClassificationsPage(List<String> listCreatedRecord) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyclassificationAddRecord(listCreatedRecord));
    }

    @And("I Create New Record in Immunisations page")
    public void iCreateNewRecordInImmunisationsPage(List<String> listCreateData) {
        demoPageContainer.myHealthRecordsPage.clickAddRecord();
        demoPageContainer.myHealthRecordsPage.enterImmunisationVaccineName(TestDataUtil.getValue(listCreateData.get(0)));
        demoPageContainer.myHealthRecordsPage.enterImmunisationDateGiven();
        demoPageContainer.myHealthRecordsPage.enterAdditionalInformation(TestDataUtil.getValue(listCreateData.get(1)));
        demoPageContainer.myHealthRecordsPage.clickImmuCheckBox();
        demoPageContainer.myHealthRecordsPage.clickImmunisationSave();
    }

    @Then("I should see created Record in Immunisations page")
    public void iShouldSeeCreatedRecordInImmunisationsPage(List<String> listCreatedRecord) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyImmunisationsAddRecord(listCreatedRecord));
    }

    @And("I Create New Record in My Entries in Allergies page")
    public void iCreateNewRecordInMyEntriesInAllergiesPage(List<String> listCreateData) {
        demoPageContainer.myHealthRecordsPage.clickAddRecord();
        demoPageContainer.myHealthRecordsPage.enterAllergicConditionName(TestDataUtil.getValue(listCreateData.get(0)));
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectAllergicdropdown(TestDataUtil.getValue(listCreateData.get(1))));
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectAllergicdropdown1(TestDataUtil.getValue(listCreateData.get(2))));
        demoPageContainer.myHealthRecordsPage.enterAllergiesStartDate();
        demoPageContainer.myHealthRecordsPage.enterAllergiesEndDate();
        demoPageContainer.myHealthRecordsPage.enterAllergiesAdditionalInformation(TestDataUtil.getValue(listCreateData.get(3)));
        demoPageContainer.myHealthRecordsPage.clickAllergiesCheckBox();
        demoPageContainer.myHealthRecordsPage.clickAllergiesSave();
    }

    @Then("I should see created Record in Allergies page")
    public void iShouldSeeCreatedRecordInAllergiesPage(List<String> listCreatedRecord) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyAllergiesAddRecord(listCreatedRecord));
    }

    @And("I Create New Record in My Entries in Prescription page")
    public void iCreateNewRecordInMyEntriesInPrescriptionPage(List<String> listCreateData) {
        System.out.println("enterelement::::" + listCreateData);
        demoPageContainer.myHealthRecordsPage.clickAddRecord();
        demoPageContainer.myHealthRecordsPage.enterPrescriptionsMedicationName(TestDataUtil.getValue(listCreateData.get(0)));
        demoPageContainer.myHealthRecordsPage.clickDose();
        demoPageContainer.myHealthRecordsPage.enterPrescriptionsDose(TestDataUtil.getValue(listCreateData.get(1)));
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectPrescriptiondropdown(TestDataUtil.getValue(listCreateData.get(2))));
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectPrescriptiondropdown1(TestDataUtil.getValue(listCreateData.get(3))));
        demoPageContainer.myHealthRecordsPage.enterPrescriptionDateTaken();
        demoPageContainer.myHealthRecordsPage.enterPrescriptionEndDate();
        demoPageContainer.myHealthRecordsPage.enterPrescriptionAdditionalInformation(TestDataUtil.getValue(listCreateData.get(4)));
        demoPageContainer.myHealthRecordsPage.clickPrescriptionCheckBox();
        demoPageContainer.myHealthRecordsPage.clickPrescriptionSave();
    }

    @Given("I am on {string} Prescriptions page")
    public void iAmOnPrescriptionsPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyPrescriptionsHeader(strTab));
    }

    @And("I edit Created {string} in Prescription page")
    public void iEditCreatedInPrescriptionPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickPrescriptionsEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I change {string} in Prescription page")
    public void iChangeInPrescriptionPage(String strFrequencyLocation) {
        demoPageContainer.myHealthRecordsPage.selectFrequency(TestDataUtil.getValue(strFrequencyLocation));
        demoPageContainer.myHealthRecordsPage.clickPrescriptionsSaveButton();

    }

    @And("I delete Created {string} in Prescriptions page")
    public void iDeleteCreatedInPrescriptionsPage(String strCreatedRecord) {

        demoPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord));
    }

    @Given("I am on {string} Allergies page")
    public void iAmOnAllergiesPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyAllergiesHeader(strTab));
    }

    @And("I edit Created {string} in Allergies page")
    public void iEditCreatedInAllergiesPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickAllergiesEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I change {string} in Allergies page")
    public void iChangeInAllergiesPage(String strFrequencyLocation) {
        System.out.println(strFrequencyLocation);
        demoPageContainer.myHealthRecordsPage.selectSeverity(TestDataUtil.getValue(strFrequencyLocation));
        demoPageContainer.myHealthRecordsPage.clickAllergiesSaveButton();

    }

    @And("I delete Created {string} in Allergies page")
    public void iDeleteCreatedInAllergiesPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord));
    }

    @Given("I am on {string} Classifications page")
    public void iAmOnClassificationsPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyClassificationsHeader(strTab));
    }

    @And("I edit Created {string} in Classifications page")
    public void iEditCreatedInClassificationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickClassificationsEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I change {string} in Classifications page")
    public void iChangeInClassificationsPage(String strStatusLocation) {
        demoPageContainer.myHealthRecordsPage.selectStatus(TestDataUtil.getValue(strStatusLocation));
        demoPageContainer.myHealthRecordsPage.clickClassificationsSaveButton();
    }

    @And("I delete Created {string} in Classifications page")
    public void iDeleteCreatedInClassificationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I edit Created {string} in Immunisations page")
    public void iEditCreatedInImmunisationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I change {string} in Immunisations page")
    public void iChangeInImmunisationsPage(String listCreateData) {
        demoPageContainer.myHealthRecordsPage.enterAdditionalInformation(TestDataUtil.getValue(listCreateData));
        demoPageContainer.myHealthRecordsPage.clickImmunisationsSaveButton();

    }


    @And("I delete Created {string} in Immunisations page")
    public void iDeleteCreatedInImmunisationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickDelete(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I Click Info Icon in My Entries to see COVID Immunisation Details page")
    public void iClickInfoIconInMyEntriesToSeeCOVIDImmunisationDetailsPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.VerifyCOVIDImmunisationsMyEntriesDataIcon(list1, list2));
        }
    }

    @And("I Create New Record in COVIDImmunisations page")
    public void iCreateNewRecordInCOVIDImmunisationsPage(List<String> listCreateData) {
        demoPageContainer.myHealthRecordsPage.clickCovidAddRecord();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectCovidImmunisationsdropdown(TestDataUtil.getValue(listCreateData.get(0))));
        demoPageContainer.myHealthRecordsPage.clickCovidDose();
        demoPageContainer.myHealthRecordsPage.enterCovidImmunisationBatchNo(TestDataUtil.getValue(listCreateData.get(1)));
        demoPageContainer.myHealthRecordsPage.enterCovidImmunisationDateGiven();
        demoPageContainer.myHealthRecordsPage.enterCovidClinicalSite(TestDataUtil.getValue(listCreateData.get(2)));
        demoPageContainer.myHealthRecordsPage.clickCovidCheckBox();
        demoPageContainer.myHealthRecordsPage.clickCovidAddFile(TestDataUtil.getValue(listCreateData.get(3)));
        demoPageContainer.myHealthRecordsPage.clickCovidSave();

    }

    @And("I edit Created {string} in CovidImmunisations page")
    public void iEditCreatedInCovidImmunisationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickCovidEditButton(TestDataUtil.getValue(strCreatedRecord));
    }

    @And("I change {string} in CovidImmunisations page")
    public void iChangeInCovidImmunisationsPage(String listCreateData) {
        demoPageContainer.myHealthRecordsPage.enterCovidClinicalSite(TestDataUtil.getValue(listCreateData));
        demoPageContainer.myHealthRecordsPage.clickCovidImmunisationsUpdateButton();
    }

    @And("I delete Created {string} in CovidImmunisations page")
    public void iDeleteCreatedInCovidImmunisationsPage(String strCreatedRecord) {
        demoPageContainer.myHealthRecordsPage.clickCovidDelete(TestDataUtil.getValue(strCreatedRecord));
    }

    @Given("I am on {string} Immunisation page")
    public void iAmOnImmunisationPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyHeader(strTab));
    }

    @Given("I am on {string} CovidImmunisation page")
    public void iAmOnCovidImmunisationPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyHeader(strTab));
    }

    @Given("I am on {string} Clinic Notes page")
    public void iAmOnClinicNotesPage(String strTab) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyHeader(strTab));
    }

    @When("I navigate to the Prescription {string} page")
    public void iNavigateToThePrescriptionPage(String strHealthCenter) {
        List<String> lstAppointmentDetails = TestDataUtil.getListOfValue(strHealthCenter);

        demoPageContainer.myHealthRecordsPage.clickMyHealthRecordsOptionFromMenu();
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.selectFilterbyIsFor(TestDataUtil.getValue(lstAppointmentDetails.get(0))));
    }

    @And("I should see all My Entries in Prescription page")
    public void iShouldSeeAllMyEntriesInPrescriptionPage(List<String> PrescriptionsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : PrescriptionsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyPrescriptionsMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @Then("I confirm deleted Patient Record")
    public void iConfirmDeletedPatientRecord() {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyDeletedRecord());
    }

    @And("I should see all My Entries Allergies page")
    public void iShouldSeeAllMyEntriesAllergiesPage(List<String> AllergiesMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : AllergiesMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyAllergiesMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I should see all My Entries Classifications page")
    public void iShouldSeeAllMyEntriesClassificationsPage(List<String> ClassificationsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ClassificationsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyClassificationsMyEntitiesNotesDetails(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @And("I should see all My Entries in my health records")
    public void iShouldSeeAllMyEntriesInMyHealthRecords(List<String> ClinicMyEntriesClinicNotes) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ClinicMyEntriesClinicNotes) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }

    @When("I should see Edited {string} record in Clinic Notes")
    public void iShouldSeeEditedRecordInClinicNotes(String strEditedLocation) {
        Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyEditedLocation(TestDataUtil.getValue(strEditedLocation)));
    }

    @And("I should see all My Entries Immunisations page")
    public void iShouldSeeAllMyEntriesImmunisationsPage(List<String> ImmunisationsMyEntries) {
        demoPageContainer.myHealthRecordsPage.clickMaxvalue();
        for (String strCurrentRow : ImmunisationsMyEntries) {
            Assert.assertTrue(demoPageContainer.myHealthRecordsPage.verifyImmunisationsMyEntries(TestDataUtil.getListOfValue(strCurrentRow)));
        }
    }
}
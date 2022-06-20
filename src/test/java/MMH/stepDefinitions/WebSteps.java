package MMH.stepDefinitions;

import cap.utilities.TestDataUtil;
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
        Assert.assertTrue(demoPageContainer.appointmentsPage.verifyDetailsOfCreatedAppointment(lstDetails,(strFutureDate)));
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
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedlistForSentScript(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
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
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedlistForDelivery(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
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
        Assert.assertTrue(demoPageContainer.repeatPrescription.selectPharmacyBySavedlistForDelivery(lstMedicationDetails.get(3), lstMedicationDetails.get(4)));
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
}
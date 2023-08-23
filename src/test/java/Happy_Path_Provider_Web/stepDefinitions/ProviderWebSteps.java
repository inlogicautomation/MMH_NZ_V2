package Happy_Path_Provider_Web.stepDefinitions;


import Happy_Path_Provider_Web.ProviderPageContainer;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ProviderWebSteps {
    private ProviderPageContainer providerPageContainer;

    public ProviderWebSteps(ProviderPageContainer providerPageContainer) {

        this.providerPageContainer = providerPageContainer;
    }

    @Given("As a Provider I am on HomePage and navigate to RRP Script Instructions in {string}")
    public void asAProviderIAmOnHomePageAndNavigateToRRPScriptInstructionsIn(String strName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptFeeMessageSettings(strName));
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToMobileRepeatScriptFeeMessageSettings(strName));

        }

    }

    @And("I navigate to RRP Script Instructions Settings and click edit button")
    public void iNavigateToRRPScriptInstructionsSettingsAndClickEditButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSetting());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingEditButton());
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {

            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickMobileRRPScriptInstructionSetting());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingEditButton());

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickMobileRRPScriptInstructionSetting());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingEditButton());


        }

    }

    @When("I disable the RRP Script Instructions Settings {string}")
    public void iDisableTheRRPScriptInstructionsSettings(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptInstructionSetting details >>> :: " + lstDetails);
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.EnableRRPScriptInstructionsFeeForLocation(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingSaveButton());
    }

    @Then("I should verify disabled RRP Script Instructions Settings {string}")
    public void iShouldVerifyDisabledRRPScriptInstructionsSettings(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptInstructionSetting details >>> :: " + lstDetails);
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifyRRPScriptInstructionsChanges(lstDetails.get(0), lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }


    @When("I navigate to RRP Script Instructions Fee Setup Page and Select Health centre {string}")
    public void iNavigateToRRPScriptInstructionsFeeSetupPageAndSelectHealthCentre(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickRRPScriptInstructionsFeeSetup());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectHealthCentre(strHealthCentre));
    }

    @And("I click Edit on a location record in Grid & Selected Location must be auto-populated")
    public void iClickEditOnALocationRecordInGridSelectedLocationMustBeAutoPopulated(String Locationdata) {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.ClickRRPScriptInstructionFeeSetupEditAction(TestDataUtil.getListOfValue(Locationdata)));
    }

    @And("I navigate to RRP Script Instructions Settings and i click edit button")
    public void iNavigateToRRPScriptInstructionsSettingsAndIClickEditButton() {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickEditButton());
    }

    @Then("I click Patient to Collect Script checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickPatientToCollectScriptCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String> strData = TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickPatienttoCollectScriptCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterServiceOptionUrgentSameday(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @Given("As a user I am on Patient Portal login Page")
    public void asAUserIAmOnPatientPortalLoginPage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.launchPatientUrl());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickLogin());
    }

    @Given("As a user Iam on Provider login and I enter {string} and {string} for Provider")
    public void asAUserIamOnProviderLoginAndIEnterAndForProvider(String strUserName, String strPassword) {

        Assert.assertTrue(providerPageContainer.providerHomePage.launchProviderUrl());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickLogin());
        Assert.assertTrue(providerPageContainer.providerHomePage.MMHLogin(TestDataUtil.getValue(strUserName), TestDataUtil.getValue(strPassword)));
    }

    @And("I click Systems Menu and I navigating to Pre-Screening Settings page")
    public void iClickSystemsMenuAndINavigatingToPreScreeningSettingsPage() {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAppointmentMessage());
//        Assert.assertTrue(providerPageContainer.providerHomePage.clickPreScreeningSettings());

    }



    @Given("As a user Iam on Patient login page and I enter {string} and {string} for Patient")
    public void asAUserIamOnPatientLoginPageAndIEnterAndForPatient(String strUserName, String strPassword) {

        Assert.assertTrue(providerPageContainer.providerHomePage.launchPatientUrl());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickLogin());
        Assert.assertTrue(providerPageContainer.providerHomePage.MMHLogin(TestDataUtil.getValue(strUserName), TestDataUtil.getValue(strPassword)));
    }

    @And("I navigate to Appointmet Menu and I click the Book Appointment")
    public void iNavigateToAppointmetMenuAndIClickTheBookAppointment() {


//        Assert.assertTrue(providerPageContainer.providerHomePage.verifyPatientHomePage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickAppointmentMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickBookAppointment());
    }

    @When("I select {string} and {string}")
    public void iSelectAnd(String strHealthCentre, String strLocation) {

//        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(strHealthCentre)));
//        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(strLocation)));
}




    @Given("As a user I navigate to Provider Page")
    public void asAUserINavigateToProviderPage() {

        Assert.assertTrue(providerPageContainer.providerHomePage.switchToProviderTab());
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyProviderHomePage());
    }


    @Given("As a user I am on Provider Homepage")
    public void asAUserIAmOnProviderHomepage() {

        Assert.assertTrue(providerPageContainer.providerHomePage.verifyProviderHomePage());
    }


    @When("I login with valid {string} and {string} as patient")
    public void iLoginWithValidAndAsPatient(String strUserName, String strPassword) {

        Assert.assertTrue(providerPageContainer.providerHomePage.MMHLogin(TestDataUtil.getValue(strUserName), TestDataUtil.getValue(strPassword)));
    }

    @Then("I should  verify the patient homepage")
    public void iShouldVerifyThePatientHomepage() {

        Assert.assertTrue(providerPageContainer.providerHomePage.verifyPatientHomePage());
    }

    @And("I Navigate to Provider Home Page")
    public void iNavigateToProviderHomePage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenuExpandIcon());
    }


    @Then("I click the Patient to Send Script by Post checkbox & Enter the Service Option Name and Fees details Send Script by Post service option")
    public void iClickThePatientToSendScriptByPostCheckboxEnterTheServiceOptionNameAndFeesDetailsSendScriptByPostServiceOption(String strdata) {
        List<String> strData = TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptbyPostCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterSendScriptByPostUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.click72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }


    @And("I navigate to RRP Script Instructions Settings and click the edit button Select Health center {string}")
    public void iNavigateToRRPScriptInstructionsSettingsAndClickTheEditButtonSelectHealthCenter(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSetting());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickRRPScriptInstructionsFeeSetup());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectHealthCentre(strHealthCentre));
    }


    @Given("As a Provider I am on HomePage and navigate to  Pre-Screening Settings")
    public void asAProviderIAmOnHomePageAndNavigateToPreScreeningSettings() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
    }

    @Given("As a Provider I am on HomePage and navigate to Repeat Script Settings in {string}")
    public void AsAProviderIAmOnHomePageAndNavigateToRepeatScriptSettingsIn(String strName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptSettings(strName));
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickMobileSystemMenu());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToMobileRepeatScriptSettings(strName));

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickMobileSystemMenu());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToMobileRepeatScriptSettings(strName));

        }
    }

    @And("I click the edit button and changing the data as per Rule A{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerRuleA(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            providerPageContainer.providerHomePage.clickEditButton();
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            providerPageContainer.providerHomePage.clickEditButton();
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            providerPageContainer.providerHomePage.clickEditButton();
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
            Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

        }

    }

    @And("I click the edit button and changing the data as per Rule B{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerRuleB(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleB());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data as per Rule C{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerRuleC(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleC());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data restricting to Named Provider in each Location{string}")
    public void iClickTheEditButtonAndChangingTheDataRestrictingToNamedProviderInEachLocation(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqDataToRestrictNameAndLocation());
//        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqData(TestDataUtil.getListOfValue(strDetail)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data as per Patient to Collect Script requirements{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerPatientToCollectScriptRequirement(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFirstSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFirstSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFirstSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSecondSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForSecondSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForSecondSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectThirdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForThirdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForThirdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFourthSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFourthSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFourthSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPPayments());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());

        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data as per Send Script by Post requirements{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerSendScriptByPostRequirement(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select1stSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor1stSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor1stSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select2ndSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor2ndSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor2ndSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select3rdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor3rdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor3rdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select4thSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor4thSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor4thSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data as per Send Script to Pharmacy requirements{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerSendScriptToPharmacyRequirement(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select1stSSTPServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor1stSSTPSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor1stSSTPSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select2ndSSTPServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor2ndSSTPSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor2ndSSTPSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select3rdSSTPServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor3rdSSTPSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor3rdSSTPSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select4thSSTPServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor4thSSTPSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor4thSSTPSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the data as per Deliver Meds By Pharmacy requirements{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerDeliverMedsByPharmacyRequirement(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select1stDMBPServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor1stDMBPSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor1stDMBPSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select2ndDMBPServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor2ndDMBPSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor2ndDMBPSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select3rdDMBPServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor3rdDMBPSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor3rdDMBPSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select4thDMBPServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor4thDMBPSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor4thDMBPSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPPayments());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @When("I click Send Script by Post checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickSendScriptByPostCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String>strData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptbyPostCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterSendScriptByPostUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPostFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPostNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPostServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPostNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPost48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPostServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPost48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPost72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptPostServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptByPost72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @When("I click Send Send Script to Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickSendSendScriptToPharmacyCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String>strData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScripttoPharmacyCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterSendScripttoPharmacyUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharamacyFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScripttoPharmacyNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacyServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacyNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacy48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacyServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacy48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacy72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacyServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickSendScriptToPharmacy72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @When("I click Deliver Meds by Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickDeliverMedsByPharmacyCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String>strData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsbyPharmacyCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverMedsByPharmacyUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharamacyFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryMedsByPharmacyUrgentSameDayDescription(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryMedsByPharmacyNextDayDescription(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByToPharmacy48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryMedsByPharmacy48HoursDescription(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryMedsByPharmacy72HoursDescription(strData.get(6)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @When("I click Deliver via Zoom Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickDeliverViaZoomPharmacyCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String>strData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverviaZoomPharmacyCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharamacyFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryViaZoomPharmacyUrgentSameDayDescription(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryViaZoomPharmacyNextDayDescription(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacy48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryViaZoomPharmacy48HoursDescription(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacy72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectDeliveryViaZoomPharmacy72HoursDescription(strData.get(6)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @And("I click Edit button to select {string} and {string}")
    public void iClickEditButtonToSelectAnd(String strHealthCentre, String strLocation) {
        List<String>strtestdata=TestDataUtil.getListOfValue(strLocation);
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickPreScreeningEdit());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        for (String strdata:strtestdata) {
            System.out.println(">>>>>>>strdata"+strdata);
            Assert.assertTrue(providerPageContainer.preScreeningPage.deselectCovidPreScreeningPopup(TestDataUtil.getValue(strdata)));
        }

        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.verifyUpdates(strHealthCentre));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickCloseButton());
    }

    @When("As a user I am on HomePage and navigate to Book Appointment Page in Appointments")
    public void asAUserIAmOnHomePageAndNavigateToBookAppointmentPageInAppointments() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToHarryHarryHomePage());
    }

    @Then("I should verify the Covid Pre-Screening popup is displayed")
    public void iShouldVerifyTheCovidPreScreeningPopupIsDisplayed() {

//        Assert.assertTrue(providerPageContainer.preScreeningPage.VerifyCovidPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.preScreeningPage.ClickDashBoard());
    }

    @And("I navigate to Appointments Menu and I click the Book Appointment")
    public void iNavigateToAppointmentsMenuAndIClickTheBookAppointment() {
        Assert.assertTrue(providerPageContainer.providerHomePage.clickAppointmentMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickBookAppointment());
    }
    @And("I click Systems Menu and I navigating to Appointment Message page")
    public void iClickSystemsMenuAndINavigatingToAppointmentMessagePage() {


    }

    @And("I select Health Center {string} and I enable Banner Message to Yes")
    public void iSelectHealthCenterAndIEnableBannerMessageToYes(String strHealthCentre) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickBannerMessageYesRadioButton());
    }

    @And("I fill Banner Heading {string} and Banner Message fields {string}")
    public void iFillBannerHeadingAndBannerMessageFields(String strBannerHeading, String strBannerMssg) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterBannerHeading(TestDataUtil.getValue(strBannerHeading)));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterBannerMessage(TestDataUtil.getValue(strBannerMssg)));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
    }

    @When("I click the Update Button")
    public void iClickTheUpdateButton() {


    }

    @Then("I should Verify the Appointment Message {string} and {string} details are saved")
    public void iShouldVerifyTheAppointmentMessageAndDetailsAreSaved(String strHealthCentre, String strBannerMssg) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.closeSuccessPopUp());

    }

    @And("I logout from the Patient login and click All radio button")
    public void iLogoutFromThePatientLoginAndClickAllRadioButton() {


    }

    @And("I Enter the Location in search box and I verify the created Appointment {string}")
    public void iEnterTheLocationInSearchBoxAndIVerifyTheCreatedAppointment(String strLocation) {
List<String>data=TestDataUtil.getListOfValue(strLocation);
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterLocationInSearchBox(TestDataUtil.getValue(data.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyHealthCenterLocation(TestDataUtil.getValue(data.get(1))));
    }

    @When("I click the Book Now button {string}")
    public void iClickTheBookNowButton(String strLocation) {
        List<String>data=TestDataUtil.getListOfValue(strLocation);
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickBookNow(data.get(1)));
    }

    @Then("I should verify the Banner heading {string} and Banner Messages {string} are saved")
    public void iShouldVerifyTheBannerHeadingAndBannerMessagesAreSaved(String strBannerHeading, String strBannerMessage) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyBannerHeading(TestDataUtil.getValue(strBannerHeading)));
//        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyBannerMessage(TestDataUtil.getValue(strBannerMessage)));
    }

    @And("I select Health Center {string} and I enable Banner Message to No")
    public void iSelectHealthCenterAndIEnableBannerMessageToNo(String strHealthCentre) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickBannerMessageNoRadioBtn());
    }

    @Then("I should verify the Banner heading {string} and Banner Messages {string} are not displayed")
    public void iShouldVerifyTheBannerHeadingAndBannerMessagesAreNotDisplayed(String strBannerHeading, String strBannerMessage) {

        Assert.assertFalse(providerPageContainer.appointmentMessagePage.verifyBannerHeading(strBannerHeading));
        Assert.assertFalse(providerPageContainer.appointmentMessagePage.verifyBannerMessage(strBannerMessage));
    }


    @Given("As a Provider I am on HomePage and navigate to Appointment Message page")
    public void asAProviderIAmOnHomePageAndNavigateToAppointmentMessagePage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickAppointmentMessage());
//        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyAppointmentHeading());
    }

    @And("As a user I am on Patient HomePage and I logout from the Patient login")
    public void asAUserIAmOnPatientHomePageAndILogoutFromThePatientLogin() {
        Assert.assertTrue(providerPageContainer.providerHomePage.switchToPatientTab());
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyPatientHomePage());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickSignOut());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickAllRadioButton());
    }


    @And("I select Health Center {string} and I enable Patient Portal Web Banner Message to No")
    public void iSelectHealthCenterAndIEnablePatientPortalWebBannerMessageToNo(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickPatientWebBannerMessageNoRadioBtn());

    }

    @And("I fill Patient Portal Web Banner Heading {string} and Banner Message fields {string}")
    public void iFillPatientPortalWebBannerHeadingAndBannerMessageFields(String strBannerHeading, String strBannerMssg) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterWebBannerHeading(TestDataUtil.getValue(strBannerHeading)));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterWebBannerMessage(TestDataUtil.getValue(strBannerMssg)));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
    }

    @Then("I should verify the Patient Portal Web Banner heading {string} and Banner Messages {string} are not displayed")
    public void iShouldVerifyThePatientPortalWebBannerHeadingAndBannerMessagesAreNotDisplayed(String strBannerHeading, String strBannerMessage) {
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerHeadingNotDisplayed(strBannerHeading));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerMessageNotDisplayed(strBannerMessage));
    }

    @And("I select Health Center {string} and I enable Patient Portal Web Banner Message to yes")
    public void iSelectHealthCenterAndIEnablePatientPortalWebBannerMessageToYes(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickPatientWebBannerMessageYesRadioBtn());
    }

    @And("I click the edit button and changing the data as per Deliver Via Zoom Pharmacy requirements{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerDeliverViaZoomPharmacyRequirement(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select1stDVZPServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor1stDVZPSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor1stDVZPSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select2ndDVZPServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor2ndDVZPSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor2ndDVZPSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select3rdDVZPServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor3rdDVZPSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor3rdDVZPSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.select4thDVZPServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeFor4thDVZPSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescFor4thDVZPSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the Reason for RRP is Mandatory data as per Patient to Collect Script requirements{string}")
    public void iClickTheEditButtonAndChangingTheReasonForRRPIsMandatoryDataAsPerPatientToCollectScriptRequirements(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFirstSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFirstSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFirstSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSecondSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForSecondSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForSecondSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectThirdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForThirdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForThirdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFourthSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFourthSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFourthSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickRequestisMandatoryYesButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }


    @And("I click the edit button and changing the Payment Settings as per Patient to Collect Script requirements{string}")
    public void iClickTheEditButtonAndChangingThePaymentSettingsAsPerPatientToCollectScriptRequirements(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFirstSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFirstSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFirstSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSecondSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForSecondSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForSecondSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectThirdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForThirdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForThirdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFourthSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFourthSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFourthSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickRequestisMandatoryYesButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickPaymentSettingPayAtHealthCentreButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

    }

    @And("I click the edit button and changing the Payment Settings to Pay online as per Patient to Collect Script requirements{string}")
    public void iClickTheEditButtonAndChangingThePaymentSettingsToPayOnlineAsPerPatientToCollectScriptRequirements(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFirstSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFirstSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFirstSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSecondSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForSecondSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForSecondSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectThirdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForThirdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForThirdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFourthSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFourthSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFourthSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickRequestisMandatoryYesButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickPaymentSettingPayOnlineButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I click the edit button and changing the Payment Settings to Pay at Health Centre or Online as per Patient to Collect Script requirements{string}")
    public void iClickTheEditButtonAndChangingThePaymentSettingsToPayAtHealthCentreOrOnlineAsPerPatientToCollectScriptRequirements(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFirstSelectedServiceOption(lstDetails.get(2)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFirstSelectedServiceOption(lstDetails.get(3)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFirstSelectedServiceOption(lstDetails.get(4)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSecondSelectedServiceOption(lstDetails.get(5)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForSecondSelectedServiceOption(lstDetails.get(6)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForSecondSelectedServiceOption(lstDetails.get(7)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectThirdSelectedServiceOption(lstDetails.get(8)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForThirdSelectedServiceOption(lstDetails.get(9)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForThirdSelectedServiceOption(lstDetails.get(10)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFourthSelectedServiceOption(lstDetails.get(11)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectFeeForFourthSelectedServiceOption(lstDetails.get(12)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectDescForFourthSelectedServiceOption(lstDetails.get(13)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickRequestisMandatoryYesButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.ClickPaymentSettingPayAtHealthCentreOrPayNowButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @When("I Click the Draft message and verify success pop up")
    public void iClickTheDraftMessageAndVerifySuccessPopUp() {
        Assert.assertTrue(providerPageContainer.providerMessagesPage.clickProviderDraftMessage());
    }

    @Then("I navigate to Draft items and verify the Sent {string}")
    public void iNavigateToDraftItemsAndVerifyTheSent(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToDraftItems());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyDraftMessages(TestDataUtil.getValue(lstMessageDetails.get(5))));
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyDraftBodyMessages(TestDataUtil.getListOfValue(strMessageDetails)));
    }

    @When("I Click Patient Send Message Button then I should see message sent Successfully popup")
    public void iClickPatientSendMessageButtonThenIShouldSeeMessageSentSuccessfullyPopup() {
        providerPageContainer.providerMessagesPage.clickSendMessageAndNavigateToHomePage();
        providerPageContainer.providerMessagesPage.verifySentSuccessfully();
    }
    @And("I navigate to inbox items and create a reply message {string}")
    public void iNavigateToInboxItemsAndCreateAReplyMessage(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyReplyDraftBodyMessages(TestDataUtil.getListOfValue(strMessageDetails)));
        Assert.assertTrue(providerPageContainer.providerMessagesPage.clickAttachButtonInboxMessages());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.EnterReplyBodyMessages(TestDataUtil.getValue(lstMessageDetails.get(8))));
        Assert.assertTrue(providerPageContainer.providerMessagesPage.clickSendMessageButtonInboxMessages());

    }
    @And("I navigate to provider portal and verify the Reply message {string}")
    public void iNavigateToProviderPortalAndVerifyTheReplyMessage(String lstMessageDetails) {
        List<String> lstMessage = TestDataUtil.getListOfValue(lstMessageDetails);
        System.out.println(">>>>>>>>>>>>>>>>>>>"+lstMessage);
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToInboxMessageForDoctor());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyProviderInboxMessages(TestDataUtil.getValue(lstMessage.get(8))));
    }

    @And("I navigate to Sent Items and verify the reply message {string}")
    public void iNavigateToSentItemsAndVerifyTheReplyMessage(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToSentItems());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifySentMessages(TestDataUtil.getValue(lstMessageDetails.get(8))));

    }

    @Given("As a user I am on Doctor portal HomePage and navigate to Messages Setting")
    public void asAUserIAmOnDoctorPortalHomePageAndNavigateToMessagesSetting() {

        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToDoctorMessageSetting());
    }
    @Then("I Should see the Provider Signature Based on {string} entered and signature must get auto populated in Compose mail")
    public void iShouldSeeTheProviderSignatureBasedOnEnteredAndSignatureMustGetAutoPopulatedInComposeMail(String strMessage) {
//        Assert.assertTrue(providerPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToComposeMessageForDoctor());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyEnteredProviderSignatureMessage(TestDataUtil.getValue(strMessage)));
    }

    @Then("I Should Verify the Provider Out Of Office Reply {string}")
    public void iShouldVerifyTheProviderOutOfOfficeReply(String strMessage) {
        List<String> lstStrMessage = TestDataUtil.getListOfValue(strMessage);
        System.out.println("lstStrMessage >>> :: " + lstStrMessage);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToDoctorMessageSetting());
            Assert.assertTrue(providerPageContainer.providerMessagesPage.selectProviderOutOfOfficeSetting());
            Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyEnteredProviderOutOfOfficeMessage(TestDataUtil.getValue(lstStrMessage.get(0))));
        }
    }
    @Given("As a Provider I am on HomePage and navigate to Appointment Setting page")
    public void asAProviderIAmOnHomePageAndNavigateToAppointmentSettingPage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAppointmentMessage());
    }

    @When("I navigate to Book Appointment select any provider with any Location")
    public void iNavigateToBookAppointmentSelectAnyProviderWithAnyLocation() {
        Assert.assertTrue(providerPageContainer.providerHomePage.clickPatientBookAppointment());

    }


    @And("I enable RuleA Radio button and I click save button then I see Saved Successfully message{string}")
    public void iEnableRuleARadioButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleAButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I enable RuleB Radio button and I click save button then I see Saved Successfully message{string}")
    public void iEnableRuleBRadioButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleBButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }


    @Then("I select {string} and {string} and verify the Covid Pre-Screening popup is Undisplayed")
    public void iSelectAndAndVerifyTheCovidPreScreeningPopupIsUndisplayed(String strHealthCentre, String strLocation) {
        List<String>stsdta=TestDataUtil.getListOfValue(strLocation);
                Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(strHealthCentre)));
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(stsdta.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.preScreeningPage.ClickDashBoard());

    }

    @And("I click Edit button to select {string} and {string} and Disable Appointment Pre-Screening Popup")
    public void iClickEditButtonToSelectAndAndDisableAppointmentPreScreeningPopup(String strHealthCentre, String strLocation) {
        List<String>strtestdata=TestDataUtil.getListOfValue(strLocation);
//        Assert.assertTrue(providerPageContainer.preScreeningPage.clickPreScreeningEdit());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        for (String strdata:strtestdata) {
            System.out.println(">>>>>>>strdata"+strdata);
            Assert.assertTrue(providerPageContainer.preScreeningPage.deselectCovidPreScreeningPopup(TestDataUtil.getValue(strdata)));
        }

        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.verifyUpdates(strHealthCentre));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickCloseButton());
    }

    @And("I click Edit button to select {string} and {string} and Enable Appointment Pre-Screening Popup")
    public void iClickEditButtonToSelectAndAndEnableAppointmentPreScreeningPopup(String strHealthCentre, String strLocation) {
        List<String>strtestdata=TestDataUtil.getListOfValue(strLocation);
        System.out.println(">>>>>>>strtestdata :: "+strtestdata);
//        Assert.assertTrue(providerPageContainer.preScreeningPage.clickPreScreeningEdit());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        for (String strdata:strtestdata) {
            System.out.println(">>>>>>>strdata"+strdata);
            Assert.assertTrue(providerPageContainer.preScreeningPage.selectCovidPreScreeningPopup(TestDataUtil.getValue(strdata)));
        }

        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
        Assert.assertTrue(providerPageContainer.preScreeningPage.verifyUpdates(strHealthCentre));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickCloseButton());
    }

    @And("I enable RuleC Radio button and I click save button then I see Saved Successfully message{string}")
    public void iEnableRuleCRadioButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleCButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments")
    public void asAUserIAmOnHomePageAndNavigateToPatientBookAppointmentPageInAppointments() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToHarryHarryHomePage());
    }


    @And("I enable RuleD Radio button and I click save button then I see Saved Successfully message{string}")
    public void iEnableRuleDRadioButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleDButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
    }

    @And("I enable RuleE Radio button and I click restrict providers checkbox and save button then I see Saved Successfully message{string}")
    public void iEnableRuleERadioButtonAndIClickRestrictProvidersCheckboxAndSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleEButton());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));


    }

    @And("I enable RuleE Radio button and I click restrict providers checkbox{string} click save button then I see Saved Successfully message{string}")
    public void iEnableRuleERadioButtonAndIClickRestrictProvidersCheckboxClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData, String strRestrictProviders) {
        List<String>strRestrictProvidersdata=TestDataUtil.getListOfValue(strRestrictProviders);
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleEButton());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        for (String strdata:strRestrictProvidersdata) {
            System.out.println(">>>>>>>strdata"+strdata);
            Assert.assertTrue(providerPageContainer.appointmentSettingPage.selectRestrictProviderscheckbox(TestDataUtil.getValue(strdata)));
        }
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAppointmentsettingsRuleESaveButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

    }

    @Then("I Check restricted providers are not visible for phone and video appointments made online {string}")
    public void iCheckRestrictedProvidersAreNotVisibleForPhoneAndVideoAppointmentsMadeOnline(String RestrictProviderData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickVisitIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyRestrictProviderIsNotDisplayed(TestDataUtil.getListOfValue(RestrictProviderData)));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickVideoIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyRestrictProviderIsNotDisplayed(TestDataUtil.getListOfValue(RestrictProviderData)));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickPhoneIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyRestrictProviderIsNotDisplayed(TestDataUtil.getListOfValue(RestrictProviderData)));

    }


    @And("I Check not restricted providers are visible for phone and video appointments made online {string}")
    public void iCheckNotRestrictedProvidersAreVisibleForPhoneAndVideoAppointmentsMadeOnline(String UnRestrictProviderData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickVisitIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyNotRestrictProviderIsDisplayed(TestDataUtil.getListOfValue(UnRestrictProviderData)));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickVideoIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyNotRestrictProviderIsDisplayed(TestDataUtil.getListOfValue(UnRestrictProviderData)));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickPhoneIconCheckRestrictedproviderarenotdisplayed());
        Assert.assertTrue(providerPageContainer.appointmentsPage.verifyNotRestrictProviderIsDisplayed(TestDataUtil.getListOfValue(UnRestrictProviderData)));


    }

    @And("I enable RuleE Radio button and I check Non restrict providers checkbox{string}and click save button then I see Saved Successfully message{string}")
    public void iEnableRuleERadioButtonAndICheckNonRestrictProvidersCheckboxAndClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData , String strRestrictProviders) {
        List<String>strRestrictProvidersdata=TestDataUtil.getListOfValue(strRestrictProviders);
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickRuleEButton());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        for (String strdata:strRestrictProvidersdata) {
            System.out.println(">>>>>>>strdata"+strdata);
            Assert.assertTrue(providerPageContainer.appointmentSettingPage.DeselectRestrictProviderscheckbox(TestDataUtil.getValue(strdata)));
        }
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAppointmentsettingsRuleESaveButton());
    }



    @And("I enable allow to book friends yes radio button{string} and click save button then I see Saved Successfully message")
    public void iEnableAllowToBookFriendsYesRadioButtonAndClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAllowtoBookForFamilyYesButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

    }

    @And("I enable allow to book friends No radio button{string} and click save button then I see Saved Successfully message")
    public void iEnableAllowToBookFriendsNoRadioButtonAndClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickAllowtoBookForFamilyNoButton());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

    }

    @And("I navigate to Turn Off Online Appointments {string} and Enable turn-off online appointments checkbox click save button then I see turned-off Message")
    public void iNavigateToTurnOffOnlineAppointmentsAndEnableTurnOffOnlineAppointmentsCheckboxClickSaveButtonThenISeeTurnedOffMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnoffAppointments());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnOffOnlineAppointmentsCheckBoxchecked());

//        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());

    }


    @And("I Log Out from Provider and Search for Health Centre Verify Online Appointment is not displayed for Easy booking{string}and{string}")
    public void iLogOutFromProviderAndSearchForHealthCentreVerifyOnlineAppointmentIsNotDisplayedForEasyBookingAnd(String LocationData, String ProviderLoginData) {
        List<String> strdata=TestDataUtil.getListOfValue(ProviderLoginData);
        Assert.assertTrue(providerPageContainer.providerHomePage.clickProviderLogoutButton());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.EnterValueinSearchBoxVerifyAppointmentsSlotIsNotDisplayed(LocationData));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickMMHLogo());
        providerPageContainer.providerHomePage.Providervisit();
        Assert.assertTrue(providerPageContainer.providerHomePage.clickproviderLoginButton());
        providerPageContainer.providerHomePage.enterEmailForBeta(TestDataUtil.getValue(strdata.get(0)));
        providerPageContainer.providerHomePage.enterPasswordForBeta(TestDataUtil.getValue(strdata.get(1)));
        providerPageContainer.providerHomePage.clickSignInButton();
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyHomePageOfMMHPortal());

    }

    @And("I navigate to Turn On Online Appointments {string} and Enable turn-on online appointments checkbox click save button then I see turned-off Message")
    public void iNavigateToTurnOnOnlineAppointmentsAndEnableTurnOnOnlineAppointmentsCheckboxClickSaveButtonThenISeeTurnedOffMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnoffAppointments());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnOnOnlineAppointmentsCheckBoxUnchecked());

    }

    @And("I Log Out from Provider and Search for Health Centre Verify Online Appointment Slot is displayed for Easy booking{string}and{string}")
    public void iLogOutFromProviderAndSearchForHealthCentreVerifyOnlineAppointmentSlotIsDisplayedForEasyBookingAnd(String LocationData, String ProviderLoginData) {
        List<String> strdata=TestDataUtil.getListOfValue(ProviderLoginData);
        Assert.assertTrue(providerPageContainer.providerHomePage.clickProviderLogoutButton());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.EnterValueinSearchBoxVerifyAppointmentsSlotIsNotDisplayed(LocationData));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickMMHLogo());
        providerPageContainer.providerHomePage.Providervisit();
        Assert.assertTrue(providerPageContainer.providerHomePage.clickproviderLoginButton());
        providerPageContainer.providerHomePage.enterEmailForBeta(TestDataUtil.getValue(strdata.get(0)));
        providerPageContainer.providerHomePage.enterPasswordForBeta(TestDataUtil.getValue(strdata.get(1)));
        providerPageContainer.providerHomePage.clickSignInButton();
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyHomePageOfMMHPortal());
    }

    @When("I navigate to Turn Off Appointment Audit page")
    public void iNavigateToTurnOffAppointmentAuditPage() {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnOffAppointmentsAudit());

    }


    @Then("I Should see Turn Off Appointments audit details displayed grid view {string}")
    public void iShouldSeeTurnOffAppointmentsAuditDetailsDisplayedGridView(String LocationData) {

        Assert.assertTrue(providerPageContainer.appointmentSettingPage.verifyAppointmentsAuditDetailsGridView(LocationData));
    }

    @And("I navigate to Turn On Online Appointments {string} and Enable turn-On online appointments checkbox click save button then I see turned-On Message")
    public void iNavigateToTurnOnOnlineAppointmentsAndEnableTurnOnOnlineAppointmentsCheckboxClickSaveButtonThenISeeTurnedOnMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnoffAppointments());
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickTurnOnOnlineAppointmentsCheckBoxchecked());
    }
    @Then("I Should see Turn On Appointments audit details displayed grid view {string}")
    public void iShouldSeeTurnOnAppointmentsAuditDetailsDisplayedGridView(String LocationData) {
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.verifyTurnOnAppointmentsAuditDetailsGridView(LocationData));
    }

    @And("Click Block link under status column in Blocked Appointments Grid {string}")
    public void clickBlockLinkUnderStatusColumnInBlockedAppointmentsGrid(String BlockAppointmentData) {
        List<String> data=TestDataUtil.getListOfValue(BlockAppointmentData);
        Assert.assertTrue(providerPageContainer.appointmentsPage.clickBlockAppointmentsForProvider());
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(data.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentSettingPage.VerifyBlockAppointmentTableData(TestDataUtil.getListOfValue(BlockAppointmentData)));
    }
    @Given("As a Provider I am on HomePage and navigate to Phone Appointment Setting page")
    public void asAProviderIAmOnHomePageAndNavigateToPhoneAppointmentSettingPage() {
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSetting());
    }

    @And("I click edit button select the Phone Appointment Rule MMHPA {string}")
    public void iClickEditButtonSelectThePhoneAppointmentRuleMMHPA(String HealthcentreData) {
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingHealthCenter(TestDataUtil.getListOfValue(HealthcentreData)));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingVM03Locationcheckbox());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingVM03Location2checkbox());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03LocationRule1RadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03Location2Rule1RadioButton());
    }
    @And("I click edit button select the Phone Appointment Rule BLANK{string}")
    public void iClickEditButtonSelectThePhoneAppointmentRuleBLANK(String HealthcentreData) {
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingHealthCenter(TestDataUtil.getListOfValue(HealthcentreData)));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingVM03Locationcheckbox());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickPhoneAppointmentSettingVM03Location2checkbox());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03LocationRule2RadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03Location2Rule2RadioButton());
    }
    @When("I select the phone call initiated by Practice radio button and click the save button {string}")
    public void iSelectThePhoneCallInitiatedByPracticeRadioButtonAndClickTheSaveButton(String strdata) {
        List<String>InstructionstoPatientData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03LocationPraticeRadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03Location2PraticeRadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.EnterVM03Locationtextbox(TestDataUtil.getValue(InstructionstoPatientData.get(1))));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.EnterVM03Location2textbox(TestDataUtil.getValue(InstructionstoPatientData.get(2))));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickSaveButton());
    }
    @When("I select the phone call initiated by Patient radio button and click the save button {string}")
    public void iSelectThePhoneCallInitiatedByPatientRadioButtonAndClickTheSaveButton(String strdata) {
        List<String>InstructionstoPatientData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03LocationPatientRadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickVM03Location2PatientRadioButton());
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.EnterVM03Locationtextbox(TestDataUtil.getValue(InstructionstoPatientData.get(1))));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.EnterVM03Location2textbox(TestDataUtil.getValue(InstructionstoPatientData.get(2))));
        Assert.assertTrue(providerPageContainer.phoneAppointmentSettingPage.clickSaveButton());
    }
    @Given("As a Provider I am on HomePage and navigate to Recall Setting page")
    public void asAProviderIAmOnHomePageAndNavigateToRecallSettingPage() {
        Assert.assertTrue(providerPageContainer.recallSettingPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickRecallSetting());
    }
    @And("I click edit button select the Recall Setting Health centre {string}")
    public void iClickEditButtonSelectTheRecallSettingHealthCentre(String LocationData) {
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickRecallRemindersYesRadioButton());
    }
    @When("I enter the number of days recall reminder text box and click save button {string}")
    public void iEnterTheNumberOfDaysRecallReminderTextBoxAndClickSaveButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.recallSettingPage.EnterRecallReminderValue(LocationData));
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickSaveButton());
    }

    @And("I click edit button select the Recall Setting Health centre {string} Disable Recalls Remainder No button")
    public void iClickEditButtonSelectTheRecallSettingHealthCentreDisableRecallsRemainderNoButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.recallSettingPage.clickRecallRemindersNoRadioButton());

    }

    @Given("As a Provider I am on HomePage and navigate to My Appointment page")
    public void asAProviderIAmOnHomePageAndNavigateToMyAppointmentPage() {
        Assert.assertTrue(providerPageContainer.myAppointmentPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.myAppointmentPage.clickAppointmentButton());

    }


    @Then("I should see View Appointments details in My appointments grid based on the search {string}")
    public void iShouldSeeViewAppointmentsDetailsInMyAppointmentsGridBasedOnTheSearch(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectLocation(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmentsFutureDateOnCalender(TestDataUtil.getValue(stsdata.get(8))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmenteToDateOnCalender(TestDataUtil.getValue(stsdata.get(2))));
//        Assert.assertTrue(providerPageContainer.appointmentsPage.selectProviderName(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearchTextBox(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearch());
        Assert.assertTrue(providerPageContainer.appointmentsPage.VerifyMyAppointmentTableData(TestDataUtil.getListOfValue(strHealthCentre)));



    }

    @Then("I should see View Appointments details in My appointments grid based on the select provider name {string}")
    public void iShouldSeeViewAppointmentsDetailsInMyAppointmentsGridBasedOnTheSelectProviderName(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectLocation(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmentsFutureDateOnCalender(TestDataUtil.getValue(stsdata.get(8))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmenteToDateOnCalender(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectProviderName(TestDataUtil.getValue(stsdata.get(5))));
//        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearchTextBox(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearch());
        Assert.assertTrue(providerPageContainer.appointmentsPage.VerifyMyAppointmentTableData(TestDataUtil.getListOfValue(strHealthCentre)));

    }

    @Then("I should see View Appointments details in My appointments grid based on the search and Enter Patient Name {string}")
    public void iShouldSeeViewAppointmentsDetailsInMyAppointmentsGridBasedOnTheSearchAndEnterPatientName(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectLocation(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmentsFutureDateOnCalender(TestDataUtil.getValue(stsdata.get(8))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmenteToDateOnCalender(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectProviderName(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearchTextBox(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearch());
        Assert.assertTrue(providerPageContainer.appointmentsPage.VerifyMyAppointmentTableData(TestDataUtil.getListOfValue(strHealthCentre)));
    }

    @Then("I should see View Appointments details in My appointments grid based on the View clear search {string}")
    public void iShouldSeeViewAppointmentsDetailsInMyAppointmentsGridBasedOnTheViewClearSearch(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectLocation(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmentsFutureDateOnCalender(TestDataUtil.getValue(stsdata.get(8))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectMyAppointmenteToDateOnCalender(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectProviderName(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectSearchTextBox(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectViewClear());
        Assert.assertTrue(providerPageContainer.appointmentsPage.VerifyElements());

    }

    @Given("As a Provider I am on HomePage and navigate to online payments setting page")
    public void asAProviderIAmOnHomePageAndNavigateToOnlinePaymentsSettingPage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSetupOnlinePayments());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickPaymentSetting());

    }

    @And("I Enable Online Payments for Appointments by clicking Yes button and click the save button {string}")
    public void iEnableOnlinePaymentsForAppointmentsByClickingYesButtonAndClickTheSaveButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.EnableOnlinePaymentsforAppointments());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.ClickSaveButton());
    }

    @And("I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed")
    public void iNavigateToAppointmentSettingPageVerifyThePayonlineOrPayhealthcentreOptionsDisplayed() {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickAppointmentSetting());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickAppoitmentSettingEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.veriflyInpersonAppoitmentPaymentSettings());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.veriflyPhoneAppoitmentPaymentSettings());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.veriflyVideoAppoitmentPaymentSettings());


    }

    @And("I navigate to Appointment setting page verify the Payonline or Payhealthcentre options Not displayed")
    public void iNavigateToAppointmentSettingPageVerifyThePayonlineOrPayhealthcentreOptionsNotDisplayed() {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickAppointmentSetting());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickAppoitmentSettingEditButton());
        Assert.assertFalse(providerPageContainer.onlinePaymentsSettingPage.veriflyInpersonAppoitmentPaymentSettings());
        Assert.assertFalse(providerPageContainer.onlinePaymentsSettingPage.veriflyPhoneAppoitmentPaymentSettings());
        Assert.assertFalse(providerPageContainer.onlinePaymentsSettingPage.veriflyVideoAppoitmentPaymentSettings());
    }

    @And("I Enable Online Payments for RRP by clicking Yes button and click the save button {string}")
    public void iEnableOnlinePaymentsForRRPByClickingYesButtonAndClickTheSaveButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.EnableYesOnlinePaymentsforRRP());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.ClickSaveButton());

    }

    @And("I Enable Online Payments for Appointments by clicking No button and click the save button {string}")
    public void iEnableOnlinePaymentsForAppointmentsByClickingNoButtonAndClickTheSaveButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.EnableNoOnlinePaymentsforAppointments());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.ClickSaveButton());
    }


    @And("I navigate to RRP setting page verify the Payonline or Payhealthcentre options displayed")
    public void iNavigateToRRPSettingPageVerifyThePayonlineOrPayhealthcentreOptionsDisplayed() {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickRepeatScriptSetting());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickRepeatScriptSettingEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.veriflyRRPPaymentSetting());
    }

    @And("I navigate to RRP setting page verify the only show Payhealthcentre options displayed")
    public void iNavigateToRRPSettingPageVerifyTheOnlyShowPayhealthcentreOptionsDisplayed() {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickRepeatScriptSetting());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickRepeatScriptSettingEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.veriflyOnlyShowPayHealthCentreOptions());
    }

    @And("I Enable Online Payments for RRP by clicking No button and click the save button {string}")
    public void iEnableOnlinePaymentsForRRPByClickingNoButtonAndClickTheSaveButton(String LocationData) {
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.EnableNoOnlinePaymentsforRRP());
        Assert.assertTrue(providerPageContainer.onlinePaymentsSettingPage.ClickSaveButton());
    }

    @And("As a Provider I am on HomePage and navigate to Video Consultations page")
    public void asAProviderIAmOnHomePageAndNavigateToVideoConsultationsPage() {
        Assert.assertTrue(providerPageContainer.videoConsultationsPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.videoConsultationsPage.clickAppointmentButton());
        Assert.assertTrue(providerPageContainer.videoConsultationsPage.clickVideoConsultationsButton());
    }

    @Then("I should see Video consultations details in My appointments grid based on the select provider name {string}")
    public void iShouldSeeVideoConsultationsDetailsInMyAppointmentsGridBasedOnTheSelectProviderName(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.appointmentsPage.ProviderselectHealthCenter(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectProviderName(TestDataUtil.getValue(stsdata.get(5))));
//        Assert.assertTrue(providerPageContainer.appointmentsPage.selectVideoAppointmentsFutureDateOnCalender(TestDataUtil.getValue(stsdata.get(9))));
//        Assert.assertTrue(providerPageContainer.appointmentsPage.selectVideoConsultationsSearch());
//        Assert.assertTrue(providerPageContainer.appointmentsPage.VerifyVideoConsultationsTableData(TestDataUtil.getListOfValue(strHealthCentre)));

    }

    @Given("As a Provider I am on HomePage and navigate to Setup services in {string}")
    public void asAProviderIAmOnHomePageAndNavigateToSetupServicesIn(String strName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToSecureMessages(strName));
        }


    }

    @And("I click the Add new Button then select the setup services all details {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesAllDetails(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToStaffRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsYesRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());
    }


    @And("I click the Add new Button then select the setup services Staff radio button {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesStaffRadioButton(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToPatientRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsYesRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());
    }

    @And("I navigate to provider portal and verify the Patient message {string}")
    public void iNavigateToProviderPortalAndVerifyThePatientMessage(String lstMessageDetails) {
        List<String> lstMessage = TestDataUtil.getListOfValue(lstMessageDetails);
        System.out.println(">>>>>>>>>>>>>>>>>>>"+lstMessage);
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToInboxMessageForDoctor());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyProvidersetupServiceInboxMessages(TestDataUtil.getValue(lstMessage.get(0))));

    }

    @And("I click the Add new Button then select the setup services Non Clinical {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesNonClinical(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByNonClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToPatientRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsYesRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());


    }

    @And("I click the Add new Button then select the setup services Patient radio button {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesPatientRadioButton(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToPatientRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsYesRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());
    }

    @And("I click the Add new Button then select the setup services Non Clinical to Patient Staff {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesNonClinicalToPatientStaff(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByNonClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToStaffRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToStaffRadioButtonClickClinicalstaff());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsYesRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());
    }

    @And("As a user I am on Doctor portal homepage and Navigate to Provider inbox {string}")
    public void asAUserIAmOnDoctorPortalHomepageAndNavigateToProviderInbox(String strHealthCentre) {
        List<String>lstMessageDetails=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+lstMessageDetails);
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToInboxMessageForDoctor());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyInboxMessages(TestDataUtil.getValue(lstMessageDetails.get(5))));

    }

    @And("I click the Add new Button then select the setup services Do Not Allow to patient to Reply  {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesDoNotAllowToPatientToReply(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToStaffRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());

    }

    @And("I click the Add new Button then select the setup services Restrict to patient default location {string}")
    public void iClickTheAddNewButtonThenSelectTheSetupServicesRestrictToPatientDefaultLocation(String strHealthCentre) {
        List<String>stsdata=TestDataUtil.getListOfValue(strHealthCentre);
        System.out.println(">>>>>>>>>>>>stsdata"+stsdata);
        Assert.assertTrue(providerPageContainer.setupServicesPage.AddNewServices());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectHealthCentre(TestDataUtil.getValue(stsdata.get(0))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCategory(TestDataUtil.getValue(stsdata.get(1))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceName(TestDataUtil.getValue(stsdata.get(2))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceCode(TestDataUtil.getValue(stsdata.get(3))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectServiceInitiatedByClinicalRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAppliesToPatientRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRecipientLocation());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectRestricttoPatientdefaultlocationNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectAllowreplyfrompatientsNoRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterDescriptionValue(TestDataUtil.getValue(stsdata.get(4))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectIsChargeablaRadioButton());
        Assert.assertTrue(providerPageContainer.setupServicesPage.EnterTeamsandconditionsValue(TestDataUtil.getValue(stsdata.get(5))));
        Assert.assertTrue(providerPageContainer.setupServicesPage.SelectSaveButton());


    }

    @Then("I should verify the Patient Portal Web Banner heading {string} and Banner Messages {string} are displayed")
    public void iShouldVerifyThePatientPortalWebBannerHeadingAndBannerMessagesAreDisplayed(String strBannerHeading, String strBannerMessage) {
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerHeading(strBannerHeading));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerMessageDisplayed(strBannerMessage));
    }

    @Given("As a Provider I am on HomePage and navigate to Appointment Reminder Setting page")
    public void asAProviderIAmOnHomePageAndNavigateToAppointmentReminderSettingPage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickAppointmentReminderSettingPage());

    }

    @And("I click on the edit button then i Enable First Appointment Remainder checkbox and hours {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAppointmentRemainderCheckboxAndHours(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectHoursFirstAppointmentReminder(strData.get(2)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());


    }


    @When("I click the save Button then verify the Success message Popup should be displayed")
    public void iClickTheSaveButtonThenVerifyTheSuccessMessagePopupShouldBeDisplayed() {
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickSaveButton());
    }

    @And("I click on the edit button then i Enable First Appointment Remainder checkbox and Days {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAppointmentRemainderCheckboxAndDays(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectDaysFirstAppointmentReminder(strData.get(3)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectReminderTime(strData.get(4)));

    }

    @And("I click on the edit button then i Enable First and Second Appointment Remainder checkbox and hours {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAndSecondAppointmentRemainderCheckboxAndHours(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectHoursFirstAppointmentReminder(strData.get(2)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySecondAppoinmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberSecondAppointmentReminder(strData.get(5)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectHoursSecondAppoinmentReminder(strData.get(2)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySecondAppointmentReminderEmailCheckBoxEnabled());

    }

    @And("I click on the edit button then i Enable First and Second Appointment Remainder checkbox and Days {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAndSecondAppointmentRemainderCheckboxAndDays(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectDaysFirstAppointmentReminder(strData.get(3)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySecondAppoinmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberSecondAppointmentReminder(strData.get(5)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectDaysSecondAppointmentReminder(strData.get(3)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySecondAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectReminderTime(strData.get(4)));

    }

    @And("I click on the edit button then i Enable First Appointment Remainder Enable Skip weekends {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAppointmentRemainderEnableSkipWeekends(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectDaysFirstAppointmentReminder(strData.get(3)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectReminderTime(strData.get(4)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySkipWeekendsCheckBoxEnabled());

    }

    @And("I click on the edit button then i Enable First Appointment Remainder Disable Skip weekends {string}")
    public void iClickOnTheEditButtonThenIEnableFirstAppointmentRemainderDisableSkipWeekends(String AppointmentReminderData) {
        List<String> strData= TestDataUtil.getListOfValue(AppointmentReminderData);
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickEditButton());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.clickHealthCenterLocation(strData.get(0)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectNumberFirstAppointmentReminder(strData.get(1)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectDaysFirstAppointmentReminder(strData.get(3)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifyFirstAppointmentReminderEmailCheckBoxEnabled());
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.SelectReminderTime(strData.get(4)));
        Assert.assertTrue(providerPageContainer.appointmentReminderSettingPage.verifySkipWeekendsCheckBoxDisabled());

    }

    @And("I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message{string}")
    public void iSelectMinimumNoticeForCancellationAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String strdata) {
       Assert.assertTrue(providerPageContainer.appointmentSettingPage.clickMinimumNoticeForCancellation(TestDataUtil.getValue(strdata)));

    }

    @Given("As a Provider I am on HomePage and navigate to Video Consultations Setting page")
    public void asAProviderIAmOnHomePageAndNavigateToVideoConsultationsSettingPage() {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSecureMessaging());
        Assert.assertTrue(providerPageContainer.videoConsultationsSettingPage.clickVideoConsultatonsSettingPage());
    }

    @And("I enable Video Consultations by clicking Yes button and I click save button then I see Saved Successfully message{string}")
    public void iEnableVideoConsultationsByClickingYesButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.videoConsultationsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue((providerPageContainer.videoConsultationsSettingPage.EnableVideoConsultationYesButton()));
    }

    @Then("I should see Video appointment slots are displayed in All tab")
    public void iShouldSeeVideoAppointmentSlotsAreDisplayedInAllTab() {
        Assert.assertTrue(providerPageContainer.videoConsultationsSettingPage.verifyPatientVideoAppointmentDisplayedInAllTab());
    }

    @And("I enable Video Consultations by clicking No button and I click save button then I see Saved Successfully message{string}")
    public void iEnableVideoConsultationsByClickingNoButtonAndIClickSaveButtonThenISeeSavedSuccessfullyMessage(String LocationData) {
        Assert.assertTrue(providerPageContainer.videoConsultationsSettingPage.clickHealthCenterLocation(LocationData));
        Assert.assertTrue((providerPageContainer.videoConsultationsSettingPage.EnableVideoConsultationNoButton()));
    }

    @Then("I should see Video appointment slots are Not displayed in All tab")
    public void iShouldSeeVideoAppointmentSlotsAreNotDisplayedInAllTab() {
        Assert.assertTrue(providerPageContainer.videoConsultationsSettingPage.verifyPatientVideoAppointmentNotDisplayedInAllTab());
    }
}

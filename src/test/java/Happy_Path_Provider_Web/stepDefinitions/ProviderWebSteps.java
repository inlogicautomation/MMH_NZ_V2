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
            Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptFeeMessageSettings(strName));
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
            Assert.assertTrue(providerPageContainer.providerHomePage.clickMobileSystemMenu());
            Assert.assertTrue(providerPageContainer.providerHomePage.navigateToMobileRepeatScriptFeeMessageSettings(strName));

        }

    }

    @And("I navigate to RRP Script Instructions Settings and click edit button")
    public void iNavigateToRRPScriptInstructionsSettingsAndClickEditButton() {
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSetting());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingEditButton());
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
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickServiceOptionUrgentSameday(strData.get(0)));
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


        Assert.assertTrue(providerPageContainer.providerHomePage.clickPreScreeningSettings());

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

        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectHealthCenter(TestDataUtil.getValue(strHealthCentre)));
        Assert.assertTrue(providerPageContainer.appointmentsPage.declineCovidPreScreeningPopup());
        Assert.assertTrue(providerPageContainer.appointmentsPage.selectLocation(TestDataUtil.getValue(strLocation)));
    }




    @Given("As a user I navigate to Provider Page")
    public void asAUserINavigateToProviderPage() {

        Assert.assertTrue(providerPageContainer.providerHomePage.switchToProviderTab());
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyProviderHomePage());
    }




    @Given("As a user Iam on Patient login page")
    public void asAUserIamOnPatientLoginPage() {


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
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
    }

    @Given("As a Provider I am on HomePage and navigate to Repeat Script Settings in {string}")
    public void AsAProviderIAmOnHomePageAndNavigateToRepeatScriptSettingsIn(String strName) {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptSettings(strName));
    }

    @And("I click the edit button and changing the data as per Rule A{string}")
    public void iClickTheEditButtonAndChangingTheDataAsPerRuleA(String strDetail) {
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptSetting details >>> :: " + lstDetails);
        providerPageContainer.providerHomePage.clickEditButton();
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectServiceName(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectOtherReqData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqDataRuleA());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifySavedData());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.backToHomePage());
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
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectSendReqData(lstDetails.get(2)));
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
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByToPharmacy48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacyServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverMedsByPharmacy72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @When("I click Deliver via Zoom Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option")
    public void iClickDeliverViaZoomPharmacyCheckboxEnterServiceOptionNameFeesAndDescriptionForAllFourServiceOption(String strdata) {
        List<String>strData=TestDataUtil.getListOfValue(strdata);
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverviaZoomPharmacyCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.EnterDeliverViaZoomPharmacyUrgentSamedayTextBox(strData.get(0)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharamacyFeeUrgentSameday(strData.get(1)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyNextDayCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyServiceOptionNextDay(strData.get(2)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyNextDayFee(strData.get(3)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy48HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyServiceOption48Hours(strData.get(4)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy48HoursFee(strData.get(5)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy72HoursCheckBox());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacyServiceOption72Hours(strData.get(6)));
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickDeliverViaZoomPharmacy72HoursFee(strData.get(7)));
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSaveButton());
    }

    @And("I click Edit button to select {string} and {string}")
    public void iClickEditButtonToSelectAnd(String strHealthCentre, String strLocation) {

        Assert.assertTrue(providerPageContainer.preScreeningPage.clickPreScreeningEdit());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectLocation(strLocation));
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

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditbtn());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickBannerMssgYesRadiobtn());
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

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterLocationInSearchBox(TestDataUtil.getValue(strLocation)));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyHealthCenterLocation(strLocation));
    }

    @When("I click the Book Now button {string}")
    public void iClickTheBookNowButton(String strLocation) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickBookNow(strLocation));
    }

    @Then("I should verify the Banner heading {string} and Banner Messages {string} are saved")
    public void iShouldVerifyTheBannerHeadingAndBannerMessagesAreSaved(String strBannerHeading, String strBannerMessage) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyBannerHeading(strBannerHeading));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyBannerMessage(strBannerMessage));
    }

    @And("I select Health Center {string} and I enable Banner Message to No")
    public void iSelectHealthCenterAndIEnableBannerMessageToNo(String strHealthCentre) {

        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditbtn());
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
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickAppointmentMessage());
//        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyAppointmentHeading());
    }

    @And("As a user I am on Patient HomePage and I logout from the Patient login")
    public void asAUserIAmOnPatientHomePageAndILogoutFromThePatientLogin() {
        Assert.assertTrue(providerPageContainer.providerHomePage.switchToPatientTab());
        Assert.assertTrue(providerPageContainer.providerHomePage.verifyPatientHomePage());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickSignOut());
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickAllRadioBtn());
    }


    @And("I select Health Center {string} and I enable Patient Portal Web Banner Message to No")
    public void iSelectHealthCenterAndIEnablePatientPortalWebBannerMessageToNo(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditbtn());
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickHealthCentreDropDown());
        Assert.assertTrue(providerPageContainer.preScreeningPage.selectHealthCentre(strHealthCentre));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickPatientWebBannerMessageYesRadioBtn());

    }

    @And("I fill Patient Portal Web Banner Heading {string} and Banner Message fields {string}")
    public void iFillPatientPortalWebBannerHeadingAndBannerMessageFields(String strBannerHeading, String strBannerMssg) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterWebBannerHeading(TestDataUtil.getValue(strBannerHeading)));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.enterWebBannerMessage(TestDataUtil.getValue(strBannerMssg)));
        Assert.assertTrue(providerPageContainer.preScreeningPage.clickUpdateButton());
    }

    @Then("I should verify the Patient Portal Web Banner heading {string} and Banner Messages {string} are not displayed")
    public void iShouldVerifyThePatientPortalWebBannerHeadingAndBannerMessagesAreNotDisplayed(String strBannerHeading, String strBannerMessage) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerHeading(strBannerHeading));
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.verifyWebBannerHeading(strBannerMessage));
    }

    @And("I select Health Center {string} and I enable Patient Portal Web Banner Message to yes")
    public void iSelectHealthCenterAndIEnablePatientPortalWebBannerMessageToYes(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.appointmentMessagePage.clickEditbtn());
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

    @And("I navigate to provider portal and verify the Reply message")
    public void iNavigateToProviderPortalAndVerifyTheReplyMessage() {


    }

    @And("I navigate to inbox items and create a reply message {string}")
    public void iNavigateToInboxItemsAndCreateAReplyMessage(String strMessageDetails) {
        List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessageDetails);
        System.out.println("List Message Details >>> :: " + lstMessageDetails);
        Assert.assertTrue(providerPageContainer.providerMessagesPage.verifyDraftBodyMessages(TestDataUtil.getListOfValue(strMessageDetails)));
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
//        Assert.assertTrue(providerPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerMessagesPage.navigateToDoctorMessageSetting());


    }
}

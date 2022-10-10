package PROVIDER_HAPPY_PATH.stepDefinitions;


import PROVIDER_HAPPY_PATH.ProviderPageContainer;
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
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptFeeMessageSettings(strName));

    }
    @And("I navigate to RRP Script Instructions Settings and click edit button")
    public void iNavigateToRRPScriptInstructionsSettingsAndClickEditButton() {
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSetting());
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingEditButton());

    }

    @When("I disable the RRP Script Instructions Settings {string}")
    public void iDisableTheRRPScriptInstructionsSettings(String strDetail) {
        List<String> lstDetails= TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptInstructionSetting details >>> :: "+lstDetails);
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.selectHealthCentreLocation(lstDetails.get(0)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.EnableRRPScriptInstructionsFeeForLocation(lstDetails.get(1)));
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.clickRRPScriptInstructionSettingSaveButton());


    }

    @Then("I should verify disabled RRP Script Instructions Settings {string}")
    public void iShouldVerifyDisabledRRPScriptInstructionsSettings(String strDetail) {
        List<String> lstDetails= TestDataUtil.getListOfValue(strDetail);
        System.out.println("RRPScriptInstructionSetting details >>> :: "+lstDetails);
        Assert.assertTrue(providerPageContainer.repeatScriptSettingPage.verifyRRPScriptInstructionsChanges(lstDetails.get(0),lstDetails.get(1)));

    }




    @When("I navigate to RRP Script Instructions Fee Setup Page and Select Health centre {string}")
    public void iNavigateToRRPScriptInstructionsFeeSetupPageAndSelectHealthCentre(String strHealthCentre) {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickRRPScriptInstructionsFeeSetup());
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.selectHealthCentre(strHealthCentre));
    }

    @And("I Click Edit on a location record in Grid & Selected Location must be auto-populated")
    public void iClickEditOnALocationRecordInGridSelectedLocationMustBeAutoPopulated(String Locationdata) {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.ClickRRPScriptInstructionFeeSetupEditAction(TestDataUtil.getListOfValue(Locationdata)));


    }
    @And("I navigate to RRP Script Instructions Settings and i click edit button")
    public void iNavigateToRRPScriptInstructionsSettingsAndIClickEditButton() {
        Assert.assertTrue(providerPageContainer.rrpScriptFeeSettingsPage.clickEditButton());
    }
}

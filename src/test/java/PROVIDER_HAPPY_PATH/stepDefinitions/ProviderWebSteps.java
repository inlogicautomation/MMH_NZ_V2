package PROVIDER_HAPPY_PATH.stepDefinitions;


import PROVIDER_HAPPY_PATH.ProviderPageContainer;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class ProviderWebSteps {
    private ProviderPageContainer providerPageContainer;

    public ProviderWebSteps(ProviderPageContainer providerPageContainer) {

        this.providerPageContainer = providerPageContainer;
    }


    @Given("As a user I am on Provider Portal login Page")
    public void asAUserIAmOnProviderPortalLoginPage() {

    }


    @Given("As a Provider I am on HomePage and navigate to RRP Script Instructions in {string}")
    public void asAProviderIAmOnHomePageAndNavigateToRRPScriptInstructionsIn(String strName) {
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToProviderHomepage());
        Assert.assertTrue(providerPageContainer.providerHomePage.clickSystemMenu());
        Assert.assertTrue(providerPageContainer.providerHomePage.navigateToRepeatScriptFeeMessageSettings(strName));

    }
}

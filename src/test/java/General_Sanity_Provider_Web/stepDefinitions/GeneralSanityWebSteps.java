package General_Sanity_Provider_Web.stepDefinitions;

import General_Sanity_Provider_Web.GeneralSanityPageContainer;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class GeneralSanityWebSteps {

    private GeneralSanityPageContainer generalSanityPageContainer;

    public GeneralSanityWebSteps(GeneralSanityPageContainer generalSanityPageContainer) {

        this.generalSanityPageContainer = generalSanityPageContainer;
    }




    @Given("As a user I am on MMH Provider login Page")
    public void asAUserIAmOnMMHProviderLoginPage() {
        generalSanityPageContainer.login.visit();
        Assert.assertTrue(generalSanityPageContainer.login.clickBetaLoginButton());

    }


    @And("I enter {string} and {string} in Provider login screen")
    public void iEnterAndInProviderLoginScreen(String strUserName, String strPassword) {
        generalSanityPageContainer.login.enterEmailForBeta(TestDataUtil.getValue(strUserName));
        generalSanityPageContainer.login.enterPasswordForBeta(TestDataUtil.getValue(strPassword));

    }

    @And("I click SignIn button then I should see user successfully logs in to the MMH Provider Portal")
    public void iClickSignInButtonThenIShouldSeeUserSuccessfullyLogsInToTheMMHProviderPortal() {
        generalSanityPageContainer.login.clickSignInButton();
        Assert.assertTrue(generalSanityPageContainer.login.verifyHomePageOfMMHPortal());

    }
}

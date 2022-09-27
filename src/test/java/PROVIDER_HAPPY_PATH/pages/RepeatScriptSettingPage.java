package PROVIDER_HAPPY_PATH.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RepeatScriptSettingPage extends BasePage {

    public RepeatScriptSettingPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement elmntRRPScriptInstructionsSettings;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement txtRRPScriptInstructionsFeeSetup;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Location']")
    protected WebElement drpdownLocation;

    protected String selectLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();



    public boolean clickRRPScriptInstructionSetting(){
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsSettings);
        waitForElementClickable(elmntRRPScriptInstructionsSettings);
        waitAndClick(elmntRRPScriptInstructionsSettings);

        waitForElement(txtRRPScriptInstructionsSettings);
        isVerified =verifyElement(txtRRPScriptInstructionsSettings);
        return isVerified;
    }

    public boolean clickRRPScriptInstructionFeeSetup(){
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsFeeSetup);
        waitForElementClickable(elmntRRPScriptInstructionsFeeSetup);
        waitAndClick(elmntRRPScriptInstructionsFeeSetup);

        waitForElement(txtRRPScriptInstructionsFeeSetup);
        isVerified =verifyElement(txtRRPScriptInstructionsFeeSetup);
        return isVerified;
    }

    public boolean selectHealthCentreLocation(String strLocation) {
        boolean blResult = false;
        try {
            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpdownLocation);
            waitForElementClickable(drpdownLocation);
            click(drpdownLocation);

            System.out.println(" select Location Locator :: " + selectLocation.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitForElementClickable(ddlLocation);
            waitForSeconds(2);
            System.out.println("Location was selected in the Request Medication >>> ::");
            mouseClick(ddlLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            System.out.println("Location not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

}

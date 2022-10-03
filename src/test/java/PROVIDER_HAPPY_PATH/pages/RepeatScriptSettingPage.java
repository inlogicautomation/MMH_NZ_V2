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

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    protected WebElement btnEdit;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(xpath = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Changes Saved Successfully')]")
    protected WebElement successPopUp;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='HealthCenter']")
    protected WebElement drpDownLocation;

    protected String selectLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();

    //span[contains(text(),'VM04Practice')]
    protected String selectedDrpDownOption = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //div[contains(text(),'No')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']
    protected String rdoBtn = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']").toString();




    public boolean clickRRPScriptInstructionSetting(){
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsSettings);
        waitForElementClickable(elmntRRPScriptInstructionsSettings);
        waitAndClick(elmntRRPScriptInstructionsSettings);

        waitForElement(txtRRPScriptInstructionsSettings);
        isVerified =verifyElement(txtRRPScriptInstructionsSettings);
        return isVerified;
    }

    public boolean clickRRPScriptInstructionSettingEditButton(){
        boolean isVerified = false;
        waitForSeconds(2);
        waitForElement(btnEdit);
        waitForElementClickable(btnEdit);
        waitAndClick(btnEdit);
        waitForElement(btnSave);
        return isVerified =verifyElement(btnSave);
    }
    public boolean clickRRPScriptInstructionSettingSaveButton(){
        boolean isVerified = false;
        waitForSeconds(2);
        waitForElement(btnSave);
        waitForElementClickable(btnSave);
        waitAndClick(btnSave);
        waitForElement(btnEdit);
        waitForElement(successPopUp);
        return isVerified =verifyElement(btnEdit);
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
            waitForElement(drpDownLocation);
            waitForElementClickable(drpDownLocation);
            click(drpDownLocation);

            System.out.println(" select Location Locator :: " + selectLocation.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitForElementClickable(ddlLocation);
            waitForSeconds(2);
            System.out.println("Location was selected in the Request Medication >>> ::");
            mouseClick(ddlLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            System.out.println(" selected DrpDownOption Locator >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
            waitForElement(selectedOption);

            blResult = verifyElement(selectedOption);
        } catch (Exception e) {
            System.out.println("Location not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

}

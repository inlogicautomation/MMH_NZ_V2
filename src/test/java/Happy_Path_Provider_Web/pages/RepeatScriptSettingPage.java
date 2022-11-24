package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RepeatScriptSettingPage extends BasePage {

    public RepeatScriptSettingPage(WebDriver driver) {
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

    //div[contains(text(),'No')]/preceding-sibling::div/input
    protected String selectedRdoBtnValue = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]/preceding-sibling::div/input").toString();

    //div[contains(text(),'No')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']
    protected String rdoBtn = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']").toString();


    public boolean clickRRPScriptInstructionSetting() {
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsSettings);
        waitForElementClickable(elmntRRPScriptInstructionsSettings);
        waitAndClick(elmntRRPScriptInstructionsSettings);

        waitForElement(txtRRPScriptInstructionsSettings);
        isVerified = verifyElement(txtRRPScriptInstructionsSettings);
        return isVerified;
    }

    public boolean clickRRPScriptInstructionSettingEditButton() {
        boolean isVerified = false;
        waitForSeconds(2);
        waitForElement(btnEdit);
        waitForElementClickable(btnEdit);
        waitAndClick(btnEdit);
        waitForElement(btnSave);
        return isVerified = verifyElement(btnSave);
    }

    public boolean clickRRPScriptInstructionSettingSaveButton() {
        boolean isVerified = false;
        waitForSeconds(2);
        jsScrollIntoView(btnSave);
        waitForElement(btnSave);
        waitForElementClickable(btnSave);
        waitAndClick(btnSave);
        waitForElement(btnEdit);
        waitForElement(successPopUp);
        return isVerified = verifyElement(btnEdit);
    }

    public boolean clickRRPScriptInstructionFeeSetup() {
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsFeeSetup);
        waitForElementClickable(elmntRRPScriptInstructionsFeeSetup);
        waitAndClick(elmntRRPScriptInstructionsFeeSetup);

        waitForElement(txtRRPScriptInstructionsFeeSetup);
        isVerified = verifyElement(txtRRPScriptInstructionsFeeSetup);
        return isVerified;
    }

    public boolean selectHealthCentreLocation(String strLocation) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpDownLocation);
            waitForElementClickable(drpDownLocation);
            click(drpDownLocation);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);

            System.out.println(" select Location Locator :: " + selectLocation.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitForElementClickable(ddlLocation);
            waitForSeconds(2);
            waitAndClick(ddlLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            System.out.println(" selected DrpDownOption Locator >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
            waitForElement(selectedOption);

            blResult = verifyElement(selectedOption);
            System.out.println("Location was selected >>> ::");

        } catch (Exception e) {
            System.out.println("Location not selected >>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean EnableRRPScriptInstructionsFeeForLocation(String strType) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            System.out.println("Rdo Btn Locator :: " + rdoBtn.replace("<<TYPE>>", strType) + "\n");
            WebElement type = waitForElement(By.xpath(rdoBtn.replace("<<TYPE>>", strType)));
            waitForElementClickable(type);
            waitForSeconds(2);
            waitAndClick(type);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("selectedType Btn Locator :: " + selectedRdoBtnValue.replace("<<TYPE>>", strType) + "\n");
            WebElement selectedType = waitForElement(By.xpath(selectedRdoBtnValue.replace("<<TYPE>>", strType)));
            waitForElement(selectedType);
            takeScreenshot(driver);
            blResult = selectedType.isSelected();

        } catch (Exception e) {
            System.out.println("Rdo Btn not selected >>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyRRPScriptInstructionsChanges(String strLocation, String strType) {
        boolean isVerified = false;
        try {
            System.out.println(" selected DrpDownOption Locator >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
            waitForElement(selectedOption);
            jsScrollIntoView(selectedOption);
            takeScreenshot(driver);

            System.out.println("selectedType Btn Locator :: " + selectedRdoBtnValue.replace("<<TYPE>>", strType) + "\n");
            WebElement selectedType = waitForElement(By.xpath(selectedRdoBtnValue.replace("<<TYPE>>", strType)));
            waitForElement(selectedType);

            if (selectedOption.isDisplayed()||selectedType.isSelected()){
                isVerified = true;
            }else {
                return isVerified;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;
    }
}

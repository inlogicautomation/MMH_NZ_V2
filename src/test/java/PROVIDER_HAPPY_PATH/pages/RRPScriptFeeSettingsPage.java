package PROVIDER_HAPPY_PATH.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RRPScriptFeeSettingsPage extends BasePage {
    public RRPScriptFeeSettingsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    protected WebElement elmntRRPScriptInstructionsEditButton;

    @FindBy(xpath = "(//mat-radio-group[@formcontrolname='IsRRPFeeLocationEnabled']//following::input)[1]")
    protected WebElement elmntRRPScriptInstructionsYesButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement elmntRRPScriptInstructionsSaveButton;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = " //mat-label[contains(text(),'Health Centre')]//preceding::mat-select")
    protected WebElement elmntHealthCentre;

    protected String SelectHealthCentre = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();


    protected String strRRPScriptInstructionsFeeSetupEditAction = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td/button").toString();

    //mat-label[contains(text(),'Health Centre')]//preceding::mat-select

    //td[contains(text(),'VM04Practice')]//following::td[contains(text(),'Vm04TestProvider')]//following::td/button


    public boolean clickEditButton() {
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsEditButton);
        jsClick(elmntRRPScriptInstructionsEditButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        waitForElementClickable(elmntRRPScriptInstructionsYesButton);
        jsClick(elmntRRPScriptInstructionsYesButton);
        waitForElement(elmntRRPScriptInstructionsEditButton);
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsSaveButton);
        click(elmntRRPScriptInstructionsSaveButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmntRRPScriptInstructionsEditButton);
    }

    public boolean clickRRPScriptInstructionsFeeSetup() {
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsFeeSetup);
        jsClick(elmntRRPScriptInstructionsFeeSetup);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        return verifyElement(elmntRRPScriptInstructionsFeeSetup);
    }
    public boolean selectHealthCentre(String strHealthCentre) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntHealthCentre);
            waitForSeconds(2);
            jsClick(elmntHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(SelectHealthCentre.replace("<<REPLACEMENT>>", strHealthCentre)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            blResult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {
            System.out.println("Health Centre not selected in the RRP Script Instructions Fee Setup");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickRRPScriptInstructionFeeSetupEditAction(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strRRPScriptInstructionsFeeSetupEditAction
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(3);
            blResult =true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

}

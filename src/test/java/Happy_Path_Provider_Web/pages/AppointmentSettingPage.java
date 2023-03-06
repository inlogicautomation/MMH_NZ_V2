package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppointmentSettingPage extends BasePage {
    public AppointmentSettingPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSetting;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntAppointmentSettingEditButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Settings')]")
    protected WebElement txtAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleA']//input")
    protected WebElement elmntRuleARadioButton;
    //mat-radio-button[@value='ruleA']//input


    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleB']//input")
    protected WebElement elmntRuleBRadioButton;

    @FindBy(how = How.XPATH, using = "//span[text()=' Save ']")
    protected WebElement elmntSaveButton;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntHealthCentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    //span[contains(text(),'VM03Location')]

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Changes Saved Successfully')]")
    protected WebElement txtSuccessfullyMessagePopup;
//    Changes Saved Successfully

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public boolean clickAppointmentMessage() {
        boolean blresult = false;
        try {
//            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            jsScrollIntoView(elmntAppointmentSettingEditButton);
            waitForElementClickable(elmntAppointmentSettingEditButton);
            jsClick(elmntAppointmentSettingEditButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            blresult = verifyElement(txtAppointmentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRuleAButton() {
        boolean blresult = false;
        try {
//            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntRuleARadioButton);
            waitForElement(elmntRuleARadioButton);
            jsClick(elmntRuleARadioButton);
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRuleBButton() {
        boolean blresult = false;
        try {
//            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntRuleBRadioButton);
            waitForElement(elmntRuleBRadioButton);
            jsClick(elmntRuleBRadioButton);
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntHealthCentre);
            jsClick(elmntHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {

        }
        return blresult;

    }
}

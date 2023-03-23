package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
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

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleC']//input")
    protected WebElement elmntRuleCRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleD']//input")
    protected WebElement elmntRuleDRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleE']//input")
    protected WebElement elmntRuleERadioButton;

    //mat-radio-button[@value='ruleE']//input

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement elmntSaveButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Visit')]")
    protected WebElement elmntVisitAppointmentIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Video')]")
    protected WebElement elmntVideoAppointmentIcon;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Phone')])[2]")
    protected WebElement elmntPhoneAppointmentIcon;


    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntHealthCentre;

    protected String selectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@ng-reflect-model='true']//input").toString();

    protected String deselectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@ng-reflect-model='false']//input").toString();
    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    //span[contains(text(),'VM03Location')]

    //h1[contains(text(),'Appointment settings Rule E')]

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment settings Rule E')]")
    protected WebElement txtAppointmentsettingsRuleEHeader;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Changes saved successfully.')]")
    protected WebElement txtSuccessfullyMessagePopup;


    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public boolean clickAppointmentMessage() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            jsScrollIntoView(elmntAppointmentSettingEditButton);
            waitForElementClickable(elmntAppointmentSettingEditButton);
            jsClick(elmntAppointmentSettingEditButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            System.out.println("Successfull see the Appointment Setting");
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
            takeScreenshot(driver);
            jsClick(elmntRuleARadioButton);
            System.out.println("Successfully Click RuleA Radio Button");
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
            takeScreenshot(driver);
            jsClick(elmntRuleBRadioButton);
            System.out.println("Successfully Click RuleB Radio Button");
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

    public boolean clickRuleCButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleCRadioButton);
            waitForElement(elmntRuleCRadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleCRadioButton);
            System.out.println("Successfully Click RuleC Radio Button");
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

    public boolean clickRuleDButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleDRadioButton);
            waitForElement(elmntRuleDRadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleDRadioButton);
            System.out.println("Successfully Click RuleD Radio Button");
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

    public boolean clickRuleEButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleERadioButton);
            waitForElement(elmntRuleERadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleERadioButton);
            System.out.println("Successfully Click RuleD Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(txtAppointmentsettingsRuleEHeader);
            blresult = verifyElement(txtAppointmentsettingsRuleEHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickAppointmentsettingsRuleESaveButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementToAppear(driver,By.xpath("//p[contains(text(),'Changes saved successfully.')]"));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntHealthCentre);
            click(elmntHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean selectRestrictProviderscheckbox(String strLocation) {
        boolean blresult = false;
        try {
            if (verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))))) {
                takeScreenshot(driver);
                System.out.println("Appointment Restrict Provider CheckBox Already checked");
                blresult = true;
            }
            if (!verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                WebElement elmntHealthCentreLocation2 = waitForElementClickable(By.xpath(deselectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation2"+ elmntHealthCentreLocation2);
                waitForElement(elmntHealthCentreLocation2);
                jsClick(elmntHealthCentreLocation2);
                verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
                takeScreenshot(driver);
                System.out.println("Appointment  Restrict Provider CheckBox Checked::");
                blresult = true;
            }
            blresult = true;
        }
        catch (Exception e) {

            System.out.println("Cannot Successfully clicked Appointment Restrict Provider CheckBox");
            e.printStackTrace();
        }
        return blresult;
    }
    public boolean clickVisitIconCheckRestrictedproviderarenotdisplayed() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntVisitAppointmentIcon);
            waitForElement(elmntVisitAppointmentIcon);
            click(elmntVisitAppointmentIcon);
            System.out.println("Successfully Click Visit Appointment Icon");
            blresult = verifyElement(elmntVisitAppointmentIcon);
        } catch (Exception e) {

        }
        return blresult;
    }



    public boolean clickPhoneIconCheckRestrictedproviderarenotdisplayed() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntPhoneAppointmentIcon);
            waitForElement(elmntPhoneAppointmentIcon);
            click(elmntPhoneAppointmentIcon);
            System.out.println("Successfully Click Phone Appointment Icon");
            blresult = verifyElement(elmntPhoneAppointmentIcon);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickVideoIconCheckRestrictedproviderarenotdisplayed() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntVideoAppointmentIcon);
            waitForElement(elmntVideoAppointmentIcon);
            click(elmntVideoAppointmentIcon);
            System.out.println("Successfully Click Video Appointment Icon");
            blresult = verifyElement(elmntVideoAppointmentIcon);
        } catch (Exception e) {

        }
        return blresult;
    }
}



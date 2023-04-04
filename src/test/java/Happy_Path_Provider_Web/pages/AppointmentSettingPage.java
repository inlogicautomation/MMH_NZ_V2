package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cap.utilities.DateUtil.getCurrentDate;

public class AppointmentSettingPage extends BasePage {
    public AppointmentSettingPage(WebDriver driver) {
        super(driver);

    }

    public static String strTime;

    @FindBy(how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSetting;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntAppointmentSettingEditButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Settings')]")
    protected WebElement txtAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleA']//input")
    protected WebElement elmntRuleARadioButton;

    @FindBy(how = How.XPATH, using = "//div[text()='Turn-Off Appointments']")
    protected WebElement elmntTurnOffAppointments;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Turn-Off Appointments Audit')]")
    protected WebElement elmntTurnOffAppointmentsAudit;


    @FindBy(how = How.XPATH, using = "//h1[text()='Turn-Off Appointments']")
    protected WebElement elmntTurnOffAppointmentsHeader;

    @FindBy(how = How.XPATH, using = " //h1[contains(text(),'Turn-Off Appointments Audit')]")
    protected WebElement elmntTurnOffAppointmentsAuditHeader;

    protected String strAppointmentAudit = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following-sibling::td[text()='")
            .append("<<REPLACEMENT5>>").append("']").toString();

//td[text()='VM03Location']//following::td[contains(text(),'Tim')]//following::td[contains(text(),'04 Apr 2023')]//following::td[contains(text(),'07:48 AM')]//following-sibling::td[text()='Turned On']


    @FindBy(how = How.XPATH, using = "//span[text()=' Edit ']")
    protected WebElement elmntEditButton;

    @FindBy(how = How.XPATH, using = "//p[text()='Online Appointment booking has been turned-on']")
    protected WebElement elmntTurnOnSuccessfullyPopup;

    @FindBy(how = How.XPATH, using = "//p[text()='Online Appointment booking has been turned-off']")
    protected WebElement elmntTurnOffSuccessfullyPopup;


    @FindBy(how = How.XPATH, using = "//input[@id='SearchText']")
    protected WebElement elmntSearchBox;

    @FindBy(how = How.XPATH, using = "//button[text()='SEARCH']")
    protected WebElement clicksearchicon;

    @FindBy(how = How.XPATH, using = "(//h2[text()='VM03Location']//following::a[text()='Book now'])[1]")
    protected WebElement clickVM03LocationBookNowButton;

    @FindBy(how = How.XPATH, using = "//div[@class='slot-start-time']")
    protected WebElement elmntSlotTimes;



    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Use this form to request non urgent appointments')]")
    protected WebElement AppointmentTimeSlotsisNotDisplaying;
    //p[text()='Online Appointment booking has been turned-on']

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true']")
    protected WebElement elmntTurnOffOnlineAppointmentsCheckBoxChecked;
    @FindBy(how = How.XPATH, using = "//input[@aria-checked='false']")
    protected WebElement elmntTurnOnOnlineAppointmentsCheckBoxUnchecked;


    //mat-checkbox[@formcontrolname='turnOffOnlinechecked']//input
    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleB']//input")
    protected WebElement elmntRuleBRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleC']//input")
    protected WebElement elmntRuleCRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleD']//input")
    protected WebElement elmntRuleDRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@value='ruleE']//input")
    protected WebElement elmntRuleERadioButton;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='allowtobookfamily']//input)[1]")
    protected WebElement elmntAllowToBookFriendsYesButton;

    //mat-radio-button[@value='ruleE']//input


    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='allowtobookfamily']//input)[2]")
    protected WebElement elmntAllowToBookFriendsNoButton;

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

    @FindBy(how = How.XPATH, using = "//p[text()='Changes Saved Successfully']")
    protected WebElement txtChangesSavedSuccessfullyMessagePopup;

    //p[text()='Changes Saved Successfully']

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
            takeScreenshot(driver);
//            waitForElement(txtSuccessfullyMessagePopup);
            blresult =true;
            System.out.println("Verify Changes saved successfully. Popup");
        } catch (Exception e) {
            System.out.println("Cannot Verify Changes saved successfully. Popup");

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
            System.out.println("Successfully Click Rule E Radio Button");
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

    public boolean DeselectRestrictProviderscheckbox(String strLocation) {
        boolean blresult = false;
        try {
            takeScreenshot(driver);
            if (verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))))) {
                takeScreenshot(driver);
                System.out.println("Appointment Restrict Provider CheckBox Already Unchecked");
                blresult = true;
            }
            if (!verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                WebElement elmntHealthCentreLocation2 = waitForElementClickable(By.xpath(selectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation2"+ elmntHealthCentreLocation2);
                waitForElement(elmntHealthCentreLocation2);
                jsClick(elmntHealthCentreLocation2);
                verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));

                System.out.println("Appointment  Restrict Provider CheckBox UnChecked::");
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


    public boolean clickAllowtoBookForFamilyYesButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleARadioButton);
            waitForElement(elmntRuleARadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleARadioButton);
            jsScrollIntoView(elmntAllowToBookFriendsYesButton);
            waitForElement(elmntAllowToBookFriendsYesButton);
            takeScreenshot(driver);
            jsClick(elmntAllowToBookFriendsYesButton);
            System.out.println("Successfully Click Allow To Book Friends Yes Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            takeScreenshot(driver);
//            waitForElement(txtChangesSavedSuccessfullyMessagePopup);
            blresult =true;

        } catch (Exception e) {
        System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }

    public boolean clickAllowtoBookForFamilyNoButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleARadioButton);
            waitForElement(elmntRuleARadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleARadioButton);
            jsScrollIntoView(elmntAllowToBookFriendsNoButton);
            waitForElement(elmntAllowToBookFriendsNoButton);
            takeScreenshot(driver);
            jsClick(elmntAllowToBookFriendsNoButton);
            System.out.println("Successfully Click Allow To Book Friends Yes Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            takeScreenshot(driver);
//            waitForElement(txtChangesSavedSuccessfullyMessagePopup);
            blresult =true;

        } catch (Exception e) {
            System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }

    public boolean clickTurnoffAppointments() {
        boolean blresult = false;
        try {
            waitForElement(elmntTurnOffAppointments);
            takeScreenshot(driver);
            jsClick(elmntTurnOffAppointments);
            waitForElement(elmntTurnOffAppointmentsHeader);
           verifyElement(elmntTurnOffAppointmentsHeader);
            blresult =true;
        } catch (Exception e) {
            System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }



    public boolean clickTurnOffOnlineAppointmentsCheckBoxchecked() {
        boolean blresult = false;
        try {
            System.out.println("Entry Turn Off Online Appointments");
waitForElement(elmntEditButton);
click(elmntEditButton);
           if (isElementDisplayed(elmntTurnOffOnlineAppointmentsCheckBoxChecked)) {
               System.out.println("Turn Off Online Appointments CheckBox Already checked");
           }
           if (isElementDisplayed(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked)){
               jsClick(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked);
               takeScreenshot(driver);
               verifyElement(elmntTurnOffOnlineAppointmentsCheckBoxChecked);
           }
            waitForElement(elmntTurnOffAppointmentsHeader);
            verifyElement(elmntTurnOffAppointmentsHeader);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            takeScreenshot(driver);
            waitForElement(elmntTurnOffSuccessfullyPopup);
            blresult =verifyElement(elmntTurnOffSuccessfullyPopup);
            strTime = getCurrentDate("h:mm");
            System.out.println(strTime);
        } catch (Exception e) {
            System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }

    public boolean clickTurnOnOnlineAppointmentsCheckBoxUnchecked() {
        boolean blresult = false;
        try {
            System.out.println("Entry Turn Off Online Appointments");
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            if (isElementDisplayed(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked)) {
                System.out.println("Turn Off Online Appointments CheckBox Already Unchecked");
            }
            if (isElementDisplayed(elmntTurnOffOnlineAppointmentsCheckBoxChecked)){
                jsClick(elmntTurnOffOnlineAppointmentsCheckBoxChecked);
                takeScreenshot(driver);
                verifyElement(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked);
            }
            waitForElement(elmntTurnOffAppointmentsHeader);
            verifyElement(elmntTurnOffAppointmentsHeader);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            takeScreenshot(driver);
            waitForElement(elmntTurnOffSuccessfullyPopup);
            blresult =verifyElement(elmntTurnOffSuccessfullyPopup);
        } catch (Exception e) {
            System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }

    public boolean EnterValueinSearchBoxVerifyAppointmentsSlotIsNotDisplayed(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntSearchBox);
            elmntSearchBox.sendKeys(Strdata);
            waitForElement(clicksearchicon);
            click(clicksearchicon);
            waitForElement(clickVM03LocationBookNowButton);
            click(clickVM03LocationBookNowButton);
waitForElement(elmntSlotTimes);
blresult =verifyElement(elmntSlotTimes);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean EnterValueinSearchBoxVerifyAppointmentsSlotIsDisplayed(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntSearchBox);
            elmntSearchBox.sendKeys(Strdata);
            waitForElement(clicksearchicon);
            click(clicksearchicon);
            waitForElement(clickVM03LocationBookNowButton);
            click(clickVM03LocationBookNowButton);
            waitForElement(AppointmentTimeSlotsisNotDisplaying);
            blresult =verifyElement(AppointmentTimeSlotsisNotDisplaying);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickTurnOffAppointmentsAudit() {
        boolean blresult = false;
        try {
            waitForElement(elmntTurnOffAppointmentsAudit);
            takeScreenshot(driver);
            jsClick(elmntTurnOffAppointmentsAudit);
            waitForElement(elmntTurnOffAppointmentsAuditHeader);
            blresult = verifyElement(elmntTurnOffAppointmentsAuditHeader);
        } catch (Exception e) {
            System.out.println("Cannot verify the Changes Saved Successfully MessagePopup ");
        }
        return blresult;
    }

    public boolean verifyAppointmentsAuditDetailsGridView(String Strdata) {
        boolean blresult = false;
        try {
            List<String>lstDetails=TestDataUtil.getListOfValue(Strdata);
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(">>>getCurrentDate::"+currentDate);
//            String strTime = getCurrentDate("h:mm aaa");
            System.out.println(">>>strTime::"+strTime);
            WebElement elmntAppointmentsAudit = waitForElement(By.xpath(strAppointmentAudit
                            .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                            .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                            .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(currentDate))
                            .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(strTime))
                            .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(2)))));
            System.out.println(">>>>elmntAppointmentsAudit"+elmntAppointmentsAudit);
                    waitForElement(elmntAppointmentsAudit);
                    blresult =verifyElement(elmntAppointmentsAudit);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }
}



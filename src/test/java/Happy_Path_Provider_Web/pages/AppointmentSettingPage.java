package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cap.utilities.DateUtil.*;

public class AppointmentSettingPage extends BasePage {
    public AppointmentSettingPage(WebDriver driver) {
        super(driver);

    }

    public static String strTime;

    @FindBy(how = How.XPATH, using = "//div[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSetting;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Settings')]")
    protected WebElement elmntAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;
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

    @FindBy(how = How.XPATH, using = "(//td)[4]")
    protected WebElement getTextTurnOffAppointmentsAuditTime;

    protected String strAppointmentAudit = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following-sibling::td[text()='")
            .append("<<REPLACEMENT5>>").append("']").toString();

//td[text()='VM03Location']//following::td[contains(text(),'Tim')]//following::td[contains(text(),'04 Apr 2023')]//following::td[contains(text(),'07:48 AM')]//following-sibling::td[text()='Turned On']


    protected String strBlockAppoinmentdetails = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT5>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT6>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT7>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT8>>").append("')]//preceding::td[text()='")
            .append("<<REPLACEMENT9>>").append("']//following-sibling::td//p[contains(text(),'")
            .append("<<REPLACEMENT10>>").append("')]").toString();



    @FindBy(how = How.XPATH, using = "//span[text()=' Edit ']")
    protected WebElement elmntEditButton;

    @FindBy(how = How.XPATH, using = "(//td)[10]")
    protected WebElement elmntTabledata;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')] ")
    protected WebElement elmntBlockAppointment;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Appointment unblocked successfully')]")
    protected WebElement elmntAppointmentunblockedPopup;




    @FindBy(how = How.XPATH, using = "//p[text()='Online Appointment booking has been turned-on']")
    protected WebElement elmntTurnOnSuccessfullyPopup;

    @FindBy(how = How.XPATH, using = "//p[text()='Online Appointment booking has been turned-off']")
    protected WebElement elmntTurnOffSuccessfullyPopup;


    @FindBy(how = How.XPATH, using = "//input[@id='SearchText']")
    protected WebElement elmntSearchBox;

    @FindBy(how = How.XPATH, using = "//button[text()='SEARCH']")
    protected WebElement clicksearchicon;

    @FindBy(how = How.XPATH, using = "(//h2[text()='Automation_Practice1_Loc2']//following::a[text()='More info'])[1]")
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

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Changes Saved Successfully')]")
    protected WebElement txtSuccessfullyMessagePopup;

    @FindBy(how = How.XPATH, using = "//p[text()='Changes saved successfully.']")
    protected WebElement txtChangesSavedSuccessfullyMessagePopup;

    //p[text()='Changes Saved Successfully']

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname=\"minimumnoticeforcancellation\"]")
    protected WebElement elmntMinimumNoticeForCancellation;

    public boolean clickAppointmentMessage() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointments);
            waitForElement(elmntAppointments);
            click(elmntAppointments);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentSettingHeader);
            verifyElement(elmntAppointmentSettingHeader);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAppointmentSettingEditButton);
            waitForElementClickable(elmntAppointmentSettingEditButton);
            jsClick(elmntAppointmentSettingEditButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully see the Appointment Setting");
            blresult = verifyElement(txtAppointmentSettingHeader);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Appointment Message >>> :: ");
        }
        return blresult;
    }

    public boolean clickRuleAButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntRuleARadioButton);
            waitForElement(elmntRuleARadioButton);
//            takeScreenshot(driver);
            jsClick(elmntRuleARadioButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click RuleA Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
//            takeScreenshot(driver);
            waitForElement(txtSuccessfullyMessagePopup);
            blresult =verifyElement(txtSuccessfullyMessagePopup);
            System.out.println("Verify Changes saved successfully. Popup");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot Verify Changes saved successfully. Popup");

        }
        return blresult;
    }

    public boolean clickRuleBButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntRuleBRadioButton);
            waitForElement(elmntRuleBRadioButton);
//            takeScreenshot(driver);
            jsClick(elmntRuleBRadioButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click RuleB Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            jsClick(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {
            System.out.println("Failed to click RuleB Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickRuleCButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntRuleCRadioButton);
            waitForElement(elmntRuleCRadioButton);
//            takeScreenshot(driver);
            jsClick(elmntRuleCRadioButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click RuleC Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {
            System.out.println("Failed to click RuleC Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickRuleDButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntRuleDRadioButton);
            waitForElement(elmntRuleDRadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleDRadioButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click RuleD Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(txtSuccessfullyMessagePopup);
            blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {
            System.out.println("Failed to click RuleD Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickRuleEButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntRuleERadioButton);
            waitForElement(elmntRuleERadioButton);
            takeScreenshot(driver);
            jsClick(elmntRuleERadioButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click Rule E Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(txtAppointmentsettingsRuleEHeader);
            blresult = verifyElement(txtAppointmentsettingsRuleEHeader);
        } catch (Exception e) {
            System.out.println("Failed to click RuleE Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickAppointmentsettingsRuleESaveButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElementToAppear(driver,By.xpath("//p[contains(text(),'Changes saved successfully')]"));
            waitForElement(txtChangesSavedSuccessfullyMessagePopup);
            blresult = verifyElement(txtChangesSavedSuccessfullyMessagePopup);
        } catch (Exception e) {
            System.out.println("Failed to click Appointment settings RuleE Save Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntHealthCentre);
            click(elmntHealthCentre);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean selectRestrictProviderscheckbox(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            if (verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))))) {
                takeScreenshot(driver);
                System.out.println("Appointment Restrict Provider CheckBox Already checked");
                blresult = true;
            }
            if (!verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                waitForSeconds(3);
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
                WebElement elmntHealthCentreLocation2 = waitForElementClickable(By.xpath(deselectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation2"+ elmntHealthCentreLocation2);
                waitForElement(elmntHealthCentreLocation2);
                jsClick(elmntHealthCentreLocation2);
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
                verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
                takeScreenshot(driver);
                System.out.println("Appointment  Restrict Provider CheckBox Checked::");
                blresult = true;
            }
            blresult = true;
        }
        catch (Exception e) {

            System.out.println("Failed To clicked Appointment Restrict Provider CheckBox");
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
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
                verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));

                System.out.println("Appointment  Restrict Provider CheckBox UnChecked::");
                blresult = true;
            }
            blresult = true;
        }
        catch (Exception e) {

            System.out.println("Failed To clicked Appointment Restrict Provider CheckBox");
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click Visit Appointment Icon");
            blresult = verifyElement(elmntVisitAppointmentIcon);
        } catch (Exception e) {
            System.out.println("Failed to click Visit Icon Check Restricted Provider are Not displayed >>> :: ");
            e.printStackTrace();
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
            System.out.println("Failed to click Phone Icon Check Restricted Provider are Not displayed >>> :: ");
            e.printStackTrace();
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
            System.out.println("Failed to click Video Icon Check Restricted Provider are Not displayed >>> :: ");
            e.printStackTrace();
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAllowToBookFriendsYesButton);
            waitForElement(elmntAllowToBookFriendsYesButton);
            takeScreenshot(driver);
            jsClick(elmntAllowToBookFriendsYesButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click Allow To Book Friends Yes Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            takeScreenshot(driver);
            blresult =true;

        } catch (Exception e) {
            System.out.println("Failed to click Allow to Book For Family Yes Button >>> :: ");
            e.printStackTrace();
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAllowToBookFriendsNoButton);
            waitForElement(elmntAllowToBookFriendsNoButton);
            takeScreenshot(driver);
            jsClick(elmntAllowToBookFriendsNoButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully Click Allow To Book Friends Yes Radio Button");
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            takeScreenshot(driver);
            blresult =true;

        } catch (Exception e) {
            System.out.println("Failed to click Allow to Book For Family No Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickTurnoffAppointments() {
        boolean blresult = false;
        try {
            waitForElement(elmntTurnOffAppointments);
            takeScreenshot(driver);
            jsClick(elmntTurnOffAppointments);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntTurnOffAppointmentsHeader);
            blresult = verifyElement(elmntTurnOffAppointmentsHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Turn off Appointments >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }



    public boolean clickTurnOffOnlineAppointmentsCheckBoxchecked() {
        boolean blresult = false;
        try {
            waitForElement(elmntEditButton);
             click(elmntEditButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
           if (isElementDisplayed(elmntTurnOffOnlineAppointmentsCheckBoxChecked)) {
               System.out.println("Turn Off Online Appointments CheckBox Already checked");
           }
           if (isElementDisplayed(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked)){
               jsClick(elmntTurnOnOnlineAppointmentsCheckBoxUnchecked);
               waitForElementDisappear(driver,By.xpath(elmntSpinner));
               takeScreenshot(driver);
               verifyElement(elmntTurnOffOnlineAppointmentsCheckBoxChecked);
           }
            waitForElement(elmntTurnOffAppointmentsHeader);
            verifyElement(elmntTurnOffAppointmentsHeader);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            takeScreenshot(driver);
            waitForElement(elmntTurnOffSuccessfullyPopup);
            blresult =verifyElement(elmntTurnOffSuccessfullyPopup);
            strTime = getCurrentDate("h:mm");
            System.out.println(">>>>>strTime"+strTime);
        } catch (Exception e) {
            System.out.println("Failed to click Turn Off Online Appointments Check Box checked >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickTurnOnOnlineAppointmentsCheckBoxchecked() {
        boolean blresult = false;
        try {
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            takeScreenshot(driver);
            waitForElement(elmntTurnOnSuccessfullyPopup);
            blresult =verifyElement(elmntTurnOnSuccessfullyPopup);
            strTime = getCurrentDate("h:mm");
            System.out.println(">>>>>strTime"+strTime);
        } catch (Exception e) {
            System.out.println("Failed to click Turn On Online Appointments Check Box checked>>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickTurnOnOnlineAppointmentsCheckBoxUnchecked() {
        boolean blresult = false;
        try {
            System.out.println("Entry Turn Off Online Appointments");
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            takeScreenshot(driver);
            waitForElement(elmntTurnOnSuccessfullyPopup);
            blresult =verifyElement(elmntTurnOnSuccessfullyPopup);
        } catch (Exception e) {
            System.out.println("Failed to click Turn On Online Appointments Check Box Unchecked>>> :: ");
            e.printStackTrace();
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(clickVM03LocationBookNowButton);
            click(clickVM03LocationBookNowButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntSlotTimes);
            blresult =verifyElement(elmntSlotTimes);
        } catch (Exception e) {
            System.out.println("Failed to Enter Value in Search Box Verify Appointments Slot Is Not Displayed>>> :: ");
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
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntTurnOffAppointmentsAuditHeader);
            blresult = verifyElement(elmntTurnOffAppointmentsAuditHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Turn Off Appointments Audit >>> :: ");
            e.printStackTrace();
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
            String time=getTextTurnOffAppointmentsAuditTime.getText();
            System.out.println(">>>GetTexttime::"+time);
            WebElement elmntAppointmentsAudit = waitForElement(By.xpath(strAppointmentAudit
                            .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                            .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                            .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(currentDate))
                            .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(time))
                            .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(2)))));
            System.out.println(">>>>elmntAppointmentsAudit"+elmntAppointmentsAudit);
                    waitForElement(elmntAppointmentsAudit);
                    blresult =verifyElement(elmntAppointmentsAudit);
        } catch (Exception e) {
            System.out.println("Failed to verify Appointments Audit Details Grid View >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean verifyTurnOnAppointmentsAuditDetailsGridView(String Strdata) {
        boolean blresult = false;
        try {
            List<String>lstDetails=TestDataUtil.getListOfValue(Strdata);
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(">>>getCurrentDate::"+currentDate);
//            String strTime = getCurrentDate("h:mm aaa");
            System.out.println(">>>strTime::"+strTime);
            String time=getTextTurnOffAppointmentsAuditTime.getText();
            System.out.println(">>>GetTexttime::"+time);
            WebElement elmntAppointmentsAudit = waitForElement(By.xpath(strAppointmentAudit
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(time))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(3)))));
            System.out.println(">>>>elmntAppointmentsAudit"+elmntAppointmentsAudit);
            waitForElement(elmntAppointmentsAudit);
            blresult =verifyElement(elmntAppointmentsAudit);
        } catch (Exception e) {
            System.out.println("Failed to verify Turn On Appointments Audit Details Grid View >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean VerifyBlockAppointmentTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>lstDetails"+lstDetails);
            String AfterThreeDaysDate = getDate("AFTER_THREE_DAYS","dd MMM yyyy");
            String AfterFourDaysDate = getDate("AFTER_FOUR_DAYS","dd MMM yyyy");
            System.out.println(strTime);
            String currentDate = getCurrentDate("dd MMM yyyy");
            String time=elmntTabledata.getText();
            WebElement elmntBlockAppointmentTableData = waitForElement(By.xpath(strBlockAppoinmentdetails
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(AfterThreeDaysDate))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(AfterFourDaysDate))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT6>>", TestDataUtil.getValue(lstDetails.get(5)))
                    .replace("<<REPLACEMENT7>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT8>>", TestDataUtil.getValue(time))
                    .replace("<<REPLACEMENT9>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT10>>", TestDataUtil.getValue(lstDetails.get(4)))));
            System.out.println(">>>>>>>>>>>>elmntBlockAppointmentTableData"+elmntBlockAppointmentTableData);
            waitForElement(elmntBlockAppointmentTableData);
            verifyElement(elmntBlockAppointmentTableData);
            click(elmntBlockAppointmentTableData);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
           waitForElement(elmntBlockAppointment);
           click(elmntBlockAppointment);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
           waitForElement(elmntAppointmentunblockedPopup);
            blResult =verifyElement(elmntAppointmentunblockedPopup);
        } catch (Exception e) {
            System.out.println("Failed to Verify Block Appointment Table Data >>> :: ");
            e.printStackTrace();

        }

        return blResult;
    }

    public boolean clickMinimumNoticeForCancellation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntMinimumNoticeForCancellation);
            click(elmntMinimumNoticeForCancellation);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntMinimumNoticeForCancellation);
        } catch (Exception e) {
            System.out.println("Failed to click Minimum Notice For Cancellation >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickSaveButton() {
        boolean blresult = false;
        try {
    jsScrollIntoView(elmntSaveButton);
    waitForElement(elmntSaveButton);
    click(elmntSaveButton);
    waitForElementDisappear(driver,By.xpath(elmntSpinner));
    waitForElement(txtSuccessfullyMessagePopup);
    blresult = verifyElement(txtSuccessfullyMessagePopup);
        } catch (Exception e) {
            System.out.println("Failed to click Save Button >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }
}



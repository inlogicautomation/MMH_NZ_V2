package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppointmentRemainderSettingsPage extends BasePage {

    public AppointmentRemainderSettingsPage(WebDriver driver) {
        super(driver);
    }

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";
    @FindBy(how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Settings')]")
    protected WebElement elmntAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Appointment Reminder Settings')]")
    protected WebElement elmntAppointmentReminderSetting;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Reminder Settings')]")
    protected WebElement elmntAppointmentReminderSettingPageHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntEditButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' Save')]")
    protected WebElement elmntSaveButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc1')]")
    protected WebElement elmntHealthCenterDropDown;

    protected String elmntSelectNumberDropDown = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent mat-checkbox-checked ng-untouched ng-pristine ng-valid']")
    protected WebElement elmntFirstAppoinmentReminderCheckEnabled;


    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']")
    protected WebElement elmntFirstAppoinmentReminderCheckDisbled;

    @FindBy(how = How.XPATH, using = "(//mat-select[@ng-reflect-placeholder='Select'])[1]")
    protected WebElement elmntNumberDropDown;

    @FindBy(how = How.XPATH, using = "(//mat-select[@ng-reflect-placeholder='Select'])[2]")
    protected WebElement elmntHoursDropDown;

    protected String elmntSelectDaysDropDown = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectHoursDropDown = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelect2HoursDropDown = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmntSelectRemiderTime = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[1]")
    protected WebElement elmntFirstAppoinmentReminderEmailCheckEnabled;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']")
    protected WebElement elmntFirstAppoinmentReminderEmailCheckDisabled;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Appointment reminder settings is saved successfully')]")
    protected WebElement elmntAppointmentReminderSettingSavedPopUp;

    @FindBy(how = How.XPATH, using = "(//mat-select[@ng-reflect-placeholder='Select'])[5]")
    protected WebElement elmntReminderTimeDropDown;

    @FindBy(how = How.XPATH, using = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[2]")
    protected WebElement elmntSecondAppoinmentReminderCheckEnabled;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid']//input")
    protected WebElement elmntSecondAppoinmentReminderCheckDisbled;

    @FindBy(how = How.XPATH, using = "(//mat-select[@ng-reflect-placeholder='Select'])[3]")
    protected WebElement elmntSecondNumberDropDown;

    @FindBy(how = How.XPATH, using = "(//mat-select[@ng-reflect-placeholder='Select'])[4]")
    protected WebElement elmntSecondHoursDropDown;

    @FindBy(how = How.XPATH, using = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[2]")
    protected WebElement elmntSecondAppoinmentReminderEmailCheckEnabled;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent ng-valid mat-checkbox-checked ng-dirty ng-touched']")
    protected WebElement elmntSkipWeekEndsCheckBoxEnabled;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid']//input")
    protected WebElement elmntSkipWeekEndsCheckBoxDisabled;



    public boolean clickAppointmentReminderSettingPage() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointments);
            waitForElement(elmntAppointments);
            click(elmntAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentSettingHeader);
            verifyElement(elmntAppointmentSettingHeader);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAppointmentReminderSetting);
            waitForElementClickable(elmntAppointmentReminderSetting);
            jsClick(elmntAppointmentReminderSetting);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
        waitForElement(elmntAppointmentReminderSettingPageHeader);
            blresult = verifyElement(elmntAppointmentReminderSettingPageHeader);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Appointment Message >>> :: ");
        }
        return blresult;
    }

    public boolean clickEditButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEditButton);
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
             waitForElement(elmntSaveButton);
            blresult = verifyElement(elmntSaveButton);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Appointment Reminder Edit Button >>> :: ");
        }
        return blresult;
    }

    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntHealthCenterDropDown);
            jsClick(elmntHealthCenterDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult =verifyElement(elmntHealthCenterDropDown);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }


    public boolean verifyFirstAppointmentReminderCheckBoxEnabled() {
        boolean blresult = false;
        try {
           waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
           if (verifyElement(elmntFirstAppoinmentReminderCheckEnabled)){
               System.out.println("Already Enabled First Appointment Reminder Check Box ");
               blresult=verifyElement(elmntFirstAppoinmentReminderCheckEnabled);

           }else {
              waitForElement(elmntFirstAppoinmentReminderCheckDisbled);
              verifyElement(elmntFirstAppoinmentReminderCheckDisbled);
              jsClick(elmntFirstAppoinmentReminderCheckDisbled);
              waitForElement(elmntFirstAppoinmentReminderCheckEnabled);
               blresult=verifyElement(elmntFirstAppoinmentReminderCheckEnabled);
           }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to clickFirst Appointment Reminder Check Box >>> :: ");
        }
        return blresult;
    }

    public boolean SelectNumberFirstAppointmentReminder(String StrNumber) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntNumberDropDown);
            click(elmntNumberDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectNumberDropDown.replace("<<REPLACEMENT>>", StrNumber)));
            waitForSeconds(2);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntNumberDropDown);
        } catch (Exception e) {
            System.out.println("Failed to clickFirst Appointment Reminder Number >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectHoursFirstAppointmentReminder(String StrHours) {
        boolean blresult = false;
        try {
            waitForElement(elmntHoursDropDown);
            click(elmntHoursDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectHoursDropDown.replace("<<REPLACEMENT>>", StrHours)));
            waitForSeconds(2);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHoursDropDown);
        } catch (Exception e) {
            System.out.println("Failed to clickFirst Appointment Reminder Hours >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectHoursSecondAppointmentReminder(String StrHours) {
        boolean blresult = false;
        try {
            waitForElement(elmntSecondHoursDropDown);
            click(elmntSecondHoursDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectHoursDropDown.replace("<<REPLACEMENT>>", StrHours)));
            waitForSeconds(2);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHoursDropDown);
        } catch (Exception e) {
            System.out.println("Failed to clickFirst Appointment Reminder Hours >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean verifyFirstAppointmentReminderEmailCheckBoxEnabled() {
        boolean blresult = false;
        try {
            waitForSeconds(2);
            if (verifyElement(elmntFirstAppoinmentReminderEmailCheckEnabled)){
                System.out.println("Already Enabled First Appointment Reminder Email Check Box ");
                blresult=verifyElement(elmntFirstAppoinmentReminderEmailCheckEnabled);
            }else {
                waitForElement(elmntFirstAppoinmentReminderEmailCheckDisabled);
                verifyElement(elmntFirstAppoinmentReminderEmailCheckDisabled);
                jsClick(elmntFirstAppoinmentReminderEmailCheckDisabled);
                waitForElement(elmntFirstAppoinmentReminderEmailCheckEnabled);
                blresult=verifyElement(elmntFirstAppoinmentReminderEmailCheckEnabled);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click First Appointment Reminder Email Check Box >>> :: ");
        }
        return blresult;
    }


    public boolean clickSaveButton() {
        boolean blresult1 = false;
        boolean blresult2 = false;

        try {
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentReminderSettingSavedPopUp);
            blresult1 =  verifyElement(elmntAppointmentReminderSettingSavedPopUp);
            waitForElement(elmntEditButton);
            blresult2 = verifyElement(elmntEditButton);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Appointment Reminder Save Button  >>> :: ");
        }
        return blresult1 && blresult2;
    }

    public boolean SelectDaysFirstAppointmentReminder(String StrHours) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(elmntHoursDropDown);
            click(elmntHoursDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectDaysDropDown.replace("<<REPLACEMENT>>", StrHours)));
            waitForSeconds(2);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHoursDropDown);
        } catch (Exception e) {
            System.out.println("Failed to clickFirst Appointment Reminder Hours >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectReminderTime(String StrHours) {
        boolean blresult = false;
        try {
            waitForElement(elmntReminderTimeDropDown);
            click(elmntReminderTimeDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectRemiderTime.replace("<<REPLACEMENT>>", StrHours)));
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntReminderTimeDropDown);
        } catch (Exception e) {
            System.out.println("Failed to click Reminder Time DropDown >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean verifySecondAppoinmentReminderCheckBoxEnabled() {
        boolean blresult = false;
        try {

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (verifyElement(elmntSecondAppoinmentReminderCheckEnabled)){
                System.out.println("Already Enabled Second Appointment Reminder Check Box ");
                blresult=verifyElement(elmntSecondAppoinmentReminderCheckEnabled);

            }else {
                waitForElement(elmntSecondAppoinmentReminderCheckDisbled);
                verifyElement(elmntSecondAppoinmentReminderCheckDisbled);
                jsClick(elmntSecondAppoinmentReminderCheckDisbled);
               blresult=true;

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to clickFirst Appointment Reminder Check Box >>> :: ");
        }
        return blresult;
    }

    public boolean SelectNumberSecondAppointmentReminder(String StrNumber) {
        boolean blresult = false;
        try {
            waitForElement(elmntSecondNumberDropDown);
            click(elmntSecondNumberDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectNumberDropDown.replace("<<REPLACEMENT>>", StrNumber)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to click Second Appointment Reminder Number >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectHoursSecondAppoinmentReminder(String StrHours) {
        boolean blresult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntSecondHoursDropDown);
            jsClick(elmntSecondHoursDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelect2HoursDropDown.replace("<<REPLACEMENT>>", StrHours)));
            System.out.println(">>>>>>>>>"+elmntEntriesFromHealthCentre);
            waitForSeconds(2);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult =true;
        } catch (Exception e) {
            System.out.println("Failed to click Second Appointment Reminder Hours >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectDaysSecondAppointmentReminder(String StrHours) {
        boolean blresult = false;
        try {
            waitForElement(elmntSecondHoursDropDown);
            click(elmntSecondHoursDropDown);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectHoursDropDown.replace("<<REPLACEMENT>>", StrHours)));
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHoursDropDown);
        } catch (Exception e) {
            System.out.println("Failed to clickFirst Appointment Reminder Hours >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean verifySecondAppointmentReminderEmailCheckBoxEnabled() {
        boolean blresult = false;
        try {
            if (isElementDisplayed(elmntSecondAppoinmentReminderEmailCheckEnabled)){
                System.out.println("Already Enabled First Appointment Reminder Check Box ");
                blresult=verifyElement(elmntFirstAppoinmentReminderEmailCheckEnabled);
            }else {
                waitForElement(elmntFirstAppoinmentReminderEmailCheckDisabled);
                verifyElement(elmntFirstAppoinmentReminderEmailCheckDisabled);
                jsClick(elmntFirstAppoinmentReminderEmailCheckDisabled);
                waitForElement(elmntSecondAppoinmentReminderEmailCheckEnabled);
                blresult=verifyElement(elmntSecondAppoinmentReminderEmailCheckEnabled);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click First Appointment Reminder Email Check Box >>> :: ");
        }
        return blresult;
    }

    public boolean verifySkipWeekendsCheckBoxEnabled() {
        boolean blresult = false;
        try {
            if (verifyElement(elmntSkipWeekEndsCheckBoxEnabled)){
                System.out.println("Already Enabled Skip WeekEnds CheckBox ");
                blresult=verifyElement(elmntSkipWeekEndsCheckBoxEnabled);
            }else {
                waitForElement(elmntSkipWeekEndsCheckBoxDisabled);
                verifyElement(elmntSkipWeekEndsCheckBoxDisabled);
                jsClick(elmntSkipWeekEndsCheckBoxDisabled);
                waitForElement(elmntSkipWeekEndsCheckBoxEnabled);
                blresult=verifyElement(elmntSkipWeekEndsCheckBoxEnabled);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Skip Weekends  Check Box >>> :: ");
        }
        return blresult;
    }

    public boolean verifySkipWeekendsCheckBoxDisabled() {
        boolean blresult = false;
        try {
            if (isElementDisplayed(elmntSkipWeekEndsCheckBoxDisabled)){
                System.out.println("Already Disabled First Appointment Reminder Check Box ");
                blresult=verifyElement(elmntSkipWeekEndsCheckBoxDisabled);
            }else {
                waitForElement(elmntSkipWeekEndsCheckBoxEnabled);
                verifyElement(elmntSkipWeekEndsCheckBoxEnabled);
                jsClick(elmntSkipWeekEndsCheckBoxEnabled);
                waitForElement(elmntSkipWeekEndsCheckBoxDisabled);
                blresult=verifyElement(elmntSkipWeekEndsCheckBoxDisabled);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Skip Weekends Check Box >>> :: ");
        }
        return blresult;
    }
}

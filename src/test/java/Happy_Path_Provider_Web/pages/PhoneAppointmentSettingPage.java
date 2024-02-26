package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PhoneAppointmentSettingPage extends BasePage {

    public PhoneAppointmentSettingPage(WebDriver driver) {
        super(driver);
    }

//        @FindAll({
//            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"), //Desktop View
//            @FindBy(how = How.XPATH, using = " //h1[contains(text(),'Welcome,')]//span[contains(text(),'Steve!')]"),
//    })
//    protected WebElement txtWelcome;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Gp2White')]")
    })
    protected WebElement txtProviderPortalWelcomePage;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;
    @FindBy(xpath = "//span[contains(text(),'Appointment Settings')]")
    protected WebElement elmtAppointmentSettings;
    @FindBy(xpath = "(//span[contains(text(),'Appointments')])[2]")
    protected WebElement elmtAppointments;
    @FindBy (how = How.XPATH, using = "//span[text()='Systems Menu']")
    protected WebElement elmntSystemMenu;
    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]/following::mat-icon[contains(@class,'mat-icon notranslate dd')]")
    protected WebElement elmtSystemsMenu;
    @FindBy(how = How.XPATH, using = "//div[text()='Phone Appointment Settings']")
    protected WebElement elmntPhoneAppointmentSetting;
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Phone Appointment Settings')]")
    protected WebElement elmntPhoneAppointmentSettingHeader;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntPhoneAppointmentSettingEditButton;
    @FindBy(how = How.XPATH, using = "//mat-select[@role='combobox']")
    protected WebElement elmntPhoneAppointmentSettingHealthcentre;
    protected String elmntPhoneAppoinmentHealthCentre = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc1')]//preceding::input[@aria-checked='true']")
    protected WebElement elmntPhoneAppointmentVM03Location;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc1')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyPhoneAppointmentVM03Location;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//preceding::input[@aria-checked='true'])[2]")
    protected WebElement elmntPhoneAppointmentVM03Location2;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc2')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyPhoneAppointmentVM03Location2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::input[@name='rules0'])[1]")
    protected WebElement clickVM03LocationRule1;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::input[@name='rules0'])[2]")
    protected WebElement clickVM03LocationRule2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::input[@name='rules1'])[1]")
    protected WebElement clickVM03Location2Rule1;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::input[@name='rules1'])[1]")
    protected WebElement clickVM03Location2Rule2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::textarea)[1]")
    protected WebElement EnterVM03LocationTextValue;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::textarea)[1]")
    protected WebElement EnterVM03Location2TextValue;
    @FindBy(how = How.XPATH, using = " //span[contains(text(),'Save')] ")
    protected WebElement ClickSaveButton;
    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Practice')]//preceding::input[@name='phnecallInitiation0'])[1]")
    protected WebElement clickVM03LocationPraticeRadioButton;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Practice')]//preceding::input[@name='phnecallInitiation1'])[1]")
    protected WebElement clickVM03Location2PraticeRadioButton;

    @FindBy(how = How.XPATH, using = " (//div[contains(text(),'Patient')]//preceding::input[@name='phnecallInitiation0'])[2]")
    protected WebElement clickVM03LocationPatientRadioButton;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Patient')]//preceding::input[@name='phnecallInitiation1'])[2]")
    protected WebElement clickVM03Location2PatientRadioButton;

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSecureMessaging;

    @FindBy(xpath = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmtRepeatScriptSettings;

    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{

            if (isElementDisplayed(txtProviderPortalWelcomePage)) {
                verifyElement(txtProviderPortalWelcomePage);
                waitForSeconds(3);
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForSeconds(3);
                blResult = verifyElement(txtProviderPortalWelcomePage);
            }
            if (!isElementDisplayed(txtProviderPortalWelcomePage)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                System.out.println("Successfully click Logo");
                waitForSeconds(3);
                blResult=verifyElement(txtProviderPortalWelcomePage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSecureMessaging() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSecureMessaging);
            waitForSeconds(2);
            waitForElementClickable(elmtSecureMessaging);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSecureMessaging);
            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            takeScreenshot(driver);
            if (!verifyElement(elmtRepeatScriptSettings)){
                click(elmtSecureMessaging);
            }
            jsScrollIntoView(elmtRepeatScriptSettings);
            blResult = verifyElement(elmtRepeatScriptSettings);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickSystemMenu() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenu);
            waitForSeconds(2);
            waitForElementClickable(elmtSystemsMenu);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSystemsMenu);
//            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            if (!verifyElement(elmtAppointmentSettings)){
                click(elmntSystemMenu);
            }
            jsScrollIntoView(elmtAppointmentSettings);
            blResult = verifyElement(elmtAppointmentSettings);
        } catch (Exception e) {
            System.out.println("Failed to click System Menu >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean clickPhoneAppointmentSetting() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmtAppointments);
            waitForElement(elmtAppointments);
            click(elmtAppointments);
            jsScrollIntoView(elmntPhoneAppointmentSetting);
            waitForElement(elmntPhoneAppointmentSetting);
            click(elmntPhoneAppointmentSetting);
            waitForElement(elmntPhoneAppointmentSettingHeader);
            verifyElement(elmntPhoneAppointmentSettingHeader);
            jsScrollIntoView(elmntPhoneAppointmentSettingEditButton);
            waitForElementClickable(elmntPhoneAppointmentSettingEditButton);
            jsClick(elmntPhoneAppointmentSettingEditButton);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            System.out.println("Successfull see the Appointment Setting");
            waitForElement(elmntPhoneAppointmentSettingHeader);
            blresult = verifyElement(elmntPhoneAppointmentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickPhoneAppointmentSettingHealthCenter(List<String> Strdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntPhoneAppointmentSettingHealthcentre);
            jsClick(elmntPhoneAppointmentSettingHealthcentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntPhoneAppoinmentHealthCentre.replace("<<REPLACEMENT>>",TestDataUtil.getValue(Strdata.get(0)))));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntPhoneAppointmentSettingHealthcentre);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickPhoneAppointmentSettingVM03Locationcheckbox() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
         if(verifyElement(elmntPhoneAppointmentVM03Location)){
             System.out.println("AlreadyCheck box checked");
             blresult=true;
         }
         if(!verifyElement(elmntPhoneAppointmentVM03Location)){
             waitForElement(verifyPhoneAppointmentVM03Location);
             jsClick(verifyPhoneAppointmentVM03Location);
             verifyElement(elmntPhoneAppointmentVM03Location);
             blresult=true;
         }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }


    public boolean clickPhoneAppointmentSettingVM03Location2checkbox() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if(verifyElement(elmntPhoneAppointmentVM03Location2)){
                System.out.println("AlreadyCheck box checked");
                blresult=true;
            }
            if(!verifyElement(elmntPhoneAppointmentVM03Location2)){
                waitForElement(verifyPhoneAppointmentVM03Location2);
                jsClick(verifyPhoneAppointmentVM03Location2);
                verifyElement(elmntPhoneAppointmentVM03Location2);
                blresult=true;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickVM03LocationRule1RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(clickVM03LocationRule1);
            jsClick(clickVM03LocationRule1);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickVM03LocationRule2RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(clickVM03LocationRule2);
            mouseClick(clickVM03LocationRule2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03LocationRule2);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean clickVM03Location2Rule1RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickVM03Location2Rule1);
            jsClick(clickVM03Location2Rule1);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03Location2Rule1);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03Location2Rule2RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickVM03Location2Rule2);
            jsClick(clickVM03Location2Rule2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03Location2Rule2);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickVM03LocationPraticeRadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickVM03LocationPraticeRadioButton);
            jsClick(clickVM03LocationPraticeRadioButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03LocationPraticeRadioButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }


    public boolean EnterVM03Locationtextbox(String textboxdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(EnterVM03LocationTextValue);
            enterValue(EnterVM03LocationTextValue, textboxdata);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean EnterVM03Location2textbox(String textboxdata) {
        boolean blresult = false;
        try {
            jsScrollIntoView(EnterVM03Location2TextValue);
            waitForElement(EnterVM03Location2TextValue);
enterValue(EnterVM03Location2TextValue,textboxdata);

            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickSaveButton() {
        boolean blresult = false;
        try {
            waitForElement(ClickSaveButton);
            jsClick(ClickSaveButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickVM03Location2PraticeRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVM03Location2PraticeRadioButton);
            jsClick(clickVM03Location2PraticeRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03LocationPatientRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVM03LocationPatientRadioButton);
            jsClick(clickVM03LocationPatientRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03Location2PatientRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVM03Location2PatientRadioButton);
            jsClick(clickVM03Location2PatientRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }



}

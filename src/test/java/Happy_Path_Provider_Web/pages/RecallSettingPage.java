package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RecallSettingPage extends BasePage {
    public RecallSettingPage(WebDriver driver) {
        super(driver);
    }

//    @FindAll({
//            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"), //Desktop View
//            @FindBy(how = How.XPATH, using = " //h1[contains(text(),'Welcome,')]//span[contains(text(),'Steve!')]"),
//    })
//    protected WebElement txtWelcome;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Dr. Gp2White!')]")
    })
    protected WebElement txtProviderPortalWelcomePage;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSecureMessaging;

    @FindBy(xpath = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmtRepeatScriptSettings;
    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]/following::mat-icon[contains(@class,'mat-icon notranslate dd')]")
    protected WebElement elmtSystemsMenu;

    @FindBy(xpath = "//span[contains(text(),'Appointment Settings')]")
    protected WebElement elmtAppointmentSettings;

    @FindBy (how = How.XPATH, using = "//span[text()='Systems Menu']")
    protected WebElement elmntSystemMenu;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'Recalls')]")
    protected WebElement elmntRecallSetting;

    @FindBy (how = How.XPATH, using = "//h1[contains(text(),'Recall Settings')]")
    protected WebElement elmntRecallSettingPageHeader;

    @FindBy (how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enablecallremainders']//input)[1]")
    protected WebElement elmntRecallReminderYesRadioButton;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntHealthCentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='sendcallremainders']")
    protected WebElement elmntRecallReminderTextbox;

    @FindBy (how = How.XPATH, using = " //span[contains(text(),'Save')] ")
    protected WebElement clickSaveButton;

    @FindBy (how = How.XPATH, using = "//p[contains(text(),'Recall Settings Updated successfully')]")
    protected WebElement Verifysavedsuccessfullypopup;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),' Edit ')]")
    protected WebElement clickEditButton;

    @FindBy (how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enablecallremainders']//input)[2]")
    protected WebElement elmntRecallReminderNoRadioButton;


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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

    public boolean clickRecallSetting() {
        boolean blresult = false;
        try {jsScrollIntoView(elmntRecallSetting);
            waitForElement(elmntRecallSetting);
            click(elmntRecallSetting);
             waitForElement(elmntRecallSettingPageHeader);
            blresult =verifyElement(elmntRecallSettingPageHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRecallRemindersYesRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(elmntRecallReminderYesRadioButton);
            click(elmntRecallReminderYesRadioButton);
            waitForElement(elmntRecallSettingPageHeader);
            blresult =verifyElement(elmntRecallSettingPageHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean EnterRecallReminderValue(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntRecallReminderTextbox);
          enterValue(elmntRecallReminderTextbox,Strdata);
          blresult = verifyElement(elmntRecallReminderTextbox);
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
    public boolean clickSaveButton() {
        boolean blresult = false;
        try {
            waitForElement(clickSaveButton);
            click(clickSaveButton);
            waitForElement(Verifysavedsuccessfullypopup);
            blresult =verifyElement(Verifysavedsuccessfullypopup);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickEditButton() {
        boolean blresult = false;
        try {
            waitForElement(clickEditButton);
            jsClick(clickEditButton);
            waitForElement(clickSaveButton);
            blresult =verifyElement(clickSaveButton);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRecallRemindersNoRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(elmntRecallReminderNoRadioButton);
            click(elmntRecallReminderNoRadioButton);
            waitForElement(elmntRecallSettingPageHeader);
            blresult =verifyElement(elmntRecallSettingPageHeader);
        } catch (Exception e) {

        }
        return blresult;
    }


}

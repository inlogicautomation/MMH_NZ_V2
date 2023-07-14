package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnlinePaymentSettingsPage extends BasePage {
    public OnlinePaymentSettingsPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Payments')])[2]")
    protected WebElement elmntPayments;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Online Payment Settings')]")
    protected WebElement elmntOnlinePaymentSetting;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Online Payment Settings')]")
    protected WebElement elmntOnlinePaymentSettingHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntEditButton;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement clickHealthCentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSecureMessaging;

    @FindBy(xpath = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmtRepeatScriptSettings;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Appointments')]//following::input)[1]")
    protected WebElement elmntEnableOnlinePaymentsForAppointments;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Appointments')]//following::input)[2]")
    protected WebElement elmntEnableNoOnlinePaymentsForAppointments;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Request Repeat Prescriptions')]//following::input)[1]")
    protected WebElement elmntEnableOnlinePaymentsForRRP;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Request Repeat Prescriptions')]//following::input)[2]")
    protected WebElement elmntDisableOnlinePaymentsForRRP;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')] ")
    protected WebElement elmntSaveButton;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Changes saved successfully')]")
    protected WebElement veriflyPopup;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Appointment Settings')]")
    protected WebElement elmntAppointmentSetting;



    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Appointments')])[2]")
    protected WebElement elmntAppointments;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Appointment Settings')])[1]")
    protected WebElement clickAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Appointment Settings')]")
    protected WebElement elmntAppointmentSettingHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay at Health Centre Only')]")
    protected WebElement verifyPayAtHealthCentreonly;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay Online Only ')]")
    protected WebElement verifyPayOnlineonly;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay at Health Centre or Pay Online')]")
    protected WebElement verifyPayatHealthCentreorPayOnline;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentMode']//input)[3]")
    protected WebElement verifyInPersonAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentMode']//input)[3]")
    protected WebElement verifyInPersonAppointmentsCheckboxUnchecked;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentModePhone']//input)[3]")
    protected WebElement verifyPhoneAppointmentsCheckboxUnchecked;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentModePhone']//input)[3]")
    protected WebElement verifyPhoneAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentModeVideo']//input)[3]")
    protected WebElement verifyVideoAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='paymentModeVideo']//input)[3]")
    protected WebElement verifyVideoAppointmentsCheckboxUnchecked;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Repeat Script Settings')]")
    protected WebElement elmntRepeatScriptSetting;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmntRepeatPrescription;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Repeat Script Settings')]")
    protected WebElement clickRepeatScriptSettingHeader;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Repeat Script Settings')]")
    protected WebElement elmntRepeatScriptSettingHeader;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay at Health Centre Only')]")
    protected WebElement elmntRRPPayAtHealthCentreOnly;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay Online Only')]")
    protected WebElement elmntRRPPayOnlineOnly;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Pay at Health Centre or Pay Online')]")
    protected WebElement elmntRRPPayatHealthCentreorPayOnline;

    //div[contains(text(),'Pay Online Only')]


    public boolean clickPaymentSetting() {
        boolean blresult = false;
        try {
            waitForElement(elmntPayments);
            jsClick(elmntPayments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
          waitForElement(elmntOnlinePaymentSetting);
          jsClick(elmntOnlinePaymentSetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
          waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickEditButton() {
        boolean blresult = false;
        try {
jsScrollIntoView(elmntEditButton);
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            jsScrollIntoView(clickHealthCentre);
            waitForElement(clickHealthCentre);
            click(clickHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean EnableOnlinePaymentsforAppointments() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEnableOnlinePaymentsForAppointments);
            waitForElement(elmntEnableOnlinePaymentsForAppointments);
            jsClick(elmntEnableOnlinePaymentsForAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean EnableNoOnlinePaymentsforAppointments() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEnableNoOnlinePaymentsForAppointments);
            waitForElement(elmntEnableNoOnlinePaymentsForAppointments);
            jsClick(elmntEnableNoOnlinePaymentsForAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }


    public boolean ClickSaveButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntSaveButton);
            waitForElement(elmntSaveButton);
            click(elmntSaveButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(veriflyPopup);
            blresult = verifyElement(veriflyPopup);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickAppointmentSetting() {
        boolean blresult = false;
        try {
            waitForElement(elmntAppointments);
            click(elmntAppointments);
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickAppointmentSettingHeader);
            click(clickAppointmentSettingHeader);
            waitForElement(elmntAppointmentSettingHeader);
            blresult = verifyElement(elmntAppointmentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickAppoitmentSettingEditButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntEditButton);
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            waitForElement(elmntAppointmentSettingHeader);
            blresult = verifyElement(elmntAppointmentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean veriflyInpersonAppoitmentPaymentSettings() {
        boolean blresult = false;
        try {
            if (verifyElement(verifyInPersonAppointmentsCheckbox)){
                jsClick(verifyInPersonAppointmentsCheckbox);
                System.out.println("Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            else {
                waitForElement(verifyInPersonAppointmentsCheckboxUnchecked);
                jsClick(verifyInPersonAppointmentsCheckboxUnchecked);
                verifyElement(verifyInPersonAppointmentsCheckbox);
                System.out.println("Else -Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            jsScrollIntoView(verifyPayAtHealthCentreonly);
            waitForElement(verifyPayAtHealthCentreonly);
          verifyElement(verifyPayAtHealthCentreonly);
          System.out.println("Sucessfully verified Pay At Health centre only");
          waitForElement(verifyPayOnlineonly);
          verifyElement(verifyPayOnlineonly);
          System.out.println("Sucessfully verified Pay At Health centre only");
          waitForElement(verifyPayatHealthCentreorPayOnline);
          verifyElement(verifyPayatHealthCentreorPayOnline);
            System.out.println("Sucessfully verified Pay At Health centre only or Pay Online only");
            waitForElement(verifyPayatHealthCentreorPayOnline);
            blresult = verifyElement(verifyPayatHealthCentreorPayOnline);
        } catch (Exception e) {

        }
        return blresult;
    }
    public boolean veriflyPhoneAppoitmentPaymentSettings() {
        boolean blresult = false;
        try {
            if (verifyElement(verifyPhoneAppointmentsCheckbox)){
                jsClick(verifyPhoneAppointmentsCheckbox);
                System.out.println("Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            else {
                waitForElement(verifyPhoneAppointmentsCheckboxUnchecked);
                jsClick(verifyPhoneAppointmentsCheckboxUnchecked);
                verifyElement(verifyPhoneAppointmentsCheckbox);
                System.out.println("Else -Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            jsScrollIntoView(verifyPayAtHealthCentreonly);
            waitForElement(verifyPayAtHealthCentreonly);
            verifyElement(verifyPayAtHealthCentreonly);
            System.out.println("Successfully verified Pay At Health centre only");
            waitForElement(verifyPayOnlineonly);
            verifyElement(verifyPayOnlineonly);
            System.out.println("Successfully verified Pay At Health centre only");
            waitForElement(verifyPayatHealthCentreorPayOnline);
            verifyElement(verifyPayatHealthCentreorPayOnline);
            System.out.println("Successfully verified Pay At Health centre only or Pay Online only");
            waitForElement(verifyPayatHealthCentreorPayOnline);
            blresult = verifyElement(verifyPayatHealthCentreorPayOnline);
        } catch (Exception e) {
            System.out.println("Cannot Successfully verified Pay At Health centre only or Pay Online only");
        }
        return blresult;
    }
    public boolean veriflyVideoAppoitmentPaymentSettings() {
        boolean blresult = false;
        try {
            if (verifyElement(verifyVideoAppointmentsCheckbox)){
                jsClick(verifyVideoAppointmentsCheckbox);
                System.out.println("Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            else {
                waitForElement(verifyVideoAppointmentsCheckboxUnchecked);
                jsClick(verifyVideoAppointmentsCheckboxUnchecked);
                verifyElement(verifyVideoAppointmentsCheckbox);
                System.out.println("Else -Sucessfully verified In Person Appointments Checkbox Cheacked");
            }
            jsScrollIntoView(verifyPayAtHealthCentreonly);
            waitForElement(verifyPayAtHealthCentreonly);
            verifyElement(verifyPayAtHealthCentreonly);
            System.out.println("Successfully verified Pay At Health centre only");
            waitForElement(verifyPayOnlineonly);
            verifyElement(verifyPayOnlineonly);
            System.out.println("Successfully verified Pay At Health centre only");
            waitForElement(verifyPayatHealthCentreorPayOnline);
            verifyElement(verifyPayatHealthCentreorPayOnline);
            System.out.println("Successfully verified Pay At Health centre only or Pay Online only");
            waitForElement(verifyPayatHealthCentreorPayOnline);
            blresult = verifyElement(verifyPayatHealthCentreorPayOnline);
        } catch (Exception e) {
            System.out.println("Cannot Successfully verified Pay At Health centre only or Pay Online only");
        }
        return blresult;
    }

    public boolean EnableYesOnlinePaymentsforRRP() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntEnableOnlinePaymentsForRRP);
            waitForElement(elmntEnableOnlinePaymentsForRRP);
            jsClick(elmntEnableOnlinePaymentsForRRP);
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRepeatScriptSetting() {
        boolean blresult = false;
        try {
            waitForElement(elmntRepeatPrescription);
            click(elmntRepeatPrescription);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntRepeatScriptSetting);
            waitForElement(elmntRepeatScriptSetting);
            jsClick(elmntRepeatScriptSetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickRepeatScriptSettingHeader);
            click(clickRepeatScriptSettingHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntRepeatScriptSettingHeader);
            blresult = verifyElement(elmntRepeatScriptSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickRepeatScriptSettingEditButton() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntEditButton);
            waitForElement(elmntEditButton);
            click(elmntEditButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntRepeatScriptSettingHeader);
            blresult = verifyElement(elmntRepeatScriptSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean veriflyRRPPaymentSetting() {
        boolean blresult = false;
        try {
            waitForElement(elmntRRPPayAtHealthCentreOnly);
          verifyElement(elmntRRPPayAtHealthCentreOnly);
          waitForElement(elmntRRPPayOnlineOnly);
          verifyElement(elmntRRPPayOnlineOnly);
          waitForElement(elmntRRPPayatHealthCentreorPayOnline);
          verifyElement(elmntRRPPayatHealthCentreorPayOnline);
          jsClick(elmntRRPPayatHealthCentreorPayOnline);
          blresult = verifyElement(elmntRRPPayatHealthCentreorPayOnline);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean EnableNoOnlinePaymentsforRRP() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntDisableOnlinePaymentsForRRP);
            waitForElement(elmntDisableOnlinePaymentsForRRP);
            jsClick(elmntDisableOnlinePaymentsForRRP);
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean veriflyOnlyShowPayHealthCentreOptions() {
        boolean blresult = false;
        boolean PayOnline = false;
        boolean PayOnlineAndPayhealthCenter = false;
        try {
            jsScrollIntoView(elmntRRPPayAtHealthCentreOnly);
            PayOnline=!verifyElement(elmntRRPPayOnlineOnly);
            PayOnlineAndPayhealthCenter=!verifyElement(elmntRRPPayatHealthCentreorPayOnline);
            waitForElement(elmntRRPPayAtHealthCentreOnly);
            blresult =verifyElement(elmntRRPPayAtHealthCentreOnly);
        } catch (Exception e) {

        }
        return blresult&&PayOnline&&PayOnlineAndPayhealthCenter;
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

}

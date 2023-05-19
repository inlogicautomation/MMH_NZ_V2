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
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Payment Settings')]")
    protected WebElement elmntPaymentSetting;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Online Payment Settings')]")
    protected WebElement elmntOnlinePaymentSetting;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Online Payment Settings')]")
    protected WebElement elmntOnlinePaymentSettingHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntEditButton;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement clickHealthCentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Appointments')]//following::input)[1]")
    protected WebElement elmntEnableOnlinePaymentsForAppointments;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Appointments')]//following::input)[2]")
    protected WebElement elmntEnableNoOnlinePaymentsForAppointments;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Enable Online Payments for Request Repeat Prescriptions')]//following::input)[1]")
    protected WebElement elmntEnableOnlinePaymentsForRRP;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')] ")
    protected WebElement elmntSaveButton;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Changes saved successfully')]")
    protected WebElement veriflyPopup;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Appointment Settings')]")
    protected WebElement elmntAppointmentSetting;

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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'In-person Appointment')]//ancestor::mat-checkbox[@ng-reflect-checked='true']")
    protected WebElement verifyInPersonAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'In-person Appointment')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyInPersonAppointmentsCheckboxUnchecked;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Phone Appointment ')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyPhoneAppointmentsCheckboxUnchecked;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'In-person Appointment')]//ancestor::mat-checkbox[@ng-reflect-checked='true']")
    protected WebElement verifyPhoneAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Video Appointment')]//ancestor::mat-checkbox[@ng-reflect-checked='true']")
    protected WebElement verifyVideoAppointmentsCheckbox;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Video Appointment ')]//preceding::input[@aria-checked='false'])[2]")
    protected WebElement verifyVideoAppointmentsCheckboxUnchecked;



    public boolean clickPaymentSetting() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntPaymentSetting);
            waitForElement(elmntPaymentSetting);
            jsClick(elmntPaymentSetting);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
          waitForElement(elmntOnlinePaymentSetting);
          click(elmntOnlinePaymentSetting);
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
            waitForElement(clickHealthCentre);
            click(clickHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
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
            jsScrollIntoView(elmntEnableOnlinePaymentsForAppointments);
            waitForElement(elmntEnableOnlinePaymentsForAppointments);
            click(elmntEnableOnlinePaymentsForAppointments);
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean EnableNoOnlinePaymentsforAppointments() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntEnableNoOnlinePaymentsForAppointments);
            waitForElement(elmntEnableNoOnlinePaymentsForAppointments);
            click(elmntEnableNoOnlinePaymentsForAppointments);
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
            waitForElement(veriflyPopup);
            blresult = verifyElement(veriflyPopup);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickAppointmentSetting() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
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
            click(elmntEnableOnlinePaymentsForRRP);
            waitForElement(elmntOnlinePaymentSettingHeader);
            blresult = verifyElement(elmntOnlinePaymentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }



}

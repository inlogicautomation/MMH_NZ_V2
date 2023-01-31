package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AppointmentsPage extends BasePage {

    public AppointmentsPage(WebDriver driver) {
        super(driver);
    }

    public static String strSlotDate;

    public LinkedList<String> listAllAppoinmentDatesInGrid;

    public LinkedList<String> listAllAppoinmentDatesInCard;

    protected String strActiveHeader = new StringBuilder().append("//h3[contains(text(),'").append("<<TAB>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]")
    protected WebElement elmntWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//span[@title='Go to the next page' and contains(@class,'k-pager')]")
    protected WebElement elmntNextPage;

    @FindBy(how = How.XPATH, using = "//span[@title='Go to the next page' and contains(@class,'disabled')]")
    protected WebElement elmntNextPageDisabled;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'page-content')]")
    protected WebElement elmntAppointmentPanel;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]/i")
    protected WebElement elmntBookAppointment;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Future appointments')]")
    protected WebElement elmntWebFutureAppointment;
    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Let’s book your appointment.')]")
    protected WebElement VerflyMobileBookAppointmentPage;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),' Future Appointments')]")
    protected WebElement VerflyWebFutureAppointmentPage;


    @FindBy(how = How.XPATH, using = "//button[@ng-reflect-message='Book appointment']//span//img")
    protected WebElement elmntMobileBookAppointmentimg;

    @FindBy(how = How.XPATH, using = "//h4[text()='Let’s book the appointment.']")
    protected WebElement lblBookAppointment;

    protected String strAppointments = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    //div[contains(text(),'Past appointments')]

    protected String strMobileAppointments = new StringBuilder().append("//a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strMessages = new StringBuilder().append("//a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntHealtCenter;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Future Appointments')]")
    protected WebElement elmntfuturetab;

    @FindBy(how = How.XPATH, using = "(//div[@class='toast toast-warning'])[1]")
    protected WebElement elmntWarningPopup;

    @FindBy(how = How.XPATH, using = "//mat-progress-spinner[@role='progressbar']")
    protected WebElement elmntSpinnerr;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String elmntHealthCenter = new StringBuilder().append("//h6[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntLocation = new StringBuilder().append("//h6[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='locationCenter']")
    protected WebElement elmntLocationCenter;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'cdk-overlay')]")
    protected WebElement elmntCovidPreScreeningPopup;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NO')]//parent::button")
    protected WebElement elmntDeclineCovidPreScreening;

    @FindBy(how = How.XPATH, using = "//div[@class='book-appointments-pop']")
    protected WebElement elmntAppointmentPreScreening;

    @FindBy(how = How.XPATH, using = "//span[text()='Close']//parent::button")
    protected WebElement elmntCloseAppointmentPreScreening;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='personData']")
    protected WebElement elmntFamilyMemberCenter;

    protected String elmntFamilyMember = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@class='k-input']")
    protected WebElement elmntReason;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='otherReason']")
    protected WebElement elmntReasonTextBox;

    //input[@formcontrolname='otherReason']

    protected String strReasonForAppointment = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='mat-tab-link-container']")
    protected WebElement elmntBookingTypeContainer;

    @FindBy(how = How.XPATH, using = "//span[@title='Go to the next page']")
    protected WebElement pagerNextButton;

    @FindBy(how = How.XPATH, using = "//div[@class='doctor-list']")
    protected WebElement elmntProviderList;

    @FindBy(how = How.XPATH, using = "//div[@class='doctor mobile-view']")
    protected WebElement elmntProviderListView;

    @FindBy(how = How.XPATH, using = "//a[@aria-label='next']")
    protected WebElement btnNextArrow;

    @FindBy(how = How.XPATH, using = "(//div[@class='profile ng-star-inserted'])[1]")
    protected WebElement elmntProviders;

    @FindBy(how = How.XPATH, using = "(//div[@class='profile ng-star-inserted'])[1]")
    protected WebElement elmntProvider2;

//    @FindBy(how = How.XPATH, using = "//div[@class='profile ng-star-inserted']")
//    List<WebElement> elmntProviders;

    protected String elmntBookingType = new StringBuilder().append("//div[@class='mat-tab-links']//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectProvider = new StringBuilder().append("//div[@class='profile']//child::p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectProviderMobileView = new StringBuilder().append("//div[@class='doctor mobile-view']/child::div//following-sibling::div/child::p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//ancestor::div/child::img").toString();

    @FindBy(how = How.XPATH, using = "//mat-calendar[@class='mat-calendar']")
    protected WebElement elmntAppointmentCalendar;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Next month']")
    protected WebElement elmntCalendarNavNext;

    protected String elmntDatePicker = new StringBuilder().append("(//td[@class='mat-calendar-body-cell ng-star-inserted']/child::div[contains(text(),' ")
            .append("<<REPLACEMENT>>").append(" ')])[1]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='slot-start-time']")
    protected WebElement elmntSlotTimes;

    protected String elmntSlots = new StringBuilder().append("//mat-chip[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

//    @FindAll({
//            @FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-view')]//span[contains(text(),'Confirm')]/parent::button"), //Desktop View
//            @FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-view')]//span[contains(text(),'Confirm')]/parent::button"),//Mobile View
//    })
//    protected WebElement btnConfirm;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-view')]//span[contains(text(),'Confirm')]/parent::button")
    protected WebElement btnConfirmDesktop;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-view')]//span[contains(text(),'Confirm')]/parent::button")
    protected WebElement btnConfirmMobile;

    @FindBy(how = How.XPATH, using = "//div[@class='payment-profile']")
    protected WebElement elmntPaymentProfile;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' I accept the ')]//preceding::input[@class='mat-checkbox-input cdk-visually-hidden']")
    protected WebElement chkAcceptandTerms;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'mobile-view')]//span[contains(text(),'Confirm')]/parent::button")
    protected WebElement btnConfirmYourBookingEnabledmobile;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']//button/span[text()='Confirm your booking now']"), // Without Fees
            @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator btn-primary with-green mat-button mat-button-base ng-star-inserted']//span[contains(text(),'Confirm & Continue')]"),//With Fees
            @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator btn-primary with-green mat-button mat-button-base ng-star-inserted']//span[contains(text(),'Pay & Continue')]"),//PayOnline

    })
    protected WebElement btnConfirmYourBookingEnabled;

    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator btn-primary with-green mat-button mat-button-base ng-star-inserted mat-button-disabled']")
    protected WebElement btnConfirmYourBookingDiabled;

    protected String elmntAppointmentDetail = new StringBuilder().append("//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntAppointmentDetailInFutureAppoinments = new StringBuilder().append("//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]/ancestor::mat-card//child::div/p[contains(text(),'")
            .append("<<REPLACEMENT3>>")
            .append("')]").toString();

    protected String btnCancelForCreatedAppointment = new StringBuilder().append("//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]/ancestor::mat-card//child::div/p[contains(text(),'")
            .append("<<REPLACEMENT3>>")
            .append("')]/ancestor::mat-card/child::mat-card-footer/button").toString();


    protected String btnJoinVideoConsultingForCreatedAppointment = new StringBuilder().append("//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]/ancestor::mat-card//child::div/p[contains(text(),'")
            .append("<<REPLACEMENT3>>")
            .append("')]/ancestor::mat-card/child::mat-card-content/child::div//button").toString();


    protected String elmntDetailsAfterCancelingAppointment = new StringBuilder().append("(//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]/ancestor::mat-card//child::div/p[contains(text(),'")
            .append("<<REPLACEMENT3>>")
            .append("')]/ancestor::mat-card/child::mat-card-footer/button)[1]").toString();

//    protected String elmntFutureAppointmentDetail = new StringBuilder().append("//mat-card-title[contains(text(),'")
//            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntFutureAppointmentDetail = new StringBuilder().append("//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Future Appointments')]")
    protected WebElement elmntFutureAppointmentTab;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Future Appointments')]")
    protected WebElement clickMobileFutureAppointmentTab;

    @FindBy(how = How.XPATH, using = "//span[text()=' OK ']/parent::button")
    protected WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//div/p[contains(text(),'Thank you. Your payment has been processed successfully.')]")
    protected WebElement elmntPaymentSuccess;

    protected String eleAppointmentSummaryDetails = new StringBuilder().append("//div/p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-dialog-container//div/div[contains(text(),'our appointment is not for today')]")
    protected WebElement elmntAppointmentsisNotForTodayPopup;

    protected String elmntVideoBookingType = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]/preceding::input[@type='radio'][1]").toString();

    @FindBy(how = How.XPATH, using = "//i[@class='icon-list-view']")
    protected WebElement elmntGrid;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement elmntVideoBookingTypeOkButton;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-grid-view']")
    protected WebElement elmntCard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Drag a column header and drop it here to group by that column')]")
    protected WebElement elmntTableNote;

    @FindBy(how = How.XPATH, using = "//td[@aria-colindex='1']")
    protected List<WebElement> elmntsAppointmentDatesInGrid;

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[contains(@class,'mat-expansion-panel')]/span/mat-panel-title")
    protected List<WebElement> elmntVideoInvitesGrid;

    @FindBy(how = How.XPATH, using = "//div[@class='mat-card-header-text']/mat-card-title")
    protected List<WebElement> elmntsAppointmentDatesInCard;

    @FindBy(how = How.XPATH, using = "//p[@class='label-value lbl-remove']")
    protected List<WebElement> elmntsAppointmentDatesInGridForMobileView;

    @FindBy(how = How.XPATH, using = "//span[@role='listbox']")
    protected WebElement elmntDownArrow;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'20')]")
    protected WebElement elmntMaxValue;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Video Invitations')]")
    protected WebElement elmntVideoPage;

    @FindBy(how = How.XPATH, using = "//td/mat-icon[contains(text(),'videocam')]")
    protected List<WebElement> elmntsVideoIcons;

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[contains(@class,'mat-expansion-panel')]")
    protected List<WebElement> elmntsVideoTiles;

    @FindBy(how = How.XPATH, using = "(//td/mat-icon[contains(text(),'videocam')])[1]")
    protected WebElement elmntFirstVideoIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'expansion-panel-primary-content')]//mat-icon[text()='videocam']")
    protected WebElement elmntVideoIconMobileView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'expansion-panel-primary-content')]")
    protected WebElement elmntVideoInviteDetailsGrid;

    @FindBy(how = How.XPATH, using = "(//mat-expansion-panel-header[contains(@class,'mat-expansion-panel')]/span/mat-panel-title)[1]")
    protected WebElement elmntFirstVideoInvite;

    @FindBy(how = How.XPATH, using = "(//td/mat-icon[contains(text(),'videocam')])[1]")
    protected List<WebElement> elmntInsideAllIcons;

    @FindBy(how = How.XPATH, using = "//img[@title='Close']")
    protected WebElement elmntEndCall;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    protected WebElement btnYes;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='phoneCode']")
    protected WebElement elmntPhoneCode;

    @FindBy(how = How.XPATH, using = "//div[@class='alert-header-content']/h3[contains(text(),'Payment')]")
    protected WebElement elmntPaymentPopup;

    protected String elmntPaymentPopup1 = "//div[@class='alert-header-content']/h3[contains(text(),'Payment')]";

    @FindBy(how = How.XPATH, using = "//img[@id='DpsCustomerLogo']")
    protected WebElement elmntPaymentPage;

    @FindBy(how = How.XPATH, using = "//iframe[@id='iframePayment']")
    protected WebElement CardPaymentFrame;

    @FindBy(how = How.XPATH, using = "//div//span[contains(text(),'Ok')]")
    protected WebElement btnPaymentPopupOK;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Contact Number']")
    protected WebElement txtPhoneNumber;

    protected String elmntPhoneID = new StringBuilder().append("//div[@role='listbox']//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectPaymentOption = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]/parent::button").toString();

    protected String elmntPayAmount = new StringBuilder().append("//abbr[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@name='CardNumber']")
    protected WebElement txtCardNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='CardHolderName']")
    protected WebElement txtCardHolderName;

    @FindBy(how = How.XPATH, using = "//input[@name='Cvc2']")
    protected WebElement txtCVCNumber;

    @AndroidFindBy(xpath = "//android.view.View[@text='Expiry Date (MM)']")
    protected WebElement drpExpiryMonth;

    @AndroidFindBy(xpath = "//android.view.View[@text='Expiry Date (YY)']")
    protected WebElement drpExpiryYear;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='02']")
    protected WebElement strCheckedTextLocator;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='24']")
    protected WebElement strCheckedTextLocatoryear;

    @FindBy(how = How.XPATH, using = "//button[@name='Add']")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Payment Checkout')]")
    protected WebElement elmntPaymentCheckOut;

    @FindBy(how = How.XPATH, using = "//span[@id='Success']")
    protected WebElement elmntSucessMessage;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='reason']")
    protected WebElement txtReasonForCancelAppointment;

    @FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator btn mat-button mat-button-base']/span[text()='Cancel Appointment'])[1]")
    protected WebElement elmntCancelAppointments;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Next')]")
    protected WebElement btnNext;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel your Appointment')]/parent::button")
    protected WebElement btnConfirmCancellAppointment;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Appointment cancelled successfully')]")
    protected WebElement elmntAppoinmentCancelMessage;

    protected String strIcon = new StringBuilder().append("//img[contains(@title,'")
            .append("<<REPLACEMENT>>").append("')]").toString();


    public boolean navigateToBookAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
//            WebElement elmntBookAppointment = waitForElement(By.xpath(strAppointments.replace("<<REPLACEMENT>>", strAppointment)));
//            click(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            waitForElement(elmntBookAppointment);
            click(elmntBookAppointment);
            waitForElement(VerflyMobileBookAppointmentPage);
            blResult = verifyElement(VerflyMobileBookAppointmentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToPastAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
            WebElement elmntBookAppointment = waitForElement(By.xpath(strAppointments.replace("<<REPLACEMENT>>", strAppointment)));
            click(elmntBookAppointment);
//            waitForElement(elmntAppointmentPanel);
//            waitForElement(elmntBookAppointment);
//            click(elmntBookAppointment);
//            waitForElement(VerflyMobileBookAppointmentPage);
            blResult=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
//            WebElement elmntBookAppointment = waitForElement(By.xpath(strAppointments.replace("<<REPLACEMENT>>", strAppointment)));
//            click(elmntBookAppointment);
//            waitForElement(elmntAppointmentPanel);
            waitForElement(elmntBookAppointment);
            click(elmntBookAppointment);
            waitForElement(VerflyMobileBookAppointmentPage);
            blResult = verifyElement(VerflyMobileBookAppointmentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToWebFutureAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
//            WebElement elmntBookAppointment = waitForElement(By.xpath(strAppointments.replace("<<REPLACEMENT>>", strAppointment)));
//            click(elmntBookAppointment);
//            waitForElement(elmntAppointmentPanel);
            waitForElement(elmntWebFutureAppointment);
            click(elmntWebFutureAppointment);
            waitForElement(VerflyWebFutureAppointmentPage);
            blResult = verifyElement(VerflyWebFutureAppointmentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMobileBookAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
//            WebElement elmntBookAppointment = waitForElement(By.xpath(strMobileAppointments.replace("<<REPLACEMENT>>", strAppointment)));
//            click(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            verifyElement(elmntAppointmentPanel);
            waitForElement(elmntMobileBookAppointmentimg);
            click(elmntMobileBookAppointmentimg);
            waitForElement(VerflyMobileBookAppointmentPage);
            blResult = verifyElement(VerflyMobileBookAppointmentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToWebBookAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
//            WebElement elmntBookAppointment = waitForElement(By.xpath(strMobileAppointments.replace("<<REPLACEMENT>>", strAppointment)));
//            click(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            verifyElement(elmntAppointmentPanel);
            waitForElement(elmntMobileBookAppointmentimg);
            click(elmntMobileBookAppointmentimg);
            waitForElement(VerflyMobileBookAppointmentPage);
            blResult = verifyElement(VerflyMobileBookAppointmentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean navigateToMobileFutureAppointmentPage(String strAppointment) {
        boolean blResult = false;
        try {
//            waitForElement(elmntWelcomeMessage);
            WebElement elmntBookAppointment = waitForElement(By.xpath(strMobileAppointments.replace("<<REPLACEMENT>>", strAppointment)));
            System.out.println(">>>>>>>>>>>>>"+elmntBookAppointment);
            jsClick(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            blResult =  verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCenter(String strHealthCenter) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntHealtCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
//          jsScrollIntoView(elmntSlotTimes);
            jsScrollIntoView(elmntAppointmentPanel);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            click(elmntHealtCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectHealthCenter = waitForElementFewSeconds(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", strHealthCenter)));
            waitForSeconds(2);
            waitAndClick(elmntSelectHealthCenter);
            waitForSeconds(2);
            blResult = verifyElement(elmntLocationCenter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean selectLocation(String strLocation) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntLocationCenter);
            waitForSeconds(2);
            jsClick(elmntLocationCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectLocation = waitForElement(By.xpath(elmntLocation.replace("<<REPLACEMENT>>", strLocation)));
            jsClick(elmntSelectLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(elmntCovidPreScreeningPopup);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean declineCovidPreScreeningPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntCovidPreScreeningPopup);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsClick(elmntDeclineCovidPreScreening);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(4);
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selectAppointmentIsFor(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(4);
            waitForElementClickable(elmntFamilyMemberCenter);
            waitForSeconds(2);
            waitAndClick(elmntFamilyMemberCenter);
            WebElement elmntSelectFamilyMember = waitForElementFewSeconds(By.xpath(elmntFamilyMember.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitAndClick(elmntSelectFamilyMember);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntAppointmentPanel);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectReasonForBooking(String strReason) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementClickable(elmntReason);
            waitAndClick(elmntReason);
            elmntReason.sendKeys(strReason);

//
//            if (strReason.contains(",")) {
//                String[] strReasonFor = strReason.split(",");
//                for (String strReasonInHierarchy : strReasonFor) {
//                    strReasonInHierarchy = strReasonInHierarchy.trim();
//                    WebElement elmntReasonForAppointment = waitForElementClickable(By.xpath(strReasonForAppointment.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strReasonInHierarchy))));
//                    verifyElement(elmntReasonForAppointment);
//                    waitAndClick(elmntReasonForAppointment);
//
//
//                }
//            } else {
//                WebElement elmntReasonForAppointment = waitForElementClickable(By.xpath(strReasonForAppointment.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strReason))));
//                verifyElement(elmntReasonForAppointment);
//                waitAndClick(elmntReasonForAppointment);
//            }
            waitForSeconds(2);
            elmntReason.sendKeys(Keys.ENTER);
//            waitForSeconds(3);
//            elmntReasonTextBox.sendKeys(strReason);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean selectTypeOfAppointment(String strBookingType) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementClickable(elmntBookingTypeContainer);
            WebElement elmntTypeOfAppointment = waitForElement(By.xpath(elmntBookingType.replace("<<REPLACEMENT>>", strBookingType)));
            click(elmntTypeOfAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProviderForRealMobileView(String strProvider) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntProviderListView);
            jsScrollIntoView(elmntProviderListView);
            By elmntProvider = By.xpath(elmntSelectProviderMobileView.replace("<<REPLACEMENT>>", strProvider));
            System.out.println("elmntPackName>>>>>> " + elmntProvider);
            waitForSeconds(5);
            while (!(verifyElement(elmntProvider))){
                waitForSeconds(5);

                click(btnNextArrow);
                waitForSeconds(5);

            }
            WebElement elmntProvider1 = waitForElement(By.xpath(elmntSelectProviderMobileView.replace("<<REPLACEMENT>>", strProvider)));
            System.out.println("elmntPackName>>>>>> " + elmntProvider1);
            isElementDisplayed(elmntProvider1);
            mouseClick(elmntProvider1);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean selectFutureDateOnCalender(String strFutureDate) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            String strDatePattern1 = "d";
            String strDate = strFutureDate;

            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            jsScrollIntoView(elmntAppointmentCalendar);
            waitForElement(elmntAppointmentCalendar);
            verifyElement(elmntAppointmentCalendar);
            try {
                WebElement elmntDate = waitForElementClickable(By.xpath(elmntDatePicker.replace("<<REPLACEMENT>>", strDateValue)));
                verifyElement(elmntDate);
                waitForElementClickable(elmntDate);
                waitForSeconds(3);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                jsClick(elmntDate);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(2);
            } catch (Exception e) {
                verifyElement(elmntCalendarNavNext);
                jsClick(elmntCalendarNavNext);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(3);
                WebElement elmntDate = waitForElementClickable(By.xpath(elmntDatePicker.replace("<<REPLACEMENT>>", strDateValue)));
                verifyElement(elmntDate);
                waitForElementClickable(elmntDate);
                waitForSeconds(3);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                jsClick(elmntDate);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(2);
            }

            blResult = verifyElement(elmntAppointmentCalendar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAvialableSlotDateTime(String strSlotsTime) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntSlotTimes);

            List<WebElement> lstAvailableSlots = driver.findElements(By.xpath("//div[@class='slot-start-time']//mat-chip[@aria-disabled='false']"));
//            WebElement elmntAppointmentSlot = waitForElement(By.xpath(elmntSlots.replace("<<REPLACEMENT>>", strSlotsTime)));
//            click(elmntAppointmentSlot);
            for (WebElement ele: lstAvailableSlots) {
                ele.getText();
                System.out.println("Available Slots" +ele.getText());
            }
            lstAvailableSlots.size();
            System.out.println("Available Slots" +   lstAvailableSlots.size());

            System.out.println("Available Slots" + lstAvailableSlots);

            strSlotDate = lstAvailableSlots.get(0).getText().trim();
            System.out.println("Slot Date" + strSlotDate);
            waitAndClick(lstAvailableSlots.get(0));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

//            for (int i = 1; i <= lstAvailableSlots.size(); i++) {
//                lstAvailableSlots.get(i).click();
//            }

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickConfirmButton() {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(2);
//              jsScrollDown();
              jsScrollIntoView(btnConfirmDesktop);
                waitForElement(btnConfirmDesktop);
                click(btnConfirmDesktop);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(5);
                blResult = true;
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(2);
//                jsScrollDown();
                jsScrollIntoView(btnConfirmMobile);
                waitForElement(btnConfirmMobile);
                click(btnConfirmMobile);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(5);
                blResult = true;
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(2);
//                jsScrollDown();
                jsScrollIntoView(btnConfirmMobile);
                waitForElement(btnConfirmMobile);
                click(btnConfirmMobile);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(5);
                blResult = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyDetailsOfCreatedAppointment(List<String> lstDetails, String strFutureDate) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
//            waitForElement(elmntPaymentProfile);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(strFutureDate);
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);
            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", strDateValue)));
            verifyElement(elmntAppointmentDetails);

            WebElement elmntAppointments = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", strSlotDate)));
            verifyElement(elmntAppointments);

            for (String strDetails : lstDetails) {
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                blResult = verifyElement(elmntReservationDetails);
            }
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            try {
                waitForSeconds(2);
//                waitForElement(elmntPaymentProfile);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(strFutureDate);
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", strDateValue)));
                jsScrollIntoView(elmntAppointmentDetails);
                verifyElement(elmntAppointmentDetails);

                String strConvertedTime = strSlotDate;

                strConvertedTime = "0" + strConvertedTime;

                String strFinalOutDateTime = strConvertedTime;


                WebElement elmntAppointments = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", strFinalOutDateTime)));
                verifyElement(elmntAppointments);

                for (String strDetails : lstDetails) {
                    WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                    blResult = verifyElement(elmntReservationDetails);
                }

                System.out.println("Catch Block 1 executed");

                takeScreenshot(driver);
                blResult = true;

            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }


    public boolean clickConfirmYourBookingButton() {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForSeconds(2);
                waitForElement(elmntPaymentProfile);
                verifyElement(btnConfirmYourBookingEnabled);
                click(btnConfirmYourBookingEnabled);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(4);
                blResult = true;
            }
//            blResult = verifyElement(elmntFutureAppointmentTab);
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                waitForSeconds(2);
                waitForElement(elmntPaymentProfile);
                verifyElement(btnConfirmYourBookingEnabledmobile);
                click(btnConfirmYourBookingEnabledmobile);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(4);
                blResult = true;
            }

            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForSeconds(2);
                waitForElement(elmntPaymentProfile);
                verifyElement(btnConfirmYourBookingEnabledmobile);
                click(btnConfirmYourBookingEnabledmobile);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(4);
                blResult = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean acceptTermsAndConditionsForAppointment() {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForSeconds(2);
                waitForElement(elmntPaymentProfile);
                verifyElement(btnConfirmYourBookingDiabled);
                waitForElementClickable(chkAcceptandTerms);
                jsClick(chkAcceptandTerms);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                blResult = verifyElement(btnConfirmYourBookingEnabled);
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                jsScrollDown();
                jsScrollIntoView(chkAcceptandTerms);
                waitForElement(elmntPaymentProfile);
                waitForElementClickable(chkAcceptandTerms);
                jsClick(chkAcceptandTerms);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                blResult = verifyElement(btnConfirmYourBookingEnabledmobile);
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                jsScrollDown();
                jsScrollIntoView(chkAcceptandTerms);
                waitForElement(elmntPaymentProfile);
                waitForElementClickable(chkAcceptandTerms);
                jsClick(chkAcceptandTerms);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                blResult = verifyElement(btnConfirmYourBookingEnabledmobile);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyCreatedAppointmentInFutureAppointmentTab(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            String strConvertedTime = strTime;

            strConvertedTime = "0" + strConvertedTime;

            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;

            System.out.println(strFinalOutDateTime);

            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            jsScrollIntoView(elmntAppointmentDetails);
            verifyElement(elmntAppointmentDetails);


            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetailInFutureAppoinments
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            takeScreenshot(driver);
            blResult = verifyElement(elmntReservationDetails);

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                System.out.println("Catch Block 1 executed");
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime1 = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime1);

                WebElement elmntAppointmentDetails1 = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime1).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails1);
                jsScrollIntoView(elmntAppointmentDetails1);

                System.out.println("TEST" + lstDetails.get(1));


                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetailInFutureAppoinments
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime1)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                takeScreenshot(driver);
                blResult = verifyElement(elmntReservationDetails);
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }

    public boolean verifyMobileCreatedAppointmentInFutureAppointmentTab(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForElement(clickMobileFutureAppointmentTab);
            click(clickMobileFutureAppointmentTab);
            waitForSeconds(2);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            String strConvertedTime = strTime;

//            strConvertedTime = "0" + strConvertedTime;

            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;

            System.out.println(strFinalOutDateTime);

            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            verifyElement(elmntAppointmentDetails);
            jsScrollIntoView(elmntAppointmentDetails);

            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetailInFutureAppoinments
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            takeScreenshot(driver);
            blResult = verifyElement(elmntReservationDetails);

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                System.out.println("Catch Block 1 executed");
                waitForElement(clickMobileFutureAppointmentTab);
                click(clickMobileFutureAppointmentTab);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime1 = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime1);

                WebElement elmntAppointmentDetails1 = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime1).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails1);
                jsScrollIntoView(elmntAppointmentDetails1);

                System.out.println("TEST" + lstDetails.get(1));


                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetailInFutureAppoinments
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime1)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                takeScreenshot(driver);
                blResult = verifyElement(elmntReservationDetails);
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }

    public boolean selectTypeOfVideoAppointment(String strTypeOfVideoAppointment) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(elmntBookingTypeContainer);
            WebElement elmntTypeOfVideoAppointment = waitForElement(By.xpath(elmntVideoBookingType.replace("<<REPLACEMENT>>", strTypeOfVideoAppointment)));
            waitForSeconds(2);
            jsClick(elmntTypeOfVideoAppointment);
            waitForSeconds(3);
            waitForElement(elmntVideoBookingTypeOkButton);
            jsClick(elmntVideoBookingTypeOkButton);
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProvider(String strProvider) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElementClickable(elmntProviderList);
            WebElement elmntProvider = waitForElement(By.xpath(elmntSelectProvider.replace("<<REPLACEMENT>>", strProvider)));
            waitForSeconds(4);
            waitForElement(elmntProvider);
            jsClick(elmntProvider);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProviderForMobileView(String strProvider) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntProviderListView);
            jsScrollIntoView(elmntProviderListView);
            By elmntProvider = By.xpath(elmntSelectProviderMobileView.replace("<<REPLACEMENT>>", strProvider));
            System.out.println("elmntPackName>>>>>> " + elmntProvider);
            while (!(verifyElement(elmntProvider))) {
//                System.out.println("Swipe>>>>> " + verifyElement(elmntProvider));
//                swipeHorizontalMobileView(elmntProviders);
                jsClick(elmntProviders);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(5);
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_RIGHT);
                waitForSeconds(3);
            }
            WebElement elmntProvider1 = waitForElement(By.xpath(elmntSelectProviderMobileView.replace("<<REPLACEMENT>>", strProvider)));
            waitForSeconds(3);
            jsClick(elmntProvider1);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickGrid() {
        waitForElement(elmntGrid);
        click(elmntGrid);
    }

    public void getAllAppointmentDatesInGrid() {
        listAllAppoinmentDatesInGrid = new LinkedList();
        for (WebElement elmntCurrentAppoinmentDate : elmntsAppointmentDatesInGrid) {
            String strCurrentAppoinmentDate = elmntCurrentAppoinmentDate.getText();
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.substring(0, 11);
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.replace(' ', '-');
            System.out.println("Current Grid Appoinments Dates is:::>>" + strCurrentAppoinmentDate);
            listAllAppoinmentDatesInGrid.add(strCurrentAppoinmentDate);
        }
    }

    public boolean verifyAllAppointmentDatesInGrid() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInGrid) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isAfter(localDate1);
            System.out.println("Grid Date is Equal::" + isDateCorrect);
            isVerifed = isDateCorrect;
            if (!isDateCorrect) {
                isVerifed = false;
            }
            if (!isVerifed) {
                break;
            }
        }
        return isVerifed;
    }

    public boolean verifyFutureAppointmentDatesInGridNewMethod() {
        boolean isVerified = false;
        do {
            waitForSeconds(1);
            getAllAppointmentDatesInGrid();
            for (String strDate : listAllAppoinmentDatesInGrid) {
                LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                boolean isDateCorrect = inputDate1.isAfter(localDate1);
                if (!isDateCorrect) {
                    isDateCorrect = inputDate1.isEqual(localDate1);
                }
                System.out.println("GRID Date is Before Equal::" + isDateCorrect);
                isVerified = isDateCorrect;
                if (!isDateCorrect) {
                    isVerified = false;
                }
                if (!isVerified) {
                    break;
                }
            }
            if (!isVerified) {
                break;
            }
            waitForSeconds(3);
            waitForElement(elmntNextPage);
            click(elmntNextPage);
        } while (!verifyElement(elmntNextPageDisabled));
        waitForSeconds(3);
        getAllAppointmentDatesInGrid();
        for (String strDate : listAllAppoinmentDatesInGrid) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isAfter(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("GRID Date is Before Equal::" + isDateCorrect);
            isVerified = isDateCorrect;
            if (!isDateCorrect) {
                isVerified = false;
            }
            if (!isVerified) {
                break;
            }
        }
        return isVerified;
    }

    public boolean verifyFutureAppointmentDatesInGrid() {
        boolean isVerified = false;
        waitForSeconds(3);    //wait until 'loader'  loading
        List<WebElement> pagination = driver.findElements(By.xpath("//kendo-pager-numeric-buttons/ul/li"));
        if (pagination.size() > 0) {
            System.out.println("pagination exists and size=>" + pagination.size());
            int page_no = pagination.size();
            for (int i = 1; i <= pagination.size(); i++) {
                System.out.println("TEST");
                waitForSeconds(4);
                driver.findElement(By.xpath("//kendo-pager-numeric-buttons/ul/li[" + i + "]")).click();
                System.out.println("PAGE NUMBER" + i);
                getAllAppointmentDatesInGrid();
                for (String strDate : listAllAppoinmentDatesInGrid) {
                    LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                    LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                    boolean isDateCorrect = inputDate1.isAfter(localDate1);
                    System.out.println("Card Date is Before Equal::" + isDateCorrect);
                    isVerified = isDateCorrect;
                    if (!isDateCorrect) {
                        isVerified = false;
                    }
                    if (!isVerified) {
                        break;
                    }
                }
                if (!isVerified) {
                    break;
                }
            }
        }
        return isVerified;
    }

    public boolean verifyFutureAppointmentDatesInGridNewMethodd() {
        boolean isVerified = false;
        try {
            waitForSeconds(1);
            while (!verifyElement(elmntNextPageDisabled)) {
                getAllAppointmentDatesInGrid();
                int i = 1;
                for (String strDate : listAllAppoinmentDatesInGrid) {
                    LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                    LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                    boolean isDateCorrect = inputDate1.isAfter(localDate1);
                    System.out.println("GRID Date is Before Equal::" + isDateCorrect);
                    isVerified = isDateCorrect;
                    if (!isDateCorrect) {
                        isVerified = false;
                    }
                    if (!isVerified) {
                        break;
                    }
                }
                System.out.println("PAGE NUMBER" + i);
                if (!isVerified) {
                    break;
                }
                waitForSeconds(3);
                waitForElement(elmntNextPage);
                click(elmntNextPage);
            }
            getAllAppointmentDatesInGrid();
            int i = 1;
            for (String strDate : listAllAppoinmentDatesInGrid) {
                LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                boolean isDateCorrect = inputDate1.isAfter(localDate1);
                System.out.println("GRID Date is Before Equal::" + isDateCorrect);
                isVerified = isDateCorrect;
                if (!isDateCorrect) {
                    isVerified = false;
                }
                if (!isVerified) {
                    break;
                }
            }
            System.out.println("PAGE NUMBER" + i);

        } catch (Exception e) {
            System.out.println("Verifying Future Appointments in Grid View is Failure");
        }
        return isVerified;
    }

    public boolean verifyHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<TAB>>", strHeader)));
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }

    public void clickCardView() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(6);
            waitForElement(elmntCard);
            click(elmntCard);
            waitForSeconds(15);
        }
    }

    public void getAllAppointmentDatesInCard() {
        listAllAppoinmentDatesInCard = new LinkedList();
        for (WebElement elmntCurrentAppoinmentDate : elmntsAppointmentDatesInCard) {
            String strCurrentAppoinmentDate = elmntCurrentAppoinmentDate.getText();
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.substring(0, 11);
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.replace(' ', '-');
            System.out.println("Current Card Appoinments Dates is:::>>" + strCurrentAppoinmentDate);
            listAllAppoinmentDatesInCard.add(strCurrentAppoinmentDate);
        }
    }

    public boolean verifyAllAppointmentDatesInCard() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInCard) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isAfter(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("Card Date is Equal::" + isDateCorrect);
            isVerifed = isDateCorrect;
            if (!isDateCorrect) {
                isVerifed = false;
            }
            if (!isVerifed) {
                break;
            }
        }
        return isVerifed;
    }


    public boolean verifyCardView() {
        boolean isVerifed = false;
        waitForSeconds(5);
        if (elmntsAppointmentDatesInCard.size() != 0) {
            isVerifed = true;
        }
        return isVerifed;
    }

    public boolean verifyGridView() {
        boolean isVerifed = false;
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(5);
//        waitForElement(elmntTableNote);
        if (elmntsAppointmentDatesInGrid.size() != 0) {
            isVerifed = true;
        }
        return isVerifed;
    }


    public boolean verifyAllAppointmentDatesInCardForPast() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInCard) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isBefore(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("Card Date is Before Equal::" + isDateCorrect);
            isVerifed = isDateCorrect;
            if (!isDateCorrect) {
                isVerifed = false;
            }
            if (!isVerifed) {
                break;
            }
        }
        return isVerifed;
    }

//    public boolean verifyAllAppointmentDatesInGridForPast() {
//        boolean isVerifed = false;
//        for (String strDate : listAllAppoinmentDatesInGrid) {
//            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
//            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
//            boolean isDateCorrect = inputDate1.isBefore(localDate1);
//            if (!isDateCorrect) {
//                isDateCorrect = inputDate1.isEqual(localDate1);
//            }
//            System.out.println("Grid Date is Equal::" + isDateCorrect);
//            isVerifed = isDateCorrect;
//            if (!isDateCorrect) {
//                isVerifed = false;
//            }
//            if (!isVerifed) {
//                break;
//            }
//        }
//        return isVerifed;
//    }

    public boolean verifyPastAppointmentDatesInGridNewMethod() {
        boolean isVerified = false;
        do {
            waitForSeconds(1);
            getAllAppointmentDatesInGrid();
            for (String strDate : listAllAppoinmentDatesInGrid) {
                LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                boolean isDateCorrect = inputDate1.isBefore(localDate1);
                if (!isDateCorrect) {
                    isDateCorrect = inputDate1.isEqual(localDate1);
                }
                System.out.println("Card Date is Before Equal::" + isDateCorrect);
                isVerified = isDateCorrect;
                if (!isDateCorrect) {
                    isVerified = false;
                }
                if (!isVerified) {
                    break;
                }
            }
            if (!isVerified) {
                break;
            }
            waitForSeconds(3);
            waitForElement(elmntNextPage);
            click(elmntNextPage);
        } while (!verifyElement(elmntNextPageDisabled));
        waitForSeconds(3);
        getAllAppointmentDatesInGrid();
        for (String strDate : listAllAppoinmentDatesInGrid) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isBefore(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("Card Date is Before Equal::" + isDateCorrect);
            isVerified = isDateCorrect;
            if (!isDateCorrect) {
                isVerified = false;
            }
            if (!isVerified) {
                break;
            }
        }
        return isVerified;
    }

    public boolean verifyAllAppointmentDatesInGridForPast() {
        boolean isVerified = false;
        waitForSeconds(5);    //wait until 'loader'  loading
        List<WebElement> pagination = driver.findElements(By.xpath("//kendo-pager-numeric-buttons/ul/li"));
        if (pagination.size() > 0) {
            System.out.println("pagination exists and size=>" + pagination.size());
            int page_no = pagination.size();
            for (int i = 1; i <= pagination.size(); i++) {
                System.out.println("TEST");
                waitForSeconds(4);
                driver.findElement(By.xpath("//kendo-pager-numeric-buttons/ul/li[" + i + "]")).click();
                System.out.println("PAGE NUMBER" + i);
                getAllAppointmentDatesInGrid();
                for (String strDate : listAllAppoinmentDatesInGrid) {
                    LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
                    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                    LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
                    boolean isDateCorrect = inputDate1.isBefore(localDate1);
                    if (!isDateCorrect) {
                        isDateCorrect = inputDate1.isEqual(localDate1);
                    }
                    System.out.println("Card Date is Before Equal::" + isDateCorrect);
                    isVerified = isDateCorrect;
                    if (!isDateCorrect) {
                        isVerified = false;
                    }
                    if (!isVerified) {
                        break;
                    }
                }
                if (!isVerified) {
                    break;
                }

            }
        }
        return isVerified;
    }


    public void clickMaxvalue() {
        waitForSeconds(3);
        waitForElement(elmntDownArrow);
        click(elmntDownArrow);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ENTER);
        takeScreenshot(driver);
//        waitForElement(elmntMaxValue);
//        click(elmntMaxValue);

    }

    public boolean verifyVideoPage() {
        waitForElement(elmntVideoPage);
        return verifyElement(elmntVideoPage);
    }

    public boolean verifyAlltheVideoAppointments() {
        boolean isVerifed = false;
        waitForSeconds(2);
        waitForElements(elmntsVideoIcons);
        int countVideoIcons = elmntsVideoIcons.size();
        int countTotalRow = elmntsAppointmentDatesInGrid.size();
        System.out.println("Total Video Icons:::>> " + countVideoIcons + "  Total Row Count:::>> " + countTotalRow);
        if (countVideoIcons == countTotalRow) {
            isVerifed = true;
        }
        return isVerifed;
    }

    public boolean verifyAlltheVideoAppointmentsForMobileView() {
        boolean isVerifed = false;
        waitForSeconds(2);
        waitForElements(elmntsVideoTiles);
        int countVideoIcons = elmntsVideoTiles.size();
        int countTotalRow = elmntVideoInvitesGrid.size();
        System.out.println("Total Video Icons:::>> " + countVideoIcons + "  Total Row Count:::>> " + countTotalRow);
        if (countVideoIcons == countTotalRow) {
            isVerifed = true;
        }
        return isVerifed;
    }


    public void clickFirstIcon() {
        waitForElement(elmntFirstVideoIcon);
        click(elmntFirstVideoIcon);
    }

    public boolean verifyAllIcons(List<String> strAllIcons) {
        boolean isVerifed = false;
        for (String strCurrentIcon : strAllIcons) {
            System.out.println("Current Icon::" + strCurrentIcon);
            takeScreenshot(driver);
            WebElement elmntCurrentIcon = waitForElement(By.xpath(strIcon.replace("<<REPLACEMENT>>", strCurrentIcon)));
            if (!verifyElement(elmntCurrentIcon)) {
                isVerifed = false;
                break;
            } else {
                isVerifed = true;
            }
        }
        return isVerifed;
    }

    public void clickEndIcon() {
        waitForElement(elmntEndCall);
        jsScrollIntoView(elmntEndCall);
        jsClick(elmntEndCall);
        waitForSeconds(4);
        waitForElement(btnYes);
        click(btnYes);
    }

    public boolean selectPhoneCode(String strPhoneID) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            jsScrollIntoView(elmntPhoneCode);
            waitForElement(elmntPhoneCode);
            jsClick(elmntPhoneCode);
            waitForSeconds(2);
            WebElement elmntSelectPhoneCode = waitForElement(By.xpath(elmntPhoneID.replace("<<REPLACEMENT>>", strPhoneID)));
            jsClick(elmntSelectPhoneCode);
            waitForSeconds(2);
            jsScrollUp();
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterPhoneNumber(String strPhoneNumber) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElement(elmntPhoneCode);
            enterValue(txtPhoneNumber, strPhoneNumber);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPaymentOption(String strPaymentOption) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            WebElement elmntPaymentOption = waitForElement(By.xpath(elmntSelectPaymentOption.replace("<<REPLACEMENT>>", strPaymentOption)));
            jsScrollDown();
            jsScrollIntoView(elmntPaymentOption);
            jsClick(elmntPaymentOption);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean acceptThePaymentPopup() {
        boolean blResult = false;
        try {
            waitForElementToAppear(driver , By.xpath(elmntPaymentPopup1));
            waitForSeconds(4);
            waitForElement(elmntPaymentPopup);
            verifyElement(btnPaymentPopupOK);
            click(btnPaymentPopupOK);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPageNavigatedToPaymentWindow() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(6);
            compareCurrentUrlTill("https://uat.paymentexpress.com/pxmi3https://uat.paymentexpress.com/pxmi3", "i3");
            waitForSeconds(3);
            driver.switchTo().frame(CardPaymentFrame);
            System.out.println("Succesfully Switch to frame");
            waitForSeconds(3);
            blResult = verifyElement(elmntPaymentPage);
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean vreifyAmount(String strPayAmount) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            WebElement elmntAmount = waitForElement(By.xpath(elmntPayAmount.replace("<<REPLACEMENT>>", strPayAmount)));
            blResult = verifyElement(elmntAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterCardNumber(String strCardNumber) {
        boolean blResult = false;
        try {
            waitForElement(txtCardNumber);
            enterValue(txtCardNumber, strCardNumber);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterNameOnCard(String strNameOnNumber) {
        boolean blResult = false;
        try {
            waitForElement(txtCardHolderName);
            enterValue(txtCardHolderName, strNameOnNumber);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectExpiryDate() {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {

                if (System.getProperty("deviceName").equalsIgnoreCase("Galaxy A13")) {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("autoGrantPermissions", "true");
                    AppiumDriver appiumDriver = (AppiumDriver) driver;
                    Set<String> contextNames = appiumDriver.getContextHandles();
                    for (String strContextName : contextNames) {
                        if (strContextName.contains("NATIVE_APP")) {
                            appiumDriver.context("NATIVE_APP");
                            break;
                        }
                    }
                    System.out.println("Success Switch Native App");
                    capabilities.setCapability("autoGrantPermissions", "true");
                    waitForSeconds(2);
                    waitForElement(drpExpiryMonth);
                    click(drpExpiryMonth);
                    waitForSeconds(2);
                    waitForElement(strCheckedTextLocator);
                    click(strCheckedTextLocator);
                    waitForSeconds(2);
                    waitForElement(drpExpiryYear);
                    click(drpExpiryYear);
                    waitForSeconds(2);
                    waitForElement(strCheckedTextLocatoryear);
                    click(strCheckedTextLocatoryear);
                    System.out.printf("Successfully write text message");
                    Set<String> contextNames1 = appiumDriver.getContextHandles();
                    for (String strContextName : contextNames1) {
                        if (strContextName.contains("CHROMIUM")) {
                            appiumDriver.context("CHROMIUM");
                            break;
                        }
                    }

                }

            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                waitForSeconds(2);
                jsScrollUp();
                Select DateExpiryMonth = new Select(driver.findElement(By.id("DateExpiry_1")));
                DateExpiryMonth.selectByVisibleText("02");
                jsScrollUp();
                Select DateExpiryYear = new Select(driver.findElement(By.id("DateExpiry_2")));
                DateExpiryYear.selectByVisibleText("24");
                System.out.printf("Successflly select DateExpiryMonth");
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForSeconds(2);
                jsScrollUp();
                Select DateExpiryMonth = new Select(driver.findElement(By.id("DateExpiry_1")));
                DateExpiryMonth.selectByVisibleText("02");
                jsScrollUp();
                Select DateExpiryYear = new Select(driver.findElement(By.id("DateExpiry_2")));
                DateExpiryYear.selectByVisibleText("24");
                System.out.printf("Successflly select DateExpiryMonth");

            }
            waitForSeconds(2);
            waitForElement(txtCVCNumber);
            blResult = verifyElement(txtCVCNumber);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterCVCNumber(String strCVCNumber) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME,"").equalsIgnoreCase("safari")){
                Actions builder = new Actions(driver);
                builder.moveToElement(driver.findElement(By.xpath("//input[@name='Cvc2']"))).click().build().perform();
                waitForSeconds(2);
                builder.moveToElement(driver.findElement(By.xpath("//input[@name='Cvc2']"))).sendKeys(strCVCNumber).build().perform();

            }
            else {
//                waitForElement(txtCVCNumber);
//                enterValue(txtCVCNumber, strCVCNumber);
                waitForSeconds(2);
                txtCVCNumber.click();
                waitForSeconds(2);
                driver.switchTo().activeElement().sendKeys(strCVCNumber);
                waitForSeconds(2);
            }


            blResult = verifyElement(btnSubmit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSubmitPayment() {
        boolean blResult = false;
        try {
            jsScrollIntoView(btnSubmit);
            waitForElement(btnSubmit);
            jsClick(btnSubmit);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickPaymentCheckOut() {
        boolean blResult = false;
        try {
            waitForElement(elmntPaymentCheckOut);
            verifyElement(elmntSucessMessage);
            waitForSeconds(1);
            waitForElement(btnNext);
            jsScrollIntoView(btnNext);
            jsClick(btnNext);
            waitForSeconds(2);
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPaymentSucessfullMessage(List<String> lstDetails) {

        boolean blResult = false;
        try {
            for (String strDetails : lstDetails) {
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                blResult = verifyElement(elmntReservationDetails);
                waitForSeconds(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean clickCancelButtonForTheCreatedAppointment(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE : " + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;
            System.out.println("CANCEL TIME : " + strTime);
            String strConvertedTime = strTime;
//            strConvertedTime = "0" + strConvertedTime;
            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;
            System.out.println(strFinalOutDateTime);
            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            verifyElement(elmntAppointmentDetails);
            jsScrollIntoView(elmntAppointmentDetails);

            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(btnCancelForCreatedAppointment
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            verifyElement(elmntReservationDetails);
            takeScreenshot(driver);
            click(elmntReservationDetails);
            waitForSeconds(3);
            blResult = true;

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails);
                jsScrollIntoView(elmntAppointmentDetails);

                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(btnCancelForCreatedAppointment
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                verifyElement(elmntReservationDetails);
                takeScreenshot(driver);
                click(elmntReservationDetails);
                waitForSeconds(3);
                blResult = true;
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }

    public boolean entereasonForCancelAppointment() {
        boolean blResult = false;
        try {
            waitForElement(txtReasonForCancelAppointment);
            verifyElement(txtReasonForCancelAppointment);
            enterValue(txtReasonForCancelAppointment, "Cancelling My Appointment due to Unavailability");
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickCancelYourAppointment() {
        boolean blResult = false;
        try {
            verifyElement(btnConfirmCancellAppointment);
            click(btnConfirmCancellAppointment);
            waitForElement(elmntAppoinmentCancelMessage);
            driver.navigate().refresh();
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyCancelAppointmentMessage(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntfuturetab);
            jsClick(elmntfuturetab);
            waitForSeconds(2);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            System.out.println("CANCEL TIME" + strTime);

            String strConvertedTime = strTime;

//            strConvertedTime = "0" + strConvertedTime;

            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;

            System.out.println(strFinalOutDateTime);

            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            verifyElement(elmntAppointmentDetails);
            jsScrollIntoView(elmntAppointmentDetails);

            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(elmntDetailsAfterCancelingAppointment
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            verifyElement(elmntReservationDetails);
            takeScreenshot(driver);
            waitForSeconds(3);
            blResult = true;

        } catch (Exception e) {
            try {
                waitForElement(elmntfuturetab);
                jsClick(elmntfuturetab);
                waitForSeconds(2);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime);

                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails);
                jsScrollIntoView(elmntAppointmentDetails);

                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntDetailsAfterCancelingAppointment
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                verifyElement(elmntReservationDetails);
                takeScreenshot(driver);
                waitForSeconds(3);
                blResult = true;
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }

    public boolean navigateToMessagesPage(String strMessages) {
        boolean blResult = false;
        try {
            waitForElement(elmntWelcomeMessage);
            WebElement elmntBookAppointment = waitForElement(By.xpath(strMessages.replace("<<REPLACEMENT>>", strMessages)));
            click(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickMobileJoinVideoConsultingForTheCreatedAppointment(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(clickMobileFutureAppointmentTab);
            click(clickMobileFutureAppointmentTab);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            System.out.println("CANCEL TIME" + strTime);

            String strConvertedTime = strTime;

            strConvertedTime = "0" + strConvertedTime;

            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;

            System.out.println(strFinalOutDateTime);

            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            verifyElement(elmntAppointmentDetails);
            jsScrollIntoView(elmntAppointmentDetails);

            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(btnJoinVideoConsultingForCreatedAppointment
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            verifyElement(elmntReservationDetails);
            click(elmntReservationDetails);
            waitForSeconds(3);
            blResult = true;

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                waitForElement(clickMobileFutureAppointmentTab);
                click(clickMobileFutureAppointmentTab);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails);
                jsScrollIntoView(elmntAppointmentDetails);

                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(btnJoinVideoConsultingForCreatedAppointment
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                verifyElement(elmntReservationDetails);
                click(elmntReservationDetails);
                waitForSeconds(3);
                blResult = true;
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }

    public boolean clickJoinVideoConsultingForTheCreatedAppointment(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = TestDataUtil.getValue(lstDetails.get(2));
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            System.out.println("CANCEL TIME" + strTime);

            String strConvertedTime = strTime;

            strConvertedTime = "0" + strConvertedTime;

            String strFinalOutDateTime = strDateMonth + " " + strConvertedTime;

            System.out.println(strFinalOutDateTime);

            WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
            verifyElement(elmntAppointmentDetails);
            jsScrollIntoView(elmntAppointmentDetails);

            System.out.println("TEST" + lstDetails.get(1));
            WebElement elmntReservationDetails = waitForElement(By.xpath(btnJoinVideoConsultingForCreatedAppointment
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            verifyElement(elmntReservationDetails);
            click(elmntReservationDetails);
            waitForSeconds(3);
            blResult = true;

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = TestDataUtil.getValue(lstDetails.get(2));
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails);
                jsScrollIntoView(elmntAppointmentDetails);

                System.out.println("TEST" + lstDetails.get(1));
                WebElement elmntReservationDetails = waitForElement(By.xpath(btnJoinVideoConsultingForCreatedAppointment
                        .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                        .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                        .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
                System.out.println("TEST" + lstDetails.get(1));
                verifyElement(elmntReservationDetails);
                click(elmntReservationDetails);
                waitForSeconds(3);
                blResult = true;
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }
    public boolean verifySucessMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntPaymentSuccess);
            blResult = verifyElement(elmntPaymentSuccess);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void getAllAppointmentDatesInGridForMobileView() {
        listAllAppoinmentDatesInCard = new LinkedList();
        for (WebElement elmntCurrentAppoinmentDate : elmntsAppointmentDatesInGridForMobileView) {
            String strCurrentAppoinmentDate = elmntCurrentAppoinmentDate.getText();
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.substring(0, 11);
            strCurrentAppoinmentDate = strCurrentAppoinmentDate.replace(' ', '-');
            System.out.println("Current Card Appoinments Dates is:::>>" + strCurrentAppoinmentDate);
            listAllAppoinmentDatesInCard.add(strCurrentAppoinmentDate);
        }
    }

    public boolean verifyFutureAppointmentDatesInGridForMobileResponse() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInCard) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isAfter(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("Card Date is Equal::" + isDateCorrect);
            isVerifed = isDateCorrect;
            if (!isDateCorrect) {
                isVerifed = false;
            }
            if (!isVerifed) {
                break;
            }


        }
        return isVerifed;
    }

    public boolean verifyPastAppointmentDatesInGridForMobileResponse() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInCard) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isBefore(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
            System.out.println("Card Date is Before Equal::" + isDateCorrect);
            isVerifed = isDateCorrect;
            if (!isDateCorrect) {
                isVerifed = true;
            }
            if (!isVerifed) {
                break;
            }
            isVerifed=true;
        }
        return isVerifed;
    }

    public boolean verifyAppointmentIsNotForTodayPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntAppointmentsisNotForTodayPopup);
            verifyElement(elmntAppointmentsisNotForTodayPopup);
            waitForElement(btnCancel);
            jsClick(btnCancel);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickFirstVideoInvite() {
        waitForElement(elmntFirstVideoInvite);
        click(elmntFirstVideoInvite);
        waitForElement(elmntVideoInviteDetailsGrid);
        waitAndClick(elmntVideoInviteDetailsGrid);
        waitForElement(elmntVideoIconMobileView);
        click(elmntVideoIconMobileView);
    }

    public boolean cencelingAlltheAppointments() {
        boolean isVerified = false;
        try {

            waitForSeconds(3);    //wait until 'loader'  loading
            if (verifyElement(elmntCancelAppointments)) {
                List<WebElement> btnCancel = driver.findElements(By.xpath("//button[@class='mat-focus-indicator btn mat-button mat-button-base']/span[text()='Cancel Appointment']"));
                if (btnCancel.size() > 0) {
                    System.out.println("btnCancel exists and size=>" + btnCancel.size());
                    int page_no = btnCancel.size();
                    for (int i = 1; i <= btnCancel.size(); i++) {
                        if (verifyElement(elmntfuturetab)){
                            click(elmntfuturetab);

                        }else {
                            System.out.println("Already user in Future Appointments page");
                        }
                        System.out.println("TEST");
                        waitForSeconds(3);
                       WebElement cancelButton=driver.findElement(By.xpath("(//button[@class='mat-focus-indicator btn mat-button mat-button-base']/span[text()='Cancel Appointment'])[1]"));
                       jsScrollIntoView(cancelButton);
                       waitForElement(cancelButton);
                       jsClick(cancelButton);
                        System.out.println("Button No" + i);
                        waitForElement(txtReasonForCancelAppointment);
                        verifyElement(txtReasonForCancelAppointment);
                        enterValue(txtReasonForCancelAppointment, "Cancelling My Appointment due to Unavailability");
                        waitForSeconds(2);
                        verifyElement(btnConfirmCancellAppointment);
                        click(btnConfirmCancellAppointment);
                        waitForElementDisappear(driver, By.xpath(elmntSpinner));
                        verifyElement(elmntAppoinmentCancelMessage);
                        waitForElementDisappear(driver, By.xpath(elmntSpinner));
                        waitForSeconds(5);
                        isVerified = true;
                    }
                }
            } else {
                System.out.println("Into Else");
                waitForSeconds(3);
                isVerified = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean verifyCardPayAppointmentDetails(List<String> lstDetails, String strFutureDate) {
        boolean blResult = false;
        waitForSeconds(2);
        waitForElement(elmntPaymentSuccess);
        String strDatePattern1 = "EEEE, MMMM d, yyyy";
        String strDate = TestDataUtil.getValue(strFutureDate);
        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        System.out.println("DATE" + strDateValue);
        String strDateMonth = strDateValue;
        for (String strDetails : lstDetails) {
            WebElement elmntReservationDetails = waitForElement(By.xpath(eleAppointmentSummaryDetails.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
            blResult = verifyElement(elmntReservationDetails);
        }
        WebElement elmntReservationDetails = waitForElement(By.xpath(eleAppointmentSummaryDetails.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDateMonth))));
        verifyElement(elmntReservationDetails);
//        waitAndAcceptAlert();
        System.out.println("Successfully Accept Alert");
        waitForSeconds(3);
        driver.switchTo().defaultContent();
        System.out.println("Successfully default page");


        return blResult;
    }

}
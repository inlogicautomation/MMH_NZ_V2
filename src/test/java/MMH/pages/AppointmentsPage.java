package MMH.pages;

import cap.common.BasePage;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

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

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'page-content')]")
    protected WebElement elmntAppointmentPanel;

    @FindBy(how = How.XPATH, using = "//h4[text()='Let’s book the appointment.']")
    protected WebElement lblBookAppointment;

    protected String strAppointments = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@ng-reflect-name='healthCenter']")
    protected WebElement elmntHealtCenter;

    @FindBy(how = How.XPATH, using = "(//div[@class='toast toast-warning'])[1]")
    protected WebElement elmntWarningPopup;

    @FindBy(how = How.XPATH, using = "//mat-progress-spinner[@role='progressbar']")
    protected WebElement elmntSpinner;

    protected String elmntHealthCenter = new StringBuilder().append("//h6[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntLocation = new StringBuilder().append("//h6[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@ng-reflect-name='locationCenter']")
    protected WebElement elmntLocationCenter;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'cdk-overlay')]")
    protected WebElement elmntCovidPreScreeningPopup;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NO')]//parent::button")
    protected WebElement elmntDeclineCovidPreScreening;

    @FindBy(how = How.XPATH, using = "//div[@class='book-appointments-pop']")
    protected WebElement elmntAppointmentPreScreening;

    @FindBy(how = How.XPATH, using = "//span[text()='Close']//parent::button")
    protected WebElement elmntCloseAppointmentPreScreening;

    @FindBy(how = How.XPATH, using = "//mat-select[@ng-reflect-name='personData']")
    protected WebElement elmntFamilyMemberCenter;

    protected String elmntFamilyMember = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@ng-reflect-name='reason']")
    protected WebElement elmntReason;

    protected String strReasonForAppointment = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='mat-tab-link-container']")
    protected WebElement elmntBookingTypeContainer;

    @FindBy(how = How.XPATH, using = "//div[@class='doctor-list']")
    protected WebElement elmntProviderList;

    protected String elmntBookingType = new StringBuilder().append("//a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectProvider = new StringBuilder().append("//div[@class='profile']//child::p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-calendar[@class='mat-calendar']")
    protected WebElement elmntAppointmentCalendar;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Next month']")
    protected WebElement elmntCalendarNavNext;

    protected String elmntDatePicker = new StringBuilder().append("(//div[contains(text(),' ")
            .append("<<REPLACEMENT>>").append(" ')])[1]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='slot-start-time']")
    protected WebElement elmntSlotTimes;

    protected String elmntSlots = new StringBuilder().append("//mat-chip[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='Confirm']/parent::button")
    protected WebElement btnConfirm;

    @FindBy(how = How.XPATH, using = "//div[@class='payment-profile']")
    protected WebElement elmntPaymentProfile;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'checkbox')]/mat-checkbox")
    protected WebElement chkAcceptandTerms;

//    @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']//button[@ng-reflect-disabled='false']/span[text()='Confirm your booking now']")
//    protected WebElement btnConfirmYourBookingEnabled;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']//button[@ng-reflect-disabled='false']/span[text()='Confirm your booking now']"), // Without Fees
            @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']//button[@ng-reflect-disabled='false']/span[text()='Confirm & Continue']"),//With Fees
            @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']//button[@ng-reflect-disabled='false']/span[text()='Pay & Continue']"),//PayOnline

    })
    protected WebElement btnConfirmYourBookingEnabled;

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
            .append("')]/ancestor::mat-card/child::mat-card-footer/button[@ng-reflect-disabled='false']").toString();


    protected String elmntDetailsAfterCancelingAppointment = new StringBuilder().append("(//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]/ancestor::mat-card//child::div/p[contains(text(),'")
            .append("<<REPLACEMENT3>>")
            .append("')]/ancestor::mat-card/child::mat-card-footer/button[@ng-reflect-disabled='true'])[1]").toString();

//    protected String elmntFutureAppointmentDetail = new StringBuilder().append("//mat-card-title[contains(text(),'")
//            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntFutureAppointmentDetail = new StringBuilder().append("//mat-card//following-sibling::div//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]/ancestor::mat-card//child::mat-card-actions//p[contains(text(),'")
            .append("<<REPLACEMENT2>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Future Appointments')]")
    protected WebElement elmntFutureAppointmentTab;

    protected String elmntVideoBookingType = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]/preceding::input[@type='radio'][1]").toString();

    @FindBy(how = How.XPATH, using = "//i[@class='icon-list-view']")
    protected WebElement elmntGrid;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-grid-view']")
    protected WebElement elmntCard;

    @FindBy(how = How.XPATH, using = "//td[@aria-colindex='1']")
    protected List<WebElement> elmntsAppointmentDatesInGrid;

    @FindBy(how = How.XPATH, using = "//div[@class='mat-card-header-text']/mat-card-title")
    protected List<WebElement> elmntsAppointmentDatesInCard;

    @FindBy(how = How.XPATH, using = "//span[@role='listbox']")
    protected WebElement elmntDownArrow;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'20')]")
    protected WebElement elmntMaxValue;


    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Video Invitations')]")
    protected WebElement elmntVideoPage;

    @FindBy(how = How.XPATH, using = "//td[@ng-reflect-logical-col-index='1']/mat-icon[contains(text(),'videocam')]")
    protected List<WebElement> elmntsVideoIcons;

    @FindBy(how = How.XPATH, using = "(//td[@ng-reflect-logical-col-index='1']/mat-icon[contains(text(),'videocam')])[1]")
    protected WebElement elmntFirstVideoIcon;

    @FindBy(how = How.XPATH, using = "(//td[@ng-reflect-logical-col-index='1']/mat-icon[contains(text(),'videocam')])[1]")
    protected List<WebElement> elmntInsideAllIcons;

    @FindBy(how = How.XPATH, using = "//img[@title='Close']")
    protected WebElement elmntEndCall;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    protected WebElement btnYes;

    @FindBy(how = How.XPATH, using = "//mat-select[@ng-reflect-name='phoneCode']")
    protected WebElement elmntPhoneCode;

    @FindBy(how = How.XPATH, using = "//div[@class='alert-header-content']/h3[contains(text(),'Payment')]")
    protected WebElement elmntPaymentPopup;

    @FindBy(how = How.XPATH, using = "//img[@id='DpsCustomerLogo']")
    protected WebElement elmntPaymentPage;

    @FindBy(how = How.XPATH, using = "//div//span[contains(text(),'Ok')]")
    protected WebElement btnPaymentPopupOK;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='contact number']")
    protected WebElement txtPhoneNumber;

    protected String elmntPhoneID = new StringBuilder().append("//div[@role='listbox']//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSelectPaymentOption = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]/parent::button").toString();

    protected String elmntPayAmount = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@name='CardNumber']")
    protected WebElement txtCardNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='CardHolderName']")
    protected WebElement txtCardHolderName;

    @FindBy(how = How.XPATH, using = "//input[@name='Cvc2']")
    protected WebElement txtCVCNumber;

    @FindBy(how = How.XPATH, using = "//button[@name='Add']")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Payment Checkout')]")
    protected WebElement elmntPaymentCheckOut;

    @FindBy(how = How.XPATH, using = "//span[@id='Success']")
    protected WebElement elmntSucessMessage;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='reason']")
    protected WebElement txtReasonForCancelAppointment;

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
            waitForElement(elmntWelcomeMessage);
            WebElement elmntBookAppointment = waitForElement(By.xpath(strAppointments.replace("<<REPLACEMENT>>", strAppointment)));
            click(elmntBookAppointment);
            waitForElement(elmntAppointmentPanel);
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCenter(String strHealthCenter) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmntWarningPopup);
            waitForElement(elmntHealtCenter);
            waitAndClick(elmntHealtCenter);
            WebElement elmntSelectHealthCenter = waitForElementFewSeconds(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", strHealthCenter)));
            waitForSeconds(1);
            waitAndClick(elmntSelectHealthCenter);
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
            waitForElementClickable(elmntLocationCenter);
            waitForSeconds(2);
            waitAndClick(elmntLocationCenter);
            WebElement elmntSelectLocation = waitForElement(By.xpath(elmntLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitAndClick(elmntSelectLocation);
            blResult = verifyElement(elmntCovidPreScreeningPopup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean declineCovidPreScreeningPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElementClickable(elmntCovidPreScreeningPopup);
            waitAndClick(elmntDeclineCovidPreScreening);
            waitForSeconds(2);
            waitForElement(elmntAppointmentPreScreening);
            waitAndClick(elmntCloseAppointmentPreScreening);
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAppointmentIsFor(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntFamilyMemberCenter);
            waitForSeconds(2);
            waitAndClick(elmntFamilyMemberCenter);
            WebElement elmntSelectFamilyMember = waitForElementFewSeconds(By.xpath(elmntFamilyMember.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitAndClick(elmntSelectFamilyMember);
            waitForElement(elmntAppointmentPanel);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectReasonForBooking(String strReason) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntReason);
            waitAndClick(elmntReason);

            if (strReason.contains(",")) {
                String[] strReasonFor = strReason.split(",");
                for (String strReasonInHierarchy : strReasonFor) {
                    strReasonInHierarchy = strReasonInHierarchy.trim();
                    WebElement elmntReasonForAppointment = waitForElementClickable(By.xpath(strReasonForAppointment.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strReasonInHierarchy))));
                    verifyElement(elmntReasonForAppointment);
                    waitAndClick(elmntReasonForAppointment);

                }
            } else {
                WebElement elmntReasonForAppointment = waitForElementClickable(By.xpath(strReasonForAppointment.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strReason))));
                verifyElement(elmntReasonForAppointment);
                waitAndClick(elmntReasonForAppointment);
            }
            waitForSeconds(2);
            elmntReason.sendKeys(Keys.TAB);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean selectTypeOfAppointment(String strBookingType) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntBookingTypeContainer);
            WebElement elmntTypeOfAppointment = waitForElement(By.xpath(elmntBookingType.replace("<<REPLACEMENT>>", strBookingType)));
            click(elmntTypeOfAppointment);
            waitForElement(elmntSpinner);
            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFutureDateOnCalender() {
        boolean blResult = false;
        try {
            String strDatePattern1 = "d";
            String strDate = "AFTER_THREE_DAYS";

            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            jsScrollIntoView(elmntAppointmentCalendar);
            waitForElement(elmntAppointmentCalendar);
            verifyElement(elmntAppointmentCalendar);
            try {
                WebElement elmntDate = waitForElementClickable(By.xpath(elmntDatePicker.replace("<<REPLACEMENT>>", strDateValue)));
                verifyElement(elmntDate);
                waitForElement(elmntDate);
                waitForSeconds(3);
                waitAndClick(elmntDate);
            } catch (Exception e) {
                verifyElement(elmntCalendarNavNext);
                click(elmntCalendarNavNext);
                WebElement elmntDate = waitForElementClickable(By.xpath(elmntDatePicker.replace("<<REPLACEMENT>>", strDateValue)));
                verifyElement(elmntDate);
                waitForElement(elmntDate);
                waitForSeconds(3);
                waitAndClick(elmntDate);
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

            lstAvailableSlots.size();

            System.out.println("Available Slots" + lstAvailableSlots);
            strSlotDate = lstAvailableSlots.get(1).getText();
            System.out.println("Slot Date" + strSlotDate);
            waitAndClick(lstAvailableSlots.get(1));

//            for (int i = 1; i <= lstAvailableSlots.size(); i++) {
//                lstAvailableSlots.get(i).click();
//            }

            takeScreenshot(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickConfirmButton() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnConfirm);
            click(btnConfirm);
            waitForSeconds(10);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyDetailsOfCreatedAppointment(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntPaymentProfile);
            String strDatePattern1 = "dd/MM/yyyy";
            String strDate = "AFTER_THREE_DAYS";
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
                waitForElement(elmntPaymentProfile);
                String strDatePattern1 = "dd/MM/yyyy";
                String strDate = "AFTER_THREE_DAYS";
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntAppointmentDetail.replace("<<REPLACEMENT>>", strDateValue)));
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
            waitForSeconds(2);
            waitForElement(elmntPaymentProfile);
            verifyElement(btnConfirmYourBookingEnabled);
            click(btnConfirmYourBookingEnabled);
            waitForSeconds(4);
//            blResult = verifyElement(elmntFutureAppointmentTab);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean acceptTermsAndConditionsForAppointment() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntPaymentProfile);
            waitForElementClickable(chkAcceptandTerms);
            click(chkAcceptandTerms);
            blResult = verifyElement(btnConfirmYourBookingEnabled);

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
            String strDate = "AFTER_THREE_DAYS";
            String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
            System.out.println("DATE" + strDateValue);

            String strDateMonth = strDateValue;
            String strTime = strSlotDate;

            String strConvertedTime = strTime;

            strConvertedTime = "0" + strConvertedTime;

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
            blResult = verifyElement(elmntReservationDetails);

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = "AFTER_THREE_DAYS";
                String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
                System.out.println("DATE" + strDateValue);
                String strDateMonth = strDateValue;
                String strTime = strSlotDate;
                String strFinalOutDateTime = strDateMonth + " " + strTime;
                System.out.println(strFinalOutDateTime);
                WebElement elmntAppointmentDetails = waitForElement(By.xpath(elmntFutureAppointmentDetail.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0))));
                verifyElement(elmntAppointmentDetails);
                jsScrollIntoView(elmntAppointmentDetails);
                WebElement elmntReservationDetails = waitForElement(By.xpath(elmntAppointmentDetailInFutureAppoinments.replace("<<REPLACEMENT1>>", strFinalOutDateTime).replace("<<REPLACEMENT2>>", lstDetails.get(0).replace("<<REPLACEMENT3>>", lstDetails.get(1)))));
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
            waitForElement(elmntBookingTypeContainer);
            WebElement elmntTypeOfVideoAppointment = waitForElement(By.xpath(elmntVideoBookingType.replace("<<REPLACEMENT>>", strTypeOfVideoAppointment)));
            waitForSeconds(2);
            jsClick(elmntTypeOfVideoAppointment);
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
            waitForSeconds(2);
            waitForElement(elmntProviderList);
            WebElement elmntProvider = waitForElement(By.xpath(elmntSelectProvider.replace("<<REPLACEMENT>>", strProvider)));
            waitForSeconds(2);
            jsClick(elmntProvider);
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

    public boolean verifyHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<TAB>>", strHeader)));
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }

    public void clickCardView() {
        waitForSeconds(6);
        waitForElement(elmntCard);
        click(elmntCard);
        waitForSeconds(15);
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
        if (elmntsAppointmentDatesInCard.size() != 0) {
            isVerifed = true;
        }
        return isVerifed;
    }

    public boolean verifyGridView() {
        boolean isVerifed = false;
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

    public boolean verifyAllAppointmentDatesInGridForPast() {
        boolean isVerifed = false;
        for (String strDate : listAllAppoinmentDatesInGrid) {
            LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate inputDate1 = LocalDate.parse(strDate, dtf1);
            boolean isDateCorrect = inputDate1.isBefore(localDate1);
            if (!isDateCorrect) {
                isDateCorrect = inputDate1.isEqual(localDate1);
            }
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

    public void clickMaxvalue() {
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
        waitForElements(elmntsVideoIcons);
        int countVideoIcons = elmntsVideoIcons.size();
        int countTotalRow = elmntsAppointmentDatesInGrid.size();
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
        click(elmntEndCall);
        waitForSeconds(4);
        waitForElement(btnYes);
        click(btnYes);
    }

    public boolean selectPhoneCode(String strPhoneID) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElement(elmntPhoneCode);
            click(elmntPhoneCode);
            waitForSeconds(2);
            WebElement elmntSelectPhoneCode = waitForElement(By.xpath(elmntPhoneID.replace("<<REPLACEMENT>>", strPhoneID)));
            click(elmntSelectPhoneCode);
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
            click(elmntPaymentOption);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean acceptThePaymentPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElement(elmntPaymentPopup);
            verifyElement(btnPaymentPopupOK);
            click(btnPaymentPopupOK);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPageNavigatedToPaymentWindow() {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            compareCurrentUrlTill("https://uat.paymentexpress.com/pxmi3https://uat.paymentexpress.com/pxmi3", "i3");
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
            Select DateExpiryMonth = new Select(driver.findElement(By.id("DateExpiry_1")));
            DateExpiryMonth.selectByVisibleText("02");

            Select DateExpiryYear = new Select(driver.findElement(By.id("DateExpiry_2")));
            DateExpiryYear.selectByVisibleText("24");

            blResult = verifyElement(txtCVCNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterCVCNumber(String strCVCNumber) {
        boolean blResult = false;
        try {
            waitForElement(txtCVCNumber);
            enterValue(txtCVCNumber, strCVCNumber);
            waitForSeconds(2);
            blResult = verifyElement(btnSubmit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSubmitPayment() {
        boolean blResult = false;
        try {
            waitForElement(btnSubmit);
            click(btnSubmit);
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
            waitForElement(btnNext);
            click(btnNext);
            waitForSeconds(2);
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
            String strDate = "AFTER_THREE_DAYS";
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
            WebElement elmntReservationDetails = waitForElement(By.xpath(btnCancelForCreatedAppointment
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
                String strDate = "AFTER_THREE_DAYS";
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
            waitForElement(elmntFutureAppointmentTab);
            String strDatePattern1 = "dd MMM yyyy";
            String strDate = "AFTER_THREE_DAYS";
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
            WebElement elmntReservationDetails = waitForElement(By.xpath(elmntDetailsAfterCancelingAppointment
                    .replace("<<REPLACEMENT1>>", strFinalOutDateTime)
                    .replace("<<REPLACEMENT2>>", lstDetails.get(0))
                    .replace("<<REPLACEMENT3>>", lstDetails.get(1))));
            System.out.println("TEST" + lstDetails.get(1));
            verifyElement(elmntReservationDetails);;
            waitForSeconds(3);
            blResult = true;

        } catch (Exception e) {
            try {
                waitForSeconds(2);
                waitForElement(elmntFutureAppointmentTab);
                String strDatePattern1 = "dd MMM yyyy";
                String strDate = "AFTER_THREE_DAYS";
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
                verifyElement(elmntReservationDetails);;
                waitForSeconds(3);
                blResult = true;
                blResult = true;
            } catch (Exception d) {
                e.printStackTrace();
            }

        }
        return blResult;
    }
}
package Happy_Path_Patient_Mobile_App.screens;

import cap.common.BaseScreen;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppointmentsScreen extends BaseScreen {
    public static String strTimeSlot;

    public AppointmentsScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointments']")
    @iOSXCUITFindBy(id = "Appointments")
    protected WebElement elmntAppointments;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Future']")
    @iOSXCUITFindBy(id = "Future")
    protected WebElement elmntFuture;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Past']")
    @iOSXCUITFindBy(id = "Past")
    protected WebElement elmntPast;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Book Appointment']")
    @iOSXCUITFindBy(id = "Book Appointment")
    protected WebElement btnBookAppointment;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select location']")
    @iOSXCUITFindBy(id = "Select location")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointment Pre-Screening']")
    @iOSXCUITFindBy(id = "Appointment Pre-Screening")
    protected WebElement elmntAppointmentPreScreening;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NO']")
    @iOSXCUITFindBy(id = "No")
    protected WebElement btnNO;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select Provider']")
    @iOSXCUITFindBy(id = "Select Provider")
    protected WebElement elmntSelectProvider;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Visit']")
    @iOSXCUITFindBy(id = "Visit")
    protected WebElement elmntVisit;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'AM') or contains(@text,'PM')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'AM') or contains(@name,'PM')]")
    protected List<WebElement> lstAvailableTimeSlot;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'AM') or contains(@name,'PM')]")
    protected WebElement elmntTime;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
    @iOSXCUITFindBy(id = "Continue")
    protected WebElement btnContinue;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointment reason']")
    @iOSXCUITFindBy(id = "Appointment reason")
    protected WebElement elmntAppointmentReason;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm Appointment']")
    @iOSXCUITFindBy(id = "Confirm Appointment")
    protected WebElement elmntConfirmAppointment;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ToggleButton[contains(@text,'terms and conditions')])[1]"),
            @AndroidBy(xpath = "(//android.widget.CheckBox[contains(@text,'terms and conditions')])[1]")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[contains(@name,'terms and conditions')]")
    protected WebElement toggleTermsAndConditions;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND APPOINTMENT REQUEST']")
    @iOSXCUITFindBy(id = "Send Appointment Request")
    protected WebElement btnSendAppointmentRequest;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='PAY AT HEALTH CENTRE']")
    @iOSXCUITFindBy(id = "Pay at Health Centre")
    protected WebElement btnPayHealthCentre;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Options']")
    @iOSXCUITFindBy(id = "Payment Options")
    protected WebElement elmntPaymentOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[contains(@text,'Your appointment request for')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Information']//following::XCUIElementTypeStaticText[contains(@name,'Your appointment request for')]")
    protected WebElement popUpAppointmentInfo;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(id = "OK")
    protected WebElement popUpOk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
    @iOSXCUITFindBy(id = "Services")
    protected WebElement elmntServicesHeader;

    @AndroidFindBy(xpath = "(//android.view.View[@text='medkit Services'])[1]")
    @iOSXCUITFindBy(id = "medkit Services")
    protected WebElement elmntServicesIcon;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='pin']/following::android.widget.TextView[contains(@text,'Repeat prescriptions')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='pin']//following::XCUIElementTypeStaticText[@name='Repeat prescriptions']")
    protected WebElement elmntRepeatPrescriptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Number*']/following::android.widget.EditText")
    @iOSXCUITFindBy(id = "Contact Number *")
    protected WebElement txtContactNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Now']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Pay Now']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'$')]")
    protected WebElement elmntAmountInPaymentOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Now']/following::android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Pay Now']/following:: XCUIElementTypeButton[1]")
    protected WebElement btnPayNow;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[contains(@text,'All payments made are collected')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Information']/following::XCUIElementTypeStaticText[contains(@name,'All payments made are collected')]")
    protected WebElement popUpPaymentInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'$')]")
    protected WebElement elmntAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Checkout']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Payment Checkout'])[1]")
    protected WebElement elmntPaymentCheckout;

    @AndroidFindBy(xpath = "//android.view.View[@text='Card Number: required']/following-sibling::android.view.View//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Card Number:']/following::XCUIElementTypeTextField[1]")
    protected WebElement txtCardNumber;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Name On Card:']/following::android.view.View//following::android.widget.EditText)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Name On Card:']/following::XCUIElementTypeTextField[1]")
    protected WebElement txtCardName;

    @AndroidFindBy(xpath = "//android.view.View[@text='CVC:']/following-sibling::android.view.View//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='CVC:']/following::XCUIElementTypeTextField[1]")
    protected WebElement txtCVC;

    @AndroidFindBy(xpath = "//android.view.View[@text='MM']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Expiry Date (MM)']/following-sibling::XCUIElementTypeOther[1]")
    protected WebElement drpExpiryMonth;

    @AndroidFindBy(xpath = "//android.view.View[@text='YY']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Expiry Date (YY)']/following-sibling::XCUIElementTypeOther[1]")
    protected WebElement drpExpiryYear;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    @iOSXCUITFindBy(id = "Submit")
    protected WebElement btnSubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction Approved']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Transaction Approved'])[2]")
    protected WebElement elmntTransactionApproved;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Next']")
    @iOSXCUITFindBy(id = "Next")
    protected WebElement btnNext;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Staus: Approved')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Staus:']/following-sibling::XCUIElementTypeStaticText[@name='Approved']")
    protected WebElement elmntStatusApproved;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    @iOSXCUITFindBy(id = "Continue")
    protected WebElement btnContinueInPayment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reason for cancellation*']/following::android.widget.EditText")
    @iOSXCUITFindBy(id = "//TODO")
    protected WebElement txtReasonForCancellation;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL APPOINTMENT']")
    @iOSXCUITFindBy(id = "//TODO")
    protected WebElement btnCancelAppointment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation']")
    @iOSXCUITFindBy(id = "//TODO")
    protected WebElement popUpConfirmation;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(id = "//TODO")
    protected WebElement btnYes;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appointment has been cancelled successfully.']")
    @iOSXCUITFindBy(id = "//TODO")
    protected WebElement popUpCancelledSuccessfully;

    @AndroidFindBy(xpath = "//TODO")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'20')]")
    protected WebElement elmntAppointmentDate;

    @iOSXCUITFindBy(id = "Done")
    protected WebElement btnDone;

    String strButtonTextLocator = new StringBuilder()
            .append("//android.widget.Button[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strButtonTextLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeButton[@name='")
            .append("<<TEXT>>").append("']").toString();

    String strCheckedTextLocator = new StringBuilder()
            .append("//android.widget.CheckedTextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strStaticTextLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<TEXT>>").append("']").toString();

    String strLocationLocator = new StringBuilder()
            .append("//android.widget.Image/preceding-sibling::android.view.View/android.widget.TextView[@text='")
            .append("<<LOCATION>>").append("']").toString();

    String strLocationLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeImage[@name='cart']/preceding::XCUIElementTypeStaticText[@name='")
            .append("<<LOCATION>>").append("'][1]").toString();

    String strRadioButtonTextLocator = new StringBuilder()
            .append("//android.widget.RadioButton[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strOtherTextLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeOther[@name='")
            .append("<<TEXT>>").append("']").toString();

    String strVisitAppointmentDetailsLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<DATE>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<STATUS>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<PROVIDER>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<LOCATION>>")
            .append("']/following::android.widget.TextView[contains(@text,'")
            .append("<<PAYMENTSTATUS>>")
            .append("')]/following::android.widget.TextView[@text='")
            .append("<<REASON>>")
            .append("']").toString();

    String strVisitAppointmentDetailsLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<DATE>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<STATUS>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<PROVIDER>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<LOCATION>>")
            .append("']/following::XCUIElementTypeStaticText[contains(@name,'")
            .append("<<PAYMENTSTATUS>>")
            .append("')]/following::XCUIElementTypeStaticText[@name='")
            .append("<<REASON>>")
            .append("']").toString();

    String strPhoneAppointmentDetailsLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<DATE>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<STATUS>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<PHONE>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<PROVIDER>>")
            .append("']/following::android.widget.TextView[@text='")
            .append("<<LOCATION>>")
            .append("']/following::android.widget.TextView[contains(@text,'")
            .append("<<PAYMENTSTATUS>>")
            .append("')]/following::android.widget.TextView[@text='")
            .append("<<REASON>>")
            .append("']").toString();

    String strPhoneAppointmentDetailsLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<DATE>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<STATUS>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<PHONE>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<PROVIDER>>")
            .append("']/following::XCUIElementTypeStaticText[@name='")
            .append("<<LOCATION>>")
            .append("']/following::XCUIElementTypeStaticText[contains(@name,'")
            .append("<<PAYMENTSTATUS>>")
            .append("')]/following::XCUIElementTypeStaticText[@name='")
            .append("<<REASON>>")
            .append("']").toString();


    public boolean verifyFutureAndPastTab() {
        waitForElement(elmntAppointments);
        waitForElement(elmntFuture);
        takeScreenshot(driver);
        return verifyElement(elmntFuture) && verifyElement(elmntPast);
    }

    public void tapTabInBookAppointment(String strTab) {
        waitForElement(elmntAppointments);
        WebElement elmntTab = waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strTab)));
        click(elmntTab);
    }

    public void tapBookAppointmentButton() {
        waitForElement(elmntAppointments);
        waitForElement(elmntFuture);
        click(elmntFuture);
        waitForElementIgnoreStale(btnBookAppointment);
        waitForSecond(5);
        click(btnBookAppointment);
    }

    public void selectLocation(String strLocation) {
        waitForSecond(10);
        System.out.println("Location: " + strLocation);
        attachStepLog("Location", strLocation);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocator.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void tapNoInAppointmentPreScreening() {
        waitForSecond(5);
        waitForElement(elmntAppointmentPreScreening);
        waitForElement(btnNO);
        click(btnNO);
    }

    public void selectProvider(String strProvider) {
        System.out.println("Provider: " + strProvider);
        attachStepLog("Provider", strProvider);
        waitForElement(elmntSelectProvider);
        WebElement elmntProvider = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strProvider)));
        click(elmntProvider);
    }

    public void selectAppointmentDate(String strProvider, String strFutureDate) {
        waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strProvider)));
        String strDatePattern1 = "MMMM E d";
        String strDate = strFutureDate;
        waitForElement(elmntVisit);

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        System.out.println("DATE: " + strDateValue);
        WebElement elmntDate = waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strDateValue)));
        click(elmntDate);
    }

    public void selectAppointmentOption(String strAppointment) {
        System.out.println("Appointment: " + strAppointment);
        attachStepLog("Appointment", strAppointment);
        waitForElement(elmntVisit);
        waitForElements(lstAvailableTimeSlot);
        waitForSecond(2);
        WebElement elmntAppointment = waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strAppointment)));
        click(elmntAppointment);
    }


    public void selectAvailableTimeSlot() {
        waitForElement(elmntVisit);
        waitForSecond(2);
        waitForElements(lstAvailableTimeSlot);
        System.out.println("Available Slots " + lstAvailableTimeSlot.size());
        strTimeSlot = lstAvailableTimeSlot.get(0).getText().trim();
        System.out.println("Slot Date: " + strTimeSlot);
        waitForElement(lstAvailableTimeSlot.get(0));
        click(lstAvailableTimeSlot.get(0));
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void selectAvailableTimeSlotIOS() {
        waitForElement(elmntVisit);
        waitForElement(elmntTime);
        System.out.println("Available Slots " + lstAvailableTimeSlot.size());
        strTimeSlot = lstAvailableTimeSlot.get(0).getText().trim();
        System.out.println("Slot Date: " + strTimeSlot);
        waitForElement(lstAvailableTimeSlot.get(0));
        click(lstAvailableTimeSlot.get(0));
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void selectReason(String strReason) {
        System.out.println("Reason: " + strReason);
        attachStepLog("Reason", strReason);
        waitForElementIgnoreStale(elmntAppointmentReason);
        waitForElement(elmntAppointmentReason);
        WebElement elmntReason = waitForElement(By.xpath(strRadioButtonTextLocator.replace("<<TEXT>>", strReason)));
        click(elmntReason);
        waitForElement(btnContinue);
        click(btnContinue);
    }


    public boolean verifyDetailsOfConfirmAppointment(List<String> lstDetails, String strFutureDate) {
        boolean blResult = false;
        waitForElementIgnoreStale(elmntConfirmAppointment);
//        waitForElement(elmntConfirmAppointment);

        String strDatePattern1 = "EEEE";
        String strDatePattern2 = "dd MMMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        String strDateValue2 = DateUtil.getDate(strDate, strDatePattern2);

        if (!(strTimeSlot.contains("10:") || strTimeSlot.contains("11:") || strTimeSlot.contains("12:"))) {
            strTimeSlot = "0" + strTimeSlot.trim();
            System.out.println("Append 0: " + strTimeSlot);
        }
        strDateValue = strDateValue + " " + strTimeSlot;
        System.out.println("Appointment Time: " + strDateValue);
        System.out.println("Appointment Date: " + strDateValue2);


        lstDetails.add(strDateValue);
        lstDetails.add(strDateValue2);


        waitForSecond(5);
        for (String strDetails : lstDetails) {
            WebElement elmntAppointmentDetails = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", TestDataUtil.getValue(strDetails))));
            blResult = verifyElement(elmntAppointmentDetails);
            if (blResult == false) {
                return blResult;
            }
        }
        takeScreenshot(driver);
        waitForElement(toggleTermsAndConditions);
        click(toggleTermsAndConditions);
        return blResult;
    }

    public void tapSendAppointmentRequest() {
        waitForSecond(3);
        waitForElement(btnSendAppointmentRequest);
        click(btnSendAppointmentRequest);
    }

    public void tapPayHealthCentre() {
        waitForSecond(5);
        waitForElement(elmntPaymentOptions);
        waitForElement(btnPayHealthCentre);
        tapCooridinatesByElement(btnPayHealthCentre);
    }

    public boolean verifyAppointmentInformation() {
        waitForElement(popUpAppointmentInfo);
        System.out.println("Information: " + popUpAppointmentInfo.getText());
        attachStepLog("Information", popUpAppointmentInfo.getText());
        takeScreenshot(driver);
        return verifyElement(popUpAppointmentInfo);
    }

    public void tapOK() {
        waitForSecond(3);
        waitForElement(popUpOk);
        click(popUpOk);
    }

    public static By elmntAppointmentDetails = null;

    public boolean verifyCreatedAppointmentInServiceTab(List<String> lstDetails, String strFutureDate, String strAppointment) {
        waitForElement(elmntServicesHeader);

        String strDatePattern1 = "dd MMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        strDateValue = strDateValue + " " + strTimeSlot.trim();
        System.out.println("Appointment Time: " + strDateValue);
        attachStepLog("Appointment Time", strDateValue);
        lstDetails.add(strDateValue);

        waitForSecond(180);

        reLaunchAppAndroid();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(8);
        swipeUp();
        waitForSecond(2);
        swipeDown();
        waitForSecond(2);


        if (strAppointment.equals("VISIT")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strVisitAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(3))
                    .replace("<<REASON>>", lstDetails.get(4)));

            System.out.println(strVisitAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(3))
                    .replace("<<REASON>>", lstDetails.get(4)));

        } else if (strAppointment.equals("PHONE") || strAppointment.equals("VIDEO")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strPhoneAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(5)));


            System.out.println(By.xpath(strPhoneAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(5))));
        }

        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntAppointmentDetails))) {
            swipeUpShort();
            if (verifyElementWithoutWait(elmntRepeatPrescriptions)) {
                System.out.println("Loop Break 1");
                break;
            }
            if (!exitLoop(6000000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntAppointmentDetails);
    }

    public void enterContactNumber(String strContactNumber) {
        waitForElementIgnoreStale(elmntConfirmAppointment);
        waitForSecond(2);
        waitForElement(txtContactNumber);
        enterValue(txtContactNumber, strContactNumber);
    }

    public void enterContactNumberIOS(String strContactNumber) {
        waitForElementIgnoreStale(elmntConfirmAppointment);
        waitForSecond(2);
        waitForElement(txtContactNumber);
        enterValue(txtContactNumber, strContactNumber);
        waitForElement(btnDone);
        click(btnDone);
    }


    public boolean verifyPaymentOptions() {
        waitForSecond(5);
        waitForElementIgnoreStale(elmntPaymentOptions);
        waitForElement(elmntPaymentOptions);
        return verifyElement(elmntPaymentOptions);
    }

    public static String strAmount;

    public void tapPayNow() {
        waitForElement(elmntPaymentOptions);
        waitForElement(elmntAmountInPaymentOption);
        strAmount = elmntAmountInPaymentOption.getText().trim();
        strAmount = strAmount.replaceAll("\\s", "");
        System.out.println("Amount: " + strAmount);
        waitForElement(btnPayNow);
        tapCooridinatesByElement(btnPayNow);
    }

    public boolean verifyPaymentInformation() {
        waitForSecond(4);
        waitForElement(popUpPaymentInfo);
        System.out.println("Payment Information: " + popUpPaymentInfo.getText());
        attachStepLog("Payment Information", popUpPaymentInfo.getText());
        return verifyElement(popUpPaymentInfo);
    }

    public void enterCardNumber(String strCardNumber) {
        waitForElement(elmntPaymentCheckout);
        waitForElement(elmntAmount);
        attachStepLog("Amount", elmntAmount.getText());
        System.out.println("Amount: " + elmntAmount.getText());
        waitForSecond(2);
        waitForElement(txtCardNumber);
        enterValue(txtCardNumber, strCardNumber);
    }

    public void enterCardName(String strCardName) {
        waitForElement(txtCardName);
        enterValue(txtCardName, strCardName);
    }

    public void selectExpiryDate(String strMonth, String strYear) {
        waitForElement(drpExpiryMonth);
        click(drpExpiryMonth);

        WebElement elmntMonth = waitForElement(By.xpath(strCheckedTextLocator.replace("<<TEXT>>", strMonth)));
        click(elmntMonth);

        click(drpExpiryYear);
        WebElement elmntYear = waitForElement(By.xpath(strCheckedTextLocator.replace("<<TEXT>>", strYear)));
        click(elmntYear);
    }

    public void enterCVCNumber(String strCVC) {
        waitForElement(txtCVC);
        enterValue(txtCVC, strCVC);
        enterValue(txtCVC, strCVC);
    }

    public void tapSubmit() {
        waitForElement(btnSubmit);
        click(btnSubmit);
    }

    public boolean verifyTransactionApproved() {
        waitForElement(elmntTransactionApproved);
        takeScreenshot(driver);
        return verifyElement(elmntTransactionApproved);
    }

    public boolean verifyPaymentStatus() {
        waitForElement(btnNext);
        click(btnNext);
        waitForElement(elmntStatusApproved);
        attachStepLog("Payment Status: ", elmntStatusApproved.getText());
        System.out.println("Payment Status: " + elmntStatusApproved.getText());
        takeScreenshot(driver);
        return verifyElement(elmntStatusApproved);
    }

    public void tapContinue() {
        waitForElement(btnContinueInPayment);
        click(btnContinueInPayment);
    }

    public boolean verifyCreatedPaymentAppointmentInServiceTab(List<String> lstDetails, String strFutureDate, String strAppointment) {
        waitForElement(elmntServicesHeader);

        String strDatePattern1 = "dd MMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        strDateValue = strDateValue + " " + strTimeSlot.trim();
        System.out.println("Appointment Time: " + strDateValue);
        attachStepLog("Appointment Time", strDateValue);

        lstDetails.add(strAmount);
        lstDetails.add(strDateValue);

        waitForSecond(180);

        reLaunchAppAndroid();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(8);
        swipeUp();
        waitForSecond(2);
        swipeDown();
        waitForSecond(2);

//        By elmntAppointmentDetails = null;

        if (strAppointment.equals("VISIT")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strVisitAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(3)));

            System.out.println(By.xpath(strVisitAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(3))));

        } else if (strAppointment.equals("PHONE") || strAppointment.equals("VIDEO")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strPhoneAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(5))
                    .replace("<<REASON>>", lstDetails.get(4)));

            System.out.println(By.xpath(strPhoneAppointmentDetailsLocator
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(5))
                    .replace("<<REASON>>", lstDetails.get(4))));
        }

        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntAppointmentDetails))) {
            swipeUpShort();
            if (verifyElementWithoutWait(elmntRepeatPrescriptions)) {
                System.out.println("Loop Break 1");
                break;
            }
            if (!exitLoop(6000000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntAppointmentDetails);
    }

    public boolean verifyConfirmAppointment() {
        waitForElementIgnoreStale(elmntConfirmAppointment);
        waitForElement(elmntConfirmAppointment);
        return verifyElement(elmntConfirmAppointment);
    }

    public boolean verifyServiceScreen() {
        waitForElement(elmntServicesHeader);
        return verifyElement(elmntServicesHeader);
    }

    public void tapCancelAppointment() {
        waitForElement(elmntServicesHeader);
        System.out.println("Cancel: " + elmntAppointmentDetails);
        waitForElement(elmntAppointmentDetails);
        click(elmntAppointmentDetails);
        waitForElement(txtReasonForCancellation);
        takeScreenshot(driver);
        enterValue(txtReasonForCancellation, "Test Cancel");
        swipeUp();
        waitForElement(btnCancelAppointment);
        tapCooridinatesByElement(btnCancelAppointment);
    }

    public boolean verifyCancelMessage() {
        waitForElement(popUpConfirmation);
        takeScreenshot(driver);
        waitForElement(btnYes);
        click(btnYes);
        waitForElement(popUpCancelledSuccessfully);
        takeScreenshot(driver);
        return verifyElement(popUpCancelledSuccessfully);
    }

    public void selectLocationIOS(String strLocation) {
        waitForSecond(5);
        System.out.println("Location: " + strLocation);
        attachStepLog("Location", strLocation);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocatorIOS.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void selectProviderIOS(String strProvider) {
        System.out.println("Provider: " + strProvider);
        attachStepLog("Provider", strProvider);
        waitForElement(elmntSelectProvider);
        WebElement elmntProvider = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", strProvider)));
        click(elmntProvider);
    }

    public void selectAppointmentDateIOS(String strProvider, String strFutureDate) {
        waitForElement(By.xpath(strButtonTextLocatorIOS.replace("<<TEXT>>", strProvider)));
        String strDatePattern1 = "MMMM E d";
        String strDate = strFutureDate;
        waitForElement(elmntVisit);

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        System.out.println("DATE: " + strDateValue);
        WebElement elmntDate = waitForElement(By.xpath(strButtonTextLocatorIOS.replace("<<TEXT>>", strDateValue)));
        click(elmntDate);
    }

    public void selectAppointmentOptionIOS(String strAppointment) {
        System.out.println("Appointment: " + strAppointment);
        attachStepLog("Appointment", strAppointment);
        waitForElement(elmntVisit);
        waitForElements(lstAvailableTimeSlot);
        waitForSecond(2);
        WebElement elmntAppointment = waitForElement(By.xpath(strButtonTextLocatorIOS.replace("<<TEXT>>", strAppointment)));
        click(elmntAppointment);
    }

    public void selectReasonIOS(String strReason) {
        System.out.println("Reason: " + strReason);
        attachStepLog("Reason", strReason);
        waitForElementIgnoreStale(elmntAppointmentReason);
        waitForElement(elmntAppointmentReason);
        WebElement elmntReason = waitForElement(By.xpath(strOtherTextLocatorIOS.replace("<<TEXT>>", strReason)));
        click(elmntReason);
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void selectExpiryDateIOS(String strMonth, String strYear) {
        waitForElement(drpExpiryMonth);
        click(drpExpiryMonth);

        WebElement elmntMonth = waitForElement(By.xpath(strButtonTextLocatorIOS.replace("<<TEXT>>", strMonth)));
        click(elmntMonth);

        click(drpExpiryYear);
        WebElement elmntYear = waitForElement(By.xpath(strButtonTextLocatorIOS.replace("<<TEXT>>", strYear)));
        click(elmntYear);
    }

    public boolean verifyCreatedAppointmentInServiceTabIOS(List<String> lstDetails, String strFutureDate, String strAppointment) {
        waitForSecond(2);
        waitForElementIgnoreStale(elmntServicesHeader);

        String strDatePattern1 = "dd MMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        strDateValue = strDateValue + " " + strTimeSlot.trim();
        System.out.println("Appointment Time: " + strDateValue);
        attachStepLog("Appointment Time", strDateValue);
        lstDetails.add(strDateValue);

        waitForSecond(180);

        reLaunchAppIOS();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(2);
        waitForElement(elmntAppointmentDate);


        if (strAppointment.equals("VISIT")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strVisitAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(3))
                    .replace("<<REASON>>", lstDetails.get(4)));

            System.out.println(strVisitAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(3))
                    .replace("<<REASON>>", lstDetails.get(4)));

        } else if (strAppointment.equals("PHONE") || strAppointment.equals("VIDEO")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strPhoneAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(5)));


            System.out.println(By.xpath(strPhoneAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(5))));
        }

        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntAppointmentDetails))) {
            swipeUpShort();
            if (verifyElementWithoutWait(elmntRepeatPrescriptions)) {
                System.out.println("Loop Break 1");
                break;
            }
            if (!exitLoop(6000000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntAppointmentDetails);
    }

    public boolean verifyDetailsOfConfirmAppointmentIOS(List<String> lstDetails, String strFutureDate) {
        boolean blResult = false;
        waitForElementIgnoreStale(elmntConfirmAppointment);
//        waitForElement(elmntConfirmAppointment);

        String strDatePattern1 = "EEEE";
        String strDatePattern2 = "dd MMMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        String strDateValue2 = DateUtil.getDate(strDate, strDatePattern2);

        if (!(strTimeSlot.contains("10:") || strTimeSlot.contains("11:") || strTimeSlot.contains("12:"))) {
            strTimeSlot = "0" + strTimeSlot.trim();
            System.out.println("Append 0: " + strTimeSlot);
        }
        strDateValue = strDateValue + " " + strTimeSlot;
        System.out.println("Appointment Time: " + strDateValue);
        System.out.println("Appointment Date: " + strDateValue2);


        lstDetails.add(strDateValue);
        lstDetails.add(strDateValue2);


        waitForSecond(5);
        for (String strDetails : lstDetails) {
            WebElement elmntAppointmentDetails = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", TestDataUtil.getValue(strDetails))));
            blResult = verifyElement(elmntAppointmentDetails);
            if (blResult == false) {
                return blResult;
            }
        }
        takeScreenshot(driver);
        waitForElement(toggleTermsAndConditions);
        click(toggleTermsAndConditions);
        return blResult;
    }


    public boolean verifyCreatedPaymentAppointmentInServiceTabIOS(List<String> lstDetails, String strFutureDate, String strAppointment) {
        waitForSecond(2);
        waitForElementIgnoreStale(elmntServicesHeader);

        String strDatePattern1 = "dd MMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        strDateValue = strDateValue + " " + strTimeSlot.trim();
        System.out.println("Appointment Time: " + strDateValue);
        attachStepLog("Appointment Time", strDateValue);

        lstDetails.add(strAmount);
        lstDetails.add(strDateValue);

        waitForSecond(180);

        reLaunchAppIOS();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(2);
        waitForElement(elmntAppointmentDate);

        if (strAppointment.equals("VISIT")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strVisitAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(3)));

            System.out.println(By.xpath(strVisitAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(5))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PROVIDER>>", lstDetails.get(1))
                    .replace("<<LOCATION>>", lstDetails.get(2))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(4))
                    .replace("<<REASON>>", lstDetails.get(3))));

        } else if (strAppointment.equals("PHONE") || strAppointment.equals("VIDEO")) {
            System.out.println("Enter " + strAppointment);
            elmntAppointmentDetails = By.xpath(strPhoneAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(5))
                    .replace("<<REASON>>", lstDetails.get(4)));

            System.out.println(By.xpath(strPhoneAppointmentDetailsLocatorIOS
                    .replace("<<DATE>>", lstDetails.get(6))
                    .replace("<<STATUS>>", lstDetails.get(0))
                    .replace("<<PHONE>>", lstDetails.get(1))
                    .replace("<<PROVIDER>>", lstDetails.get(2))
                    .replace("<<LOCATION>>", lstDetails.get(3))
                    .replace("<<PAYMENTSTATUS>>", lstDetails.get(5))
                    .replace("<<REASON>>", lstDetails.get(4))));
        }

        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntAppointmentDetails))) {
            swipeUpShort();
            if (verifyElementWithoutWait(elmntRepeatPrescriptions)) {
                System.out.println("Loop Break 1");
                break;
            }
            if (!exitLoop(6000000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntAppointmentDetails);
    }
}

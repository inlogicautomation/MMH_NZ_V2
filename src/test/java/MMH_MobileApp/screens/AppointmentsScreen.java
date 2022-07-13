package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AppointmentsScreen extends BaseScreen {
    public static String strTimeSlot;

    public AppointmentsScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointments']")
    protected WebElement elmntAppointments;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Future']")
    protected WebElement elmntFuture;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Past']")
    protected WebElement elmntPast;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Book Appointment']")
    protected WebElement btnBookAppointment;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select location']")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointment Pre-Screening']")
    protected WebElement elmntAppointmentPreScreening;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NO']")
    protected WebElement btnNO;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select Provider']")
    protected WebElement elmntSelectProvider;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Visit']")
    protected WebElement elmntVisit;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'AM') or contains(@text,'PM')]")
    protected List<WebElement> lstAvailableTimeSlot;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
    protected WebElement btnContinue;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Appointment reason']")
    protected WebElement elmntAppointmentReason;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm Appointment']")
    protected WebElement elmntConfirmAppointment;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ToggleButton[contains(@text,'terms and conditions')])[1]"),
            @AndroidBy(xpath = "(//android.widget.CheckBox[contains(@text,'terms and conditions')])[1]")
    })
    protected WebElement toggleTermsAndConditions;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND APPOINTMENT REQUEST']")
    protected WebElement btnSendAppointmentRequest;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='PAY AT HEALTH CENTRE']")
    protected WebElement btnPayHealthCentre;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Options']")
    protected WebElement elmntPaymentOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[contains(@text,'Your appointment request for')]")
    protected WebElement popUpAppointmentInfo;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    protected WebElement popUpOk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
    protected WebElement elmntServicesHeader;

    @AndroidFindBy(xpath = "(//android.view.View[@text='medkit Services'])[1]")
    protected WebElement elmntServicesIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Approved']")
    protected WebElement test;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='pin']/following::android.widget.TextView[contains(@text,'Repeat prescriptions')]")
    protected WebElement elmntRepeatPrescriptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Number*']/following::android.widget.EditText")
    protected WebElement txtContactNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Now']/following-sibling::android.widget.TextView")
    protected WebElement elmntAmountInPaymentOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Now']/following::android.widget.Button[1]")
    protected WebElement btnPayNow;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[contains(@text,'All payments made are collected')]")
    protected WebElement popUpPaymentInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
    protected WebElement elmntAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Checkout']")
    protected WebElement elmntPaymentCheckout;

    @AndroidFindBy(xpath = "//android.view.View[@text='Card Number:*']/following-sibling::android.view.View//android.widget.EditText")
    protected WebElement txtCardNumber;

    @AndroidFindBy(xpath = "//android.view.View[@text='Name On Card:*']/following-sibling::android.view.View//android.widget.EditText")
    protected WebElement txtCardName;

    @AndroidFindBy(xpath = "//android.view.View[@text='CVC:']/following-sibling::android.view.View//android.widget.EditText")
    protected WebElement txtCVC;

    @AndroidFindBy(xpath = "//android.view.View[@text='MM']")
    protected WebElement drpExpiryMonth;

    @AndroidFindBy(xpath = "//android.view.View[@text='YY']")
    protected WebElement drpExpiryYear;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    protected WebElement btnSubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction Approved']")
    protected WebElement elmntTransactionApproved;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Next']")
    protected WebElement btnNext;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Staus: Approved')]")
    protected WebElement elmntStatusApproved;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    protected WebElement btnContinueInPayment;

    String strButtonTextLocator = new StringBuilder()
            .append("//android.widget.Button[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strCheckedTextLocator = new StringBuilder()
            .append("//android.widget.CheckedTextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strLocationLocator = new StringBuilder()
            .append("//android.widget.Image/preceding-sibling::android.view.View/android.widget.TextView[@text='")
            .append("<<LOCATION>>").append("']").toString();

    String strRadioButtonTextLocator = new StringBuilder()
            .append("//android.widget.RadioButton[@text='")
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
        waitForElement(btnBookAppointment);
        click(btnBookAppointment);
    }

    public void tapLocation(String strLocation) {
        System.out.println("Location: " + strLocation);
        attachStepLog("Location", strLocation);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocator.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void tapNoInAppointmentPreScreening() {
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

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        System.out.println("DATE: " + strDateValue);
        WebElement elmntDate = waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strDateValue)));
        click(elmntDate);
    }

    public void selectAppointmentOption(String strAppointment) {
        System.out.println("Appointment: " + strAppointment);
        attachStepLog("Appointment", strAppointment);
        waitForElement(elmntVisit);
        waitForSecond(8);
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
        waitForElement(elmntConfirmAppointment);

        String strDatePattern1 = "EEEE";
        String strDatePattern2 = "dd MMMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        String strDateValue2 = DateUtil.getDate(strDate, strDatePattern2);

        if (!(strTimeSlot.contains("10:") || strTimeSlot.contains("11:") || strTimeSlot.contains("12:"))) {
            System.out.println("Append 0: " + strTimeSlot);
            strTimeSlot = "0" + strTimeSlot.trim();
        }
        strDateValue = strDateValue + " " + strTimeSlot;
        System.out.println("Appointment Time: " + strDateValue);
        System.out.println("Appointment Date: " + strDateValue2);


        lstDetails.add(strDateValue);
        lstDetails.add(strDateValue2);


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
        waitForElement(popUpOk);
        click(popUpOk);
    }


    public boolean verifyCreatedAppointmentInServiceTab(List<String> lstDetails, String strFutureDate, String strAppointment) {
        waitForElement(elmntServicesHeader);

        String strDatePattern1 = "dd MMM yyyy";
        String strDate = strFutureDate;

        String strDateValue = DateUtil.getDate(strDate, strDatePattern1);
        strDateValue = strDateValue + " " + strTimeSlot.trim();
        System.out.println("Appointment Time: " + strDateValue);
        attachStepLog("Appointment Time", strDateValue);
        lstDetails.add(strDateValue);

        waitForSecond(80);

        reLaunchAppAndroid();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(8);
        swipeUp();
        waitForSecond(2);
        swipeDown();
        waitForSecond(2);

        By elmntAppointmentDetails = null;


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
            if (!exitLoop(600000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntAppointmentDetails);
    }

    public void enterContactNumber(String strContactNumber) {
        waitForElementIgnoreStale(elmntConfirmAppointment);
        waitForElement(elmntConfirmAppointment);
        waitForElement(txtContactNumber);
        enterValue(txtContactNumber, strContactNumber);
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

        waitForSecond(80);

        reLaunchAppAndroid();
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        System.out.println("Before Swipe");
        waitForSecond(8);
        swipeUp();
        waitForSecond(2);
        swipeDown();
        waitForSecond(2);

        By elmntAppointmentDetails = null;

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
            if (!exitLoop(600000, startTime)) {
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
}

package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatRequestPrescriptionScreen extends BaseScreen {

    public RepeatRequestPrescriptionScreen(WebDriver driver) {
        super(driver);
    }

    public static String strTransactionRef = null;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat Prescriptions']")
    protected WebElement elmntRepeatPrescriptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Location']")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Provider']")
    protected WebElement elmntSelectProvider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Medications']")
    protected WebElement elmntSelectMedications;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
    protected WebElement btnContinue;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
    protected WebElement elmntAmount;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Checkout']")
    protected WebElement elmntPaymentCheckout;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Pickup Method/Urgency']")
    protected WebElement elmntPickupMethodUrgency;

    @AndroidFindBy(xpath = "//android.view.View[@text='Customer number:*']/following-sibling::android.view.View//android.widget.EditText")
    protected WebElement txtBoxCustomerNumber;

    @AndroidFindBy(xpath = "//android.view.View[@text='Password:*']/following-sibling::android.view.View//android.widget.EditText")
    protected WebElement txtBoxPassword;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select pickup method']")
    protected WebElement elmntSelectPickupMethod;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select script urgency']")
    protected WebElement elmntSelectScriptUrgency;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat prescription request']")
    protected WebElement elmntRepeatPrescriptionRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Message*']/following::android.widget.EditText")
    protected WebElement txtMessage;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ToggleButton[contains(@text,'terms and conditions')])[1]"),
            @AndroidBy(xpath = "(//android.widget.CheckBox[contains(@text,'terms and conditions')])[1]")
    })
    protected WebElement toggleTermsAndConditions;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND PRESCRIPTION REQUEST']")
    protected WebElement btnSendPrescriptionRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[@text='Repeat prescription request sent successfully!']")
    protected WebElement popUpRepeatPrescriptionRequestInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
    protected WebElement elmntServicesHeader;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='sync']/following::android.view.View[1]")
    protected WebElement elmntSyncView;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat prescription status']")
    protected WebElement elmntRepeatPrescriptionStatus;

    @AndroidFindBy(xpath = "(//android.view.View[@text='medkit Services'])[1]")
    protected WebElement elmntServicesIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select Pharmacy']")
    protected WebElement elmntSelectPharmacyHearder;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Find A Pharmacy']")
    protected WebElement elmntFindAPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Suburb/Town*']")
    protected WebElement elmntSelectSuburbTown;

    @AndroidFindBy(xpath = "(//android.view.View[@text])[1]")
    protected WebElement elmntTownAndPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Pharmacy*']")
    protected WebElement elmntSelectPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Select Payment Method')]/following-sibling::android.view.View")
    protected WebElement elmntAccount2Account;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'NEXT')]")
    protected WebElement btnNextInA2A;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to pharmacy list']")
    protected WebElement elmntPharmacyList;

    @AndroidFindBy(xpath = "(//android.widget.CheckBox)[1]")
    protected WebElement chkPharmacy;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    protected WebElement btnContinueInPharmacy;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select Delivery Address']")
    protected WebElement elmntSelectDeliveryAddress;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add Delivery Address']")
    protected WebElement elmntAddDeliveryAddress;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@text,'Home')])[1]")
    protected WebElement rdoHome;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Unit No')]/following::android.widget.EditText[1]")
    protected WebElement txtUnitNo;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Street')]/following::android.widget.EditText[1])[2]")
    protected WebElement txtStreet;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'City')]/following::android.widget.EditText[1]")
    protected WebElement txtCity;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select an account you would like us to deduct your payment from:')]")
    protected WebElement txtSelectAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Account2Account Payment')]")
    protected WebElement txtAccount2Account;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SELECT']")
    protected WebElement btnSelect;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to address list']")
    protected WebElement elmntBackToAddress;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Next']"),
            @FindBy(how = How.XPATH, using = "//android.widget.Button[@text='NEXT']")
    })
    protected WebElement btnNext;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Success')]")
    protected WebElement txtPaymentSuccess;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Staus: Approved')]")
    protected WebElement elmntStatusApproved;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I have read and accepted the')]")
    protected WebElement chkBoxTermsAndCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter the A2A test credentials:')]")
    protected WebElement txtEnterCredentials;
    ;


    String strViewPickUpMethodTextLocator = new StringBuilder()
            .append("(//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']/following::android.widget.TextView[@text='View'])[1]").toString();


    String strContainsTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strLocationLocator = new StringBuilder()
            .append("//android.widget.Image/preceding-sibling::android.view.View/android.widget.TextView[@text='")
            .append("<<LOCATION>>").append("']").toString();

    String strRadioButtonTextLocator = new StringBuilder()
            .append("//android.widget.RadioButton[@text='")
            .append("<<TEXT>>").append("']").toString();

    //android.widget.RadioButton[contains(@text,'ANZ')]
    String rdoBtnSelectBank = new StringBuilder()
            .append("//android.widget.RadioButton[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();

    //android.widget.RadioButton[contains(@text,'Payment Success')]
    String rdoBtnSelectBankAccount = new StringBuilder()
            .append("//android.widget.RadioButton[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strContainsRadioButtonTextLocator = new StringBuilder()
            .append("//android.widget.RadioButton[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();

    String strContainsCheckedTextLocator = new StringBuilder()
            .append("//android.widget.CheckBox[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();


    public void selectLocation(String strLocation) {
        System.out.println("Location: " + strLocation);
        attachStepLog("Location", strLocation);
        waitForSecond(4);
        waitForElementIgnoreStale(elmntRepeatPrescriptions);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocator.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void selectProvider(String strProvider) {
        System.out.println("Provider: " + strProvider);
        attachStepLog("Provider", strProvider);
        waitForElement(elmntSelectProvider);
        WebElement elmntProvider = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strProvider)));
        click(elmntProvider);
    }

    public void selectMedications(String strMedications) {
        System.out.println("Medications: " + strMedications);
        attachStepLog("Medications", strMedications);
        waitForElement(elmntSelectMedications);
        WebElement elmntMedications = waitForElement(By.xpath(strContainsCheckedTextLocator.replace("<<TEXT>>", strMedications)));
        click(elmntMedications);
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void selectPickUpMethod(String strPickUpMethod) {
        System.out.println("PickUpMethod: " + strPickUpMethod);
        attachStepLog("PickUpMethod", strPickUpMethod);
        waitForElement(elmntSelectPickupMethod);
        waitForElement(elmntPickupMethodUrgency);
        WebElement elmntPickUpMethod = waitForElement(By.xpath(strRadioButtonTextLocator.replace("<<TEXT>>", strPickUpMethod)));
        click(elmntPickUpMethod);
    }

    public static String strAmount = null;

    public void selectUrgency(String strUrgency) {
        System.out.println("Urgency: " + strUrgency);
        attachStepLog("Urgency", strUrgency);
        waitForElement(elmntSelectScriptUrgency);
        WebElement elmntUrgency = waitForElement(By.xpath(strContainsRadioButtonTextLocator.replace("<<TEXT>>", strUrgency)));

        String strUrgencyAmount = elmntUrgency.getText().trim();

        Matcher matcher = Pattern.compile("\\d+.00").matcher(strUrgencyAmount);

        while (matcher.find()) {
            strAmount = matcher.group();
            strAmount = strAmount.split("00")[0];
            System.out.println("Amount: " + strAmount);
        }

        click(elmntUrgency);
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void enterMessage(String strMessage) {
        System.out.println("Message: " + strMessage);
        attachStepLog("Message", strMessage);
        waitForElement(elmntRepeatPrescriptionRequest);
        takeScreenshot(driver);
        swipeUp();
        waitForElement(txtMessage);
        enterValue(txtMessage, strMessage);
    }

    public void tapTermsAndConditions() {
        waitForSecond(2);
        waitForElement(toggleTermsAndConditions);
        click(toggleTermsAndConditions);
    }

    public void tapSendPrescriptionRequest() {
        waitForSecond(5);
        waitForElement(btnSendPrescriptionRequest);
        click(btnSendPrescriptionRequest);
    }
    public boolean selectAccountToAccount() {
        waitForSecond(5);
        waitForElement(elmntPaymentCheckout);
        waitForElement(elmntAccount2Account);
        waitForElementClickable(elmntAccount2Account);
        click(elmntAccount2Account);
        waitForElement(txtAccount2Account);
        return verifyElement(txtAccount2Account);
    }

    public boolean selectBank(String strBank) {
        waitForElement(txtAccount2Account);
        System.out.println("Xpath for bank >>> :: "+rdoBtnSelectBank.replace("<<TEXT>>",strBank));
        WebElement bank = waitForElement(By.xpath(rdoBtnSelectBank.replace("<<TEXT>>",strBank)));
        waitForElement(bank);
        waitForElementClickable(bank);
        click(bank);
        swipeUpShort();
        waitForElement(chkBoxTermsAndCondition);
        waitForElementClickable(chkBoxTermsAndCondition);
        click(chkBoxTermsAndCondition);
        clickNext();
        waitForElement(txtEnterCredentials);
        return verifyElement(txtEnterCredentials);
    }

    public boolean verifyRepeatPrescriptionRequestInformation() {
        waitForElement(popUpRepeatPrescriptionRequestInfo);
        System.out.println("RPR Information: " + popUpRepeatPrescriptionRequestInfo.getText());
        attachStepLog("RPR Information", popUpRepeatPrescriptionRequestInfo.getText());
        takeScreenshot(driver);
        return verifyElement(popUpRepeatPrescriptionRequestInfo);
    }

    public boolean verifyRPStatus(List<String> lstRPDetails) {
        boolean blResult = false;

        waitForElement(elmntServicesHeader);
        waitForSecond(3);
        waitForElement(elmntServicesIcon);
        click(elmntServicesIcon);

        long startTime = System.currentTimeMillis();
        while (!(verifyElementWithoutWait(elmntSyncView))) {
            swipeUp();
            swipeUp();
            swipeUp();
            swipeUp();
            if (!exitLoop(600000, startTime)) {
                System.out.println("Loop Break 1");
                break;
            }
        }
        swipeUp();
        click(elmntSyncView);
        waitForElement(elmntRepeatPrescriptionStatus);

        waitForSecond(6);

        WebElement elmntPickUpMethod = waitForElement(By.xpath(strViewPickUpMethodTextLocator.replace("<<TEXT>>", lstRPDetails.get(0))));
        click(elmntPickUpMethod);

        strAmount = "NZ$" + strAmount + "00";

        lstRPDetails.add(strAmount);

        if (strTransactionRef != null) {
            lstRPDetails.add(strTransactionRef);
        }

        for (String strRecordDetail : lstRPDetails) {
            WebElement elmntRPDetail = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strRecordDetail)));
            blResult = verifyElement(elmntRPDetail);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public void selectPharmacy(List<String> lstPharmacy) {
        waitForSecond(5);
        waitForElementIgnoreStale(elmntSelectPharmacyHearder);
        click(elmntFindAPharmacy);

        System.out.println("City: " + lstPharmacy.get(0));

        WebElement elmntCity = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", lstPharmacy.get(0))));
        click(elmntCity);


        waitForElement(elmntSelectSuburbTown);
        waitForElement(elmntTownAndPharmacy);
        System.out.println("Town: " + elmntTownAndPharmacy.getText().trim());
        click(elmntTownAndPharmacy);
        waitForElement(elmntSelectPharmacy);
        waitForElement(elmntTownAndPharmacy);
        System.out.println("Pharmacy: " + elmntTownAndPharmacy.getText().trim());
        click(elmntTownAndPharmacy);
        waitForElement(elmntPharmacyList);
        waitForElement(chkPharmacy);
        click(chkPharmacy);
        takeScreenshot(driver);
        waitForElement(btnContinueInPharmacy);
        click(btnContinueInPharmacy);
    }

    public void selectMedByPharmacy(List<String> lstPharmacy) {
//        waitForElementIgnoreStale(elmntSelectDeliveryAddress);
        waitForSecond(5);
        click(elmntFindAPharmacy);

        System.out.println("City: " + lstPharmacy.get(0));

        WebElement elmntCity = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", lstPharmacy.get(0))));
        waitForSecond(2);
        waitForElementIgnoreStale(elmntCity);
        click(elmntCity);

        waitForElement(elmntPharmacyList);
        waitForElement(chkPharmacy);
        takeScreenshot(driver);
        click(chkPharmacy);
        waitForElement(btnContinueInPharmacy);
        click(btnContinueInPharmacy);

        waitForElement(elmntSelectDeliveryAddress);
        waitForElement(elmntAddDeliveryAddress);
        click(elmntAddDeliveryAddress);
        waitForElement(rdoHome);
//        click(rdoHome);
        waitForElement(txtUnitNo);
        enterValue(txtUnitNo, lstPharmacy.get(1));
        enterValue(txtStreet, lstPharmacy.get(2));
        enterValue(txtCity, lstPharmacy.get(3));
        waitForElement(btnSelect);
        click(btnSelect);
        waitForElement(elmntBackToAddress);
        waitForElement(chkPharmacy);
        click(chkPharmacy);
        takeScreenshot(driver);
        waitForElement(btnContinueInPharmacy);
        click(btnContinueInPharmacy);
    }


    public boolean verifyPaymentStatus() {
        waitForSecond(5);
        waitForElement(btnNext);
        click(btnNext);
        waitForElementIgnoreStale(elmntStatusApproved);
        attachStepLog("Payment Status: ", elmntStatusApproved.getText());
        System.out.println("Payment Status: " + elmntStatusApproved.getText());

        String strPaymentStatus = elmntStatusApproved.getText().trim();
        Matcher matcher = Pattern.compile("(\\d+)-(\\d+)-(\\d+)-(\\d+)").matcher(strPaymentStatus);

        while (matcher.find()) {
            strTransactionRef = matcher.group();
            System.out.println("Transaction Ref: " + strTransactionRef);
            attachStepLog("Transaction Ref", strTransactionRef);
        }
        takeScreenshot(driver);
        return verifyElement(elmntStatusApproved);
    }

    public void selectDeliveryAddress(List<String> lstPharmacy) {
        waitForElementIgnoreStale(elmntSelectDeliveryAddress);

        waitForElement(elmntSelectDeliveryAddress);
        waitForElement(elmntAddDeliveryAddress);
        click(elmntAddDeliveryAddress);
        waitForElement(rdoHome);
//        click(rdoHome);
        waitForElement(txtUnitNo);
        enterValue(txtUnitNo, lstPharmacy.get(0));
        enterValue(txtStreet, lstPharmacy.get(1));
        enterValue(txtCity, lstPharmacy.get(2));
        waitForElement(btnSelect);
        click(btnSelect);
        waitForElement(elmntBackToAddress);
        waitForElement(chkPharmacy);
        click(chkPharmacy);
        takeScreenshot(driver);
        waitForElement(btnContinueInPharmacy);
        click(btnContinueInPharmacy);
    }

    public void enterCustomerNumber(String strCustomerNumber) {
        try {
            waitForElement(elmntPaymentCheckout);
            waitForElement(elmntAmount);
            attachStepLog("Amount", elmntAmount.getText());
            System.out.println("Amount: " + elmntAmount.getText());
            waitForSecond(2);
            waitForElement(txtBoxCustomerNumber);
            enterValue(txtBoxCustomerNumber, strCustomerNumber);
        }

        catch (Exception e){
            System.out.println("Failed to enter CustomerNumber >>> :: ");
            e.printStackTrace();
        }
    }

    public void enterPassword(String strPassword) {

        try {
            waitForElement(elmntPaymentCheckout);
            waitForSecond(2);
            waitForElement(txtBoxPassword);
            enterValue(txtBoxPassword, strPassword);
        }

        catch (Exception e){
            System.out.println("Failed to enter Password >>> :: ");
            e.printStackTrace();
        }
    }
//    public boolean clickNext() {
//        boolean blResult=false;
//
//        try {
//            waitForElement(txtEnterCredentials);
//            waitForSecond(2);
//            waitForElement(btnNext);
//            click(btnNext);
//            waitForElement()
//            blResult=verifyElement();
//        }
//
//        catch (Exception e){
//            System.out.println("Failed to enter Password >>> :: ");
//            e.printStackTrace();
//        }
//        return blResult;
//    }

    public boolean clickNext() {
        boolean blResult=false;

        try {
            waitForSecond(5);
            waitForElement(btnNext);
            click(btnNext);
            blResult=true;
        }
        catch (Exception e){
            System.out.println("Failed to click btnNext >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickContinue() {
        boolean blResult=false;

        try {
            waitForSecond(2);
            waitForElement(btnContinue);
            click(btnContinue);
            blResult=true;
        }

        catch (Exception e){
            System.out.println("Failed to click btnContinue >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectBankAccount(String strBank) {
        boolean blResult=false;

        try {
            waitForSecond(2);
            waitForElement(txtSelectAccount);
            WebElement account= waitForElement(By.xpath(rdoBtnSelectBankAccount.replace("<<TEXT>>",strBank)));
            waitForElement(account);
            click(account);
            swipeUpShort();
            blResult=true;
        }

        catch (Exception e){
            System.out.println("Failed to enter Password >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }



}

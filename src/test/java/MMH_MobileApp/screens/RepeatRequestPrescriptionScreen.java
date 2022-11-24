package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatRequestPrescriptionScreen extends BaseScreen {

    public RepeatRequestPrescriptionScreen(WebDriver driver) {
        super(driver);
    }

    public static String strTransactionRef = null;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat Prescriptions']")
    @iOSXCUITFindBy(id = "Repeat Prescriptions")
    protected WebElement elmntRepeatPrescriptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Location']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Location']")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Provider']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Provider']")
    protected WebElement elmntSelectProvider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Medications']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Medications']")
    protected WebElement elmntSelectMedications;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
    @iOSXCUITFindBy(id = "Continue")
    protected WebElement btnContinue;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'$')])[1]")
    protected WebElement elmntAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Checkout']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Payment Checkout'])[1]")
    protected WebElement elmntPaymentCheckout;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Pickup Method/Urgency']")
//    @iOSXCUITFindBy(id = "")
    protected WebElement elmntPickupMethodUrgency;

    @AndroidFindBy(xpath = "//android.view.View[@text='Customer number:*']/following-sibling::android.view.View//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Customer number:']/following:: XCUIElementTypeTextField")
    protected WebElement txtBoxCustomerNumber;

    @AndroidFindBy(xpath = "//android.view.View[@text='Password:*']/following-sibling::android.view.View//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Password:']/following:: XCUIElementTypeSecureTextField")
    protected WebElement txtBoxPassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select pickup method']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select pickup method']")
    protected WebElement elmntSelectPickupMethod;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select script urgency']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select script urgency']")
    protected WebElement elmntSelectScriptUrgency;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat prescription request']")
    @iOSXCUITFindBy(id = "Repeat prescription request")
    protected WebElement elmntRepeatPrescriptionRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Message*']/following::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Message\"]")
    protected WebElement txtMessage;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ToggleButton[contains(@text,'terms and conditions')])[1]"),
            @AndroidBy(xpath = "(//android.widget.CheckBox[contains(@text,'terms and conditions')])[1]")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[contains(@name,'terms and conditions')]")
    protected WebElement toggleTermsAndConditions;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND PRESCRIPTION REQUEST']")
    @iOSXCUITFindBy(id = "Send prescription request")
    protected WebElement btnSendPrescriptionRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']/following-sibling::android.widget.TextView[@text='Repeat prescription request sent successfully!']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Information']/following::XCUIElementTypeStaticText[@name='Repeat prescription request sent successfully!']")
    protected WebElement popUpRepeatPrescriptionRequestInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
    @iOSXCUITFindBy(id = "Services")
    protected WebElement elmntServicesHeader;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='sync']/following::android.view.View[1]")
    @iOSXCUITFindBy(id = "sync")
    protected WebElement elmntSyncView;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Repeat prescription status']")
    @iOSXCUITFindBy(id = "Repeat prescription status")
    protected WebElement elmntRepeatPrescriptionStatus;

    @AndroidFindBy(xpath = "(//android.view.View[@text='medkit Services'])[1]")
    @iOSXCUITFindBy(id = "medkit Services")
    protected WebElement elmntServicesIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Pharmacy']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Pharmacy']")
    protected WebElement elmntSelectPharmacyHearder;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Find A Pharmacy']")
    @iOSXCUITFindBy(id = "Find A Pharmacy")
    protected WebElement elmntFindAPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Suburb/Town*']")
    @iOSXCUITFindBy(id = "Select Suburb/Town*")
    protected WebElement elmntSelectSuburbTown;

    @AndroidFindBy(xpath = "(//android.view.View[@text])[1]")
//    @iOSXCUITFindBy(id = "")
    protected WebElement elmntTownAndPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Pharmacy*']")
    @iOSXCUITFindBy(id = "Select Pharmacy*")
    protected WebElement elmntSelectPharmacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Select Payment Method')]/following-sibling::android.view.View")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Account2Account']")
    protected WebElement elmntAccount2Account;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to pharmacy list']")
    @iOSXCUITFindBy(id = "Back to pharmacy list")
    protected WebElement elmntPharmacyList;

    @AndroidFindBy(xpath = "(//android.widget.CheckBox)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[1]")
    protected WebElement chkPharmacy;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    @iOSXCUITFindBy(id = "Continue")
    protected WebElement btnContinueInPharmacy;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Select Delivery Address']")
    @iOSXCUITFindBy(id = "Select Delivery Address")
    protected WebElement elmntSelectDeliveryAddress;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add Delivery Address']")
    @iOSXCUITFindBy(id = "Add Delivery Address")
    protected WebElement elmntAddDeliveryAddress;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@text,'Home')])[1]")
    @iOSXCUITFindBy(id = "Work")
    protected WebElement rdoHome;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Unit No')]/following::android.widget.EditText[1]")
    @iOSXCUITFindBy(id = "Unit No *")
    protected WebElement txtUnitNo;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Street')]/following::android.widget.EditText[1])[2]")
    @iOSXCUITFindBy(id = "Street *")
    protected WebElement txtStreet;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'City')]/following::android.widget.EditText[1]")
    @iOSXCUITFindBy(id = "City *")
    protected WebElement txtCity;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select an account you would like us to deduct your payment from:')]")
    protected WebElement txtSelectAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Account2Account Payment')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account2Account Payment']")
    protected WebElement txtAccount2Account;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SELECT']")
    @iOSXCUITFindBy(id = "Select")
    protected WebElement btnSelect;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to address list']")
    @iOSXCUITFindBy(id = "Back to address list")
    protected WebElement elmntBackToAddress;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@content-desc='Next']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='NEXT']")
    })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeLink[@name='Next']"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name='NEXT']")
    })
    protected WebElement btnNext;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Success')]")
    protected WebElement txtPaymentSuccess;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Staus: Approved')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Staus:']/following-sibling::XCUIElementTypeStaticText[@name='Approved']")
    protected WebElement elmntStatusApproved;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I have read and accepted the')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='I have read and accepted the']")
    protected WebElement chkBoxTermsAndCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter the A2A test credentials:')]")
    @iOSXCUITFindBy(id = "Please enter the A2A test credentials:")
    protected WebElement txtEnterCredentials;

    @iOSXCUITFindBy(id = "Done")
    protected WebElement btnDone;


    String strViewPickUpMethodTextLocator = new StringBuilder()
            .append("(//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']/following::android.widget.TextView[@text='View'])[1]").toString();


    String strViewPickUpMethodTextLocatorIOS = new StringBuilder()
            .append("(//XCUIElementTypeStaticText[@name='")
            .append("<<TEXT>>").append("']//following::XCUIElementTypeStaticText[@name='View'])[1]").toString();


    String strContainsTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strContainsTextViewLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[contains(@name,\"")
            .append("<<TEXT>>").append("\")]").toString();

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

    //android.widget.RadioButton[contains(@text,'ANZ')]
    String rdoBtnSelectBank = new StringBuilder()
            .append("//android.widget.RadioButton[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();

    String strRdoBtnSelectBankIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<TEXT>>").append("']").toString();

    //android.widget.RadioButton[contains(@text,'Payment Success')]
    String rdoBtnSelectBankAccount = new StringBuilder()
            .append("//android.widget.RadioButton[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strContainsRadioButtonTextLocator = new StringBuilder()
            .append("//android.widget.RadioButton[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();

    String strContainsOtherTextLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeOther[contains(@name,'")
            .append("<<TEXT>>").append("')]").toString();

    String strContainsCheckedTextLocator = new StringBuilder()
            .append("//android.widget.CheckBox[contains(@text,'")
            .append("<<TEXT>>").append("')]").toString();

    String strContainsSwitchTextLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeSwitch[contains(@name,'")
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

    public void selectLocationIOS(String strLocation) {
        System.out.println("Location: " + strLocation);
        attachStepLog("Location", strLocation);
        waitForSecond(4);
        waitForElementIgnoreStale(elmntRepeatPrescriptions);
        waitForElement(elmntSelectLocation);
        System.out.println("elmntLocation>> "+By.xpath(strLocationLocatorIOS.replace("<<LOCATION>>", strLocation)));
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocatorIOS.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void selectProvider(String strProvider) {
        System.out.println("Provider: " + strProvider);
        attachStepLog("Provider", strProvider);
        waitForElement(elmntSelectProvider);
        WebElement elmntProvider = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strProvider)));
        click(elmntProvider);
    }

    public void selectProviderIOS(String strProvider) {
        System.out.println("Provider: " + strProvider);
        attachStepLog("Provider", strProvider);
        waitForElement(elmntSelectProvider);
        System.out.println("elmntProvider>> "+By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", strProvider)));
        WebElement elmntProvider = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", strProvider)));
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

    public void selectMedicationsIOS(String strMedications) {
        System.out.println("Medications: " + strMedications);
        attachStepLog("Medications", strMedications);
        waitForElement(elmntSelectMedications);
        System.out.println("elmntMedications>> "+By.xpath(strContainsCheckedTextLocator.replace("<<TEXT>>", strMedications)));
        WebElement elmntMedications = waitForElement(By.xpath(strContainsSwitchTextLocatorIOS.replace("<<TEXT>>", strMedications)));
        click(elmntMedications);
        waitForElement(btnContinue);
        click(btnContinue);
    }

    public void selectPickUpMethod(String strPickUpMethod) {
        System.out.println("PickUpMethod: " + strPickUpMethod);
        attachStepLog("PickUpMethod", strPickUpMethod);
        waitForElement(elmntSelectPickupMethod);
//        waitForElement(elmntPickupMethodUrgency);
        WebElement elmntPickUpMethod = waitForElement(By.xpath(strRadioButtonTextLocator.replace("<<TEXT>>", strPickUpMethod)));
        click(elmntPickUpMethod);
    }

    public void selectPickUpMethodIOS(String strPickUpMethod) {
        System.out.println("PickUpMethod: " + strPickUpMethod);
        attachStepLog("PickUpMethod", strPickUpMethod);
        waitForElement(elmntSelectPickupMethod);
//        waitForElement(elmntPickupMethodUrgency);
        System.out.println("elmntPickUpMethod>> "+By.xpath(strOtherTextLocatorIOS.replace("<<TEXT>>", strPickUpMethod)));
        WebElement elmntPickUpMethod = waitForElement(By.xpath(strOtherTextLocatorIOS.replace("<<TEXT>>", strPickUpMethod)));
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

    public void selectUrgencyIOS(String strUrgency) {
        System.out.println("Urgency: " + strUrgency);
        attachStepLog("Urgency", strUrgency);
        waitForElement(elmntSelectScriptUrgency);
        System.out.println("elmntUrgency>> "+By.xpath(strContainsOtherTextLocatorIOS.replace("<<TEXT>>", strUrgency)));
        WebElement elmntUrgency = waitForElement(By.xpath(strContainsOtherTextLocatorIOS.replace("<<TEXT>>", strUrgency)));

        String strUrgencyAmount = elmntUrgency.getAttribute("name");

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
        if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            waitForElement(btnDone);
            click(btnDone);
        }

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

    public void selectAccountToAccountIOS() {
        waitForElement(elmntPaymentCheckout);
        waitForSecond(4);
        tapCooridinatesByElement(elmntAccount2Account);
        tapByCoordinates(284,447);

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

    public boolean selectBankIOS(String strBank) {
//        waitForElement(txtAccount2Account);
        System.out.println("Xpath for bank >>> :: "+strRdoBtnSelectBankIOS.replace("<<TEXT>>",strBank));
        WebElement bank = waitForElement(By.xpath(strRdoBtnSelectBankIOS.replace("<<TEXT>>",strBank)));
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

        waitForElementIgnoreStale(elmntServicesHeader);
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

        waitForSecond(3);

        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            WebElement elmntPickUpMethod = waitForElement(By.xpath(strViewPickUpMethodTextLocator.replace("<<TEXT>>", lstRPDetails.get(0))));
            click(elmntPickUpMethod);
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            WebElement elmntPickUpMethod = waitForElement(By.xpath(strViewPickUpMethodTextLocatorIOS.replace("<<TEXT>>", lstRPDetails.get(0))));
            click(elmntPickUpMethod);
        }

        strAmount = "NZ$" + strAmount + "00";

        lstRPDetails.add(strAmount);

        if (strTransactionRef != null) {
            lstRPDetails.add(strTransactionRef);
        }

        for (String strRecordDetail : lstRPDetails) {
            if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
                WebElement elmntRPDetail = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strRecordDetail)));
                blResult = verifyElement(elmntRPDetail);
            } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
                WebElement elmntRPDetail = waitForElement(By.xpath(strContainsTextViewLocatorIOS.replace("<<TEXT>>", strRecordDetail)));
                blResult = verifyElement(elmntRPDetail);
            }

            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public void selectPharmacy(List<String> lstPharmacy) {
        waitForSecond(4);
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

    public void selectPharmacyIOS(List<String> lstPharmacy) {
        waitForElementIgnoreStale(elmntSelectPharmacyHearder);
        waitForSecond(6);
        click(elmntFindAPharmacy);

        System.out.println("City: " + lstPharmacy.get(0));
        WebElement elmntCity = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", lstPharmacy.get(0))));
        click(elmntCity);
        waitForElement(elmntSelectSuburbTown);
//        waitForElement(elmntTownAndPharmacy);
//        System.out.println("Town: " + elmntTownAndPharmacy.getText().trim());
        WebElement elmntTown = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", lstPharmacy.get(1))));
        click(elmntTown);
//        click(elmntTownAndPharmacy);
        waitForElement(elmntSelectPharmacy);
        WebElement elmntPharmacy = waitForElement(By.xpath(strContainsTextViewLocatorIOS.replace("<<TEXT>>", lstPharmacy.get(2))));
        click(elmntPharmacy);
//        waitForElement(elmntTownAndPharmacy);
//        System.out.println("Pharmacy: " + elmntTownAndPharmacy.getText().trim());
//        click(elmntTownAndPharmacy);

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

    public void selectMedByPharmacyIOS(List<String> lstPharmacy) {
//        waitForElementIgnoreStale(elmntSelectDeliveryAddress);
        waitForSecond(8);
        waitForElement(elmntFindAPharmacy);
        click(elmntFindAPharmacy);

        WebElement elmntCity = waitForElement(By.xpath(strStaticTextLocatorIOS.replace("<<TEXT>>", lstPharmacy.get(0))));
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
        waitForSecond(2);
        click(elmntAddDeliveryAddress);
        waitForElement(rdoHome);
//        click(rdoHome);
        waitForElement(txtUnitNo);
        enterValue(txtUnitNo, lstPharmacy.get(1));
        enterValue(txtStreet, lstPharmacy.get(2));
        enterValue(txtCity, lstPharmacy.get(3));
        waitForElement(btnDone);
        click(btnDone);
        waitForSecond(2);
        swipeUp();
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
        takeScreenshot(driver);
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
        waitForSecond(2);
        click(elmntAddDeliveryAddress);
        waitForElement(rdoHome);
//        click(rdoHome);
        waitForElement(txtUnitNo);
        enterValue(txtUnitNo, lstPharmacy.get(0));
        enterValue(txtStreet, lstPharmacy.get(1));
        enterValue(txtCity, lstPharmacy.get(2));

        if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            waitForElement(btnDone);
            click(btnDone);
            waitForSecond(2);
            swipeUp();
        }

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
            if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
                waitForElement(btnDone);
                click(btnDone);
            }
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

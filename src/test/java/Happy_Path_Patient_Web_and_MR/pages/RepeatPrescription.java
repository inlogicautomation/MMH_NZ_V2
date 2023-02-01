package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import static cap.utilities.DateUtil.getCurrentDate;
import static cap.utilities.SharedDriver.strExecutionID;

public class RepeatPrescription extends BasePage {

    public RepeatPrescription(WebDriver driver) {
        super(driver);
    }

    public static String strBrowserName;


    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmntRepeatPrescriptions;

    @FindBy(how = How.XPATH, using = "//mat-progress-spinner[@mode='indeterminate']")
    protected WebElement elmntLoadingSpinner;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Request new script')]")
    protected WebElement elmntRequestNewScript;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Request New Script')]")
    protected WebElement elmntMobileRequestNewScript;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'View history')]")
    protected WebElement elmntViewPreviousRequests;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Request New Script')]")
    protected WebElement txtRequestNewScript;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View History')]")
    protected WebElement txtViewHistory;

    @FindBy(how = How.XPATH, using = "(//a[text()='MORE INFO'])[1]")
    protected WebElement elmntMoreInfo;

    @FindBy(how = How.XPATH, using = "//h6[text()='Request Details']")
    protected WebElement txtRequestDetails;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'REPEAT REQUEST')]")
    protected WebElement txtRepeatRequest;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Location']")
    protected WebElement drpdownLocation;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Request New Script')]")
    protected WebElement getTxtRequestNewScript;

    @FindBy(how = How.XPATH, using = "//mat-form-field/following::input[@placeholder='Practice Location']")
    protected WebElement selectedProviderName;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String selectedDrpDownOption = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='SelectedDoctor']")
    protected WebElement inputProviderName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='ScriptInstructions']")
    protected WebElement drpdwnScriptInstruction;

    @FindBy(how = How.XPATH, using = "//div[@class='vis-yes']")
    protected WebElement optionScriptsending;

    protected String ddLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::span").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='ScriptUrgency']")
    protected WebElement drpdwnScriptUrgency;

    @FindBy(how = How.XPATH, using = "//mat-option/following::span[not(contains(.,' Select Script Urgency'))]")
    protected List<WebElement> lstscriptUrgencies;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Select from my saved list')]")
    protected WebElement optionSavedList;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Select Pharmacy ')]")
    protected WebElement drpdownSelectPharmacy;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='locationAddress']")
    protected WebElement drpdownSelectAddress;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='2: 456, demo']")
    protected WebElement firstAddressOption;

    @FindBy(how = How.XPATH, using = "//div[@class='vis-yes']//mat-select[@formcontrolname='PharmacyName']")
    protected WebElement drpdwnSelectPharmacy;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),' ZOOM')]")
    protected WebElement drpOptionZoomAddress;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='bindDeliveryAddress']")
    protected WebElement addressBoxValue;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='selectedDeliverPharmacyAddressData']")
    protected WebElement selectedAaddressBoxValue;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='MessageBody']")
    protected WebElement txtBoxReasonForNewScript;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@formcontrolname='termsConditions']")
    protected WebElement checkBoxTermsAndConditions;

    @FindBy(how = How.XPATH, using = "(//span[text()='Pay At Health Centre'])[1]")
    protected WebElement BtnPayAtHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[@class='toast-content']")
    protected WebElement popUpContent;


    protected String selectLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();


    protected String elmntDateAndHealthCenter = new StringBuilder()
            .append("(//mat-card-header/div[./mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]][./mat-card-subtitle[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]])[1]").toString();

    protected String elmntHealthCenter = new StringBuilder()
            .append("(//mat-card-header/div[./mat-card-subtitle[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]])[1]").toString();


    protected String elmntMoreInfoFields = new StringBuilder()
            .append("//div[@class='repeat-content-wrapper']//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String elmntDoctorAndMedicine = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-label[text()=' Select a Doctor']")
    protected WebElement drpdownDoctorRuleC;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='SelectedDoctor']")
    protected WebElement drpdownDoctor;

    protected String selectDoctor = new StringBuilder()
            .append("//mat-option/span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='ScriptInstructions'] ")
    protected WebElement drpdownInstructions;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]/parent::button")
    protected WebElement btnNextRRP;

    @FindBy(how = How.XPATH, using = "//h6[contains(text(),'Total to pay: $')]")
    protected WebElement txtTotalToPay;


    protected String selectInstructions = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='ScriptUrgency']")
    protected WebElement drpdownUrgrency;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Script Urgency')]/parent::mat-option")
    protected WebElement elmntSelectScriptUrgency;


    protected String elmntScriptUrgency = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String selectUrgrency = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String chkMedication = new StringBuilder()
            .append("//tr//td[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/preceding-sibling::td/input").toString();


    @FindBy(how = How.XPATH, using = "//input[@aria-label='Select All Rows']")
    protected WebElement chkAllMedication;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-form-field')]/child::textarea[contains(@class,'mat-form-field')][@formcontrolname='MessageBody']")
    protected WebElement txaMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'I accept the Repeat Precriptions')]/preceding-sibling::mat-checkbox/label/div")
    protected WebElement chkTermsAndCondion;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Pay At Health Centre')])[1]")
    protected WebElement btnPayAtHealthCentre;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Pay At Health Centre')])[2]")
    protected WebElement btnMobilePayAtHealthCentre;

    @FindBy(how = How.XPATH, using = "(//span[text()='Pay Now'])[1]")
    protected WebElement btnPayNow;

    @FindBy(how = How.XPATH, using = "(//span[text()='Pay Now'])[2]")
    protected WebElement btnMobilePayNow;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Payment')]")
    protected WebElement txtPayment;

    @FindBy(how = How.XPATH, using = "//h1[text()='Payment Checkout']")
    protected WebElement txtPaymentCheckOut;

    @FindBy(how = How.XPATH, using = "//input[@id='Account2Account']//following::label[contains(text(),'Account2Account')]")
    protected WebElement selectAcToAc;

    @FindBy(how = How.XPATH, using = "//iframe[@id='iframePayment']")
    protected WebElement CardPaymentFrame;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Transaction Approved') and @id='Success']")
    protected WebElement elmntPaymentSuccessForCard;

    @FindBy(how = How.XPATH, using = "//input[@name='CardNumber']")
    protected WebElement txtboxCardNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='CardHolderName']")
    protected WebElement txtboxNameOnCard;

    @FindBy(how = How.XPATH, using = "//input[@name='CustomerId']")
    protected WebElement txtboxCustomerNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='CustomerPassword']")
    protected WebElement txtboxPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='Cvc2']")
    protected WebElement txtboxCVC;

    @FindBy(how = How.XPATH, using = "//input[@id='CreditCard' or @value='CreditCard']/parent::div")
    protected WebElement btnCreditCard;

    @FindBy(how = How.XPATH, using = "//div[text()='Submit']")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//a[text()='Next']")
    protected WebElement btnNextCrdCard;

    @FindBy(how = How.XPATH, using = "//span[@name='CardName']")
    protected WebElement elmntCardType;

    @FindBy(how = How.ID, using = "Amount")
    protected WebElement elmntAmount;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success m-t-40']/b[text()='Success']")
    protected WebElement elmntOnlineCardSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Payment Confirmation')]/i")
    protected WebElement btnBackPaymentConfirmation;

    protected String btnBackPaymentConfirmation1 = "//h1[contains(text(),'Payment Confirmation')]/i";


    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Previous Requests')]")
    protected WebElement txtViewPreviousRequests;

    @FindBy(how = How.XPATH, using = "//h4 [contains(text(),'Success!')]/following::p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email confirmation.')]/parent::div")
    protected WebElement txtRRPSuccessPopUp;

    protected String txtRRPSuccessPopUp1 = "//h4 [contains(text(),'Success!')]/following::p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email confirmation.')]/parent::div";

    @FindBy(how = How.XPATH, using = "//span[text()=' Back to RRP ']")
    protected WebElement btnBackToRRP;

    @FindBy(how = How.XPATH, using = "//input[@id='Account2Account' or @value='Account2Account']/parent::div")
    protected WebElement btnAccount2Account;

    @FindBy(how = How.XPATH, using = "//div[@id='PxPayAccount2AccountAuth_Logo' and @data-name='PxPayAccount2AccountAuth_Logo']")
    protected WebElement txtAccount2Account;

    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    protected WebElement txtcheckbox;


    @FindBy(how = How.XPATH, using = "//span[text()='Please enter the A2A test credentials:']")
    protected WebElement txtA2ACredentials;

    @FindBy(how = How.XPATH, using = "//h2[text()='Credit Card Payment']")
    protected WebElement txtCreditCardPayment;

    @FindBy(how = How.XPATH, using = "//div[text()='Next']")
    protected WebElement btnNextA2A;

    @FindBy(how = How.XPATH, using = "//div[@id='PxPayAccount2AccountAuth_PaymentSuccess' and @title='Payment Success']")
    protected WebElement elmntSuccessA2A;

    @FindBy(how = How.XPATH, using = "//span[text()='Thank you, your payment has completed successfully!']")
    protected WebElement txtSuccessA2A;

    @FindBy(how = How.ID, using = "TnC")
    protected WebElement chkBoxA2ATnC;

    @FindBy(how = How.XPATH, using = "//span[text()='Please select an account you would like us to deduct your payment from:']")
    protected WebElement txtSelectAccountForPayment;

    @FindBy(how = How.XPATH, using = "//span[text()='Please review the following references that will appear on your statement:']")
    protected WebElement txtReferenceDetails;


    @FindBy(how = How.XPATH, using = "//tr/td/span")
    protected WebElement referenceDetails;

    //input[@id='Account2Account' or @value='Account2Account']/parent::div
    protected String paymentMethod = new StringBuilder()
            .append("//input[@id='")
            .append("<<REPLACEMENT>>")
            .append("' or @value='")
            .append("<<REPLACEMENT>>")
            .append("']/parent::div").toString();

    protected String rdoBtnSelectAccount = new StringBuilder()
            .append("//label[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/preceding-sibling::input[@name='SelectAccount']").toString();


    protected String rdoBtnBank = new StringBuilder()
            .append("//input[@id='")
            .append("<<REPLACEMENT>>")
            .append("' and @name='SelectBank']").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement btnPaymentOk;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email ')]")
    protected WebElement emlntSuccessPopUp;

    protected String emlntSuccessPopUp1 = "//p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email ')]";

    @FindBy(how = How.XPATH, using = "(//div[@class='repeat-card-block yellow ng-star-inserted'])[1]")
    protected WebElement emlntPrescriptionStatus;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[@class='mat-card-title'])[1]")
    protected WebElement txtPrescriptionDate;

    protected String txtPrescriptionDate1 = "(//mat-card-title[@class='mat-card-title'])[1]";

    @FindBy(how = How.XPATH, using = "//mat-select[@name='ddlSelectOrSearchFax' or @placeholder='Select or search for a pharmacy']")
    protected WebElement drpDownPharmacy;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='ddlSelectorSearchDelivery']")
    protected WebElement drpDownSearchPharmacy;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search Pharmacy')]")
    protected WebElement ddlPharmacy;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Find a pharmacy')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']")
    protected WebElement rdoBtnFindPharmacy;

    @FindBy(how = How.XPATH, using = "(//button/preceding::div/h3[text()='Search Pharmacy'])[1]")
    protected WebElement txtSearchPharmacyForSentScript;

    @FindBy(how = How.XPATH, using = "(//button/preceding::div/h3[text()='Search Pharmacy'])[2]")
    protected WebElement txtSearchPharmacyForDelivery;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Find a pharmacy')]/preceding::mat-select[contains(@id,'mat-select-0')]")
    protected WebElement drpDownSelectForSentScript;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='City']")
    protected WebElement drpDownSelectForCity;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='PharmacyName']")
    protected WebElement drpDownSelectPharmacy;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Suburb']")
    protected WebElement drpDownSelectForSubUrban;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='PharmacyName'])[1]")
    protected WebElement drpDownSelectForPharmacyName;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Find a pharmacy')]//ancestor::mat-select)[2]")
    protected WebElement drpDownSelectForDelivery;


    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='PharmacyName' or @ng-reflect-placeholder='Select Pharmacy'])[1]")
    protected WebElement drpDownSelectPharmacyForSentScript;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='PharmacyName' or @ng-reflect-placeholder='Select Pharmacy'])[2]")
    protected WebElement drpDownSelectPharmacyForDelivery;

    @FindBy(how = How.XPATH, using = "//mat-select[@placeholder='Select City/Region']")
    protected WebElement drpDownSelectCityRegion;

    @FindBy(how = How.XPATH, using = "(//button//span[text()='Select'])[1]")
    protected WebElement btnSelectForSentScript;

    @FindBy(how = How.XPATH, using = "//span[text()='Change ']")
    protected WebElement btnChange;

    @FindBy(how = How.XPATH, using = "//span[text()='Change ']")
    protected WebElement btnChangeForMobile;

    @FindBy(how = How.XPATH, using = "(//button//span[text()='Select'])[2]")
    protected WebElement btnSelectForDelivery;

    @FindBy(how = How.XPATH, using = "(//span[text()='Cancel'])[2]")
    protected WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='locationAddress']")
    protected WebElement drpDownAddress;

    @FindBy(how = How.XPATH, using = "//div[@class='field-list']")
    protected List<WebElement> moreInfoFields;

    @FindBy(how = How.XPATH, using = "//div[@class='field-list']")
    protected WebElement moreInfoField;


    @FindBy(how = How.XPATH, using = "//select[@id='DateExpiry_1' or @name='DateExpiry_1']")
    protected WebElement drpDownMonth;

    @FindBy(how = How.XPATH, using = "//select[@id='DateExpiry_2' or @name='DateExpiry_2']")
    protected WebElement drpDownYear;

    protected String ddlSelect = new StringBuilder()
            .append("//span[@class='mat-option-text' and contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String chkMedicationForMobile = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::div/preceding-sibling::div/mat-checkbox//div").toString();

    //span[contains(text(),'Chemist Warehouse Auckland')]
    protected String ddlSelectFileds = new StringBuilder()
            .append(" //span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String drpDownExpiryDate = new StringBuilder()
            .append("//option[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //div[contains(text(),'Select from my saved list')]/preceding-sibling::div/input
    protected String rdoBtnType = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/preceding-sibling::div/div[@class='mat-radio-outer-circle']").toString();

    protected String elmntMedicationFields = new StringBuilder()
            .append("(//mat-card-content[@class='mat-card-content']/following::div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();


    protected String elmntMedicine = new StringBuilder()
            .append("(//*[.='")
            .append("<<REPLACEMENT>>")
            .append("'])[1]").toString();

    protected String elmntDoctorName = new StringBuilder()
            .append("//mat-card-content/div/p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String ddlSelectAddress = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String ddlSelectPharmacy = new StringBuilder()
            .append("//span[@class='mat-option-text' and contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String ddlSelectCityRegion = new StringBuilder()
            .append("//span[@class='mat-option-text' and contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForPresenceOfElement(elmntLogo);
            waitForElementClickable(elmntLogo);
            click(elmntLogo);
            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            String pageTitle = driver.getTitle();
            System.out.println("pageTitle >>> : " + pageTitle);
            try {
                pageTitle.equalsIgnoreCase("PostRegistration");

                System.out.println("User on the ProviderHomePage and Verified the ProviderHomePage >>>>");
                blResult = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("User not in the ProviderHomePage >>>>");
            }


        } catch (Exception e) {
            System.out.println("Failed to Navigate the ProviderHomePage >>>>");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean navigateToRequestNewScript() {
        boolean blResult = false;
        try {
//            waitForSeconds(3);
            waitForElementClickable(elmntRepeatPrescriptions);
            click(elmntRepeatPrescriptions);
//            waitForSeconds(3);
            waitForElementClickable(elmntRequestNewScript);
            click(elmntRequestNewScript);
            waitForElement(txtRequestNewScript);
            blResult = verifyElement(txtRequestNewScript);
//            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("Navigated To Request Medication >>>>");
        } catch (Exception e) {
            System.out.println("Failed to Navigate To Request Medication >>>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMobileRequestNewScript() {
        boolean blResult = false;
        try {
//            waitForSeconds(3);
            waitForElementClickable(elmntRepeatPrescriptions);
            jsClick(elmntRepeatPrescriptions);
//            waitForSeconds(3);
            waitForElementClickable(elmntMobileRequestNewScript);
            click(elmntMobileRequestNewScript);
            waitForElement(txtRequestNewScript);
            blResult = verifyElement(txtRequestNewScript);
//            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("Navigated To Request Medication >>>>");
        } catch (Exception e) {
            System.out.println("Failed to Navigate To Request Medication >>>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToViewPreviousRequests() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntRepeatPrescriptions);
            mouseClick(elmntRepeatPrescriptions);
            waitForSeconds(2);
            waitForElementClickable(elmntViewPreviousRequests);
            mouseClick(elmntViewPreviousRequests);
//            waitForInvisibilityOfElement(elmntLoadingSpinner);

            blResult = verifyElement(txtViewPreviousRequests);
            System.out.println("Navigated To View Previous Scripts >>>>");

        } catch (Exception e) {
            System.out.println("Failed to Navigate To View Previous Scripts >>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickMoreInfo() {
        boolean blResult = false;

        try {
            waitForSeconds(2);
//            waitForElement(txtViewPreviousRequests);
            waitForElementClickable(elmntMoreInfo);
            click(elmntMoreInfo);
            waitForElement(txtRequestDetails);
            blResult = verifyElement(txtRequestDetails);

            System.out.println("Successfully Navigated to More info >>>> ");

        } catch (Exception e) {

            System.out.println("Failed to Navigated More info >>>> ");
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyMoreInfoDetails(String strMoreInfoDetails) {
        boolean blResult = false;

        try {

            waitForSeconds(2);
//            waitForElement(txtRequestDetails);
//            waitForElement(txtRepeatRequest);

            ArrayList<String> lstMoreInfoDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strMoreInfoDetails);

            System.out.println("Contents of list >>> ::" + lstMoreInfoDetails);
            System.out.println("Size of Contents >>> ::" + lstMoreInfoDetails.size());
            List<String> strDetails = lstMoreInfoDetails.subList(1, 4);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntDoctorAndMedicine.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(0))));
            waitForSeconds(2);
            System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntDoctorAndMedicine.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(0)));
            waitForElement(DateAndHealthCenter);
            verifyElement(DateAndHealthCenter);
            System.out.println("\n Verified DateAndHealthCenter >>>> \n");

            for (String strDetail : strDetails) {
                waitForSeconds(2);
                System.out.println("\n Xpath for medicine Field >>>>> : " + elmntMoreInfoFields.replace("<<REPLACEMENT>>", strDetail));
                WebElement medicineField = waitForElement(By.xpath(elmntMoreInfoFields.replace("<<REPLACEMENT>>", strDetail)));
                waitForElement(medicineField);
                System.out.println("verified medicineField >>> :: " + verifyElement(medicineField));

            }
            System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntDoctorAndMedicine.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(4)));
            WebElement medicine = waitForElement(By.xpath(elmntDoctorAndMedicine.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(4))));
            waitForSeconds(2);
            waitForElement(medicine);
            verifyElement(medicine);
            System.out.println("\n Verified medicine Name >>>> \n");

            System.out.println("Xpath for doctorName Field >>>>> : " + elmntMoreInfoFields.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(5)));
            WebElement requestStatus = waitForElement(By.xpath(elmntMoreInfoFields.replace("<<REPLACEMENT>>", lstMoreInfoDetails.get(5))));
            waitForSeconds(2);
            waitForElement(requestStatus);
            verifyElement(requestStatus);

            System.out.println("Successfully verified the More Info details>>>");
            blResult = true;


        } catch (Exception e) {

            System.out.println("Failed to verify More Info Details info >>>> ");
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean selectHealthCentreLocation(String strLocation) {
        boolean blResult = false;
        try {
//            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForSeconds(10);
            waitForElementClickable(drpdownLocation);
//            waitForSeconds(4);
            jsClick(drpdownLocation);
            waitForSeconds(4);
            System.out.println(" select Location Locator :: " + selectLocation.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitForElementClickable(ddlLocation);
            waitForSeconds(2);
            mouseClick(ddlLocation);
            System.out.println("Location was selected in the Request Medication >>> ::");
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            System.out.println("Location not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectDoctor(String strDoctor) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(drpdownDoctor);
            jsClick(drpdownDoctor);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            System.out.println("Doctor xpath >>> : " + selectDoctor.replace("<<REPLACEMENT>>", strDoctor));
            WebElement ddlDoctor = waitForElement(By.xpath(selectDoctor.replace("<<REPLACEMENT>>", strDoctor)));
            selectDoctor.replace("<<REPLACEMENT>>", strDoctor);
            waitForElementClickable(ddlDoctor);
            waitForSeconds(4);
            jsClick(ddlDoctor);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshot(driver);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Doctor not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectInstructions(String strInstruction) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(drpdownInstructions);
            jsClick(drpdownInstructions);
            waitForSeconds(2);
            System.out.println(" SelectInstructions xpath >>> : " + selectInstructions.replace("<<REPLACEMENT>>", strInstruction));
            WebElement ddlInstructions = waitForElement(By.xpath(selectInstructions.replace("<<REPLACEMENT>>", strInstruction)));
            waitForElementClickable(ddlInstructions);
            waitForSeconds(2);
            waitAndClick(ddlInstructions);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForInvisibilityOfElement(elmntLoadingSpinner);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Instructions not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean VeriflyPatienttoCollectScriptDetails(List<String> SelectScriptDropDownDetails) {
        boolean blResult = false;
        try {
            System.out.println("SelectScriptDropDownDetails>>>>>" + SelectScriptDropDownDetails);
            waitForSeconds(3);

            waitForSeconds(2);
            for (String str : SelectScriptDropDownDetails) {
                waitForElementClickable(drpdownUrgrency);
                jsClick(drpdownUrgrency);
                waitForSeconds(3);
                WebElement SelectScriptDetails = waitForElement(By.xpath(selectUrgrency.replace("<<REPLACEMENT>>", str.concat(strExecutionID))));
                System.out.println("SelectScriptDetails>>>>" + SelectScriptDetails);
                verifyElement(SelectScriptDetails);
                waitForSeconds(3);
                jsClick(SelectScriptDetails);
            }


            blResult = true;

        } catch (Exception e) {
            System.out.println("Not Verifly Patient to Collect Script Details");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickNextButton() {
        boolean blResult = false;
        try {
            waitForElement(btnNextRRP);
            jsScrollIntoView(btnNextRRP);
            waitForElementClickable(btnNextRRP);
            waitForSeconds(3);
            jsClick(btnNextRRP);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePayNow);
            waitForElement(btnMobilePayNow);
            blResult = verifyElement(btnMobilePayNow);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }


    public boolean selectUrgency(String strUrgency) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(drpdownUrgrency);
            jsClick(drpdownUrgrency);
            waitForSeconds(2);
            System.out.println("Xpath for selectUrgrency Type >>> : " + selectUrgrency.replace("<<REPLACEMENT>>", strUrgency));
            WebElement ddlUrgrencyType = waitForElement(By.xpath(selectUrgrency.replace("<<REPLACEMENT>>", strUrgency)));
            waitForSeconds(2);
            waitForElementClickable(ddlUrgrencyType);
            jsClick(ddlUrgrencyType);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select Urgency >>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyScriptUrgencyPrice(List<String> strUrgencyPrice) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(drpdownUrgrency);
            jsClick(drpdownUrgrency);
            waitForSeconds(2);
            waitForElement(elmntSelectScriptUrgency);
//            waitForElementClickable(elmntSelectScriptUrgency);

            for (String urgencyPrice : strUrgencyPrice) {

                System.out.println("Xpath for Element day Price >>>> : " + elmntScriptUrgency.replace("<<REPLACEMENT>>", urgencyPrice));
                WebElement dayPrice = waitForElement(By.xpath(elmntScriptUrgency.replace("<<REPLACEMENT>>", urgencyPrice)));
                waitForSeconds(3);
                waitForElement(dayPrice);
                blResult = verifyElement(dayPrice);

                if (!blResult) {

                    return blResult;
                }
            }
            takeScreenshot(driver);


        } catch (Exception e) {
            System.out.println("Verify Script urgency price was Failed ");
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean selectMedicationsToRepeat(String strMedication) {
        boolean blResult = false;
        try {

            System.out.println("selectMedication XPath >>>>" + chkMedication.replace("<<REPLACEMENT>>", strMedication));
            WebElement selectMedication = waitForElement(By.xpath(chkMedication.replace("<<REPLACEMENT>>", strMedication)));
            waitForElementClickable(selectMedication);
            jsClick(selectMedication);
            waitForSeconds(2);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select Medications To Repeat >>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean addMessage(String strMessage) {
        boolean blResult = false;
        try {
            waitForElementClickable(txaMessage);
            click(txaMessage);
            txaMessage.sendKeys(strMessage);
            System.out.println("strMessage >>> :" + strMessage);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Message is not added in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectTermsAndCondition() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(chkTermsAndCondion);
            jsClick(chkTermsAndCondion);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshot(driver);
            System.out.println("Terms and Condition was selected in the Request Medication");
            blResult = true;

        } catch (Exception e) {
            System.out.println("Terms and Condition is not selected in the Request Medication");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickPayAtHealthCentre() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(btnPayAtHealthCentre);
            waitForSeconds(4);
            jsClick(btnPayAtHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(" Successfully Selected Pay at Health centre Button >>>");
            waitForElementToAppear(driver, By.xpath(emlntSuccessPopUp1));
            waitForElement(emlntSuccessPopUp);
            blResult = verifyElement(emlntSuccessPopUp);

        } catch (Exception e) {
            System.out.println("Failed to Select Pay at Health centre Button >>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickMobilePayAtHealthCentre() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(btnMobilePayAtHealthCentre);
            waitForSeconds(4);
            click(btnMobilePayAtHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(" Successfully Selected Pay at Health centre Button >>>");
            waitForElementToAppear(driver, By.xpath(emlntSuccessPopUp1));
            waitForElement(emlntSuccessPopUp);
            blResult = verifyElement(emlntSuccessPopUp);

        } catch (Exception e) {
            System.out.println("Failed to Select Pay at Health centre Button >>>");
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean clickPayNow() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(btnPayNow);
            waitForSeconds(4);
            click(btnPayNow);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(6);
            takeScreenshot(driver);
            System.out.println("Successfully clicked Pay now button >>>");
            blResult = verifyElement(txtPayment);

        } catch (Exception e) {
            System.out.println("Failed to clicked Pay now button >>>");
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean clickMobilePayNow() {
        boolean blResult = false;
        try {
            jsScrollIntoView(btnMobilePayNow);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(btnMobilePayNow);
            waitForSeconds(4);
            jsClick(btnMobilePayNow);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(6);
            takeScreenshot(driver);
            System.out.println("Successfully clicked Pay now button >>>");
            blResult = verifyElement(txtPayment);

        } catch (Exception e) {
            System.out.println("Failed to clicked Pay now button >>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyTheSuccessAndNavigateToViewHistory() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//         waitForElementToAppear(driver,By.xpath(txtRRPSuccessPopUp1));
//            waitForElement(txtRRPSuccessPopUp);
//            verifyElement(txtRRPSuccessPopUp);
            waitForSeconds(5);

            blResult = true;
            System.out.println("Repeat Prescription was success  and Successfully to navigate the View History Page>>>>>>");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Repeat Prescription was not success and so failed to navigate to View History Page >>>");
        }
        return blResult;
    }

    public boolean verifyTheSuccessAndNavigateToPaymentPage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtPayment);
            verifyElement(txtPayment);
            waitForElementClickable(btnPaymentOk);
            jsClick(btnPaymentOk);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            driver.switchTo().frame(CardPaymentFrame);
            waitForSeconds(3);
            waitForElement(txtPaymentCheckOut);
            blResult = verifyElement(txtPaymentCheckOut);
            System.out.println("Repeat Prescription was success  and Successfully to navigate the View History Page>>>>>>");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Repeat Prescription was not success and so failed to navigate to View History Page >>>");
        }
        return blResult;
    }


    public boolean verifyThePaymentPage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForInvisibilityOfElement(elmntLoadingSpinner);
            waitForElement(txtPaymentCheckOut);
            blResult = verifyElement(txtPaymentCheckOut);
            System.out.println("Successfully to verified the Payment Page >>>");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verified the Payment Page >>>");
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsForDeliverMedsByPharmacyInCardView(String strPrescriptionDetails) {
        boolean blResult = false;

        try {
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);
            List<String> strDetails = lstPrescriptionDetails.subList(2, 5);

            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(3);
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//
//            String currentDate = formatter.format(calendar.getTime());
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(currentDate);
            System.out.println("currentDate >>>: " + currentDate);
            waitForSeconds(2);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            waitForElement(txtPrescriptionDate);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);
            takeScreenshot(driver);
            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                System.out.println("Xpath for DateAndHealthCenter Field >>>>> :: " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                WebElement healthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                waitForElement(healthCenter);
                verifyElement(healthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    System.out.println("Xpath for medicine Field >>>>> : " + elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail));
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    waitForElement(medicineField);
                    System.out.println("\n verified medicineField >>> :: " + verifyElement(medicineField));

                }
                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5)));
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5))));
                waitForSeconds(2);
                waitForElement(doctorName);
                verifyElement(doctorName);
                blResult = true;
                System.out.println("verify The Prescription Details For Deliver Meds By Pharmacy In Card View was failed");
            }
//            else {
//                System.out.println("verify The Prescription Details For Deliver Meds By Pharmacy In Card View was failed");
//                blResult=false; }
        } catch (Exception e) {
            System.out.println("verify The Prescription Details For Deliver Meds By Pharmacy In Card View was failed");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsForDeliverMedsByPharmacyByUsingCardInCardView(String strPrescriptionDetails) {
        boolean blResult = false;

        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);
            List<String> strDetails = lstPrescriptionDetails.subList(2, 5);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshot(driver);
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//
//            String currentDate = formatter.format(calendar.getTime());
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(currentDate);
            System.out.println("currentDate >>>: " + currentDate);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);

            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                waitForElement(DateAndHealthCenter);
                verifyElement(DateAndHealthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    System.out.println("\n Xpath for medicine Field >>>>> : " + medicineField);
                    waitForElement(medicineField);
                    System.out.println("verified medicineField >>> :: " + verifyElement(medicineField));

                }

                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5)));
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5))));
                waitForSeconds(2);
                waitForElement(doctorName);
                verifyElement(doctorName);

                System.out.println("Successfully verified the Prescription>>>");
                blResult = true;
            }
        } catch (Exception e) {
            System.out.println("verify The Prescription Details For Deliver Meds By Pharmacy In Card View was failed ::>>>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsForSentScriptToPharmacyInCardView(String strPrescriptionDetails) {

        boolean blResult = false;

        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);


            List<String> strDetails = lstPrescriptionDetails.subList(2, 5);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshot(driver);

//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//
//            String currentDate = formatter.format(calendar.getTime());
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(currentDate);
            System.out.println("currentDate >>>: " + currentDate);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            waitForElement(txtPrescriptionDate);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);

            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                waitForElement(DateAndHealthCenter);
                verifyElement(DateAndHealthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    System.out.println("Xpath for medicine Field >>>>> : " + elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail));
                    waitForElement(medicineField);
                    System.out.println("\n verified medicineField >>> :: " + verifyElement(medicineField));

                }
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5))));
                waitForSeconds(2);
                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(5)));
                waitForElement(doctorName);
                verifyElement(doctorName);

                System.out.println("Successfully verified the Prescription>>>");
                blResult = true;
            }
//            else {
//                System.out.println("Successfully verify The Prescription Details For Sent Script To Pharmacy In Card View");
//                blResult=false;
//            }
        } catch (Exception e) {
            System.out.println("verify The Prescription Details For Sent Script To Pharmacy In Card View was failed");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsForSentScriptByPostInCardView(String strPrescriptionDetails) {
        boolean blResult = false;

        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);

            List<String> strDetails = lstPrescriptionDetails.subList(2, 4);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshot(driver);
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//
//            String currentDate = formatter.format(calendar.getTime());
//            System.out.println(currentDate);
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println("currentDate >>>: " + currentDate);
            waitForSeconds(2);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            waitForElement(txtPrescriptionDate);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);

            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                waitForElement(DateAndHealthCenter);
                verifyElement(DateAndHealthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    System.out.println("Xpath for medicine Field >>>>> : " + elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail));
                    waitForElement(medicineField);
                    System.out.println("\n verified medicineField >>> :: " + verifyElement(medicineField));

                }
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4))));
                waitForSeconds(2);
                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4)));
                waitForElement(doctorName);
                verifyElement(doctorName);

                System.out.println("Successfully verified the Prescription>>>");
                blResult = true;
            }
        } catch (Exception e) {
            System.out.println(">>>>>>>>>>>>>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsForPatientToCollectTheScriptInCardView(String strPrescriptionDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);

            List<String> strDetails = lstPrescriptionDetails.subList(2, 4);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);


//            waitForElement(txtViewPreviousRequests);
//            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshot(driver);
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//            String currentDate = formatter.format(calendar.getTime());
//            System.out.println(currentDate);
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println("currentDate >>>: " + currentDate);
            waitForSeconds(2);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            waitForElement(txtPrescriptionDate);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);

            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                waitForElement(DateAndHealthCenter);
                verifyElement(DateAndHealthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    System.out.println("Xpath for medicine Field >>>>> : " + elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail));
                    waitForElement(medicineField);
                    System.out.println("\n verified medicineField >>> :: " + verifyElement(medicineField));

                }
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4))));
                waitForSeconds(2);
                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4)));
                waitForElement(doctorName);
                verifyElement(doctorName);

                System.out.println("Successfully verified the Prescription>>>");
                blResult = true;
            }
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Failed to verify the Prescription>>>");
        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetailsInCardView1(String strPrescriptionDetails) {
        boolean blResult = false;
        try {
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);

            List<String> strDetails = lstPrescriptionDetails.subList(2, 4);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);

            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshot(driver);
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//
//            String currentDate = formatter.format(calendar.getTime());
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(currentDate);
            waitForElementToAppear(driver, By.xpath(txtPrescriptionDate1));
            waitForSeconds(3);
            System.out.println("currentDate >>>: " + currentDate);
            String prescriptionDate = txtPrescriptionDate.getText();
            System.out.println("\nPrescriptionDate>>>" + prescriptionDate);

            if (currentDate.equalsIgnoreCase(prescriptionDate)) {

                WebElement DateAndHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0))));
                waitForSeconds(2);
                System.out.println("Xpath for DateAndHealthCenter Field >>>>> : " + elmntHealthCenter.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(0)));
                waitForElement(DateAndHealthCenter);
                verifyElement(DateAndHealthCenter);
                System.out.println("\n Verified elmntHealthCenter >>>> \n");

                for (String strDetail : strDetails) {
                    waitForSeconds(2);
                    WebElement medicineField = waitForElement(By.xpath(elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail)));
                    System.out.println("Xpath for medicine Field >>>>> : " + elmntMedicationFields.replace("<<REPLACEMENT>>", strDetail));
                    waitForElement(medicineField);
                    System.out.println("\n verified medicineField >>> :: " + verifyElement(medicineField));

                }
                WebElement doctorName = waitForElement(By.xpath(elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4))));
                waitForSeconds(2);
                System.out.println("Xpath for doctorName Field >>>>> : " + elmntDoctorName.replace("<<REPLACEMENT>>", lstPrescriptionDetails.get(4)));
                waitForElement(doctorName);
                verifyElement(doctorName);

                System.out.println("Successfully verified the Prescription>>>");
                blResult = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Failed to verify the Prescription>>>");
        }
        return blResult;
    }

    public boolean selectPharmacyForSentScriptToPharmacy() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(drpDownPharmacy);
            click(drpDownPharmacy);
            waitForSeconds(2);
            waitForElementClickable(ddlPharmacy);
            click(ddlPharmacy);
            blResult = true;
            System.out.println("Successfully select Pharmacy For Sent Script To Pharmacy was selected");


        } catch (Exception e) {
            System.out.println("Failed to select Pharmacy >>>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectPharmacyForDeliveryMedsByPharmacy() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(drpDownSearchPharmacy);
            click(drpDownSearchPharmacy);
            waitForSeconds(2);
            waitForElementClickable(ddlPharmacy);
            click(ddlPharmacy);
            blResult = true;


        } catch (Exception e) {
            System.out.println("Failed to select Pharmacy >>>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectPharmacyTypeForSentScript(String strSelectType) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            jsScrollDown();
            System.out.println("selectType XPath >>>" + rdoBtnType.replace("<<REPLACEMENT>>", strSelectType));
            WebElement selectType = waitForElement(By.xpath(rdoBtnType.replace("<<REPLACEMENT>>", strSelectType)));
            waitForElement(selectType);
            waitForElementClickable(selectType);
            jsClick(selectType);
            waitForSeconds(2);

            blResult = true;

        } catch (Exception e) {
            System.out.println(" Failed to select Find Pharmacy >>>>>");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return blResult;
    }

    //    public boolean selectSearchPharmacyForSentScript(String strSelectType) {
//        boolean blResult = false;
//        try {
//            waitForSeconds(2);
//            waitForElement(txtSearchPharmacyForSentScript);
//            verifyElement(txtSearchPharmacyForSentScript);
//            System.out.println("Verified >>>> ::");
//            waitForSeconds(3);
//            waitForElementClickable(drpDownSelectForSentScript);
//            click(drpDownSelectForSentScript);
//            waitForSeconds(2);
//            WebElement selectType = waitForElement(By.xpath(ddlSelect.replace("<<REPLACEMENT>>", strSelectType)));
//            System.out.println("selectType XPath >>>" + ddlSelect.replace("<<REPLACEMENT>>", strSelectType));
//            waitForElement(selectType);
//            waitForElementClickable(selectType);
//            mouseClick(selectType);
//            waitForSeconds(2);
//
//            blResult = true;
//
//        } catch (Exception e) {
//            System.out.println(" Failed to select Find Pharmacy >>>>>");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//
//        }
//        return blResult;
//    }
    public boolean selectCity(String strCity) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSearchPharmacyForSentScript);
            verifyElement(txtSearchPharmacyForSentScript);
            System.out.println("Verified >>>> ::" + txtSearchPharmacyForSentScript.isDisplayed());
            waitForSeconds(3);
            waitForElementClickable(drpDownSelectForCity);
            click(drpDownSelectForCity);
            waitForSeconds(2);
            WebElement selectCity = waitForElement(By.xpath(ddlSelectFileds.replace("<<REPLACEMENT>>", strCity)));
            System.out.println("selectCity XPath >>>" + ddlSelectFileds.replace("<<REPLACEMENT>>", strCity));
            waitForElement(selectCity);
            waitForElementClickable(selectCity);
            click(selectCity);
            waitForSeconds(2);
            blResult = true;

        } catch (Exception e) {
            System.out.println(" Failed to select City >>>>>");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return blResult;
    }

    public boolean selectSubUrban(String strSubUrban) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSearchPharmacyForSentScript);
            verifyElement(txtSearchPharmacyForSentScript);
            System.out.println("Verified >>>> ::" + txtSearchPharmacyForSentScript.isDisplayed());
            waitForSeconds(3);
            waitForElementClickable(drpDownSelectForSubUrban);
            click(drpDownSelectForSubUrban);
            waitForSeconds(2);
            WebElement selectSubUrban = waitForElement(By.xpath(ddlSelectFileds.replace("<<REPLACEMENT>>", strSubUrban)));
            System.out.println("selectSubUrban XPath >>>" + ddlSelectFileds.replace("<<REPLACEMENT>>", strSubUrban));
            waitForElement(selectSubUrban);
            waitForElementClickable(selectSubUrban);
            click(selectSubUrban);
            waitForSeconds(2);
            blResult = true;

        } catch (Exception e) {
            System.out.println(" Failed to select Sub urban >>>>>");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return blResult;
    }

    public boolean selectPharmacy(String strPharmacy) {
        boolean blResult = false;
        try {
jsScrollIntoView(drpDownSelectForPharmacyName);
            waitForSeconds(3);
            waitForElement(drpDownSelectForPharmacyName);
            waitForElementClickable(drpDownSelectForPharmacyName);
            jsClick(drpDownSelectForPharmacyName);
            waitForSeconds(2);
            WebElement selectPharmacy = waitForElement(By.xpath(ddlSelectFileds.replace("<<REPLACEMENT>>", strPharmacy)));
            System.out.println("selectPharmacy XPath >>>" + ddlSelectFileds.replace("<<REPLACEMENT>>", strPharmacy));
            waitForElement(selectPharmacy);
            waitForElementClickable(selectPharmacy);
            jsClick(selectPharmacy);
            waitForSeconds(2);
            try {
                jsScrollIntoView(btnChange);
                waitForElement(btnChange);
                blResult = verifyElement(btnChange);
            }catch (Exception e){
                jsScrollIntoView(btnChangeForMobile);
                waitForElement(btnChangeForMobile);
                blResult = verifyElement(btnChangeForMobile);
            }


        } catch (Exception e) {
            System.out.println(" Failed to select Pharmacy >>>>>");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return blResult;
    }
//    public boolean selectPharmacy(String strPharmacy) {
//        boolean blResult = false;
//        try {
//            waitForSeconds(2);
//            waitForElement(txtSearchPharmacyForSentScript);
//            verifyElement(txtSearchPharmacyForSentScript);
//            System.out.println("Verified >>>> ::" +txtSearchPharmacyForSentScript.isDisplayed());
//            waitForSeconds(3);
//            waitForElementClickable(drpDownSelectForPharmacyName);
//            click(drpDownSelectForPharmacyName);
//            waitForSeconds(2);
//            WebElement selectPharmacy = waitForElement(By.xpath(ddlSelectFileds.replace("<<REPLACEMENT>>", strPharmacy)));
//            System.out.println("selectPharmacy XPath >>>" + ddlSelectFileds.replace("<<REPLACEMENT>>", strPharmacy));
//            waitForElement(selectPharmacy);
//            waitForElementClickable(selectPharmacy);
//            click(selectPharmacy);
//            waitForSeconds(2);
//            waitForElement(btnSelectForSentScript);
//            waitForElementClickable(btnSelectForSentScript);
//            blResult = click(btnSelectForSentScript);;
//
//        } catch (Exception e) {
//            System.out.println(" Failed to select Pharmacy >>>>>");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//
//        }
//        return blResult;
//    }

    public boolean selectPharmacyBySavedListForDelivery(String strSelectType, String strSelectPharmacy) {
        boolean blResult = false;
        try {
//            waitForElementDisappear(driver,elmntLoadingSpinner);
            waitForSeconds(2);
            waitForElement(txtSearchPharmacyForDelivery);
            verifyElement(txtSearchPharmacyForDelivery);
            waitForSeconds(2);
            waitForElement(drpDownSelectForDelivery);
            waitForElementClickable(drpDownSelectForDelivery);
            jsClick(drpDownSelectForDelivery);
            waitForSeconds(2);
            WebElement selectType = waitForElement(By.xpath(ddlSelect.replace("<<REPLACEMENT>>", strSelectType)));
            System.out.println("selectType XPath >>>" + selectType);
            waitForElement(selectType);
            waitForElementClickable(selectType);
            mouseClick(selectType);
            waitForSeconds(2);
            waitForElement(drpDownSelectPharmacyForDelivery);
            waitForElementClickable(drpDownSelectPharmacyForDelivery);
            waitForSeconds(1);
            click(drpDownSelectPharmacyForDelivery);
            WebElement selectPharmacy = waitForElement(By.xpath(ddlSelectPharmacy.replace("<<REPLACEMENT>>", strSelectPharmacy)));
            System.out.println("selectType XPath >>>" + ddlSelectPharmacy.replace("<<REPLACEMENT>>", strSelectPharmacy));
            waitForSeconds(2);
            mouseClick(selectPharmacy);
            waitForSeconds(2);
            waitForElementClickable(btnSelectForDelivery);
            waitForSeconds(1);
            click(btnSelectForDelivery);
            blResult = true;

        } catch (Exception e) {
            System.out.println(" Failed to select Pharmacy By Savedlist >>>>>");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return blResult;
    }

    public boolean selectPharmacyByFindAPharmacy(String strSelectPharmacy) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtSearchPharmacy1);
//            verifyElement(txtSearchPharmacy1);
            waitForSeconds(2);
            waitForElementClickable(drpDownSelectForSentScript);
            click(drpDownSelectForSentScript);
            WebElement selectPharmacy = waitForElement(By.xpath(ddlSelect.replace("<<REPLACEMENT>>", strSelectPharmacy)));
            System.out.println("selectPharmacy XPath >>>" + ddlSelect.replace("<<REPLACEMENT>>", strSelectPharmacy));
            click(selectPharmacy);
            waitForElementClickable(drpDownSelectCityRegion);
            click(drpDownSelectCityRegion);


            blResult = true;

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectMedicationsToRepeatForMobile(String strMedication) {
        boolean blResult = false;
        try {
            System.out.println("selectMedication XPath >>>>" + chkMedicationForMobile.replace("<<REPLACEMENT>>", strMedication));
            WebElement selectMedication = waitForElement(By.xpath(chkMedicationForMobile.replace("<<REPLACEMENT>>", strMedication)));
            waitForElementClickable(selectMedication);
            jsClick(selectMedication);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            System.out.println("Failed to Select Medications To Repeat >>>");
            e.printStackTrace();

        }
        return blResult;
    }


    public boolean selectAddress(String strSelectAddress) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(drpDownAddress);
            waitForElementClickable(drpDownAddress);
            click(drpDownAddress);
            WebElement selectDdlAddress = waitForElement(By.xpath(ddlSelectAddress.replace("<<REPLACEMENT>>", strSelectAddress)));
            System.out.println("ddlSelectAddress XPath >>>" + ddlSelectAddress.replace("<<REPLACEMENT>>", strSelectAddress));
            waitForSeconds(2);
            waitForElement(selectDdlAddress);
            click(selectDdlAddress);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select Dropdown list Address >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectPaymentMethod(String strPaymentMethod) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtPaymentCheckOut);
            verifyElement(txtPaymentCheckOut);
            waitForSeconds(3);
            WebElement selectPaymentMethod = waitForElement(By.xpath(paymentMethod.replace("<<REPLACEMENT>>", strPaymentMethod)));
            System.out.println("selectPaymentMethod XPath >>>" + paymentMethod.replace("<<REPLACEMENT>>", strPaymentMethod));
            waitForElement(selectPaymentMethod);
            jsClick(selectPaymentMethod);
//            waitForElementClickable(selectAcToAc);
//            jsClick(selectAcToAc);
            System.out.println("Successfully payment method was selected >>>>>");

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select payment method  >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean selectAccountToAccountPaymentMethod(String strPaymentMethod) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtPaymentCheckOut);
            verifyElement(txtPaymentCheckOut);
            waitForSeconds(3);
//            WebElement selectPaymentMethod = waitForElement(By.xpath(paymentMethod.replace("<<REPLACEMENT>>", strPaymentMethod)));
//            System.out.println("selectPaymentMethod XPath >>>" + paymentMethod.replace("<<REPLACEMENT>>", strPaymentMethod));
//            waitForElement(selectPaymentMethod);
//            waitAndClick(selectPaymentMethod);
            waitForElementClickable(selectAcToAc);
            jsClick(selectAcToAc);
            System.out.println("Successfully payment method was selected >>>>>");

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select payment method  >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean enterCardDetails(String strCardNumber, String strNameOnCard, String strExpiryMonth, String strExpiryYear, String strCVC) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtCreditCardPayment);
            verifyElement(txtCreditCardPayment);
            waitForSeconds(2);
            txtboxCardNumber.sendKeys(strCardNumber);
            waitForSeconds(1);
            txtboxNameOnCard.sendKeys(strNameOnCard);
            waitForSeconds(2);
            System.out.println("String strExpiryMonth >>> " + strExpiryMonth);
            jsScroll();
            waitForSeconds(2);

            Select expiryMonth = new Select(driver.findElement
                    (By.xpath("//select[@id='DateExpiry_1' or @name='DateExpiry_1']")));
            expiryMonth.selectByVisibleText(strExpiryMonth);

            waitForSeconds(2);
            System.out.println("String strExpiryYear >>> " + strExpiryYear);

            Select expiryYear = new Select(driver.findElement
                    (By.xpath("//select[@id='DateExpiry_2' or @name='DateExpiry_2']")));
            expiryYear.selectByVisibleText(strExpiryYear);

            if (System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME,"").equalsIgnoreCase("safari")){
    Actions builder = new Actions(driver);
    builder.moveToElement(driver.findElement(By.xpath("//input[@name='Cvc2']"))).click().build().perform();
    waitForSeconds(2);
    builder.moveToElement(driver.findElement(By.xpath("//input[@name='Cvc2']"))).sendKeys(strCVC).build().perform();
            }else {
                waitForSeconds(2);
//                waitForElement(txtboxCVC);
//                txtboxCVC.sendKeys(strCVC);
                txtboxCVC.click();
                waitForSeconds(2);
                driver.switchTo().activeElement().sendKeys(strCVC);
                waitForSeconds(2);
            }
            takeScreenshot(driver);
            waitForSeconds(3);
            waitForElementClickable(btnSubmit);
            jsClick(btnSubmit);

            System.out.println("Successfully Enter Card Details >>>>>");
            blResult = true;


        } catch (Exception e) {
            System.out.println("Failed to Enter Card Details >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectBank(String strBank) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForSeconds(2);
                waitForElement(txtAccount2Account);
                verifyElement(txtAccount2Account);
                waitForSeconds(2);
                WebElement selectRdoBtnBank = waitForElement(By.xpath(rdoBtnBank.replace("<<REPLACEMENT>>", strBank)));
                System.out.println("SelectRdoBtnBank Xpath >>>> " + rdoBtnBank.replace("<<REPLACEMENT>>", strBank));
                jsScrollIntoView(selectRdoBtnBank);
                waitForElementClickable(selectRdoBtnBank);
                jsClick(selectRdoBtnBank);
                System.out.println("Successfully Select RdoBtnBank");
                waitForSeconds(4);
                jsClick(chkBoxA2ATnC);
                System.out.println("Successfully Select chkBoxA2ATnC");
                waitForSeconds(3);
                jsScrollIntoView(btnNextA2A);
                waitForElementClickable(btnNextA2A);
                jsClick(btnNextA2A);
                System.out.printf("Successfully Select btnNextA2A");
                blResult = true;
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                waitForSeconds(2);
                waitForElement(txtAccount2Account);
                verifyElement(txtAccount2Account);
                waitForSeconds(2);
                WebElement selectRdoBtnBank = waitForElement(By.xpath(rdoBtnBank.replace("<<REPLACEMENT>>", strBank)));
                System.out.println("SelectRdoBtnBank Xpath >>>> " + rdoBtnBank.replace("<<REPLACEMENT>>", strBank));
                jsScrollIntoView(selectRdoBtnBank);
                waitForElementClickable(selectRdoBtnBank);
                jsClick(selectRdoBtnBank);
                System.out.println("Successfully Select RdoBtnBank");
                waitForSeconds(4);
                jsClick(chkBoxA2ATnC);
                System.out.println("Successfully Select chkBoxA2ATnC");
                waitForSeconds(3);
                jsScrollIntoView(btnNextA2A);
                waitForElementClickable(btnNextA2A);
                jsClick(btnNextA2A);
                System.out.printf("Successfully Select btnNextA2A");
                blResult = true;
            }


            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForSeconds(2);
                waitForElement(txtAccount2Account);
                verifyElement(txtAccount2Account);
                waitForSeconds(2);
                WebElement selectRdoBtnBank = waitForElement(By.xpath(rdoBtnBank.replace("<<REPLACEMENT>>", strBank)));
                System.out.println("SelectRdoBtnBank Xpath >>>> " + rdoBtnBank.replace("<<REPLACEMENT>>", strBank));
                jsScrollIntoView(selectRdoBtnBank);
                waitForElementClickable(selectRdoBtnBank);
                jsClick(selectRdoBtnBank);
                System.out.println("Successfully Select RdoBtnBank");
                waitForSeconds(4);
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
                waitForElement(txtcheckbox);
                click(txtcheckbox);
                System.out.println("Success Select check box");
                Set<String> contextNames1 = appiumDriver.getContextHandles();
                for (String strContextName : contextNames1) {
                    if (strContextName.contains("CHROMIUM")) {
                        appiumDriver.context("CHROMIUM");
                        break;
                    }
                }
                System.out.println("Successfully Select chkBoxA2ATnC");
                waitForSeconds(3);
                jsScrollIntoView(btnNextA2A);
                waitForElementClickable(btnNextA2A);
                jsClick(btnNextA2A);
                System.out.printf("Successfully Select btnNextA2A");
                blResult = true;
            }


            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Enter Account Details >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean enterAccountDetails(String strCustomerNumber, String strPassword) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtA2ACredentials);
            verifyElement(txtA2ACredentials);
            txtboxCustomerNumber.sendKeys(strCustomerNumber);
            waitForSeconds(2);
            txtboxPassword.sendKeys(strPassword);
            waitForSeconds(3);
            waitForElementClickable(btnNextA2A);
            jsClick(btnNextA2A);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Enter Account Details >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectAccountForPayment(String strAccountForPayment) {
        boolean blResult = false;
        try {

            waitForElement(txtSelectAccountForPayment);
            verifyElement(txtSelectAccountForPayment);
            WebElement selectAccountForpayment = waitForElement(By.xpath(rdoBtnSelectAccount.replace("<<REPLACEMENT>>", strAccountForPayment)));
            System.out.println("PaymentStatus Xpath >>>> " + rdoBtnSelectAccount.replace("<<REPLACEMENT>>", strAccountForPayment));
            waitForElementClickable(selectAccountForpayment);
            jsClick(selectAccountForpayment);
            waitForSeconds(3);
            waitForElementClickable(btnNextA2A);
            takeScreenshot(driver);
            jsClick(btnNextA2A);
            System.out.println("Select Account For Payment was Successful >>>");

            blResult = true;
        } catch (Exception e) {
            System.out.println("Failed to Select Account For Payment >>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean referenceDetails() {
        boolean blResult = false;
        try {

            waitForElement(txtReferenceDetails);
            verifyElement(txtReferenceDetails);
            waitForElement(referenceDetails);
            System.out.println("reference Details >>>>> " + referenceDetails);
            waitForElementClickable(btnNextA2A);
            takeScreenshot(driver);
            jsClick(btnNextA2A);
            waitForSeconds(3);
//            waitForElement(elmntSuccessA2A);
            System.out.println("Reference details was Successful >>>");
            blResult =true;
        } catch (Exception e) {
            System.out.println("Failed Reference details was Successful >>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPaymentSuccessForA2A() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntSuccessA2A);
            waitForElement(txtSuccessA2A);
            verifyElement(txtSuccessA2A);
            waitForElementClickable(btnNextA2A);
            click(btnNextA2A);

            waitForElement(elmntOnlineCardSuccessPopUp);
            waitForSeconds(1);
            takeScreenshot(driver);
            blResult = verifyElement(elmntOnlineCardSuccessPopUp);
            System.out.println("Online Payment status was Successful >>>>>");
        } catch (Exception e) {
            System.out.println("Online Payment status was failed >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyPaymentSuccessForCard() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntPaymentSuccessForCard);
            verifyElement(elmntPaymentSuccessForCard);
            waitForSeconds(2);
            waitForElementClickable(btnNextCrdCard);
            takeScreenshot(driver);
            jsScrollIntoView(btnNextCrdCard);
            waitAndClick(btnNextCrdCard);
            waitForSeconds(2);
            waitForElement(elmntOnlineCardSuccessPopUp);
            waitForSeconds(1);
            takeScreenshot(driver);
            blResult = verifyElement(elmntOnlineCardSuccessPopUp);
            System.out.println("Online cards Payment status was Successful >>>>>");
        } catch (Exception e) {
            System.out.println("Online Payment status was failed >>>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyThePrescriptionDetails() {
        boolean blResult = false;
        try {
//            driver.switchTo().defaultContent();
            System.out.println("Successfully Switch to Default Page");
            waitForSeconds(2);
//            waitForElement(elmntOnlineCardSuccessPopUp);
//            verifyElement(elmntOnlineCardSuccessPopUp);
//            waitForSeconds(4);
            takeScreenshot(driver);
            driver.switchTo().defaultContent();
//            waitForElementClickable(btnBackToRRP);
//            click(btnBackToRRP);
            waitForElementToAppear(driver, By.xpath(btnBackPaymentConfirmation1));
            jsScrollIntoView(btnBackPaymentConfirmation);
            waitForElementClickable(btnBackPaymentConfirmation);
            jsClick(btnBackPaymentConfirmation);
            waitForSeconds(5);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(txtViewPreviousRequests);
            System.out.println("verify The Prescription Details Online was Successful >>>>>");
        } catch (Exception e) {
            System.out.println("verify The Prescription Details Online was not Successful >>>>>");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyRuleAData() {
        boolean locationPresence = false;
        boolean doctorPresence = false;
        try {
            waitForElement(drpdownLocation);
            locationPresence = verifyElement(drpdownLocation);
            System.out.println("Select Location is present");
            waitForElement(drpdownDoctor);
            doctorPresence = verifyElement(drpdownDoctor);
            System.out.println("Select Doctor dropdown is present");
            locationPresence = true;
            doctorPresence = true;

        } catch (Exception e) {
            System.out.println("Location or Doctor dropdown are not verified in the Request Medication as per Rule A");
            e.printStackTrace();
        }
        return locationPresence && doctorPresence;
    }

    public boolean verifyRuleBData() {
        boolean locationPresence = false;
        boolean doctorPresence = false;
        try {
            locationPresence = !verifyElement(drpdownLocation);
            System.out.println("Select Location is not present as per the Rule B");
            waitForElement(drpdownDoctor);
            doctorPresence = verifyElement(drpdownDoctor);
            System.out.println("Select Doctor dropdown is present as per the Rule B");
            locationPresence = true;
            doctorPresence = true;

        } catch (Exception e) {
            System.out.println("Location or Doctor dropdown are not verified in the Request Medication as per Rule B");
            e.printStackTrace();
        }
        return locationPresence && doctorPresence;
    }

    public boolean verifyRuleCData() {
        boolean doctorPresenceForRuleC = false;
        boolean doctorPresence = false;
        try {
//            waitForElement(drpdownDoctor);
            doctorPresence = !verifyElement(drpdownDoctor);
            System.out.println("Select Doctor dropdown is not present as per the Rule C");
            waitForElement(drpdownDoctorRuleC);
            doctorPresenceForRuleC = verifyElement(drpdownDoctorRuleC);
            System.out.println("Unchangable default Doctor dropdown is present as per the Rule C");
        } catch (Exception e) {
            System.out.println("Default unchangable Doctor dropdown are not verified in the Request Medication as per Rule C");
            e.printStackTrace();
        }
        return doctorPresenceForRuleC && doctorPresence;
    }

    public boolean verifyRestrictedByLocation(String strLocation) {
        boolean dropDownLocation = false;
        try {
            waitForElement(drpdownLocation);
            waitForElementClickable(drpdownLocation);
            jsClick(drpdownLocation);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlScriptInstruction = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            jsScrollIntoView(ddlScriptInstruction);
            click(ddlScriptInstruction);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            String currentLocation = drpdownLocation.getText();
            System.out.println("Current Location :" + currentLocation + " Expected Location :" + strLocation);
            if (currentLocation.equalsIgnoreCase(strLocation)) {
                System.out.println("Both locations matched ");
                dropDownLocation = true;
            } else {
                System.out.println("Both locations mismatched ");
                dropDownLocation = false;
            }
        } catch (Exception e) {
            System.out.println("Default unchangable Doctor Location are not verified in the Request Medication as per Location and Provider rule");
            e.printStackTrace();
        }
        return dropDownLocation;
    }

    public boolean verifyRestrictedByProvider(String strProvider) {
        boolean doctorPresence = false;
        try {
            waitForElement(selectedProviderName);
            String selectedProvider = selectedProviderName.getAttribute("value");
            System.out.println("selectedProvider:::" + selectedProvider);
            System.out.println("Current Provider name is " + selectedProvider + "Expected Provider name is " + strProvider);
            if (selectedProvider.equalsIgnoreCase(strProvider)) {
                System.out.println("Select Doctor dropdown is present and matched as per the Provider and Location Rule");
                doctorPresence = true;
            } else {
                System.out.println("Select Doctor dropdown is present BUT NOT MATCHED as per the Provider and Location Rule");
                doctorPresence = false;
            }
        } catch (Exception e) {
            System.out.println("Default unchangable Doctor dropdown are not verified in the Request Medication as per Location and Provider rule");
            e.printStackTrace();
        }
        return doctorPresence;
    }

    public boolean verifyLocation(String strLocation) {
        boolean verifyLocation = false;
        try {
            waitForElement(getTxtRequestNewScript);
            verifyElement(getTxtRequestNewScript);
            waitForSeconds(4);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            if (!verifyElement((By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation))))) {
                waitForElementClickable(drpdownLocation);
                click(drpdownLocation);
                WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
                System.out.println(" select Location Locator ::" + ddlLocation);
                waitForElementClickable(ddlLocation);
                click(ddlLocation);
                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                waitForSeconds(2);
                System.out.println("Now changed the location to it's default location " + strLocation);
            }
            waitForElement(drpdownLocation);
            String currentLocation = drpdownLocation.getText();
            System.out.println("Current Location is " + currentLocation + "Expected Location is " + strLocation);
            if (currentLocation.equalsIgnoreCase(strLocation)) {
                System.out.println("Locations are matched as expected");
                verifyLocation = true;
            } else {
                System.out.println("Locations are matched as expected");
                verifyLocation = false;
            }

        } catch (Exception e) {
            System.out.println("Not Verified the Patient to Collect Script Location " + strLocation);
            e.printStackTrace();

        }
        return verifyLocation;
    }

    public boolean verifyProviderName(String strProvider) {
        boolean verifyProvider = false;
        try {
            waitForElement(inputProviderName);
            if (!verifyElement((By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strProvider))))) {
                waitForElementClickable(inputProviderName);
                click(inputProviderName);
                WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strProvider)));
                System.out.println(" select Provider name is ::" + ddlLocation);
                waitForElementClickable(ddlLocation);
                click(ddlLocation);
                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                waitForSeconds(2);
                System.out.println("Now changed the location to it's default Provider " + strProvider);
            }
            String currentProviderName = inputProviderName.getText();
            System.out.println("current Provider name is " + currentProviderName + "Expected Provider name is " + strProvider);
            if (currentProviderName.equalsIgnoreCase(strProvider)) {
                System.out.println("Provider names are matched ");
                verifyProvider = true;
            } else {
                System.out.println("Provider names are mismatched ");
                verifyProvider = false;
            }
        } catch (Exception e) {
            System.out.println("Not Verified the Patient to Collect Script provider name " + strProvider);
            e.printStackTrace();
        }
        return verifyProvider;
    }

    public boolean selectScriptInstruction(String strScriptDetail) {
        boolean scriptDetail = false;
        try {
            waitForElement(drpdwnScriptInstruction);
            click(drpdwnScriptInstruction);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlScriptInstruction = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strScriptDetail)));
            jsScrollIntoView(ddlScriptInstruction);
            click(ddlScriptInstruction);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement currentScriptDetails = waitForElement(By.xpath(ddLocation.replace("<<REPLACEMENT>>", strScriptDetail)));
            String CurrentScript = currentScriptDetails.getText();
            if (CurrentScript.equalsIgnoreCase(strScriptDetail)) {
                System.out.println("Current Script Instruction is " + strScriptDetail);
                scriptDetail = true;
            } else {
                System.out.println("Current script Instruction is not selected as expected" + strScriptDetail);
                scriptDetail = false;
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Script Instruction " + strScriptDetail);
            e.printStackTrace();
        }
        return scriptDetail;
    }

    public boolean  selectScriptInstructionSSTP(String strScriptDetail) {
        boolean scriptDetail = false;
        boolean optScriptsending = false;
        try {
            waitForElement(drpdwnScriptInstruction);
            click(drpdwnScriptInstruction);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlScriptInstruction = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strScriptDetail)));
            jsScrollIntoView(ddlScriptInstruction);
            click(ddlScriptInstruction);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForSeconds(3);
            waitForElement(optionScriptsending);
            System.out.println("Option is displayed for sending the script");
            optScriptsending = verifyElement(optionScriptsending);
            WebElement currentScriptDetails = waitForElement(By.xpath(ddLocation.replace("<<REPLACEMENT>>", strScriptDetail)));
            String CurrentScript = currentScriptDetails.getText();
            if (CurrentScript.equalsIgnoreCase(strScriptDetail)) {
                System.out.println("Current Script Instruction is " + strScriptDetail);
                scriptDetail = true;
            } else {
                System.out.println("Current script Instruction is not selected as expected" + strScriptDetail);
                scriptDetail = false;
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Script Instruction " + strScriptDetail);
            e.printStackTrace();
        }
        return scriptDetail && optScriptsending;
    }

    public boolean verifyScriptUrgency(List<String> ScriptUrgencies) {
        boolean verifyScriptUrgency = false;
        try {
            System.out.println("Expected Script Urgencies >>>>" + ScriptUrgencies);
            waitForElementClickable(drpdwnScriptUrgency);
            click(drpdwnScriptUrgency);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            List<String> lstActualScriptUrgencies = new ArrayList<>();
            for (WebElement strScriptUrgencies : lstscriptUrgencies) {
                lstActualScriptUrgencies.add(strScriptUrgencies.getText());
            }
            for (int i = 0; i < lstActualScriptUrgencies.size(); i++) {
                System.out.println("Now the actual items inside the webPage is " + lstActualScriptUrgencies.get(i));
            }
            if (ScriptUrgencies.size() == lstActualScriptUrgencies.size()) {
                for (int i = 0; i < ScriptUrgencies.size(); i++) {
                    System.out.println("Entered into the For Loop");
                    waitForSeconds(2);
                    if (ScriptUrgencies.get(i).equals(lstActualScriptUrgencies.get(i))) {
                        System.out.println("Expected::::" + ScriptUrgencies.get(i) + "Actual::::" + lstActualScriptUrgencies.get(i));
                        System.out.println("Matched");
                        verifyScriptUrgency = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Not able to verify the Script Agencies");
            e.printStackTrace();
        }
        return verifyScriptUrgency;
    }

    public boolean selectScriptUrgency(String strScriptUrgency) {
        boolean blscriptAgency = false;
        try {
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlScriptInstruction = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strScriptUrgency)));
            click(ddlScriptInstruction);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            String currentScriptUrgency = drpdwnScriptUrgency.getText();
            String expectedScriptUrgency = "Urgent/Same day - Std Fee: $1,022.00 (Incl. GST)";
            System.out.println("Current selected Script Urgency is " + currentScriptUrgency + " Expected Script Urgency is " + expectedScriptUrgency);
            if (currentScriptUrgency.equalsIgnoreCase(expectedScriptUrgency)) {
                System.out.println("Selected Script agency is matched ");
                blscriptAgency = true;
            } else {
                System.out.println("Selected Script agency is mismatched ");
                blscriptAgency = false;
            }
        } catch (Exception e) {
            System.out.println("Not able to choose any of the Script Agencies " + strScriptUrgency);
            e.printStackTrace();
        }
        return blscriptAgency;
    }

    public boolean selectScriptSendingOption(String savedListAddress) {
        boolean btnSavedList = false;
        boolean btnSavedAddress = false;
        try {
            waitForElementClickable(optionSavedList);
            click(optionSavedList);
            waitForSeconds(2);
            waitForElement(drpdownSelectPharmacy);
            btnSavedList = verifyElement(drpdownSelectPharmacy);
            waitForElementClickable(drpdwnSelectPharmacy);
            click(drpdwnSelectPharmacy);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            click(drpOptionZoomAddress);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(addressBoxValue);
            String currentAddress = addressBoxValue.getAttribute("value");
            System.out.println("Current addressBoxValue is " + currentAddress);
            if (currentAddress.equalsIgnoreCase(savedListAddress)) {
                System.out.println("Both Address matched as expected");
                btnSavedAddress = true;
            } else {
                System.out.println("Both address are different");
                btnSavedAddress = false;
            }
        } catch (Exception e) {
            System.out.println("Not able to select the Script Sending Option");
        }
        return btnSavedList && btnSavedAddress;
    }

    public boolean selectDMBPOption(String savedListAddress) {
        boolean btnSavedList = false;
        boolean btnSavedAddress = false;
        try {
            waitForElementClickable(optionSavedList);
            click(optionSavedList);
            waitForSeconds(2);
            waitForElement(drpdownSelectPharmacy);
            btnSavedList = verifyElement(drpdownSelectPharmacy);
            waitForElementClickable(drpdwnSelectPharmacy);
            click(drpdwnSelectPharmacy);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            click(drpOptionZoomAddress);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(selectedAaddressBoxValue);
            String currentAddress = selectedAaddressBoxValue.getAttribute("value");
            System.out.println("Current addressBoxValue is " + currentAddress);
            if (currentAddress.equalsIgnoreCase(savedListAddress)) {
                System.out.println("Both Address matched as expected");
                btnSavedAddress = true;
            } else {
                System.out.println("Both address are different");
                btnSavedAddress = false;
            }
        } catch (Exception e) {
            System.out.println("Not able to select the Script Sending Option");
        }
        return btnSavedList && btnSavedAddress;
    }

    public boolean selectSearchAddress(String selectAddress){
        boolean selectedAddress = false;
        try{
            waitForElement(drpdownSelectAddress);
            click(drpdownSelectAddress);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            waitForElementClickable(firstAddressOption);
            click(firstAddressOption);
            waitForElement(addressBoxValue);
            String currentSelectedAddress = addressBoxValue.getAttribute("value");
            System.out.println("Current addressBoxValue is " + selectAddress);
            if (currentSelectedAddress.equalsIgnoreCase(selectAddress)) {
                System.out.println("Both Address matched as expected");
                selectedAddress = true;
            } else {
                System.out.println("Both address are different");
                selectedAddress = false;
            }
        }catch (Exception e){
            System.out.println("Not able to match the selected address " + selectAddress);
        }
        return selectedAddress;
    }

    public boolean selectPayAtHealthCentre() {
        boolean blPaymentVerify = false;
        try {
            waitForElementClickable(checkBoxTermsAndConditions);
            click(checkBoxTermsAndConditions);
            waitForElementClickable(BtnPayAtHealthCentre);
            click(BtnPayAtHealthCentre);
            waitForElement(popUpContent);
            blPaymentVerify = verifyElement(popUpContent);
        } catch (Exception e) {
            System.out.println("Not able to verify the Pay At Health Centre");
            e.printStackTrace();
        }
        return blPaymentVerify;
    }

    public boolean VerifyPayAtHealthCentre() {
        boolean blPaymentVerify = false;
        try {
            if (!verifyElement(btnPayNow)) {
                waitForElementClickable(BtnPayAtHealthCentre);
                waitForElement(BtnPayAtHealthCentre);
                blPaymentVerify = verifyElement(BtnPayAtHealthCentre);
                System.out.printf("Only Show The PayAtHealth Centre Button Only");
            }else
            {
                verifyElement(btnPayNow);
                System.out.printf("Show The PayNow Button");
            }


        } catch (Exception e) {
            System.out.println("Not able to verify the Pay At Health Centre");
            e.printStackTrace();
        }
        return blPaymentVerify;
    }

}

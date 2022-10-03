package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class RepeatPrescription extends BasePage {

    public RepeatPrescription(WebDriver driver){
        super(driver);
    }



    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmntRepeatPrescriptions;

    @FindBy(how = How.XPATH, using = "//mat-progress-spinner[@mode='indeterminate']")
    protected WebElement elmntLoadingSpinner;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Request New Script')]")
    protected WebElement elmntRequestNewScript;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Previous Requests')]")
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

    protected String selectLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();




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
    protected WebElement drpdownUrgency;

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


    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-form-field')]/child::textarea[contains(@class,'mat-form-field')][@formcontrolname='MessageBody']")
    protected WebElement txaMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'I accept the Repeat Precriptions')]/preceding-sibling::mat-checkbox/label/div")
    protected WebElement chkTermsAndCondion;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Pay at health centre')]")
    protected WebElement btnPayAtHealthCentre;

    @FindBy(how = How.XPATH, using = "//span[text()='Pay Now']")
    protected WebElement btnPayNow;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Payment')]")
    protected WebElement txtPayment;

    @FindBy(how = How.XPATH, using = "//h2[text()='Payment Checkout']")
    protected WebElement txtPaymentCheckOut;

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



    @FindBy(how = How.XPATH, using = "//div[text()='Submit']")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//a[text()='Next']")
    protected WebElement btnNextCrdCard;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success m-t-40']/b[text()='Success']")
    protected WebElement elmntOnlineCardSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Payment Confirmation')]/i")
    protected WebElement btnBackPaymentConfirmation;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Previous Requests')]")
    protected WebElement txtViewPreviousRequests;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose')]")
    protected WebElement elmntCompose;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Compose Email')]")
    protected WebElement txtComposeEmail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Messages')]")
    protected WebElement elmntMessages;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//h4 [contains(text(),'Success!')]/following::p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email confirmation.')]/parent::div")
    protected WebElement txtRRPSuccessPopUp;


    @FindBy(how = How.XPATH, using = "//div[@id='PxPayAccount2AccountAuth_Logo' and @name='PxPayAccount2AccountAuth_Logo']")
    protected WebElement txtAccount2Account;

    @FindBy(how = How.XPATH, using = "//span[text()='Please enter the A2A test credentials:']")
    protected WebElement txtA2ACredentials;

    @FindBy(how = How.XPATH, using = "//h2[text()='Credit Card Payment']")
    protected WebElement txtCreditCardPayment;

    @FindBy(how = How.XPATH, using = "//div[text()='NEXT']")
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

    @FindBy(how = How.XPATH, using = "(//div[@class='repeat-card-block yellow ng-star-inserted'])[1]")
    protected WebElement emlntPrescriptionStatus;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[@class='mat-card-title'])[1]")
    protected WebElement txtPrescriptionDate;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='ddlSelectOrSearchFax' or @placeholder='Select or search for a pharmacy']")
    protected WebElement drpDownPharmacy;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='ddlSelectorSearchDelivery']")
    protected WebElement drpDownSearchPharmacy;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search Pharmacy')]")
    protected WebElement ddlPharmacy;

    @FindBy(how = How.XPATH, using = "(//button/preceding::div/h3[text()='Search Pharmacy'])[1]")
    protected WebElement txtSearchPharmacyForSentScript;

    @FindBy(how = How.XPATH, using = "(//button/preceding::div/h3[text()='Search Pharmacy'])[2]")
    protected WebElement txtSearchPharmacyForDelivery;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Find a pharmacy')]/preceding::mat-select[contains(@id,'mat-select-0')]")
    protected WebElement drpDownSelectForSentScript;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='City']")
    protected WebElement drpDownSelectForCity;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Suburb']")
    protected WebElement drpDownSelectForSubUrban;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='PharmacyName'])[1]")
    protected WebElement drpDownSelectForPharmacyName;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Find a pharmacy')]//ancestor::mat-select)[2]")
    protected WebElement drpDownSelectForDelivery;


    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='PharmacyName' or @ng-reflect-placeholder='Select Pharmacy'])[2]")
    protected WebElement drpDownSelectPharmacyForDelivery;

    @FindBy(how = How.XPATH, using = "//mat-select[@placeholder='Select City/Region']")
    protected WebElement drpDownSelectCityRegion;

    @FindBy(how = How.XPATH, using = "(//button//span[text()='Select'])[1]")
    protected WebElement btnSelectForSentScript;

    @FindBy(how = How.XPATH, using = "(//button//span[text()='Select'])[2]")
    protected WebElement btnSelectForDelivery;
    @FindBy(how = How.XPATH, using = "//mat-select[@name='selectOrAddDeliveryAddress' or @id='mat-select-52']")
    protected WebElement drpDownAddress;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String emlntSuccessPopUp1 = "//p[contains(text(),'Your request has been sent successfully. Once the request has been processed, you will get an email ')]";

    protected String txtPrescriptionDate1 = "(//mat-card-title[@class='mat-card-title'])[1]";


    protected String ddlSelect = new StringBuilder()
            .append("//span[@class='mat-option-text' and contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String chkMedicationForMobile = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::div/preceding-sibling::div/mat-checkbox//div").toString();


    //span[contains(text(),'Auckland')]
    protected String ddlSelectFileds = new StringBuilder()
            .append(" //span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String elmntMedicationFields = new StringBuilder()
            .append("(//mat-card-content[@class='mat-card-content']/following::div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

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


    public boolean selectHealthCentreLocation(String strLocation) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpdownLocation);
            waitForElementClickable(drpdownLocation);
            click(drpdownLocation);
            waitForSeconds(4);
            System.out.println(" select Location Locator :: " + selectLocation.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ddlLocation);
            waitForElementClickable(ddlLocation);
            waitForSeconds(2);
            System.out.println("Location was selected in the Request Medication >>> ::");
            mouseClick(ddlLocation);
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
            waitForElement(drpdownDoctor);
            waitForElementClickable(drpdownDoctor);
            click(drpdownDoctor);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            System.out.println("Doctor xpath >>> : " + selectDoctor.replace("<<REPLACEMENT>>", strDoctor));
            WebElement ddlDoctor = waitForElement(By.xpath(selectDoctor.replace("<<REPLACEMENT>>", strDoctor)));
            waitForElement(ddlDoctor);
            waitForElementClickable(ddlDoctor);
            waitForSeconds(4);
            mouseClick(ddlDoctor);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshotSanity(driver);
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
            waitForElement(drpdownInstructions);
            waitForElementClickable(drpdownInstructions);
            jsClick(drpdownInstructions);
            waitForSeconds(2);
            System.out.println(" SelectInstructions xpath >>> : " + selectInstructions.replace("<<REPLACEMENT>>", strInstruction));
            WebElement ddlInstructions = waitForElement(By.xpath(selectInstructions.replace("<<REPLACEMENT>>", strInstruction)));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ddlInstructions);
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
    public boolean clickNextButton(){
        boolean blResult=false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnNextRRP);
            jsScrollIntoView(btnNextRRP);
            waitForElementClickable(btnNextRRP);
            waitForSeconds(3);
            jsClick(btnNextRRP);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtTotalToPay);
            blResult= verifyElement(txtTotalToPay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }


    public boolean selectUrgency(String strUrgency) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpdownUrgency);
            waitForElementClickable(drpdownUrgency);
            jsClick(drpdownUrgency);
            waitForSeconds(2);
            System.out.println("Xpath for selectUrgrency Type >>> : " + selectUrgrency.replace("<<REPLACEMENT>>", strUrgency));
            WebElement ddlUrgrencyType = waitForElement(By.xpath(selectUrgrency.replace("<<REPLACEMENT>>", strUrgency)));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ddlUrgrencyType);
            waitForElementClickable(ddlUrgrencyType);
            mouseClick(ddlUrgrencyType);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Select Urgency >>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectMedicationsToRepeat(String strMedication) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("selectMedication XPath >>>>" + chkMedication.replace("<<REPLACEMENT>>", strMedication));
            WebElement selectMedication = waitForElement(By.xpath(chkMedication.replace("<<REPLACEMENT>>", strMedication)));
            waitForElementClickable(selectMedication);
            jsClick(selectMedication);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(chkTermsAndCondion);
            waitForElementClickable(chkTermsAndCondion);
            click(chkTermsAndCondion);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshotSanity(driver);
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
            click(btnPayAtHealthCentre);
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
            waitForElement(btnPayNow);
            waitForElementClickable(btnPayNow);
            waitForSeconds(4);
            click(btnPayNow);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(6);
            takeScreenshotSanity(driver);
            System.out.println("Successfully clicked Pay now button >>>");
            blResult = verifyElement(txtPayment);

        } catch (Exception e) {
            System.out.println("Failed to clicked Pay now button >>>");
            e.printStackTrace();

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
            click(btnPaymentOk);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtPaymentCheckOut);
            blResult = verifyElement(txtPaymentCheckOut);
            System.out.println("Repeat Prescription was success  and Successfully to navigate the View History Page>>>>>>");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Repeat Prescription was not success and so failed to navigate to View History Page >>>");
        }
        return blResult;
    }


    public boolean verifyThePrescriptionDetails(String strPrescriptionDetails) {
        boolean blResult = false;
        try {
            ArrayList<String> lstPrescriptionDetails = (ArrayList<String>) TestDataUtil.getListOfValue(strPrescriptionDetails);

            System.out.println("Contents of list >>>::" + lstPrescriptionDetails);

            List<String> strDetails = lstPrescriptionDetails.subList(2, 4);
            System.out.println("\nContent of strDetails :: >>> " + strDetails);


            waitForElement(txtViewPreviousRequests);
            verifyElement(txtViewPreviousRequests);
            waitForSeconds(2);
            takeScreenshotSanity(driver);
            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));

            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));

            String currentDate = formatter.format(calendar.getTime());
            System.out.println(currentDate);
            System.out.println("currentDate >>>: " + currentDate);
            waitForSeconds(2);
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
            e.printStackTrace();
            System.out.println(" Failed to verify the Prescription>>>");
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





}

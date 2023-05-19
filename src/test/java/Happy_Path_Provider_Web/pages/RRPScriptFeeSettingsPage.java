package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cap.utilities.SharedDriver.strExecutionID;

public class RRPScriptFeeSettingsPage extends BasePage {
    public RRPScriptFeeSettingsPage(WebDriver driver){
        super(driver);
    }

    public static String SystolicMedicationName = "";

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    protected WebElement elmntRRPScriptInstructionsEditButton;

    @FindBy(xpath = "(//mat-radio-group[@formcontrolname='IsRRPFeeLocationEnabled']//following::input)[1]")
    protected WebElement elmntRRPScriptInstructionsYesButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement elmntRRPScriptInstructionsSaveButton;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = " //mat-label[contains(text(),'Health Centre')]//preceding::mat-select")
    protected WebElement elmntHealthCentre;

    protected String SelectHealthCentre = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();


    protected String strRRPScriptInstructionsFeeSetupEditAction = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td/button").toString();

    //mat-label[contains(text(),'Health Centre')]//preceding::mat-select

    //td[contains(text(),'VM04Practice')]//following::td//following::td/button

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[1]")
    protected WebElement  elmntPatienttoCollectScriptCheckBox;

    @FindBy(xpath = "//mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']//child::input")
    protected WebElement  elmntUnCheckBox;


    @FindBy(how = How.XPATH, using = "(//b[.='Deliver via Zoom Pharmacy']/following::input/following::textarea)[1]")
    protected WebElement txtDeliveryViaZoomPharmacyUrgentSameDayDescription;

    @FindBy(how = How.XPATH, using = "(//b[.='Deliver Meds by Pharmacy']/following::input/following::textarea)[1]")
    protected WebElement txtDeliveryMedsByPharmacyUrgentSameDayDescription;


    @FindBy(how = How.XPATH, using = "(//b[.='Deliver via Zoom Pharmacy']/following::input/following::textarea)[2]")
    protected WebElement txtDeliveryViaZoomPharmacyNextDayDescription;

    @FindBy(how = How.XPATH, using = "(//b[.='Deliver Meds by Pharmacy']/following::input/following::textarea)[2]")
    protected WebElement txtDeliveryMedsByPharmacyNextDayDescription;


    @FindBy(how = How.XPATH, using = "(//b[.='Deliver via Zoom Pharmacy']/following::input/following::textarea)[3]")
    protected WebElement txtDeliveryViaZoomPharmacy48HoursDescription;

    @FindBy(how = How.XPATH, using = "(//b[.='Deliver Meds by Pharmacy']/following::input/following::textarea)[3]")
    protected WebElement txtDeliveryMedsByPharmacy48HoursDescription;

    @FindBy(how = How.XPATH, using = "(//b[.='Deliver via Zoom Pharmacy']/following::input/following::textarea)[4]")
    protected WebElement txtDeliveryViaZoomPharmacy72HoursDescription;

    @FindBy(how = How.XPATH, using = "(//b[.='Deliver Meds by Pharmacy']/following::input/following::textarea)[4]")
    protected WebElement txtDeliveryMedsByPharmacy72HoursDescription;


    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='Urgent/Same day'])[1]")
    protected WebElement elmntUrgentSamedayServiceoption;
    //mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']//child::input

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='STD'])[1]")
    protected WebElement getElmntUrgentSamedayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[2]")
    protected WebElement elmntNextDayCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='Next Day'])[1]")
    protected WebElement elmntNextDayServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='STD'])[2]")
    protected WebElement elmntNextDayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[3]")
    protected WebElement elmnt48HoursCheckBox;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[7]")
    protected WebElement elmntSendScriptByPost48HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='48 Hours'])[1]")
    protected WebElement elmnt48HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Urgent/Same day'])[3]")
    protected WebElement elmntSendScriptByPost48HoursServiceoption;



    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='STD'])[3]")
    protected WebElement elmnt48HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[4]")
    protected WebElement elmnt72HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='72 Hours'])[1]")
    protected WebElement elmnt72HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Patient to Collect Script')]//following::input[@data-placeholder='STD'])[4]")
    protected WebElement elmnt72HoursFee;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Fee'])[4]")
    protected WebElement elmntSendScriptByPost72HoursFee;


    @FindBy(xpath = "//span[contains(text(),'Save')] ")
    protected WebElement elmntSaveButton;


    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetupHeader;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[5]")
    protected WebElement elmntSendScriptbyPostCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Urgent/Same day'])[1]")
    protected WebElement getElmntSendScriptbyPostUrgentSameday;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Fee'])[1]")
    protected WebElement getElmntSendScriptbyPostUrgentSamedayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[6]")
    protected WebElement elmntSendScriptByPostNextDayCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Next Day'])[2]")
    protected WebElement elmntSendScriptByPostNextDayServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Fee'])[2]")
    protected WebElement elmntSendScriptByPostNextDayFee;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='Fee'])[3]")
    protected WebElement elmntSendScriptByPost48HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[8]")
    protected WebElement elmntSendScriptByPost72HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script by Post')]//following::input[@data-placeholder='72 Hours'])[1]")
    protected WebElement elmntSendScriptByPost72HoursServiceoption;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[9]")
    protected WebElement elmntSendScripttoPharmacyCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Urgent/Same day'])[1]")
    protected WebElement getElmntSendScripttoPharmacyUrgentSameday;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Fee'])[1]")
    protected WebElement getElmntSendScripttoPharmacyUrgentSamedayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[10]")
    protected WebElement elmntSendScriptToPharmacyNextDayCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Next Day'])[1]")
    protected WebElement elmntSendScriptToPharmacyNextDayServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Fee'])[2]")
    protected WebElement elmntSendScriptToPharmacyNextDayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[11]")
    protected WebElement elmntSendScriptToPharmacy48HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='48 Hours'])[1]")
    protected WebElement elmntSendScriptToPharmacy48HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Fee'])[3]")
    protected WebElement elmntSendScriptToPharmacy48HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[12]")
    protected WebElement elmntSendScriptToPharmacy72HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='72 Hours'])[1]")
    protected WebElement elmntSendScriptToPharmacy72HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Send Script to Pharmacy')]//following::input[@data-placeholder='Fee'])[4]")
    protected WebElement elmntSendScriptToPhamacy72HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[13]")
    protected WebElement elmntDeliverMedsByPharmacyCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='Urgent/Same day'])[1]")
    protected WebElement getElmntDeliverMedsByPharmacyUrgentSameday;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='STD'])[1]")
    protected WebElement getElmntDeliverMedsByPharmacyUrgentSamedayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[14]")
    protected WebElement elmntDeliverMedsByPharmacyNextDayCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='Next Day'])[1]")
    protected WebElement elmntDeliverMedsPharmacyNextDayServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='STD'])[2]")
    protected WebElement elmntDeliverMedsByToPharmacyNextDayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[15]")
    protected WebElement elmntDeliverMedsByPharmacy48HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='48 Hours'])[1]")
    protected WebElement elmntDeliverMedsByPharmacy48HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='STD'])[3]")
    protected WebElement elmntDeliverMedsByPharmacy48HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[16]")
    protected WebElement elmntDeliverMedsByPharmacy72HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='72 Hours'])[1]")
    protected WebElement elmntDeliverMedsByPharmacy72HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver Meds by Pharmacy')]//following::input[@data-placeholder='STD'])[4]")
    protected WebElement elmntDeliverMedsByPhamacy72HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[17]")
    protected WebElement elmntDeliverViaZoomPharmacyCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input)[1]")
    protected WebElement getElmntDeliverViaZoomPharmacyUrgentSameday;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input[@data-placeholder='STD'])[1]")
    protected WebElement getElmntDeliverViaZoomPharmacyUrgentSamedayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[18]")
    protected WebElement elmntDeliverViaZoomPharmacyNextDayCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input)[6]")
    protected WebElement elmntDeliverViaZoomPharmacyNextDayServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input[@data-placeholder='STD'])[2]")
    protected WebElement elmntDeliverViaZoomPharmacyNextDayFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[19]")
    protected WebElement elmntDeliverViaZoomPharmacy48HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input)[11]")
    protected WebElement elmntDeliverViaZoomPharmacy48HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input[@data-placeholder='STD'])[3]")
    protected WebElement elmntDeliverViaZoomPharmacy48HoursFee;

    @FindBy(xpath = "(//mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid mat-checkbox-checked'])[20]")
    protected WebElement elmntDeliverViaZoomPharmacy72HoursCheckBox;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input)[16]")
    protected WebElement elmntDeliverViaZoomPharmacy72HoursServiceoption;

    @FindBy(xpath = "(//b[contains(text(),'Deliver via Zoom Pharmacy')]//following::input[@data-placeholder='STD'])[4]")
    protected WebElement elmntDeliverViaZoomPhamacy72HoursFee;







    public boolean clickEditButton() {
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsEditButton);
        jsClick(elmntRRPScriptInstructionsEditButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsYesButton);
        jsClick(elmntRRPScriptInstructionsYesButton);
//        waitForElement(elmntRRPScriptInstructionsEditButton);
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsSaveButton);
        click(elmntRRPScriptInstructionsSaveButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmntRRPScriptInstructionsEditButton);
    }

    public boolean clickRRPScriptInstructionsFeeSetup() {
        waitForSeconds(3);
        waitForElementClickable(elmntRRPScriptInstructionsFeeSetup);
        jsClick(elmntRRPScriptInstructionsFeeSetup);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        return verifyElement(elmntRRPScriptInstructionsFeeSetup);
    }
    public boolean selectHealthCentre(String strHealthCentre) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntHealthCentre);
            waitForSeconds(2);
            jsClick(elmntHealthCentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(SelectHealthCentre.replace("<<REPLACEMENT>>", strHealthCentre)));
            System.out.printf(">>>>>>>>>>>>>>>>>>"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            blResult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {
            System.out.println("Health Centre not selected in the RRP Script Instructions Fee Setup");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickRRPScriptInstructionFeeSetupEditAction(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strRRPScriptInstructionsFeeSetupEditAction
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            System.out.printf(">>>>>>>>>>>"+elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(3);
            jsClick(elmntPrescriptionTableData);
            blResult =true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickPatienttoCollectScriptCheckBox() {
           jsScrollDown();
        if (elmntPatienttoCollectScriptCheckBox.isDisplayed()){
//            jsScrollIntoView(elmntPatienttoCollectScriptCheckBox);
            verifyElement(elmntPatienttoCollectScriptCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
            return verifyElement(elmntPatienttoCollectScriptCheckBox);
        }
          else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
          }
          return true;
    }

    public boolean EnterServiceOptionUrgentSameday(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(5);
//        jsScrollIntoView(elmntUrgentSamedayServiceoption);
        waitForElementClickable(elmntUrgentSamedayServiceoption);
        enterValue(elmntUrgentSamedayServiceoption, SystolicMedicationName);
        System.out.println(">>>>>>>>>>>Successfully Enter the UrgentSameDay Name");
        waitForSeconds(3);
        return verifyElement(elmntUrgentSamedayServiceoption);
    }
    public boolean clickFeeUrgentSameday(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntUrgentSamedayFee);
        enterValue(getElmntUrgentSamedayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(getElmntUrgentSamedayFee);
    }

    public boolean clickNextDayCheckBox() {
        if (elmntNextDayCheckBox.isDisplayed()){
            verifyElement(elmntNextDayCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean clickServiceOptionNextDay(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntNextDayServiceoption);
        enterValue(elmntNextDayServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntNextDayServiceoption);
    }

    public boolean clickNextDayFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntNextDayFee);
        enterValue(elmntNextDayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntNextDayFee);
    }

    public boolean click48HoursCheckBox() {
        if (elmnt48HoursCheckBox.isDisplayed()){
            verifyElement(elmnt48HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }

        return true;
    }

    public boolean clickServiceOption48Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmnt48HoursServiceoption);
        enterValue(elmnt48HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmnt48HoursServiceoption);
    }

    public boolean click48HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmnt48HoursFee);
        enterValue(elmnt48HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmnt48HoursFee);
    }

    public boolean click72HoursCheckBox() {
        if (elmnt72HoursCheckBox.isDisplayed()){
            verifyElement(elmnt72HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean clickServiceOption72Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmnt72HoursServiceoption);
        enterValue(elmnt72HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmnt72HoursServiceoption);
    }

    public boolean click72HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmnt72HoursFee);
        enterValue(elmnt72HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmnt72HoursFee);
    }

    public boolean clickSaveButton() {
        waitForSeconds(3);
        jsScrollIntoView(elmntSaveButton);
        waitForElementClickable(elmntSaveButton);
        jsClick(elmntSaveButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        return verifyElement(elmntRRPScriptInstructionsFeeSetupHeader);
    }

    public boolean clickSendScriptbyPostCheckBox() {
        jsScrollDown();
        waitForSeconds(2);
        if (elmntSendScriptbyPostCheckBox.isDisplayed()) {
            verifyElement(elmntSendScriptbyPostCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }
        return true;
    }

    public boolean EnterSendScriptByPostUrgentSamedayTextBox(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntSendScriptbyPostUrgentSameday);
        enterValue(getElmntSendScriptbyPostUrgentSameday, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(getElmntSendScriptbyPostUrgentSameday);
    }

    public boolean clickSendScriptByPostFeeUrgentSameday(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntSendScriptbyPostUrgentSamedayFee);
        enterValue(getElmntSendScriptbyPostUrgentSamedayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(getElmntSendScriptbyPostUrgentSamedayFee);
    }

    public boolean clickSendScriptByPostNextDayCheckBox() {
//        jsScrollDown();
//        waitForSeconds(2);
        if (elmntSendScriptByPostNextDayCheckBox.isDisplayed()) {
            verifyElement(elmntSendScriptByPostNextDayCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }

        return true;
    }

    public boolean clickSendScriptByPostServiceOptionNextDay(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPostNextDayServiceoption);
        enterValue(elmntSendScriptByPostNextDayServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPostNextDayServiceoption);
    }

    public boolean clickSendScriptByPostNextDayFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPostNextDayFee);
        enterValue(elmntSendScriptByPostNextDayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPostNextDayFee);
    }

    public boolean clickSendScriptByPost48HoursCheckBox() {
        if (elmntSendScriptByPost48HoursCheckBox.isDisplayed()){
            verifyElement(elmntSendScriptByPost48HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }

        return true;
    }

    public boolean clickSendScriptByPostServiceOption48Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPost48HoursServiceoption);
        enterValue(elmntSendScriptByPost48HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPost48HoursServiceoption);
    }

    public boolean clickSendScriptByPost48HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPost48HoursFee);
        enterValue(elmntSendScriptByPost48HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPost48HoursFee);
    }

    public boolean clickSendScriptByPost72HoursCheckBox() {
//        jsScrollDown();
//        waitForSeconds(2);
        if (elmntSendScriptByPost72HoursCheckBox.isDisplayed()){
            verifyElement(elmntSendScriptByPost72HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean clickSendScriptPostServiceOption72Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPost72HoursServiceoption);
        enterValue(elmntSendScriptByPost72HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPost72HoursServiceoption);
    }

    public boolean clickSendScriptByPost72HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptByPost72HoursFee);
        enterValue(elmntSendScriptByPost72HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptByPost72HoursFee);
    }

    public boolean clickSendScripttoPharmacyCheckBox() {
        jsScrollDown();
        waitForSeconds(2);
        if (elmntSendScripttoPharmacyCheckBox.isDisplayed()) {
            verifyElement(elmntSendScripttoPharmacyCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }
        return true;
    }

    public boolean EnterSendScripttoPharmacyUrgentSamedayTextBox(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntSendScripttoPharmacyUrgentSameday);
        enterValue(getElmntSendScripttoPharmacyUrgentSameday, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(getElmntSendScripttoPharmacyUrgentSameday);
    }

    public boolean clickSendScriptToPharamacyFeeUrgentSameday(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntSendScripttoPharmacyUrgentSamedayFee);
        enterValue(getElmntSendScripttoPharmacyUrgentSamedayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(getElmntSendScripttoPharmacyUrgentSamedayFee);
    }

    public boolean clickSendScripttoPharmacyNextDayCheckBox() {
        if (elmntSendScriptToPharmacyNextDayCheckBox.isDisplayed()) {
            verifyElement(elmntSendScriptToPharmacyNextDayCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }

        return true;
    }

    public boolean clickSendScriptToPharmacyServiceOptionNextDay(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPharmacyNextDayServiceoption);
        enterValue(elmntSendScriptToPharmacyNextDayServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPharmacyNextDayServiceoption);
    }

    public boolean clickSendScriptToPharmacyNextDayFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPharmacyNextDayFee);
        enterValue(elmntSendScriptToPharmacyNextDayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPharmacyNextDayFee);
    }

    public boolean clickSendScriptToPharmacy48HoursCheckBox() {
        if (elmntSendScriptToPharmacy48HoursCheckBox.isDisplayed()){
            verifyElement(elmntSendScriptToPharmacy48HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }

        return true;
    }

    public boolean clickSendScriptToPharmacyServiceOption48Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPharmacy48HoursServiceoption);
        enterValue(elmntSendScriptToPharmacy48HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPharmacy48HoursServiceoption);
    }

    public boolean clickSendScriptToPharmacy48HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPharmacy48HoursFee);
        enterValue(elmntSendScriptToPharmacy48HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPharmacy48HoursFee);
    }

    public boolean clickSendScriptToPharmacy72HoursCheckBox() {
        if (elmntSendScriptToPharmacy72HoursCheckBox.isDisplayed()){
            verifyElement(elmntSendScriptToPharmacy72HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean clickSendScriptToPharmacyServiceOption72Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPharmacy72HoursServiceoption);
        enterValue(elmntSendScriptToPharmacy72HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPharmacy72HoursServiceoption);
    }

    public boolean clickSendScriptToPharmacy72HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntSendScriptToPhamacy72HoursFee);
        enterValue(elmntSendScriptToPhamacy72HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntSendScriptToPhamacy72HoursFee);
    }

    public boolean clickDeliverMedsbyPharmacyCheckBox() {
        jsScrollDown();
        waitForSeconds(2);
        if (elmntDeliverMedsByPharmacyCheckBox.isDisplayed()) {
            verifyElement(elmntDeliverMedsByPharmacyCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }
        return true;
    }
    public boolean EnterDeliverMedsByPharmacyUrgentSamedayTextBox(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntDeliverMedsByPharmacyUrgentSameday);
        enterValue(getElmntDeliverMedsByPharmacyUrgentSameday, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(getElmntDeliverMedsByPharmacyUrgentSameday);
    }

    public boolean clickDeliverMedsByPharamacyFeeUrgentSameday(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntDeliverMedsByPharmacyUrgentSamedayFee);
        enterValue(getElmntDeliverMedsByPharmacyUrgentSamedayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(getElmntDeliverMedsByPharmacyUrgentSamedayFee);
    }

    public boolean clickDeliverMedsByPharmacyNextDayCheckBox() {
        if (elmntDeliverMedsByPharmacyNextDayCheckBox.isDisplayed()) {
            verifyElement(elmntDeliverMedsByPharmacyNextDayCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }

        return true;
    }

    public boolean clickDeliverMedsByPharmacyServiceOptionNextDay(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsPharmacyNextDayServiceoption);
        enterValue(elmntDeliverMedsPharmacyNextDayServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsPharmacyNextDayServiceoption);
    }

    public boolean clickDeliverMedsByPharmacyNextDayFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsByToPharmacyNextDayFee);
        enterValue(elmntDeliverMedsByToPharmacyNextDayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsByToPharmacyNextDayFee);
    }

    public boolean clickDeliverMedsByToPharmacy48HoursCheckBox() {
        if (elmntDeliverMedsByPharmacy48HoursCheckBox.isDisplayed()){
            verifyElement(elmntDeliverMedsByPharmacy48HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }

        return true;
    }

    public boolean clickDeliverMedsByPharmacyServiceOption48Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsByPharmacy48HoursServiceoption);
        enterValue(elmntDeliverMedsByPharmacy48HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsByPharmacy48HoursServiceoption);
    }

    public boolean clickDeliverMedsByPharmacy48HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsByPharmacy48HoursFee);
        enterValue(elmntDeliverMedsByPharmacy48HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsByPharmacy48HoursFee);
    }

    public boolean clickDeliverMedsByPharmacy72HoursCheckBox() {
        if (elmntDeliverMedsByPharmacy72HoursCheckBox.isDisplayed()){
            verifyElement(elmntDeliverMedsByPharmacy72HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean clickDeliverMedsByPharmacyServiceOption72Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsByPharmacy72HoursServiceoption);
        enterValue(elmntDeliverMedsByPharmacy72HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsByPharmacy72HoursServiceoption);
    }

    public boolean clickDeliverMedsByPharmacy72HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverMedsByPhamacy72HoursFee);
        enterValue(elmntDeliverMedsByPhamacy72HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverMedsByPhamacy72HoursFee);
    }

    public boolean clickDeliverviaZoomPharmacyCheckBox() {
        jsScrollDown();
        waitForSeconds(2);
        if (elmntDeliverViaZoomPharmacyCheckBox.isDisplayed()) {
            verifyElement(elmntDeliverViaZoomPharmacyCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }
        return true;
    }

    public boolean EnterDeliverViaZoomPharmacyUrgentSamedayTextBox(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntDeliverViaZoomPharmacyUrgentSameday);
        enterValue(getElmntDeliverViaZoomPharmacyUrgentSameday, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(getElmntDeliverViaZoomPharmacyUrgentSameday);
    }

    public boolean EnterDeliverViaZoomPharamacyFeeUrgentSameday(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(getElmntDeliverViaZoomPharmacyUrgentSamedayFee);
        enterValue(getElmntDeliverViaZoomPharmacyUrgentSamedayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(getElmntDeliverViaZoomPharmacyUrgentSamedayFee);
    }

    public boolean clickDeliverViaZoomPharmacyNextDayCheckBox() {
        if (elmntDeliverViaZoomPharmacyNextDayCheckBox.isDisplayed()) {
            verifyElement(elmntDeliverViaZoomPharmacyNextDayCheckBox);
            System.out.println("CheckBox Checked");
        } else {
            waitForSeconds(3);
            waitForElementClickable(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
        }

        return true;
    }

    public boolean selectDeliveryViaZoomPharmacyUrgentSameDayDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            jsClick(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            enterValue(txtDeliveryViaZoomPharmacyUrgentSameDayDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryMedsByPharmacyUrgentSameDayDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryMedsByPharmacyUrgentSameDayDescription);
            jsClick(txtDeliveryMedsByPharmacyUrgentSameDayDescription);
            enterValue(txtDeliveryMedsByPharmacyUrgentSameDayDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryMedsByPharmacyUrgentSameDayDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean EnterDeliverViaZoomPharmacyServiceOptionNextDay(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPharmacyNextDayServiceoption);
        enterValue(elmntDeliverViaZoomPharmacyNextDayServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPharmacyNextDayServiceoption);
    }


    public boolean EnterDeliverViaZoomPharmacyNextDayFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPharmacyNextDayFee);
        enterValue(elmntDeliverViaZoomPharmacyNextDayFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPharmacyNextDayFee);
    }

    public boolean clickDeliverViaZoomPharmacy48HoursCheckBox() {
        if (elmntDeliverViaZoomPharmacy48HoursCheckBox.isDisplayed()){
            verifyElement(elmntDeliverViaZoomPharmacy48HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }

        return true;
    }

    public boolean EnterDeliverViaZoomPharmacyServiceOption48Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPharmacy48HoursServiceoption);
        enterValue(elmntDeliverViaZoomPharmacy48HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPharmacy48HoursServiceoption);
    }

    public boolean EnterDeliverViaZoomPharmacy48HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPharmacy48HoursFee);
        enterValue(elmntDeliverViaZoomPharmacy48HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPharmacy48HoursFee);
    }

    public boolean clickDeliverViaZoomPharmacy72HoursCheckBox() {
        if (elmntDeliverViaZoomPharmacy72HoursCheckBox.isDisplayed()){
            verifyElement(elmntDeliverViaZoomPharmacy72HoursCheckBox);
            System.out.println("Successfullt Verifly Check Box Checked");
        }
        else {
            waitForElement(elmntUnCheckBox);
            jsClick(elmntUnCheckBox);
            System.out.println("Successfully Click Check Box");
        }
        return true;
    }

    public boolean EnterDeliverViaZoomPharmacyServiceOption72Hours(String strConditionName) {
        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPharmacy72HoursServiceoption);
        enterValue(elmntDeliverViaZoomPharmacy72HoursServiceoption, SystolicMedicationName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPharmacy72HoursServiceoption);
    }

    public boolean EnterDeliverViaZoomPharmacy72HoursFee(String strConditionName) {
//        SystolicMedicationName = strConditionName.concat(strExecutionID);
        waitForSeconds(2);
        waitForElementClickable(elmntDeliverViaZoomPhamacy72HoursFee);
        enterValue(elmntDeliverViaZoomPhamacy72HoursFee, strConditionName);
        waitForSeconds(3);
        return verifyElement(elmntDeliverViaZoomPhamacy72HoursFee);
    }

    public boolean selectDeliveryViaZoomPharmacyNextDayDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryViaZoomPharmacyNextDayDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryViaZoomPharmacyNextDayDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryViaZoomPharmacyNextDayDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryMedsByPharmacyNextDayDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryMedsByPharmacyNextDayDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryMedsByPharmacyNextDayDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryMedsByPharmacyNextDayDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryViaZoomPharmacy48HoursDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryViaZoomPharmacy48HoursDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryViaZoomPharmacy48HoursDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryViaZoomPharmacy48HoursDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryMedsByPharmacy48HoursDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryMedsByPharmacy48HoursDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryMedsByPharmacy48HoursDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryMedsByPharmacy48HoursDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryViaZoomPharmacy72HoursDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryViaZoomPharmacy72HoursDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryViaZoomPharmacy72HoursDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryViaZoomPharmacy72HoursDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDeliveryMedsByPharmacy72HoursDescription(String strDescription) {
        boolean blResult = false;
        try {
//            waitForElement(txtDeliveryViaZoomPharmacyUrgentSameDayDescription);
            String firstServiceOptionDescriptionText = "Description value "+ strDescription;
            System.out.println("UrgentSameDay Description data    " + firstServiceOptionDescriptionText);
            jsScrollIntoView(txtDeliveryMedsByPharmacy72HoursDescription);
//            jsClick(txtDeliveryViaZoomPharmacyNextDayDescription);
            enterValue(txtDeliveryMedsByPharmacy72HoursDescription, firstServiceOptionDescriptionText);
            blResult = verifyElement(txtDeliveryMedsByPharmacy72HoursDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Delivery Via ZoomPharmacy UrgentSameDay Description>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }




}

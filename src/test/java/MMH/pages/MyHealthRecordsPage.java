package MMH.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import java.io.File;
import java.util.List;

public class MyHealthRecordsPage extends BasePage {
    public MyHealthRecordsPage(WebDriver driver) {
        super(driver);
    }
    public String strVisitedName = "";

    @FindBy(how = How.XPATH, using = "//a[@class='menu-header ng-star-inserted']/following::span[text()='My Health Records']/following-sibling::mat-icon")
    protected WebElement btnMyHealthRecordsExpand;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-prescription-extra-medicine']//following::span[1]")
    protected WebElement elmntPrescriptions;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'All Sources')]/ancestor::mat-form-field//span[text()]")
    protected WebElement elmntFilterdropPrescriptions;
    protected String elmntFilterbyDrop = new StringBuilder().append("//mat-option//child::span[normalize-space(text())='")
            .append("<<REPLACEMENT>>").append("']").toString();


    @FindBy(how = How.XPATH, using = "//span[text()='Classifications']")
    protected WebElement elmntClassifications;

    protected String strPrescriptionsIconContentLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT5>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();


    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
    protected WebElement elmntIcon;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntdashboard;


    protected String strClassificationsIconLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT5>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='Clinician Notes']")
    protected WebElement elmntClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[text()='Summary']")
    protected WebElement elmntSummary;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-file-export-files']/following::span[text()='Export']")
    protected WebElement elmntExport;


    @FindBy(how = How.XPATH, using = "//img[@class='profile-pic img-fluid']")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' Sign Out ')]")
    protected WebElement elmntSignout;


    protected String strClinicalNotesIconLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='Allergies']")
    protected WebElement elmntAllergies;

    protected String strAllergiesNotesIconLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();


    @FindBy(how = How.XPATH, using = "//span[text()='Immunisations']")
    protected WebElement elmntImmunisations;


    protected String strImmunisationsIconLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();
    @FindBy(how = How.XPATH, using = "//span[text()='Lab Results']")
    protected WebElement elmntLabResults;


    protected String strLabResultsIconLocator = new StringBuilder()
            .append("//td[contains(.,'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT4>>").append("')]/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[1]")
    protected WebElement elmntDownArrow;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'New health records are displayed in green')]/preceding::span[@role='listbox'][1]")
    protected WebElement elmntDownArrow1;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Recalls')]")
    protected WebElement elmntRecalls;


    protected String strRecallsIconLocator = new StringBuilder()
            .append("//td[contains(.,'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td[contains(.,'")
            .append("<<REPLACEMENT4>>").append("')]/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();

    protected String strClinicalNotesDetails = new StringBuilder()
            .append("(//*[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[last()]").toString();
    protected String strPrescriptionsDetails = new StringBuilder()
            .append("//div[@class='tbl-th']/following::div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();


    protected String strClassificationsDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
    protected String strAllergiesNotesDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strImmunisationsDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strLabResultsDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strTestResultsDetails = new StringBuilder()
            .append("//div[@class='k-window-actions k-dialog-actions']/following::span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
    @FindBy(how = How.XPATH, using = "//span[text()='Close']")
    protected WebElement elmntlabIcon;

    protected String strRecallsDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
    protected String strRecallsRemainderDetails = new StringBuilder()
            .append("//div[@class='k-window-actions k-dialog-actions']/following::span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strClinicalNotesMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String getStrImmunisationsMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrClassificationsMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrAllergiesMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<DATA>>").append("')]").toString();

    protected String strPrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String strPrescriptionsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strAllergiesMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String strAllergiesMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strImmunisationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String strCOVIDImmunisationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td/button//mat-icon[text()=' info_outline']").toString();
    protected String  strImmunisationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String  strCOVIDImmunisationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String strClassificationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String  strClassificationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();





    @FindBy(how = How.XPATH, using = "//p[text()='Write the name who visited']//following::div[11]//input")
    protected WebElement elmntVisitedName;

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of the vaccine']/following::div[11]//input")
    protected WebElement elmntImmunisationVaccineName;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Batch Number']")
    protected WebElement elmntCovidImmunisationBatchNo;

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of the condition']//following::div[11]//input")
    protected WebElement elmntConditionName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='allergicName'])[1]")
    protected WebElement elmntAllergicName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='medicationName'])[1]")
    protected WebElement elmntPrescriptionsMedicationName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='dosage'])[1]")
    protected WebElement elmntPrescriptionsDose;

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of visited location']//following::div[11]//input")
    protected WebElement elmntVisitedLocation;

    @FindBy(how = How.XPATH, using = "//textarea[@id='mat-input-19']")
    protected WebElement elmntAdditionalInformation;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[44]//textarea")
    protected WebElement elmntClassiAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//p[text()='Additional Information']//following::textarea[@formcontrolname='additionalInformation'])[2]")
    protected WebElement elmntAllergiesAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='additionalInformation'])[1]")
    protected WebElement elmntPrescriptionAdditionalInformation;
    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the date of given vaccine?']//following::div[28]//textarea")
    protected WebElement elmntImmuAdditionalInformation;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='Site']")
    protected WebElement elmntCovidClinicalSite;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the visited date?']//following::div[28]//textarea")
    protected WebElement elmntClinicianNotesAdditionalInformation;





    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the visited date?']//following::div[13]")
    protected WebElement elmntVisitedDate;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the date of given vaccine?']//following::div[13]//input")
    protected WebElement elmntImmunisationDate;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='DateGiven']")
    protected WebElement elmntCovidImmunisationDate;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[13]//input")
    protected WebElement elmntStartDate;

    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='startDate'])[1]")
    protected WebElement elmntAllergiesStartDate;

    @FindBy(how = How.XPATH, using = "//p[text()='How often?']//following::div[49]")
    protected WebElement elmntPrescriptionDateToken;


    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[29]//input")
    protected WebElement elmntEndDate;

    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='endDate'])[1]")
    protected WebElement elmntAllergiesEndDate;

    @FindBy(how = How.XPATH, using = "//p[text()='How often?']//following::div[81]")
    protected WebElement elmntPrescriptionEndDate;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Record')]//parent::button")
    protected WebElement btnAddRecord;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Add COVID Immunisation ')]//parent::button")
    protected WebElement btnCovidAddRecord;

    @FindBy(how = How.XPATH, using = "//mat-dialog-actions//span[text()='Save']")
    protected WebElement btnCovidSave;

    @FindBy(how = How.XPATH, using = "//div[text()='COVID19 Comirnaty - 2']")
    protected WebElement btnCovidDose;

    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator btn-increment mat-stroked-button mat-button-base']")
    protected WebElement btnDose;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='false'][@id='mat-checkbox-9-input']")
    protected WebElement elmntCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='false'][@id='mat-checkbox-10-input']")
    protected WebElement elmntClassiCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='false'][@id='mat-checkbox-6-input']")
    protected WebElement elmntAllergiesCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='false'][@id='mat-checkbox-5-input']")
    protected WebElement elmntPrescriptionCheckBox;

    @FindBy(how = How.XPATH, using = "//div[@class='footer-checkbox']//following::mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']")
    protected WebElement elmtImmunisationsiCheckBox;


    @FindBy(how = How.XPATH, using = "//mat-checkbox[not(contains(@class,'mat-checkbox-checked'))][@formcontrolname='isconf']")
    protected WebElement elmtCovidImmunisationsiCheckBox;


    protected String strFloorplanFilePath = new StringBuilder().append(System.getProperty("user.dir")).append(File.separator).append(Constants.CONFIG_FOLDER).append(File.separator)
            .append(Constants.IMAGES_FOLDER).append(File.separator)
            .append("<<FILENAME>>").toString();

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='uploadDocument']")
    protected WebElement btnFloorplanUpload;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the visited date?']//following::div[40]//button")
    protected WebElement elmntSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[2]")
    protected WebElement elmntAllergiesSave;
    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[3]")
    protected WebElement elmntImmuSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[1]")
    protected WebElement elmntPrescriptionSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[4]")
    protected WebElement elmntClassificationsSave;



    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnPrescriptionsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnAllergiesSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnClassificationsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnClinicianNotesSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnImmunisationsSave;

    @FindBy(how = How.XPATH, using = "(//span[text()='Update'])[3]")
    protected WebElement btnCovidImmunisationsUpdate;



    protected String strActiveHeader = new StringBuilder().append("//h3[contains(text(),'").append("<<REPLACEMENT>>").append("')]").toString();

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntCovidEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntPrescriptionsEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntEditedLocation = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]").toString();

    protected String elmntDelete = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'remove')]").toString();

    protected String elmntVerifyDelete = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//p[text()='What is the status?']//following::div[11]")
    protected WebElement elmntclassificationdrop;

    @FindBy(how = How.XPATH, using = "//p[text()=' Name of Vaccine']//following::div[12]//mat-select")
    protected WebElement elmntCovidImmunisationsdrop;

    @FindBy(how = How.XPATH, using = "//p[text()='Severity']//following::div[12]")
    protected WebElement elmntAllergicdrop;

    @FindBy(how = How.XPATH, using = "//p[text()='Status']//following::div[12]")
    protected WebElement elmntAllergicdrop1;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='howOften'])[1]")
    protected WebElement elmntPrescriptiondrop;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='prescStatusType'])[1]")
    protected WebElement elmntPrescriptiondrop1;


    protected String elmntAddclassiDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntCovidImmunisationsDrop = new StringBuilder().append("//span[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntAddAllergicDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntAllergicDrop1 = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntAddPrescriptionDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntAddPrescriptionDrop1 = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();




    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')]")
    protected WebElement btnYes;
    public void visit() {
        visit(TestDataUtil.getValue("&URL&"));
        takeScreenshot(driver);

    }

    public void clickMyHealthRecordsOptionFromMenu() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementClickable(btnMyHealthRecordsExpand);
            jsClick(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntPrescriptions);
            jsClick(elmntPrescriptions);

        }
    }

    public void clickMyHealthRecordsOptionMenu() {
        jsScrollIntoView(btnMyHealthRecordsExpand);
        waitForElementClickable(btnMyHealthRecordsExpand);
        jsClick(btnMyHealthRecordsExpand);

    }
    public boolean selectFilterbyIsFor(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntFilterdropPrescriptions);
            waitForSeconds(2);
            jsClick(elmntFilterdropPrescriptions);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntFilterbyDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean VerifyPrescriptionsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strPrescriptionsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void clickMaxvalue() {
        waitForElement(elmntDownArrow);
        click(elmntDownArrow);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ENTER);
    }
    public void clickMaxvalue1() {
        waitForElement(elmntDownArrow1);
        click(elmntDownArrow1);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ENTER);
    }

    public boolean ClickPrescriptionsIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntPrescriptionIconData = waitForElement(By.xpath(strPrescriptionsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));

            waitForElementClickable(elmntPrescriptionIconData);
            jsClick(elmntPrescriptionIconData);
            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }


            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void clickDashboardFromMenu() {
        jsScrollIntoView(elmntdashboard);
        waitForElementClickable(elmntdashboard);
        jsClick(elmntdashboard);

    }

    public void clickMyHealthRecordsOptionFromMenuClassifications() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntClassifications);
            jsClick(elmntClassifications);

        }
    }

    public boolean VerifyClassificationsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntClassificationTableData = waitForElement(By.xpath(strClassificationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));

            waitForElement(elmntClassificationTableData);
            verifyElement(elmntClassificationTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickClassificationsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntClassificationIconData = waitForElement(By.xpath(strClassificationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));

            waitForElementClickable(elmntClassificationIconData);
            jsClick(elmntClassificationIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strClassificationsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void clickMyHealthRecordsOptionFromMenuClinicNotes() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            jsScrollIntoView(elmntClinicalNotes);
            waitForElementClickable(elmntClinicalNotes);
            jsClick(elmntClinicalNotes);

        }
    }

    public void clickMyHealthRecordsOptionFromMenuSummary() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntSummary);
            jsClick(elmntSummary);

        }
    }


    public void clickExportButton(){

        click(elmntExport);
    }


    public void DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :"+ file.getName());
            file.delete();
        }
    }
    public boolean VerifyClinicNotesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntClinicNotesTableData = waitForElement(By.xpath(strClinicalNotesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(elmntClinicNotesTableData);
            verifyElement(elmntClinicNotesTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickClinicNotesIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntClinicNotesIconData = waitForElement(By.xpath(strClinicalNotesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntClinicNotesIconData);
            jsClick(elmntClinicNotesIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strClinicalNotesDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void clickMyHealthRecordsOptionFromMenuAllergies() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntAllergies);
            jsClick(elmntAllergies);

        }
    }

    public void clickMyHealthRecordsOptionFromMenuImmunisations() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntImmunisations);
            jsClick(elmntImmunisations);
        }
    }


    public void clickMyHealthRecordsOptionFromMenuLabResults() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntLabResults);
            jsClick(elmntLabResults);

        }
    }

    public boolean VerifyAllergiesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntAllergiesTableData = waitForElement(By.xpath(strAllergiesNotesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(elmntAllergiesTableData);
            verifyElement(elmntAllergiesTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAllergiesIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntAllergiesIconData = waitForElement(By.xpath(strAllergiesNotesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntAllergiesIconData);
            jsClick(elmntAllergiesIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strAllergiesNotesDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean VerifyImmunisationsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntImmunisationTableData = waitForElement(By.xpath(strImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(elmntImmunisationTableData);
            verifyElement(elmntImmunisationTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickImmunisationsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntImmunisationIconData = waitForElement(By.xpath(strImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntImmunisationIconData);
            jsClick(elmntImmunisationIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strImmunisationsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyLabResultsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntLabResultTableData = waitForElement(By.xpath(strLabResultsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(elmntLabResultTableData);
            verifyElement(elmntLabResultTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickLabResultsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntLabResultIconData = waitForElement(By.xpath(strLabResultsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntLabResultIconData);
            jsClick(elmntLabResultIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strLabResultsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickLabResultsIconLocatorVerifyTestResults(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntTestResults = waitForElement(By.xpath(strLabResultsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntTestResults);
            jsClick(elmntTestResults);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strTestResultsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public void clickMyHealthRecordsOptionFromMenuRecalls() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            jsScrollIntoView(elmntRecalls);
            waitForSeconds(2);
            waitForElementClickable(elmntRecalls);
            jsClick(elmntRecalls);

        }

    }

    public boolean VerifyRecallsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntRecallsTableData = waitForElement(By.xpath(strRecallsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(elmntRecallsTableData);
            verifyElement(elmntRecallsTableData);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return blResult;
    }

    public boolean ClickRecallsRemainderIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntRecallsRemainderIconData = waitForElement(By.xpath(strRecallsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntRecallsRemainderIconData);
            jsClick(elmntRecallsRemainderIconData);

            for (String str : lstDetails1) {
                System.out.println("Element is ::>>"+str);
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strRecallsRemainderDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Displayed::>>");
                }else{
                    System.out.println("Element is Not Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickRecallsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntRecallsIconData = waitForElement(By.xpath(strRecallsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElementClickable(elmntRecallsIconData);
            jsClick(elmntRecallsIconData);

            for (String str : lstDetails1) {

                WebElement elmntPaitientDetails = waitForElement(By.xpath(strRecallsDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyMyEntries(List<String> ClinicMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(0)
                + "  Data Value2::>>" + TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(1)
                + "  Data Value3::>>" + TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(2)))));
        WebElement elmntMyEntiresReport = waitForElement(By.xpath(strClinicalNotesMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(0)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(1)))
                .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(ClinicMyEntitiesNotesDetails.get(2)))));
        waitForElement(elmntMyEntiresReport);
        isVerifed = verifyElement(elmntMyEntiresReport);
        return isVerifed;
    }

    public boolean ClickAndVerifycMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMyEntiresReport = waitForElement(By.xpath(strClinicalNotesMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))));
            waitForElement(elmntMyEntiresReport);
            jsClick(elmntMyEntiresReport);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strMyEntriesInfoDetails.replace("<<DATA>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Verify::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyPrescriptionsMyEntries(List<String> PrescriptionsMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(0)
                + "  Data Value2::>>" + TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(1)
                + "  Data Value3::>>" + TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(2)))));
        WebElement elmntPrescriptionMyEntiresData = waitForElement(By.xpath(strPrescriptionsMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(0)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(1)))
                .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(2)))));
        waitForElement(elmntPrescriptionMyEntiresData);
        isVerifed = verifyElement(elmntPrescriptionMyEntiresData);
        return isVerifed;
    }
    public boolean VerifyPrescriptionsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(strPrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))));
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyAllergiesMyEntries(List<String> AllergiesMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(0)
                + "  Data Value2::>>" + TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(1)
                + "  Data Value3::>>" + TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(2)))));
        WebElement elmntMyEntiresReport = waitForElement(By.xpath(strAllergiesMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(0)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(1)))
                .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(AllergiesMyEntitiesNotesDetails.get(2)))));
        waitForElement(elmntMyEntiresReport);
        isVerifed = verifyElement(elmntMyEntiresReport);
        return isVerifed;
    }
    public boolean VerifyAllergiesMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMyEntiresReport = waitForElement(By.xpath(strAllergiesMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))));
            waitForElement(elmntMyEntiresReport);
            jsClick(elmntMyEntiresReport);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strAllergiesMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean verifyImmunisationsMyEntries(List<String> ImmunisationsMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(0)
                + "  Data Value2::>>" + TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(1))));
        WebElement elmntMyEntiresReport = waitForElement(By.xpath(strImmunisationsMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(0)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(1)))));
        waitForElement(elmntMyEntiresReport);
        isVerifed = verifyElement(elmntMyEntiresReport);
        return isVerifed;
    }

    public boolean VerifyImmunisationsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMyEntiresReport = waitForElement(By.xpath(strImmunisationsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(elmntMyEntiresReport);
            jsClick(elmntMyEntiresReport);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strImmunisationsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyCOVIDImmunisationsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMyEntiresReport = waitForElement(By.xpath(strCOVIDImmunisationsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(elmntMyEntiresReport);
            jsClick(elmntMyEntiresReport);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strCOVIDImmunisationsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean verifyClassificationsMyEntitiesNotesDetails(List<String> ClassificationsMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(ClassificationsMyEntitiesNotesDetails.get(0)
                + "  Data Value2::>>" + TestDataUtil.getValue(ClassificationsMyEntitiesNotesDetails.get(1))));
        WebElement elmntMyEntiresReport = waitForElement(By.xpath(strClassificationsMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(ClassificationsMyEntitiesNotesDetails.get(0)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(ClassificationsMyEntitiesNotesDetails.get(1)))));
        waitForElement(elmntMyEntiresReport);
        isVerifed = verifyElement(elmntMyEntiresReport);
        return isVerifed;
    }

    public boolean VerifyClassificationsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMyEntiresReport = waitForElement(By.xpath(strClassificationsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(elmntMyEntiresReport);
            jsClick(elmntMyEntiresReport);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strClassificationsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                if (verifyElement(elmntMyEntries)) {
                    System.out.println("Element is Displayed::>>");
                }
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public void enterVistedName(String strVisitedName) {
        waitForElement(elmntVisitedName);
        enterValue(elmntVisitedName, strVisitedName);
    }
    public void enterImmunisationVaccineName(String strVisitedName) {
        waitForElement(elmntImmunisationVaccineName);
        enterValue(elmntImmunisationVaccineName, strVisitedName);
    }

    public void enterCovidImmunisationBatchNo(String strVisitedName) {
        waitForElement(elmntCovidImmunisationBatchNo);
        enterValue(elmntCovidImmunisationBatchNo, strVisitedName);
    }
    public void enterConditionName(String strConditionName) {
        waitForSeconds(2);
        waitForElementClickable(elmntConditionName);
        enterValue(elmntConditionName, strConditionName);
    }
    public void enterAllergicConditionName(String strConditionName) {
        waitForSeconds(2);
        waitForElementClickable(elmntAllergicName);
        enterValue(elmntAllergicName, strConditionName);
    }

    public void enterPrescriptionsMedicationName(String strConditionName) {
        waitForSeconds(2);
        waitForElementClickable(elmntPrescriptionsMedicationName);
        enterValue(elmntPrescriptionsMedicationName, strConditionName);
    }

    public void enterPrescriptionsDose(String strDoseName) {
        System.out.println("enterelement::::"+strDoseName);
        waitForSeconds(2);
        waitForElement(elmntPrescriptionsDose);
        enterValue(elmntPrescriptionsDose, strDoseName);
    }

    public void enterVisitedLocation(String strVisitedLocation) {
        System.out.println("enterelement::::"+strVisitedLocation);
        waitForSeconds(5);
        waitForElement(elmntVisitedLocation);
        enterValue(elmntVisitedLocation, strVisitedLocation);
    }

    public boolean selectFrequency(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntPrescriptiondrop);
            waitForSeconds(2);
            jsClick(elmntPrescriptiondrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSeverity(String strSeverity) {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmntAllergicdrop);
            waitForSeconds(2);
            waitForElementClickable(elmntAllergicdrop);
            waitForSeconds(2);
            jsClick(elmntAllergicdrop);
            waitForSeconds(2);
            System.out.println(strSeverity);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddAllergicDrop.replace("<<REPLACEMENT>>", strSeverity)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectStatus(String strSeverity) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntclassificationdrop);
            waitForSeconds(2);
            jsClick(elmntclassificationdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddclassiDrop.replace("<<REPLACEMENT>>", strSeverity)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }



    public void enterAdditionalInformation(String strAdditionalInformation) {
        waitForElement(elmntImmuAdditionalInformation);
        enterValue(elmntImmuAdditionalInformation, strAdditionalInformation);
    }

    public void enterCovidClinicalSite(String strAdditionalInformation) {
        waitForSeconds(3);
        waitForElement(elmntCovidClinicalSite);
        enterValue(elmntCovidClinicalSite, strAdditionalInformation);
    }

    public void enterClinicianNotesAdditionalInformation(String strAdditionalInformation) {
        waitForElement(elmntClinicianNotesAdditionalInformation);
        enterValue(elmntClinicianNotesAdditionalInformation, strAdditionalInformation);
    }

    public void enterClassiAdditionalInformation(String strAdditionalInformation) {
        System.out.println(strAdditionalInformation);
        jsScrollIntoView(elmntClassiAdditionalInformation);
        waitForElement(elmntClassiAdditionalInformation);
        enterValue(elmntClassiAdditionalInformation, strAdditionalInformation);
    }

    public void enterAllergiesAdditionalInformation(String strAdditionalInformation) {
        jsScrollIntoView(elmntAllergiesAdditionalInformation);
        waitForElement(elmntAllergiesAdditionalInformation);
        enterValue(elmntAllergiesAdditionalInformation, strAdditionalInformation);
    }

    public void enterPrescriptionAdditionalInformation(String strAdditionalInformation) {
        jsScrollIntoView(elmntPrescriptionAdditionalInformation);
        waitForElement(elmntPrescriptionAdditionalInformation);
        enterValue(elmntPrescriptionAdditionalInformation, strAdditionalInformation);
    }

    public void enterVisitedDate() {
        waitForElement(elmntVisitedDate);
        click(elmntVisitedDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day:: >>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }
    public void enterImmunisationDateGiven() {
        waitForElement(elmntImmunisationDate);
        click(elmntImmunisationDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day:: >>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterCovidImmunisationDateGiven() {
        waitForElement(elmntCovidImmunisationDate);
        click(elmntCovidImmunisationDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterStartDate() {
        waitForElement(elmntStartDate);
        click(elmntStartDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day ::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterAllergiesStartDate() {
        waitForElement(elmntAllergiesStartDate);
        click(elmntAllergiesStartDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterPrescriptionDateTaken() {
        waitForElement(elmntPrescriptionDateToken);
        click(elmntPrescriptionDateToken);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day ::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterAllergiesEndDate() {
        waitForElement(elmntAllergiesEndDate);
        click(elmntAllergiesEndDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterPrescriptionEndDate() {
        waitForElement(elmntPrescriptionEndDate);
        click(elmntPrescriptionEndDate);
        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void enterEndDate() {
        waitForElementClickable(elmntEndDate);
        jsClick(elmntEndDate);

        String strDateFormat = "d";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        System.out.println("Current Day::>>" + strDate);
        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
        click(elmntDayAfterDate);
    }

    public void clickAddRecord() {
        waitForSeconds(3);
        waitForElementClickable(btnAddRecord);
        jsClick(btnAddRecord);

    }

    public void clickCovidAddRecord() {
        waitForSeconds(3);
        waitForElementClickable(btnCovidAddRecord);
        jsClick(btnCovidAddRecord);

    }

    public void clickCovidSave() {
        waitForSeconds(3);
        waitForElementClickable(btnCovidSave);
        jsClick(btnCovidSave);

    }

    public void clickCovidDose() {
        waitForSeconds(3);
        waitForElementClickable(btnCovidDose);
        jsClick(btnCovidDose);

    }

    public void clickDose() {
        waitForSeconds(3);
        waitForElementClickable(btnDose);
        jsClick(btnDose);

    }

    public void clickCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmntCheckBox)) {
            click(elmntCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void clickClassiCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmntClassiCheckBox)) {
            click(elmntClassiCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void clickAllergiesCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmntAllergiesCheckBox)) {
            click(elmntAllergiesCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void clickPrescriptionCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmntPrescriptionCheckBox)) {
            click(elmntPrescriptionCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void clickImmuCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtImmunisationsiCheckBox)) {
            click(elmtImmunisationsiCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void clickCovidCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtCovidImmunisationsiCheckBox)) {
            click(elmtCovidImmunisationsiCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }



    public boolean clickCovidAddFile(String strUploadDocumentName) {
        boolean blResult = false;
        try {
            System.out.println(strUploadDocumentName);

            String strFloorplanDocumentName = strFloorplanFilePath.replace("<<FILENAME>>", strUploadDocumentName);
            System.out.println(strFloorplanDocumentName);
            btnFloorplanUpload.sendKeys(strFloorplanDocumentName);



            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blResult;
    }



    public void clickSave() {
        waitForElement(elmntSave);
        click(elmntSave);
    }

    public void clickAllergiesSave() {
        waitForElement(elmntAllergiesSave);
        click(elmntAllergiesSave);
    }

    public void clickImmunisationSave() {
        waitForElement(elmntImmuSave);
        click(elmntImmuSave);
    }

    public void clickPrescriptionSave() {
        waitForElement(elmntPrescriptionSave);
        click(elmntPrescriptionSave);
    }

    public void clickClassificationsSave() {
        waitForElement(elmntClassificationsSave);
        click(elmntClassificationsSave);
    }

    public boolean verifyHealthRecord(List<String> listCreatedRecord) {
        String strDateFormat = "dd MMM yyyy";
        String strDay = "TODAY";
        String strDate = DateUtil.getDate(strDay, strDateFormat);
        WebElement elmntMyEntiresRecord = waitForElement(By.xpath(strClinicalNotesMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", strDate)
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(listCreatedRecord.get(0)))
                .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(listCreatedRecord.get(1)))));
        waitForElement(elmntMyEntiresRecord);
        System.out.println("elmntMyEntiresRecord:::>>  " + elmntMyEntiresRecord.isDisplayed());
        return verifyElement(elmntMyEntiresRecord);
    }

    public boolean verifyHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
        jsScrollIntoView(elmntActiveHeader);
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }

    public boolean verifyPrescriptionsHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
        jsScrollIntoView(elmntActiveHeader);
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }

    public boolean verifyAllergiesHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
        jsScrollIntoView(elmntActiveHeader);
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }
    public boolean verifyClassificationsHeader(String strHeader) {
        WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
        jsScrollIntoView(elmntActiveHeader);
        waitForElement(elmntActiveHeader);
        return verifyElement(elmntActiveHeader);
    }

    public void clickEditButton(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        WebElement btnEdit = waitForElement(By.xpath(elmntEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnEdit);

    }

    public void clickCovidEditButton(String strCreatedRecord) {
        waitForSeconds(3);
        strVisitedName = strCreatedRecord;
        WebElement btnEdit = waitForElement(By.xpath(elmntCovidEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnEdit);

    }

    public void clickPrescriptionsEditButton(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnEdit);

    }

    public void clickAllergiesEditButton(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnEdit);

    }

    public void clickClassificationsEditButton(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnEdit);

    }

    public boolean verifyEditedLocation(String strEditedLocation) {

        WebElement elmntVerifyEditedLocation = waitForElement(By.xpath(elmntEditedLocation.replace("<<REPLACEMENT1>>", strVisitedName)
                .replace("<<REPLACEMENT2>>", strEditedLocation)));
        return verifyElement(elmntVerifyEditedLocation);
    }

    public void clickPrescriptionsSaveButton() {
        waitForElement(btnPrescriptionsSave);
        click(btnPrescriptionsSave);

    }
    public void clickAllergiesSaveButton() {
        waitForElement(btnAllergiesSave);
        click(btnAllergiesSave);

    }

    public void clickClassificationsSaveButton() {
        waitForElement(btnClassificationsSave);
        click(btnClassificationsSave);

    }

    public void clickClinicianNotesSaveButton() {
        waitForElement(btnClinicianNotesSave);
        click(btnClinicianNotesSave);

    }
    public void clickImmunisationsSaveButton() {
        waitForElement(btnImmunisationsSave);
        click(btnImmunisationsSave);

    }

    public void clickCovidImmunisationsUpdateButton() {
        waitForSeconds(3);
        waitForElement(btnCovidImmunisationsUpdate);
        click(btnCovidImmunisationsUpdate);

    }

    public void clickDelete(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        waitForSeconds(2);
        WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnDelete);
        waitForSeconds(2);
        waitForElement(btnYes);
        click(btnYes);


    }

    public void clickCovidDelete(String strCreatedRecord) {
        strVisitedName = strCreatedRecord;
        WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", strCreatedRecord)));
        click(btnDelete);
        waitForElement(btnYes);
        click(btnYes);


    }
    public boolean verifyDeletedRecord() {
        waitForSeconds(8);
        waitForInvisibility(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", strVisitedName)));
        return notVerifyElement(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", strVisitedName)));
    }
    public boolean selectClassificationsdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntclassificationdrop);
            waitForSeconds(2);
            jsClick(elmntclassificationdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddclassiDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectCovidImmunisationsdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntCovidImmunisationsdrop);
            waitForSeconds(2);
            jsClick(elmntCovidImmunisationsdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntCovidImmunisationsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAllergicdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntAllergicdrop);
            waitForSeconds(2);
            jsClick(elmntAllergicdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddAllergicDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPrescriptiondropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntPrescriptiondrop);
            waitForSeconds(2);
            jsClick(elmntPrescriptiondrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPrescriptiondropdown1(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntPrescriptiondrop1);
            waitForSeconds(2);
            jsClick(elmntPrescriptiondrop1);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop1.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAllergicdropdown1(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntAllergicdrop1);
            waitForSeconds(2);
            jsClick(elmntAllergicdrop1);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAllergicDrop1.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyclassificationAddRecord(List<String> listCreatedRecord) {

        WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrClassificationsMyEntitesIconLocatorInfo
                .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

        waitForElement(elmntClassificationMyEntiresRecord);
        System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
        return verifyElement(elmntClassificationMyEntiresRecord);
    }


    public boolean verifyAllergiesAddRecord(List<String> listCreatedRecord) {

        WebElement elmntAllergiesMyEntiresRecord = waitForElement(By.xpath(getStrAllergiesMyEntitesIconLocatorInfo
                .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

        waitForElement(elmntAllergiesMyEntiresRecord);
        System.out.println("elmntMyEntiresRecord:::>>  " + elmntAllergiesMyEntiresRecord.isDisplayed());
        return verifyElement(elmntAllergiesMyEntiresRecord);
    }
    public boolean verifyImmunisationsAddRecord(List<String> listCreatedRecord) {

        WebElement elmntImmunisationMyEntiresRecord = waitForElement(By.xpath(getStrImmunisationsMyEntitesIconLocatorInfo
                .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

        waitForElement(elmntImmunisationMyEntiresRecord);
        System.out.println("elmntMyEntiresRecord:::>>  " + elmntImmunisationMyEntiresRecord.isDisplayed());
        return verifyElement(elmntImmunisationMyEntiresRecord);
    }


    public void clickSignoutButton(){
        waitForSeconds(3);
waitForElementClickable(elmntProfile);
jsClick(elmntProfile);
waitForSeconds(2);

waitForElementClickable(elmntSignout);
jsClick(elmntSignout);


    }
}











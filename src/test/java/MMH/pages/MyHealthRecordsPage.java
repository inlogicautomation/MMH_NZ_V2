package MMH.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.util.List;

import static cap.utilities.DateUtil.getCurrentDate;
import static cap.utilities.SharedDriver.strExecutionID;

public class MyHealthRecordsPage extends BasePage {
    public MyHealthRecordsPage(WebDriver driver) {
        super(driver);
    }

    public String strVisitedName = "";
    public static String PrescriptionsMedicationName = "";

    @FindBy(how = How.XPATH, using = "//a[@class='menu-header ng-star-inserted']/following::span[text()='My Health Records']/following-sibling::mat-icon")
    protected WebElement btnMyHealthRecordsExpand;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-prescription-extra-medicine']//following::span[1]")
    protected WebElement elmntPrescriptions;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Prescriptions'])[1]")
    protected WebElement headerPrescriptions;
    @FindBy(how = How.XPATH, using = "(//h3[text()='Allergies'])[1]")
    protected WebElement headerAllergies;
    @FindBy(how = How.XPATH, using = "(//h3[text()='Immunisations'])[1]")
    protected WebElement headerImmunisatoin;
    @FindBy(how = How.XPATH, using = "(//h3[text()='Classifications'])[1]")
    protected WebElement headerClassifications;
    @FindBy(how = How.XPATH, using = "(//h3[text()='Lab Results '])[1]")
    protected WebElement headerLabResults;
    @FindBy(how = How.XPATH, using = "(//h3[text()='Clinician Notes'])[1]")
    protected WebElement headerClinicanNotes;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Recalls'])[1]")
    protected WebElement headerRecalls;
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

    protected String strMobilePrescriptionsIconContentLocator = new StringBuilder()
            .append("(//h2[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::p[text()='")
            .append("<<REPLACEMENT2>>").append("'])[1]").toString();

    protected String strMobilePrescriptionsDetails = new StringBuilder()
            .append("//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//p[normalize-space(text())='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String strMobileRecallsIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[1]").toString();

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[@aria-expanded='true']")
    protected WebElement elmntMobileIcon;

    @FindBy(how = How.XPATH, using = "(//img[@alt='Manage My Health'])[2]")
    protected WebElement elmntMobileMMHlogo;

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

    protected String strMobileAllergiesIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[1]").toString();

    protected String strMobileRecallsReminderIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[2]").toString();


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

    protected String strMobileLabResultIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[1]").toString();

    protected String getStrMobileRecallsIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[3]").toString();

    protected String getStrMobileRecallsReminderIconContentLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[2]").toString();

    protected String strMobileLabTestResultDetails = new StringBuilder()
            .append(" //mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[1]")
    protected WebElement elmntDownArrow;

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[2]")
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

    protected String getStrMobileImmunisationsMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrClassificationsMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrMobileClassificationsMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrAllergiesMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String getStrMobileAllergiesMyEntitesIconLocatorInfo = new StringBuilder()
            .append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();



    protected String strPrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String strMobilePrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("(//h2[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[1]").toString();



    protected String strMobilePrescriptionsMyEntriesInfoDetails = new StringBuilder()
            .append("//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//p[normalize-space(text())='")
            .append("<<REPLACEMENT>>").append("']").toString();
    protected String strPrescriptionsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String StrShareDoctorCOVIDImmunisationsIconLocator = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'mat-button')])[1]").toString();


    protected String StrShareDoctorImmunisationsIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String StrDoctorImmunisationsIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String strTestingPrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    protected String strAllergiesMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String strImmunisationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String strClassificationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name who visited']//following::div[11]//input")
    protected WebElement elmntVisitedName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='whoIVisited'])[2]")
    protected WebElement elmntMobileVisitedName;

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of the vaccine']/following::div[11]//input")
    protected WebElement elmntImmunisationVaccineName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='vaccineName'])[2]")
    protected WebElement elmntMobileImmunisationVaccineName;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Batch Number']")
    protected WebElement elmntCovidImmunisationBatchNo;

    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of the condition']//following::div[11]//input")
    protected WebElement elmntConditionName;
    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='conditionName'])[2]")
    protected WebElement elmntMobileConditionName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='allergicName'])[1]")
    protected WebElement elmntAllergicName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='allergicName'])[2]")
    protected WebElement elmntMobileAllergicName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='medicationName'])[1]")
    protected WebElement elmntPrescriptionsMedicationName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='medicationName'])[2]")
    protected WebElement elmntMobilePrescriptionsMedicationName;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='dosage'])[1]")
    protected WebElement elmntPrescriptionsDose;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='dosage'])[2]")
    protected WebElement elmntMobilePrescriptionsDose;


    @FindBy(how = How.XPATH, using = "//p[text()='Write the name of visited location']//following::div[11]//input")
    protected WebElement elmntVisitedLocation;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='visitedLocation'])[2]")
    protected WebElement elmntMobileVisitedLocation;

    @FindBy(how = How.XPATH, using = "//textarea[@id='mat-input-19']")
    protected WebElement elmntAdditionalInformation;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[44]//textarea")
    protected WebElement elmntClassiAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='classificationAdditionalInformation'])[2]")
    protected WebElement elmntMobileClassiAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//p[text()='Additional Information']//following::textarea[@formcontrolname='additionalInformation'])[2]")
    protected WebElement elmntAllergiesAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//p[text()='Additional Information']//following::textarea[@formcontrolname='additionalInformation'])[4]")
    protected WebElement elmntMobileAllergiesAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='additionalInformation'])[1]")
    protected WebElement elmntPrescriptionAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='additionalInformation'])[3]")
    protected WebElement elmntMobilePrescriptionAdditionalInformation;
    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the date of given vaccine?']//following::div[28]//textarea")
    protected WebElement elmntImmuAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='immunisationAdditionalInformation'])[2]")
    protected WebElement elmntMobileImmuAdditionalInformation;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='Site']")
    protected WebElement elmntCovidClinicalSite;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the visited date?']//following::div[28]//textarea")
    protected WebElement elmntClinicianNotesAdditionalInformation;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='clinicalNotesInformation'])[2]")
    protected WebElement elmntMobileClinicianNotesAdditionalInformation;


    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the visited date?']//following::div[13]")
    protected WebElement elmntVisitedDate;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='visitedDate'])[2]")
    protected WebElement elmntMobileVisitedDate;
    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the date of given vaccine?']//following::div[13]//input")
    protected WebElement elmntImmunisationDate;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='DateGiven']")
    protected WebElement elmntCovidImmunisationDate;

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[13]//input")
    protected WebElement elmntStartDate;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='startDate'])[6]")
    protected WebElement elmntMobileStartDate;


    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='startDate'])[1]")
    protected WebElement elmntAllergiesStartDate;

    @FindBy(how = How.XPATH, using = "//p[text()='How often?']//following::div[49]")
    protected WebElement elmntPrescriptionDateToken;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='dateTaken'])[2]")
    protected WebElement elmntMobilePrescriptionDateToken;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='counterMobile']")
    protected WebElement elmntMobileHowmanydrop;

    protected String elmntMobilePrescriptionHowmanyDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//p[text()='Do you know the period of condition?']//following::div[29]//input")
    protected WebElement elmntEndDate;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='endDate'])[6]")
    protected WebElement elmntMobileEndDate;


    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='endDate'])[1]")
    protected WebElement elmntAllergiesEndDate;

    @FindBy(how = How.XPATH, using = "//p[text()='How often?']//following::div[81]")
    protected WebElement elmntPrescriptionEndDate;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='endDate'])[4]")
    protected WebElement elmntMobilePrescriptionEndDate;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Record')]//parent::button")
    protected WebElement btnAddRecord;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-add-plus-add icon-white']")
    protected WebElement btnMobileAddRecord;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Add COVID Immunisation ')]//parent::button")
    protected WebElement btnCovidAddRecord;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-calendar-plus-date icon-white']")
    protected WebElement btnMobileCovidAddRecord;

    @FindBy(how = How.XPATH, using = "//mat-dialog-actions//span[text()='Save']")
    protected WebElement btnCovidSave;

    @FindBy(how = How.XPATH, using = "//div[text()='COVID19 Comirnaty - 2']")
    protected WebElement btnCovidDose;

    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator btn-increment mat-stroked-button mat-button-base']")
    protected WebElement btnDose;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-9-input']")
    protected WebElement elmntCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-10-input']")
    protected WebElement elmntClassiCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-6-input']")
    protected WebElement elmntAllergiesCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-5-input']")
    protected WebElement elmntPrescriptionCheckBox;

    @FindBy(how = How.XPATH, using = "(//div[@class='footer-checkbox']//following::mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched mat-checkbox-checked'])[2]")
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

    @FindBy(how = How.XPATH, using = "(//mat-checkbox[@formcontrolname='clinicianCheckbox'])[2]//following::button[1]")
    protected WebElement elmntMobileSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[2]")
    protected WebElement elmntAllergiesSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Save']/preceding::button[contains(@type,'submit')])[8]")
    protected WebElement elmntMobileAllergiesSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[3]")
    protected WebElement elmntImmuSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Save']/preceding::button[contains(@type,'submit')])[10]")
    protected WebElement elmntMobileImmunisationSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[1]")
    protected WebElement elmntPrescriptionSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Save']/preceding::button[contains(@type,'submit')])[6]")
    protected WebElement elmntMobilePrescriptionSave;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Confirm & Save']/preceding::button[contains(@type,'submit')])[4]")
    protected WebElement elmntClassificationsSave;
    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Save']/preceding::button[contains(@type,'submit')])[12]")
    protected WebElement elmntMobileClassificationsSave;
    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnPrescriptionsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']//span[text()='Update']")
    protected WebElement btnMobilePrescriptionsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnAllergiesSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnClassificationsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']//span[text()='Save']")
    protected WebElement btnMobileClassificationsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnClinicianNotesSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnImmunisationsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']//span[text()='Save']")
    protected WebElement btnMobileImmunisationsSave;

    @FindBy(how = How.XPATH, using = "(//span[text()='Update'])[3]")
    protected WebElement btnCovidImmunisationsUpdate;

    @FindBy(how = How.XPATH, using = "(//span[text()='Update']//parent::button)[3]")
    protected WebElement btnMobileCovidImmunisationsUpdate;


    protected String strActiveHeader = new StringBuilder().append("//h3[contains(text(),'").append("<<REPLACEMENT>>").append("')]").toString();

    protected String strMobileActiveHeader = new StringBuilder().append("(//h3[contains(text(),'").append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='immunisationDateGiven'])[2]")
    protected WebElement elmntMobileImmunisationDate;

    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='endDate'])[4]")
    protected WebElement elmntMobileAllergiesEndDate;

    @FindBy(how = How.XPATH, using = "(//p[text()='Do you know the period of your allergy?']/following::input[@formcontrolname='startDate'])[4]")
    protected WebElement elmntMobileAllergiesStartDate;

    protected String elmntEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntCovidEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntPrescriptionsEdit = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'edit')]").toString();

    protected String elmntMobilePrescriptionsEdit = new StringBuilder().append("//h2[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//button[@class='btn-mobile-text'][text()='Delete']")
    protected WebElement btnMobilePrescriptionDelete;

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//button[@class='btn-mobile-text'][text()='edit']")
    protected WebElement btnMobilePrescriptionsEdit;

    protected String elmntEditedLocation = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]").toString();

    protected String elmntDelete = new StringBuilder().append("//td[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::tr//button[contains(@class,'remove')]").toString();

    protected String elmntVerifyDelete = new StringBuilder().append("//td[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

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
    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='status'])[2]")
    protected WebElement elmntMobileclassificationdrop;


    protected String elmntCovidImmunisationsDrop = new StringBuilder().append("//span[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntAddAllergicDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='severityType'])[2]")
    protected WebElement elmntMobileAllergicdrop;

    protected String elmntAllergicDrop1 = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='statusType'])[2]")
    protected WebElement elmntMobileAllergicdrop1;

    protected String elmntAddPrescriptionDrop = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='howOften'])[2]")
    protected WebElement elmntMobilePrescriptiondrop;

    protected String elmntAddPrescriptionDrop1 = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='prescStatusType'])[2]")
    protected WebElement elmntMobilePrescriptiondrop1;

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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
            waitForSeconds(3);
            blResult =verifyElement(headerPrescriptions);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobilePrescriptionsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobilePrescriptionTableData = waitForElement(By.xpath(strMobilePrescriptionsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(5)))));
            waitForElement(elmntMobilePrescriptionTableData);
            verifyElement(elmntMobilePrescriptionTableData);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickMaxvalue() {
        waitForElement(elmntDownArrow);
        click(elmntDownArrow);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow.sendKeys(Keys.ENTER);
        return verifyElement(elmntDownArrow);
    }
    public boolean clickMaxvalue1() {
        waitForElement(elmntDownArrow1);
        click(elmntDownArrow1);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ENTER);
        return verifyElement(elmntDownArrow1);
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
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerPrescriptions);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobilePrescriptionsIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobilePrescriptionIconData = waitForElement(By.xpath(strMobilePrescriptionsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(5)))));
            jsScrollIntoView(elmntMobilePrescriptionIconData);
            waitForElementClickable(elmntMobilePrescriptionIconData);
            jsClick(elmntMobilePrescriptionIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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

    public void clickMobileMyHealthRecordsOptionMenu() {
        waitForSeconds(2);
        jsClick(btnMobileMenu);
        waitForSeconds(2);
        jsScrollIntoView(btnMyHealthRecordsExpand);
        waitForElementClickable(btnMyHealthRecordsExpand);
        jsClick(btnMyHealthRecordsExpand);

    }

    public void clickMyHealthRecordsOptionFromMenuClassifications() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntClassifications);
            jsClick(elmntClassifications);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
            waitForSeconds(3);
            blResult = verifyElement(headerClassifications);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileClassificationTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(5)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerClassifications);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileClassificationIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(5)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            jsScrollIntoView(elmntSummary);
            waitForElementClickable(elmntSummary);
            jsClick(elmntSummary);
        }
    }
    public void clickExportButton() {
        click(elmntExport);
    }


    public void DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();
        }
    }

    public boolean VerifyMobileClinicNotesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
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
            waitForSeconds(3);
            blResult = verifyElement(headerClinicanNotes);
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerClinicanNotes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileClinicNotesIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
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
            waitForSeconds(3);
            blResult = verifyElement(headerAllergies);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileAllergiesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
                 verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerAllergies);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileAllergiesIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
            waitForSeconds(3);
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileImmunisationTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileImmunisationIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileAllergiesIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
            waitForSeconds(3);
            blResult = verifyElement(headerLabResults);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileLabResultsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerLabResults);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileLabResultsIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerLabResults);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileLabResultsIconLocatorVerifyTestResults(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobileLabTestResultDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            blResult = verifyElement(elmntMobileMMHlogo);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            jsScrollIntoView(elmntRecalls);
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
            waitForSeconds(3);
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();

        }

        return blResult;
    }

    public boolean VerifyMobileRecallsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(getStrMobileRecallsReminderIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean ClickRecallsRemainderIconLocatorVerifyRecallsRemainderData(List<String> lstDetails, List<String> lstDetails1) {
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
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strRecallsRemainderDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileRecallsRemainderIconLocatorVerifyRecallsRemainderData(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(getStrMobileRecallsReminderIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickIconLocatorVerifyRecallsIconData(List<String> lstDetails, List<String> lstDetails1) {
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
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileIconLocatorVerifyRecallData(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(getStrMobileRecallsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntMobileAllergiesIconData);
            waitForElementClickable(elmntMobileAllergiesIconData);
            jsClick(elmntMobileAllergiesIconData);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strMobilePrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
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

    public boolean verifyMobilePrescriptionsMyEntries(List<String> PrescriptionsMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(1)
                + "  Data Value2::>>" + TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(0))));
        WebElement elmntMobilePrescriptionMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(1)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(PrescriptionsMyEntitiesNotesDetails.get(0)))));
        waitForElement(elmntMobilePrescriptionMyEntiresData);
        isVerifed = verifyElement(elmntMobilePrescriptionMyEntiresData);
        return isVerifed;
    }

    public boolean VerifyMyEntriesImmunisationData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(StrShareDoctorImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMyEntriesCOVIDImmunisationData(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(StrShareDoctorCOVIDImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForElementClickable(elmntPrescriptionMyEntiresIconData);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            mouseClick(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobilePrescriptionsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
//            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
//            DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//            String currentDate = formatter.format(calendar.getTime());
//            System.out.println(currentDate);
            String strdatePattern="dd MMM yyyy";
            String strdate=TestDataUtil.getValue("TODAY");
            String currentDate=DateUtil.getDate(strdate,strdatePattern);
            WebElement elmntMobilePrescriptionMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(currentDate))));
            waitForElement(elmntMobilePrescriptionMyEntiresData);
            waitForElementClickable(elmntMobilePrescriptionMyEntiresData);
            jsClick(elmntMobilePrescriptionMyEntiresData);
            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strMobilePrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            waitForSeconds(3);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean VerifyMobileCovidImmusationMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntMobilePrescriptionMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(currentDate))));
            waitForElement(elmntMobilePrescriptionMyEntiresData);
            jsClick(elmntMobilePrescriptionMyEntiresData);
            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strMobilePrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            blResult = verifyElement(elmntMobileMMHlogo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean VerifyMyEntriesClassificationData(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(StrDoctorImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElementClickable(elmntPrescriptionMyEntiresIconData);
            click(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerClassifications);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean VerifyMyEntriesClinicanNotesData(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(StrShareDoctorImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElementClickable(elmntPrescriptionMyEntiresIconData);
            click(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerClinicanNotes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMyEntriesPrescriptionsData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(strTestingPrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
                }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerPrescriptions);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMyEntriesAllergiesData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(strAllergiesMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(1)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForSeconds(3);
            blResult = verifyElement(headerAllergies);
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
    public void enterVistedName(String strVisitedName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntVisitedName);
            enterValue(elmntVisitedName, PrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntMobileVisitedName);
            enterValue(elmntMobileVisitedName, PrescriptionsMedicationName);
        }
    }

    public void enterImmunisationVaccineName(String strVisitedName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntImmunisationVaccineName);
            enterValue(elmntImmunisationVaccineName, PrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntMobileImmunisationVaccineName);
            enterValue(elmntMobileImmunisationVaccineName, PrescriptionsMedicationName);
        }
    }

    public void enterCovidImmunisationBatchNo(String strVisitedName) {
        waitForElement(elmntCovidImmunisationBatchNo);
        enterValue(elmntCovidImmunisationBatchNo, strVisitedName);
    }

    public void enterConditionName(String strConditionName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntConditionName);
            enterValue(elmntConditionName, PrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobileConditionName);
            enterValue(elmntMobileConditionName, PrescriptionsMedicationName);
        }
    }

    public boolean selectMobileClassificationsdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileclassificationdrop);
            waitForSeconds(2);
            jsClick(elmntMobileclassificationdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddclassiDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterAllergicConditionName(String strConditionName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntAllergicName);
            enterValue(elmntAllergicName, PrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicName);
            enterValue(elmntMobileAllergicName, PrescriptionsMedicationName);
        }
    }

    public boolean selectMobileAllergicdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicdrop);
            jsClick(elmntMobileAllergicdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddAllergicDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterPrescriptionsMedicationName(String strConditionName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntPrescriptionsMedicationName);
            enterValue(elmntPrescriptionsMedicationName, PrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobilePrescriptionsMedicationName);
            enterValue(elmntMobilePrescriptionsMedicationName, PrescriptionsMedicationName);

        }
    }

    public void enterPrescriptionsDose(String strDoseName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println("enterelement::::" + strDoseName);
            waitForSeconds(2);
            waitForElement(elmntPrescriptionsDose);
            enterValue(elmntPrescriptionsDose, strDoseName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(2);
            waitForElement(elmntMobilePrescriptionsDose);
            enterValue(elmntMobilePrescriptionsDose, strDoseName);
        }
    }

    public void enterVisitedLocation(String strVisitedLocation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println("enterelement::::" + strVisitedLocation);
            waitForSeconds(5);
            waitForElement(elmntVisitedLocation);
            enterValue(elmntVisitedLocation, strVisitedLocation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            System.out.println("enterelement::::" + strVisitedLocation);
            waitForSeconds(5);
            waitForElement(elmntMobileVisitedLocation);
            enterValue(elmntMobileVisitedLocation, strVisitedLocation);
        }
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

    public boolean selectMobileFrequency(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobilePrescriptiondrop);
            jsClick(elmntMobilePrescriptiondrop);
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

    public boolean selectMobileSeverity(String strSeverity) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicdrop);
            waitForSeconds(2);
            jsClick(elmntMobileAllergicdrop);
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

    public boolean selectMobileStatus(String strSeverity) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileclassificationdrop);
            waitForSeconds(2);
            jsClick(elmntMobileclassificationdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddclassiDrop.replace("<<REPLACEMENT>>", strSeverity)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public void enterAdditionalInformation(String strAdditionalInformation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntImmuAdditionalInformation);
            enterValue(elmntImmuAdditionalInformation, strAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileImmuAdditionalInformation);
            enterValue(elmntMobileImmuAdditionalInformation, strAdditionalInformation);
        }
    }

    public void enterCovidClinicalSite(String strAdditionalInformation) {
        waitForSeconds(3);
        jsScrollIntoView(elmntCovidClinicalSite);
        waitForElement(elmntCovidClinicalSite);
        enterValue(elmntCovidClinicalSite, strAdditionalInformation);
    }

    public void enterClinicianNotesAdditionalInformation(String strAdditionalInformation) {


        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntClinicianNotesAdditionalInformation);
            enterValue(elmntClinicianNotesAdditionalInformation, strAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileClinicianNotesAdditionalInformation);
            enterValue(elmntMobileClinicianNotesAdditionalInformation, strAdditionalInformation);

        }
    }


    public void enterClassiAdditionalInformation(String strAdditionalInformation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(strAdditionalInformation);
            jsScrollIntoView(elmntClassiAdditionalInformation);
            waitForElement(elmntClassiAdditionalInformation);
            enterValue(elmntClassiAdditionalInformation, strAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            System.out.println(strAdditionalInformation);
            jsScrollIntoView(elmntMobileClassiAdditionalInformation);
            waitForElement(elmntMobileClassiAdditionalInformation);
            enterValue(elmntMobileClassiAdditionalInformation, strAdditionalInformation);
        }
    }

    public void enterAllergiesAdditionalInformation(String strAdditionalInformation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntAllergiesAdditionalInformation);
            waitForElement(elmntAllergiesAdditionalInformation);
            enterValue(elmntAllergiesAdditionalInformation, strAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            jsScrollIntoView(elmntMobileAllergiesAdditionalInformation);
            waitForElement(elmntMobileAllergiesAdditionalInformation);
            enterValue(elmntMobileAllergiesAdditionalInformation, strAdditionalInformation);
        }
    }

    public void enterPrescriptionAdditionalInformation(String strAdditionalInformation) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntPrescriptionAdditionalInformation);
            waitForElement(elmntPrescriptionAdditionalInformation);
            enterValue(elmntPrescriptionAdditionalInformation, strAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            jsScrollIntoView(elmntMobilePrescriptionAdditionalInformation);
            waitForElement(elmntMobilePrescriptionAdditionalInformation);
            enterValue(elmntMobilePrescriptionAdditionalInformation, strAdditionalInformation);
        }
    }

    public void enterVisitedDate() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntVisitedDate);
            click(elmntVisitedDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day:: >>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileVisitedDate);
            click(elmntMobileVisitedDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);

        }

    }

    public void enterImmunisationDateGiven() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntImmunisationDate);
            click(elmntImmunisationDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day:: >>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileImmunisationDate);
            click(elmntMobileImmunisationDate);
            String strDateFormat = "d";
            String strDay = "TOADY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }

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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntStartDate);
            click(elmntStartDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileStartDate);
            click(elmntMobileStartDate);
            String strDateFormat = "d";
            String strDay = "TOADY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }

    }

    public void enterAllergiesStartDate() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntAllergiesStartDate);
            click(elmntAllergiesStartDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            waitForElement(elmntMobileAllergiesStartDate);
            click(elmntMobileAllergiesStartDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
    }

    public void enterPrescriptionDateTaken() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntPrescriptionDateToken);
            click(elmntPrescriptionDateToken);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobilePrescriptionDateToken);
            click(elmntMobilePrescriptionDateToken);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);

        }
    }

    public boolean selectMobileHowManydropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileHowmanydrop);
            waitForSeconds(2);
            jsClick(elmntMobileHowmanydrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntMobilePrescriptionHowmanyDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterAllergiesEndDate() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntAllergiesEndDate);
            click(elmntAllergiesEndDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileAllergiesEndDate);
            click(elmntMobileAllergiesEndDate);
            String strDateFormat = "d";
            String strDay = "TOADY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);

        }
    }

    public boolean selectMobileAllergicdropdown1(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicdrop1);
            waitForSeconds(2);
            jsClick(elmntMobileAllergicdrop1);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAllergicDrop1.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public void enterPrescriptionEndDate() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntPrescriptionEndDate);
            click(elmntPrescriptionEndDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobilePrescriptionEndDate);
            click(elmntMobilePrescriptionEndDate);
            String strDateFormat = "d";
            String strDay = "TOADY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
    }

    public boolean selectMobilePrescriptiondropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            jsScrollIntoView(elmntMobilePrescriptiondrop);
            waitForElementClickable(elmntMobilePrescriptiondrop);
            waitForSeconds(2);
            jsClick(elmntMobilePrescriptiondrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectMobilePrescriptiondropdown1(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobilePrescriptiondrop1);
            waitForSeconds(2);
            jsClick(elmntMobilePrescriptiondrop1);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop1.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterEndDate() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementClickable(elmntEndDate);
            jsClick(elmntEndDate);

            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElementClickable(elmntMobileEndDate);
            jsClick(elmntMobileEndDate);
            String strDateFormat = "d";
            String strDay = "TOADY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("TOADY date is::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }

    }

    public void clickAddRecord() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnAddRecord);
            jsClick(btnAddRecord);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElementClickable(btnMobileAddRecord);
            jsClick(btnMobileAddRecord);
        }
    }

    public void clickCovidAddRecord() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnCovidAddRecord);
            jsClick(btnCovidAddRecord);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            waitForSeconds(3);
            waitForElementClickable(btnMobileCovidAddRecord);
            jsClick(btnMobileCovidAddRecord);
        }
    }

    public boolean selectMobileCovidImmunisationsdropdown(String strFamilyMember) {
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
        verifyElement(elmntCheckBox);
    }

    public void clickClassiCheckBox() {
        waitForSeconds(3);
        verifyElement(elmntClassiCheckBox);
    }

    public boolean clickAllergiesCheckBox() {
        waitForSeconds(3);
        return verifyElement(elmntAllergiesCheckBox);
    }
    public boolean clickPrescriptionCheckBox() {
        waitForSeconds(3);
        return verifyElement(elmntPrescriptionCheckBox);
    }

    public void clickImmuCheckBox() {
        waitForSeconds(3);
         verifyElement(elmtImmunisationsiCheckBox);
    }

    public void clickCovidCheckBox() {
        waitForSeconds(3);
        verifyElement(elmtCovidImmunisationsiCheckBox);
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntSave);
            click(elmntSave);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileSave);
            click(elmntMobileSave);
        }
    }

    public boolean verifyClinicalNotesAddRecord(List<String> listCreatedRecord) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrClassificationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntClassificationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntClassificationMyEntiresRecord);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrMobileClassificationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntClassificationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntClassificationMyEntiresRecord);
        }
        return blResult;
    }

    public void clickAllergiesSave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntAllergiesSave);
            click(elmntAllergiesSave);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileAllergiesSave);
            click(elmntMobileAllergiesSave);
        }
    }

    public void clickImmunisationSave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntImmuSave);
            click(elmntImmuSave);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileImmunisationSave);
            click(elmntMobileImmunisationSave);
        }
    }

    public void clickPrescriptionSave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntPrescriptionSave);
            click(elmntPrescriptionSave);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobilePrescriptionSave);
            click(elmntMobilePrescriptionSave);

        }
    }

    public void clickClassificationsSave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntClassificationsSave);
            click(elmntClassificationsSave);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileClassificationsSave);
            click(elmntMobileClassificationsSave);
        }

    }

    public boolean verifyHealthRecord(List<String> listCreatedRecord) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
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
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrMobileClassificationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntClassificationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntClassificationMyEntiresRecord);
        }
        return blResult;
    }

    public boolean verifyHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(6);
            WebElement elmntActiveHeader = waitForElement(By.xpath(strMobileActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        return blResult;

    }

    public boolean verifyPrescriptionsHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strMobileActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        return blResult;
    }

    public boolean verifyAllergiesHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strMobileActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        return blResult;
    }

    public boolean verifyClassificationsHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntActiveHeader = waitForElement(By.xpath(strMobileActiveHeader.replace("<<REPLACEMENT>>", strHeader)));
            jsScrollIntoView(elmntActiveHeader);
            waitForElement(elmntActiveHeader);
            return verifyElement(elmntActiveHeader);
        }
        return blResult;
    }

    public void clickEditButton(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            jsClick(btnMobilePrescriptionsEdit);
        }

    }

    public void clickCovidEditButton(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntCovidEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnEdit);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            click(btnMobilePrescriptionsEdit);
        }

    }

    public void clickPrescriptionsEditButton(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            System.out.println("strCreatedRecord<<<<<<<<<<   " + strMedicationName);
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            waitForElementClickable(btnMobilePrescriptionsEdit);
            jsClick(btnMobilePrescriptionsEdit);

        }
    }

    public void clickAllergiesEditButton(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsClick(btnMobilePrescriptionsEdit);

        }
    }

    public void clickClassificationsEditButton(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            click(btnMobilePrescriptionsEdit);
        }
    }

    public boolean verifyEditedLocation(String strEditedLocation) {

        WebElement elmntVerifyEditedLocation = waitForElement(By.xpath(elmntEditedLocation.replace("<<REPLACEMENT1>>", strVisitedName)
                .replace("<<REPLACEMENT2>>", strEditedLocation)));
        return verifyElement(elmntVerifyEditedLocation);
    }

    public void clickPrescriptionsSaveButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnPrescriptionsSave);
            click(btnPrescriptionsSave);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobilePrescriptionsSave);
            click(btnMobilePrescriptionsSave);

        }
    }

    public void clickAllergiesSaveButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnAllergiesSave);
            click(btnAllergiesSave);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobilePrescriptionsSave);
            click(btnMobilePrescriptionsSave);
        }
    }


    public void clickClassificationsSaveButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnClassificationsSave);
            click(btnClassificationsSave);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            waitForElement(btnMobileClassificationsSave);
            click(btnMobileClassificationsSave);

        }
    }

    public void clickClinicianNotesSaveButton() {
        waitForElement(btnClinicianNotesSave);
        click(btnClinicianNotesSave);

    }

    public void clickImmunisationsSaveButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnImmunisationsSave);
            click(btnImmunisationsSave);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobileImmunisationsSave);
            click(btnMobileImmunisationsSave);
        }
    }

    public void clickCovidImmunisationsUpdateButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnCovidImmunisationsUpdate);
            click(btnCovidImmunisationsUpdate);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            jsScrollIntoView(btnMobileCovidImmunisationsUpdate);
            waitForElementClickable(btnMobileCovidImmunisationsUpdate);
            jsClick(btnMobileCovidImmunisationsUpdate);
        }

    }

    public void clickDelete(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            waitForSeconds(2);
            WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnDelete);
            waitForSeconds(2);
            waitForElement(btnYes);
            click(btnYes);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);

            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            jsClick(btnEdit);
            waitForSeconds(2);
            jsScrollIntoView(btnMobilePrescriptionDelete);
            waitForElementClickable(btnMobilePrescriptionDelete);
            jsClick(btnMobilePrescriptionDelete);
            waitForSeconds(2);
            waitForElement(btnYes);
            click(btnYes);
        }
    }

    public void clickCovidDelete(String strCreatedRecord) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            strVisitedName = strCreatedRecord;
            WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnDelete);
            waitForElement(btnYes);
            click(btnYes);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(4);
            strVisitedName = strCreatedRecord;
            WebElement btnDelete = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnDelete);
            waitForSeconds(2);
            jsScrollIntoView(btnMobilePrescriptionDelete);
            waitForElementClickable(btnMobilePrescriptionDelete);
            click(btnMobilePrescriptionDelete);
            waitForElement(btnYes);
            click(btnYes);

        }

    }

    public boolean verifyDeletedRecord() {
        waitForSeconds(8);
        System.out.println(PrescriptionsMedicationName);
        waitForInvisibility(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", PrescriptionsMedicationName)));
        return notVerifyElement(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", PrescriptionsMedicationName)));
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
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrClassificationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntClassificationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntClassificationMyEntiresRecord);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntClassificationMyEntiresRecord = waitForElement(By.xpath(getStrMobileClassificationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntClassificationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntClassificationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntClassificationMyEntiresRecord);
        }
        return blResult;
    }


    public boolean verifyAllergiesAddRecord(List<String> listCreatedRecord) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            WebElement elmntAllergiesMyEntiresRecord = waitForElement(By.xpath(getStrAllergiesMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntAllergiesMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntAllergiesMyEntiresRecord.isDisplayed());
            return verifyElement(elmntAllergiesMyEntiresRecord);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntAllergiesMyEntiresRecord = waitForElement(By.xpath(getStrMobileAllergiesMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(1)))));

            waitForElement(elmntAllergiesMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntAllergiesMyEntiresRecord.isDisplayed());
            return verifyElement(elmntAllergiesMyEntiresRecord);
        }
        return blResult;
    }

    public boolean verifyImmunisationsAddRecord(List<String> listCreatedRecord) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            WebElement elmntImmunisationMyEntiresRecord = waitForElement(By.xpath(getStrImmunisationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntImmunisationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntImmunisationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntImmunisationMyEntiresRecord);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            WebElement elmntImmunisationMyEntiresRecord = waitForElement(By.xpath(getStrMobileImmunisationsMyEntitesIconLocatorInfo
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(listCreatedRecord.get(0)))));

            waitForElement(elmntImmunisationMyEntiresRecord);
            System.out.println("elmntMyEntiresRecord:::>>  " + elmntImmunisationMyEntiresRecord.isDisplayed());
            return verifyElement(elmntImmunisationMyEntiresRecord);
        }
        return blResult;
    }
    public void clickSignoutButton() {
        waitForSeconds(3);
        waitForElementClickable(elmntProfile);
        jsClick(elmntProfile);
        waitForSeconds(2);
        waitForElementClickable(elmntSignout);
        jsClick(elmntSignout);


    }
}











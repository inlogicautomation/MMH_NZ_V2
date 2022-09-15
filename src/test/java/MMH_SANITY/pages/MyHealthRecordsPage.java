package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public static String strVisitedName = "";
    public static String PrescriptionsMedicationName = "";

    static Process pb = null;


    @FindBy(how = How.XPATH, using = "//a[@class='menu-header ng-star-inserted']/following::span[text()='My Health Records']/following-sibling::mat-icon")
    protected WebElement btnMyHealthRecordsExpand;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-prescription-extra-medicine']//following::span[1]")
    protected WebElement elmntPrescriptions;
    @FindBy(how = How.XPATH, using = "//mat-progress-spinner[@mode='indeterminate']")
    protected WebElement elmntLoadingSpinner;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'All Sources')]/ancestor::mat-form-field//span[text()]")
    protected WebElement elmntFilterdropPrescriptions;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Prescriptions'])[1]")
    protected WebElement headerPrescriptions;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Classifications'])[1]")
    protected WebElement headerClassifications;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Allergies'])[1]")
    protected WebElement headerAllergies;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Clinician Notes'])[1]")
    protected WebElement headerClinicanNotes;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Immunisations'])[1]")
    protected WebElement headerImmunisatoin;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Lab Results '])[1]")
    protected WebElement headerLabResults;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Recalls'])[1]")
    protected WebElement headerRecalls;
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
            .append("(//h2[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//mat-expansion-panel-header[@aria-expanded='true']")
    protected WebElement elmntMobileIcon;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
    protected WebElement elmntIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntdashboard;

    @FindBy(how = How.XPATH, using = "//span[text()=' Edit Profile ']")
    protected WebElement elmntEditProfile;

    @FindBy(how = How.XPATH, using = "//h1[text()='View Profile']")
    protected WebElement elmntviewProfile;

    @FindBy(how = How.XPATH, using = "//span[text()=' Save ']")
    protected WebElement elmntSaveButton;
    protected String strClassificationsIconLocator = new StringBuilder()
            .append("//td[text()='")
            .append("<<REPLACEMENT1>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT3>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT4>>").append("']/following-sibling::td[text()='")
            .append("<<REPLACEMENT5>>").append("']/following-sibling::td//following-sibling::span[@class=\"mat-ripple mat-button-ripple\"]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='Clinician Notes']")
    protected WebElement elmntClinicalNotes;
    @FindBy(how = How.XPATH, using = " //span[text()='Summary']")
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
            .append("(//h2[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::p[text()='")
            .append("<<REPLACEMENT2>>").append("'])[1]").toString();
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
    protected String strMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<DATA>>").append("')]").toString();
    protected String strPrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String strTestingPrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String StrShareDoctorImmunisationsIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String StrShareDoctorCOVIDImmunisationsIconLocator = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td/button[contains(@class,'mat-button')])[1]").toString();
    protected String strMobilePrescriptionsMyEntitesIconLocator = new StringBuilder()
            .append("(//h2[text()='")
            .append("<<REPLACEMENT1>>").append("']//following::p[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')])[1]").toString();
    protected String strMobileAllergiesMyEntriesInfoDetails = new StringBuilder()
            .append("//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//p[normalize-space(text())='")
            .append("<<REPLACEMENT>>").append("']").toString();
    protected String strMobilePrescriptionsMyEntriesInfoDetails = new StringBuilder()
            .append("//mat-expansion-panel-header[@aria-expanded='true']//following::div[contains(@style,'visibility: visible')]//p[normalize-space(text())='")
            .append("<<REPLACEMENT>>").append("']").toString();
    protected String strPrescriptionsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String StrDoctorImmunisationsIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
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
    protected String strImmunisationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
    protected String strCOVIDImmunisationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
    protected String strClassificationsMyEntitesIconLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]/following-sibling::td/button[contains(@class,'moreinfo')]").toString();
    protected String strClassificationsMyEntriesInfoDetails = new StringBuilder()
            .append("//div[@class='tbl-row']//div[contains(@class,'tbl-td')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();
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

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-8-input']")
    protected WebElement elmntClassiCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-6-input']")
    protected WebElement elmntAllergiesCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-5-input']")
    protected WebElement elmntPrescriptionCheckBox;


    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-7-input']")
    protected WebElement elmtImmunisationsiCheckBox;


    @FindBy(how = How.XPATH, using = "//input[@aria-checked='true'][@id='mat-checkbox-15-input']")
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

    @FindBy(how = How.XPATH, using = "(//h3[text()='Classifications'])[1]")
    protected WebElement HeaderClassifications;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']//span[text()='Save']")
    protected WebElement btnMobileClassificationsSave;

    @FindBy(how = How.XPATH, using = "//mat-drawer[contains(@class,'drawer-opened')]//form[not(contains(@class,'invalid'))]//div[@class='slide-tray-container']//button[@type='submit']")
    protected WebElement btnClinicianNotesSave;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Clinician Notes'])[1]")
    protected WebElement HeaderClinicianNotes;

    @FindBy(how = How.XPATH, using = "(//h3[text()='Immunisations'])[1]")
    protected WebElement HeaderImmunisation;

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

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Vaccine']")
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
    protected String strBMI = new StringBuilder()
            .append("//tr//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT5>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT6>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT7>>").append("')]").toString();
    @FindBy(how = How.XPATH, using = "(//*[@fill='#fff'])[2]")
    protected WebElement elmtMouseHowerBloodPressure;

    @FindBy(how = How.XPATH, using = "(//*[@fill='#fff'])[3]")
    protected WebElement elmtSystolicBloodPressure;


    @FindBy(how = How.XPATH, using = "(//*[@fill='#fff'])[7]")
    protected WebElement elmtdiastolicLineChartIcon;

    @FindBy(how = How.XPATH, using = "(//*[@stroke='#cca838'])[1]")
    protected WebElement elmtdiastolicBarChart;

    @FindBy(how = How.XPATH, using = "(//*[@stroke='#cc4f46'])[1]")
    protected WebElement elmtSysstolicBarChart;

    @FindBy(how = How.XPATH, using = "(//div[@class='mat-radio-outer-circle'])[2]")
    protected WebElement btnBarChart;

    @FindBy(how = How.XPATH, using = "(//div[@class='mat-radio-outer-circle'])[1]")
    protected WebElement btnLineChart;
    protected String elmtVerifyBloodPressure = new StringBuilder().append("//div[@class='k-chart-tooltip k-chart-tooltip-inverse ng-star-inserted'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    public void visit() {
        visit(TestDataUtil.getValue("&URL&"));
        takeScreenshot(driver);

    }

    public boolean clickMyHealthRecordsOptionFromMenu() {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnMyHealthRecordsExpand);
            mouseClick(btnMyHealthRecordsExpand);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntPrescriptions);
            jsClick(elmntPrescriptions);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntPrescriptions);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(btnMyHealthRecordsExpand);
            jsClick(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntPrescriptions);
            jsClick(elmntPrescriptions);
            blResult = verifyElement(elmntPrescriptions);
        }
        return blResult;
    }

    public boolean clickMyHealthRecordsOptionMenu() {
        jsScrollIntoView(btnMyHealthRecordsExpand);
        waitForElementClickable(btnMyHealthRecordsExpand);
        jsClick(btnMyHealthRecordsExpand);
        return verifyElement(btnMyHealthRecordsExpand);
    }

    public boolean selectFilter(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntFilterdropPrescriptions);
            waitForSeconds(2);
            jsClick(elmntFilterdropPrescriptions);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntFilterbyDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntFilterdropPrescriptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean VerifyPrescriptionsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, elmntLoadingSpinner);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strPrescriptionsIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(headerPrescriptions);
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
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickMaxvalue() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
            waitForElementDisappear(driver, elmntLoadingSpinner);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
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
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickDashboardFromMenu() {
        jsScrollIntoView(elmntdashboard);
        waitForElementClickable(elmntdashboard);
        jsClick(elmntdashboard);
        return verifyElement(elmntdashboard);
    }

    public boolean clickEditProfile() {
        waitForSeconds(5);
        waitForElementClickable(elmntEditProfile);
        mouseClick(elmntEditProfile);
        waitForSeconds(3);
        return verifyElement(elmntviewProfile);

    }

    public boolean clickSaveButton() {
        waitForSeconds(5);
        waitForElementClickable(elmntSaveButton);
        click(elmntSaveButton);
        return verifyElement(elmntSaveButton);
    }

    public boolean clickMobileMyHealthRecordsOptionMenu() {
        waitForSeconds(2);
        jsClick(btnMobileMenu);
        waitForSeconds(2);
        jsScrollIntoView(btnMyHealthRecordsExpand);
        waitForElementClickable(btnMyHealthRecordsExpand);
        jsClick(btnMyHealthRecordsExpand);
        return verifyElement(btnMyHealthRecordsExpand);
    }

    public boolean clickMyHealthRecordsOptionFromMenuClassifications() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntClassifications);
            jsClick(elmntClassifications);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(elmntClassifications);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntClassifications);
            jsClick(elmntClassifications);
            isVerified = verifyElement(elmntClassifications);
        }
        return isVerified;
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
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
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
                if (verifyElement(elmntPaitientDetails)) {
                    System.out.println("Element is Verify::>>");
                }
            }

            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickMyHealthRecordsOptionFromMenuClinicNotes() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForSeconds(3);
            jsScrollIntoView(elmntClinicalNotes);
            waitForSeconds(3);
            waitForElementClickable(elmntClinicalNotes);
            click(elmntClinicalNotes);
            waitForSeconds(3);
            isVerified = verifyElement(elmntClinicalNotes);

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
            isVerified = verifyElement(elmntClinicalNotes);
        }
        return isVerified;
    }


    public boolean clickMyHealthRecordsOptionFromMenuSummary() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForSeconds(3);
            waitForElementClickable(elmntSummary);
            jsClick(elmntSummary);
            isVerified = verifyElement(elmntSummary);
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
            isVerified = verifyElement(elmntSummary);
        }
        return isVerified;
    }


    public void clickExportButton() {
        waitForSeconds(4);
        click(elmntExport);

    }


    public boolean DeleteFile() {

        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();

        }

        return false;
    }

    public boolean VerifyMobileClinicNotesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
            blResult = true;
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
            blResult = verifyElement(headerClinicanNotes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyMobileMyEntries(List<String> ImmunisationsMyEntitiesNotesDetails) {
        boolean isVerifed = false;
        System.out.println("Data Value1::>>" + TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(1)
                + "  Data Value2::>>" + TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(0))));
        WebElement elmntMobileAllergiesMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(1)))
                .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(ImmunisationsMyEntitiesNotesDetails.get(0)))));
        waitForElement(elmntMobileAllergiesMyEntiresData);
        isVerifed = verifyElement(elmntMobileAllergiesMyEntiresData);
        return isVerifed;
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
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickMyHealthRecordsOptionFromMenuAllergies() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntAllergies);
            jsClick(elmntAllergies);
            isVerified = verifyElement(elmntAllergies);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntAllergies);
            jsClick(elmntAllergies);
            isVerified = verifyElement(elmntAllergies);
        }
        return isVerified;
    }

    public boolean clickMyHealthRecordsOptionFromMenuImmunisations() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntImmunisations);
            jsClick(elmntImmunisations);
            isVerified = verifyElement(elmntImmunisations);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntImmunisations);
            jsClick(elmntImmunisations);
            isVerified = verifyElement(elmntImmunisations);
        }
        return isVerified;
    }


    public boolean clickMyHealthRecordsOptionFromMenuLabResults() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForSeconds(3);
            waitForElementClickable(elmntLabResults);
            jsClick(elmntLabResults);
            isVerified = verifyElement(elmntLabResults);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForElementClickable(elmntLabResults);
            jsClick(elmntLabResults);
            isVerified = verifyElement(elmntLabResults);
        }
        return isVerified;
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
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(headerAllergies);
            ;
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
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
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
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickLabResultsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
//            System.out.println(lstDetails);
            WebElement elmntLabResultIconData = waitForElement(By.xpath(strLabResultsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElementClickable(elmntLabResultIconData);
            jsClick(elmntLabResultIconData);
            for (String str : lstDetails1) {
//                System.out.println(lstDetails1);
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strLabResultsDetails.replace("<<REPLACEMENT>>", str)));
                jsScrollIntoView(elmntPaitientDetails);
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            blResult = verifyElement(headerLabResults);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickLabResultsIconLocatorVerifyTestResults(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
//            System.out.println(lstDetails);
            WebElement elmntTestResults = waitForElement(By.xpath(strLabResultsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElementClickable(elmntTestResults);
            jsClick(elmntTestResults);
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strTestResultsDetails.replace("<<REPLACEMENT>>", str)));
                jsScrollIntoView(elmntPaitientDetails);
                waitForSeconds(3);
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntlabIcon);
            jsClick(elmntlabIcon);
            blResult = verifyElement(headerLabResults);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshotSanity(driver);
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
            takeScreenshotSanity(driver);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean clickMyHealthRecordsOptionFromMenuRecalls() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnMyHealthRecordsExpand);
            click(btnMyHealthRecordsExpand);
            waitForSeconds(2);
            jsScrollIntoView(elmntRecalls);
            waitForSeconds(2);
            waitForElementClickable(elmntRecalls);
            jsClick(elmntRecalls);
            waitForSeconds(2);
            isVerified = verifyElement(elmntRecalls);

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
            isVerified = verifyElement(elmntRecalls);
        }

        return isVerified;
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
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();

        }

        return blResult;
    }

    public boolean VerifyMobileRecallsTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesTableData = waitForElement(By.xpath(strMobileLabResultIconContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForElement(elmntMobileAllergiesTableData);
            verifyElement(elmntMobileAllergiesTableData);
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
                System.out.println("Element is ::>>" + str);
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strRecallsRemainderDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileRecallsRemainderIconLocator(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobileAllergiesIconData = waitForElement(By.xpath(strMobileRecallsIconContentLocator
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
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(headerRecalls);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickMobileRecallsIconLocator(List<String> lstDetails, List<String> lstDetails1) {
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
                verifyElement(elmntMyEntries);

            }

            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAndVerifyMobileMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobilePrescriptionMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForElement(elmntMobilePrescriptionMyEntiresData);
            jsClick(elmntMobilePrescriptionMyEntiresData);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strMobileAllergiesMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);

            }

            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
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
                verifyElement(elmntMyEntries);

            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean VerifyShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(strTestingPrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(5);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(headerPrescriptions);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyAllergiesShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {

            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>" + lstDetails);
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(strAllergiesMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(1)))));
            System.out.println(elmntPrescriptionMyEntiresIconData);
            waitForSeconds(4);
            waitForElement(elmntPrescriptionMyEntiresIconData);
            jsClick(elmntPrescriptionMyEntiresIconData);
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntMyEntries = waitForElement(By.xpath(strPrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(headerAllergies);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyClassificationShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {
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
            blResult = verifyElement(headerClassifications);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyClinicanNotesShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {
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
            blResult = verifyElement(headerClinicanNotes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyImmunisationShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {
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
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyCOVIDImmunisationShareDoctorData(List<String> lstDetails, List<String> lstDetails1) {

        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntPrescriptionMyEntiresIconData = waitForElement(By.xpath(StrShareDoctorCOVIDImmunisationsIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))));
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
            blResult = verifyElement(headerImmunisatoin);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobilePrescriptionsMyEntriesDataIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            WebElement elmntMobilePrescriptionMyEntiresData = waitForElement(By.xpath(strMobilePrescriptionsMyEntitesIconLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForElement(elmntMobilePrescriptionMyEntiresData);
            jsClick(elmntMobilePrescriptionMyEntiresData);

            for (String str : lstDetails1) {
                WebElement elmntMyEntries = waitForElement(By.xpath(strMobilePrescriptionsMyEntriesInfoDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntMyEntries);
            }
            waitForElementClickable(elmntMobileIcon);
            jsClick(elmntMobileIcon);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean enterVistedName(String strVisitedName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntVisitedName);
            enterValue(elmntVisitedName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntVisitedName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntMobileVisitedName);
            enterValue(elmntMobileVisitedName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntMobileVisitedName);
        }
        return isVerified;
    }

    public boolean enterImmunisationVaccineName(String strVisitedName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntImmunisationVaccineName);
            enterValue(elmntImmunisationVaccineName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntImmunisationVaccineName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strVisitedName.concat(strExecutionID);
            waitForElement(elmntMobileImmunisationVaccineName);
            enterValue(elmntMobileImmunisationVaccineName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntMobileImmunisationVaccineName);
        }
        return isVerified;
    }

    public boolean enterCovidImmunisationBatchNo(String strVisitedName) {
        waitForElement(elmntCovidImmunisationBatchNo);
        enterValue(elmntCovidImmunisationBatchNo, strVisitedName);
        return verifyElement(elmntCovidImmunisationBatchNo);
    }

    public boolean enterConditionName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntConditionName);
            enterValue(elmntConditionName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntConditionName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobileConditionName);
            enterValue(elmntMobileConditionName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntMobileConditionName);
        }
        return isVerified;
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

    public boolean enterAllergicConditionName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntAllergicName);
            enterValue(elmntAllergicName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntAllergicName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicName);
            enterValue(elmntMobileAllergicName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntMobileAllergicName);
        }
        return isVerified;
    }

    public boolean selectMobileAllergicdropdown(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMobileAllergicdrop);
            waitForSeconds(2);
            jsClick(elmntMobileAllergicdrop);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddAllergicDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterPrescriptionsMedicationName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntPrescriptionsMedicationName);
            enterValue(elmntPrescriptionsMedicationName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntPrescriptionsMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            PrescriptionsMedicationName = strConditionName.concat(strExecutionID);
            waitForSeconds(2);
            waitForElementClickable(elmntMobilePrescriptionsMedicationName);
            enterValue(elmntMobilePrescriptionsMedicationName, PrescriptionsMedicationName);
            isVerified = verifyElement(elmntMobilePrescriptionsMedicationName);

        }
        return isVerified;
    }

    public boolean enterPrescriptionsDose(String strDoseName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println("enterelement::::" + strDoseName);
            waitForSeconds(2);
            waitForElement(elmntPrescriptionsDose);
            enterValue(elmntPrescriptionsDose, strDoseName);
            isVerified = verifyElement(elmntPrescriptionsDose);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(2);
            waitForElement(elmntMobilePrescriptionsDose);
            enterValue(elmntMobilePrescriptionsDose, strDoseName);
            isVerified = verifyElement(elmntMobilePrescriptionsDose);
        }
        return isVerified;
    }

    public boolean enterVisitedLocation(String strVisitedLocation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println("enterelement::::" + strVisitedLocation);
            waitForSeconds(8);
            waitForElement(elmntVisitedLocation);
            enterValue(elmntVisitedLocation, strVisitedLocation);
            isVerified = verifyElement(elmntVisitedLocation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            System.out.println("enterelement::::" + strVisitedLocation);
            waitForSeconds(5);
            waitForElement(elmntMobileVisitedLocation);
            enterValue(elmntMobileVisitedLocation, strVisitedLocation);
            isVerified = verifyElement(elmntMobileVisitedLocation);
        }
        return isVerified;
    }

    public boolean selectFrequency(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            System.out.println(strFamilyMember);
            waitForElementClickable(elmntPrescriptiondrop);
            System.out.println(strFamilyMember);
            waitForSeconds(2);
            jsClick(elmntPrescriptiondrop);
            System.out.println(strFamilyMember);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAddPrescriptionDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(elmntEntriesFromHealthCentre);
            return click(elmntEntriesFromHealthCentre);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insiiide Catch");
            return blResult;
        }

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
            jsScrollIntoView(elmntMobileAllergicdrop);
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


    public boolean enterAdditionalInformation(String strAdditionalInformation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntImmuAdditionalInformation);
            enterValue(elmntImmuAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntImmuAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileImmuAdditionalInformation);
            enterValue(elmntMobileImmuAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntMobileImmuAdditionalInformation);
        }
        return isVerified;
    }

    public boolean enterCovidClinicalSite(String strAdditionalInformation) {
        waitForSeconds(3);
//        jsScrollIntoView(elmntCovidClinicalSite);
        waitForElementClickable(elmntCovidClinicalSite);
        enterValue(elmntCovidClinicalSite, strAdditionalInformation);
        return verifyElement(elmntCovidClinicalSite);
    }

    public boolean enterClinicianNotesAdditionalInformation(String strAdditionalInformation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntClinicianNotesAdditionalInformation);
            enterValue(elmntClinicianNotesAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntClinicianNotesAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileClinicianNotesAdditionalInformation);
            enterValue(elmntMobileClinicianNotesAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntClinicianNotesAdditionalInformation);

        }
        return isVerified;
    }


    public boolean enterClassiAdditionalInformation(String strAdditionalInformation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(strAdditionalInformation);
            jsScrollIntoView(elmntClassiAdditionalInformation);
            waitForElement(elmntClassiAdditionalInformation);
            enterValue(elmntClassiAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntClassiAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            System.out.println(strAdditionalInformation);
            jsScrollIntoView(elmntMobileClassiAdditionalInformation);
            waitForElement(elmntMobileClassiAdditionalInformation);
            enterValue(elmntMobileClassiAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntMobileClassiAdditionalInformation);
        }
        return isVerified;
    }

    public boolean enterAllergiesAdditionalInformation(String strAdditionalInformation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntAllergiesAdditionalInformation);
            waitForElement(elmntAllergiesAdditionalInformation);
            enterValue(elmntAllergiesAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntAllergiesAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            jsScrollIntoView(elmntMobileAllergiesAdditionalInformation);
            waitForElement(elmntMobileAllergiesAdditionalInformation);
            enterValue(elmntMobileAllergiesAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntMobileAllergiesAdditionalInformation);
        }
        return isVerified;
    }

    public boolean enterPrescriptionAdditionalInformation(String strAdditionalInformation) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntPrescriptionAdditionalInformation);
            waitForElement(elmntPrescriptionAdditionalInformation);
            enterValue(elmntPrescriptionAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntPrescriptionAdditionalInformation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            jsScrollIntoView(elmntMobilePrescriptionAdditionalInformation);
            waitForElement(elmntMobilePrescriptionAdditionalInformation);
            enterValue(elmntMobilePrescriptionAdditionalInformation, strAdditionalInformation);
            isVerified = verifyElement(elmntMobilePrescriptionAdditionalInformation);
        }
        return isVerified;
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
        System.out.println("elmntDayAfterDate" + elmntDayAfterDate);
        click(elmntDayAfterDate);

    }

    public void enterStartDate() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
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


    public boolean enterPrescriptionEndDate() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntPrescriptionEndDate);
            click(elmntPrescriptionEndDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            isVerified = verifyElement(elmntDayAfterDate);
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
            isVerified = verifyElement(elmntDayAfterDate);
        }
        return isVerified;
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

    public boolean enterEndDate() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(5);
            waitForElementClickable(elmntEndDate);
            jsClick(elmntEndDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
            isVerified = verifyElement(elmntDayAfterDate);
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
            isVerified = verifyElement(elmntDayAfterDate);
        }

        return isVerified;
    }

    public boolean clickAddRecord() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnAddRecord);
            jsClick(btnAddRecord);
            isVerified = verifyElement(btnAddRecord);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElementClickable(btnMobileAddRecord);
            jsClick(btnMobileAddRecord);
            isVerified = verifyElement(btnMobileAddRecord);
        }
        return isVerified;
    }

    public boolean clickCovidAddRecord() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnCovidAddRecord);
            jsClick(btnCovidAddRecord);
            isVerified = verifyElement(btnCovidAddRecord);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            waitForSeconds(3);
            waitForElementClickable(btnMobileCovidAddRecord);
            jsClick(btnMobileCovidAddRecord);
            isVerified = verifyElement(btnCovidAddRecord);
        }
        return isVerified;
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
        waitForElementDisappear(driver, By.xpath(elmntSpinner));


    }

    public boolean clickCovidDose() {
        waitForSeconds(3);
        waitForElementClickable(btnCovidDose);
        jsClick(btnCovidDose);
        return verifyElement(btnCovidDose);
    }

    public boolean clickDose() {
        waitForSeconds(3);
        waitForElementClickable(btnDose);
        jsClick(btnDose);
        return verifyElement(btnDose);
    }

    public boolean clickCheckBox() {
        waitForSeconds(3);
        return verifyElement(elmntCheckBox);


    }

    public boolean clickUnCheckBox() {
        boolean isVerified = false;
        waitForSeconds(3);
        if (verifyElement(elmntCheckBox)) {
            waitForElementClickable(elmntCheckBox);
            jsClick(elmntCheckBox);
            waitForSeconds(2);
            isVerified = verifyElement(elmntCheckBox);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        }
        return isVerified;
    }

    public boolean clickClassiCheckBox() {
        boolean isVerified = false;
        waitForSeconds(3);
        if (verifyElement(elmntClassiCheckBox)) {
            isVerified = true;
        } else {
            System.out.println("CheckBox are checked::>>");
        }
        return isVerified;
    }

    public boolean clickClassiUnCheckBox() {
        boolean isVerified = false;
        waitForSeconds(3);
        if (verifyElement(elmntClassiCheckBox)) {
            waitForElementClickable(elmntClassiCheckBox);
            jsClick(elmntClassiCheckBox);
            isVerified = verifyElement(elmntClassiCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
        return isVerified;
    }

    public boolean clickAllergiesCheckBox() {
        waitForSeconds(3);
        return verifyElement(elmntAllergiesCheckBox);
    }

    public void clickAllergiesUnCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmntAllergiesCheckBox)) {
            waitForElementClickable(elmntAllergiesCheckBox);
            waitForSeconds(3);
            waitForElementClickable(elmntAllergiesCheckBox);
            jsClick(elmntAllergiesCheckBox);
        }

    }

    public boolean clickPrescriptionCheckBox() {
        waitForSeconds(3);
        return verifyElement(elmntPrescriptionCheckBox);
    }

    public void unCheckSharePrescription() {
        if (verifyElement(elmntPrescriptionCheckBox)) {
            waitForSeconds(3);
            waitForElementClickable(elmntPrescriptionCheckBox);
            jsClick(elmntPrescriptionCheckBox);
        }
    }

    public void clickImmuCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtImmunisationsiCheckBox)) {
            click(elmtImmunisationsiCheckBox);
        }
    }

    public void clickImmuUnCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtImmunisationsiCheckBox)) {
            waitForSeconds(3);
            waitForElementClickable(elmtImmunisationsiCheckBox);
            jsClick(elmtImmunisationsiCheckBox);
        }
    }

    public void clickCovidCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtCovidImmunisationsiCheckBox)) {
//            click(elmtCovidImmunisationsiCheckBox);
        }
    }


    public void clickCovidUnCheckBox() {
        waitForSeconds(3);
        if (verifyElement(elmtCovidImmunisationsiCheckBox)) {
            jsClick(elmtCovidImmunisationsiCheckBox);
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


    public boolean clickSave() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(elmntSave);
            click(elmntSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(HeaderClinicianNotes);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileSave);
            click(elmntMobileSave);
            isVerified = verifyElement(elmntMobileSave);
        }
        return isVerified;
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

    public boolean clickAllergiesSave() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntAllergiesSave);
            click(elmntAllergiesSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(headerAllergies);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileAllergiesSave);
            click(elmntMobileAllergiesSave);
            isVerified = verifyElement(elmntMobileAllergiesSave);
        }
        return isVerified;
    }

    public boolean clickImmunisationSave() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntImmuSave);
            click(elmntImmuSave);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(HeaderImmunisation);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileImmunisationSave);
            click(elmntMobileImmunisationSave);
            isVerified = verifyElement(elmntMobileImmunisationSave);
        }
        return isVerified;
    }


    public boolean clickPrescriptionSave() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntPrescriptionSave);
            click(elmntPrescriptionSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(headerPrescriptions);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobilePrescriptionSave);
            click(elmntMobilePrescriptionSave);
            isVerified = verifyElement(elmntMobilePrescriptionSave);

        }

        return isVerified;
    }

    public boolean clickClassificationsSave() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(elmntClassificationsSave);
            click(elmntClassificationsSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(HeaderClassifications);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(elmntMobileClassificationsSave);
            click(elmntMobileClassificationsSave);
            isVerified = verifyElement(elmntMobileClassificationsSave);
        }

        return isVerified;
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

    public boolean clickEditButton(String strCreatedRecord) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            waitForSeconds(4);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+btnEdit);
            waitForElementClickable(btnEdit);
            jsClick(btnEdit);
            isVerified = verifyElement(btnEdit);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            strVisitedName = strCreatedRecord;
            waitForSeconds(4);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strCreatedRecord)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            jsClick(btnMobilePrescriptionsEdit);
            isVerified = verifyElement(btnMobilePrescriptionsEdit);
        }

        return isVerified;
    }

    public boolean clickCovidEditButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement btnEdit = waitForElement(By.xpath(elmntCovidEdit.replace("<<REPLACEMENT>>", currentDate)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+btnEdit);
            jsScrollIntoView(btnEdit);
            waitForSeconds(3);
            waitForElementClickable(btnEdit);
            mouseClick(btnEdit);
            isVerified = verifyElement(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(3);
            strVisitedName = currentDate;
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", currentDate)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            click(btnMobilePrescriptionsEdit);
            isVerified = verifyElement(btnEdit);
        }

        return isVerified;
    }

    public boolean clickPrescriptionsEditButton(String strCreatedRecord) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            System.out.println("strCreatedRecord<<<<<<<<<<   " + strMedicationName);
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+btnEdit);
            waitForElementClickable(btnEdit);
            jsClick(btnEdit);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            waitForElementClickable(btnMobilePrescriptionsEdit);
            jsClick(btnMobilePrescriptionsEdit);
            isVerified = verifyElement(btnMobilePrescriptionsEdit);
        }
        return isVerified;
    }

    public boolean clickAllergiesEditButton(String strCreatedRecord) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+btnEdit);
            jsClick(btnEdit);
            isVerified = verifyElement(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            click(btnMobilePrescriptionsEdit);
            isVerified = verifyElement(btnMobilePrescriptionsEdit);

        }
        return isVerified;
    }

    public boolean clickClassificationsEditButton(String strCreatedRecord) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(5);
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            WebElement btnEdit = waitForElement(By.xpath(elmntPrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            System.out.println(">>>>>>>>>>>>>>>"+btnEdit);
            click(btnEdit);
            isVerified = verifyElement(btnEdit);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
            WebElement btnEdit = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", strMedicationName)));
            click(btnEdit);
            waitForSeconds(3);
            jsScrollIntoView(btnMobilePrescriptionsEdit);
            click(btnMobilePrescriptionsEdit);
            isVerified = verifyElement(btnMobilePrescriptionsEdit);
        }
        return isVerified;
    }

    public boolean verifyEditedLocation(String strEditedLocation) {

        WebElement elmntVerifyEditedLocation = waitForElement(By.xpath(elmntEditedLocation.replace("<<REPLACEMENT1>>", strVisitedName)
                .replace("<<REPLACEMENT2>>", strEditedLocation)));
        return verifyElement(elmntVerifyEditedLocation);
    }

    public boolean clickPrescriptionsSaveButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnPrescriptionsSave);
            click(btnPrescriptionsSave);
            isVerified = verifyElement(btnPrescriptionsSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobilePrescriptionsSave);
            click(btnMobilePrescriptionsSave);
            isVerified = verifyElement(btnMobilePrescriptionsSave);
        }

        return isVerified;
    }

    public boolean clickAllergiesSaveButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnAllergiesSave);
            click(btnAllergiesSave);
            isVerified = true;
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobilePrescriptionsSave);
            click(btnMobilePrescriptionsSave);
            isVerified = true;
        }
        return isVerified;
    }


    public boolean clickClassificationsSaveButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnClassificationsSave);
            click(btnClassificationsSave);
            waitForSeconds(3);
            isVerified = verifyElement(HeaderClassifications);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobileClassificationsSave);
            click(btnMobileClassificationsSave);
            isVerified = verifyElement(btnMobileClassificationsSave);
        }
        return isVerified;
    }

    public boolean clickClinicianNotesSaveButton() {
        waitForElement(btnClinicianNotesSave);
        click(btnClinicianNotesSave);
        waitForSeconds(3);
        return verifyElement(HeaderClinicianNotes);
    }

    public boolean clickImmunisationsSaveButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnImmunisationsSave);
            click(btnImmunisationsSave);
            isVerified = verifyElement(btnImmunisationsSave);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnMobileImmunisationsSave);
            click(btnMobileImmunisationsSave);
            isVerified = verifyElement(btnMobileImmunisationsSave);
        }
        return isVerified;
    }

    public boolean clickCovidImmunisationsUpdateButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(btnCovidImmunisationsUpdate);
            jsClick(btnCovidImmunisationsUpdate);
            waitForSeconds(2);
            isVerified=verifyElement(headerImmunisatoin);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            jsScrollIntoView(btnMobileCovidImmunisationsUpdate);
            waitForElementClickable(btnMobileCovidImmunisationsUpdate);
            isVerified = click(btnMobileCovidImmunisationsUpdate);
        }

        return isVerified;
    }

    public boolean clickDelete(String strCreatedRecord) {
        boolean isClicked = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String strMedicationName = strCreatedRecord.concat(strExecutionID);
//        strVisitedName = strCreatedRecord;
            waitForSeconds(2);
            WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", strMedicationName)));
            System.out.println(">>>>>>>>>>>>>>>>>"+btnDelete);
            jsClick(btnDelete);
            waitForSeconds(2);
            waitForElement(btnYes);
            isClicked = click(btnYes);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            return isClicked;
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
            isClicked = click(btnYes);
        }
        return isClicked;
    }

    public boolean clickCovidDelete() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String currentDate = getCurrentDate("dd MMM yyyy");
            strVisitedName = currentDate;
            WebElement btnDelete = waitForElement(By.xpath(elmntDelete.replace("<<REPLACEMENT>>", currentDate)));
            System.out.println(">>>>>>>>>>>>>>>>"+btnDelete);
            click(btnDelete);
            waitForElement(btnYes);
            isVerified = click(btnYes);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(4);
            String currentDate = getCurrentDate("dd MMM yyyy");
            strVisitedName = currentDate;
            WebElement btnDelete = waitForElement(By.xpath(elmntMobilePrescriptionsEdit.replace("<<REPLACEMENT>>", currentDate)));
            click(btnDelete);
            waitForSeconds(2);
            jsScrollIntoView(btnMobilePrescriptionDelete);
            waitForElementClickable(btnMobilePrescriptionDelete);
            click(btnMobilePrescriptionDelete);
            waitForElement(btnYes);
            isVerified = click(btnYes);

        }
        return isVerified;

    }

    public boolean verifyDeletedRecord() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

    public boolean VerifyBMITableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strBMI
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))
                    .replace("<<REPLACEMENT6>>", TestDataUtil.getValue(lstDetails.get(5)))
                    .replace("<<REPLACEMENT7>>", TestDataUtil.getValue(lstDetails.get(6)))));
            jsScrollIntoView(elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyDiastolicBloodPressureLineChart(String LineChart) {
        waitForSeconds(5);
        mouseOver(elmtMouseHowerBloodPressure);
        waitForSeconds(5);
        WebElement BloodPressureTableData = waitForElement(By.xpath(elmtVerifyBloodPressure.replace("<<REPLACEMENT>>", LineChart)));
        return verifyElement(BloodPressureTableData);

    }

    public boolean VerifyDiastolicBloodPressureBarChart(String BarChart) {
        waitForSeconds(3);
        waitForElementClickable(btnBarChart);
        jsClick(btnBarChart);
        waitForSeconds(5);
        waitForElement(elmtdiastolicBarChart);
        mouseOver(elmtdiastolicBarChart);
        waitForSeconds(5);
//        verifyElement(elmtVerifyBloodPressure);
        WebElement BloodPressureTableData = waitForElement(By.xpath(elmtVerifyBloodPressure.replace("<<REPLACEMENT>>", BarChart)));
        return verifyElement(BloodPressureTableData);
    }

    public boolean VerifySystolicBloodPressureLineChart(String LineChart) {
        waitForSeconds(3);
        waitForElement(btnLineChart);
        jsClick(btnLineChart);
        waitForSeconds(3);
        waitForElementClickable(elmtdiastolicLineChartIcon);
        waitAndClick(elmtdiastolicLineChartIcon);
        mouseClick(elmtdiastolicLineChartIcon);
        waitForSeconds(5);
        mouseOver(elmtSystolicBloodPressure);
        waitForSeconds(5);
        WebElement BloodPressureTableData = waitForElement(By.xpath(elmtVerifyBloodPressure.replace("<<REPLACEMENT>>", LineChart)));
        return verifyElement(BloodPressureTableData);
    }

    public boolean VerifySystolicBloodPressureBarChart(String BarChart) {
        waitForSeconds(3);
        waitForElementClickable(btnBarChart);
        jsClick(btnBarChart);
        waitForSeconds(5);
        waitForElement(elmtSysstolicBarChart);
        mouseOver(elmtSysstolicBarChart);
        waitForSeconds(5);
//        verifyElement(elmtVerifyBloodPressure);
        WebElement BloodPressureTableData = waitForElement(By.xpath(elmtVerifyBloodPressure.replace("<<REPLACEMENT>>", BarChart)));
        return verifyElement(BloodPressureTableData);
    }



}











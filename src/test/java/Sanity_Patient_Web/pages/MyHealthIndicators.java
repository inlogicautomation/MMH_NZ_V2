package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cap.utilities.DateUtil.getCurrentDate;
import static cap.utilities.SharedDriver.strExecutionID;

public class MyHealthIndicators extends BasePage {
    public MyHealthIndicators(WebDriver driver) {
        super(driver);
    }

    public static String SystolicMedicationName = "";

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health today')]")
    protected WebElement elmntVerifyHomePage;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//span[text()='VIEW SUMMARY']")
    protected WebElement elmtViewSummary;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-label-active')]//span[text()='ALL']")
    protected WebElement elmtAlltab;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health Indicators')]")
    protected WebElement elmtmyhealthindicators;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Status')]")
    protected WebElement btnStatus;

    protected String ActiveCardElemnts = new StringBuilder()
            .append("//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/parent::div/parent::mat-card-header//mat-icon").toString();

    //mat-card-title[contains(text(),'Waist Size')]/parent::div/parent::mat-card-header//mat-icon




    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Active')]//preceding::input[@value='Active']")
    protected WebElement btnActive;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnsave;

    @FindBy(how = How.XPATH, using = "//span[text()='ACTIVE']")
    protected WebElement btnactivetab;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-label-active')]//span[text()='ACTIVE']")
    protected WebElement elmtActiveTab;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Inactive')]//preceding::input[@value='Inactive']")
    protected WebElement btnInActive;

    @FindBy(how = How.XPATH, using = "//span[text()='INACTIVE']")
    protected WebElement btnInactivetab;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-label-active')]//span[text()='INACTIVE']")
    protected WebElement elmtInActiveTab;


    @FindBy(how = How.XPATH, using = "//h3[text()='Summary']")
    protected WebElement elmtSummary;

    @FindBy(how = How.XPATH, using = "//div[text()='Blood Pressure']")
    protected WebElement elmtBloodPressure;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-link mat-focus-indicator ng-star-inserted')]//span[text()='ALL']")
    protected WebElement elmtInactiveAlltab;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Privacy Setting')]")
    protected WebElement elmtPrivacySetting;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Health Indicator Clinical Sharing Setting')]")
    protected WebElement elmtPrivacySettingHeader;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Show this entry to my care providers')]//preceding::div[@class='mat-radio-inner-circle']//following-sibling::input)[2]")
    protected WebElement elmtShowthisentrytomycareproviders;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Show this entry to my care providers')]//preceding::div[@class='mat-radio-inner-circle']//following-sibling::input)[1]")
    protected WebElement elmtKeepthisprivate;


    @FindBy(how = How.XPATH, using = "//p[text()='Blood Pressure']")
    protected WebElement elmntBloodPressure;

    @FindBy(how = How.XPATH, using = "//p[text()='Alcohol']")
    protected WebElement elmntAlocohol;

    @FindBy(how = How.XPATH, using = "//span[text()='HEALTH CENTRE']")
    protected WebElement elmthealthCentre;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-label-active')]//span[text()='HEALTH CENTRE']")
    protected WebElement verifyHealthCentre;

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[1]")
    protected WebElement elmntDownArrow;

    protected String strBloodPressure = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT5>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
    protected WebElement btnAddnew;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'NEW HEALTH INDICATOR')]")
    protected WebElement elmtVerifyAddnewHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Blood Pressure')]")
    protected WebElement getElmntBloodPressureHealthIndicator;

    protected String elmntHealthIndicatorDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='systolic']")
    protected WebElement elmntSystolicMedicationName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='diastolic']")
    protected WebElement elmntDiatolicMedicationName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Write my own comment')]")
    protected WebElement getElmntBloodPressureComments;

    protected String elmntCommentsDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::mat-option[@aria-selected='true']").toString();

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='writtenComment']")
    protected WebElement elmntComments;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Confirm & Save')]//parent::button")
    protected WebElement btnBloodPressureconfrim;

    protected String elmntHba1cCommentsDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSmokingCommentsDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();



    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reminder Settings')]")
    protected WebElement elmtReminderSetting;

    @FindBy(how = How.XPATH, using = "//span[text()='Email']")
    protected WebElement getElmntReminderType;

    protected String elmntReminderType = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[3]").toString();

    @FindBy(how = How.XPATH, using = "//mat-label[text()='Frequency']//parent::label//parent::span//parent::div")
    protected WebElement getElmntFrequency;

    protected String elmntFrequency = new StringBuilder().append(" //span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-label[text()='Time']//parent::label//parent::span//parent::div")
    protected WebElement getElmntTime;

    protected String elmntTime = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//mat-label[text()='Comments']//parent::label//parent::span//preceding::textarea")
    protected WebElement elmntRemainderComments;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    protected WebElement btnReminderSave;

    protected String strMyEntriesBloodPressure = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::span//child::mat-icon[contains(text(),'edit')]").toString();

    protected String strMyEntriesShowthisentrytomycareproviders = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::span//following::button)[1]").toString();

    protected String strMyEntriesBloodSugar = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//child::mat-icon[contains(text(),'edit')]").toString();

    protected String strMyEntriesAnxiety = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//child::mat-icon[contains(text(),'edit')]").toString();

    protected String strEditMyEntriesBloodPressure = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//child::mat-icon[text()='edit']").toString();

    protected String strEditMyEntriesAnxiety = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//child::mat-icon[text()='edit']").toString();

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='measurement']")
    protected WebElement elmntEditSystolicMedicationName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnEditBloodPressureSave;

    protected String strDeleteMyEntriesBloodPressure = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//following::button)[1]").toString();

    protected String strDeleteMyEntriesWeight = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//following::button)[1]").toString();

//    (//td[contains(text(),'28 Sep 2022')]//following::td[contains(text(),'55')]//following::span//following::button)[1]

    protected String strDeleteMyEntriesDepression = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//following::button)[1]").toString();

    protected String strDeleteMyEntriesAnxietySeverity = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::span//following::button)[1]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')] ")
    protected WebElement btnBloodPressureyes;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'LDL')]")
    protected WebElement elmntLDL;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Alcohol')]")
    protected WebElement elmntAlcohol;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Anxiety')]")
    protected WebElement elmntAnxiety;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Blood Sugar')]")
    protected WebElement elmntBloodSugar;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Depression')]")
    protected WebElement elmntDepression;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Drinking Survey')]")
    protected WebElement elmntDrinkingSurvey;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Peak Flow')]")
    protected WebElement elmntPeakFlow;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Smoking')]")
    protected WebElement elmntSmoking;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Total Cholesterol')]")
    protected WebElement elmntTotalCholesterol;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Triglycerides')]")
    protected WebElement elmntTriglycerides;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Waist Size')]")
    protected WebElement elmntWaistSize;


    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Height')]")
    protected WebElement elmntHeightCard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Height')]")
    protected WebElement elmntsHeightCard;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Weight')]")
    protected WebElement elmntWeightCard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Weight')]")
    protected WebElement elmntsWeightCard;

    //mat-card-title[contains(text(),'Waist Size')]/parent::div/parent::mat-card-header//mat-icon

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'BMI')]")
    protected WebElement elmtBMI;

    @FindBy(how = How.XPATH, using = "//h3[text()='My Health Indicators']")
    protected WebElement elmtMyHealthIndicators;

    @FindBy(how = How.XPATH, using = "//p[text()='BMI']")
    protected WebElement elmntBMI;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'BMI')]")
    protected WebElement getElmntBMIHealthIndicator;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='height']")
    protected WebElement elmntBMIheight;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='weight']")
    protected WebElement elmntBMIWeight;



    @FindBy(how = How.XPATH, using = "//div[contains(text(),'HbA1c')]")
    protected WebElement elmtHBA1C;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'HDL')]")
    protected WebElement elmtHDL;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'HbA1c')]")
    protected WebElement elmntHBA1C;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'HbA1c')]")
    protected WebElement elmntsHBA1C;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'HDL')]")
    protected WebElement elmntHDL;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'HDL')]")
    protected WebElement elmntsHDL;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'LDL')]")
    protected WebElement elmtLDL;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Alcohol')]")
    protected WebElement elmtAlcohol;

    @FindBy(how = How.XPATH, using = "//div[text()='Mental Health and Addictions']")
    protected WebElement elmtMentalHealthAndAddictions;

    @FindBy(how = How.XPATH, using = "//div[text()='Physical Health']")
    protected WebElement elmtPhysicalHealth;

    @FindBy(how = How.XPATH, using = "//div[text()='Heart Health']")
    protected WebElement elmtHeartHealth;

    @FindBy(how = How.XPATH, using = "//div[text()='Breathing']")
    protected WebElement elmtBreathing;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Anxiety')]")
    protected WebElement elmtAnxiety;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Blood Sugar')]")
    protected WebElement elmtBloodSugar;



    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Blood Sugar')]")
    protected WebElement elmntsBloodSugar;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Height')]")
    protected WebElement elmntsheight;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Depression')]")
    protected WebElement elmtDepression;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Drinking Survey')]")
    protected WebElement elmtDrinkingSurvey;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Peak Flow')]")
    protected WebElement elmtPeakFlow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Smoking')]")
    protected WebElement elmtSmoking;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Total Cholesterol')]")
    protected WebElement elmtTotalCholesterol;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Triglycerides')]")
    protected WebElement elmtTriglycerides;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Waist Size')]")
    protected WebElement elmtWaistSize;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Height')]")
    protected WebElement elmtHeightCard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Weight')]")
    protected WebElement elmtWeightCard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'HbA1c')]")
    protected WebElement getElmntHba1cHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'HDL')]")
    protected WebElement getElmntHDLHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'LDL')]")
    protected WebElement getElmntLDLHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Alcohol')]")
    protected WebElement getElmntAlcoholHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Anxiety')]")
    protected WebElement getElmntAnxietyHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Depression')]")
    protected WebElement getElmntDepressionHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Drinking Survey')]")
    protected WebElement getElmntDrinkingSurveyHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Height')]")
    protected WebElement getElmntHeightCardHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Blood Sugar')]")
    protected WebElement getElmntBloodSugarHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Peak Flow')]")
    protected WebElement getPeakFlowHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Smoking')]")
    protected WebElement getSmokingHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Total Cholesterol')]")
    protected WebElement getTotalCholesterolHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Triglycerides')]")
    protected WebElement getTriglyceridesHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Waist Size')]")
    protected WebElement getWaistSizeHealthIndicator;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='measurement']")
    protected WebElement elmntBda1cMeasurement;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='measurement'])[1]")
    protected WebElement elmntLDLMeasurement;


    @FindBy(how = How.XPATH, using = "(//mat-icon[contains(text(),'navigate_next')])[1]")
    protected WebElement elmntchooseAlcoholcount;

    protected String elmntSelectAlcohol = new StringBuilder().append("//a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntverifyAlcohol = new StringBuilder().append("//a[contains(@class,'label-active')][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Quarterly')]")
    protected WebElement getElmntHba1cComments;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='comments'])[1]")
    protected WebElement getElmntHDLComments;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='comments'])[1]")
    protected WebElement getElmntBloodSugarComments;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Before breakfast')]")
    protected WebElement getElmntLDLComments;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Binging')]")
    protected WebElement getElmntAlcoholComments;

    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[2]")
    protected WebElement getElmntOverthelast2weeks;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[2]")
    protected WebElement getElmntLittleinterestorpleasureindoingthing;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[2]")
    protected WebElement getElmntHowoftendoyouhaveadrinkcontainingalcohol;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    protected WebElement getElmntNextbutton;
    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[6]")
    protected WebElement getElmntNotbeingabletostoporcontrolworrying;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[6]")
    protected WebElement getElmntFeelingdowndepressedorhopeless;


    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[7]")
    protected WebElement getElmntHowmanyStandardDrinkscontainingalcohol;
    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[10]")
    protected WebElement getElmntWorryingtoomuchaboutdifferentthings;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[12]")
    protected WebElement getElmntHowoftendoyouhavesixormoredrinksononeoccasion;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[10]")
    protected WebElement getElmntTroublefallingorstayingasleeporsleepingtoomuch;

    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[14]")
    protected WebElement getElmntTroublerelaxing;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[14]")
    protected WebElement getElmntFeelingtiredorhavinglittleenergy;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[17]")
    protected WebElement getElmntHowoftenduringthelastyearhaveyoufound;

    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[18]")
    protected WebElement getElmntBeingsorestlessthatitshardtositstill;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[18]")
    protected WebElement getElmntPoorappetiteorovereating;

    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[22]")
    protected WebElement getElmntBecomingeasilyannoyedorirritable;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[22]")
    protected WebElement getElmntHowofteninthelastyearhaveyoufailedtodo;


    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[22]")
    protected WebElement getElmntFeelingbadaboutyourself;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[27]")
    protected WebElement getHowofteninthelastyearhaveyouneededadrink;

    @FindBy(how = How.XPATH, using = "(//p[text()='1. Feeling nervous, restless or stressed?']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[26]")
    protected WebElement getElmntFeelingafraidasifsomethingawfulmighthappen;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[26]")
    protected WebElement getElmntTroubleconcentratingonthingssuchasreadingthenewspaperorwatchingtelevision;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[32]")
    protected WebElement getHowofteninthelastyearhaveyouhadafeeling;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[30]")
    protected WebElement getElmntMovingorspeakingsoslowly;


    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[37]")
    protected WebElement getHowofteninthelastyearhaveyoubeenunable;

    @FindBy(how = How.XPATH, using = "(//p[text()='Over the last 2 weeks, how often have you been bothered by any of the following problems? ']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[34]")
    protected WebElement getElmntThoughtsthatyouwouldBebetteroffdead;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[42]")
    protected WebElement getHaveyouorsomeoneelsebeeninjuredasaresult;

    @FindBy(how = How.XPATH, using = "(//p[text()='I would like to add an indicator for']//following::mat-radio-group[@role='radiogroup']//div[@class='mat-radio-container']//following-sibling::input)[45]")
    protected WebElement getHasarelativefriendordoctor;
    @FindBy(how = How.XPATH, using = "//h3[text()='NEW HEALTH INDICATOR']")
    protected WebElement getElmntNewHealthIndicator;
    @FindBy(how = How.XPATH, using = "//h3[text()='My Health Indicators']")
    protected WebElement getNewHealthIndicator;

    protected String elmntVerifyDelete = new StringBuilder().append("//td[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();


    protected String strAnxietySeverityMyEntriesShowthisentrytomycareproviders = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='ALL']")
    protected WebElement veriflyAllTabElement;


    public boolean clickMyHealthIndicatorsOptionFromMenu() {
        boolean blResult = false;

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(elmtmyhealthindicators);
            click(elmtmyhealthindicators);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtAlltab);
            blResult = verifyElement(elmtAlltab);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(elmtmyhealthindicators);
            click(elmtmyhealthindicators);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            blResult = verifyElement(btnMobileMenu);

        }
        return blResult;
    }

    public boolean ClickBMIActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnActive);
            jsClick(btnActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            blResult = verifyElement(elmtmyhealthindicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickActiveTab() {
        waitForSeconds(3);
        waitForElement(btnactivetab);
        jsClick(btnactivetab);
        waitForSeconds(3);
        waitForElement(elmtActiveTab);
        return verifyElement(elmtActiveTab);
    }

    public boolean VerifyActiveData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            verifyElement(elmntActiveCardData);
            blResult = verifyElement(elmtmyhealthindicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            blResult = verifyElement(elmtmyhealthindicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickInActiveTab() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(btnInactivetab);
        waitForElementClickable(btnInactivetab);
        jsClick(btnInactivetab);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmtInActiveTab);
        return verifyElement(elmtInActiveTab);
    }

    public boolean clickViewsummary() {
        waitForSeconds(3);
        waitForElementClickable(elmtViewSummary);
        jsClick(elmtViewSummary);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmtSummary);
        return verifyElement(elmtSummary);
    }

    public boolean clickBloodPressure() {
        waitForElement(elmtPhysicalHealth);
        jsClick(elmtPhysicalHealth);
        waitForSeconds(3);
        waitForElementClickable(elmtBloodPressure);
        jsClick(elmtBloodPressure);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodPressure);
        return verifyElement(elmntBloodPressure);
    }

    public boolean clickHealthCentre() {
        waitForSeconds(3);
        jsScrollIntoView(elmthealthCentre);
        waitForElementClickable(elmthealthCentre);
        jsClick(elmthealthCentre);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(verifyHealthCentre);
        return verifyElement(verifyHealthCentre);
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

    public boolean VerifyBloodPressureTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(elmntBloodPressure);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyLDLTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(elmntLDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyHBACTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(elmntHBA1C);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBMITableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT5>>", TestDataUtil.getValue(lstDetails.get(4)))));
            jsScrollIntoView(elmntPrescriptionTableData);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(elmntBMI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickAddnew() {
        waitForSeconds(3);
        waitForElementClickable(btnAddnew);
        jsClick(btnAddnew);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmtVerifyAddnewHeader);
        return verifyElement(elmtVerifyAddnewHeader);
    }

    public boolean selectBloodPressureHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodPressureHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntBloodPressureHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntBloodPressureHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean enterSystolicMedicationName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntSystolicMedicationName);
            enterValue(elmntSystolicMedicationName, strConditionName);
            isVerified = verifyElement(elmntSystolicMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean enterDiatolicMedicationName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntDiatolicMedicationName);
            enterValue(elmntDiatolicMedicationName, strConditionName);
            isVerified = verifyElement(elmntDiatolicMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean selectBloodPressureComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntBloodPressureComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodPressureComments);
            waitForSeconds(2);
            jsClick(getElmntBloodPressureComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntBloodPressureComments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean enterComments(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            SystolicMedicationName = strConditionName.concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+SystolicMedicationName);
            waitForSeconds(3);
            waitForElementClickable(elmntComments);
            enterValue(elmntComments, SystolicMedicationName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntComments);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }


    public boolean clickConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodPressure);
        return verifyElement(elmntBloodPressure);
    }
    public boolean clickMenuMyHealthIndicators() {
//        waitForSeconds(3);
//        waitForElementClickable(elmtmyhealthDocument);
//        click(elmtmyhealthDocument);
        waitForSeconds(8);
        waitForElementClickable(elmtmyhealthindicators);
        jsClick(elmtmyhealthindicators);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtAlltab);
        return verifyElement(elmtAlltab);
    }

    public boolean ClickBloodPressureData(List<String> lstDetails) {

        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean clickReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        jsClick(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtBloodPressure);
        return verifyElement(elmtBloodPressure);
    }
    public boolean selectBloodPressureReminderType(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            String data = TestDataUtil.getValue(strFamilyMember.get(0));
            waitForSeconds(2);
            waitForElementClickable(getElmntReminderType);
            waitForSeconds(2);
            jsClick(getElmntReminderType);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntReminderType.replace("<<REPLACEMENT>>", data)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntReminderType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectBloodPressureFrequency(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            String data = TestDataUtil.getValue(strFamilyMember.get(1));
            waitForSeconds(2);
            waitForElementClickable(getElmntFrequency);
            waitForSeconds(2);
            jsClick(getElmntFrequency);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntFrequency.replace("<<REPLACEMENT>>", data)));
            waitForElementClickable(elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntFrequency);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectBloodPressureTime(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            String data = TestDataUtil.getValue(strFamilyMember.get(2));
            waitForSeconds(2);
            waitForElementClickable(getElmntTime);
            waitForSeconds(2);
            jsClick(getElmntTime);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntTime.replace("<<REPLACEMENT>>", data)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterReminderComments(List<String> strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            String data = TestDataUtil.getValue(strConditionName.get(3));
            SystolicMedicationName = data.concat(strExecutionID);
            waitForSeconds(3);
            waitForElementClickable(elmntRemainderComments);
            enterValue(elmntRemainderComments, SystolicMedicationName);
            isVerified = verifyElement(elmntRemainderComments);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean clickReminderSave() {
        waitForSeconds(3);
        waitForElementClickable(btnReminderSave);
        jsClick(btnReminderSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtmyhealthindicators);
        return verifyElement(elmtmyhealthindicators);
    }
    public boolean ClickActiveCardBloodPressureData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickBloodPressureActiveTab() {
        waitForSeconds(3);
        waitForElementClickable(btnStatus);
        jsClick(btnStatus);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElementClickable(btnActive);
        jsClick(btnActive);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElementClickable(btnsave);
        jsClick(btnsave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(btnactivetab);
        jsClick(btnactivetab);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtActiveTab);
        return verifyElement(elmtActiveTab);
    }
    public boolean VerifyBloodPressureActiveData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            verifyElement(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean VerifyHeightActiveData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            waitForSeconds(3);
            verifyElement(elmntActiveCardData);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickBloodPressureInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean VerifyBloodPressureMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(4).concat(strExecutionID)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressure);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBMIMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + lstDetails);
//            List<String>details=TestDataUtil.getListOfValue(lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(4).concat(strExecutionID)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBMI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditLDLMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult =verifyElement(elmntLDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditBloodPressureMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult =verifyElement(elmntBloodPressure);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditBMIMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult =verifyElement(elmntBMI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean ClickEditAlcoholMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult =verifyElement(elmntAlocohol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditHBACMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult =verifyElement(elmntHBA1C);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditHDLMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult =verifyElement(elmntHDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditAnxietyMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntAnxiety);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditDrinkingMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntDrinkingSurvey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditDepressionMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDepression);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditBloodSugarMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodSugar
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditHeightMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodSugar
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntHeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditWeightMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodSugar
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWeightCard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditPeakFlowMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntPeakFlow);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditSmokingMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntSmoking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditTotalCholesterolMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTotalCholesterol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditTriglyceridesMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTriglycerides);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditWaistSizeMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWaistSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean EditSystolicMedicationName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntEditSystolicMedicationName);
            enterValue(elmntEditSystolicMedicationName, strConditionName);
            isVerified = verifyElement(elmntEditSystolicMedicationName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }
    public boolean clickEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodPressure);
        return verifyElement(elmntBloodPressure);
    }
    public boolean ClickDeleteBloodPressureMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntBloodPressure);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteLDLMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntLDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteHBA1CMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntHBA1C);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickDeleteAlcoholMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAlocohol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteHDLMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntHDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteBMIMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String details = lstDetails.concat(strExecutionID);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBMI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteAnxietyMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAnxiety);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickDeleteDrinkingSurveyMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDrinkingSurvey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }




    public boolean ClickDeleteBloodSugarMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteHeightMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntsHeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickDeleteWeightMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesWeight
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntsWeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }



    public boolean ClickDeletePeakFlowMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntPeakFlow);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteSmokingMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntSmoking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteTriglyceridesMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTriglycerides);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteWaistSizeMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWaistSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteTotalCholesterolMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTotalCholesterol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteDepressionMyEntriesTableData(String lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDepression);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean clickYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntBloodPressure);
        return verifyElement(elmntBloodPressure);
    }

    public boolean clickBMI() {
        waitForElement(elmtPhysicalHealth);
        jsClick(elmtPhysicalHealth);
        waitForSeconds(3);
        waitForElementClickable(elmtBMI);
        jsClick(elmtBMI);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBMI);
        return verifyElement(elmntBMI);
    }

    public boolean selectBMIHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntBMIHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntBMIHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean enterBMIheight(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntBMIheight);
            enterValue(elmntBMIheight, strConditionName);
            isVerified = verifyElement(elmntBMIheight);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean enterBMIWeight(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntBMIWeight);
            enterValue(elmntBMIWeight, strConditionName);
            isVerified = verifyElement(elmntBMIWeight);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean clickBMIConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBMI);
        return verifyElement(elmntBMI);
    }
    public boolean ClickBMIData(List<String> lstDetails) {

        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            jsScrollIntoView(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            waitForSeconds(4);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickBMIReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtBMI);
        return verifyElement(elmtBMI);
    }

    public boolean ClickActiveCardBMIData(List<String> lstDetails) {

        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(4);
            jsScrollIntoView(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            waitForSeconds(4);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickBMIInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean EditBMIheightMedicationName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(4);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+strConditionName);
            waitForElementClickable(elmntEditSystolicMedicationName);
            enterValue(elmntEditSystolicMedicationName, strConditionName);
            isVerified = verifyElement(elmntEditSystolicMedicationName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        }

        return isVerified;
    }


    public boolean clickBMIEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBMI);
        return verifyElement(elmntBMI);
    }

    public boolean clickBMIYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntBMI);
        return verifyElement(elmntBMI);
    }

    public boolean clickHBA1C() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtHBA1C);
        waitForElementClickable(elmtHBA1C);
        jsClick(elmtHBA1C);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHBA1C);
        return verifyElement(elmntHBA1C);
    }

    public boolean clickHDL() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtHDL);
        waitForElementClickable(elmtHDL);
        jsClick(elmtHDL);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHDL);
        return verifyElement(elmntHDL);
    }

    public boolean selectHBA1CHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntHba1cHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntHba1cHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHDLHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntHDLHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntHDLHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterHba1cMeasurement(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntBda1cMeasurement);
            enterValue(elmntBda1cMeasurement, strConditionName);
            isVerified = verifyElement(elmntBda1cMeasurement);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean enterHDLMeasurement(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntBda1cMeasurement);
            enterValue(elmntBda1cMeasurement, strConditionName);
            isVerified = verifyElement(elmntBda1cMeasurement);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }
    public boolean selectHbd1cComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntHba1cComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntHba1cComments);
            waitForSeconds(2);
            jsClick(getElmntHba1cComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHba1cCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForSeconds(3);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHDLComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntHDLComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntHDLComments);
            waitForSeconds(2);
            jsClick(getElmntHDLComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHba1cCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForSeconds(3);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectBloodSugarComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntBloodSugarComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodSugarComments);
            waitForSeconds(2);
            jsClick(getElmntBloodSugarComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHba1cCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectWaistSizeComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntBloodSugarComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodSugarComments);
            waitForSeconds(2);
            jsClick(getElmntBloodSugarComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSmokingCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectSmokingComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntBloodSugarComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodSugarComments);
            click(getElmntBloodSugarComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSmokingCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(2);
            System.out.println(">>>>>>>>>>>>>>>>>>"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean clickHba1cConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHBA1C);
        return verifyElement(elmntHBA1C);
    }

    public boolean clickHDLConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHDL);
        return verifyElement(elmntHDL);
    }

    public boolean ClickHba1cData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickHDLData(List<String> lstDetails) {
        boolean blResult = false;
        try {

            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtmyhealthindicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickHba1cReminderSetting() {
        waitForSeconds(4);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmntsHBA1C);
        return verifyElement(elmntsHBA1C);
    }

    public boolean clickHDLReminderSetting() {
        waitForSeconds(4);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmntsHDL);
        return verifyElement(elmntsHDL);
    }

    public boolean ClickActiveCardHba1cData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickActiveCardHDLData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtmyhealthindicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickHba1cInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickHDLInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBda1cMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickHba1cEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHBA1C);
        return verifyElement(elmntHBA1C);
    }

    public boolean clickHDLEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHDL);
        return verifyElement(elmntHDL);
    }


    public boolean clickHba1cYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntHBA1C);
        return verifyElement(elmntHBA1C);
    }

    public boolean clickHDLYesButton() {
        waitForSeconds(3);
        waitForElement(btnBloodPressureyes);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtHDL);
        return verifyElement(elmtHDL);
    }

    public boolean clickLDLYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntLDL);
        return verifyElement(elmntLDL);
    }

    public boolean clickLDL() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtLDL);
        waitForElementClickable(elmtLDL);
        jsClick(elmtLDL);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntLDL);
        return verifyElement(elmntLDL);
    }

    public boolean selectLDLHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntLDLHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntLDLHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean enterLDLMeasurement(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntLDLMeasurement);
            enterValue(elmntLDLMeasurement, strConditionName);
            isVerified = verifyElement(elmntLDLMeasurement);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean enterBloodSugarMeasurement(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElementClickable(elmntLDLMeasurement);
            enterValue(elmntLDLMeasurement, strConditionName);
            isVerified = verifyElement(elmntLDLMeasurement);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean selectLDLComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntLDLComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntLDLComments);
            waitForSeconds(2);
            jsClick(getElmntLDLComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHba1cCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickLDLConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntLDL);
        return verifyElement(elmntLDL);
    }

    public boolean clickAlcoholConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAlcohol);
        return verifyElement(elmntAlcohol);
    }

    public boolean clickAnxietyConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAnxiety);
        return verifyElement(elmntAnxiety);
    }

    public boolean clickDrinkingSurveyConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDrinkingSurvey);
        return verifyElement(elmntDrinkingSurvey);
    }
    public boolean clickDepressionConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDepression);
        return verifyElement(elmntDepression);
    }

    public boolean clickBloodSugarConfirmButton() {
        waitForSeconds(3);
        jsScrollIntoView(btnBloodPressureconfrim);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodSugar);
        return verifyElement(elmntBloodSugar);
    }

    public boolean clickPeakFlowConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntPeakFlow);
        return verifyElement(elmntPeakFlow);
    }

    public boolean clickSmokingConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntSmoking);
        return verifyElement(elmntSmoking);
    }

    public boolean clickTotalCholesterolConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTotalCholesterol);
        return verifyElement(elmntTotalCholesterol);
    }

    public boolean clickTriglyceridesConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTriglycerides);
        return verifyElement(elmntTriglycerides);
    }

    public boolean clickWaistSizeConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntWaistSize);
        return verifyElement(elmntWaistSize);
    }

    public boolean ClickLDLData(List<String> lstDetails) {
        boolean blResult = false;
        try {

            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsScrollIntoView(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAlcoholData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElementClickable(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAnxietySeverityData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickBloodSugarData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickPeakFlowData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickSmokingData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickTotalCholesterolData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickTriglyceridesData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickWaistSizeData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickDepressionData(List<String> lstDetails) {
        boolean blResult = false;
        try {

            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickHeightCardData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            jsScrollIntoView(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            waitForSeconds(4);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickWeightCardData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            jsScrollIntoView(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            waitForSeconds(4);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDrinkingSurveyData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }




    public boolean clickLDLReminderSetting() {
        waitForSeconds(4);
        waitForElementClickable(elmtReminderSetting);
        jsClick(elmtReminderSetting);
        waitForSeconds(4);
        waitForElement(elmtLDL);
        return verifyElement(elmtLDL);
    }

    public boolean clickAlcoholReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtAlcohol);
        return verifyElement(elmtAlcohol);
    }

    public boolean clickAnxietyReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtAnxiety);
        return verifyElement(elmtAnxiety);
    }

    public boolean clickBloodSugarReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmntBloodSugar);
        return verifyElement(elmntBloodSugar);
    }

    public boolean clickHeightReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmntsheight);
        return verifyElement(elmntsheight);
    }

    public boolean clickWeightReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmntsWeightCard);
        return verifyElement(elmntsWeightCard);
    }


    public boolean clickPeakFlowReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtPeakFlow);
        return verifyElement(elmtPeakFlow);
    }

    public boolean clickSmokingReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtSmoking);
        return verifyElement(elmtSmoking);
    }

    public boolean clickTotalCholesterolReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtTotalCholesterol);
        return verifyElement(elmtTotalCholesterol);
    }

    public boolean clickTriglyceridesReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtTriglycerides);
        return verifyElement(elmtTriglycerides);
    }

    public boolean clickWaistSizeReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtWaistSize);
        return verifyElement(elmtWaistSize);
    }

    public boolean clickDepressionReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtDepression);
        return verifyElement(elmtDepression);
    }


    public boolean clickDrinkingSurveyReminderSetting() {
        waitForSeconds(3);
        waitForElementClickable(elmtReminderSetting);
        click(elmtReminderSetting);
        waitForSeconds(3);
        waitForElement(elmtDrinkingSurvey);
        return verifyElement(elmtDrinkingSurvey);
    }

    public boolean ClickActiveCardLDLData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            waitForSeconds(3);
            jsClick(elmntActiveCardData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean VerifyLDLActiveData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            jsScrollIntoView(elmntActiveCardData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntActiveCardData);
            verifyElement(elmntActiveCardData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickInActiveCardLDLData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            jsScrollIntoView(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            //            waitForElementClickable(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            jsScrollIntoView(btnInActive);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult =verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean clickLDLEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntLDL);
        return verifyElement(elmntLDL);
    }

    public boolean clickAlcoholEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAlcohol);
        return verifyElement(elmntAlcohol);
    }

    public boolean clickAnxietyEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAnxiety);
        return verifyElement(elmntAnxiety);
    }

    public boolean clickDrinkingSurveyEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDrinkingSurvey);
        return verifyElement(elmntDrinkingSurvey);
    }

    public boolean clickDepressionEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDepression);
        return verifyElement(elmntDepression);
    }

    public boolean clickBloodSuagrEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodSugar);
        return verifyElement(elmntBloodSugar);
    }

    public boolean clickHeightEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHeightCard);
        return verifyElement(elmntHeightCard);
    }

    public boolean clickWeightEditSaveButton() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntWeightCard);
        return verifyElement(elmntWeightCard);
    }

    public boolean clickPeakFlowEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntPeakFlow);
        return verifyElement(elmntPeakFlow);
    }
    public boolean clickSmokingEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntSmoking);
        return verifyElement(elmntSmoking);
    }

    public boolean clickTotalCholesterolEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTotalCholesterol);
        return verifyElement(elmntTotalCholesterol);
    }

    public boolean clickTriglyceridesEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTriglycerides);
        return verifyElement(elmntTriglycerides);
    }

    public boolean clickWaistSizeEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditBloodPressureSave);
        jsClick(btnEditBloodPressureSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntWaistSize);
        return verifyElement(elmntWaistSize);
    }

    public boolean clickAlcohol() {
        waitForElement(elmtMentalHealthAndAddictions);
        jsClick(elmtMentalHealthAndAddictions);
        waitForSeconds(3);
        waitForElementClickable(elmtAlcohol);
        jsClick(elmtAlcohol);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAlcohol);
        return verifyElement(elmntAlcohol);
    }

    public boolean clickAnxiety() {
        waitForElement(elmtMentalHealthAndAddictions);
        jsClick(elmtMentalHealthAndAddictions);
        waitForSeconds(3);
        waitForElementClickable(elmtAnxiety);
        jsClick(elmtAnxiety);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntAnxiety);
        return verifyElement(elmntAnxiety);
    }

    public boolean clickBloodSugar() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        waitForElementClickable(elmtBloodSugar);
        jsClick(elmtBloodSugar);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodSugar);
        return verifyElement(elmntBloodSugar);
    }

    public boolean clickDepression() {
        waitForElement(elmtMentalHealthAndAddictions);
        jsClick(elmtMentalHealthAndAddictions);
        waitForSeconds(3);
        waitForElementClickable(elmtDepression);
        jsClick(elmtDepression);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDepression);
        return verifyElement(elmntDepression);
    }

    public boolean clickDrinkingSurvey() {
        waitForElement(elmtMentalHealthAndAddictions);
        jsClick(elmtMentalHealthAndAddictions);
        waitForSeconds(3);
        jsScrollIntoView(elmtDrinkingSurvey);
        waitForElementClickable(elmtDrinkingSurvey);
        jsClick(elmtDrinkingSurvey);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDrinkingSurvey);
        return verifyElement(elmntDrinkingSurvey);
    }

    public boolean clickPeakFlow() {
        waitForElement(elmtBreathing);
        jsClick(elmtBreathing);
        waitForSeconds(3);
        jsScrollIntoView(elmtPeakFlow);
        waitForElementClickable(elmtPeakFlow);
        jsClick(elmtPeakFlow);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntPeakFlow);
        return verifyElement(elmntPeakFlow);
    }

    public boolean clickSmoking() {
        waitForElement(elmtMentalHealthAndAddictions);
        jsClick(elmtMentalHealthAndAddictions);
        waitForSeconds(3);
        jsScrollIntoView(elmtSmoking);
        waitForElementClickable(elmtSmoking);
        jsClick(elmtSmoking);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntSmoking);
        return verifyElement(elmntSmoking);
    }

    public boolean clickTotalCholesterol() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtTotalCholesterol);
        waitForElementClickable(elmtTotalCholesterol);
        jsClick(elmtTotalCholesterol);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTotalCholesterol);
        return verifyElement(elmntTotalCholesterol);
    }

    public boolean clickTriglycerides() {
        waitForElement(elmtHeartHealth);
        jsClick(elmtHeartHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtTriglycerides);
        waitForElementClickable(elmtTriglycerides);
        jsClick(elmtTriglycerides);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntTriglycerides);
        return verifyElement(elmntTriglycerides);
    }

    public boolean clickWaistSize() {
        waitForElement(elmtPhysicalHealth);
        jsClick(elmtPhysicalHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtWaistSize);
        waitForElementClickable(elmtWaistSize);
        jsClick(elmtWaistSize);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntWaistSize);
        return verifyElement(elmntWaistSize);
    }


    public boolean clickHeightCard() {
        waitForElement(elmtPhysicalHealth);
        jsClick(elmtPhysicalHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtHeightCard);
        waitForSeconds(2);
        waitForElementClickable(elmtHeightCard);
        jsClick(elmtHeightCard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntHeightCard);
        return verifyElement(elmntHeightCard);
    }

    public boolean clickWeightCard() {
        waitForElement(elmtPhysicalHealth);
        jsClick(elmtPhysicalHealth);
        waitForSeconds(3);
        jsScrollIntoView(elmtWeightCard);
        waitForSeconds(2);
        waitForElementClickable(elmtWeightCard);
        jsClick(elmtWeightCard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntWeightCard);
        return verifyElement(elmntWeightCard);
    }
    public boolean selectAlcoholHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntAlcoholHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntAlcoholHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAnxietyHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntAnxietyHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntAnxietyHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.printf(">>>>>>>>>>>>>>"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getElmntAnxietyHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDepressionHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntDepressionHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntDepressionHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntDepressionHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean selectDrinkingSurveyHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntDrinkingSurveyHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntDrinkingSurveyHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            waitForSeconds(3);
            blResult = verifyElement(getElmntDrinkingSurveyHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHeightCardHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntHeightCardHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntHeightCardHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntHeightCardHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectBloodSugarHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntBloodSugarHealthIndicator);
            waitForSeconds(2);
            jsClick(getElmntBloodSugarHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntBloodSugarHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPeakFlowHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getPeakFlowHealthIndicator);
            waitForSeconds(2);
            jsClick(getPeakFlowHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getPeakFlowHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSmokingHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getSmokingHealthIndicator);
            waitForSeconds(2);
            jsClick(getSmokingHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getSmokingHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTotalCholesterolHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getTotalCholesterolHealthIndicator);
            waitForSeconds(2);
            jsClick(getTotalCholesterolHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getTotalCholesterolHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTriglyceridesHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getTriglyceridesHealthIndicator);
            waitForSeconds(2);
            jsClick(getTriglyceridesHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getTriglyceridesHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectWaistSizeHealthIndicator(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getWaistSizeHealthIndicator);
            waitForSeconds(2);
            jsClick(getWaistSizeHealthIndicator);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getWaistSizeHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean SelectAlcohol(String data) {
        boolean isVerified = false;
        String strAlcoholTestData=TestDataUtil.getValue(data);
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>"+strAlcoholTestData);
        if (strAlcoholTestData.equals("BEER")){
            WebElement verifyAlcohol = waitForElement(By.xpath(elmntverifyAlcohol.replace("<<REPLACEMENT>>", strAlcoholTestData)));
            verifyElement(verifyAlcohol);
            waitForSeconds(2);
            waitForElementClickable(elmntchooseAlcoholcount);
            waitForSeconds(2);
            click(elmntchooseAlcoholcount);
            isVerified = verifyElement(verifyAlcohol);
        }
        if(strAlcoholTestData.equals("WINE")){
            waitForSeconds(3);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectAlcohol.replace("<<REPLACEMENT>>", strAlcoholTestData)));
            waitForElementClickable(elmntEntriesFromHealthCentre);
            click(elmntEntriesFromHealthCentre);
            waitForSeconds(2);
            WebElement verifyAlcohol = waitForElement(By.xpath(elmntverifyAlcohol.replace("<<REPLACEMENT>>", strAlcoholTestData)));
            verifyElement(verifyAlcohol);
            waitForSeconds(2);
            waitForElementClickable(elmntchooseAlcoholcount);
            waitForSeconds(2);
            click(elmntchooseAlcoholcount);
            isVerified = verifyElement(verifyAlcohol);
        }
        if(strAlcoholTestData.equals("SPIRIT")){
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntSelectAlcohol.replace("<<REPLACEMENT>>", strAlcoholTestData)));
            waitForElementClickable(elmntEntriesFromHealthCentre);
            click(elmntEntriesFromHealthCentre);
            waitForSeconds(2);
            WebElement verifyAlcohol = waitForElement(By.xpath(elmntverifyAlcohol.replace("<<REPLACEMENT>>", strAlcoholTestData)));
            verifyElement(verifyAlcohol);
            waitForSeconds(2);
            waitForElementClickable(elmntchooseAlcoholcount);
            waitForSeconds(2);
            click(elmntchooseAlcoholcount);
            isVerified = verifyElement(verifyAlcohol);

        }

        return  isVerified;
    }

    public boolean selectAlcoholComments(String strFamilyMember) {
        boolean blResult = false;
        try {
            jsScrollIntoView(getElmntAlcoholComments);
            waitForSeconds(2);
            waitForElementClickable(getElmntAlcoholComments);
            waitForSeconds(2);
            jsClick(getElmntAlcoholComments);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHba1cCommentsDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectFeelingnervousrestlessorstressed() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntOverthelast2weeks);
            jsClick(getElmntOverthelast2weeks);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectLittleinterestorpleasureindoingthing() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntLittleinterestorpleasureindoingthing);
            jsClick(getElmntLittleinterestorpleasureindoingthing);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowoftendoyouhaveadrinkcontainingalcohol() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntHowoftendoyouhaveadrinkcontainingalcohol);
            jsClick(getElmntHowoftendoyouhaveadrinkcontainingalcohol);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectNotbeingabletostoporcontrolworrying() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntNotbeingabletostoporcontrolworrying);
            jsClick(getElmntNotbeingabletostoporcontrolworrying);
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selectFeelingdowndepressedorhopeless() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntFeelingdowndepressedorhopeless);
            jsClick(getElmntFeelingdowndepressedorhopeless);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowmanyStandardDrinkscontainingalcohol() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntHowmanyStandardDrinkscontainingalcohol);
            jsClick(getElmntHowmanyStandardDrinkscontainingalcohol);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectWorryingtoomuchaboutdifferentthings() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntWorryingtoomuchaboutdifferentthings);
            jsClick(getElmntWorryingtoomuchaboutdifferentthings);
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTroublefallingorstayingasleeporsleepingtoomuch() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntTroublefallingorstayingasleeporsleepingtoomuch);
            jsClick(getElmntTroublefallingorstayingasleeporsleepingtoomuch);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowoftendoyouhavesixormoredrinksononeoccasion() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntHowoftendoyouhavesixormoredrinksononeoccasion);
            jsClick(getElmntHowoftendoyouhavesixormoredrinksononeoccasion);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectTroublerelaxing() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntTroublerelaxing);
            jsClick(getElmntTroublerelaxing);
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeelingtiredorhavinglittleenergy() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntFeelingtiredorhavinglittleenergy);
            jsClick(getElmntFeelingtiredorhavinglittleenergy);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowoftenduringthelastyearhaveyoufound() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntHowoftenduringthelastyearhaveyoufound);
            jsClick(getElmntHowoftenduringthelastyearhaveyoufound);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectBeingsorestlessthatitshardtositstill() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntBeingsorestlessthatitshardtositstill);
            jsClick(getElmntBeingsorestlessthatitshardtositstill);
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectPoorappetiteorovereating() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntPoorappetiteorovereating);
            jsClick(getElmntPoorappetiteorovereating);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selectHowofteninthelastyearhaveyoufailedtodo() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntHowofteninthelastyearhaveyoufailedtodo);
            jsClick(getElmntHowofteninthelastyearhaveyoufailedtodo);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectBecomingeasilyannoyedorirritable() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntBecomingeasilyannoyedorirritable);
            jsClick(getElmntBecomingeasilyannoyedorirritable);
            waitForSeconds(3);
            jsClick(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeelingbadaboutyourselforthatyouareafailureorhaveletyourselforyourfamilydown() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntFeelingbadaboutyourself);
            jsClick(getElmntFeelingbadaboutyourself);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowofteninthelastyearhaveyouneededadrink() {
        boolean blResult = false;
        try {
            waitForElementClickable(getHowofteninthelastyearhaveyouneededadrink);
            jsClick(getHowofteninthelastyearhaveyouneededadrink);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeelingafraidasifsomethingawfulmighthappen() {
        boolean blResult = false;
        try {
            waitForElementClickable(getElmntFeelingafraidasifsomethingawfulmighthappen);
            jsClick(getElmntFeelingafraidasifsomethingawfulmighthappen);
            waitForSeconds(3);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTroubleconcentratingonthingssuchasreadingthenewspaperorwatchingtelevision() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntTroubleconcentratingonthingssuchasreadingthenewspaperorwatchingtelevision);
            jsClick(getElmntTroubleconcentratingonthingssuchasreadingthenewspaperorwatchingtelevision);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowofteninthelastyearhaveyouhadafeeling() {
        boolean blResult = false;
        try {
            waitForElementClickable(getHowofteninthelastyearhaveyouhadafeeling);
            jsClick(getHowofteninthelastyearhaveyouhadafeeling);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectMovingorspeakingsoslowly() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntMovingorspeakingsoslowly);
            jsClick(getElmntMovingorspeakingsoslowly);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHowofteninthelastyearhaveyoubeenunable() {
        boolean blResult = false;
        try {
            waitForElementClickable(getHowofteninthelastyearhaveyoubeenunable);
            jsClick(getHowofteninthelastyearhaveyoubeenunable);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectThoughtsthatYouwouldbebetteroffdead() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(getElmntThoughtsthatyouwouldBebetteroffdead);
            jsClick(getElmntThoughtsthatyouwouldBebetteroffdead);
            waitForSeconds(3);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHaveyouorsomeoneelsebeeninjuredasaresult() {
        boolean blResult = false;
        try {
            waitForElementClickable(getHaveyouorsomeoneelsebeeninjuredasaresult);
            jsClick(getHaveyouorsomeoneelsebeeninjuredasaresult);
            waitForSeconds(3);
            click(getElmntNextbutton);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHasarelativefriendordoctor() {
        boolean blResult = false;
        try {
            waitForElementClickable(getHasarelativefriendordoctor);
            jsClick(getHasarelativefriendordoctor);
            waitForSeconds(3);
            blResult = verifyElement(getElmntNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickActiveCardAlcoholData(List<String> lstDetails) {
        boolean blResult = false;
        try {

            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickActiveCardAnxietyData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickActiveCardBloodSugarData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickActiveCardDepressionData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickActiveCardDrinkingSurveyData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(3);
            System.out.println(elmntActiveCardData);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            blResult = verifyElement(elmtMyHealthIndicators);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickAlcoholInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAnxietyInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickBloodSugarInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickPeakFlowInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickSmokingInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickTotalCholesterolInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickTriglyceridesInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickWaistSizeInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDepressionInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickHeightCardInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmtInactiveAlltab);
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            jsClick(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            jsScrollIntoView(elmntActiveCardData);
            waitForSeconds(4);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickWeightCardInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmtInactiveAlltab);
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            jsClick(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            jsScrollIntoView(elmntActiveCardData);
            waitForSeconds(4);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDrinkingSurveyInActiveIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            click(elmtInactiveAlltab);
            waitForSeconds(3);
            String currentDate = getCurrentDate("dd MMM yyyy");
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            click(elmntActiveCardData);
            waitForSeconds(3);
            waitForElementClickable(btnStatus);
            click(btnStatus);
            waitForSeconds(3);
            waitForElementClickable(btnInActive);
            jsClick(btnInActive);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyAlcoholMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAlcohol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyAnxietyMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAnxiety);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyDrinkingSurveyMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>>"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDrinkingSurvey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyDepressionMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesAnxiety
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDepression);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBloodSugarMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyHeightMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(1).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressureTableData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyWeightMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(1).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntsWeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyPeakFlowMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntPeakFlow);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean VerifySmokingMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            waitForSeconds(2);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntSmoking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyTotalCholesterolMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTotalCholesterol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyTriglyceridesMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTriglycerides);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyWaistSizeMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(TestDataUtil.getValue(lstDetails.get(3).concat(strExecutionID))))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElement(elmntBloodPressureTableData);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWaistSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickAlcoholYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntAlcohol);
        return verifyElement(elmntAlcohol);
    }

    public boolean clickAnxietyYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntAnxiety);
        return verifyElement(elmntAnxiety);
    }

    public boolean clickHeightYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntHeightCard);
        return verifyElement(elmntHeightCard);
    }

    public boolean clickWeightYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntWeightCard);
        return verifyElement(elmntWeightCard);
    }

    public boolean clickDrinkingSurveyYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntDrinkingSurvey);
        return verifyElement(elmntDrinkingSurvey);
    }

    public boolean clickDepressionYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntDepression);
        return verifyElement(elmntDepression);
    }


    public boolean clickBloodSugarYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntBloodSugar);
        return verifyElement(elmntBloodSugar);
    }

    public boolean clickPeakFlowYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntPeakFlow);
        return verifyElement(elmntPeakFlow);
    }

    public boolean clickSmokingYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntSmoking);
        return verifyElement(elmntSmoking);
    }

    public boolean clickTotalCholesterolYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntTotalCholesterol);
        return verifyElement(elmntTotalCholesterol);
    }

    public boolean clickTriglyceridesYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntTriglycerides);
        return verifyElement(elmntTriglycerides);
    }
    public boolean clickWaistSizeYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntWaistSize);
        return verifyElement(elmntWaistSize);
    }
    public boolean verifyDeletedRecord() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(8);
        System.out.println(SystolicMedicationName);
        waitForInvisibility(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", SystolicMedicationName)));
        return notVerifyElement(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", SystolicMedicationName)));
    }

    public boolean ClickAlcoholChangePrivateSettingIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>PrivateSettinglstDetails"+lstDetails);
            waitForSeconds(3);
            waitForElementClickable(elmtInactiveAlltab);
            jsClick(elmtInactiveAlltab);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmtPrivacySetting);
            jsClick(elmtPrivacySetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            verifyElement(elmtPrivacySettingHeader);
            waitForSeconds(2);
            waitForElement(elmtShowthisentrytomycareproviders);
            jsClick(elmtShowthisentrytomycareproviders);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyAlcoholShowthisentrytomycareprovidersMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = true;
        try {
//            System.out.println(">>>>>>>>>>>>>>>>>>>PrivateSettinglstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            jsScrollUp();
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData =driver.findElement(By.xpath(strMyEntriesShowthisentrytomycareproviders
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(1).concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressureTableData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickAlcoholKeepthisprivateIcon(List<String> lstDetails) {
        boolean blResult = false;
        try {

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement elmntActiveCardData = waitForElement(By.xpath(ActiveCardElemnts
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))));
            waitForSeconds(6);
            waitForElement(elmntActiveCardData);
            jsClick(elmntActiveCardData);
            waitForSeconds(3);
            waitForElement(elmtPrivacySetting);
            jsClick(elmtPrivacySetting);
            waitForSeconds(2);
            verifyElement(elmtPrivacySettingHeader);
            waitForSeconds(2);
            waitForElement(elmtKeepthisprivate);
            jsClick(elmtKeepthisprivate);
            waitForSeconds(3);
            waitForElementClickable(btnsave);
            click(btnsave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(getNewHealthIndicator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean verifyDeleteIconAlcoholMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(1).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
          verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAlocohol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyAnxietySeverityShowthisentrytomycareprovidersMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = true;

        try {

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String currentDate = getCurrentDate("dd MMM yyyy");
//            jsScrollUp();
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = driver.findElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));
//            jsScrollUp();
            System.out.println(">>>>>>>>>>>>>elmntBloodPressureTableData"+elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressureTableData);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconAnxietySeverityMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
//            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(1);
//            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntAnxiety);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean verifyDeleteIconBloodPressureMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressure);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconBloodSugarMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconDepressionMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(1);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesDepression
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDepression);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBloodPressureShowthisentrytomycareprovidersMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = true;
        try {
//            System.out.println(">>>>>>>>>>>>>>>>>>>PrivateSettinglstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String currentDate = getCurrentDate("dd MMM yyyy");
//            jsScrollUp();
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData =driver.findElement(By.xpath(strMyEntriesShowthisentrytomycareproviders
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2).concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            blResult = verifyElement(elmntBloodPressureTableData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBloodSugarShowthisentrytomycareprovidersMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = true;
        try {
//            System.out.println(">>>>>>>>>>>>>>>>>>>PrivateSettinglstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String currentDate = getCurrentDate("dd MMM yyyy");
//            jsScrollUp();
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData =driver.findElement(By.xpath(strMyEntriesShowthisentrytomycareproviders
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2).concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
//            waitForElement(elmntBloodPressureTableData);
//            jsScrollDown();
            blResult = verifyElement(elmntBloodPressureTableData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconDrinkingSurveyMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(1);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesAnxietySeverity
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntDrinkingSurvey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconHBA1CMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntHBA1C);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconHDLMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntHDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean verifyDeleteIconLDLMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntLDL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconPeakFlowMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String currentDate = getCurrentDate("dd MMM yyyy");
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntPeakFlow);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconTotalCholesterolMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTotalCholesterol);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean verifyDeleteIconSmokingMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntSmoking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconTriglyceridesMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntTriglycerides);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconWaistSizeMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWaistSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public boolean verifyDeleteIconBMIMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntBMI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconHeightMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntHeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyDeleteIconWeightMyEntriesTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            String details = lstDetails.get(2).concat(strExecutionID);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            jsScrollIntoView(veriflyAllTabElement);
            takeScreenshot(driver);
            String currentDate = getCurrentDate("dd MMM yyyy");
            waitForSeconds(5);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteMyEntriesBloodPressure
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(currentDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(details))));
            waitForElementClickable(elmntBloodPressureTableData);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            verifyElement(elmntBloodPressureTableData);
            blResult = verifyElement(elmntWeightCard);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickBloodPressureConfirmButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureconfrim);
        jsClick(btnBloodPressureconfrim);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntBloodPressure);
        System.out.println("Successfully entered BloodPressure Data >>> :: ");
        return verifyElement(elmntBloodPressure);
    }

    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntDashBoard);
        jsClick(elmntDashBoard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmntVerifyHomePage);
    }



}

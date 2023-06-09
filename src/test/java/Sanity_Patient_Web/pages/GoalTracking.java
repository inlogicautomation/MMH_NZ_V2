package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.util.List;

import static cap.utilities.DateUtil.getDayAfterTommorrowDate;
import static cap.utilities.SharedDriver.strExecutionID;

public class GoalTracking extends BasePage {
    public GoalTracking(WebDriver driver) {
        super(driver);

    }

    public static String GoalName = "";
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Goal Tracking')]")
    protected WebElement elmtgoaltracking;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Goal Tracking')]")
    protected WebElement elmtsgoaltracking;

    protected String ClickRadioButton = new StringBuilder()
            .append("//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Goal')]")
    protected WebElement elmtAddGoal;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add New Goal')]")
    protected WebElement elmtsAddNewGoal;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='goalName']")
    protected WebElement elmntGaolName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='type']")
    protected WebElement getElmntType;

    protected String elmntHealthIndicatorDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntGoalTrackingFilterDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//parent::mat-option").toString();
    //span[contains(text(),'Previous Goals')]//parent::mat-option

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='description']")
    protected WebElement elmntDescription;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='taskDescription']")
    protected WebElement elmntTaskDescriptionarea;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='startDate']//following::button)[1]")
    protected WebElement elmntStartDate;


    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='endDate']//following::button)[1]")
    protected WebElement elmntEndDate;


    @FindBy(how = How.XPATH, using = "//button[@aria-label='Choose month and year']")
    protected WebElement elmntMonthAndYear;

    public String futureDate = new StringBuilder()
            .append("//td/div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Open calendar']")
    protected WebElement elmntCalendar;

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'I want to use pre-defined unit of measurements')]/preceding::div[@class='mat-radio-container']//input)[2]")
    protected WebElement getElmtmeasurementforthisgoal;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='initialValue']")
    protected WebElement elmntInitialValue;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='preDefinedUnitOfMeasurements']")
    protected WebElement getElmntUnitMeasurement;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='targetValue']")
    protected WebElement elmntTargetValue;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),' Privacy Settings')]//following::div[@class='mat-radio-container']//input)[1]")
    protected WebElement getElmtGoalPrivacySetting;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),' Privacy Settings')]//following::div[@class='mat-radio-container']//input)[2]")
    protected WebElement getElmtShowThisEntryPrivacySetting;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')]//parent::button)[1]")
    protected WebElement getElmtgoaltrackingsavebutton;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save & Set Reminder')]//parent::button)[1]")
    protected WebElement getElmtgoaltrackingsaveAndSetReminderbutton;

    protected String strGoalTrackingTableData = new StringBuilder()
            .append("(//tr//td//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td//following::td//following::td//button)[1]").toString();

    //    (//tr//td//following::td//a[contains(text(),'Testing')]//following::td[contains(text(),'20')]//following::td[contains(text(),'30')]//following::td//a[contains(text(),'None')]//following::td//following::td//following::td//button)[1]
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Filter by')]//following::mat-form-field//mat-select)[1]")
    protected WebElement getElmntcurrentgoal;


    protected String strPrescriptionsDetails = new StringBuilder()
            .append("//div[@class='tbl-th']/following::div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
    protected WebElement elmntIcon;

    protected String strEditGoalTrackingTableData = new StringBuilder()
            .append("(//tr//td//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td//following::td//following::td//button)[2]").toString();

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='notes']")
    protected WebElement elmntNotes;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnEditviewjournalSave;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Update ')]")
    protected WebElement btnEditGoalTrackingSave;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')])[3]")
    protected WebElement btnFutureTaskEditviewjournalSave;

    protected String strDeleteGoalTrackingTableData = new StringBuilder()
            .append("(//tr//td//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td//following::td//following::td//button)[3]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')] ")
    protected WebElement btnBloodPressureyes;

    protected String elmntVerifyDelete = new StringBuilder().append("//td[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='reminderType'])[1]")
    protected WebElement getElmntReminderType;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='frequency']")
    protected WebElement getElmntFrequency;


    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='time'])[1]")
    protected WebElement getElmntTime;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='message'])[1]")
    protected WebElement elmntMessage;

    @FindBy(how = How.XPATH, using = "(//tr//th[contains(text(),'Add Value')]//following::td//button)[1]")
    protected WebElement getElmtAddValuebutton;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='measurementValue']")
    protected WebElement elmntMeasurement;

    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='message'])[2]")
    protected WebElement elmntComments;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')]//parent::button)[4]")
    protected WebElement getElmtAddValuesavebutton;


    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')]//parent::button)[3]")
    protected WebElement getElmtSetRemindersavebutton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reminder Preview')]")
    protected WebElement getElmtSetReminderPreviewsavebutton;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Goal Reminder Preview Message')]")
    protected WebElement veriflySetReminderPreviewsavebutton;

    @FindBy(how = How.XPATH, using = " //a[contains(text(),'click here')]")
    protected WebElement getclickbutton;

    //a[contains(text(),'click here')]

    protected String ClickAddButtonTableData = new StringBuilder()
            .append("(//tr//td//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td//button)[1]").toString();


//    (//tr//td//following::td//a[contains(text(),'TestGoalName-FJDKSVEX')]//following::td[contains(text(),'20')]//following::td[contains(text(),'30')]//following::td//a[contains(text(),'None')]//following::td//button)[1]

    protected String ClickGraphIcon = new StringBuilder()
            .append("(//tr//td//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//a[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')]//following::td//following::td//button)[1]").toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Goal Analysis')]")
    protected WebElement getGoalAnalysisHeader;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Data')]//preceding::div[@class='mat-radio-inner-circle']//following-sibling::input)[3]")
    protected WebElement getElmtDataRadiobutton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Export to Excel')]")
    protected WebElement getElmtExporttoExcelbutton;

    protected String ClickGoalAnalysisEditIcon = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//button)[1]").toString();
//    (//td[contains(text(),'testcomments')]//following::td//button)[1]

    @FindBy(how = How.XPATH, using = "(//input[@name='Latest_Value'])[1]")
    protected WebElement elmntGoalAnalysisValue;

    @FindBy(how = How.XPATH, using = "(//input[@name='Latest_Value'])//following::td//button[3]")
    protected WebElement elmntGoalAnalysisRightIcon;

    protected String ClickGoalAnalysisDeleteIcon = new StringBuilder()
            .append("(//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//button)[2]").toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Goal Analysis')]//i")
    protected WebElement btnGoalAnalysisBackButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Task')]")
    protected WebElement btnAddTaskButton;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add New Task')]")
    protected WebElement elmtAddNewTask;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='taskName']")
    protected WebElement elmntTaskName;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='taskDescription']")
    protected WebElement elmntTaskDescription;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='reminderType'])[2]")
    protected WebElement getElmntTaskReminderType;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='remindMe']")
    protected WebElement getElmntTaskRemindMe;

    @FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='time'])[2]")
    protected WebElement getElmntTaskTime;


    @FindBy(how = How.XPATH, using = "(//textarea[@formcontrolname='message'])[3]")
    protected WebElement elmntTaskMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add this task to Calendar')]//preceding::div[@class='mat-checkbox-inner-container']//child::input[@aria-checked='true']")
    protected WebElement btnAddthistasktoCalendar;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Completed')]//preceding::div[@class='mat-checkbox-inner-container']/child::input)[2]")
    protected WebElement btnStatusCompleted;


    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')]//parent::button)[5]")
    protected WebElement getElmtAddTasksavebutton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Save & Add Another Task ')]//parent::button")
    protected WebElement getElmtAddAnotherTasksavebutton;

    @FindBy(how = How.XPATH, using = "(//mat-icon[contains(text(),'close')])[4]")
    protected WebElement getElmtAddTaskcancelbutton;



    protected String ClickReminderSettingIconTableData = new StringBuilder()
            .append("(//div[contains(text(),'Previous Tasks')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td//button)[1]").toString();

//    (//div[contains(text(),'Previous Tasks')]//following::td[contains(text(),'task name')]//following::td//following::td//button)[1]

    protected String ClickFutureTaskInfoIconTableData = new StringBuilder()
            .append("(//div[contains(text(),'Previous Tasks')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td//button)[1]").toString();

    protected String ClickFutureTaskEditIconTableData = new StringBuilder()
            .append("(//div[contains(text(),'Previous Tasks')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td//button)[2]").toString();


    protected String ClickFutureTaskDeleteIconTableData = new StringBuilder()
            .append("(//div[contains(text(),'Previous Tasks')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td//following::td//button)[3]").toString();

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='taskDueDate']")
    protected WebElement elmntTaskDueDate;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Previous Tasks')]//parent::div)[2]")
    protected WebElement elmtsPreviousTask;
    public boolean clickGoalTracking() {
        waitForSeconds(4);
        waitForElement(elmtgoaltracking);
        click(elmtgoaltracking);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean clickADDGoal() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(4);
        waitForElement(elmtAddGoal);
        jsClick(elmtAddGoal);
        waitForSeconds(3);
        return verifyElement(elmtsAddNewGoal);
    }

    public boolean enterGaolName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            GoalName = strConditionName.concat(strExecutionID);
            waitForElementClickable(elmntGaolName);
            enterValue(elmntGaolName, GoalName);
            isVerified = verifyElement(elmntGaolName);
        }

        return isVerified;
    }

    public boolean selectType(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntType);
            waitForSeconds(2);
            jsClick(getElmntType);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterDescription(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntDescription);
            enterValue(elmntDescription, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntDescription);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public void enterGaolTrackingDateTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElement(elmntStartDate);
            click(elmntStartDate);
            String strDateFormat = "d";
            String strDay = "TOMORROW";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

        }

    }

    public void enterGaolTrackingEndTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            jsScrollIntoView(elmntEndDate);
            waitForElement(elmntEndDate);
            jsClick(elmntEndDate);
            waitForSeconds(3);
            waitForElement(elmntMonthAndYear);
            waitForElementClickable(elmntMonthAndYear);
            jsClick(elmntMonthAndYear);


            String date = getDayAfterTommorrowDate("d");
            String month = getDayAfterTommorrowDate("MMM").toUpperCase();
            String year = getDayAfterTommorrowDate("YYYY");

            System.out.println("getDayAfterTomorrowDate >>> :: " + date);
            System.out.println("getDayAfterTomorrowDate >>> :: " + month);
            System.out.println("getDayAfterTomorrowDate >>> :: " + year);


            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", year));
            WebElement selectYear = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", year)));

            waitForSeconds(3);
            waitForElement(selectYear);
            waitForElementClickable(selectYear);
            jsClick(selectYear);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", month));
            WebElement selectMonth = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", month)));

            waitForSeconds(3);
            waitForElement(selectMonth);
            waitForElementClickable(selectMonth);
            jsClick(selectMonth);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", date));
            WebElement selectDate = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", date)));

            waitForSeconds(3);
            waitForElement(selectDate);
            waitForElementClickable(selectDate);
            jsClick(selectDate);

            System.out.println("Value >>> :: " + elmntCalendar.getAttribute("value"));
            waitForElement(elmntCalendar);
            String strEnteredDate = elmntCalendar.getAttribute("value");
            System.out.println("strEnteredDate >>>> :: "+strEnteredDate);
            waitForSeconds(2);
            takeScreenshot(driver);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

        }

    }

    public void checkWhatistheunitofmeasurementforthisgoal() {
        waitForSeconds(3);
        jsClick(getElmtmeasurementforthisgoal);

    }

    public boolean enterInitialValue(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntInitialValue);
            enterValue(elmntInitialValue, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntInitialValue);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean selectUnitMeasurement(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntUnitMeasurement);
            waitForSeconds(2);
            jsClick(getElmntUnitMeasurement);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntUnitMeasurement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterTargetValue(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntTargetValue);
            enterValue(elmntTargetValue, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntTargetValue);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean checkGoalTrackingPrivacySetting() {
        waitForSeconds(3);
        jsClick(getElmtGoalPrivacySetting);
        waitForSeconds(3);
        return verifyElement(getElmtGoalPrivacySetting);
    }

    public boolean ShowEntryGoalTrackingPrivacySetting() {
        waitForSeconds(3);
        jsClick(getElmtShowThisEntryPrivacySetting);
        waitForSeconds(3);
        return verifyElement(getElmtShowThisEntryPrivacySetting);
    }

    public boolean ClickGoalTrackingSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(getElmtgoaltrackingsavebutton);
        jsClick(getElmtgoaltrackingsavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return true;
    }

    public boolean ClickGoalTrackingSaveAndSetReminderButton() {
        waitForSeconds(3);
        click(getElmtgoaltrackingsaveAndSetReminderbutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }


    public boolean VerifyGoalTrackingTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>SetReminderlstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strGoalTrackingTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(4)))));
            waitForSeconds(3);
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean selectFliterCurrentGoals(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>strFamilyMember" + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(getElmntcurrentgoal);
            waitForSeconds(2);
            jsClick(getElmntcurrentgoal);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember.get(0))));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntcurrentgoal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFliterPreviousGoals(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntcurrentgoal);
            waitForSeconds(2);
            jsClick(getElmntcurrentgoal);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember.get(0))));
//            waitForElementClickable(elmntEntriesFromHealthCentre);
            waitForElement(elmntEntriesFromHealthCentre);
            click(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntcurrentgoal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFliterShowAllGoals(List<String> strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntcurrentgoal);
            waitForSeconds(2);
            jsClick(getElmntcurrentgoal);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember.get(0))));
            waitForSeconds(2);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntcurrentgoal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickGoalTrackingMoreInfoIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            WebElement elmntPrescriptionIconData = waitForElement(By.xpath(strGoalTrackingTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(4)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(5)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(6)))));
            waitForElementClickable(elmntPrescriptionIconData);
            jsClick(elmntPrescriptionIconData);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String str : lstDetails1) {
                waitForSeconds(3);
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditViewJournalTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditGoalTrackingTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean EditDescription(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(elmntDescription);
            enterValue(elmntDescription, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntDescription);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean clickEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditviewjournalSave);
        jsClick(btnEditviewjournalSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);

    }

    public boolean clickGoalEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditGoalTrackingSave);
        jsClick(btnEditGoalTrackingSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);

    }

    public boolean clickFutureTaskEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnFutureTaskEditviewjournalSave);
        jsClick(btnFutureTaskEditviewjournalSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
//        jsClick(elmtsPreviousTask);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);

    }

    public boolean clickPreviousTaskEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnFutureTaskEditviewjournalSave);
        jsClick(btnFutureTaskEditviewjournalSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        jsClick(elmtsPreviousTask);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);

    }

    public boolean ClickDeleteViewJournalTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
//            List<String>strdata=TestDataUtil.getListOfValue(lstDetails);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteGoalTrackingTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            jsScrollIntoView(elmntBloodPressureTableData);
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickYesButton() {
//        waitForSeconds(3);
        waitForElement(btnBloodPressureyes);
        waitForElementClickable(btnBloodPressureyes);
        mouseClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean verifyDeletedRecord() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(8);
        System.out.println(GoalName);
        waitForInvisibility(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", GoalName)));
        return notVerifyElement(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", GoalName)));
    }

    public void enterPreviousGaolTrackingDateTaken() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntStartDate);
            click(elmntStartDate);
            String strDateFormat = "d";
            String strDay = "YESTERDAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

        }

    }

    public void enterPreviousGaolTrackingEngDateTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            jsScrollIntoView(elmntStartDate);
            waitForElement(elmntEndDate);
            jsClick(elmntEndDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

        }
    }

    public boolean selectReminderType(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntReminderType);
            waitForSeconds(2);
            jsClick(getElmntReminderType);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntReminderType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFrequency(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntFrequency);
            waitForSeconds(2);
            jsClick(getElmntFrequency);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntFrequency);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTime(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntTime);
            waitForSeconds(2);
            jsClick(getElmntTime);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterMessage(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            GoalName = strConditionName.concat(strExecutionID);
            waitForElementClickable(elmntMessage);
            enterValue(elmntMessage, GoalName);
            isVerified = verifyElement(elmntMessage);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public void enterSetReminderDateTaken() {

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

        }

    }

    public void enterSetReminderEndTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntEndDate);
            waitForElement(elmntEndDate);
            jsClick(elmntEndDate);
            waitForSeconds(3);
            waitForElement(elmntMonthAndYear);
            waitForElementClickable(elmntMonthAndYear);
            jsClick(elmntMonthAndYear);


            String date = getDayAfterTommorrowDate("d");
            String month = getDayAfterTommorrowDate("MMM").toUpperCase();
            String year = getDayAfterTommorrowDate("YYYY");

            System.out.println("getDayAfterTomorrowDate >>> :: " + date);
            System.out.println("getDayAfterTomorrowDate >>> :: " + month);
            System.out.println("getDayAfterTomorrowDate >>> :: " + year);


            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", year));
            WebElement selectYear = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", year)));

            waitForSeconds(3);
            waitForElement(selectYear);
            waitForElementClickable(selectYear);
            jsClick(selectYear);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", month));
            WebElement selectMonth = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", month)));

            waitForSeconds(3);
            waitForElement(selectMonth);
            waitForElementClickable(selectMonth);
            jsClick(selectMonth);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", date));
            WebElement selectDate = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", date)));

            waitForSeconds(3);
            waitForElement(selectDate);
            waitForElementClickable(selectDate);
            jsClick(selectDate);

            System.out.println("Value >>> :: " + elmntCalendar.getAttribute("value"));
            waitForElement(elmntCalendar);
            String strEnteredDate = elmntCalendar.getAttribute("value");
            System.out.println("strEnteredDate >>>> :: "+strEnteredDate);
            waitForSeconds(2);
            takeScreenshot(driver);
//            documentValidityDate = getDayAfterTommorrowDate("d MMM YYYY");
        }

    }
    public boolean ClickAddValueButton() {
        waitForSeconds(3);
        click(getElmtAddValuebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean enterMeasurement(List<String> strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
            String strdata=TestDataUtil.getValue(strConditionName.get(4));
            waitForElementClickable(elmntMeasurement);
            enterValue(elmntMeasurement, strdata);
            isVerified = verifyElement(elmntMeasurement);
        }

        return isVerified;
    }

    public boolean enterComments(List<String> strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
            String strdata=TestDataUtil.getValue(strConditionName.get(5).concat(strExecutionID));
            waitForElementClickable(elmntComments);
            enterValue(elmntComments, strdata);
            isVerified = verifyElement(elmntComments);
        }

        return isVerified;
    }

    public boolean ClickAddValueSaveButton() {
        jsScrollIntoView(getElmtAddValuesavebutton);
        waitForSeconds(3);
        jsClick(getElmtAddValuesavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmtsgoaltracking);
    }

    public boolean ClickSetReminderSaveButton() {
        waitForSeconds(3);
        jsScrollIntoView(getElmtSetRemindersavebutton);
        waitForElement(getElmtSetRemindersavebutton);
        jsClick(getElmtSetRemindersavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean ClickSetReminderPreviewSaveButton() {
        waitForSeconds(3);
        click(getElmtSetReminderPreviewsavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(veriflySetReminderPreviewsavebutton);
    }

    public boolean ClickHereButton() {
        waitForSeconds(3);
        click(getclickbutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean clickRadioButton(List<String> strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
            String strdata=TestDataUtil.getValue(strConditionName.get(0).concat(strExecutionID));
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickRadioButton
                    .replace("<<REPLACEMENT1>>",strdata)));
            System.out.println(">>>>>>>>>>>>>>"+elmntPrescriptionTableData);
            waitForSeconds(3);
            jsClick(elmntPrescriptionTableData);
            waitForSeconds(3);
            isVerified = verifyElement(elmntPrescriptionTableData);
        }

        return isVerified;
    }

    public boolean ClickAddValueTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickAddButtonTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickGraphIconTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickGraphIcon
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            waitForSeconds(2);
            blResult =verifyElement(getGoalAnalysisHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDataRadioButton() {
        waitForSeconds(3);
        jsClick(getElmtDataRadiobutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(getGoalAnalysisHeader);
    }

    public boolean ClickExporttoExcelButton() {
        waitForSeconds(3);
        jsClick(getElmtExporttoExcelbutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(getGoalAnalysisHeader);
    }

    public boolean EditGoalAnalysisTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickGoalAnalysisEditIcon
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            blResult =verifyElement(getGoalAnalysisHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean enterGoalAnalysisValue(List<String> strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            System.out.println(">>>>>>>>>>>>>>>>>>>>strConditionName"+strConditionName);
            String strdata=TestDataUtil.getValue(strConditionName.get(1));
            waitForElementClickable(elmntGoalAnalysisValue);
            enterValue(elmntGoalAnalysisValue, strdata);
            waitForSeconds(3);
            jsClick(elmntGoalAnalysisRightIcon);
            waitForSeconds(3);
            isVerified = verifyElement(getGoalAnalysisHeader);
        }

        return isVerified;
    }

    public boolean DeleteGoalAnalysisTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickGoalAnalysisDeleteIcon
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            blResult =verifyElement(getGoalAnalysisHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickGoalAnalysisYesButton() {
        waitForSeconds(3);
        waitForElementClickable(btnBloodPressureyes);
        jsClick(btnBloodPressureyes);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(getGoalAnalysisHeader);
        return verifyElement(getGoalAnalysisHeader);
    }

    public boolean DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();
        }
        return verifyElement(getGoalAnalysisHeader);
    }
    public boolean clickGoalAnalysisBackIcon() {
        waitForSeconds(3);
        waitForElementClickable(btnGoalAnalysisBackButton);
        jsClick(btnGoalAnalysisBackButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtsgoaltracking);
        return verifyElement(elmtsgoaltracking);
    }
    //h1[contains(text(),'Goal Analysis')]//

    public boolean clickAddTaskIcon() {
//        driver.navigate().refresh();
//        waitForSeconds(5);
//        waitForElementDisappear(driver,btnAddTaskButton);
        waitForSeconds(3);
        jsScrollIntoView(btnAddTaskButton);
        waitForElementClickable(btnAddTaskButton);
        jsClick(btnAddTaskButton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtAddNewTask);
        return verifyElement(elmtAddNewTask);
    }

    public boolean enterTaskName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
            String strdata=TestDataUtil.getValue(strConditionName.concat(strExecutionID));
            waitForElementClickable(elmntTaskName);
            enterValue(elmntTaskName, strdata);
            isVerified = verifyElement(elmntTaskName);
        }

        return isVerified;
    }

    public boolean enterTaskDescription(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
//            String strdata=TestDataUtil.getValue(strConditionName.get(5).concat(strExecutionID));
            waitForElementClickable(elmntTaskDescription);
            enterValue(elmntTaskDescription, strConditionName);
            isVerified = verifyElement(elmntTaskDescription);
        }

        return isVerified;
    }

    public void enterTaskFuturedateTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntTaskDueDate);
            click(elmntTaskDueDate);
            String strDateFormat = "d";
            String strDay = "TOMORROW";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day ::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
        }


    }

    public boolean selectTaskReminderType(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntTaskReminderType);
            waitForSeconds(2);
            jsClick(getElmntTaskReminderType);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTaskReminderType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selectTaskRemindMe(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntTaskRemindMe);
            waitForSeconds(2);
            jsClick(getElmntTaskRemindMe);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTaskRemindMe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTaskTime(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntTaskTime);
            waitForSeconds(2);
            jsClick(getElmntTaskTime);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntGoalTrackingFilterDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTaskTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterTaskMessage(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>strConditionName"+strConditionName);
            waitForSeconds(2);
//            String strdata=TestDataUtil.getValue(strConditionName.concat(strExecutionID));
            waitForElementClickable(elmntTaskMessage);
            enterValue(elmntTaskMessage, strConditionName);
            isVerified = verifyElement(elmntTaskMessage);
        }

        return isVerified;
    }

    public boolean VeriflyAddthistasktoCalendar() {
        waitForSeconds(3);
        return verifyElement(btnAddthistasktoCalendar);
    }
    public boolean clickStatusCompleted() {
        waitForSeconds(3);
        jsClick(btnStatusCompleted);
        waitForSeconds(2);
        return verifyElement(btnStatusCompleted);
    }

    public boolean ClickAddTaskSaveButton() {
        waitForSeconds(3);
        click(getElmtAddTasksavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public void enterAddTaskStartDateTaken() {

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

        }

    }
    public boolean ClickReminderSettingIconTableData(String lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickReminderSettingIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }
    public boolean ClickFutureTaskMoreInfoIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            WebElement elmntPrescriptionIconData = waitForElement(By.xpath(ClickFutureTaskInfoIconTableData
                            .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>>elmntPrescriptionIconData"+elmntPrescriptionIconData);
            waitForSeconds(2);
//            jsScrollIntoView(elmntPrescriptionIconData);
//            jsScrollUp();
            waitForElementClickable(elmntPrescriptionIconData);
            jsClick(elmntPrescriptionIconData);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult =true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditFutureTaskTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(ClickFutureTaskEditIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeleteFutureTaskTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(ClickFutureTaskDeleteIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            waitForElementClickable(elmntBloodPressureTableData);
            jsClick(elmntBloodPressureTableData);
            waitForSeconds(3);
            waitForElementClickable(btnBloodPressureyes);
            jsClick(btnBloodPressureyes);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeletePreviousTaskTableData(String lstDetails) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>"+lstDetails);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(ClickFutureTaskDeleteIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>"+elmntBloodPressureTableData);
            waitForSeconds(3);
            waitForElementClickable(elmntBloodPressureTableData);
            jsClick(elmntBloodPressureTableData);
            waitForSeconds(3);
            waitForElementClickable(btnBloodPressureyes);
            jsClick(btnBloodPressureyes);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void enterAddTaskEndTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntEndDate);
            waitForElement(elmntEndDate);
            jsClick(elmntEndDate);
            waitForSeconds(3);
            waitForElement(elmntMonthAndYear);
            waitForElementClickable(elmntMonthAndYear);
            jsClick(elmntMonthAndYear);


            String date = getDayAfterTommorrowDate("d");
            String month = getDayAfterTommorrowDate("MMM").toUpperCase();
            String year = getDayAfterTommorrowDate("YYYY");

            System.out.println("getDayAfterTomorrowDate >>> :: " + date);
            System.out.println("getDayAfterTomorrowDate >>> :: " + month);
            System.out.println("getDayAfterTomorrowDate >>> :: " + year);


            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", year));
            WebElement selectYear = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", year)));

            waitForSeconds(3);
            waitForElement(selectYear);
            waitForElementClickable(selectYear);
            jsClick(selectYear);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", month));
            WebElement selectMonth = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", month)));

            waitForSeconds(3);
            waitForElement(selectMonth);
            waitForElementClickable(selectMonth);
            jsClick(selectMonth);

            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", date));
            WebElement selectDate = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", date)));

            waitForSeconds(3);
            waitForElement(selectDate);
            waitForElementClickable(selectDate);
            jsClick(selectDate);

            System.out.println("Value >>> :: " + elmntCalendar.getAttribute("value"));
            waitForElement(elmntCalendar);
            String strEnteredDate = elmntCalendar.getAttribute("value");
            System.out.println("strEnteredDate >>>> :: "+strEnteredDate);
            waitForSeconds(2);
            takeScreenshot(driver);
//            documentValidityDate = getDayAfterTommorrowDate("d MMM YYYY");
        }


    }

    public boolean ClickAddTaskSetReminderSaveButton() {
        waitForSeconds(3);
        click(getElmtSetRemindersavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean EditFutureTaskDescription(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(elmntTaskDescriptionarea);
            enterValue(elmntTaskDescriptionarea, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntTaskDescriptionarea);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean ClickAddAnotherTaskSaveButton() {
        waitForSeconds(3);
        click(getElmtAddAnotherTasksavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        jsScrollIntoView(getElmtAddTaskcancelbutton);
        jsClick(getElmtAddTaskcancelbutton);
        waitForSeconds(3);
        return verifyElement(elmtsgoaltracking);
    }

    public boolean ClickPreviousTaskReminderSettingIconTableData(String lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            jsClick(elmtsPreviousTask);
            waitForSeconds(3);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails" + lstDetails);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(ClickReminderSettingIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.concat(strExecutionID)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            waitForSeconds(2);
            jsClick(elmntPrescriptionTableData);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickPreviousTaskMoreInfoIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {

            waitForSeconds(3);
            jsClick(elmtsPreviousTask);
            System.out.println(">>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            WebElement elmntPrescriptionIconData = waitForElement(By.xpath(ClickFutureTaskInfoIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            System.out.println(">>>>>>>>>>>>elmntPrescriptionIconData"+elmntPrescriptionIconData);
            waitForElementClickable(elmntPrescriptionIconData);
            jsClick(elmntPrescriptionIconData);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult =true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditPreviousTaskTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            click(elmtsPreviousTask);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(ClickFutureTaskEditIconTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            blResult = verifyElement(elmtsgoaltracking);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickDeletePreviousTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            click(elmtsPreviousTask);
//            List<String>strdata=TestDataUtil.getListOfValue(lstDetails);
            System.out.println(">>>>>>>>>>>>>>>>>>lstDetails"+lstDetails);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeleteGoalTrackingTableData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

}

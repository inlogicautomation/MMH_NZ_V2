package Sanity_Patient_Web.pages;

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

import java.util.List;

import static cap.utilities.DateUtil.getDate;
import static cap.utilities.SharedDriver.strExecutionID;

public class ViewJournal extends BasePage {
    public ViewJournal(WebDriver driver) {super(driver);
    }
    public static String viewjournalNotesName = "";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Health Tools')]")
    protected WebElement elmtHealthTools;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Journal')]")
    protected WebElement elmtViewJournal;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Goal Tracking')]")
    protected WebElement elmtgoaltracking;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Goal Tracking')]")
    protected WebElement elmtGoalTracking;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'ADD journal ')]")
    protected WebElement elmtAddJournal;
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Journal')]")
    protected WebElement elmtsViewJournal;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add Journal')]")
    protected WebElement elmtsAddJournal;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mat-tab-label-active')]//span[text()='ALL']")
    protected WebElement elmtAlltab;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='categoryName']")
    protected WebElement getElmntCategoryName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='remindHours']")
    protected WebElement getElmntremindhoursName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='email']")
    protected WebElement getElmntEmailName;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='time']")
    protected WebElement getElmntTime;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@formcontrolname='calendarEvent']")
    protected WebElement getElmtScheduleevent;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='privacySettings']//following::input)[1]")
    protected WebElement getElmtPrivacySetting;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='privacySettings']//following::input)[2]")
    protected WebElement getElmtShareProviderSetting;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Save')]//parent::button")
    protected WebElement getElmtsavebutton;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='subject']")
    protected WebElement elmntSubjectName;

    protected String elmntHealthIndicatorDrop = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntTimeDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='notes']")
    protected WebElement elmntNotes;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='date']//following::button)[1]")
    protected WebElement elmntDate;

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[1]")
    protected WebElement elmntDownArrow;

    @FindBy(how = How.XPATH, using = "(//span[@role='listbox'])[2]")
    protected WebElement elmntDownArrow1;

    protected String strviewjournalContentLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']//following::td//span[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td[text()='")
            .append("<<REPLACEMENT4>>").append("']").toString();
    //td[contains(text(),'31-Aug-2022')]/following-sibling::td[text()='TestSubject-SBVEBXXJ']//following::td//span[contains(text(),'Diet')]//following::td[text()='Private']

    protected String strviewjournalMoreInfoIconContentLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]/following-sibling::td[text()='")
            .append("<<REPLACEMENT2>>").append("']//following::td//span[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td[text()='")
            .append("<<REPLACEMENT4>>").append("']//following::button[@mattooltip='More Info']").toString();
    //td[contains(text(),'30-Aug-2022')]//following::td[contains(text(),'test')]//following::td//span[contains(text(),'Diet')]//following::td[contains(text(),'Private')]//following::button[@mattooltip='More Info']

    protected String strPrescriptionsDetails = new StringBuilder()
            .append("//div[@class='tbl-th']/following::div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
    protected WebElement elmntIcon;

    protected String strEditjournalContentLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td//following::td//following::td//following::button[@mattooltip='Edit']").toString();

    //td[contains(text(),'31-Aug-2022')]//following-sibling::td[contains(text(),'TestSubject-TCVXYCWR')]//following::td//following::td//following::td//following::button[@mattooltip='Edit']
    protected String strDeletejournalContentLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following-sibling::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td//following::td//following::button[@mattooltip='Delete']").toString();
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnEditBloodPressureSave;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Update')]")
    protected WebElement btnEditviewjournalSave;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')] ")
    protected WebElement btnBloodPressureyes;

    protected String elmntVerifyDelete = new StringBuilder().append("//td[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();
    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(4);
        jsScrollIntoView(elmntDashBoard);
//        waitForElementDisappear(driver,elmntLoadingSpinner);
//        waitForSeconds(4);
        waitForElement(elmntDashBoard);
        jsClick(elmntDashBoard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(8);
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickViewJournal() {
        waitForSeconds(4);
        waitForElement(elmtViewJournal);
        click(elmtViewJournal);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        return verifyElement(elmtsViewJournal);

    }



    public boolean clickADDJournal() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(4);
        waitForElement(elmtAddJournal);
        click(elmtAddJournal);
        waitForSeconds(3);
        return verifyElement(elmtsAddJournal);
    }




    public boolean clickMyHealthToolsOptionFromMenu() {
        boolean blResult = false;

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(elmtHealthTools);
            click(elmtHealthTools);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtGoalTracking);
            waitForElement(elmtGoalTracking);
            blResult = verifyElement(elmtGoalTracking);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(elmtHealthTools);
            click(elmtHealthTools);
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            blResult = verifyElement(btnMobileMenu);

        }
        return blResult;
    }
    public boolean selectCategoryName(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntCategoryName);
            waitForSeconds(2);
            jsClick(getElmntCategoryName);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            blResult = verifyElement(getElmntCategoryName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterSubjectName(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            viewjournalNotesName = strConditionName.concat(strExecutionID);
            waitForElementClickable(elmntSubjectName);
            enterValue(elmntSubjectName, viewjournalNotesName);
            isVerified = verifyElement(elmntSubjectName);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean enterNotes(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            viewjournalNotesName = strConditionName.concat(strExecutionID);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementClickable(elmntNotes);
            enterValue(elmntNotes, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntNotes);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public boolean EditNotes(String strConditionName) {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
//            viewjournalNotesName = strConditionName.concat(strExecutionID);
            waitForSeconds(3);
            waitForElementClickable(elmntNotes);
            enterValue(elmntNotes, strConditionName);
            waitForSeconds(3);
            isVerified = verifyElement(elmntNotes);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {


        }
        return isVerified;
    }

    public void enterviewJournalDateTaken() {

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntDate);
            click(elmntDate);
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
    public boolean selectTime(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntTime);
            waitForSeconds(2);
            jsClick(getElmntTime);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntTimeDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public void checkScheduleevent() {
        waitForSeconds(3);
        click(getElmtScheduleevent);

    }

    public void checkPrivacySetting() {
        waitForSeconds(3);
        jsClick(getElmtPrivacySetting);

    }

    public void checkShareProviderSetting() {
        waitForSeconds(3);
        click(getElmtShareProviderSetting);

    }
    public void ClickSaveButton() {
        waitForSeconds(3);
        click(getElmtsavebutton);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

    }
    public boolean selectremindme(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntremindhoursName);
            waitForSeconds(2);
            jsClick(getElmntremindhoursName);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthIndicatorDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntremindhoursName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectEmail(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(getElmntEmailName);
            waitForSeconds(2);
            jsClick(getElmntEmailName);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntTimeDrop.replace("<<REPLACEMENT>>", strFamilyMember)));
            jsClick(elmntEntriesFromHealthCentre);
            blResult = verifyElement(getElmntEmailName);
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
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        jsScrollIntoView(elmntDownArrow1);
        waitForElement(elmntDownArrow1);
        jsClick(elmntDownArrow1);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ARROW_DOWN);
        elmntDownArrow1.sendKeys(Keys.ENTER);
        return verifyElement(elmntDownArrow1);
    }

    public static void main(String[] args) {
        String TommorowDate=getDate("TOMORROW","dd-MMM-yyyy");
        System.out.println(TommorowDate);

    }
    public boolean VerifyviewjournalTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            String TomorrowDate=getDate("TOMORROW","dd-MMM-yyyy");
            System.out.println(TomorrowDate);
            WebElement elmntPrescriptionTableData = waitForElement(By.xpath(strviewjournalContentLocator
                    .replace("<<REPLACEMENT1>>",TomorrowDate )
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(2)))));
            waitForElement(elmntPrescriptionTableData);
            verifyElement(elmntPrescriptionTableData);
            blResult = verifyElement(elmtsViewJournal);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickviewjournalMoreInfoIcon(List<String> lstDetails, List<String> lstDetails1) {
        boolean blResult = false;
        try {

            String TomorrowDate=getDate("TOMORROW","dd-MMM-yyyy");
            System.out.println(TomorrowDate);
            WebElement elmntPrescriptionIconData = waitForElement(By.xpath(strviewjournalMoreInfoIconContentLocator
                    .replace("<<REPLACEMENT1>>",TomorrowDate)
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(0).concat(strExecutionID)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(2)))));
            waitForElementClickable(elmntPrescriptionIconData);
            jsClick(elmntPrescriptionIconData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String str : lstDetails1) {
                WebElement elmntPaitientDetails = waitForElement(By.xpath(strPrescriptionsDetails.replace("<<REPLACEMENT>>", str)));
                verifyElement(elmntPaitientDetails);
            }
            waitForElementClickable(elmntIcon);
            jsClick(elmntIcon);
            blResult = verifyElement(elmtsViewJournal);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean ClickEditViewJournalTableData(String lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            String TomorrowDate=getDate("TOMORROW","dd-MMM-yyyy");
            System.out.println(TomorrowDate);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strEditjournalContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(TomorrowDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails).concat(strExecutionID))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult =true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickEditSaveButton() {
        waitForSeconds(3);
        waitForElementClickable(btnEditviewjournalSave);
        jsClick(btnEditviewjournalSave);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmtsViewJournal);
        return verifyElement(elmtsViewJournal);

    }

    public boolean ClickDeleteViewJournalTableData(String lstDetails) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String TomorrowDate=getDate("TOMORROW","dd-MMM-yyyy");
            System.out.println(TomorrowDate);
            WebElement elmntBloodPressureTableData = waitForElement(By.xpath(strDeletejournalContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(TomorrowDate))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails).concat(strExecutionID))));
            waitForElementClickable(elmntBloodPressureTableData);
            waitForSeconds(3);
            jsClick(elmntBloodPressureTableData);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult =true;
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
        waitForElement(elmtsViewJournal);
        return verifyElement(elmtsViewJournal);
    }
    public boolean verifyDeletedRecord() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(8);
        System.out.println(viewjournalNotesName);
        waitForInvisibility(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", viewjournalNotesName)));
        return notVerifyElement(By.xpath(elmntVerifyDelete.replace("<<REPLACEMENT>>", viewjournalNotesName)));
    }




}

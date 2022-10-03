package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static cap.utilities.DateUtil.getCurrentDateByTimeZone;

public class ProfilesPage extends BasePage {

    public ProfilesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@mattooltip='Profile']")
    protected WebElement elmntMyProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Profile')]")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Email Address')]")
    protected WebElement elmntChangeEmailAddress;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Phone Number')]")
    protected WebElement elmntChangePhoneNumber;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Calendar')]")
    protected WebElement elmntCalendar;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Profile') or contains(text(),'View Profile')]")
    protected WebElement elmntViewOrUpdateProfile;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Health Centres')]")
    protected WebElement elmntMyHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Subscriptions')]")
    protected WebElement elmntMySubscriptions;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Emergency Contacts')]")
    protected WebElement elmntEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Access Information')]")
    protected WebElement elmntAccessInformation;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'General')]")
    protected WebElement elmntGeneral;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Categories')]")
    protected WebElement elmntCategories;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Delete']")
    protected List<WebElement> btnDeleteIcon;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Address')]")
    protected WebElement elmntChangeAddress;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Password')]")
    protected WebElement elmntChangePassword;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Change Password')]")
    protected WebElement txtChangePassword;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Profile')]")
    protected WebElement txtViewProfile;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add Category ')]")
    protected WebElement txtAddCategory;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Delete Event')]")
    protected WebElement txtDeleteEvent;

    //td[@class='ng-star-inserted currentDay']
    @FindBy(how = How.XPATH, using = "//table/tr/td[@class='ng-star-inserted currentDay' or @class='currentDay ng-star-inserted']")
    protected WebElement elmntCurrentDay;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Access Information')]")
    protected WebElement txtAccessInformation;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Subscriptions')]")
    protected WebElement txtMySubscriptions;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Health Centres')]")
    protected WebElement txtMyHealthRecords;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Calendar')]")
    protected WebElement txtCalendar;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Event')]")
    protected WebElement txtEvent;

    @FindBy(how = How.XPATH, using = "(//button[contains(text(),'Close')])[2]")
    protected WebElement btnClose;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Change Address')]")
    protected WebElement txtChangeAddress;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New Contact')]")
    protected WebElement elmntAddNewContact;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add category')]")
    protected WebElement elmntAddCategory;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Emergency Contacts')]")
    protected WebElement txtEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Calendar Settings')]")
    protected WebElement txtCalendarSettings;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Emergency Information')]")
    protected WebElement txtEmergencyInformation;

    @FindBy(how = How.XPATH, using = "//input[@value='accessed']/preceding-sibling::div")
    protected WebElement rdoBtnAccessed;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'We have notified your health centre with your profile changes.Your health centre needs to accept these changes to update on their system')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Emergency Contact updated successfully')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'New Event Saved')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Event Deleted')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Category deleted successfully')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Emergency Contact added successfully')]"),
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Category succesfully added')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Event Updated.')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'General Settings Saved')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Emergency Contact deleted successfully')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Your password Changed successfully')]")
    })
    protected WebElement successPopup;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'We have notified your health centre with your profile changes.Your health centre needs to accept these changes to update on their system')]")
    protected WebElement successPopupForPhoneNumberChanged;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Update')]")
    protected WebElement btnUpdate;


    protected String btnEventDelete = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/following::span[@title='Delete']").toString();

    //div[contains(text(),'Event-EJTXYGQC')]
    protected String elmntEventName = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//button[@aria-label='Delete']")
    protected WebElement btnEventConfirmDelete;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Current Password']")
    protected WebElement txtBoxCurrentPassword;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
    protected WebElement txtBoxWhat;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Where')]/following-sibling::div/input")
    protected WebElement txtBoxWhere;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Description')]/following::div//textarea")
    protected WebElement txtBoxDescription;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='New Password']")
    protected WebElement txtBoxNewPassword;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Confirm Password']")
    protected WebElement txtBoxConfirmPassword;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'weekview')]")
    protected WebElement elmntWeekView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'dayview')]")
    protected WebElement elmntDayView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'monthview')]")
    protected WebElement elmntMonthView;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Suburb']")
    protected WebElement txtBoxSuburb;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='City']")
    protected WebElement txtBoxCity;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Country']")
    protected WebElement txtBoxCountry;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='PostalCode']")
    protected WebElement txtBoxPostalcode;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='HomePhone']")
    protected WebElement txtBoxHomePhone;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='MobileNumber']")
    protected WebElement txtBoxMobileNumber;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='MobilePhone']")
    protected WebElement txtBoxMobilePhone;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='WorkPhone']")
    protected WebElement txtBoxWorkPhone;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='categoryName']")
    protected WebElement txtBoxCategoryName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='StreetNumberAndName']")
    protected WebElement txtBoxStreetNumberName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='StreetNumber']")
    protected WebElement txtBoxStreetNumber;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Street/Suburb/City']")
    protected WebElement txtBoxStreetSuburbCity;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='FirstName']")
    protected WebElement txtBoxFirstName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='LastName']")
    protected WebElement txtBoxLastName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Email']")
    protected WebElement txtBoxEmail;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='AHPhone']")
    protected WebElement txtBoxAHPhone;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='Relationship']")
    protected WebElement drpDownRelationship;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='categoryTheme']")
    protected WebElement drpDownCategoryTheme;

    @FindBy(how = How.XPATH, using = "//span[@role='listbox']")
    protected WebElement drpDownEventCategory;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='DateFormat']")
    protected WebElement drpDownDateFormat;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='TimeFormat']")
    protected WebElement drpDownTimeFormat;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='WeekStart']")
    protected WebElement drpDownWeekStart;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='DefaultView']")
    protected WebElement drpDownDefaultView;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='CustomViewDayNumber']")
    protected WebElement drpDownCustomViewDayNumber;

    @FindBy(how = How.XPATH, using = "//div[@class='password-contain-info']/mat-label")
    protected List<WebElement> labelPassword;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Contact')]")
    protected WebElement btnAddContact;

    @FindBy(how = How.XPATH, using = "//mat-error[contains(text(),'Password entered does not match with the New Password.')]")
    protected WebElement elmntError;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Day')]")
    protected WebElement btnDay;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
    protected WebElement btnEventSave;

    @FindBy(how = How.XPATH, using = "//th[text()='Name']")
    protected WebElement headerName;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Delete']")
    protected WebElement btnDelete;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'All Day Event')]/ancestor::div/input")
    protected WebElement chkBoxAllDayEvent;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')]")
    protected WebElement btnYes;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Week')]")
    protected WebElement btnWeek;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Month')]")
    protected WebElement btnMonth;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'calendar settings')]")
    protected WebElement btnCalendarSettings;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[@formcontrolname='categoryShow']")
    protected WebElement chkBoxShow;

    @FindBy(how = How.XPATH, using = "//div[@class='leftside']")
    protected WebElement elmntsMenu;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'Search_cmbPractice')]")
    protected WebElement drpDownHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[@class='rounded']//a[contains(text(),'Search')]")
    protected WebElement btnSearchForPatient;

    @FindBy(how = How.XPATH, using = "//td/div/input")
    protected WebElement txtBoxPatientName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Date Recorded')]")
    protected WebElement elmntDateRecorded;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Search  Patients')]")
    protected WebElement elmntSearchPatients;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome')])[1]")
    protected WebElement txtMyHomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search Patients')]/ancestor::div[contains(@class,'breadcrumbs')]")
    protected WebElement txtBCSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Search Patients')]")
    protected WebElement txtSearchPatients;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Goals')]")
    protected WebElement elmntViewGoals;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Goal Tracking')]")
    protected WebElement txtGoalTracking;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Search Results:')]")
    protected WebElement txtSearchResults;

//    @FindBy(how = How.XPATH, using = "//mat-checkbox[@formcontrolname='categoryShow']//input")
//    protected WebElement chkBoxShow;


    protected String elmntMoreInfoEmergencyInformation = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //label[contains(text(),'Last Name First Name')]/preceding-sibling::input
    protected String searchOrder = new StringBuilder()
            .append("//label[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/preceding-sibling::input").toString();

    //div[contains(text(),'test-wqewrytyet')]
    protected String elmntCalendarEvent = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String ddlValue = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //tr[./td[contains(text(),'15 Sep 2022')]][./td[contains(text(),'Goals')]][./td[contains(text(),'Dr Paul Anderson')]]
    protected String verifyAccessRecords = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<DATE>>")
            .append("')]][./td[contains(text(),'")
            .append("<<NAME>>")
            .append("')]][./td[contains(text(),'")
            .append("<<DOCTOR>>")
            .append("')]]").toString();

    //mat-option//span[contains(text(),'Week')]
    protected String ddlGeneralSetting = new StringBuilder()
            .append("//mat-option//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String ddlSetting = new StringBuilder()
            .append("//mat-select//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String ddlTheme = new StringBuilder()
            .append("//mat-option//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String selectPatientName = new StringBuilder()
            .append("//strong[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::li")
            .toString();


    //li[contains(text(),'catedgory-qwerty')]
    protected String ddlCategory = new StringBuilder()
            .append("//li[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    //tr[./td[contains(text(),'test')]][./td[contains(text(),'green')]]
    protected String elmntCategory = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<NAME>>")
            .append("')]][./td[contains(text(),'")
            .append("<<COLOUR>>")
            .append("')]]").toString();

    //tr[./td[contains(text(),'test')]][./td[contains(text(),'green')]]
//    protected String strProvisionedProductTableLocator = new StringBuilder()
//            .append("//tr[./td[contains(text(),'")
//            .append("<<COURSEKEY>>")
//            .append("']/preceding-sibling::td[2]/a[.='")
//            .append("<<ISBN>>")
//            .append("']/parent::td/following-sibling::td[4][.='")
//            .append("<<SOURCE>>")
//            .append("']/parent::tr").toString();


    protected String elmntGridEmergencyInformation = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<FirstName>>").append("')]][./td[contains(text(),'")
            .append("<<LastName>>").append("')]][./td[contains(text(),'")
            .append("<<E-Mail>>").append("')]][./td[contains(text(),'")
            .append("<<HomePhone>>")
            .append("')]]").toString();

    //tr[./td[contains(text(),'Daisy-QWERTYY')]][./td[contains(text(),'Test-QWERTYUI')]][./td[contains(text(),'daisy@mmh-demo.com')]][./td[contains(text(),'8508250222_RANDOM')]]//button[@aria-label='More Information']//i

    protected String elmntMoreInfo = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<FirstName>>").append("')]][./td[contains(text(),'")
            .append("<<LastName>>").append("')]][./td[contains(text(),'")
            .append("<<E-Mail>>").append("')]][./td[contains(text(),'")
            .append("<<HomePhone>>")
            .append("')]]//button[@aria-label='More Information']//i").toString();

    public boolean navigateToMyProfile() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(elmntMyProfile);
            waitForElementClickable(elmntMyProfile);
            waitAndClick(elmntMyProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntProfile);
            blResult = verifyElement(elmntProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            System.out.println("Failed to Navigate My Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToCalendar() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntCalendar);
            waitForElementClickable(elmntCalendar);
            waitAndClick(elmntCalendar);
            waitForElement(txtCalendar);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtCalendar);
        } catch (Exception e) {
            System.out.println("Failed to Navigate Calendar >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickUpdateButton() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnUpdate);
            waitForElementClickable(btnUpdate);
            waitAndClick(btnUpdate);
            waitForElement(successPopup);
            blResult = verifyElement(successPopup);
        } catch (Exception e) {
            System.out.println("Failed to Navigate My Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPasswordSuccess() {
        waitForElement(successPopup);
        return verifyElement(successPopup);
    }

    public boolean clickSaveButton() {
        waitForElement(btnSave);
        waitForElementClickable(btnSave);
        waitAndClick(btnSave);
        waitForElement(successPopup);
        return verifyElement(successPopup);
    }

    public boolean verifyAddressSuccess() {
        waitForElement(successPopup);
        return verifyElement(successPopup);
    }

    public boolean clickMoreInfoClose() {
        waitForElement(btnClose);
        waitForElementClickable(btnClose);
        waitAndClick(btnClose);
        return verifyElement(txtEmergencyContacts);
    }

    public boolean verifyPhoneNumberSuccess() {
        waitForElement(successPopup);

        return verifyElement(successPopup);

    }

    public boolean clickEmergencyContacts() {
        waitForElement(elmntAddNewContact);
        waitForElementClickable(elmntAddNewContact);
        waitAndClick(elmntAddNewContact);
        return verifyElement(txtEmergencyContacts);
    }

    public boolean clickAddContactButton() {
        waitForElement(btnAddContact);
        waitForElementClickable(btnAddContact);
        waitAndClick(btnAddContact);
        waitForSeconds(1);
        waitForElement(successPopup);
        return verifyElement(successPopup);
    }

    public boolean clickGeneral() {
        waitForElement(txtCalendarSettings);
        waitForElement(elmntGeneral);
        waitForElementClickable(elmntGeneral);
        waitAndClick(elmntGeneral);
        waitForElement(btnSave);
        return verifyElement(btnSave);
    }

    public boolean openEventPage() {
        waitForElement(txtCalendar);
        waitForElement(elmntCurrentDay);
        waitForElementClickable(elmntCurrentDay);
        doubleClick(driver, elmntCurrentDay);
        waitForSeconds(2);
        waitForElement(txtEvent);
        return verifyElement(txtEvent);
    }

    public boolean clickEventSaveButton() {
        waitForElement(txtEvent);
        waitForElement(btnEventSave);
        waitForElementClickable(btnEventSave);
        waitAndClick(btnEventSave);
        waitForSeconds(2);
        waitForElement(successPopup);
        return verifyElement(successPopup);
    }

    public boolean clickCategories() {
        waitForElement(txtCalendarSettings);
        waitForElement(elmntCategories);
        waitForElementClickable(elmntCategories);
        waitAndClick(elmntCategories);
        waitForSeconds(2);
        waitForElement(headerName);
        return headerName.isDisplayed();
    }
    public boolean deleteAllCategories() {
        waitForElement(elmntAddCategory);
        try {
            waitForElements(btnDeleteIcon);
            for (WebElement delete: btnDeleteIcon) {
                waitForSeconds(2);
                waitForElement(delete);
                waitForElementClickable(delete);
                waitAndClick(delete);
                waitForSeconds(1);
                waitForElement(btnYes);
                waitForSeconds(1);
                waitForElementClickable(btnYes);
                waitForSeconds(1);
                waitAndClick(btnYes);

                waitForElement(successPopup);
                waitForSeconds(3);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public boolean deleteAllEmergencyContact() {
        waitForElement(txtEmergencyContacts);
        try {
            waitForElements(btnDeleteIcon);
            for (WebElement delete: btnDeleteIcon) {
                waitForSeconds(2);
                waitForElement(delete);
                waitForElementClickable(delete);
                waitAndClick(delete);
                waitForSeconds(1);
                waitForElement(btnYes);
                waitForSeconds(1);
                waitForElementClickable(btnYes);
                waitForSeconds(1);
                waitAndClick(btnYes);

                waitForElement(successPopup);
                waitForSeconds(3);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean clickAddCategoryButton() {
        waitForElement(txtCalendarSettings);
        waitForElement(elmntAddCategory);
        waitForElementClickable(elmntAddCategory);
        waitAndClick(elmntAddCategory);
        waitForElement(txtAddCategory);
        return txtAddCategory.isDisplayed();
    }

    public boolean addCategory(String strDetails) {
        boolean blResult = false;
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails 1 >>> :: " + lstDetails);
        try {
            waitForElement(txtBoxCategoryName);
            waitForElementClickable(txtBoxCategoryName);
            enterValue(txtBoxCategoryName, TestDataUtil.getValue(lstDetails.get(0)));

            waitForElement(drpDownCategoryTheme);
            waitForElementClickable(drpDownCategoryTheme);
            waitAndClick(drpDownCategoryTheme);

            String strTheme = TestDataUtil.getValue(lstDetails.get(1));
            WebElement theme = waitForElement(By.xpath(ddlTheme.replace("<<REPLACEMENT>>", strTheme)));
            waitForElement(theme);
            waitForElementClickable(theme);
            waitAndClick(theme);

            waitForElement(chkBoxShow);
            if (!chkBoxShow.isSelected()) {
                waitForElementClickable(chkBoxShow);
                waitAndClick(chkBoxShow);
            }
            takeScreenshotSanity(driver);
            blResult = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyAddedContactDetailsInGrid(String strDetails) {

        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);

        boolean isVerified = false;
        try {
            waitForElement(txtEmergencyContacts);
            System.out.println("\nX-Path for Grid Emergency Information >>> :: " + elmntGridEmergencyInformation
                    .replace("<<FirstName>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<LastName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<E-Mail>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<HomePhone>>", TestDataUtil.getValue(lstDetails.get(3))));

            WebElement contactDetails = waitForElement(By.xpath(elmntGridEmergencyInformation
                    .replace("<<FirstName>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<LastName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<E-Mail>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<HomePhone>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(contactDetails);
            takeScreenshotSanity(driver);
            isVerified = verifyElement(contactDetails);
            System.out.println("\nFailed to verify Added Grid Contact Details >>> ::");
        } catch (Exception e) {
            System.out.println("\nFailed to verify Added Grid Contact Details >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean verifyAddedMoreInfoContactDetails(String strDetails, String strMoreInfoDetails) {

        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);

        List<String> lstMoreInfoDetails = TestDataUtil.getListOfValue(strMoreInfoDetails);
        System.out.println("lstDetails >>> :: " + lstMoreInfoDetails);

        boolean isVerified = false;
        try {
            waitForElement(txtEmergencyContacts);
            System.out.println("\nX-Path for More Info >>> :: " + elmntMoreInfo
                    .replace("<<FirstName>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<LastName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<E-Mail>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<HomePhone>>", TestDataUtil.getValue(lstDetails.get(3))));

            WebElement moreInfo = waitForElement(By.xpath(elmntMoreInfo
                    .replace("<<FirstName>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<LastName>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<E-Mail>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<HomePhone>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForElement(moreInfo);
            waitForElementClickable(moreInfo);
            waitAndClick(moreInfo);
            waitForSeconds(2);
            waitForElement(txtEmergencyInformation);

            for (String strDetail : lstMoreInfoDetails) {
                System.out.println("X-Path for MoreInfoEmergencyInformation" + elmntMoreInfoEmergencyInformation
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetail)));
                WebElement contactDetails = waitForElement(By.xpath(elmntMoreInfoEmergencyInformation
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetail))));

                waitForElement(contactDetails);
                if (!verifyElement(contactDetails)) {
                    System.out.println("Failed to verify >>> :: ");
                    waitForElement(btnClose);
                    waitForElementClickable(btnClose);
                    waitAndClick(btnClose);
                    return isVerified;
                }

            }
            takeScreenshotSanity(driver);
            waitForElement(btnClose);
            waitForElementClickable(btnClose);
            waitAndClick(btnClose);
            isVerified = true;
            System.out.println("\nFailed to verify Added More Info Contact Details >>> ::");
        } catch (Exception e) {
            System.out.println("\nFailed to verify Added More Info Contact Details >>> ::");
            e.printStackTrace();
        }
        return isVerified;
    }

    public void upDatePasswordToTestData(String strNewPassword) {
        TestDataUtil.updateData("config/testdata/testdata.xlsx", "MMH_SANITY", "PASSWORD_FOR_PROFILE", strNewPassword);
    }

    public boolean mouseOverProfile() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntProfile);
            waitForElementClickable(elmntProfile);
            mouseOver(elmntProfile);

            waitForElement(elmntChangePassword);
            blResult = verifyElement(elmntChangePassword);
        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToChangePassword() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntChangePassword);
            waitForElementClickable(elmntChangePassword);
            waitAndClick(elmntChangePassword);
            waitForElement(txtChangePassword);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtChangePassword);
        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile Change Password >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToChangeAddress() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntChangeAddress);
            waitForElementClickable(elmntChangeAddress);
            waitAndClick(elmntChangeAddress);
            waitForElement(txtChangeAddress);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtChangeAddress);
            System.out.println("Successfully Navigate to Profile Change Address >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile Change Address >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToChangePhoneNumber() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntChangePhoneNumber);
            waitForElementClickable(elmntChangePhoneNumber);
            waitAndClick(elmntChangePhoneNumber);
            waitForElement(txtChangeAddress);
            jsScrollIntoView(txtBoxHomePhone);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtChangeAddress);
            System.out.println("Successfully Navigate to Profile Change Phone number >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile Change phone number >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMyHealthCentres() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntViewOrUpdateProfile);
            waitForElementClickable(elmntViewOrUpdateProfile);
            waitAndClick(elmntViewOrUpdateProfile);
            waitForElement(elmntMyHealthCentre);
            waitForElementClickable(elmntMyHealthCentre);
            waitAndClick(elmntMyHealthCentre);
            waitForElement(txtMyHealthRecords);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtMyHealthRecords);
            System.out.println("Successfully Navigate to My Health Centres >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate My Health Centres >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMySubscriptions() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntViewOrUpdateProfile);
            waitForElementClickable(elmntViewOrUpdateProfile);
            waitAndClick(elmntViewOrUpdateProfile);
            waitForElement(elmntMySubscriptions);
            waitForElementClickable(elmntMySubscriptions);
            waitAndClick(elmntMySubscriptions);
            waitForElement(txtMySubscriptions);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtMySubscriptions);
            System.out.println("Successfully Navigate to My Subscriptions >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate My Subscriptions >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToAccessInformation() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntViewOrUpdateProfile);
            waitForElementClickable(elmntViewOrUpdateProfile);
            waitAndClick(elmntViewOrUpdateProfile);
            waitForElement(elmntAccessInformation);
            waitForElementClickable(elmntAccessInformation);
            waitAndClick(elmntAccessInformation);
            waitForElement(txtAccessInformation);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtAccessInformation);
            System.out.println("Successfully Navigate to My Subscriptions >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate My Subscriptions >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToEmergencyContacts() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntViewOrUpdateProfile);
            waitForElementClickable(elmntViewOrUpdateProfile);
            waitAndClick(elmntViewOrUpdateProfile);
            waitForElement(elmntEmergencyContacts);
            waitForElementClickable(elmntEmergencyContacts);
            waitAndClick(elmntEmergencyContacts);
            waitForElement(txtEmergencyContacts);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtEmergencyContacts);
            System.out.println("Successfully Navigate to Emergency Contacts >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate Emergency Contacts >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToViewProfile() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntViewOrUpdateProfile);
            waitForElementClickable(elmntViewOrUpdateProfile);
            waitAndClick(elmntViewOrUpdateProfile);
            waitForElement(txtViewProfile);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtViewProfile);
            System.out.println("Successfully Navigate to view Profile >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to Navigate view Profile>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterNewPassword(String strNewPassword) {
        boolean blResult = false;
        try {
            String newPassword = TestDataUtil.getValue(strNewPassword);

            System.out.println("strNewPassword >>> :: " + newPassword);
            waitForSeconds(2);
            waitForElement(txtChangePassword);
            waitForElement(txtBoxNewPassword);
            waitForElementClickable(txtBoxNewPassword);
            enterValue(txtBoxNewPassword, newPassword);
            for (WebElement element : labelPassword) {
                String value = element.getAttribute("style");
                System.out.println("value >>> :: " + value);
                if (!value.equalsIgnoreCase("color: green;")) {
                    System.out.println("Failed due to Attribute value");
                    takeScreenshotSanity(driver);
                    return blResult;
                }
            }

            jsScrollIntoView(txtBoxConfirmPassword);
            waitForElement(txtBoxConfirmPassword);
            waitForElementClickable(txtBoxConfirmPassword);
            enterValue(txtBoxConfirmPassword, newPassword);
            takeScreenshotSanity(driver);
            waitForSeconds(2);
            if (!verifyElement(elmntError)) {
                System.out.println("upDatePasswordToTestData >>> :: " + newPassword);
                upDatePasswordToTestData(newPassword);
                blResult = true;
            }
        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile Change Password >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterCurrentPassword(String strCurrentPassword) {
        boolean blResult = false;
        try {

            System.out.println("strCurrentPassword >>> :: " + strCurrentPassword);
            waitForSeconds(2);
            waitForElement(txtChangePassword);

            waitForElement(txtBoxCurrentPassword);
            waitForElementClickable(txtBoxCurrentPassword);
            enterValue(txtBoxCurrentPassword, strCurrentPassword);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Navigate Profile Change Password >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterEventDetails(String strDetails) {
        boolean blResult = false;
        try {

            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails >>> :: " + lstDetails);
            waitForSeconds(2);
            waitForElement(txtEvent);

            String strWhat = TestDataUtil.getValue(lstDetails.get(0));
            System.out.println("strWhat >>> :: " + strWhat);
            waitForElement(txtBoxWhat);
            waitForElementClickable(txtBoxWhat);
            enterValue(txtBoxWhat, strWhat);

            waitForElement(drpDownEventCategory);
            waitForElementClickable(drpDownEventCategory);
            waitAndClick(drpDownEventCategory);
            waitForSeconds(3);

            String strCategory = TestDataUtil.getValue(lstDetails.get(1));
            System.out.println("X-Path for category list value >>> :: " + ddlCategory
                    .replace("<<REPLACEMENT>>", strCategory));

            WebElement category = waitForElement(By.xpath(ddlCategory
                    .replace("<<REPLACEMENT>>", strCategory)));

            waitForElement(category);
            waitForElementClickable(category);
            takeScreenshotSanity(driver);
            waitAndClick(category);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Enter Event Details >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean editEventDetails(String strDetails) {
        boolean blResult = false;
        try {

            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails >>> :: " + lstDetails);
            waitForSeconds(2);
            waitForElement(txtCalendar);

            WebElement name = waitForElement(By.xpath(elmntEventName
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))));

            System.out.println("X-Path for delete pop up >>> :: " + elmntEventName
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0))));

            waitForElementClickable(name);
            doubleClick(driver, name);


            String strWhat = TestDataUtil.getValue(lstDetails.get(0));
            System.out.println("strWhat >>> :: " + strWhat);
            waitForElement(txtBoxWhat);
            waitForElementClickable(txtBoxWhat);
            enterValue(txtBoxWhat, strWhat);

            waitForElement(drpDownEventCategory);
            waitForElementClickable(drpDownEventCategory);
            waitAndClick(drpDownEventCategory);
            waitForSeconds(3);

            String strCategory = TestDataUtil.getValue(lstDetails.get(1));
            System.out.println("X-Path for category list value >>> :: " + ddlCategory
                    .replace("<<REPLACEMENT>>", strCategory));

            WebElement category = waitForElement(By.xpath(ddlCategory
                    .replace("<<REPLACEMENT>>", strCategory)));

            waitForElement(category);
            waitForElementClickable(category);
            takeScreenshotSanity(driver);
            waitAndClick(category);

            String strWhere = TestDataUtil.getValue(lstDetails.get(2));
            System.out.println("strWhat >>> :: " + strWhat);
            waitForElement(txtBoxWhere);
            waitForElementClickable(txtBoxWhere);
            enterValue(txtBoxWhere, strWhere);

            String strDescription = TestDataUtil.getValue(lstDetails.get(3));
            System.out.println("strWhat >>> :: " + strDescription);
            waitForElement(txtBoxDescription);
            waitForElementClickable(txtBoxDescription);
            enterValue(txtBoxDescription, strDescription);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to Enter Event Details >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean deleteCreatedEvent(String strDetails) {
        boolean blResult = false;
        try {

            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails >>> :: " + lstDetails);
            waitForSeconds(2);
            waitForElement(txtCalendar);

            WebElement name = waitForElement(By.xpath(elmntEventName
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))));

            System.out.println("X-Path for delete pop up >>> :: " + elmntEventName
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0))));

            mouseOver(name);

            waitForSeconds(2);

            System.out.println("X-Path for elmnt eName >>> :: " + btnEventDelete
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0))));

            WebElement deletePopup = waitForElement(By.xpath(btnEventDelete
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))));

            waitForElement(deletePopup);
            waitAndClick(deletePopup);
            waitForElement(txtDeleteEvent);
            waitForElement(btnEventConfirmDelete);
            waitForElementClickable(btnEventConfirmDelete);
            waitAndClick(btnEventConfirmDelete);
            waitForElement(successPopup);
            takeScreenshotSanity(driver);
            blResult = verifyElement(successPopup);

        } catch (Exception e) {
            System.out.println("Failed to Enter Event Details >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyCreatedEvent(String strDetails) {
        boolean blResult = false;
        try {

            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails >>> :: " + lstDetails);
            waitForSeconds(2);
            waitForElement(txtCalendar);
            System.out.println("X-Path for Event name >>> :: " + elmntCalendarEvent
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0))));

            WebElement eventName = waitForElement(By.xpath(elmntCalendarEvent
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))));

            waitForElement(eventName);
            takeScreenshotSanity(driver);
            blResult = verifyElement(eventName);

        } catch (Exception e) {
            System.out.println("Failed to verify event name >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterNewAddress(String strNewAddress) {
        boolean blResult = false;
        try {
            List<String> lstNewAddress = TestDataUtil.getListOfValue(strNewAddress);
            System.out.println("StreetNumberName >>> :: " + TestDataUtil.getValue(lstNewAddress.get(0)));
            System.out.println("Suburb >>> :: " + TestDataUtil.getValue(lstNewAddress.get(1)));
            System.out.println("City >>> :: " + TestDataUtil.getValue(lstNewAddress.get(2)));
            System.out.println("Country >>> :: " + TestDataUtil.getValue(lstNewAddress.get(3)));
            System.out.println("Postal code >>> :: " + TestDataUtil.getValue(lstNewAddress.get(4)));
            waitForSeconds(2);
            waitForElement(txtChangeAddress);

            waitForElement(txtBoxStreetNumberName);
            waitForElementClickable(txtBoxStreetNumberName);
            enterValue(txtBoxStreetNumberName, TestDataUtil.getValue(lstNewAddress.get(0)));

            waitForElement(txtBoxSuburb);
            waitForElementClickable(txtBoxSuburb);
            enterValue(txtBoxSuburb, TestDataUtil.getValue(lstNewAddress.get(1)));

            waitForElement(txtBoxCity);
            waitForElementClickable(txtBoxCity);
            enterValue(txtBoxCity, TestDataUtil.getValue(lstNewAddress.get(2)));

            waitForElement(txtBoxCountry);
            waitForElementClickable(txtBoxCountry);
            enterValue(txtBoxCountry, TestDataUtil.getValue(lstNewAddress.get(3)));

            waitForElement(txtBoxPostalcode);
            waitForElementClickable(txtBoxPostalcode);
            enterValue(txtBoxPostalcode, TestDataUtil.getValue(lstNewAddress.get(4)));

            takeScreenshotSanity(driver);

            blResult = true;
            System.out.println("Successfully entered NewAddress for Profile >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to enter NewAddress for Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterTheNewEmergencyContactDetails(String strContactDetails) {
        boolean blResult = false;
        try {
            List<String> lstNewAddress = TestDataUtil.getListOfValue(strContactDetails);

            waitForSeconds(2);
            waitForElement(txtEmergencyContacts);

            waitForElement(txtBoxFirstName);
            waitForElementClickable(txtBoxFirstName);
            System.out.println("txtBoxFirstName >>> :: " + TestDataUtil.getValue(lstNewAddress.get(0)));
            enterValue(txtBoxFirstName, TestDataUtil.getValue(lstNewAddress.get(0)));

            waitForElement(txtBoxLastName);
            waitForElementClickable(txtBoxLastName);
            System.out.println("txtBoxLastName >>> :: " + TestDataUtil.getValue(lstNewAddress.get(1)));
            enterValue(txtBoxLastName, TestDataUtil.getValue(lstNewAddress.get(1)));

            waitForElement(txtBoxEmail);
            waitForElementClickable(txtBoxEmail);
            System.out.println("txtBoxEmail >>> :: " + TestDataUtil.getValue(lstNewAddress.get(2)));
            enterValue(txtBoxEmail, TestDataUtil.getValue(lstNewAddress.get(2)));

            waitForElement(txtBoxHomePhone);
            waitForElementClickable(txtBoxHomePhone);
            System.out.println("txtBoxHomePhone >>> :: " + TestDataUtil.getValue(lstNewAddress.get(3)));
            enterValue(txtBoxHomePhone, TestDataUtil.getValue(lstNewAddress.get(3)));

            waitForElement(txtBoxMobilePhone);
            jsScrollIntoView(txtBoxMobilePhone);
            waitForElementClickable(txtBoxMobilePhone);
            System.out.println("txtBoxMobileNumber >>> :: " + TestDataUtil.getValue(lstNewAddress.get(4)));
            enterValue(txtBoxMobilePhone, TestDataUtil.getValue(lstNewAddress.get(4)));

            waitForElement(txtBoxWorkPhone);
            waitForElementClickable(txtBoxWorkPhone);
            System.out.println("txtBoxWorkPhone >>> :: " + TestDataUtil.getValue(lstNewAddress.get(5)));
            enterValue(txtBoxWorkPhone, TestDataUtil.getValue(lstNewAddress.get(5)));

            waitForElement(txtBoxAHPhone);
            waitForElementClickable(txtBoxAHPhone);
            System.out.println("txtBoxAHPhone >>> :: " + TestDataUtil.getValue(lstNewAddress.get(6)));
            enterValue(txtBoxAHPhone, TestDataUtil.getValue(lstNewAddress.get(6)));

            String strRelation = TestDataUtil.getValue(lstNewAddress.get(7));
            System.out.println("strRelation >>> :: " + strRelation);
            waitForElement(drpDownRelationship);
            waitForElementClickable(drpDownRelationship);
            waitAndClick(drpDownRelationship);
            System.out.println("X-Path for relationShip >>> ::" + ddlValue.replace("<<REPLACEMENT>>", strRelation));
            WebElement relationShip = waitForElement(By.xpath(ddlValue.replace("<<REPLACEMENT>>", strRelation)));
            waitForElementClickable(relationShip);
            waitAndClick(relationShip);

            waitForElement(txtBoxStreetNumber);
            jsScrollIntoView(txtBoxStreetNumber);
            waitForElementClickable(txtBoxStreetNumber);
            System.out.println("txtBoxStreetNumber >>> :: " + TestDataUtil.getValue(lstNewAddress.get(8)));
            enterValue(txtBoxStreetNumber, TestDataUtil.getValue(lstNewAddress.get(8)));

            waitForElement(txtBoxStreetSuburbCity);
            waitForElementClickable(txtBoxStreetSuburbCity);
            System.out.println("txtBoxStreetSuburbCity >>> :: " + TestDataUtil.getValue(lstNewAddress.get(9)));
            enterValue(txtBoxStreetSuburbCity, TestDataUtil.getValue(lstNewAddress.get(9)));

            takeScreenshotSanity(driver);

            blResult = true;
            System.out.println("Successfully entered Emergency for Profile >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to enter NewAddress for Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterNewPhoneNumber(String strNewPhoneNumber) {
        boolean blResult = false;
        try {
            List<String> lstNewNewPhoneNumber = TestDataUtil.getListOfValue(strNewPhoneNumber);
            System.out.println("HomePhone >>> :: " + TestDataUtil.getValue(lstNewNewPhoneNumber.get(0)));
            System.out.println("MobileNumber >>> :: " + TestDataUtil.getValue(lstNewNewPhoneNumber.get(1)));
            System.out.println("WorkPhone >>> :: " + TestDataUtil.getValue(lstNewNewPhoneNumber.get(2)));
            waitForSeconds(2);

            waitForElement(txtChangeAddress);

            waitForElement(txtBoxHomePhone);
            waitForElementClickable(txtBoxHomePhone);
            enterValue(txtBoxHomePhone, TestDataUtil.getValue(lstNewNewPhoneNumber.get(0)));

            waitForElement(txtBoxMobileNumber);
            waitForElementClickable(txtBoxMobileNumber);
            enterValue(txtBoxMobileNumber, TestDataUtil.getValue(lstNewNewPhoneNumber.get(1)));

            waitForElement(txtBoxWorkPhone);
            waitForElementClickable(txtBoxWorkPhone);
            enterValue(txtBoxWorkPhone, TestDataUtil.getValue(lstNewNewPhoneNumber.get(1)));


            takeScreenshotSanity(driver);

            blResult = true;
            System.out.println("Successfully entered NewAddress for Profile >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to enter NewAddress for Profile >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyTheNewAddress(String strNewAddress) {
        boolean isVerified = false;
        try {
            List<String> lstAddress = TestDataUtil.getListOfValue(strNewAddress);

            List<String> lstNewAddress = new ArrayList<>();

            lstNewAddress.add(TestDataUtil.getValue(lstAddress.get(0)));
            lstNewAddress.add(TestDataUtil.getValue(lstAddress.get(1)));
            lstNewAddress.add(TestDataUtil.getValue(lstAddress.get(2)));
            lstNewAddress.add(TestDataUtil.getValue(lstAddress.get(3)));
            lstNewAddress.add(TestDataUtil.getValue(lstAddress.get(4)));

            waitForElement(txtViewProfile);

            List<String> lstEnteredAddress = new ArrayList<>();
            lstEnteredAddress.add(txtBoxStreetNumberName.getAttribute("value"));
            lstEnteredAddress.add(txtBoxSuburb.getAttribute("value"));
            lstEnteredAddress.add(txtBoxCity.getAttribute("value"));
            lstEnteredAddress.add(txtBoxCountry.getAttribute("value"));
            lstEnteredAddress.add(txtBoxPostalcode.getAttribute("value"));


            System.out.println("lstEnteredAddress get value >>> :: " + lstEnteredAddress);

            for (String newAddress : lstNewAddress) {
                System.out.println("\nlstAddress + Entered Address >>> :: " + " -- " + newAddress);
                boolean blResult = lstEnteredAddress.contains(newAddress);

                if (!blResult) {
                    System.out.println("\nFailed to verify >>> :: ");
                    return isVerified;
                }
            }

            isVerified = true;
            System.out.println("\nSuccessfully verified The New Address >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to verify The New Address >>> :: ");
            e.printStackTrace();
        }
        return isVerified;
    }


    public boolean clickDayView() {
        boolean blResult = false;
        try {
            waitForElement(txtCalendar);
            waitForSeconds(2);
            waitForElement(btnDay);
            waitForElementClickable(btnDay);
            waitAndClick(btnDay);
            waitForSeconds(3);
            waitForElement(elmntDayView);
            takeScreenshotSanity(driver);
            blResult = verifyElement(elmntDayView);

        } catch (Exception e) {
            System.out.println("Failed to verify Day view >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickWeekView() {
        boolean blResult = false;
        try {
            waitForElement(txtCalendar);
            waitForElement(btnWeek);
            waitForElementClickable(btnWeek);
            waitAndClick(btnWeek);
            waitForElement(elmntWeekView);
            takeScreenshotSanity(driver);
            blResult = verifyElement(elmntWeekView);

        } catch (Exception e) {
            System.out.println("Failed to verify Week view >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickMonthView() {
        boolean blResult = false;
        try {
            waitForElement(txtCalendar);
            waitForElement(btnMonth);
            waitForElementClickable(btnMonth);
            waitAndClick(btnMonth);
            waitForElement(elmntMonthView);
            takeScreenshotSanity(driver);
            blResult = verifyElement(elmntMonthView);

        } catch (Exception e) {
            System.out.println("Failed to verify Month view >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToCalendarSettings() {
        boolean blResult = false;
        try {
            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(txtCalendar);
            waitForElement(btnCalendarSettings);
            waitForElementClickable(btnCalendarSettings);
            waitAndClick(btnCalendarSettings);
            waitForElement(txtCalendarSettings);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtCalendarSettings);

        } catch (Exception e) {
            System.out.println("Failed to Navigate Calendar Settings >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDateFormat(String strDateFormat) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);

            System.out.println("strRelation >>> :: " + strDateFormat);
            waitForElement(drpDownDateFormat);
            waitForElementClickable(drpDownDateFormat);
            waitAndClick(drpDownDateFormat);
            System.out.println("X-Path for strDateFormat >>> ::" + ddlGeneralSetting.replace("<<REPLACEMENT>>", strDateFormat));
            WebElement dateFormat = waitForElement(By.xpath(ddlGeneralSetting.replace("<<REPLACEMENT>>", strDateFormat)));
            waitForElementClickable(dateFormat);
            waitAndClick(dateFormat);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to select Date Format >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTimeFormat(String strTimeFormat) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);

            System.out.println("strRelation >>> :: " + strTimeFormat);
            waitForElement(drpDownTimeFormat);
            waitForElementClickable(drpDownTimeFormat);
            waitAndClick(drpDownTimeFormat);
            System.out.println("X-Path for strTimeFormat >>> ::" + ddlGeneralSetting.replace("<<REPLACEMENT>>", strTimeFormat));
            WebElement timeFormat = waitForElement(By.xpath(ddlGeneralSetting.replace("<<REPLACEMENT>>", strTimeFormat)));
            waitForElementClickable(timeFormat);
            waitAndClick(timeFormat);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to select Time Format >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectWeekStarts(String strWeekStarts) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);

            System.out.println("strRelation >>> :: " + strWeekStarts);
            waitForElement(drpDownWeekStart);
            waitForElementClickable(drpDownWeekStart);
            waitAndClick(drpDownWeekStart);
            System.out.println("X-Path for strWeekStarts >>> ::" + ddlGeneralSetting.replace("<<REPLACEMENT>>", strWeekStarts));
            WebElement WeekStarts = waitForElement(By.xpath(ddlGeneralSetting.replace("<<REPLACEMENT>>", strWeekStarts)));
            waitForElementClickable(WeekStarts);
            waitAndClick(WeekStarts);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to select Week Starts >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDefaultView(String strDefaultView) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);

            System.out.println("strDefaultView >>> :: " + strDefaultView);
            waitForElement(drpDownDefaultView);
            waitForElementClickable(drpDownDefaultView);
            waitAndClick(drpDownDefaultView);
            System.out.println("X-Path for strWeekStarts >>> ::" + ddlGeneralSetting.replace("<<REPLACEMENT>>", strDefaultView));
            WebElement DefaultView = waitForElement(By.xpath(ddlGeneralSetting.replace("<<REPLACEMENT>>", strDefaultView)));
            waitForElement(DefaultView);
            waitForElementClickable(DefaultView);
            waitAndClick(DefaultView);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to select Default View >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectCustomView(String strCustomView) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);

            System.out.println("strCustomView >>> :: " + strCustomView);
            waitForElement(drpDownCustomViewDayNumber);
            waitForElementClickable(drpDownCustomViewDayNumber);
            waitAndClick(drpDownCustomViewDayNumber);
            System.out.println("X-Path for strCustomView >>> ::" + ddlGeneralSetting.replace("<<REPLACEMENT>>", strCustomView));
            WebElement CustomView = waitForElement(By.xpath(ddlGeneralSetting.replace("<<REPLACEMENT>>", strCustomView)));
            waitForElement(CustomView);
            jsScrollIntoView(CustomView);
            waitForElementClickable(CustomView);
            waitAndClick(CustomView);

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to select Custom View >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyCalendarSetting(String strDetails) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails >>> :: " + lstDetails);

            for (String detail : lstDetails) {
                System.out.println("X-Path for Data >>> ::" + ddlSetting.replace("<<REPLACEMENT>>", detail));
                WebElement Data = waitForElement(By.xpath(ddlSetting.replace("<<REPLACEMENT>>", detail)));

                if (!verifyElement(Data)) {
                    System.out.println("verify Calendar Setting was failed >>> :: ");
                    return blResult;
                }
            }

            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to verify Calendar Setting data >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyCategories(String strDetails) {
        boolean blResult = false;
        try {
            waitForElement(txtCalendarSettings);
            List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
            System.out.println("lstDetails verifyCategories >>> :: " + lstDetails.get(0));
            System.out.println("lstDetails verifyCategories >>> :: " + lstDetails.get(1));

            System.out.println("X-Path for Data >>> :: " + elmntCategory
                    .replace("<<COLOUR>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(0))));


            WebElement Data = waitForElement(By.xpath(elmntCategory
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<COLOUR>>", TestDataUtil.getValue(lstDetails.get(2)))));

            waitForElement(Data);
            jsScrollIntoView(Data);
            takeScreenshotSanity(driver);
            blResult = verifyElement(Data);
            System.out.println("\nSuccessfully verified Categories details >>> :: ");

        } catch (Exception e) {
            System.out.println("Failed to verify Calendar categories data >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToSearchPatient() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElement(elmntSearchPatients);
            waitForElementClickable(elmntSearchPatients);
            click(elmntSearchPatients);
            waitForSeconds(1);
            waitForElement(txtBCSearchPatient);
            blResult = verifyElement(txtBCSearchPatient);
            System.out.println("Successfully navigated to the Search Patient");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the Search Patient");
        }
        return blResult;
    }

    public boolean selectHealthCenter(String strHealthCenter) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSearchPatients);
            waitForElement(drpDownHealthCentre);
            waitForElementClickable(drpDownHealthCentre);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'Search_cmbPractice')]")));
            System.out.println("strHealthCenter >>> :: "+strHealthCenter);
            healthCentre.selectByVisibleText(strHealthCenter);
            waitForSeconds(2);

            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public void SearchOrder(String strOrder) {
        waitForElement(txtSearchPatients);
        System.out.println("X-path for rdoBtn >>> :: "+searchOrder.replace("<<REPLACEMENT>>",strOrder));
        WebElement rdoBtn = waitForElement(By.xpath(searchOrder.replace("<<REPLACEMENT>>",strOrder)));
        waitForElementClickable(rdoBtn);
        waitAndClick(rdoBtn);

    }

    public void enterPatientName(String strName) {
        try {
            waitForElement(txtSearchPatients);
            waitForSeconds(3);
            txtBoxPatientName.sendKeys(strName);
            waitForSeconds(2);
            System.out.println("Xpath for Patient >>> :: " + selectPatientName.replace("<<REPLACEMENT>>", strName));
            WebElement patient = waitForElement(By.xpath(selectPatientName.replace("<<REPLACEMENT>>", strName)));
            waitForElementClickable(patient);
            waitAndClick(patient);
            waitForSeconds(1);

            System.out.println("\nSuccessfully Entered To>>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the  >>> :: ");
            e.printStackTrace();
        }

    }

    public boolean clickSearchButton() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSearchPatients);
            waitForElement(btnSearchForPatient);
            waitForElementClickable(btnSearchForPatient);
            waitAndClick(btnSearchForPatient);
            waitForSeconds(2);
            waitForElement(txtSearchResults);
            blResult = verifyElement(txtSearchResults);
            takeScreenshotSanity(driver);
            System.out.println("\nSuccessfully Clicked the Search Button >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the Search Button >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectViewGoals() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtSearchResults);

            waitForElement(elmntViewGoals);
            waitForElementClickable(elmntViewGoals);
            waitAndClick(elmntViewGoals);
            waitForSeconds(2);
            waitForElement(txtGoalTracking);
            blResult = verifyElement(txtGoalTracking);
            takeScreenshotSanity(driver);

            System.out.println("\nSuccessfully Clicked the view Goal Button >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the view Goal Button >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean verifyWhoAccessedMyRecords(String strDetail) {
        boolean blResult = false;
        try {
            List<String> lstDetail = TestDataUtil.getListOfValue(strDetail);
            System.out.println("lstDetail >>> :: "+lstDetail);
            waitForSeconds(3);
            waitForElement(txtAccessInformation);

            waitForElement(rdoBtnAccessed);
            waitForElementClickable(rdoBtnAccessed);
            waitAndClick(rdoBtnAccessed);

            waitForElement(elmntDateRecorded);
            waitForElementClickable(elmntDateRecorded);
            waitAndClick(elmntDateRecorded);
            waitForSeconds(3);
            waitForElement(elmntDateRecorded);
            waitForElementClickable(elmntDateRecorded);
            waitAndClick(elmntDateRecorded);

            String strCurrentDate = getCurrentDateByTimeZone("dd MMM YYYY", "GMT+12");

            System.out.println("Xpath for Patient >>> :: " + verifyAccessRecords
                    .replace("<<DATE>>", strCurrentDate)
                    .replace("<<NAME>>",lstDetail.get(0))
                    .replace("<<DOCTOR>>",lstDetail.get(1)));

            WebElement record = waitForElement(By.xpath(verifyAccessRecords
                    .replace("<<DATE>>", strCurrentDate)
                    .replace("<<NAME>>",lstDetail.get(0))
                    .replace("<<DOCTOR>>",lstDetail.get(1))));

            waitForSeconds(2);
            waitForElement(record);
            blResult = verifyElement(record);

            System.out.println("\nSuccessfully verified  >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to verify >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public static void main(String[] args) {
        String strCurrentDate = getCurrentDateByTimeZone("dd MMM YYYY", "GMT+12");
        System.out.println(strCurrentDate);
        String st123 ="2209-1816-4257-0088";
        StringBuffer st = new StringBuffer("2209-1816-4257-0088");
        st123.replace("-","");
        System.out.println(st123.replace("-",""));

        String input_string = "$ 12.00(NS USD)";
        String string_output=input_string.replaceAll("[A-Za-z]", "");
//        int number_output=Integer.parseInt(input_string.replaceAll("[^0-9]", ""));
        System.out.println("string_output = "+string_output);
//        System.out.println("number_output = "+number_output);
    }



}

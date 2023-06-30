package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import static Happy_Path_Patient_Web_and_MR.pages.AppointmentsPage.strSlotDate;
import static cap.utilities.DateUtil.getCurrentDate;
import static cap.utilities.DateUtil.getCurrentDateByTimeZone;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Send Message')])[2]")
    protected WebElement btnSendMessageButton;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'exit_to_app')]"),
            @FindBy(how = How.XPATH, using = "//a[contains(text(),'Log out')]")
    })
    protected WebElement elmntLogOut;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'cdk-overlay')]")
    protected WebElement elmntCovidPreScreeningPopup;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NO')]//parent::button")
    protected WebElement elmntDeclineCovidPreScreening;


    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View MESSAGES')]")
    protected WebElement elmntViewMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Link to Health Centre')]")
    protected WebElement elmntConnectHealthCentre;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'My Health Centres')])[1]")
    protected WebElement elmntMyHealthCentre;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Repeat Prescription') or contains(text(),'Request New Script')]")
    protected WebElement elmntNewRepeatPrescription;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View all indicators')]")
    protected WebElement elmntViewAllIndicators;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[contains(text(),'My Health Indicators')])[2]")
    protected WebElement elmntMyHealthIndicators;

    @FindBy(how = How.XPATH, using = "//mat-card-title[contains(text(),'Upcoming Appointments')]")
    protected WebElement elmntUpcomingAppointments;

    @FindBy(how = How.XPATH, using = "//mat-card-title[contains(text(),'New Messages')]")
    protected WebElement elmntNewMessages;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health Centres')]")
    protected WebElement elmntMyHealthCentres;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[contains(text(),'My Repeat Prescriptions')])[2]")
    protected WebElement elmntMyRepeatPrescriptions;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[contains(text(),'My Health Records')])[2]")
    protected WebElement elmntMyHealthRecords;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View health summary')]")
    protected WebElement elmntViewHealthSummary;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Book an Appointment')]")
    protected WebElement elmntBookAppointment;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Settings')]")
    protected WebElement txtSettings;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Request New Script')]")
    protected WebElement txtRequestNewScript;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'My Health Indicators')]")
    protected WebElement txtMyHealthIndicator;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'MEDICAL SUMMARY FOR AUTO')]")
    protected WebElement txtMyHealthRecords;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'page-content')]")
    protected WebElement elmntAppointmentPanel;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]")
    protected WebElement elmntWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Inbox')]")
    protected WebElement txtInboxPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Link to health centre')]")
    protected WebElement txtConnectAHealthCentre;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Health Centres')]")
    protected WebElement txtMyHealthCentresHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;


    @FindBy(how = How.XPATH, using = "//div[contains(@class,'alert-info')]")
    protected WebElement elmntUnreadMessage;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),' Previous Repeat Prescriptions')]")
    protected WebElement txtViewPreviousRequests;

    @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'close')]")
    protected WebElement btnMoreInfoClose;


//    (//h5[contains(text(),'Blood Pressure')]/following-sibling::p[contains(text(),'100/100 mmHg')])[2]


    //(//h5[contains(text(),'aP-2 3m')]/following-sibling::p[contains(text(),'08 Jun 2022 7:34 PM')])[2]/parent::div
    protected String verifyMyHealthRecords = new StringBuilder()
            .append("//h5[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/following-sibling::p[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')]")
            .toString();


    protected String verifyMyHealthIndicator = new StringBuilder()
            .append("(//h5[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/following-sibling::p[contains(text(),'")
            .append("<<REPLACEMENT1>>")
            .append("')])[2]")
            .toString();

    //(//mat-card-title[contains(text(),'My Health centres')])[2]/ancestor::mat-card-header/parent::mat-card//h5[contains(text(),'')]
    protected String verifyMyHealthCentre = new StringBuilder()
            .append("//mat-card-title[contains(text(),'My Health Centres')]/ancestor::mat-card-header/parent::mat-card//h5[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

//  (//app-dashboard-appointments)[3]//h5[contains(text(),'18 Sep 2022 | 8:15 AM')]/following-sibling::p[contains(text(),'Dr Tim')]

    protected String verifyAppointments = new StringBuilder()
            .append("//h5[contains(text(),'")
            .append("<<DATE>>")
            .append("')]/following-sibling::p[contains(text(),'")
            .append("<<NAME>>")
            .append("')]")
            .toString();

    // (//h5[contains(text(),'11 Sep 2022, Dr Paul Anderson')]/following-sibling::p[contains(text(),'Dashboard Msg Testing1-MMQWSDGI')])[2]/parent::div
    protected static String verifyDashboardMessages = new StringBuilder()
            .append("(//h5[contains(text(),'")
            .append("<<DATE>>").append(", ")
            .append("<<DOCTOR_NAME>>")
            .append("')]/following-sibling::p[contains(text(),'")
            .append("<<MESSAGE>>")
            .append("')])[1]")
            .toString();

    //(//app-dashboard-repeat-prescriptions)[2]//h5[contains(text(),'VM04Practice')]/following-sibling::p[contains(text(),'09 Sep 2022')]//span[contains(text(),'Pending')]
    protected static String verifyDashboardRRP = new StringBuilder()
            .append("(//h5[contains(text(),'")
            .append("<<LOCATION>>")
            .append("')]/following-sibling::p[contains(text(),'")
            .append("<<DATE>>")
            .append("')]//span[contains(text(),'")
            .append("<<STATUS>>").append("')])[1]")
            .toString();

    //tr[./td[contains(text(),'08 Jun 2022')]][./td[contains(text(),'aP-2 3m')]]
    protected static String verifyHealthRecord = new StringBuilder()
            .append("//tr[./td[contains(text(),'")
            .append("<<DATE>>")
            .append("')]][./td[contains(text(),'")
            .append("<<NAME>>")
            .append("')]]")
            .toString();


    public boolean navigateToRequestNewScript() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
            jsScrollIntoView(elmntNewRepeatPrescription);
            waitForElement(elmntNewRepeatPrescription);
            waitForElementClickable(elmntNewRepeatPrescription);
            waitForSeconds(2);
            waitForElement(txtRequestNewScript);
            blResult = verifyElement(txtRequestNewScript);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("Navigated To Request Medication >>>>");

        } catch (Exception e) {
            System.out.println("Failed to Navigate To Request Medication >>>>");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean navigateToNewRepeatPrescription() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
            waitForSeconds(2);
            jsScrollIntoView(elmntNewRepeatPrescription);
            waitForElement(elmntNewRepeatPrescription);
            waitForElementClickable(elmntNewRepeatPrescription);
            jsClick(elmntNewRepeatPrescription);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtRequestNewScript);
            blResult = verifyElement(txtRequestNewScript);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            System.out.println("Navigated To Request Medication >>>>");


        } catch (Exception e) {
            System.out.println("Failed to navigate To New Repeat Prescription Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean navigateToBookAppointmentPage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
//            jsScrollIntoView(elmntBookAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntBookAppointment);
            waitForElementClickable(elmntBookAppointment);
            jsClick(elmntBookAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPanel);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntAppointmentPanel);
            takeScreenshotSanity(driver);

        } catch (Exception e) {
            System.out.println("Failed to navigate To Book Appointment Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean declineCovidPreScreeningPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElementToAppear(driver,By.xpath(elmntSpinner));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (isElementDisplayed(elmntCovidPreScreeningPopup)) {
                System.out.println("Covid Prescreening popup is displayed");
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElementClickable(elmntDeclineCovidPreScreening);
                click(elmntDeclineCovidPreScreening);
            }
            if (!isElementDisplayed(elmntCovidPreScreeningPopup)){
                System.out.println("Covid Prescreening popup is not displayed");
            }
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToViewMessages() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
//            jsScrollIntoView(elmntViewMessage);
            jsScrollDown();
            waitForElement(elmntViewMessage);
//            waitForElementClickable(elmntViewMessage);
            mouseClick(elmntViewMessage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtInboxPatient);
            blResult = verifyElement(txtInboxPatient);
            takeScreenshotSanity(driver);

        } catch (Exception e) {
            System.out.println("Failed to navigate To Messages Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMyHealthCentre() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
waitForElement(elmntMyHealthCentre);
click(elmntMyHealthCentre);
            jsScrollIntoView(elmntConnectHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntConnectHealthCentre);
            jsClick(elmntConnectHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtMyHealthCentresHeader);
            blResult = verifyElement(txtMyHealthCentresHeader);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to navigate To Connect health centre Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMyHealthIndicators() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);

            jsScrollIntoView(elmntViewAllIndicators);
            waitForElement(elmntViewAllIndicators);
            waitForElementClickable(elmntViewAllIndicators);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsClick(elmntViewAllIndicators);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtMyHealthIndicator);
            blResult = verifyElement(txtMyHealthIndicator);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            takeScreenshotSanity(driver);
        } catch (Exception e) {
            System.out.println("Failed to navigate To My Health Indicators Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMyHealthRecords() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForElement(elmntWelcomeMessage);
            jsScrollIntoView(elmntViewHealthSummary);
            waitForElement(elmntViewHealthSummary);
            waitForElementClickable(elmntViewHealthSummary);
            jsClick(elmntViewHealthSummary);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(txtMyHealthRecords);
            blResult =true;
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to navigate To My Health Records Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        waitForElement(elmntDashBoard);
        click(elmntDashBoard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmntVerifyHomePage);
    }

//    public boolean verifyHomePageOfMMHPortal() {
//        waitForSeconds(5);
//        waitForElement(elmntVerifyHomePage);
//        if (verifyElement(txtAppVersion)) {
//            strAppVersion = txtAppVersion.getText();
//        }
//        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
//        strBrowserName = cap.getBrowserName();
//        strBrowserVersion = cap.getVersion();
//        try {
//            strSystemName= InetAddress.getLocalHost().getHostName();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        takeScreenshot(driver);
//        return verifyElement(elmntVerifyHomePage);
//    }

    public boolean navigateToDashboard() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
//            waitForElement(txtConnectAHealthCentre);
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            waitForElementClickable(elmntDashboard);
            jsClick(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntWelcomeMessage);
            blResult = verifyElement(elmntWelcomeMessage);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to navigate To Dashboard Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyMyHealthIndicatorEntriesInDashboard(List<String> lstValue) {

        System.out.println(lstValue);
        boolean isVerified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntMyHealthIndicators);
            waitForElement(elmntMyHealthIndicators);
            System.out.println(verifyMyHealthIndicator.replace("<<REPLACEMENT>>", lstValue.get(0)).replace("<<REPLACEMENT1>>", lstValue.get(1)));
            WebElement data = waitForElement(By.xpath(verifyMyHealthIndicator.replace("<<REPLACEMENT>>", lstValue.get(0)).replace("<<REPLACEMENT1>>", lstValue.get(1))));

            waitForElement(data);

            isVerified = verifyElement(data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to verify My Health Indicators data >>> :: ");
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean verifyMyHealthCentreInDashboard(String strValue) {

        System.out.println(strValue);
        boolean isVerified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntMyHealthCentres);
            waitForElement(elmntMyHealthCentres);
            System.out.println(verifyMyHealthCentre.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strValue)));
            WebElement data = waitForElement(By.xpath(verifyMyHealthCentre.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strValue))));

            waitForElement(data);

            isVerified = verifyElement(data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to verify My Health centre data >>> :: ");
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean verifyMessagesInDashboard(String strDetails) {
        boolean isVerified = false;
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntNewMessages);
//            String strCurrentDate = getCurrentDateByTimeZone("dd MMM YYY", "GMT+12");
            String currentDate = getCurrentDate("dd MMM yyyy");
            System.out.println("Xpath for Dashboard message >>> :: " + verifyDashboardMessages.replace("<<DATE>>", currentDate).replace("<<DOCTOR_NAME>>", TestDataUtil.getValue(lstDetails.get(0))).replace("<<MESSAGE>>", TestDataUtil.getValue(lstDetails.get(1))));
            WebElement data = waitForElement(By.xpath(verifyDashboardMessages.replace("<<DATE>>", currentDate).replace("<<DOCTOR_NAME>>", TestDataUtil.getValue(lstDetails.get(0))).replace("<<MESSAGE>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(data);
            jsScrollIntoView(data);
            isVerified = verifyElement(data);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean verifyDashboardHealthRecords(String strDetails) {
        boolean isVerified = false;
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);
        try {
            waitForElement(elmntNewMessages);
            System.out.println("Xpath for Dashboard Health Records >>> :: " + verifyMyHealthRecords
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1))));

            WebElement data = waitForElement(By.xpath(verifyMyHealthRecords
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(data);
            isVerified = verifyElement(data);
            takeScreenshotSanity(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean verifyRRPInDashboard(List<String> lstDetails) {
        boolean isVerified = false;
        System.out.println("lstDetails >>> :: " + lstDetails);
        try {
            String strCurrentDate = getCurrentDateByTimeZone("dd MMM YYY", "GMT+12");

            System.out.println("Xpath for RRP >>> :: " + verifyDashboardRRP
                    .replace("<<LOCATION>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<DATE>>", strCurrentDate)
                    .replace("<<STATUS>>", TestDataUtil.getValue(lstDetails.get(1))));

//            List<WebElement> data = driver.findElements(By.xpath(verifyDashboardRRP
//                    .replace("<<LOCATION>>", TestDataUtil.getValue(lstDetails.get(0)))
//                    .replace("<<DATE>>", strCurrentDate)
//                    .replace("<<STATUS>>", TestDataUtil.getValue(lstDetails.get(1)))));

            WebElement data = waitForElement(By.xpath(verifyDashboardRRP
                    .replace("<<LOCATION>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<DATE>>", strCurrentDate)
                    .replace("<<STATUS>>", TestDataUtil.getValue(lstDetails.get(1)))));

            waitForElement(data);
            jsScrollIntoView(data);
            System.out.println("Data >>> :: " + data);

            waitForElement(data);
            isVerified = verifyElement(data);

            takeScreenshotSanity(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean verifyAppointmentsInDashboard(String strDetails) {
        boolean isVerified = false;
        List<String> lstDetails = TestDataUtil.getListOfValue(strDetails);
        System.out.println("lstDetails >>> :: " + lstDetails);
//        AFTER_THREE_DAYS;Dr Sam Entwistle

        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntUpcomingAppointments);
//            15 Sep 2022 | 8:00 AM

            String strDate = TestDataUtil.getValue(lstDetails.get(0));

            String futureDate = DateUtil.getDate(strDate, "d MMM YYYY");
            System.out.println("DATE" + futureDate);

            String dateAndTime = futureDate.concat(" | ").concat(strSlotDate.trim());
            System.out.println("Xpath for RRP >>> :: " + verifyAppointments
                    .replace("<<DATE>>", dateAndTime)
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(1))));

            WebElement data = waitForElement(By.xpath(verifyAppointments
                    .replace("<<DATE>>", dateAndTime)
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(1)))));

            waitForElement(data);

            isVerified = verifyElement(data);

            takeScreenshotSanity(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean selectRRP(List<String> lstDetails) {
        boolean isVerified = false;
        System.out.println("lstDetails >>> :: " + lstDetails);
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            String strCurrentDate = getCurrentDateByTimeZone("dd MMM YYY", "GMT+12");
            System.out.println("Xpath for RRP 1 >>> :: " + verifyDashboardRRP.replace("<<LOCATION>>", TestDataUtil.getValue(lstDetails.get(0))).replace("<<DATE>>", strCurrentDate).replace("<<STATUS>>", TestDataUtil.getValue(lstDetails.get(1))));
            WebElement data = waitForElement(By.xpath(verifyDashboardRRP.replace("<<LOCATION>>", TestDataUtil.getValue(lstDetails.get(0))).replace("<<DATE>>", strCurrentDate).replace("<<STATUS>>", TestDataUtil.getValue(lstDetails.get(1)))));
            waitForElement(data);
            waitForElementClickable(data);
            jsClick(data);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMoreInfoClose);
            waitForElementClickable(btnMoreInfoClose);
            waitAndClick(btnMoreInfoClose);
            waitForSeconds(3);
            waitForElement(txtViewPreviousRequests);
            isVerified = verifyElement(txtViewPreviousRequests);

            takeScreenshotSanity(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public boolean selectHealthRecords(List<String> lstDetails) {
        boolean isVerified = false;
        System.out.println("lstDetails >>> :: " + lstDetails);
        try {
            System.out.println("Xpath for Dashboard select Health Records  >>> :: " + verifyMyHealthRecords
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1))));

            WebElement data = waitForElement(By.xpath(verifyMyHealthRecords
                    .replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(1)))));

            waitForElement(data);
            waitForElementClickable(data);
            waitAndClick(data);
            waitForSeconds(3);

            System.out.println("Xpath for Dashboard verify Health Records  >>> :: " + verifyHealthRecord
                    .replace("<<DATE>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(2))));

            WebElement record = waitForElement(By.xpath(verifyHealthRecord
                    .replace("<<DATE>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<NAME>>", TestDataUtil.getValue(lstDetails.get(2)))));

            waitForSeconds(1);
            waitForElement(record);
            isVerified = verifyElement(record);

            takeScreenshotSanity(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;

    }

    public void verifyUnreadMessageCount() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntNewMessages);
        waitForElement(elmntUnreadMessage);
        verifyElement(elmntUnreadMessage);
        String unReadMessageCount = elmntUnreadMessage.getText();
        System.out.println("UnRead Message Count >>> :: " + unReadMessageCount);

    }


}

package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import cap.utilities.WindowsProcessUtil;
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


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //MMH_v2
    static Process pb = null;

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement betaLoginBtn;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Connect a health centre')]")
    protected WebElement txtConnectAHealthCentre;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'exit_to_app')]"),
            @FindBy(how = How.XPATH, using = "//a[contains(text(),'Log out')]")
    })
    protected WebElement elmntLogOut;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//mat-nav-list[@role='navigation']/parent::app-vertical-sidebar")
    protected WebElement elmntSideBar;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='exit_to_app']")
    protected WebElement btnExitApp;

    @FindBy(how = How.XPATH, using = "//input[@id='UserName']")
    protected WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='EncrySecuredPassword']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'header')]/span[text()='Appointments']//following-sibling::mat-icon")
    protected WebElement btnAppointmentExpand;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'header')]/span[text()='Messages']//following-sibling::mat-icon")
    protected WebElement btnMessagesExpand;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Future Appointments')]")
    protected WebElement elmntFutureAppointment;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'hamburger')]")
    protected WebElement btnHamburgerIcon;

    @FindBy(how = How.XPATH, using = "//h3[text()=' Future Appointments']")
    protected WebElement elmntFutureAppointments;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-list-view')]")
    protected WebElement btnCardView;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-grid-view')]")
    protected WebElement btnGridView;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Data table']")
    protected WebElement elmntTableView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-view')]/mat-accordion")
    protected WebElement elmntMobileView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'block-view')][1]")
    protected WebElement elmntGridView;

    @FindBy(how = How.XPATH, using = "//kendo-grid-group-panel[contains(@class,'grouping-header')]")
    protected WebElement elmntGroupingHeader;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email address']")
    protected WebElement txtBoxEmail;


    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Password']")
    protected WebElement txtBoxPassword;


    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;


    public void clickSignInButton() {
        waitForElement(SignInBtn);
        click(SignInBtn);
    }


    public void visit() {
        visit(TestDataUtil.getValue("&URL&"));
        takeScreenshotSanity(driver);
        waitForSeconds(5);
        if (verifyElement(elmntLogOut)){
            patientLogOut();
            visit(TestDataUtil.getValue("&URL&"));
        }
    }
    public void visitDevURL(String strURL) {
        visit(TestDataUtil.getValue(strURL));
        takeScreenshotSanity(driver);

    }

    public void enterPasswordForBeta(String strPassword) {
        waitForElementClickable(txtBoxPassword);
        enterValue(txtBoxPassword, strPassword);
    }

    public void enterEmail(String strEmail) {
        waitForElementClickable(txtEmail);
        enterValue(txtEmail, strEmail);
    }


    public boolean waitForMMHLoginPage() {
        System.out.println("\n >>> Get First Line :: ");
        waitForElement(elmntLogo);
        takeScreenshotSanity(driver);
        waitForElement(btnLogin);
        System.out.println("----> BLN elmntMainHeader : " + verifyElement(btnLogin));
        return verifyElement(btnLogin);
    }


    public void enterEmailForBeta(String strEmail) {
        waitForElementClickable(txtBoxEmail);
        enterValue(txtBoxEmail, strEmail);
    }

    public void enterpassword(String strPassword) {
        waitForElementClickable(txtPassword);
        enterValue(txtPassword, strPassword);
    }

    public boolean clickLoginButton() {
        waitForElement(btnLogin);
        waitForElementClickable(btnLogin);
        return click(btnLogin);
    }

    public void clickBetaLoginButton() {
        waitForSeconds(2);
        waitForElement(betaLoginBtn);
        waitForElementClickable(betaLoginBtn);
        waitAndClick(betaLoginBtn);
    }

//    public boolean verifyHomePageOfMMHPortal() {
//        waitForElement(elmntVerifyHomePage);
//        takeScreenshotSanity(driver);
//        return verifyElement(elmntVerifyHomePage);
//    }
    public boolean patientLogOut() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntLogOut);
            waitForElementClickable(elmntLogOut);
            click(elmntLogOut);
            waitForElement(btnLogin);

            blResult = verifyElement(btnLogin);
            waitForSeconds(5);
            System.out.println("Patient Log out Successfully");
        } catch (Exception e) {
            System.out.println("Patient Failed to Log out");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmntLogo);
            waitForElementClickable(elmntLogo);
            click(elmntLogo);
//            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            String pageTitle = driver.getTitle();
            System.out.println("pageTitle >>> : " + pageTitle);
            try {
                pageTitle.equalsIgnoreCase("PostRegistration");
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(3);
                waitForElement(txtConnectAHealthCentre);
                blResult = verifyElement(txtConnectAHealthCentre);
                System.out.println("User on the HomePage and Verified the HomePage >>>>");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("User not in the HomePage >>>>");
            }

        } catch (Exception e) {
            System.out.println("Failed to Navigate the HomePage >>>>");
            e.printStackTrace();
        }
        return blResult;
    }


    public void clickAppointmentOptionFromMenu() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnAppointmentExpand);
            click(btnAppointmentExpand);
            click(elmntFutureAppointment);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElement(btnHamburgerIcon);
            click(btnHamburgerIcon);
            waitForElement(btnAppointmentExpand);
            click(btnAppointmentExpand);
            waitForElement(btnAppointmentExpand);
            click(elmntFutureAppointment);
        }
    }

    public boolean verifyFutureAppoinmentsPage() {
        waitForElement(elmntFutureAppointments);
        takeScreenshotSanity(driver);
        return verifyElement(elmntFutureAppointments);
    }

    public void clickCardView() {
        waitForElement(btnCardView);
        click(btnCardView);
    }

    public boolean verifyAppointmentsInCardView() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntGroupingHeader);
            takeScreenshotSanity(driver);
            isVerified = verifyElement(elmntTableView);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            System.out.println("INTO MOBILE VIEW");
            waitForElement(elmntMobileView);
            takeScreenshotSanity(driver);
            isVerified = verifyElement(elmntMobileView);
        }
        return isVerified;
    }

    public void clickGridView() {
        waitForElement(btnGridView);
        click(btnGridView);
    }

    public boolean verifyAppointmentsInGridView() {
        waitForElement(elmntGridView);
        takeScreenshotSanity(driver);
        return verifyElement(elmntGridView);
    }

    public boolean clickAppointmentsExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashBoard);
        waitForElement(btnAppointmentExpand);
        jsClick(btnAppointmentExpand);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean clickDashBoardForMobile() {
        takeScreenshotSanity(driver);
        waitForSeconds(2);
        waitForElementClickable(btnMobileMenu);
        jsClick(btnMobileMenu);
        waitForElement(elmntDashBoard);
        click(elmntDashBoard);
        waitForSeconds(3);
        driver.navigate().refresh();
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        jsScrollIntoView(elmntDashBoard);
        waitForElementClickable(elmntDashBoard);
        mouseClick(elmntDashBoard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntVerifyHomePage);
        waitForSeconds(5);
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshotSanity(driver);
            waitForElement(elmntDashBoard);
            click(elmntDashBoard);
            waitForSeconds(3);
            click(btnExitApp);
            waitForSeconds(180);
            waitForElement(txtEmail);
            isVerified = verifyElement(txtEmail);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnExitApp);
            click(btnExitApp);
            waitForSeconds(120);
            waitForElement(txtEmail);
            isVerified = verifyElement(txtEmail);
        }
        return isVerified;
    }

    public boolean clickMesagesExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashBoard);
        waitForElement(btnMessagesExpand);
        jsClick(btnMessagesExpand);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean clickHamburgerIcon() {
        waitForSeconds(3);
        refreshPage();
        waitForElement(btnHamburgerIcon);
        waitForElementClickable(btnHamburgerIcon);
        waitForSeconds(2);
        waitAndClick(btnHamburgerIcon);
        waitForSeconds(1);
        waitForElement(elmntSideBar);
        return verifyElement(elmntSideBar);
    }
    public boolean changeTimeZone(String strTimeZone) {
        boolean blResult = false;
        try {
            pb = WindowsProcessUtil.startTimeZoneProcess(strTimeZone);
            waitForSeconds(5);
            WindowsProcessUtil.stopProcess(pb);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForElement(elmntVerifyHomePage);
        strAppVersion = txtAppVersion.getText();
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName= InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyHomePage);
    }
}




package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import cap.utilities.WindowsProcessUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    static Process pb = null;

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;

    //MMH_v2

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement betaLoginBtn;

    @FindBy(how = How.XPATH, using = "//span[text()='Provider Login']")
    protected WebElement ClickPatientLoginBtn;

    @FindBy(how = How.XPATH, using = "//img[@class='profile-pic img-fluid']")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' Sign Out ')]")
    protected WebElement elmntSignout;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'My Home page') or contains(text(),'Welcome') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    protected WebElement txtWelcome;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntSideBar;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SIGN OUT')]")
    protected WebElement btnExitApp;

    @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'exit_to_app')]")
    protected WebElement btnExitAppMobile;

    //mat-icon[contains(text(),'exit_to_app')]

    @FindBy(how = How.XPATH, using = "//input[@id='UserName']")
    protected WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "//span[text()='Provider Login']")
    protected WebElement txtProviderPortal;

    //p[text()='Login to Manage My Health Patient Portal']

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

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']")
    protected WebElement txtBoxEmail;


    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Password']")
    protected WebElement txtBoxPassword;


    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(SignInBtn)) {
//            waitForElement(SignInBtn);
            waitForSeconds(3);
            jsClick(SignInBtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } else if (!verifyElement(SignInBtn)) {
            System.out.println("user already in the home page");
        }
    }


    public void visit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println(">>>>>>>>>>>>>>>>>>>>" + WindowsCount);
        if (WindowsCount == 2) {
            focusWindow(1);
        }
        if (WindowsCount == 1) {
            visit(TestDataUtil.getValue("&URL&"));
            takeScreenshot(driver);
            waitForSeconds(5);
        }
    }

    public void enterPasswordForBeta(String strPassword) {
        if (verifyElement(txtBoxPassword)) {
            waitForElementClickable(txtBoxPassword);
            enterValue(txtBoxPassword, strPassword);
        }
        if (!verifyElement(txtBoxPassword)) {
            System.out.println("User here in home page");
        }

    }

    public void enterEmail(String strEmail) {
        waitForSeconds(2);
//        jsClick(txtProviderPortal);
        waitForSeconds(3);
        waitForElementClickable(txtBoxEmail);
        enterValue(txtBoxEmail, strEmail);
    }


    public boolean waitForMMHLoginPage() {
        System.out.println("\n >>> Get First Line :: ");
        waitForElement(elmntLogo);
        takeScreenshot(driver);
        waitForElement(btnLogin);
        System.out.println("----> BLN elmntMainHeader : " + verifyElement(btnLogin));
        return verifyElement(btnLogin);
    }


    public void enterEmailForBeta(String strEmail) {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);
        }
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
        }

    }

    public void enterpassword(String strPassword) {
        waitForElementClickable(txtBoxPassword);
        enterValue(txtBoxPassword, strPassword);
    }

    public boolean clickLoginButton() {
        waitForElement(btnLogin);
        waitForElementClickable(btnLogin);
        return click(btnLogin);
    }

    public boolean clickBetaLoginButton() {
        boolean blResult = false;
        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println(">>>>>>>>>>>>>>>>>>>>" + WindowsCount);
            if (WindowsCount == 1) {
                waitForElement(betaLoginBtn);
                click(betaLoginBtn);
                blResult = true;
            }
            if (WindowsCount == 2) {
                focusWindow(1);
                System.out.println("user in Provider Home Page");
            }
            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(betaLoginBtn);
                click(betaLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }
        }
        return blResult;
    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForSeconds(5);
        waitForElement(elmntVerifyHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (isElementDisplayed(txtWelcome)) {
                verifyElement(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(txtWelcome);
                blResult = verifyElement(txtWelcome);
            }else {
                jsScrollIntoView(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
               refreshPage();
                blResult =verifyElement(txtWelcome);
            }
//            if (!isElementDisplayed(txtWelcome)) {
//                focusWindow(2);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                waitForElement(elmntDashboard);
//                waitForElementClickable(elmntDashboard);
//                click(elmntDashboard);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                blResult = verifyElement(txtWelcome);
//                System.out.println("User on the Patient HomePage and Verified>>>>");
//            }
            return blResult;

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

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
        takeScreenshot(driver);
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
            takeScreenshot(driver);
            isVerified = verifyElement(elmntTableView);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            System.out.println("INTO MOBILE VIEW");
            waitForElement(elmntMobileView);
            takeScreenshot(driver);
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
        takeScreenshot(driver);
        return verifyElement(elmntGridView);
    }

    public boolean clickAppointmentsExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashboard);
        waitForElement(btnAppointmentExpand);
        jsClick(btnAppointmentExpand);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean clickDashBoardForMobile() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElementClickable(btnMobileMenu);
        jsClick(btnMobileMenu);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDashboard);
        click(elmntDashboard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        jsScrollIntoView(elmntDashboard);
        waitForElement(elmntDashboard);
        jsClick(elmntDashboard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForSeconds(3);
            jsClick(btnExitApp);
            waitForSeconds(180);
            waitForSeconds(2);
//            jsClick(txtProviderPortal);
            waitForSeconds(3);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnExitAppMobile);
            jsClick(btnExitAppMobile);
            waitForSeconds(120);
            waitForSeconds(2);
//            jsClick(txtProviderPortal);
            waitForSeconds(3);
            waitForElement(txtBoxEmail);
            isVerified = verifyElement(txtBoxEmail);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElement(btnExitAppMobile);
            click(btnExitAppMobile);
            waitForSeconds(120);
            waitForSeconds(2);
//            jsClick(txtProviderPortal);
            waitForSeconds(3);
            waitForElement(txtBoxEmail);
            isVerified = verifyElement(txtBoxEmail);
        }
        return isVerified;
    }


    public boolean clickMesagesExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashboard);
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
}




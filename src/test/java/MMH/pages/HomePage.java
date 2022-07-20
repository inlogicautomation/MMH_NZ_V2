package MMH.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //MMH_v2

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement betaLoginBtn;

    @FindBy(how = How.XPATH, using = "//img[@class='profile-pic img-fluid']")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' Sign Out ')]")
    protected WebElement elmntSignout;


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
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
        takeScreenshot(driver);

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
        takeScreenshot(driver);
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

    public boolean clickBetaLoginButton() {
        boolean blResult = false;
        try {
            waitForElement(betaLoginBtn);
            click(betaLoginBtn);
            blResult = true;
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
        waitForElement(elmntVerifyHomePage);
        takeScreenshot(driver);
        return verifyElement(elmntVerifyHomePage);
    }
    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
            waitForElementClickable(elmntLogo);
            click(elmntLogo);
            refreshPage();
            waitForSeconds(3);
            String pageTitle = driver.getTitle();
            System.out.println("pageTitle >>> : " + pageTitle);
            try {
                pageTitle.equalsIgnoreCase("PostRegistration");

                System.out.println("User on the HomePage and Verified the HomePage >>>>");
                blResult = true;
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
        waitForElement(elmntDashBoard);
        waitForElement(btnAppointmentExpand);
        jsClick(btnAppointmentExpand);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean clickDashBoardForMobile() {
        takeScreenshot(driver);
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
        waitForSeconds(2);
        waitForElement(elmntDashBoard);
        click(elmntDashBoard);
        waitForSeconds(3);
        driver.navigate().refresh();
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
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
}




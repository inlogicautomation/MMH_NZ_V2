package MMH.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //MMH_v2

    @FindBy(how = How.XPATH, using = "//div[@class='col-1 logo']//img[@alt='ManageMyHealth']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]")
    protected WebElement elmntWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

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
    protected WebElement elmntFutureAppoinments;

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


    public void visit() {
        visit(TestDataUtil.getValue("&URL&"));
        takeScreenshot(driver);

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

    public void enterpassword(String strPassword) {
        waitForElementClickable(txtPassword);
        enterValue(txtPassword, strPassword);
    }

    public void clickLoginButton() {
        waitForElement(btnLogin);
        click(btnLogin);
    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForElement(elmntWelcomeMessage);
        takeScreenshot(driver);
        return verifyElement(elmntWelcomeMessage);
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
        waitForElement(elmntFutureAppoinments);
        takeScreenshot(driver);
        return verifyElement(elmntFutureAppoinments);
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

    public boolean clickDashBoard() {
        takeScreenshot(driver);
        waitForElement(elmntDashBoard);
        click(elmntDashBoard);
        waitForSeconds(3);
        driver.navigate().refresh();
        return verifyElement(elmntWelcomeMessage);
    }

    public boolean clickLogoutButton() {
        takeScreenshot(driver);
        waitForElement(elmntDashBoard);
        click(elmntDashBoard);
        waitForSeconds(3);
        click(btnExitApp);
        waitForSeconds(120);
        waitForElement(txtEmail);
        return verifyElement(txtEmail);
    }

    public boolean clickMesagesExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashBoard);
        waitForElement(btnMessagesExpand);
        jsClick(btnMessagesExpand);
        return verifyElement(elmntFutureAppointment);
    }
}




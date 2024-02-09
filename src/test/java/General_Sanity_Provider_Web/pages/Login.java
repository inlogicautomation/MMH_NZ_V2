package General_Sanity_Provider_Web.pages;

import cap.common.BasePage;
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

public class Login extends BasePage {

    public Login (WebDriver driver) {
        super(driver);
    }

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Harry Harry!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Auto Autochrisc1!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Auto Autochrisc1!')]")

    })
    protected WebElement txtPatientWelcomePage;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement elmntLoginBtn;

    @FindBy(how = How.XPATH, using = "//img[@class='profile-pic img-fluid']")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' Sign Out ')]")
    protected WebElement elmntSignout;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']")
    protected WebElement txtBoxEmail;


    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Password']")
    protected WebElement txtBoxPassword;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome,') or contains(text(),'Start managing your health, today')])[1]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;


    public void visit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 2) {
            focusWindow(1);
            if (verifyElement(txtPatientWelcomePage)){
                driver.manage().deleteAllCookies();
                System.out.println("User here in Provider home page");
            }else{
//                System.out.println("Else Part ::::::Window Count 2");
                driver.manage().deleteAllCookies();
                visit(TestDataUtil.getValue("&URL&"));

            }
        }
        if (WindowsCount == 1) {
            visit(TestDataUtil.getValue("&URL&"));
            System.out.println("Enter Windows 1 ");
            waitForSeconds(3);
            if (isElementDisplayed(txtPatientWelcomePage)) {
                driver.manage().deleteAllCookies();
                System.out.println("User here in Provider home page");
                takeScreenshot(driver);
            }
            else{
                waitForSeconds(3);
                visit(TestDataUtil.getValue("&URL&"));
                driver.manage().deleteAllCookies();
            }

        }
    }

    public boolean clickBetaLoginButton() {
        boolean blResult = false;

        try {
            int WindowsCount = driver.getWindowHandles().size();
//            System.out.println("===============>WindowsCount::" + WindowsCount);

            if (WindowsCount == 1) {
                driver.manage().deleteAllCookies();
                waitForSeconds(10);
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                driver.manage().deleteAllCookies();
                blResult =true;
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
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public void enterEmailForBeta(String strEmail) {

        waitForSeconds(3);
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);
        }

        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
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

    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(SignInBtn)) {
            waitForElement(SignInBtn);
            jsClick(SignInBtn);
        } else if (!verifyElement(SignInBtn)) {
            System.out.println("user already in the home page");
        }
    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForSeconds(5);
        waitForElement(elmntVerifyHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion"+strAppVersion);
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


}

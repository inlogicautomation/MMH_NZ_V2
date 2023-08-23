package Happy_Path_Patient_Mobile_App.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo-white']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    protected WebElement logoMMH;

//   (//android.view.View/following::android.widget.Image)[1]

    @AndroidFindBy(xpath= "//android.widget.Image[@text='person']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"person\"]/following::XCUIElementTypeTextField")
    protected WebElement txtUserName;



    @AndroidFindBy(xpath = "//android.widget.Image[@text='key']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"person\"]/following::XCUIElementTypeSecureTextField[@value='Password']")
    protected WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN-IN']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign-In\"]")
    protected WebElement btnSignIn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='log out outline']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"log out outline\"]")
    protected WebElement iconLogout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to logout?\"]")
    protected WebElement elmntLogoutPopup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Yes\"]")
    protected WebElement btnYes;


    public boolean verifyMMHLoginScreen() {
        waitForElement(logoMMH);
        return verifyElement(logoMMH);
    }

    public void enterUserName(String strUserName) {
        takeScreenshot(driver);
     waitForElement(txtUserName);
        enterValue(txtUserName, strUserName);
    }

    public void enterPassword(String strPassword) {
        waitForElement(txtPassword);
        enterValue(txtPassword, strPassword);
    }

    public void tapSignIn() {
        waitForElement(btnSignIn);
        click(btnSignIn);
    }


    public boolean verifyMMHLoginScreenForiOS() {
        waitForSecond(2);
        if (verifyElementWithoutWait(iconLogout)){
            click(iconLogout);
            waitForElement(elmntLogoutPopup);
            click(btnYes);
        }
        waitForElement(logoMMH);
        return verifyElement(logoMMH);
    }
}
package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo-white']")
    protected WebElement logoMMH;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='person']/following-sibling::android.widget.EditText")
    protected WebElement txtUserName;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='key']/following-sibling::android.widget.EditText")
    protected WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN-IN']")
    protected WebElement btnSignIn;






    public boolean verifyMMHLoginScreen() {
        waitForElement(logoMMH);
        return verifyElement(logoMMH);
    }

    public void enterUserName(String strUserName) {
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





}
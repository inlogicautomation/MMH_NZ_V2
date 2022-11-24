package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    public HomeScreen(WebDriver driver) {

        super(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirm!']")
    protected WebElement confirmPopUp;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='log out outline']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"log out outline\"]")
    protected WebElement iconLogout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to logout?\"]")
    protected WebElement elmntLogoutPopup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"notifications outline\"]")
    protected WebElement iconNotification;

    @AndroidFindBy(xpath = "//android.view.View[@text='home Home']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"home Home\"]")
    protected WebElement iconHome;

    By byconfirmPopUp = By.xpath("//android.widget.TextView[@text='Confirm!']");

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(id = "Yes")
    protected WebElement btnYes;

    String strOptionsInHomeScreenLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<OPTION>>").append("']/preceding-sibling::android.widget.Image").toString();

    String strOptionsInHomeScreenLocatoriOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<OPTION>>").append("']/parent::XCUIElementTypeOther").toString();

    public boolean verifyMMHHomeScreen() {
        try {
            fluentWaitForElement(byconfirmPopUp);
            if (verifyElement(confirmPopUp)) {
                tapByCoordinates(530, 730);
            }
            return verifyElement(iconLogout);
        } catch (Exception e) {
            try {
                return verifyElement(iconLogout);
            } catch (Exception e1) {
                e1.printStackTrace();
                return false;
            }
        }

    }

    public boolean gotoAndVerifyMMHHomeScreen() {
        waitForSecond(1);
        int i = 1;
        while (!(verifyElementWithoutWait(iconHome) && i <= 10)) {
            navigateToBack();
            i++;
//            if (verifyElement(iconHome)) {
//                System.out.println("Loop Break 1");
//                break;
//            }
        }
        waitForSecond(3);
        click(iconHome);
        waitForElement(iconNotification);
        waitForElement(iconLogout);
        return verifyElement(iconLogout) && verifyElement(iconNotification);
    }

    public void tapOptionsInHomeScreen(String strOptions) {
//        reLaunchAppAndroid();
        WebElement elmntOption = waitForElement(By.xpath(strOptionsInHomeScreenLocator.replace("<<OPTION>>", strOptions)));
        click(elmntOption);
    }

    public void appRelaunch() {
        reLaunchAppAndroid();
    }

    public void tapLogout() {
        waitForElement(iconLogout);
        click(iconLogout);
        waitForElement(btnYes);
        click(btnYes);
    }

    public void tapOptionsInHomeScreeniOS(String strOptions) {
        WebElement elmntOption = waitForElement(By.xpath(strOptionsInHomeScreenLocatoriOS.replace("<<OPTION>>", strOptions)));
        click(elmntOption);
    }

    public boolean verifyMMHHomeScreeniOS() {
        verifyElement(iconHome);
        return verifyElement(iconLogout);
    }
}

package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
    protected WebElement iconLogout;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    protected WebElement iconNotification;

    @AndroidFindBy(xpath = "//android.view.View[@text='home Home']")
    protected WebElement iconHome;

    String strOptionsInHomeScreenLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<OPTION>>").append("']/preceding-sibling::android.widget.Image").toString();


    public boolean verifyMMHHomeScreen() {
        if (!verifyElementWithoutWait(iconLogout)) {
            waitForSecond(20);
            if (verifyElement(confirmPopUp)) {
                tapByCoordinates(530, 730);
            }
            waitForElement(iconLogout);
            return verifyElement(iconLogout);
        }
        if (!verifyElementWithoutWait(iconNotification)) {
            click(iconHome);
            waitForElement(iconNotification);
        }
        waitForElement(iconLogout);
        return verifyElement(iconLogout);
    }

    public boolean verifyMMHHomeScreen1() {
        if (!verifyElementWithoutWait(iconLogout)) {
            waitForSecond(20);
            if (verifyElement(confirmPopUp)) {
                tapByCoordinates(530, 730);
            }
        }
        waitForSecond(2);
        int i =1;
        while (!(verifyElementWithoutWait(iconHome) && i<=10)) {
            navigateToBack();
            i++;
            waitForSecond(2);
        }
        waitForSecond(2);
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
}

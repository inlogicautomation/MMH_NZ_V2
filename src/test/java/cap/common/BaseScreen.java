package cap.common;

import MMH_MobileApp.DemoScreenContainer;
import cap.helpers.Constants;
import io.appium.java_client.*;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cap.common.BaseWindow.waitForSeconds;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

/**
 * Created by codoid-pc on 6/4/2018.
 */
public class BaseScreen {

    protected final WebDriver driver;
    public AndroidDriver androidDriver;
    protected final WebDriverWait wait;

    public BaseScreen(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Integer.parseInt("45"));
    }


    public void startAndroidActivity(String strAppPackage, String strAppActivity) {
        ((StartsActivity) driver).startActivity(new Activity(strAppPackage, strAppActivity));
    }

    public void hideMobileKeyboard() {
        ((HidesKeyboard) driver).hideKeyboard();
    }

    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    static String strPlatformName = System.getProperty("platformName");

    public boolean click(WebElement element) {
        WebElement ele;
        try {
            ele = waitForElement(element);
            ele.click();
            return true;
        } catch (Exception e) {
            System.out.println("\n Click Element:: " + e.getMessage());
            return false;
        }
    }

    public void scrollVerticalIntoView(String strTextToScroll) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollIntoView(" +
                            "new UiSelector().text(\"" + strTextToScroll + "\"))"));

//            androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +strTextToScroll +"\"))");
        } catch (Exception e) {
            System.out.println("Scroll Vertical Exception: " + e.getMessage());
        }

    }




    public boolean verifyElement(WebElement element) {

        try {
//            element.isDisplayed();
            waitForElement(element).isDisplayed();
            return true;
        } catch (Exception e) {
            System.out.println("\n Click Element:: " + e.getMessage());
            return false;
        }
    }

    public boolean verifyElement(By element) {
        boolean isVerify = false;
        try {
            isVerify = driver.findElement(element).isDisplayed();
        } catch (NoSuchElementException error) {
            error.getMessage();
            isVerify = false;
        }
        return isVerify;
    }

    public boolean verifyElementWithoutWait(WebElement element) {
        boolean blResult = false;

        try {
            if (element.isDisplayed()) {
                Thread.sleep(1000);
                blResult = true;
            } else {
                blResult = false;
            }
        } catch (Exception e) {
            System.out.println("\n Verify Element:: " + e.getMessage());
        }

        return blResult;
    }

    public void waitForSecond(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (Exception e) {
            System.out.println("\n waitForSecond:: " + e.getMessage());
        }
    }

    public boolean focusFrame(WebElement element) {
        boolean isFrameFocused;
        waitForSeconds(1);
        driver.switchTo().frame(element);
        System.out.println("After Focused>>>>>>>>");
        isFrameFocused = true;
        return isFrameFocused;
    }

    public void reLaunchAppAndroid() {
        ((AppiumDriver<WebElement>) driver).closeApp();
        System.out.println("App Teriminated");
        waitForSecond(3);
        ((AppiumDriver<WebElement>) driver).activateApp("managemyhealth.co.nz");
        System.out.println("App ReLaunched");
    }

    public void tapCooridinatesByElement(WebElement element) {
        waitForSecond(3);
        int Xcoordinate = element.getLocation().x;
        int Ycoordinate = element.getLocation().y;
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(Xcoordinate, Ycoordinate)).perform();
    }

    public List<WebElement> waitForElements(List<WebElement> element) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


    public boolean enterValue(WebElement element, String strVlaue) {
        try {
            waitForElement(element).click();
            waitForElement(element).clear();
            waitForElement(element).sendKeys(strVlaue);
            return true;
        } catch (Exception e) {
            System.out.println("\n Enter a value - Exception:: " + e.getMessage());
            return false;
        }
    }


    public void swipeUpToDownUsingDimension() {
        //  swipeFromUpToBottom();
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width / 2);
        // Swipe up to scroll down
        int startPoint = (int) (size.height - 10);
        int endPoint = 10;
        if (strPlatformName.equals(Constants.ANDROID)) {
            new TouchAction(((AndroidDriver) driver))
                    .longPress(point(anchor, startPoint))
                    .moveTo(point(anchor, endPoint))
                    .release()
                    .perform();
        } else if (strPlatformName.equals(Constants.IOS)) {
            new TouchAction(((IOSDriver) driver))
                    .longPress(point(anchor, startPoint))
                    .moveTo(point(anchor, endPoint))
                    .release()
                    .perform();
        }
    }

    public void swipeUpShort() {
        Dimension size = driver.manage().window().getSize();
        System.out.println("Swipe Up");

        int startx = (int) (size.width * 0.2);
        int starty = (int) (size.height * 0.6);

        int endx = (int) (size.width * 0.2);
        int endy = (int) (size.height * 0.2);

        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(startx, starty))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endx, endy)).release().perform();
    }

    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        int startx = (int) (size.width * 0.5);
        int starty = (int) (size.height * 0.8);

        int endx = (int) (size.width * 0.2);
        int endy = (int) (size.height * 0.2);

        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(startx, starty))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endx, endy)).release().perform();
    }



    public void swipeDown() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.2);
        int starty = (int) (size.height * 0.2);
        int endx = (int) (size.width * 0.5);
        int endy = (int) (size.height * 0.8);
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(startx, starty))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endx, endy)).release().perform();
    }

    public void jsSwipeDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap scrollObject = new HashMap();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
    }

    public void jsSwipeUp() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap scrollObject = new HashMap();
        scrollObject.put("direction", "up");
        js.executeScript("mobile: scroll", scrollObject);
    }

    public void mobileSwipeScreenIOS() {

        final int ANIMATION_TIME = 200; // ms
        final HashMap<String, String> scrollObject = new HashMap<String, String>();


        scrollObject.put("direction", "left");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }
    }

    public void jsSwipeLeft() {
        waitForSecond(2);
        Dimension size = driver.manage().window().getSize();
        System.out.println(size.height + "height");
        System.out.println(size.width + "width");

        int startx = (int) (size.width * 0.9D);
        int endx = (int) (size.width * 0.1D);
        int starty = size.height / 2;

        TouchAction<?> action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, starty)).release().perform();

    }

    public void scroll(WebElement element) {
        TouchActions action = null;
        if (strPlatformName.equals(Constants.ANDROID)) {
            action = new TouchActions(((AndroidDriver) driver));
        } else if (strPlatformName.equals(Constants.IOS)) {
            action = new TouchActions(((IOSDriver) driver));
        }
        action.scroll(element, 10, 10);
        action.perform();
    }


    public void jsIOSNextDatePicker(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("order", "next");
        params.put("offset", 0.15);
        params.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: selectPickerWheelValue", params);
    }

    public static DemoScreenContainer pageContainer;

    public void takeScreenshot(WebDriver driver) {
        try {
            pageContainer.myScenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attachStepLog(String strKey, String strvalue) {
        try {
            pageContainer.printTestDataMap.put(strKey, strvalue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void tapByCoordinates(int startX, int startY) {
        try {
            TouchAction act = new TouchAction((PerformsTouchActions) driver);
            Thread.sleep(1000);
            Point pt = new Point(startX, startY);
            act.tap(PointOption.point(pt)).perform();
        } catch (Exception e) {
            System.out.println("\n Exception :: tap By Coordinates " + e.getMessage());
        }
    }

    public void enterValueByCoordinates(String strValue) {
        try {
            AppiumDriver appiumDriver = (AppiumDriver) driver;
            appiumDriver.getKeyboard().sendKeys(strValue);
        } catch (Exception e) {
            System.out.println("\n Exception enterValue By Coordinates" + e.getMessage());
        }
    }

    public boolean exitLoop(int milliSec, long startTime) {
        return (System.currentTimeMillis() - startTime) < milliSec;
    }

    public WebElement waitForElementIgnoreStale(WebElement element) {
        return wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }

    public void navigateToBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

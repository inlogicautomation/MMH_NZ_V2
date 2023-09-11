package cap.common;

import Happy_Path_Patient_Mobile_App.DemoScreenContainer;
import cap.helpers.Constants;
import io.appium.java_client.*;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static cap.common.BaseWindow.waitForSeconds;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;


public class BaseScreen {

    protected final WebDriver driver;
    public AndroidDriver androidDriver;
    protected final WebDriverWait wait;

    protected final WebDriverWait invisibleWait;

/**   This method is used to connect the mobile class page to the base screen page.*/
    public BaseScreen(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Integer.parseInt("30"));
        invisibleWait = new WebDriverWait(this.driver,Integer.parseInt("30"));
    }


    public void startAndroidActivity(String strAppPackage, String strAppActivity) {
        ((StartsActivity) driver).startActivity(new Activity(strAppPackage, strAppActivity));
    }

    public void hideMobileKeyboard() {
        ((HidesKeyboard) driver).hideKeyboard();
    }

    /** explicit wait condition where we can pause or wait for an element before proceeding to the next step.In this method, declare the elements Xpath like containsText,Text....*/
    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**When an element on the page is not clickable, Selenium waits for it to be clickable, and it takes a long time to load all elements.In this method, declare the elements Xpath like Id,Name..  */
    public WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    static String strPlatformName = System.getProperty("platformName");
    /**  This method is used to click the present element.In this method, declare the elements Xpath like Id,Name..*/
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
    /**  This method is used to click the present element.In this method, declare the elements Xpath.*/
    public boolean click(By by) {
        WebElement ele;
        try {
            ele = waitForElement(by);
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
    /**  This method is used to verify the present elements.In this method, declare the elements Xpath like Id,Name..*/
    public boolean verifyElement(WebElement element) {

        try {
            element.isDisplayed();
            waitForElement(element).isDisplayed();
            return true;
        } catch (Exception e) {
            System.out.println("\n Click Element:: " + e.getMessage());
            return false;
        }
    }

    /**  This method is used to verify the present elements.In this method, declare the elements Xpath*/
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

    /**The implicitlyWait command waits for an element to load for a specified duration..*/
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

/**  Using this method, the mobile application is terminated and relaunched*/
    public void reLaunchAppAndroid() {
        ((AppiumDriver<WebElement>) driver).closeApp();
        System.out.println("App Teriminated");
        waitForSecond(3);
        ((AppiumDriver<WebElement>) driver).activateApp("managemyhealth.co.nz");
        System.out.println("App ReLaunched");
    }
/**This method is used to obtain the element's coordinates (x,y value) before tapping it.*/
    public void tapCooridinatesByElement(WebElement element) {
        waitForSecond(3);
        int Xcoordinate = element.getLocation().x;
        int Ycoordinate = element.getLocation().y;
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(Xcoordinate, Ycoordinate)).perform();
    }
    /**The implicitlyWait command waits for an element to load for a specified duration..*/
    public List<WebElement> waitForElements(List<WebElement> element) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    /**This method is used to Enter the value of the present Textbox with Selenium.*/
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
    /**  This method is used with mobiledriver to scroll the mobile screen a short distance.*/
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
/**   This method is used to make the mobile screen scroll up or down with the mobile driver.*/
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

    /**   This method is used to Mobile Screen down with MobileDriver.*/
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

    /**   This method is used to take screenshots of the current page.*/
    public void takeScreenshot(WebDriver driver) {
        try {
            pageContainer.myScenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**   Using an Android driver, you can use this method to Attach,Upload any file into your mobile device.*/
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


    /**This method is used to obtain the element's coordinates (x,y value) before tapping it.*/
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

/**    While clicking a link,element we get the IllegalStateException, to avoid this exception, the JavaScript executor is used instead of the method */

    public WebElement waitForElementIgnoreStale(WebElement element) {
        return wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }


    public void navigateToBack() {
        try {
            if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
                driver.navigate().back();
            }  else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
                swipeLeftIOS();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void swipeLeftIOS() {
        waitForSecond(1);
        Dimension size = driver.manage().window().getSize();

        int startY = (int) (size.height / 2);
        int startX = (int) (size.width * 0.05);
        int endX = (int) (size.width * 0.90);
        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

    }

    public WebElement fluentWaitForElement(By element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(80, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement elmnt = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(element);
            }
        });
        return elmnt;
    }

    public static String strImageDirectory = System.getProperty("user.dir") + "\\config\\Images\\";

/**   Using an Android driver, you can use this method to push any file into your mobile device.*/
    public void pushFileToDevice(String strImageName) {
        try {
            ((AndroidDriver<WebElement>) driver).pushFile("/sdcard/Download/" + strImageName + "", new File(strImageDirectory + strImageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reLaunchAppIOS() {
        ((AppiumDriver<WebElement>)driver).terminateApp("managemyhealth.co.nz");
        System.out.println("App Teriminated");
        waitForSecond(3);
        ((AppiumDriver<WebElement>)driver).launchApp();
        System.out.println("App ReLaunched");
    }

}

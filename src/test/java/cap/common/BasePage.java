package cap.common;

import cap.helpers.Constants;
import cap.utilities.WaitTimeUtil;
import com.google.gson.internal.bind.util.ISO8601Utils;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import MMH.DemoPageContainer;

import java.awt.*;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by codoid-pc on 6/20/2018.
 */
public class BasePage {

    @Getter
    protected WebDriver driver;

    @Getter
    protected final WebDriverWait wait;
    protected final WebDriverWait invisibleWait;

    protected static Long executionID = null;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, WaitTimeUtil.getWaitTime(Constants.OBJECT_WAIT_TIME));
        invisibleWait = new WebDriverWait(this.driver, WaitTimeUtil.getWaitForInvisibilityTime(Constants.OBJECT_WAIT_TIME));
        // this.driver.manage().timeouts().pageLoadTimeout(WaitTimeUtil.getWaitTime(Constants.PAGE_LOAD_WAIT_TIME),
        // TimeUnit.SECONDS);
    }

    StopWatch pageLoad = new StopWatch();

    protected void visit(String URL) {
        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
        System.out.println("=======================>URL:" + URL);
        driver.get(URL);
        System.out.println("=======================>Launched URL");
    }

    protected WebElement waitForElementClickable(By by, int secs) {
        return new WebDriverWait(driver, secs).until(ExpectedConditions.elementToBeClickable(by));
    }

    protected boolean verifyURLContains(String strURLValue) {
        return wait.until(ExpectedConditions.urlContains(strURLValue));
    }

    protected WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitForElement(By by, int secs) {
        return new WebDriverWait(driver, secs).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitForElementClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected boolean verifyText(String strExpectedText) {
        return driver.getPageSource().contains(strExpectedText);
    }

    public void waitForSeconds(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (Exception e) {
        }
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public boolean focusFrame() {
        boolean isFrameFocused = false;
        waitForSeconds(1);
        driver.switchTo().frame(0);
        isFrameFocused = true;
        return isFrameFocused;
    }


    public boolean focusFrame(WebElement element) {
        boolean isFrameFocused;
        waitForSeconds(1);
        driver.switchTo().frame(element);
        isFrameFocused = true;
        return isFrameFocused;
    }

    public boolean focusBackToDefaultFrame() {
        boolean isFrameFocused = false;
        waitForSeconds(1);
        driver.switchTo().defaultContent();
        isFrameFocused = true;
        return isFrameFocused;

    }

    public static boolean compareList(List<WebElement> lstElements, List<String> lstDataValues) {
        List<String> lstActualValue = new ArrayList<String>();
        List<String> lstExpectedValues = new ArrayList<String>();
        lstElements.stream().forEach(eleItem -> lstActualValue.add(eleItem.getText().trim()));
        lstDataValues.stream().forEach(strData -> lstExpectedValues.add(strData));
        return (lstActualValue.equals(lstExpectedValues));
    }

    public static boolean compareByAttributeValue(WebElement element, String strExpectedValue) {
        return element.getAttribute("value").equalsIgnoreCase(strExpectedValue);
    }

    public static boolean compareByText(WebElement element, String strExpectedValue) {
        return element.getText().equalsIgnoreCase(strExpectedValue);
    }

    public static boolean compareByContainsAttributeValue(WebElement element, String strExpectedValue) {
        return element.getAttribute("value").contains(strExpectedValue);
    }

    public static boolean compareByContainsText(WebElement element, String strExpectedValue) {
        return element.getText().contains(strExpectedValue);
    }

    public static WebDriver waitForframeToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) {
        WebDriver frameDriver = null;
        frameDriver = new WebDriverWait(driver, 60).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        return frameDriver;
    }

    public void mouseOver(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void mouseClick(WebElement element) {
        Actions actions = new Actions(driver);
        waitForElement(element);
        actions.moveToElement(element).click(element).build().perform();
    }

    public void waitAndMouseClick(By by) {
        WebElement elmnt = waitForElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(elmnt).click(elmnt).build().perform();
    }

    public String alertGetText() {
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();

    }

    public void refreshBrowser() {
        driver.navigate().refresh();
    }

    public void navigatesTo(String strURL) {
        try {
            driver.navigate().to(strURL);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void waitAndAcceptAlert() {
        waitForSeconds(2);
        wait.until(ExpectedConditions.alertIsPresent()).accept();

    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", element);
        waitForSeconds(1);
    }

    public void jsClick(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)",
                driver.findElement(by));
        waitForSeconds(1);
    }

    public void jsScroll() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,20000)");
        waitForSeconds(1);
    }


    public void jsScrollBy(int scrollValue) {
        String strScrollBy = new StringBuilder().append("\"window.scrollBy(0,").append(scrollValue).append(")\"").toString();
        System.out.println("Scroll by " + strScrollBy);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,500)");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        waitForSeconds(1);
    }

    public void jsMouseHover(WebElement element) {
        //String strJavaScript = "var element = arguments[0];"
        //+ "var mouseEventObj = document.createEvent('MouseEvents');"
        //+ "mouseEventObj.initEvent( 'mouseover', true, true );" + "element.dispatchEvent(mouseEventObj);";

        ((JavascriptExecutor) driver).executeScript("arguments[0].onmouseover()", element);
    }

    public void jsEnterValue(WebElement elmnt, String strValue) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", elmnt);
        elmnt.sendKeys(strValue);
    }

    public void ElementselectByVisibleString(WebElement element, String strValue) {
        Select select = new Select(element);
        select.getOptions().forEach(i -> System.out.println(">> Value: " + i.getText()));
        select.selectByVisibleText(strValue);
    }

    public void ElementselectByIndex(WebElement element, int i) {
        Select select = new Select(element);
        select.selectByIndex(i);
    }

    public void enterValue(WebElement elmnt, String strValue) {
        elmnt.click();
        elmnt.clear();
        waitForSeconds(1);
        elmnt.sendKeys(strValue);
    }

    public void waitForWindow(int inWindowIndex) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(inWindowIndex));
    }

    public void closeWindow(int inWindowIndex) {
        Object[] handles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) handles[inWindowIndex - 1]).close();

    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void focusWindow(int inWindowIndex) {
        Object[] handles = driver.getWindowHandles().toArray();

        driver.switchTo().window((String) handles[inWindowIndex - 1]);
    }

    public void waitForText(By by, String strExpectedText) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, strExpectedText));
    }

    public Boolean waitForInvisibilityOfElement(WebElement element) {
        return invisibleWait.until(ExpectedConditions.invisibilityOf(element));
    }
    public static boolean waitForElementDisappear(WebDriver driver, By by) {
        boolean isElementDisappear = false;
        try {

            new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(by));
            isElementDisappear = true;

        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return isElementDisappear;
    }
    public static boolean waitForElementToAppear(WebDriver driver, By by) {
        boolean isElementDisappear = false;
        try {

            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(by));
            isElementDisappear = true;

        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return isElementDisappear;
    }

    public static boolean waitForElementDisappear(WebDriver driver, WebElement element) {
        boolean isElementDisappear = false;
        try {

            new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOf(element));
            isElementDisappear = true;

        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return isElementDisappear;
    }

    public void waitForPresenceOfElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public boolean verifyElement(WebElement element) {
        boolean isVerify = false;
        try {
            isVerify = element.isDisplayed();
        } catch (NoSuchElementException error) {
            error.getMessage();
            isVerify = false;
        }
        return isVerify;
    }

    public List<WebElement> waitForElements(List<WebElement> element) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


    public List<WebElement> numberOfElementsToBeMoreThan(By by, int count) {
        List<WebElement> ele = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, count));
        return ele;
    }

    public boolean waitAndSelectByVisibleText(WebElement element, String strValue, By by, int count) {
        Boolean isSelected = false;
        numberOfElementsToBeMoreThan(by, count);
        ElementselectByVisibleString(element, strValue);
        isSelected = true;

        return isSelected;
    }

    public List<String> getOptionsInDropdown(WebElement element) {
        List<String> optionText = new ArrayList<>();
        Select select = new Select(element);
        select.getOptions().forEach(e -> {
            optionText.add(e.getText());
        });
        return optionText;
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

    public static boolean verifyStringMatchedWithListOfElement(List<WebElement> elements, String strValue) {
        boolean blResult = false;
        try {
            blResult = elements.stream().allMatch(element -> element.getText().trim().contains(strValue));
            System.out.println(blResult);
        } catch (Exception e) {
            blResult = false;
            e.printStackTrace();
        }
        return blResult;
    }

    public static boolean click(WebElement element) {
        boolean blResult = false;
        try {
            element.click();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public static boolean doubleClick(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public void keysInput(WebElement element, Keys strKey) {
        element.click();
        element.clear();
        waitForSeconds(1);
        element.sendKeys(strKey);
    }

    public void robotKey(WebElement element, int Keycode) {
        Robot robot = null;
        try {
            robot = new Robot();
            verifyElement(element);
            click(element);
            robot.keyPress(Keycode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void robotKeyRelease(int Keycode) {
        Robot robot = null;
        try {
            robot = new Robot();
            robot.keyRelease(Keycode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void robotKey(int Keycode) {
        Robot robot = null;
        try {
            robot = new Robot();
            robot.keyPress(Keycode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public boolean waitAndClick(WebElement element) {
        Boolean blResult = false;
        try {
            waitForElement(element);
            blResult = click(element);
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public static boolean keys(WebElement element, String strKey) {
        boolean blResult = false;
        try {
            element.sendKeys(strKey);
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public void jsScrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        waitForSeconds(1);
    }

    public String getBrowserName() {
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        System.out.println(browserName);
        return browserName;
    }

    /**
     * Created on 1/28/2020.
     */
    public void dragElement(WebElement source, WebElement destination) {
        Actions act = new Actions(driver);
        act.clickAndHold(source);
        act.moveToElement(destination);
        act.release(source);
        act.build().perform();
    }

    public void dragAndDrop(WebElement source, WebElement destination) {
        Actions act = new Actions(driver);
        act.dragAndDrop(source, destination).build().perform();
    }

    public boolean click(int X, int Y) {
        boolean blResult = false;
        try {
            Actions act = new Actions(driver);
            act.moveByOffset(X, Y).build().perform();
            act.click();
            act.build().perform();
//            act.moveByOffset(X, Y).click().build().perform();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public static DemoPageContainer pageContainer;

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

    public void jsScrollUp() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,-245)");
        waitForSeconds(1);
    }

    public boolean compareCurrentUrl(String urlToCompare) {
        String currentWindowUrl = driver.getCurrentUrl();
        return currentWindowUrl.equals(urlToCompare);

    }

    protected WebElement waitForElementFewSeconds(By by) {
        WebDriverWait tempWait = new WebDriverWait(this.driver, 30);
        return tempWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void jsScrollIntoView(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
        waitForSeconds(1);
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException
                | org.openqa.selenium.StaleElementReferenceException
                | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

    public void waitForElementToBeGone(WebElement element, int timeout) {
        if (isElementDisplayed(element)) {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
        }
    }

    public boolean compareCurrentUrlTill(String urlToCompare, String separator){
        String currentWindowUrl = driver.getCurrentUrl();
        String trimmedUrl = StringUtils.substringBefore(currentWindowUrl, separator) + separator;
        return trimmedUrl.equals(urlToCompare);
    }
    protected Boolean waitForInvisibility(By by) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public boolean notVerifyElement(By by) {
        boolean isVerify = false;
        try {
            WebElement element = driver.findElement(by);
            if (element.isDisplayed()) {
                isVerify = false;
            } else {
                isVerify = true;
            }

        } catch (NoSuchElementException error) {
            isVerify = true;
        }
        return isVerify;
    }

    public void swipeHorizontalMobileView(List<WebElement> lstElements) {
        System.out.println("Total Elements " + lstElements.size());
        WebElement toElement = lstElements.get(0);
        WebElement fromElement = lstElements.get(1);
        int centerY = fromElement.getLocation().y + (fromElement.getSize().height / 2);
        int startX = fromElement.getLocation().x;
        int endX = toElement.getLocation().x;
        TouchAction act = new TouchAction((PerformsTouchActions) driver);
        act.press(PointOption.point(startX, centerY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(endX, centerY))
                .release()
                .perform();
    }
    public static  String getRandomString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

}
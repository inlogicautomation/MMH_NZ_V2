package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HealthRecordsScreen extends BaseScreen {


    public HealthRecordsScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Health Records']")
    protected WebElement elmntHealthRecords;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='HELP']")
    protected WebElement btnHelp;

    @AndroidFindBy(xpath = "(//android.widget.Image[@text='Pathology Tests Explained'])[1]")
    protected WebElement elmntPathologyTestsExplained;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Close Button']")
    protected WebElement iconClose;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1' or @text='2']")
    protected List<WebElement> lstHealthRecordNo;

    String strContainsTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strButtonTextLocator = new StringBuilder()
            .append("//android.widget.Button[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strRecordsViewLocator = new StringBuilder()
            .append("(//android.widget.TextView[contains(@text,'")
            .append("<<TEXT>>").append("')]/following::android.widget.TextView[@text='View'])[1]").toString();


    public void tapHealthRecordOption(String strHealthRecordOption) {
        waitForElements(lstHealthRecordNo);
        waitForSecond(2);
        waitForElement(elmntHealthRecords);
        waitForElementIgnoreStale(elmntHealthRecords);
        WebElement elmntHealthRecords = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strHealthRecordOption)));
        waitForElementClickable(elmntHealthRecords);
        click(elmntHealthRecords);
    }

    public boolean verifyRecords(String strHealthRecordOption, List<String> lstRecords) {
        boolean blResult = false;
        waitForElement(By.xpath(strButtonTextLocator.replace("<<TEXT>>", strHealthRecordOption)));

        for (String strRecord : lstRecords) {
            WebElement elmntRecord = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strRecord)));
            blResult = verifyElement(elmntRecord);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public void tapRecordView(List<String> lstRecords) {
        WebElement elmntRecord = waitForElement(By.xpath(strRecordsViewLocator.replace("<<TEXT>>", lstRecords.get(0))));
        click(elmntRecord);
    }

    public boolean verifyRecordDetails(List<String> lstRecordDetails) {
        boolean blResult = false;

        for (String strRecordDetail : lstRecordDetails) {
            WebElement elmntDetail = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strRecordDetail)));
            blResult = verifyElement(elmntDetail);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public void tapHelp() {
        waitForElement(btnHelp);
        click(btnHelp);
    }

    public boolean verifyPathologyTestsExplained() {
        waitForElement(elmntPathologyTestsExplained);
        takeScreenshot(driver);
        return verifyElement(elmntPathologyTestsExplained);
    }

    public void tapClose() {
        waitForElement(iconClose);
        click(iconClose);
    }
}

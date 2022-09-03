package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import cap.utilities.TestDataUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class MessageScreen extends BaseScreen {

    public MessageScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@text='Inbox'])[1]")
    protected WebElement elmntInbox;

    @AndroidFindBy(xpath = "//android.widget.TabWidget/preceding::android.widget.Button[1]")
    protected WebElement iconCompose;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Location']")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select a Service']")
    protected WebElement elmntSelectService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']")
    protected WebElement popUpInformation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Staff']")
    protected WebElement elmntSelectStaff;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Request']")
    protected WebElement elmntRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Message*']/following::android.widget.EditText")
    protected WebElement txtMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ATTACH FILES')]")
    protected WebElement lnkAttachFiles;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Choose From Gallery')]")
    protected WebElement elmntChooseFromGallery;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show roots']")
    protected WebElement iconHamburger;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Downloads' and @resource-id='android:id/title']")
    protected WebElement optDownloads;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'SEND')]")
    protected WebElement btnSend;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Message has been sent Successfully']")
    protected WebElement lblSuccessfullMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Role']")
    protected WebElement elmntSelectRole;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Patient']")
    protected WebElement elmntSelectPatient;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    protected WebElement txtPatient;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='PaperClip']/preceding-sibling::android.view.View")
    protected WebElement lnkAttachedFile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='download successfully']")
    protected WebElement elmntAttachedFile;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='archive outline Archive']")
    protected WebElement iconArchive;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    protected WebElement btnYes;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='return up back outline Reply']")
    protected WebElement iconReply;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ATTACH FILES')]/preceding::android.widget.EditText[1]")
    protected WebElement txtReplyMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    protected WebElement iconNotification;

    String strSentMessageLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<STAFF>>")
            .append("']/following-sibling::android.widget.TextView[@text='")
            .append("<<SERVICE>>")
            .append("']/following-sibling::android.widget.TextView[@text='")
            .append("<<MESSAGE>>")
            .append("']").toString();

    String strReceivedMessageLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,'")
            .append("<<SERVICE>>")
            .append("')]/following-sibling::android.widget.TextView[@text='")
            .append("<<MESSAGE>>")
            .append("']").toString();


    String strInboxTabLocator = new StringBuilder()
            .append("//android.widget.TabWidget/descendant::android.widget.Button[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strContainsTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strLocationLocator = new StringBuilder()
            .append("//android.widget.Image/preceding-sibling::android.view.View/android.widget.TextView[@text='")
            .append("<<LOCATION>>").append("']").toString();


    public void tapTabInInbox(String strTab) {
        waitForSecond(3);
        waitForElement(elmntInbox);
        WebElement elmntTab = waitForElement(By.xpath(strInboxTabLocator.replace("<<TEXT>>", strTab)));
        click(elmntTab);
    }

    public void tapCompose() {
        waitForElement(iconCompose);
        click(iconCompose);
    }

    public void selectLocation(String strLocation) {
        waitForSecond(5);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = waitForElement(By.xpath(strLocationLocator.replace("<<LOCATION>>", strLocation)));
        click(elmntLocation);
    }

    public void selectService(String strService) {
        waitForElement(elmntSelectService);
        WebElement elmntService = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strService)));
        click(elmntService);
    }

    public void verifyInformation() {
        waitForSecond(5);
        waitForElement(popUpInformation);
        takeScreenshot(driver);
        verifyElement(popUpInformation);
    }

    public void selectStaff(String strStaff) {
        waitForElement(elmntSelectStaff);
        WebElement elmntStaff = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strStaff)));
        click(elmntStaff);
    }

    public boolean verifyDetails(List<String> lstMessageDetails) {
        waitForElement(elmntRequest);
        boolean blResult = false;
        for (String strMessageDetail : lstMessageDetails) {
            WebElement elmntMessageDetail = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strMessageDetail)));
            blResult = verifyElement(elmntMessageDetail);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        return blResult;
    }

    public void enterMessage(String strMessage) {
        waitForElement(txtMessage);
        enterValue(txtMessage, strMessage);
    }

    public void uploadFile(String strImage) {
        pushFileToDevice(strImage);
        waitForElement(lnkAttachFiles);
        click(lnkAttachFiles);
        waitForElement(elmntChooseFromGallery);
        click(elmntChooseFromGallery);
        waitForElement(iconHamburger);
        click(iconHamburger);
        waitForElementIgnoreStale(optDownloads);
        click(optDownloads);
        waitForSecond(2);
        WebElement elmntImage = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strImage)));
        click(elmntImage);

    }

    public void tapSend() {
        waitForSecond(5);
        waitForElement(btnSend);
        click(btnSend);
    }

    public boolean verifySuccessfullMessage() {
        waitForSecond(3);
        takeScreenshot(driver);
//        waitForElementIgnoreStale(lblSuccessfullMessage);
        return verifyElement(lblSuccessfullMessage);
    }

    public boolean verifySentMessage(List<String> lstSentMessage) {
        WebElement elmntSentMessageInfo = waitForElement(By.xpath(strSentMessageLocator
                .replace("<<STAFF>>", lstSentMessage.get(0))
                .replace("<<SERVICE>>", lstSentMessage.get(1))
                .replace("<<MESSAGE>>", TestDataUtil.getValue(lstSentMessage.get(2)))));
        takeScreenshot(driver);
        return verifyElement(elmntSentMessageInfo);
    }

    public void selectRole(String strRole) {
        waitForElement(elmntSelectRole);
        waitForSecond(5);
        WebElement elmntRole = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strRole)));
        click(elmntRole);
    }

    public void enterPatient(String strRole) {
        waitForSecond(3);
        waitForElement(elmntSelectPatient);
        waitForElement(txtPatient);
        enterValue(txtPatient, strRole);
        WebElement elmntRole = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", strRole)));
        click(elmntRole);
    }


    public boolean verifyReceivedMessage(List<String> lstReceiveMessage) {
        By elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));

        waitForSecond(5);
        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntReceivedMessageInfo))) {
            swipeUpShort();
            if (!exitLoop(600000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }

        takeScreenshot(driver);
        return verifyElement(elmntReceivedMessageInfo);
    }

    public boolean tapReceivedMessage(List<String> lstReceiveMessage) {
        By elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));

        waitForSecond(5);
        long startTime = System.currentTimeMillis();
        while (!(verifyElement(elmntReceivedMessageInfo))) {
            swipeUpShort();
            if (!exitLoop(600000, startTime)) {
                System.out.println("Loop Break 2");
                break;
            }
        }
        takeScreenshot(driver);
        return click(elmntReceivedMessageInfo);
    }

    public boolean verifySpecificMsgDetails(List<String> lstMessageDetails) {
        boolean blResult = false;
        for (String strMessageDetail : lstMessageDetails) {
            WebElement elmntMessageDetail = waitForElement(By.xpath(strContainsTextViewLocator.replace("<<TEXT>>", TestDataUtil.getValue(strMessageDetail))));
            blResult = verifyElement(elmntMessageDetail);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public void tapAttachedFile() {
        waitForElement(lnkAttachedFile);
        click(lnkAttachedFile);
    }

    public boolean verifyDownloadedFile() {
        waitForElement(elmntAttachedFile);
        return verifyElement(elmntAttachedFile);
    }

    public void tapArchiveIcon() {
        waitForSecond(5);
        waitForElement(iconArchive);
        waitForSecond(2);
        click(iconArchive);
    }

    public void tapYes() {
        waitForElement(btnYes);
        click(btnYes);
    }

    public void tapReplyIcon() {
        waitForElement(iconReply);
        click(iconReply);
    }

    public void enterReplyMessage(String strReplyMessage) {
        waitForElement(txtReplyMessage);
        enterValue(txtReplyMessage, strReplyMessage);
    }

    public void tapNotification() {
        waitForElement(iconNotification);
        click(iconNotification);
    }


}

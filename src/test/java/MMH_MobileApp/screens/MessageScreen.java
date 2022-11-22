package MMH_MobileApp.screens;

import cap.common.BaseScreen;
import cap.utilities.TestDataUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MessageScreen extends BaseScreen {

    public MessageScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@text='Inbox'])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Inbox'])[1]")
    protected WebElement elmntInbox;

    @AndroidFindBy(xpath = "//android.widget.TabWidget/preceding::android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Inbox'])[1]/following-sibling::XCUIElementTypeButton[1]")
    protected WebElement iconCompose;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Location']")
    @iOSXCUITFindBy(id = "Select Location")
    protected WebElement elmntSelectLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select a Service']")
    @iOSXCUITFindBy(id = "Select a Service")
    protected WebElement elmntSelectService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Information']")
    protected WebElement popUpInformation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Staff']")
    @iOSXCUITFindBy(id = "Select Staff")
    protected WebElement elmntSelectStaff;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Request']")
    @iOSXCUITFindBy(id = "Request")
    protected WebElement elmntRequest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Message*']/following::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Message']/following:: XCUIElementTypeTextView[1]")
    protected WebElement txtMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ATTACH FILES')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Attach files')]")
    protected WebElement lnkAttachFiles;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Choose From Gallery')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Choose From Gallery')]")
    protected WebElement elmntChooseFromGallery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Photo Library']")
    protected WebElement elmntPhotoLibrary;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
    protected WebElement imgFirst;

    @iOSXCUITFindBy(id = "Add")
    protected WebElement btnAdd;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show roots']")
//    @iOSXCUITFindBy(id = "")
    protected WebElement iconHamburger;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Downloads' and @resource-id='android:id/title']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"attach outline Attach files\"]/preceding-sibling::XCUIElementTypeTextView[1]")
    protected WebElement optDownloads;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'SEND')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Send')]")
    protected WebElement btnSend;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Message has been sent Successfully']")
    @iOSXCUITFindBy(id = "Your Message has been sent Successfully")
    protected WebElement lblSuccessfullMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Role']")
    @iOSXCUITFindBy(id = "Select Role")
    protected WebElement elmntSelectRole;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Patient']")
    @iOSXCUITFindBy(id = "Select Patient")
    protected WebElement elmntSelectPatient;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    @iOSXCUITFindBy(id = "search text")
    protected WebElement txtPatient;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='PaperClip']/preceding-sibling::android.view.View")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='separator']/following::XCUIElementTypeLink")
    protected WebElement lnkAttachedFile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"log in outline Log In\"]")
    protected WebElement elmntLoginLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='download successfully']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='download successfully']")
    protected WebElement elmntAttachedFile;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='archive outline Archive']")
    @iOSXCUITFindBy(id = "archive outline Archive")
    protected WebElement iconArchive;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(id = "Yes")
    protected WebElement btnYes;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='return up back outline Reply']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='return up back outline Reply']")
    protected WebElement iconReply;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ATTACH FILES')]/preceding::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Attach files')]/preceding:: XCUIElementTypeTextView[2]")
    protected WebElement txtReplyMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    @iOSXCUITFindBy(id = "notifications outline")
    protected WebElement iconNotification;

    @iOSXCUITFindBy(id = "Done")
    protected WebElement btnDone;

    String strSentMessageLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<STAFF>>")
            .append("']/following-sibling::android.widget.TextView[@text='")
            .append("<<SERVICE>>")
            .append("']/following-sibling::android.widget.TextView[@text='")
            .append("<<MESSAGE>>")
            .append("']").toString();

    String strSentMessageLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<STAFF>>")
            .append("']//following::XCUIElementTypeStaticText[@name='")
            .append("<<SERVICE>>")
            .append("']//following::XCUIElementTypeStaticText[@name='")
            .append("<<MESSAGE>>")
            .append("']").toString();

    String strReceivedMessageLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,'")
            .append("<<SERVICE>>")
            .append("')]/following-sibling::android.widget.TextView[@text='")
            .append("<<MESSAGE>>")
            .append("']").toString();

    String strReceivedMessageLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[contains(@name,'")
            .append("<<SERVICE>>")
            .append("')]//following::XCUIElementTypeStaticText[@name='")
            .append("<<MESSAGE>>")
            .append("']").toString();

    String strReplyMessageLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[contains(@name,'")
            .append("<<SERVICE>>")
            .append("')]//following::XCUIElementTypeStaticText[contains(@name,'")
            .append("<<MESSAGE>>")
            .append("')]").toString();


    String strInboxTabLocator = new StringBuilder()
            .append("//android.widget.TabWidget/descendant::android.widget.Button[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strInboxTabLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeOther[not(@name)]/XCUIElementTypeButton[@name='")
            .append("<<TEXT>>").append("']").toString();

    String strContainsTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[contains(@text,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strContainsTextViewLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[contains(@name,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strInboxDetailsLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='Prev']/preceding::XCUIElementTypeStaticText[@name=\"")
            .append("<<TEXT>>").append("\"][1]").toString();

    String strRequestDetailsLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeButton[@name='Request']//following::XCUIElementTypeStaticText[contains(@name,\"")
            .append("<<TEXT>>").append("\")]").toString();

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    String strTextViewLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeStaticText[@name='")
            .append("<<TEXT>>").append("']").toString();

    String strLocationLocator = new StringBuilder()
            .append("//android.widget.Image/preceding-sibling::android.view.View/android.widget.TextView[@text='")
            .append("<<LOCATION>>").append("']").toString();

    String strLocationLocatorIOS = new StringBuilder()
            .append("//XCUIElementTypeImage[@name='cart']/preceding::XCUIElementTypeStaticText[@name='")
            .append("<<LOCATION>>").append("'][1]").toString();


    public void tapTabInInbox(String strTab) {
        waitForSecond(3);
        waitForElement(elmntInbox);
        WebElement elmntTab = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntTab = waitForElement(By.xpath(strInboxTabLocator.replace("<<TEXT>>", strTab)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            elmntTab = waitForElement(By.xpath(strInboxTabLocatorIOS.replace("<<TEXT>>", strTab)));
        }
        click(elmntTab);
    }

    public void tapCompose() {
        waitForElement(iconCompose);
        click(iconCompose);
    }

    public void selectLocation(String strLocation) {
        waitForSecond(5);
        waitForElement(elmntSelectLocation);
        WebElement elmntLocation = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntLocation = waitForElement(By.xpath(strLocationLocator.replace("<<LOCATION>>", strLocation)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            elmntLocation = waitForElement(By.xpath(strLocationLocatorIOS.replace("<<LOCATION>>", strLocation)));
        }
        click(elmntLocation);
    }

    public void selectService(String strService) {
        waitForElement(elmntSelectService);
        WebElement elmntService = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntService = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strService)));
        }  else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            elmntService = waitForElement(By.xpath(strTextViewLocatorIOS.replace("<<TEXT>>", strService)));
        }
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
        WebElement elmntStaff = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntStaff = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strStaff)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            elmntStaff = waitForElement(By.xpath(strTextViewLocatorIOS.replace("<<TEXT>>", strStaff)));
        }
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

    public boolean verifyDetailsIOS(List<String> lstMessageDetails) {
        waitForElement(elmntRequest);
        boolean blResult = false;
        for (String strMessageDetail : lstMessageDetails) {
            WebElement elmntMessageDetail = waitForElement(By.xpath(strRequestDetailsLocatorIOS.replace("<<TEXT>>", strMessageDetail)));
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
        if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            waitForElement(btnDone);
            click(btnDone);
        }
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

    public void uploadFileIOS(String strImage) {
//        pushFileToDeviceIOS(strImage);
        waitForElement(lnkAttachFiles);
        click(lnkAttachFiles);
        waitForElement(elmntChooseFromGallery);
        click(elmntChooseFromGallery);
        waitForElement(btnDone);
        click(btnDone);
        waitForElement(elmntPhotoLibrary);
        click(elmntPhotoLibrary);
        waitForSecond(3);
        waitForElement(imgFirst);
        click(imgFirst);
        waitForElement(btnAdd);
        click(btnAdd);
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

    public boolean verifySuccessfullMessageIOS() {
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

    public boolean verifySentMessageIOS(List<String> lstSentMessage) {
        System.out.println("elmntSentMessageInfo>> "+By.xpath(strSentMessageLocatorIOS
                .replace("<<STAFF>>", lstSentMessage.get(0))
                .replace("<<SERVICE>>", lstSentMessage.get(1))
                .replace("<<MESSAGE>>", TestDataUtil.getValue(lstSentMessage.get(2)))));
        WebElement elmntSentMessageInfo = waitForElement(By.xpath(strSentMessageLocatorIOS
                .replace("<<STAFF>>", lstSentMessage.get(0))
                .replace("<<SERVICE>>", lstSentMessage.get(1))
                .replace("<<MESSAGE>>", TestDataUtil.getValue(lstSentMessage.get(2)))));
        takeScreenshot(driver);
        return verifyElement(elmntSentMessageInfo);
    }

    public void selectRole(String strRole) {
        waitForElement(elmntSelectRole);
        waitForSecond(5);
        WebElement elmntRole = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntRole = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", strRole)));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            elmntRole = waitForElement(By.xpath(strTextViewLocatorIOS.replace("<<TEXT>>", strRole)));
        }
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

    public void enterPatientIOS(String strRole) {
        waitForSecond(3);
        waitForElement(elmntSelectPatient);
        waitForElement(txtPatient);
        enterValue(txtPatient, strRole);
        WebElement elmntRole = waitForElement(By.xpath(strContainsTextViewLocatorIOS.replace("<<TEXT>>", strRole)));
        click(elmntRole);
    }


    public boolean verifyReceivedMessage(List<String> lstReceiveMessage) {
        By elmntReceivedMessageInfo = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            System.out.println("elmntReceivedMessageInfo>> "+By.xpath(strReceivedMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1)))));
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        }
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

    public boolean verifyReplyMessage(List<String> lstReceiveMessage) {
        By elmntReceivedMessageInfo = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            System.out.println("elmntReceivedMessageInfo>> "+By.xpath(strReplyMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1)))));
            elmntReceivedMessageInfo = By.xpath(strReplyMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        }
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
        By elmntReceivedMessageInfo = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            System.out.println("elmntReceivedMessageInfo>> "+By.xpath(strReceivedMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1)))));
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        }
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

    public boolean tapReplyMessage(List<String> lstReceiveMessage) {
        By elmntReceivedMessageInfo = null;
        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
            elmntReceivedMessageInfo = By.xpath(strReceivedMessageLocator
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            System.out.println("elmntReceivedMessageInfo>> "+By.xpath(strReplyMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1)))));
            elmntReceivedMessageInfo = By.xpath(strReplyMessageLocatorIOS
                    .replace("<<SERVICE>>", lstReceiveMessage.get(0))
                    .replace("<<MESSAGE>>", TestDataUtil.getValue(lstReceiveMessage.get(1))));
        }
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

    public boolean verifySpecificMsgDetailsIOS(List<String> lstMessageDetails) {
        boolean blResult = false;
        for (String strMessageDetail : lstMessageDetails) {
            WebElement elmntMessageDetail = waitForElement(By.xpath(strInboxDetailsLocatorIOS.replace("<<TEXT>>", TestDataUtil.getValue(strMessageDetail))));
            blResult = verifyElement(elmntMessageDetail);
            if (blResult == false) {
                takeScreenshot(driver);
                return blResult;
            }
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean verifyGroupMsgDetailsIOS(List<String> lstMessageDetails) {
        boolean blResult = false;
        for (String strMessageDetail : lstMessageDetails) {
            WebElement elmntMessageDetail = waitForElement(By.xpath(strTextViewLocatorIOS.replace("<<TEXT>>", TestDataUtil.getValue(strMessageDetail))));
            blResult = verifyElement(elmntMessageDetail);
            navigateToBack();
            waitForSecond(6);
//            waitForElement(elmntLoginLink);
//            click(elmntLoginLink);
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
        waitForElementClickable(iconArchive);
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
        if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
            waitForElement(btnDone);
            click(btnDone);
        }
    }

    public void tapNotification() {
        waitForElement(iconNotification);
        click(iconNotification);
    }


}

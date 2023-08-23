package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProviderMessagesPage extends BasePage {
    public ProviderMessagesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//span[text()='Compose']")
    protected WebElement txtCompose;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attach Files')]")
    protected WebElement btnAttachFile;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Enable Out Of Office Reply')]/preceding-sibling::div/input")
    protected WebElement chkboxOutOfOfficeReply;

    @FindBy(how = How.XPATH, using = "(//iframe)[2]")
    protected WebElement frameOutOfOffice;

    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Out of Office Settings')]")
    protected WebElement drpDownOutOfOfficeSettings;

    protected String messageText = new StringBuilder()
            .append("//body//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "(//span[text()=' Save as Draft'])[1]")
    protected WebElement btnDraftMessage;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement DraftMessageOkbutton;


    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "(//h1[text()='Inbox'])[1]")
    protected WebElement txtInboxPage;

    @FindBy(how = How.XPATH, using = "(//mat-icon[text()='attach_file']//following::div//a[@class='download-file mail-download-file'])[1]")
    protected WebElement txtAttachFile;

    @FindBy(how = How.XPATH, using = "(//span[text()='Reply'])[1]")
    protected WebElement txtReplyButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Send message']")
    protected WebElement txtReplySendMessageButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sent')]")
    protected WebElement elmntSentDoctor;

    @FindBy(how = How.XPATH, using = "(//h1[text()='Sent Messages'])[1]")
    protected WebElement txtSent;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Dr. Gp2White!')]")
    })
    protected WebElement txtProviderPortalWelcomePage;
    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;

    protected String elmntDoctorSentSubject = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]")
            .toString();

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror'][1]//p)[2]")
    protected WebElement txtReplyBodyMessage;

    @FindBy(how = How.XPATH, using = "//a[text()=' Draft']")
    protected WebElement ElementDraftPage;


    @FindBy(how = How.XPATH, using = "(//h1[text()='Draft'])[1]")
    protected WebElement txtDraftPage;

    protected String VerifyDoctorDraftBodyMessage = new StringBuilder()
            .append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]")
            .toString();


    protected String elmntDoctorDraftSubject = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]")
            .toString();

    protected String elmntDoctorInboxSubject = new StringBuilder()
            .append("(//b[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]")
            .toString();

    protected String InboxMessageSubject = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Draft saved successfully')]")
    protected WebElement txtDraftSavedSuccessMessagePopup;

    @FindBy(how = How.XPATH, using = "//span[text()=' Send message']")
    protected WebElement btnSendMessage;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Your Message has been sent Successfully')]")
    protected WebElement txtComposeSuccessMessage;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Message sent successfully')]")
    protected WebElement btnSentSuccessfullyPopup;

    protected String btnSentSuccessfullyPopup1 = "//p[contains(text(),'Message sent successfully')]";

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome')])[1]")
    protected WebElement txtMyHomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Inbox')]")
    protected WebElement elmntInboxDoctor;

    @FindBy(how = How.XPATH, using = "//span[text()='Compose']")
    protected WebElement elmntComposeDoctor;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),' Settings')]")
    protected WebElement elmntDoctorMessageSetting;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Message Settings')]")
    protected WebElement txtDoctorMessageSetting;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Compose Email')])[1]")
    protected WebElement txtProviderComposeEmail;








    public boolean clickProviderDraftMessage() {
        boolean blResult = false;
        try {
//            waitForSeconds(2);
//            waitForElement(txtCompose);
            jsScrollIntoView(btnDraftMessage);
            waitForElementClickable(btnDraftMessage);
            jsClick(btnDraftMessage);
            waitForElement(DraftMessageOkbutton);
            click(DraftMessageOkbutton);
//            waitForSeconds(1);
//            waitForElement(txtComposeSuccessMessage);
//            waitForElement(btnHome);
//            waitForElementClickable(btnHome);
//            click(btnHome);
//            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(txtDraftSavedSuccessMessagePopup);
            blResult =true;

            System.out.println("\nSuccessfully Clicked the send message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the send message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToDraftItems() {
        boolean blResult = false;
        try {
            waitForElement(ElementDraftPage);
            waitForElementClickable(ElementDraftPage);
            jsClick(ElementDraftPage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtDraftPage);
            blResult = verifyElement(txtDraftPage);
            System.out.println("Successfully navigated to the Sent Message Page");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the Sent Message Page");
        }
        return blResult;
    }

    public boolean verifyDraftMessages(String strMessage) {
        boolean blResult = false;
        try {
//            waitForSeconds(3);
            waitForElement(txtDraftPage);
            driver.navigate().refresh();
            waitForSeconds(3);
            waitForElement(txtDraftPage);
            System.out.println(elmntDoctorDraftSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorDraftSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            blResult = verifyElement(Subject);
            System.out.println(">>>>>>>>>>>>>>>>>>>>"+Subject);
            click(Subject);
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean verifyDraftBodyMessages(List<String> strMessage) {
        boolean blResult = false;
        try {
            System.out.println("List Message Details >>> :: " + strMessage);
            waitForSeconds(3);
            System.out.println(VerifyDoctorDraftBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(6))));
            WebElement SubjectBodyMessage = waitForElement(By.xpath(VerifyDoctorDraftBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(6)))));
            waitForElement(SubjectBodyMessage);
            blResult = verifyElement(SubjectBodyMessage);
            System.out.println("Successfully verified sent Body Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Body Message");
        }
        return blResult;
    }

    public boolean verifyReplyDraftBodyMessages(List<String> strMessage) {
        boolean blResult = false;
        try {
            System.out.println("List Message Details >>> :: " + strMessage);
            waitForSeconds(3);
            System.out.println(VerifyDoctorDraftBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(10))));
            WebElement SubjectBodyMessage = waitForElement(By.xpath(VerifyDoctorDraftBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(10)))));
            waitForElement(SubjectBodyMessage);
            blResult = verifyElement(SubjectBodyMessage);
            System.out.println("Successfully verified sent Body Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Body Message");
        }
        return blResult;
    }

    public boolean clickSendMessageAndNavigateToHomePage() {
        boolean blResult = false;
        try {
//            waitForSeconds(2);
//            waitForElement(txtCompose);
            jsScrollIntoView(btnSendMessage);
            waitForElementClickable(btnSendMessage);
            jsClick(btnSendMessage);
//            waitForSeconds(1);
            waitForElementToAppear(driver,By.xpath(btnSentSuccessfullyPopup1));
            waitForElement(btnSentSuccessfullyPopup);
            verifyElement(btnSentSuccessfullyPopup);
//            waitForElement(btnHome);
//            waitForElementClickable(btnHome);
//            click(btnHome);
//            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtInboxPage);
            blResult = verifyElement(txtInboxPage);

            System.out.println("\nSuccessfully Clicked the send message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the send message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifySentSuccessfully() {
        waitForElementToAppear(driver,By.xpath(btnSentSuccessfullyPopup1));
        waitForElement(btnSentSuccessfullyPopup);
        return verifyElement(btnSentSuccessfullyPopup);
    }

    public boolean navigateToInboxMessageForDoctor() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
//            waitForElement(elmntsMenu);
//            waitForElement(elmntPraticeMenuDoctor);
//            jsClick(elmntPraticeMenuDoctor);
            waitForSeconds(3);
            jsScrollIntoView(elmntInboxDoctor);
            waitForElementClickable(elmntInboxDoctor);
            jsClick(elmntInboxDoctor);
            waitForSeconds(1);
            waitForElement(txtCompose);
            blResult = verifyElement(txtCompose);
            System.out.println("Successfully navigated to the compose");
        } catch (Exception e) {
            System.out.println("Failed to navigate the compose");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyProviderInboxMessages(String strMessage) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>"+strMessage);
            waitForElement(txtInboxPage);
            System.out.println(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            jsClick(Subject);
            blResult =true;
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean verifyProvidersetupServiceInboxMessages(String strMessage) {
        boolean blResult = false;
        try {
            System.out.println(">>>>>>>>>>>>>"+strMessage);
            waitForElement(txtInboxPage);
            System.out.println(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            jsClick(Subject);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("X Path-inboxSubject 2 >>> :: " + InboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(InboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(inboxReceivedSubject);
            takeScreenshot(driver);
            blResult = verifyElement(inboxReceivedSubject);
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean clickAttachButtonInboxMessages() {
        boolean blResult = false;
        try {

            waitForElement(txtAttachFile);
            jsClick(txtAttachFile);
            waitForElement(txtReplyButton);
            jsClick(txtReplyButton);

            blResult =true;
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean EnterReplyBodyMessages(String strMessage) {
        boolean blResult = false;
        try {
            System.out.println("List Message Details >>> :: " + strMessage);
            jsScrollIntoView(txtReplyBodyMessage);
            waitForSeconds(3);
            txtReplyBodyMessage.click();
            waitForSeconds(3);
            driver.switchTo().activeElement().clear();
            waitForSeconds(3);
            driver.switchTo().activeElement().sendKeys(strMessage);

            blResult = true;
            System.out.println("Successfully verified sent Body Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Body Message");
        }
        return blResult;
    }

    public boolean clickSendMessageButtonInboxMessages() {
        boolean blResult = false;
        try {
            jsScrollIntoView(txtReplySendMessageButton);
            waitForElement(txtReplySendMessageButton);
            jsClick(txtReplySendMessageButton);
            blResult =true;
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean navigateToSentItems() {
        boolean blResult = false;
        try {
            waitForElement(txtInboxPage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSentDoctor);
            waitForElementClickable(elmntSentDoctor);
            jsClick(elmntSentDoctor);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtSent);
            blResult = verifyElement(txtSent);
            System.out.println("Successfully navigated to the inbox");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the inbox");
        }
        return blResult;
    }
    public boolean verifySentMessages(String strMessage) {
        boolean blResult = false;
        try {
//            waitForSeconds(3);
//            waitForElement(txtSent);
//            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(elmntDoctorSentSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorSentSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            blResult = verifyElement(Subject);
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{
            if (isElementDisplayed(txtProviderPortalWelcomePage)) {
                verifyElement(txtProviderPortalWelcomePage);
                waitForSeconds(3);
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForSeconds(3);
                blResult = verifyElement(txtProviderPortalWelcomePage);
            }
            if (!isElementDisplayed(txtProviderPortalWelcomePage)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                System.out.println("Successfully click Logo");
                waitForSeconds(3);
                blResult=verifyElement(txtProviderPortalWelcomePage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToDoctorMessageSetting() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntInboxDoctor);
            waitForElementClickable(elmntInboxDoctor);
            click(elmntInboxDoctor);
            waitForSeconds(1);
            waitForElementClickable(elmntDoctorMessageSetting);
            click(elmntDoctorMessageSetting);
            waitForSeconds(1);
        waitForElement(txtDoctorMessageSetting);
            blResult = verifyElement(txtDoctorMessageSetting);
            System.out.println("Successfully navigated to messages settings >>>>> :: ");
        } catch (Exception e) {
            System.out.println("Failed navigate to messages settings >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean navigateToComposeMessageForDoctor() {
        boolean blResult = false;
        try {
            waitForElement(txtMyHomePage);
            jsScrollIntoView(elmntInboxDoctor);
            waitForElement(elmntInboxDoctor);
            jsClick(elmntInboxDoctor);
            waitForElement(elmntComposeDoctor);
            jsClick(elmntComposeDoctor);
            waitForElement(txtProviderComposeEmail);
            blResult = verifyElement(txtProviderComposeEmail);
            System.out.println("Successfully navigated to the compose");
        } catch (Exception e) {
            System.out.println("Failed to navigate the compose");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyEnteredProviderSignatureMessage(String strMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
            waitForElement(btnAttachFile);
//            driver.switchTo().frame(frameCompose);
            WebElement txtSignature = waitForElement(By.xpath(messageText.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            jsScrollIntoView(txtSignature);
            waitForElement(txtSignature);
            verifyElement(txtSignature);
            String signature = txtSignature.getText();
            System.out.println("verify Entered Signature Message >>> :: " + TestDataUtil.getValue(strMessage) + "::" + signature);
            takeScreenshot(driver);
            if (signature.equalsIgnoreCase(TestDataUtil.getValue(strMessage))) {
                System.out.println("Verified Signature text Message successfully >>> ::");
                blResult = true;
            }
//            driver.switchTo().parentFrame();

        } catch (Exception e) {
            System.out.println("Failed to verify signature text message");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProviderOutOfOfficeSetting() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            click(drpDownOutOfOfficeSettings);
            waitForSeconds(1);
            waitForElement(chkboxOutOfOfficeReply);


            System.out.println("Out of Office Setting was selected >>> ::");
            blResult = verifyElement(chkboxOutOfOfficeReply);

        } catch (Exception e) {
            System.out.println("Failed to select Out of Office Setting >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyEnteredProviderOutOfOfficeMessage(String strMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(chkboxOutOfOfficeReply);
            driver.switchTo().frame(frameOutOfOffice);
            System.out.println("Xpath for Text Out Of Office >>>> :: " + messageText.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement txtOutOfMessage = waitForElement(By.xpath(messageText.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            jsScrollIntoView(txtOutOfMessage);
            waitForElement(txtOutOfMessage);
            verifyElement(txtOutOfMessage);
            String outOfMessageText = txtOutOfMessage.getText();
            System.out.println("verify Entered Signature Message >>> :: " + TestDataUtil.getValue(strMessage) + "::" + outOfMessageText);
            takeScreenshot(driver);
            if (outOfMessageText.equalsIgnoreCase(TestDataUtil.getValue(strMessage))) {
                System.out.println("Verified Out of Office text Message successfully >>> ::");
                blResult = true;
            }
            driver.switchTo().parentFrame();

        } catch (Exception e) {
            System.out.println("Failed to verify Out Of Office text message");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyInboxMessages(String strMessage) {
        boolean blResult = false;
        try {
//            waitForSeconds(3);
//            waitForElement(txtSent);
//            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorInboxSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            blResult = verifyElement(Subject);
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }


}

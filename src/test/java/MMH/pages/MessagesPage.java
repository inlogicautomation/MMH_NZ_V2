package MMH.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MessagesPage extends BasePage {

    public MessagesPage(WebDriver driver) {
        super(driver);
    }

    public static String strRandomSubjectMessage;
    public static String strRandomARMessage;
    public static String strRandomOutOfficeMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Messages')]")
    protected WebElement elmntMessages;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Draft')]")
    protected WebElement elmntDraft;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Group Message')])[1]")
    protected WebElement elmntGroupMessagePatient;


//    @FindAll({
//            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Group Messages')])[2]"),
//            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Group Messages')])[1]")
//
//    })
//    protected WebElement txtGroupMessagePatient;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Group Messages')]")
    protected WebElement txtGroupMessagePatient;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Compose Email')])[2]")
    protected WebElement txtComposeMailForMobile;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Setting')]")
    protected WebElement elmntMessagesSettings;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Settings')]")
    protected WebElement txtSettings;

    @FindBy(how = How.XPATH, using = "//h1[@class='view-info']")
    protected WebElement txtComposeMail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose')]")
    protected WebElement elmntComposePatient;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Inbox')]")
    protected WebElement elmntInboxPatient;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sent')]")
    protected WebElement elmntSentPatient;

    @FindBy(how = How.XPATH, using = "//button[@text='Compose']")
    protected WebElement elmntComposeDoctor;

    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Alert Settings')]")
    protected WebElement drpDownAlertSettings;

    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Session Settings')]")
    protected WebElement drpDownSessionSettings;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Keep me Logged In for')]")
    protected WebElement txtKeepMeLogged;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'When I receive new messages send alerts')]")
    protected WebElement txtSendAlert;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

//    @FindAll({
//            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Inbox')])[2]"),
//            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Inbox')])[1]")
//    })
//    protected WebElement txtInboxPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Inbox')]")
    protected WebElement txtInboxPatient;


//    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Group Messages')]")
//    protected WebElement txtGroupMessagesPatient;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Back')]/i)[2]")
    protected WebElement btnBackInDraft;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Sent')]")
    protected WebElement txtSentPatient;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'User settings updated successfully')]")
    protected WebElement txtSettingSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Inbox')]")
    protected WebElement elmntInboxDoctor;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Group Message')])[1]")
    protected WebElement elmntGroupMessageDoctor;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sent')]")
    protected WebElement elmntSentDoctor;

    @FindBy(how = How.XPATH, using = "//button[@text='Refresh']")
    protected WebElement elmntRefresh;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'breadcrumbs')]/descendant::span[contains(text(),'Inbox')]")
    protected WebElement txtInbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sent')]/ancestor::div[contains(@class,'breadcrumbs')]")
    protected WebElement txtSent;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'breadcrumbs')]/descendant::span[contains(text(),'Compose')]")
    protected WebElement txtCompose;

    @FindBy(how = How.XPATH, using = "//div[@class='leftside']")
    protected WebElement elmntsMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Compose')]")
    protected WebElement elmntComposeMessage;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Compose New Message')]")
    protected WebElement txtComposeNewMessage;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlPractice')]")
    protected WebElement drpDownHealthCentre;


    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlLocation')]")
    protected WebElement drpDownLocation;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlService')]")
    protected WebElement drpDownServiceName;


    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlRoles')]")
    protected WebElement drpDownRole;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome')])[1]")
    protected WebElement txtMyHomePage;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Start typing Patient first name')]")
    protected WebElement txtBoxTo;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'GroupMessage1_btnSend')]")
    protected WebElement btnGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Message Body')]")
    protected WebElement txtMessageBody;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Subject')]")
    protected WebElement txtBoxSubject;

    @FindBy(how = How.XPATH, using = "//input[contains(@formcontrolname,'subject')]")
    protected WebElement txtBoxSubjectPatient;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-paperclip']/parent::a[@class='Themebutton']")
    protected WebElement btnAttachFiles;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'Compose$chkAcceptTerm')]")
    protected WebElement chkBoxTermsAndCondition;

    @FindBy(how = How.XPATH, using = "//div/iframe[contains(@style,'height')]")
    protected WebElement frameComposeForDoctor;

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'Subject')]")
    protected WebElement txtGroupBoxSubject;

    @FindBy(how = How.XPATH, using = "//body/br[2]")
    protected WebElement txtgroupmessage;

    @FindBy(how = How.XPATH, using = "//body[contains(@style,'font-family')]")
    protected WebElement txtBoxMessageBody;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'Compose_btnSend')]")
    protected WebElement btnSendMessage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Your Message has been sent Successfully')]")
    protected WebElement txtComposeSuccessMessage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
    protected WebElement btnHome;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Message Sent Successfully.')]")
    protected WebElement elmntGroupMessageSuccessPopUp;

    protected String elmntGroupMessageSuccessPopUp1 = "//div[contains(text(),'Message Sent Successfully.')]";

    @FindBy(how = How.XPATH, using = "//input[@value='Return to Inbox']")
    protected WebElement btnReturnToInbox;

    protected String rdoAlertOption = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String inboxMessageSubject = new StringBuilder()
            .append("//*[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String inboxMessageSubjectForMobile = new StringBuilder()
            .append("(//*[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]")
            .toString();

    protected String sentMessageSubject = new StringBuilder()
            .append("//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String elmntInnerSubject = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String txtBodyMessage = new StringBuilder()
            .append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();


    protected String sentMessageSubjectForMobile = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]")
            .toString();


    protected String receivedMessageSubject = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String receivedMessageSubjectForMobile = new StringBuilder()
            .append("(//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]")
            .toString();

//    protected String groupMessageSubjectForMobile = new StringBuilder()
//            .append("(//div[contains(text(),'")
//            .append("<<REPLACEMENT>>")
//            .append("')])[4]")
//            .toString();

    protected String groupMessageSubjectForMobile = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[8]")
            .toString();


    protected String selectTo = new StringBuilder()
            .append("//strong[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::li")
            .toString();


    protected String elmntSubject = new StringBuilder()
            .append("//a[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String elmntinnerSubject = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String elmntInnerSubjectForMobile = new StringBuilder()
            .append("(//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]")
            .toString();


    protected String txtAutoReply = new StringBuilder()
            .append("//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String ddlHealthCenter = new StringBuilder()
            .append("//select[contains(@id,'ddlPractice')]/option[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String ddlHealthCenterLocation = new StringBuilder()
            .append("//select[contains(@id,'ddlLocation')]/option[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String ddlServiceName = new StringBuilder()
            .append("//select[contains(@id,'ddlService')]/option[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();


    protected String ddlRole = new StringBuilder()
            .append("//select[contains(@id,'ddlRoles')]/option[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String messageText = new StringBuilder()
            .append("//div/p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Signature Settings')]")
    protected WebElement drpDownSignatureSettings;


    @FindBy(how = How.XPATH, using = "//div[@id='cdk-accordion-child-2']/descendant::iframe")
    protected WebElement frameSignature;


    @FindBy(how = How.XPATH, using = "//div[@id='cdk-accordion-child-3']//iframe")
    protected WebElement frameOutOfOffice;

    @FindBy(how = How.XPATH, using = "//iframe[@class='k-iframe']")
    protected WebElement frameCompose;

    @FindBy(how = How.XPATH, using = "//kendo-editor[@formcontrolname='automaticReplyText']//iframe")
    protected WebElement frameAutomaticReplies;

    @FindBy(how = How.XPATH, using = "//div[@class='k-editor-content ng-star-inserted']/descendant::iframe")
    protected WebElement btnFocusFrame;


    @FindBy(how = How.XPATH, using = "(//kendo-toolbar[@role='toolbar'])[1]")
    protected WebElement signatureToolbarHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ProseMirror')]/p")
    protected WebElement txtBoxMessages;

    @FindBy(how = How.XPATH, using = "(//kendo-toolbar[@role='toolbar'])[2]")
    protected WebElement automaticToolbarHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='cdk-accordion-child-2']/following::iframe")
    protected WebElement txtBoxAutomaticReplies;


    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Out of Office Settings')]")
    protected WebElement drpDownOutOfOfficeSettings;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Enable Out Of Office Reply')]/preceding-sibling::div/input")
    protected WebElement chkboxOutOfOfficeReply;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Enable Auto reply')]/preceding-sibling::div/input")
    protected WebElement chkboxAutomaticReply;

    @FindBy(how = How.XPATH, using = "//div[@fxlayout='row']")
    protected WebElement calendarRow;


    @FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[1]")
    protected WebElement calendarFromDate;

    @FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'Automatic replies')]")
    protected WebElement drpDownAutomaticRepliesSetting;


    @FindBy(how = How.XPATH, using = "//a[contains(@class,'header')]/span[text()='Messages']//following-sibling::mat-icon")
    protected WebElement btnMessagesExpand;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntdashboard;

    protected String strMessages = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement btnHealthCentre;

    @FindBy(how = How.XPATH, using = "(//select[contains(@id,'GroupMessage1')])[1]")
    protected WebElement btnfrom;

    @FindBy(how = How.XPATH, using = "(//select[contains(@id,'GroupMessage1')])[2]")
    protected WebElement btnprovider;


    @FindBy(how = How.XPATH, using = "(//select[contains(@id,'GroupMessage1')])[3]")
    protected WebElement btnGenderPrefernce;

    @FindBy(how = How.XPATH, using = "(//select[contains(@id,'GroupMessage1')])[4]")
    protected WebElement btnGroupTo;

    protected String elmntHealthCentre = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();


    protected String elmntGroupMessageFrom = new StringBuilder().append(" //select[contains(@onchange,'return ddlFromIndexChange();')]//option[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntGroupMessageProvider = new StringBuilder()
            .append("//select[contains(@onchange,'return ddlstafflistChange();')]//option[text()='")
            .append("<<REPLACEMENT>>")
            .append("']")
            .toString();

    protected String elmntgenderprefernce = new StringBuilder().append(" //select[contains(@onchange,'displaycount();')]//option[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntgroupTo = new StringBuilder().append(" //select[contains(@onchange,'return ddlToIndexChange();')]//option[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();


    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='location']")
    protected WebElement btnLocation;

    protected String elmntLocation = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='serviceName']")
    protected WebElement btnServiceName;

    protected String elmntServiceName = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='role']")
    protected WebElement btnRole;

    protected String elmntRole = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='toUser']")
    protected WebElement btnTo;

    protected String elmntTo = new StringBuilder().append("//span[@class='mat-option-text'][contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='Subject'])[1]")
    protected WebElement txtBoxReplySubject;

    @FindBy(how = How.XPATH, using = "//mat-checkbox[not(contains(@class,'mat-checkbox-checked'))][@formcontrolname='termsconditions']/label/div")
    protected WebElement btnCheckBox;

    @FindBy(how = How.XPATH, using = "//div[@class='ProseMirror']")
    protected WebElement btnWriteMessage;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Write your message']/following::android.widget.EditText)[1]")
    protected WebElement txtMessage;

    @AndroidFindBy(xpath = "(//android.widget.Button[@text='Signature Settings - Click here to update the signature on your outgoing E-mails']/following::android.widget.EditText)[1]")
    protected WebElement txtSignatureSettingMessage;

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror']//p)[2]")
    protected WebElement btnReplyWriteMessage;
    @FindBy(how = How.XPATH, using = "//div[@class='k-editor-content ng-star-inserted']/descendant::iframe")
    protected WebElement btnfocusframe;

    @FindBy(how = How.XPATH, using = "(//div[@class='k-editor-content ng-star-inserted']/descendant::iframe)[1]")
    protected WebElement btnReplyfocusframe;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attach Files')]")
    protected WebElement btnAttachClick;

    protected String strFloorplanFilePath = new StringBuilder().append(System.getProperty("user.dir")).append(File.separator).append(Constants.CONFIG_FOLDER).append(File.separator)
            .append(Constants.IMAGES_FOLDER).append(File.separator)
            .append("<<FILENAME>>").toString();

    @FindBy(how = How.XPATH, using = "(//mat-icon[contains(text(),'attachment')])[2]")
    protected WebElement btnFloorplanUpload;

    @FindBy(how = How.XPATH, using = "//input[@value='Attach']")
    protected WebElement btndevUpload;

    @FindBy(how = How.XPATH, using = "//input[@id='AttachFile1_btnDone']")
    protected WebElement btndevDone;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Close')]")
    protected WebElement btnSentClose;


    @FindBy(how = How.XPATH, using = "//span[text()='Attach ']")
    protected WebElement btnAttachUpload;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='WHILE USING THE APP']")
    protected WebElement WhileUsingTheApp;

    @FindBy(xpath = "//android.widget.TextView[@text='Files']")
    protected WebElement FileIcon;

    String strTextViewLocator = new StringBuilder()
            .append("//android.widget.TextView[@text='")
            .append("<<TEXT>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attach Files')]")
    protected WebElement btnAttachFile;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Send message')]//parent::span[@class='mat-button-wrapper'])[1]")
    protected WebElement btnReplySendMessage;

    @FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator btn-primary-pill mat-button mat-button-base'])[1]")
    protected WebElement btnReplysendMessage;

    @FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator btn-primary-pill mat-button mat-button-base'])[2]")
    protected WebElement btnMobileReplysendMessage;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),' Save As Draft')]//parent::span[@class='mat-button-wrapper'])[1]")
    protected WebElement btnSaveDraft;

    @FindBy(how = How.XPATH, using = "//button[@type='button']//span[text()=' OK ']")
    protected WebElement btnokDraft;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),' Save As Draft')]//parent::span[@class='mat-button-wrapper'])[2]")
    protected WebElement btnMobileSaveDraft;


    @FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-view')]//h1")
    protected WebElement btnInboxHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-view')]//h1")
    protected WebElement btnMobileInboxHeader;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    protected String elmtMobileInboxesclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmtMobilebInboxesclick = new StringBuilder().append("(//mat-card-title//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-view')]//h1")
    protected WebElement btnGroupMessageHeader;


    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Message sent successfully')]")
    protected WebElement btnSentSuccessfullyPopup;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'draft saved successfully')]")
    protected WebElement btnDraftSuccessfullyPopup;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'dowload successfully')]")
    protected WebElement btnAttachdowloadSuccessfullyPopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//mat-icon[contains(text(),'drive_file_rename_outline')]/following-sibling::span[contains(text(),'Reply')])[1]"),
            @FindBy(how = How.XPATH, using = "(//mat-icon[contains(text(),'drive_file_rename_outline')]/following-sibling::span[contains(text(),'Reply')])[2]")
    })
    protected WebElement btnReply;

    @FindBy(how = How.XPATH, using = "(//mat-icon[text()=' drive_file_rename_outline']//following::span[text()='Reply'])[2]")
    protected WebElement btnMobileReply;


    @FindBy(how = How.XPATH, using = "//a[text()=' Sent']")
    protected WebElement btnClickSentHeader;

    @FindBy(how = How.XPATH, using = "(//app-drafts[@class='ng-star-inserted']//h1)[1]")
    protected WebElement btnDraftHeader;

    protected String elmtGroupMessageclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String elmtMobileGroupMessageclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();
    protected String elmtInboxesclick = new StringBuilder().append("(//mat-card-title//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();


    protected String elmtInboxclick = new StringBuilder().append("(//mat-card-title//span//b[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String elmtSentclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String elmtMobileSentclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmtDraftclick = new StringBuilder().append("//div[contains(@class,'desktop-view')]//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append(" ')]").toString();

    protected String elmtMobileDraftclick = new StringBuilder().append("(//div[contains(@class,'mobile-view')]//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String strInboxData = new StringBuilder()
            .append("(//div[@class='tbl-td'][contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')])[1]").toString();

    protected String strMobileInboxData = new StringBuilder()
            .append("(//div[@class='tbl-td'][contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::div[contains(text(),'")
            .append("<<REPLACEMENT4>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//i[@class='icon-cent-close-cancel']")
    protected WebElement btnMobileCancelButton;

    protected String strMobileGroupMessageData = new StringBuilder()
            .append("(//div[@class='tbl-td'][text()='")
            .append("<<REPLACEMENT1>>").append("']//following::div[text()='")
            .append("<<REPLACEMENT2>>").append("'])[3]").toString();


    protected String strGroupMessageData = new StringBuilder()
            .append("(//div[@class='tbl-td'][text()='")
            .append("<<REPLACEMENT1>>").append("']//following::div[text()='")
            .append("<<REPLACEMENT2>>").append("'])[1]").toString();

    protected String txtBodyMessageForMobile = new StringBuilder()
            .append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]").toString();

    protected String draftSubject = new StringBuilder()
            .append("//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();


    protected String draftSubjectForMobile = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]")
            .toString();


//    protected String strDraftData = new StringBuilder()
//            .append("(//mat-select[@role='combobox']//following::span[contains(text(),'")
//            .append("<<REPLACEMENT1>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT2>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT3>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT4>>").append("')])[1]").toString();

    protected String strDraftData = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();


    protected String strMobileDraftData = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[4]").toString();

//
//    protected String strMobileDraftData = new StringBuilder()
//            .append("(//mat-select[@role='combobox']//following::span[contains(text(),'")
//            .append("<<REPLACEMENT1>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT2>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT3>>").append("')]//following::span[contains(text(),'")
//            .append("<<REPLACEMENT4>>").append("')])[2]").toString();


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Inbox')]")
    protected WebElement btnInboxButton;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Lab results enquiry')])[1]")
    protected WebElement btnSubjectButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Reply')]")
    protected WebElement btnReplyButton;

    @FindBy(how = How.XPATH, using = "//label[text()='Close without billing']")
    protected WebElement btnRadioButton;

    @FindBy(how = How.XPATH, using = "//td[text()='HealthSummary.pdf']")
    protected WebElement btnVerifyButton;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Send Message')])[2]")
    protected WebElement btnSendMessageButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Log out')]")
    protected WebElement elmntLogOut;

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'successfully logged out of ManageMyHealth™')]/descendant::button[contains(text(),'OK')]")
    protected WebElement btnLogOutOk;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Attach Files')]")
    protected WebElement btnAttachButton;

    @FindBy(how = How.XPATH, using = "(//a[@class='download-file mail-download-file'])[1]")
    protected WebElement btnInboxAttachButton;

    @FindBy(how = How.XPATH, using = "(//a[@class='download-file mail-download-file'])[2]")
    protected WebElement btnMobileInboxAttachButton;

    public boolean navigateToMessageSetting() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntMessages);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForSeconds(1);
            waitForElementClickable(elmntMessagesSettings);
            click(elmntMessagesSettings);
            waitForSeconds(1);
            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
            System.out.println("Successfully navigated to messages settings >>>>> :: ");
        } catch (Exception e) {
            System.out.println("Failed navigate to messages settings >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean navigateToPatientInboxMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntMessages);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(1);
            waitForElement(elmntInboxPatient);
            waitForElementClickable(elmntInboxPatient);
            click(elmntInboxPatient);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            String pageTitle = driver.getCurrentUrl();
            System.out.println("pageTitle >>> : " + pageTitle);
            if (pageTitle.contains("Inbox")) {
                blResult = true;
            }

        } catch (Exception e) {
            System.out.println("Failed navigate to Patient inbox messages >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean navigateToPatientSentMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntMessages);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForSeconds(1);
            waitForElement(elmntSentPatient);
            waitForElementClickable(elmntSentPatient);
            click(elmntSentPatient);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(1);
            String PageUrl = driver.getCurrentUrl();
            System.out.println("PageUrl >>> :: " + PageUrl);
            if (PageUrl.contains("Sent")) {
                blResult = true;
            }
//            waitForElement(txtSentPatient);
//            blResult = verifyElement(txtSentPatient);
        } catch (Exception e) {
            System.out.println("Failed navigate to Patient Sent messages >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean navigateToDraftMessage() {
        boolean blResult = false;
        try {

            waitForSeconds(2);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForSeconds(1);
            waitForElementClickable(elmntDraft);
            click(elmntDraft);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(1);
            String PageUrl = driver.getCurrentUrl();
            System.out.println("PageUrl >>> :: " + PageUrl);
            if (PageUrl.contains("Drafts")) {
                blResult = true;
            }
//            waitForElement(txtDraftPatient);
//            blResult = verifyElement(txtDraftPatient);

        } catch (Exception e) {
            System.out.println("Failed navigate to Draft message >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }


    public boolean navigateToComposeMessage() {
        boolean blResult = false;
        try {

            waitForSeconds(2);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(1);
            waitForElementClickable(elmntComposePatient);
            click(elmntComposePatient);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(1);
            String PageUrl = driver.getCurrentUrl();
            System.out.println("PageUrl >>> :: " + PageUrl);
            if (PageUrl.contains("Compose")) {
                blResult = true;
            }
//            waitForElement(txtComposeMail);
//            blResult = verifyElement(btnSendMessage);

            System.out.println("Successfully navigated to Compose message >>>>> :: " );
        } catch (Exception e) {
            System.out.println("Failed navigate to Compose message >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }


//    public boolean verifyPatientReceivedMessage() {
//        boolean blResult = false;
//        try {
//            System.out.println("strRandomSubjectMessage >>> :: " + strRandomSubjectMessage);
//            waitForElement(txtInboxPatient);
//            System.out.println("X Path-inboxSubject >>> :: " + inboxMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage));
//            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage)));
//            waitForElement(inboxSubject);
//            takeScreenshot(driver);
//            waitForElementClickable(inboxSubject);
//            click(inboxSubject);
//            System.out.println("X Path-inboxMessageSubject >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage));
//            WebElement inboxReceivedSubject = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage)));
//            waitForElement(inboxReceivedSubject);
//            takeScreenshot(driver);
//            blResult = verifyElement(inboxReceivedSubject);
//        } catch (Exception e) {
//            System.out.println("Failed verify Patient Received Message >>>>> :: " + blResult);
//            e.printStackTrace();
//
//        }
//        return blResult;
//    }

    public boolean verifyPatientReceivedMessage(String strMessage) {
        boolean blResult = false;
        try {
            System.out.println("strMessage >>> :: " + TestDataUtil.getValue(strMessage));
            waitForElement(txtInboxPatient);
            System.out.println("X Path-inboxSubject 1 >>> :: " + inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(inboxSubject);
            takeScreenshot(driver);
            waitForElementClickable(inboxSubject);
            waitAndClick(inboxSubject);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("X Path-inboxSubject 2 >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(inboxReceivedSubject);
            takeScreenshot(driver);
            blResult = verifyElement(inboxReceivedSubject);
        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyPatientReceivedMessageForMobile(String strMessage) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("strMessage >>> :: " + TestDataUtil.getValue(strMessage));
            waitForElement(txtInboxPatient);
            System.out.println("X Path-inboxSubject 1 >>> :: " + inboxMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(inboxSubject);
            takeScreenshot(driver);
            waitForElementClickable(inboxSubject);
            click(inboxSubject);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("X Path-inboxSubject 2 >>> :: " + receivedMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(receivedMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(inboxReceivedSubject);
            takeScreenshot(driver);
            blResult = verifyElement(inboxReceivedSubject);
        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyPatientReceivedGroupMessage(String strSubjectMessage, String strBody) {
        boolean blResult = false;
        try {
            waitForElement(txtGroupMessagePatient);
            System.out.println("X Path-inboxSubject >>> :: " + inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxSubject);
            takeScreenshot(driver);
            waitForElementClickable(inboxSubject);
            click(inboxSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxReceivedSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody)));
            WebElement bodyMessage = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody))));
            waitForElement(bodyMessage);
            takeScreenshot(driver);
            blResult = verifyElement(bodyMessage);
        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: " + blResult);
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyPatientReceivedGroupMessageForMobile(String strSubjectMessage, String strBody) {
        boolean blResult = false;
        try {
            waitForElement(txtGroupMessagePatient);
            System.out.println("X Path-inboxSubject >>> :: " + inboxMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxSubject);
            takeScreenshot(driver);
//            waitForElementClickable(inboxSubject);
            click(inboxSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + groupMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(groupMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxReceivedSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + groupMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody)));
            WebElement bodyMessage = waitForElement(By.xpath(groupMessageSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody))));
            waitForElement(bodyMessage);
            takeScreenshot(driver);
            blResult = verifyElement(bodyMessage);
        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }


    public boolean replyToPatientReceivedMessage(String strSubject, String strMessage) {
        boolean blResult = false;
        try {
            strRandomSubjectMessage = strSubject.concat(" - ").concat(getRandomString());
            System.out.println("strRandomSubjectMessage >>> :: " + strRandomSubjectMessage);
            waitForElement(txtInboxPatient);
            waitForElement(btnReply);
            waitForElementClickable(btnReply);
            click(btnReply);
            waitForElement(txtBoxReplySubject);
            waitForElementClickable(txtBoxReplySubject);
            txtBoxReplySubject.clear();
            txtBoxReplySubject.sendKeys(strRandomSubjectMessage);
            waitForSeconds(2);
            jsScrollDown();
            jsScrollIntoView(btnReplySendMessage);
            driver.switchTo().frame(btnReplyfocusframe);
            waitForSeconds(2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_A);
            StringSelection stringSelection = new StringSelection(strMessage);
            clipboard.setContents(stringSelection, stringSelection);
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_CONTROL);
            waitForSeconds(7);
            System.out.println(" switch to default frame::: " + driver.switchTo().defaultContent());
            waitForSeconds(2);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean selectCustomiseSessionTimeOut(String strTimeOut) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            click(drpDownSessionSettings);
            waitForSeconds(1);
            waitForElement(txtKeepMeLogged);
            System.out.println("Xpath for select TimeOut Setting >>>:: " + rdoAlertOption.replace("<<REPLACEMENT>>", strTimeOut));
            WebElement selectTimeOutSetting = waitForElement(By.xpath(rdoAlertOption.replace("<<REPLACEMENT>>", strTimeOut)));
            waitForElementClickable(selectTimeOutSetting);
            click(selectTimeOutSetting);
            takeScreenshot(driver);
            System.out.println("Customise TimeOut Setting was selected >>> ::");
            blResult = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectOutOfOfficeSetting() {
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

    public boolean clickReplySendMessage() {
        boolean blResult = false;
        try {
            waitForElement(btnReplySendMessage);
            jsScrollDown();
            jsScrollIntoView(btnReplySendMessage);
            waitForElementClickable(btnReplySendMessage);
            click(btnReplySendMessage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnSentSuccessfullyPopup);
            blResult = verifyElement(btnSentSuccessfullyPopup);

        } catch (Exception e) {
            System.out.println("Failed to select Out of Office Setting >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectAutomaticRepliesSetting() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            click(drpDownAutomaticRepliesSetting);
            waitForSeconds(1);
            waitForElement(chkboxAutomaticReply);

            System.out.println("Automatic Replies Setting was selected >>> ::");
            blResult = verifyElement(chkboxAutomaticReply);

        } catch (Exception e) {
            System.out.println("Failed to select Automatic Replies Setting >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enableCheckBoxAutomaticReply() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(chkboxAutomaticReply);
            String strAutomaticReply = chkboxAutomaticReply.getAttribute("aria-checked");
            System.out.println("chkbox Automatic Reply Attribute >>> :: " + strAutomaticReply);
            if (strAutomaticReply.equalsIgnoreCase("False")) {
                jsClick(chkboxAutomaticReply);
                blResult = true;
            } else {
                blResult = true;
            }

            System.out.println("Automatic reply checkbox was selected >>> ::");
            blResult = verifyElement(chkboxAutomaticReply);

        } catch (Exception e) {
            System.out.println("Automatic reply checkbox was not selected >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enableOutOfOfficeChkBox() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(chkboxOutOfOfficeReply);
            String strOutOfOfficeReply = chkboxOutOfOfficeReply.getAttribute("aria-checked");
            System.out.println("chkbox our of office Reply Attribute >>> :: " + strOutOfOfficeReply);
            if (strOutOfOfficeReply.equalsIgnoreCase("False")) {
                jsClick(chkboxOutOfOfficeReply);
                blResult = true;
            } else {
                blResult = true;
            }
            System.out.println("Out of Office checkbox was selected >>> ::");

        } catch (Exception e) {
            System.out.println("Out of Office checkbox was not selected >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectStartDateForOutOfOffice(String strStartDate) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(calendarRow);
            waitForElementClickable(calendarFromDate);
            click(calendarFromDate);
            waitForSeconds(5);

            blResult = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectEndDateForOutOfOffice(String strEndDate) {
        boolean blResult = false;
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterMessageForOutOfOffice(String strMessage) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForSeconds(2);
                waitForElement(chkboxOutOfOfficeReply);
                waitForSeconds(1);
//                jsScrollIntoView(txtBoxMessages);
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("autoGrantPermissions", "true");
                AppiumDriver appiumDriver = (AppiumDriver) driver;
                Set<String> contextNames = appiumDriver.getContextHandles();
                for (String strContextName : contextNames) {
                    if (strContextName.contains("NATIVE_APP")) {
                        appiumDriver.context("NATIVE_APP");
                        break;
                    }
                }
                System.out.println("Success Switch Native App");
                capabilities.setCapability("autoGrantPermissions", "true");
                swipeUpOutOfSetting();
                waitForElement(txtSignatureSettingMessage);
                waitForSeconds(2);
                enterValueRealDevice(txtSignatureSettingMessage, strMessage);
                Set<String> contextNames1 = appiumDriver.getContextHandles();
                for (String strContextName : contextNames1) {
                    if (strContextName.contains("CHROMIUM")) {
                        appiumDriver.context("CHROMIUM");
                        break;
                    }
                }
                blResult = true;

            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(chkboxOutOfOfficeReply);
                waitForSeconds(1);
                waitForElement(frameOutOfOffice);
                driver.switchTo().frame(frameOutOfOffice);
                System.out.println("Switched into frame");
                waitForSeconds(5);

                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Out Of Office Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().defaultContent();
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(chkboxOutOfOfficeReply);
                waitForSeconds(1);
                waitForElement(frameOutOfOffice);
                driver.switchTo().frame(frameOutOfOffice);
                System.out.println("Switched into frame");
                waitForSeconds(5);

                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Out Of Office Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to enter Out Of Office Message >>> ::");
        }
        return blResult;
    }

    public boolean enterMessageForAutomaticReplies(String strMessage) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForSeconds(2);
                waitForElement(chkboxAutomaticReply);
                waitForSeconds(1);
//                jsScrollIntoView(txtBoxMessages);
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("autoGrantPermissions", "true");
                AppiumDriver appiumDriver = (AppiumDriver) driver;
                Set<String> contextNames = appiumDriver.getContextHandles();
                for (String strContextName : contextNames) {
                    if (strContextName.contains("NATIVE_APP")) {
                        appiumDriver.context("NATIVE_APP");
                        break;
                    }
                }
                System.out.println("Success Switch Native App");
                capabilities.setCapability("autoGrantPermissions", "true");
                swipeUp();
                waitForElement(txtSignatureSettingMessage);
                waitForSeconds(2);
                enterValueRealDevice(txtSignatureSettingMessage, strMessage);
                Set<String> contextNames1 = appiumDriver.getContextHandles();
                for (String strContextName : contextNames1) {
                    if (strContextName.contains("CHROMIUM")) {
                        appiumDriver.context("CHROMIUM");
                        break;
                    }
                }
                blResult = true;
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                System.out.println("strMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(chkboxAutomaticReply);
                waitForSeconds(1);
                waitForElement(frameAutomaticReplies);
                driver.switchTo().frame(frameAutomaticReplies);
                System.out.println("Switched into frame");
                waitForSeconds(3);

                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Automatic reply Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().parentFrame();
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                System.out.println("strMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(chkboxAutomaticReply);
                waitForSeconds(1);
                waitForElement(frameAutomaticReplies);
                driver.switchTo().frame(frameAutomaticReplies);
                System.out.println("Switched into frame");
                waitForSeconds(3);

                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Automatic reply Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().parentFrame();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to enter Automatic reply Message >>> ::");
        }
        return blResult;
    }

    public boolean selectAlert(String strAlertType) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            waitForElementClickable(drpDownAlertSettings);
            click(drpDownAlertSettings);
            waitForSeconds(1);
            waitForElement(txtSendAlert);
            System.out.println("Xpath for select Alert type Setting >>>:: " + rdoAlertOption.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strAlertType)));
            WebElement rdoSelectAlertType = waitForElement(By.xpath(rdoAlertOption.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strAlertType))));
            waitForElementClickable(rdoSelectAlertType);
            click(rdoSelectAlertType);
            takeScreenshot(driver);
            System.out.println("Alert Setting was selected >>> ::");
            blResult = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToComposeMessageForMobile() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForSeconds(1);
            waitForElementClickable(elmntComposePatient);
            click(elmntComposePatient);
            waitForSeconds(1);
            waitForElement(txtComposeMailForMobile);
            blResult = verifyElement(txtComposeMailForMobile);
            System.out.println("Successfully navigated to Compose message >>>>> :: " + blResult);
        } catch (Exception e) {
            System.out.println("Failed navigate to Compose message >>>>> :: " + blResult);
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean enterTheSignatureMessage(String strMessage) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                waitForElement(btnSave);
                waitForElementClickable(drpDownSignatureSettings);
                click(drpDownSignatureSettings);
//                jsScrollIntoView(txtBoxMessages);
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("autoGrantPermissions", "true");
                AppiumDriver appiumDriver = (AppiumDriver) driver;
                Set<String> contextNames = appiumDriver.getContextHandles();
                for (String strContextName : contextNames) {
                    if (strContextName.contains("NATIVE_APP")) {
                        appiumDriver.context("NATIVE_APP");
                        break;
                    }
                }
                System.out.println("Success Switch Native App");
                capabilities.setCapability("autoGrantPermissions", "true");
                swipeUp();
                waitForElement(txtSignatureSettingMessage);
                waitForSeconds(2);
                enterValueRealDevice(txtSignatureSettingMessage, strMessage);
                Set<String> contextNames1 = appiumDriver.getContextHandles();
                for (String strContextName : contextNames1) {
                    if (strContextName.contains("CHROMIUM")) {
                        appiumDriver.context("CHROMIUM");
                        break;
                    }
                }
                blResult = true;

            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(btnSave);
                waitForElementClickable(drpDownSignatureSettings);
                click(drpDownSignatureSettings);
                waitForSeconds(1);
                waitForElement(frameSignature);
                driver.switchTo().frame(frameSignature);
                System.out.println("Switched into frame");
                waitForSeconds(5);
                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Signature Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().defaultContent();
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
                waitForSeconds(2);
                waitForElement(btnSave);
                waitForElementClickable(drpDownSignatureSettings);
                click(drpDownSignatureSettings);
                waitForSeconds(1);
                waitForElement(frameSignature);
                driver.switchTo().frame(frameSignature);
                System.out.println("Switched into frame");
                waitForSeconds(5);
                txtBoxMessages.sendKeys(Keys.CONTROL + "a");
                waitForSeconds(2);
                txtBoxMessages.sendKeys(Keys.BACK_SPACE);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strMessage));
                clipboard.setContents(stringSelection, stringSelection);
                robotKey(txtBoxMessages, KeyEvent.VK_CONTROL);
                robotKey(txtBoxMessages, KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_V);
                robotKeyRelease(KeyEvent.VK_CONTROL);
                takeScreenshot(driver);
                waitForSeconds(2);
                System.out.println("Signature Message was Entered successfully >>> ::");
                blResult = true;
                driver.switchTo().defaultContent();
            }

        } catch(Exception e){
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyEnteredSignatureMessage(String strMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            System.out.println("SignatureMessage >>> :: " + TestDataUtil.getValue(strMessage));
            waitForElement(btnAttachFile);
            driver.switchTo().frame(frameCompose);
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
            driver.switchTo().parentFrame();

        } catch (Exception e) {
            System.out.println("Failed to verify signature text message");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyEnteredOutOfOfficeMessage(String strMessage) {
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

    public boolean verifyEnteredAutomaticRepliesMessage(String strMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(chkboxAutomaticReply);
            driver.switchTo().frame(frameAutomaticReplies);
            System.out.println("Xpath for Text Out Of Office >>>> :: " + messageText.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement txtAutomaticRepliesMessage = waitForElement(By.xpath(messageText.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            jsScrollIntoView(txtAutomaticRepliesMessage);
            waitForElement(txtAutomaticRepliesMessage);
            verifyElement(txtAutomaticRepliesMessage);
            String automaticRepliesMessageText = txtAutomaticRepliesMessage.getText();
            System.out.println("verify Entered Signature Message >>> :: " + TestDataUtil.getValue(strMessage) + "::" + automaticRepliesMessageText);
            takeScreenshot(driver);
            if (automaticRepliesMessageText.equalsIgnoreCase(TestDataUtil.getValue(strMessage))) {
                System.out.println("Verified Automatic Replies Message text Message successfully >>> ::");
                blResult = true;
            }
            driver.switchTo().parentFrame();

        } catch (Exception e) {
            System.out.println("Failed to verify Automatic Replies Message");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSaveButton() {
        boolean blResult = false;

        try {
            waitForSeconds(1);
            takeScreenshot(driver);
            waitForElementClickable(btnSave);
            click(btnSave);
            waitForElement(txtSettingSuccessPopUp);
            blResult = verifyElement(txtSettingSuccessPopUp);
            System.out.println("Save button clicked successfully >>>>::");
        } catch (Exception e) {
            System.out.println("Failed to click Save button >>>>::");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean launchInNewTab(String URL) {
        boolean blResult = false;
        try {
            visit(URL);
            waitForSeconds(3);
            System.out.println("focussed another window");
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToInbox() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElement(elmntInboxDoctor);
            waitForElementClickable(elmntInboxDoctor);
            click(elmntInboxDoctor);
            waitForSeconds(1);
            waitForElement(txtInbox);
            blResult = verifyElement(txtInbox);
            System.out.println("Successfully navigated to the inbox");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the inbox");
        }
        return blResult;
    }

    public boolean clickInboxRefresh() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(elmntRefresh);
            waitForElementClickable(elmntRefresh);
            click(elmntRefresh);
            waitForElement(txtInbox);
            blResult = verifyElement(txtInbox);
            System.out.println("Successfully refresh the inbox");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to refresh the inbox");
        }
        return blResult;
    }

    public boolean verifyPatientReplyMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtInbox);
            waitForElement(elmntsMenu);
            System.out.println(elmntSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage));
            WebElement Subject = waitForElement(By.xpath(elmntSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage)));
            waitForElementClickable(Subject);
            click(Subject);
            blResult = verifyElement(By.xpath(elmntinnerSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage)));
            System.out.println("Successfully verified the Patient Reply Message >>> :: ");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Verify patient reply message");
        }
        return blResult;
    }

    public boolean verifyReplySentMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSentPatient);
            System.out.println("strRandomSubjectMessage >>> :: " + strRandomSubjectMessage);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubject.replace("<<REPLACEMENT>>", strRandomSubjectMessage)));
            waitForElement(sentSubject);
            takeScreenshot(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);

            blResult = verifyElement(txtSentPatient);
            System.out.println("\nSuccessfully verified reply sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify reply sent message >>> :: ");
        }
        return blResult;
    }

    public boolean navigateToSentItems() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElement(elmntInboxDoctor);
            waitForElementClickable(elmntInboxDoctor);
            click(elmntInboxDoctor);
            waitForElement(txtInbox);
            waitForElement(elmntSentDoctor);
            waitForElementClickable(elmntSentDoctor);
            click(elmntSentDoctor);
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
            waitForSeconds(3);
            waitForElement(txtSent);
            waitForElement(elmntRefresh);
            waitForElementClickable(elmntRefresh);
            click(elmntRefresh);
            waitForSeconds(3);
            System.out.println(elmntSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage)));
            WebElement Subject = waitForElement(By.xpath(elmntSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            waitForElement(Subject);
            blResult = verifyElement(Subject);
            System.out.println("Successfully verified sent Message");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to verify sent Message");
        }
        return blResult;
    }

    public boolean verifyAutomaticReplyMessage(List<String> strDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtInbox);
            waitForElement(elmntsMenu);
            System.out.println("X Path for Inbox Subject >>> :: " + elmntSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails.get(2))));
            WebElement Subject = waitForElement(By.xpath(elmntSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails.get(2)))));
            waitForElementClickable(Subject);
            click(Subject);
            waitForSeconds(5);
            System.out.println("X Path for Inbox Subject >>> ::" + txtAutoReply.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails.get(2))));
            WebElement replyText = waitForElement(By.xpath(txtAutoReply.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails.get(2)))));
            waitForElement(replyText);
            click(replyText);
            waitForElement(replyText);
            takeScreenshot(driver);
            blResult = verifyElement(replyText);
            System.out.println("Successfully verified the Automatic Reply Message >>> :: ");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed verify the Automatic Reply Message >>> :: ");
        }
        return blResult;
    }


    public boolean navigateToPatientLogin() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntLogOut);
            waitForElementClickable(elmntLogOut);
            click(elmntLogOut);
            waitForElement(btnLogOutOk);
            waitForElementClickable(btnLogOutOk);
            click(btnLogOutOk);
            takeScreenshot(driver);
            closeWindow(2);
            waitForSeconds(3);
            focusWindow(1);
            waitForElement(elmntLogo);
            blResult = verifyElement(elmntLogo);
            System.out.println("Successfully close the current tab and focus the patient window ");
        } catch (Exception e) {
            System.out.println("Failed to close the current tab and focus the patient window ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean doctorLogOut() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntLogOut);
            waitForElementClickable(elmntLogOut);
            click(elmntLogOut);
            waitForSeconds(3);
            waitForElement(btnLogOutOk);
            waitForElementClickable(btnLogOutOk);
            click(btnLogOutOk);
            blResult = true;
            takeScreenshotSanity(driver);
            System.out.println("Doctor Log out Successfully");
        } catch (Exception e) {
            System.out.println("Doctor Failed to Log out");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToComposeMessageForDoctor() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElementClickable(elmntInboxDoctor);
            click(elmntInboxDoctor);
            waitForSeconds(1);
            waitForElementClickable(elmntComposeDoctor);
            click(elmntComposeDoctor);
            waitForElement(txtCompose);
            blResult = verifyElement(txtCompose);
            System.out.println("Successfully navigated to the compose");
        } catch (Exception e) {
            System.out.println("Failed to navigate the compose");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToGroupMessageForDoctor() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElementClickable(elmntGroupMessageDoctor);
            click(elmntGroupMessageDoctor);
            waitForSeconds(1);
            blResult = verifyElement(elmntGroupMessageDoctor);
            System.out.println("Successfully navigated to the compose");
        } catch (Exception e) {
            System.out.println("Failed to navigate the compose");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCenter(String strHealthCenter) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(drpDownHealthCentre);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlPractice')]")));
            healthCentre.selectByVisibleText(strHealthCenter);
            waitForSeconds(1);

            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectServiceName(String strServiceName) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(drpDownServiceName);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlService')]")));
            healthCentre.selectByVisibleText(strServiceName);
            waitForSeconds(1);

            blResult = true;
            System.out.println("\nSuccessfully selected the Service Name >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the sService Name >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectRole(String strRole) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(drpDownRole);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlRoles')]")));
            healthCentre.selectByVisibleText(strRole);
            waitForSeconds(1);

            blResult = true;
            System.out.println("\nSuccessfully selected the Role>>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the Role >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectTo(String strTo) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(txtBoxTo);
            click(txtBoxTo);
            waitForSeconds(5);
            waitForElement(txtMessageBody);
            click(txtMessageBody);
            waitForSeconds(5);
            txtBoxTo.sendKeys(strTo);
            waitForSeconds(2);
            System.out.println("Xpath for Patient >>> :: " + selectTo.replace("<<REPLACEMENT>>", strTo));
            WebElement patient = waitForElement(By.xpath(selectTo.replace("<<REPLACEMENT>>", strTo)));
            waitForElementClickable(patient);
            click(patient);
            waitForSeconds(1);

            blResult = true;
            System.out.println("\nSuccessfully Entered To>>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the  >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean enterSubject(String strSubject) {
        boolean blResult = false;
        try {
            System.out.println("strSubject >>> :: " + TestDataUtil.getValue(strSubject));
            waitForSeconds(2);
            waitForElement(txtBoxSubjectPatient);
            waitForElementClickable(txtBoxSubjectPatient);
            txtBoxSubjectPatient.clear();
            waitForSeconds(2);
            txtBoxSubjectPatient.click();
            waitForSeconds(1);
            txtBoxSubjectPatient.sendKeys(TestDataUtil.getValue(strSubject));
            takeScreenshot(driver);
            waitForSeconds(3);
            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterSubjectDoctor(String strSubject) {
        boolean blResult = false;
        try {
            System.out.println("strSubject >>> :: " + TestDataUtil.getValue(strSubject));
            waitForSeconds(2);
            waitForElement(txtBoxSubject);
            waitForElementClickable(txtBoxSubject);
            txtBoxSubject.clear();
            waitForSeconds(2);
            txtBoxSubject.click();
            waitForSeconds(1);
            txtBoxSubject.sendKeys(TestDataUtil.getValue(strSubject));
            takeScreenshot(driver);
            waitForSeconds(3);
            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean enableTermAndConditions() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(chkBoxTermsAndCondition);
            if (!chkBoxTermsAndCondition.isSelected()) {
                click(chkBoxTermsAndCondition);
            }
            waitForSeconds(1);

            blResult = chkBoxTermsAndCondition.isSelected();
            System.out.println("\nSuccessfully Enabled the terms and conditions >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enable the terms and conditions >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSendMessageAndNavigateToHomePage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(btnSendMessage);
            click(btnSendMessage);
            waitForSeconds(1);
            waitForElement(txtComposeSuccessMessage);
            waitForElement(btnHome);
            waitForElementClickable(btnHome);
            click(btnHome);
            waitForSeconds(2);
            waitForElement(txtMyHomePage);
            blResult = verifyElement(txtMyHomePage);

            System.out.println("\nSuccessfully Clicked the send message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the send message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean enterBodyMessage(String strBodyMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            driver.switchTo().frame(frameComposeForDoctor);
            waitForSeconds(2);
            waitForElementClickable(txtBoxMessageBody);

            txtBoxMessageBody.sendKeys(strBodyMessage);
            takeScreenshot(driver);
            waitForSeconds(3);
            driver.switchTo().parentFrame();

            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Body Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCenterLocation(String strHealthCenterLocation) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElementClickable(drpDownLocation);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlLocation')]")));
            healthCentre.selectByVisibleText(strHealthCenterLocation);

            blResult = true;
            System.out.println("\nSuccessfully selected the health centre Location >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre Location >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public void clickMessagesExpandIcon() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnMessagesExpand);
            click(btnMessagesExpand);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMessagesExpand);
            click(btnMessagesExpand);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElement(btnMessagesExpand);
            click(btnMessagesExpand);

        }

    }

    public boolean navigateToMessagesPage(String strSubTab) {
        boolean blResult = false;
        try {

            WebElement elmntMessagesTab = waitForElement(By.xpath(strMessages.replace("<<REPLACEMENT>>", strSubTab)));
            click(elmntMessagesTab);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCentre(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);

            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(btnHealthCentre);
            jsClick(btnHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentre.replace("<<REPLACEMENT>>", strFamilyMember)));

            waitForSeconds(1);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFrom(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtComposeNewMessage);
            waitForElementClickable(btnfrom);
            Select healthCentre = new Select(driver.findElement(By.xpath("(//select[contains(@id,'GroupMessage1')])[1]")));
            healthCentre.selectByVisibleText(strFamilyMember);
            waitForSeconds(1);
            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProvider(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtComposeNewMessage);
            waitForElementClickable(btnprovider);
            Select healthCentre = new Select(driver.findElement(By.xpath("(//select[contains(@id,'GroupMessage1')])[2]")));
            healthCentre.selectByVisibleText(strFamilyMember);
            waitForSeconds(1);
            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectGenderPreference(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtComposeNewMessage);
            waitForElementClickable(btnGenderPrefernce);
            Select healthCentre = new Select(driver.findElement(By.xpath("(//select[contains(@id,'GroupMessage1')])[3]")));
            healthCentre.selectByVisibleText(strFamilyMember);
            waitForSeconds(1);
            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selecGroupTo(String strFamilyMember) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtComposeNewMessage);
            waitForElementClickable(btnGroupTo);
            Select healthCentre = new Select(driver.findElement(By.xpath("(//select[contains(@id,'GroupMessage1')])[4]")));
            healthCentre.selectByVisibleText(strFamilyMember);
            waitForSeconds(1);
            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean selectLocation(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(btnLocation);
            waitForSeconds(2);
            jsClick(btnLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntLocation.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(1);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectServiceNamePatient(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(btnServiceName);
            waitForSeconds(2);
            jsClick(btnServiceName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntServiceName.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(1);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectRolePatient(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(btnRole);
            waitForSeconds(2);
            jsClick(btnRole);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntRole.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(1);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectToPatient(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(btnTo);
            waitForSeconds(2);
            jsClick(btnTo);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntTo.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(1);
            jsScrollIntoView(elmntEntriesFromHealthCentre);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterSubjectPatient(String strConditionName) {
        boolean blResult = false;
        waitForSeconds(2);
        waitForElementClickable(txtBoxReplySubject);
        enterValue(txtBoxReplySubject, strConditionName);
        return blResult = true;
    }

    public void clickCheckBox() {
        waitForSeconds(3);
        if (verifyElement(btnCheckBox)) {
            click(btnCheckBox);
        } else {
            System.out.println("CheckBox are checked::>>");
        }
    }

    public void enterWriteMessage(String strConditionName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {

//            jsScrollIntoView(btnWriteMessage);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("autoGrantPermissions", "true");
            AppiumDriver appiumDriver = (AppiumDriver) driver;
            Set<String> contextNames = appiumDriver.getContextHandles();
            for (String strContextName : contextNames) {
                if (strContextName.contains("NATIVE_APP")) {
                    appiumDriver.context("NATIVE_APP");
                    break;
                }
            }
            System.out.println("Success Switch Native App");
            capabilities.setCapability("autoGrantPermissions", "true");
            swipeUp();
            waitForSeconds(2);
            waitForElement(txtMessage);
            waitForSeconds(2);
            enterValueRealDevice(txtMessage, strConditionName);
            Set<String> contextNames1 = appiumDriver.getContextHandles();
            for (String strContextName : contextNames1) {
                if (strContextName.contains("CHROMIUM")) {
                    appiumDriver.context("CHROMIUM");
                    break;
                }
            }

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            driver.switchTo().frame(btnFocusFrame);
            waitForSeconds(2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_A);
            StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strConditionName));
            clipboard.setContents(stringSelection, stringSelection);
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_CONTROL);
            takeScreenshot(driver);
            driver.switchTo().defaultContent();
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {

            driver.switchTo().frame(btnFocusFrame);
            waitForSeconds(2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_A);
            StringSelection stringSelection = new StringSelection(TestDataUtil.getValue(strConditionName));
            clipboard.setContents(stringSelection, stringSelection);
            robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
            robotKey(btnWriteMessage, KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_V);
            robotKeyRelease(KeyEvent.VK_CONTROL);
            takeScreenshot(driver);
            driver.switchTo().defaultContent();
        }
    }

    public boolean clickAddFile(String strUploadDocumentName) {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {

                waitForSeconds(3);
                jsScrollUp();
                jsClick(btnAttachClick);
                waitForSeconds(2);
                mouseClick(btnFloorplanUpload);
                waitForSeconds(4);
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("autoGrantPermissions", "true");
                pushFileToDevice("MMHtest.jpg");
                AppiumDriver appiumDriver = (AppiumDriver) driver;
                Set<String> contextNames = appiumDriver.getContextHandles();
                for (String strContextName : contextNames) {
                    if (strContextName.contains("NATIVE_APP")) {
                        appiumDriver.context("NATIVE_APP");
                        break;
                    }
                }
                capabilities.setCapability("autoGrantPermissions", "true");
                String mobiledevicename=System.getProperty("deviceName");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+mobiledevicename);
                if (System.getProperty("deviceName").equalsIgnoreCase("Poco M2")){
                    waitForSeconds(3);
                    click(WhileUsingTheApp);
                    waitForSeconds(3);
                    click(WhileUsingTheApp);
                }
                if (System.getProperty("deviceName").equalsIgnoreCase("Samsung Galaxy S21")) {
                    waitForSeconds(3);
                    click(WhileUsingTheApp);

                }
                waitForSeconds(3);
                click(FileIcon);
                WebElement elmntImage = waitForElement(By.xpath(strTextViewLocator.replace("<<TEXT>>", "MMHtest.jpg")));
                click(elmntImage);
                waitForSeconds(3);
                Set<String> contextNames1 = appiumDriver.getContextHandles();
                for (String strContextName : contextNames1) {
                    if (strContextName.contains("CHROMIUM")) {
                        appiumDriver.context("CHROMIUM");
                        break;
                    }
                }
                waitForElement(btnAttachUpload);
                click(btnAttachUpload);
            }

            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                System.out.println("Member " + strUploadDocumentName);
                System.out.println(strUploadDocumentName);
                waitForSeconds(2);
                waitForElement(btnAttachClick);
                click(btnAttachClick);

                String strFloorplanDocumentName = strFloorplanFilePath.replace("<<FILENAME>>", strUploadDocumentName);
                System.out.println(strFloorplanDocumentName);
                btnFloorplanUpload.sendKeys(strFloorplanDocumentName);
                waitForSeconds(3);
                waitForElement(btnAttachUpload);
                click(btnAttachUpload);

            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                System.out.println("Member " + strUploadDocumentName);
                System.out.println(strUploadDocumentName);
                waitForSeconds(2);
                waitForElement(btnAttachClick);
                click(btnAttachClick);

                String strFloorplanDocumentName = strFloorplanFilePath.replace("<<FILENAME>>", strUploadDocumentName);
                System.out.println(strFloorplanDocumentName);
                btnFloorplanUpload.sendKeys(strFloorplanDocumentName);
                waitForSeconds(3);
                waitForElement(btnAttachUpload);
                click(btnAttachUpload);

            }
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean clickDevAddFile(String strUploadDocumentName) {
        boolean blResult = false;
        try {
            focusWindow(3);
            waitForSeconds(5);
            String strFloorplanDocumentName = strFloorplanFilePath.replace("<<FILENAME>>", strUploadDocumentName);
            System.out.println(strFloorplanDocumentName);
            btnFloorplanUpload.sendKeys(strFloorplanDocumentName);
            waitForSeconds(5);
            waitForElementClickable(btndevUpload);
            jsClick(btndevUpload);
            waitForSeconds(3);
            waitForElement(btndevDone);
            jsClick(btndevDone);
            waitForSeconds(1);
            driver.switchTo().alert().dismiss();
            focusWindow(2);
            waitForSeconds(5);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blResult;
    }


    public void clickSave() {
        waitForSeconds(3);
        waitForElementClickable(btnReplySendMessage);
        jsClick(btnReplySendMessage);

    }

    public void clickReplySave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            jsScrollIntoView(btnReplysendMessage);
            waitForElementClickable(btnReplysendMessage);
            jsClick(btnReplysendMessage);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            jsScrollIntoView(btnMobileReplysendMessage);
            waitForElementClickable(btnMobileReplysendMessage);
            jsClick(btnMobileReplysendMessage);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(3);
            jsScrollIntoView(btnMobileReplysendMessage);
            waitForElementClickable(btnMobileReplysendMessage);
            jsClick(btnMobileReplysendMessage);
        }
    }


    public void clickDraftSave() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            waitForSeconds(3);
            waitForElementClickable(btnSaveDraft);
            jsClick(btnSaveDraft);
            waitForElementClickable(btnokDraft);
            jsClick(btnokDraft);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileSaveDraft);
            jsClick(btnMobileSaveDraft);
            waitForElementClickable(btnokDraft);
            jsClick(btnokDraft);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileSaveDraft);
            jsClick(btnMobileSaveDraft);
            waitForElementClickable(btnokDraft);
            jsClick(btnokDraft);
        }
    }


    public boolean verifyInboxHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            waitForSeconds(3);
            verifyElement(btnInboxHeader);
            waitForSeconds(2);
            waitForElementClickable(btnClickSentHeader);
            jsClick(btnClickSentHeader);
            waitForSeconds(3);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtSentclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            verifyElement(btnInboxHeader);
            waitForSeconds(2);
            waitForElementClickable(btnClickSentHeader);
            jsClick(btnClickSentHeader);
            waitForSeconds(3);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileSentclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(3);
            verifyElement(btnInboxHeader);
            waitForSeconds(2);
            waitForElementClickable(btnClickSentHeader);
            jsClick(btnClickSentHeader);
            waitForSeconds(3);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileSentclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        return blResult;
    }

    public boolean verifyDraftHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            verifyElement(btnDraftHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtDraftclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            verifyElement(btnDraftHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileDraftclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            verifyElement(btnDraftHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileDraftclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(elmntActiveHeader);
        }
        return blResult;
    }


    public boolean VerifyInboxData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntReport = waitForElement(By.xpath(strInboxData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
//            jsScrollIntoView(elmntReport);
            waitForSeconds(2);
            waitForElement(elmntReport);
            verifyElement(elmntReport);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileInboxData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntReport = waitForElement(By.xpath(strMobileInboxData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));
//            jsScrollIntoView(elmntReport);
            waitForSeconds(2);
            waitForElement(elmntReport);
            verifyElement(elmntReport);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifySendData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntSentData = waitForElement(By.xpath(strInboxData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForSeconds(2);
            waitForElement(elmntSentData);
            verifyElement(elmntSentData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileSendData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntSentData = waitForElement(By.xpath(strMobileInboxData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT4>>", TestDataUtil.getValue(lstDetails.get(3)))));

            waitForSeconds(2);
            waitForElement(elmntSentData);
            verifyElement(elmntSentData);
            waitForElementClickable(btnMobileCancelButton);
            click(btnMobileCancelButton);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyDraftMessage(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            WebElement Subject = waitForElement(By.xpath(draftSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(5)))));
            waitForElement(Subject);
            waitForElementClickable(Subject);
            waitAndClick(Subject);

            List<String> LstDetails = new ArrayList<>();
//            LstDetails.add(TestDataUtil.getValue(lstDetails.get(1)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(2)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(3)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(4)));

            System.out.println("LstDetails >>> :: " + LstDetails);
            for (String strValue : LstDetails) {

                System.out.println("X-Path for Data >>> :: " + strDraftData
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue((strValue))));

                WebElement elmntReport = waitForElement(By.xpath(strDraftData
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue((strValue)))));

                waitForElement(elmntReport);
                blResult = verifyElement(elmntReport);

                if (!blResult) {
                    return blResult;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyBodyMessageForMobile(String lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            if (verifyElement(btnFocusFrame)) {
                driver.switchTo().frame(btnFocusFrame);
            }
            WebElement bodyMessage = waitForElement(By.xpath(txtBodyMessageForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails))));
            System.out.println("X-Path for txtBodyMessageForMobile >>> :: " + txtBodyMessageForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails)));
            takeScreenshot(driver);
            blResult = verifyElement(bodyMessage);
            driver.switchTo().defaultContent();

            waitForElement(btnSentClose);
            waitForElementClickable(btnSentClose);
            waitAndClick(btnSentClose);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public void clickMessageOptionMenu() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            waitForElementClickable(btnMessagesExpand);
            jsClick(btnMessagesExpand);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(btnMessagesExpand);
            jsClick(btnMessagesExpand);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElementClickable(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(btnMessagesExpand);
            jsClick(btnMessagesExpand);
        }

    }

    public void clickDashboardFromMenu() {

        waitForElementClickable(elmntdashboard);
        jsClick(elmntdashboard);

    }

    public boolean launchingNewTab(String URL) {
        boolean blResult = false;
        try {
            ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            visit(URL);
            waitForSeconds(3);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickInboxButton() {
        waitForSeconds(3);
//        waitForElementClickable(btnInboxButton);
        waitForElement(btnInboxButton);
        click(btnInboxButton);

    }

    public void clickSubjectButton() {
        waitForSeconds(3);
//        waitForElementClickable(btnSubjectButton);
        waitForElementClickable(btnSubjectButton);
        jsClick(btnSubjectButton);
    }

    public void clickReplyButton() {
        waitForSeconds(3);
//        waitForElement(btnReplyButton);
        waitForElementClickable(btnReplyButton);
        click(btnReplyButton);
    }

    public void clickAttachButton() {
        waitForSeconds(3);
//        waitForElement(btnAttachButton);
        waitForElementClickable(btnAttachButton);
        click(btnAttachButton);
        System.out.println("<<<<<<<<<<clicked>>>>>>>>>>>>>>>>>>");
    }

    public void clickRadioButton() {

        focusWindow(2);

        waitForSeconds(2);
        verifyElement(btnVerifyButton);
        waitForSeconds(2);
        waitForSeconds(3);
//        waitForElement(btnRadioButton);
        waitForElementClickable(btnRadioButton);
        click(btnRadioButton);
    }

    public void clickSendMessageButton() {
        waitForSeconds(3);
        waitForElementClickable(btnSendMessageButton);
//        waitForElement(btnSendMessageButton);
        click(btnSendMessageButton);
        waitForElement(elmntLogOut);
        waitForElementClickable(elmntLogOut);
        click(elmntLogOut);
        waitForSeconds(5);
        closeWindow(2);
    }

    public void clickInboxAttachButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(3);
            waitForElementClickable(btnInboxAttachButton);
//        waitForElement(btnInboxAttachButton);
            jsClick(btnInboxAttachButton);
            waitForSeconds(1);
            takeScreenshot(driver);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileInboxAttachButton);
//        waitForElement(btnInboxAttachButton);
            jsClick(btnMobileInboxAttachButton);
            waitForSeconds(1);
            takeScreenshot(driver);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(3);
            waitForElementClickable(btnMobileInboxAttachButton);
//        waitForElement(btnInboxAttachButton);
            jsClick(btnMobileInboxAttachButton);
            waitForSeconds(1);
            takeScreenshot(driver);
        }
    }


    public void DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();
        }
    }


    public boolean verifyInboxPage(String strHeader) {
        waitForSeconds(2);
        waitForElement(btnInboxHeader);
        verifyElement(btnInboxHeader);
        waitForSeconds(2);

        WebElement elmntActiveHeader = waitForElement(By.xpath(elmtInboxesclick.replace("<<REPLACEMENT>>", strHeader)));
        jsClick(elmntActiveHeader);

        return verifyElement(btnInboxHeader);
    }

    public boolean verifyMobileInboxPage(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForSeconds(2);
            waitForElement(btnInboxHeader);
            verifyElement(btnInboxHeader);
            waitForSeconds(2);

            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileInboxesclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnInboxHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(2);
            waitForElement(btnMobileInboxHeader);
            verifyElement(btnMobileInboxHeader);
            waitForSeconds(2);

            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobilebInboxesclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnInboxHeader);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(2);
            waitForElement(btnMobileInboxHeader);
            verifyElement(btnMobileInboxHeader);
            waitForSeconds(2);

            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobilebInboxesclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnInboxHeader);

        }
        return blResult;
    }

    public boolean verifyInboxesPage(String strHeader) {
        focusWindow(1);
        waitForSeconds(2);
        refreshPage();
        waitForSeconds(2);
        waitForElement(btnInboxHeader);
        verifyElement(btnInboxHeader);
        waitForSeconds(2);
        WebElement elmntActiveHeader = waitForElement(By.xpath(elmtInboxclick.replace("<<REPLACEMENT>>", strHeader)));
        jsClick(elmntActiveHeader);

        return verifyElement(btnInboxHeader);
    }

    public void VerifyInboxHeader() {
        verifyElement(btnInboxHeader);

    }

    public void ClickReplyMessage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {

            waitForSeconds(2);
            waitForElement(btnReply);
            click(btnReply);
            waitForSeconds(10);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForSeconds(2);
            waitForElement(btnMobileReply);
            click(btnMobileReply);
            waitForSeconds(10);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForSeconds(2);
            waitForElement(btnMobileReply);
            click(btnMobileReply);
            waitForSeconds(10);
        }
    }

    public void enterReplyMessage(String strConditionName) {

        driver.switchTo().frame(btnReplyfocusframe);
        waitForSeconds(2);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
        robotKey(btnWriteMessage, KeyEvent.VK_A);
        StringSelection stringSelection = new StringSelection(strConditionName);
        clipboard.setContents(stringSelection, stringSelection);
        robotKey(btnWriteMessage, KeyEvent.VK_CONTROL);
        robotKey(btnWriteMessage, KeyEvent.VK_V);
        robotKeyRelease(KeyEvent.VK_V);
        robotKeyRelease(KeyEvent.VK_CONTROL);
        driver.switchTo().defaultContent();
    }

    public boolean verifyGroupMessageHeader(String strHeader) {
        boolean blResult = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            verifyElement(btnGroupMessageHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtGroupMessageclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnGroupMessageHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            verifyElement(btnGroupMessageHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileGroupMessageclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnGroupMessageHeader);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            verifyElement(btnGroupMessageHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtMobileGroupMessageclick.replace("<<REPLACEMENT>>", strHeader)));
            jsClick(elmntActiveHeader);

            return verifyElement(btnGroupMessageHeader);
        }
        return blResult;
    }

    public boolean verifySentSuccessfully() {
        waitForElement(btnSentSuccessfullyPopup);
        return verifyElement(btnSentSuccessfullyPopup);
    }

    public boolean verifyDraftSuccessfully() {
        waitForElement(btnDraftSuccessfullyPopup);
        return verifyElement(btnDraftSuccessfullyPopup);
    }

    public boolean VerifyAttachdowloadSuccessfully() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(btnAttachdowloadSuccessfullyPopup);
        return verifyElement(btnAttachdowloadSuccessfullyPopup);
    }

    public boolean VerifyGroupMessageData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntGroupMessageData = waitForElement(By.xpath(strGroupMessageData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));

            waitForSeconds(2);
            waitForElement(elmntGroupMessageData);
            verifyElement(elmntGroupMessageData);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean VerifyMobileGroupMessageData(List<String> lstDetails) {
        boolean blResult = false;
        try {


            WebElement elmntGroupMessageData = waitForElement(By.xpath(strMobileGroupMessageData
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(0)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(1)))));

            waitForSeconds(2);
            waitForElement(elmntGroupMessageData);
            verifyElement(elmntGroupMessageData);
            waitForElementClickable(btnMobileCancelButton);
            click(btnMobileCancelButton);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean enterGroupSubject(String strSubject) {
        boolean blResult = false;
        try {

            waitForElementClickable(txtGroupBoxSubject);
            txtGroupBoxSubject.clear();
            waitForElementClickable(txtGroupBoxSubject);
            txtGroupBoxSubject.sendKeys(TestDataUtil.getValue(strSubject));
            waitForSeconds(3);
            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterGroupMessage(String strBodyMessage) {
        boolean blResult = false;
        try {
            driver.switchTo().frame(frameComposeForDoctor);
            System.out.println(strBodyMessage);
            waitForSeconds(2);
            jsClick(txtgroupmessage);
            waitForSeconds(2);
            txtgroupmessage.sendKeys(TestDataUtil.getValue(strBodyMessage));
            waitForSeconds(3);
            driver.switchTo().parentFrame();
            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Body Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickGroupMessageAndNavigateToHomePage() {
        boolean blResult = false;
        try {
            waitForElementClickable(btnGroupMessage);
            click(btnGroupMessage);
            waitForSeconds(3);
            waitForElementToAppear(driver,By.xpath(elmntGroupMessageSuccessPopUp1));
            verifyElement(elmntGroupMessageSuccessPopUp);
            if (verifyElement(elmntGroupMessageSuccessPopUp)) {
                waitForElement(btnHome);
                waitForElementClickable(btnHome);
                click(btnHome);
                waitForSeconds(2);
                waitForElement(txtMyHomePage);
                blResult = verifyElement(txtMyHomePage);
            }
            System.out.println("\nSuccessfully Clicked the send message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the send message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToPatientGroupMessage() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntMessages);
            waitForElementClickable(elmntMessages);
            click(elmntMessages);
            waitForSeconds(1);
            waitForElement(elmntGroupMessagePatient);
            waitForElementClickable(elmntGroupMessagePatient);
            click(elmntGroupMessagePatient);
            waitForSeconds(5);

            String pageTitle = driver.getCurrentUrl();
            System.out.println("pageTitle >>> : " + pageTitle);
            if (pageTitle.contains("Groups")) {
                System.out.println("Successfully navigated to Patient Group messages >>>>> :: " + blResult);
                blResult = true;
            }
        } catch (Exception e) {
            System.out.println("Failed navigate to Patient Group messages >>>>> :: " + blResult);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean attachTheFile(String strUploadDocumentName) {
        boolean blResult = false;
        try {
            clickAttachButton();
            waitForSeconds(3);
            focusWindow(2);
            System.out.println("Document Name" + strUploadDocumentName);
            String strFloorplanDocumentName = strFloorplanFilePath.replace("<<FILENAME>>", strUploadDocumentName);
            System.out.println(strFloorplanDocumentName);
            btnFloorplanUpload.sendKeys(strFloorplanDocumentName);
            waitForSeconds(5);
            waitForElementClickable(btndevUpload);
            jsClick(btndevUpload);
            waitForSeconds(3);
            waitForElement(btndevDone);
            jsClick(btndevDone);
            waitForSeconds(2);
            robotKey(KeyEvent.VK_ESCAPE);
            waitForSeconds(2);
            focusWindow(1);
            waitForSeconds(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyPatientSentMessageForMobile(String strMessages) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            waitForElement(txtSentPatient);
            System.out.println("strMessages >>> :: " + strMessages);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubjectForMobile.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubjectForMobile.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject);
            takeScreenshot(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);
            System.out.println("X Path-inboxSubject >>> :: " + elmntInnerSubjectForMobile.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject1 = waitForElement(By.xpath(elmntInnerSubjectForMobile.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject1);
            takeScreenshot(driver);


            blResult = verifyElement(sentSubject1);
            System.out.println("\nSuccessfully verified reply sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify reply sent message >>> :: ");
        }
        return blResult;
    }

    public boolean VerifyMobileDraftMessage(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            WebElement Subject = waitForElement(By.xpath(draftSubjectForMobile.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails.get(5)))));
            waitForElement(Subject);
            waitForElementClickable(Subject);
            waitAndClick(Subject);

            List<String> LstDetails = new ArrayList<>();
//            LstDetails.add(TestDataUtil.getValue(lstDetails.get(1)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(2)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(3)));
            LstDetails.add(TestDataUtil.getValue(lstDetails.get(4)));

            System.out.println("LstDetails >>> :: " + LstDetails);
            for (String strValue : LstDetails) {

                System.out.println("X-Path for Data >>> :: " + strMobileDraftData
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue((strValue))));

                WebElement elmntReport = waitForElement(By.xpath(strMobileDraftData
                        .replace("<<REPLACEMENT>>", TestDataUtil.getValue((strValue)))));

                waitForElement(elmntReport);
                blResult = verifyElement(elmntReport);

                if (!blResult) {
                    return blResult;
                }

            }

            return blResult;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean verifyPatientSentMessage(String strMessages) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSentPatient);
            System.out.println("strMessages >>> :: " + strMessages);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject);
            takeScreenshot(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);
            System.out.println("X Path-inboxSubject >>> :: " + elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject1 = waitForElement(By.xpath(elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject1);
            takeScreenshot(driver);


            blResult = verifyElement(sentSubject1);
            System.out.println("\nSuccessfully verified reply sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify reply sent message >>> :: ");
        }
        return blResult;
    }

    public boolean VerifyBodyMessage(String lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            if (verifyElement(btnFocusFrame)) {
                driver.switchTo().frame(btnFocusFrame);
            }
            WebElement bodyMessage = waitForElement(By.xpath(txtBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails))));
            System.out.println("X-Path for txtBodyMessageForMobile >>> :: " + txtBodyMessage.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetails)));
            takeScreenshot(driver);
            jsScrollIntoView(bodyMessage);
            blResult = verifyElement(bodyMessage);
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickBackButton() {
        boolean blResult = false;
        try {
            waitForElement(btnBackInDraft);
            waitForElementClickable(btnBackInDraft);
            waitAndClick(btnBackInDraft);
            blResult = true;

        } catch (Exception e) {
            System.out.println("Failed to clickBackButton");
            e.printStackTrace();
        }

        return blResult;
    }


}

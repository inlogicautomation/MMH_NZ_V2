package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
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

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Group Messages')])[1]")
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

    @FindBy(how = How.XPATH, using = "//figure[contains(text(),'When I receive new messages send alerts')]")
    protected WebElement txtSendAlert;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Inbox')]")
    protected WebElement txtInboxPatient;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Draft')])[2]"),
            @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Draft')])[1]")

            })
    protected WebElement txtDraftPatient;


    @FindBy(how = How.XPATH, using = "//img[@mattooltip='Message settings']/parent::span/preceding-sibling::button")
    protected WebElement btnDeleteAllInDraft;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Group Messages')]")
    protected WebElement txtGroupMessagesPatient;

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


    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[contains(@formcontrolname,'subject')]"),
            @FindBy(how = How.XPATH, using = "//input[@class='form-control']")
    })
    protected WebElement txtBoxSubject;

//    protected WebElement txtBoxSubjectForDoctor;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-paperclip']/parent::a[@class='Themebutton']")
    protected WebElement btnAttachFiles;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'Compose$chkAcceptTerm')]")
    protected WebElement chkBoxTermsAndCondition;

    @FindBy(how = How.XPATH, using = "//div/iframe[contains(@style,'height')]")
    protected WebElement frameComposeForDoctor;

    @FindBy(how = How.XPATH, using = "//input[@name='clinicalUser']")
    protected List<WebElement> chkBoxInboxPatient;

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


    @FindBy(how = How.XPATH, using = "//input[@value='Return to Inbox']")
    protected WebElement btnReturnToInbox;

    protected String rdoAlertOption = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String inboxMessageSubject = new StringBuilder()
            .append("//b[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

    protected String sentMessageSubject = new StringBuilder()
            .append("//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]")
            .toString();

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

    protected String elmntInnerSubject = new StringBuilder()
            .append("//div[contains(text(),'")
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

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Moved to archive list successfully')]/parent::div/h4[text()='Success!']")
    protected WebElement txtSuccessForArchive;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Moved to inbox successfully')]/parent::div/h4[text()='Success!']")
    protected WebElement txtSuccessForMoveToSentFromArchive;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Draft(s) Deleted successfully')]/parent::div/h4[text()='Success!']")
    protected WebElement txtSuccessForDraftDelete;

    @FindBy(how = How.XPATH, using = "//span[text()='YES']")
    protected WebElement btnYesForDeleteDraftMessage;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Moved to inbox successfully')]/parent::div/h4[text()='Success!']")
    protected WebElement txtSuccessForUndoArchive;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose Message')]/ancestor::div/h3[contains(text(),'Start talking with doctors')]")
    protected WebElement verifyInboxEmpty;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Archive')]")
    protected WebElement txtArchive;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Sent')]")
    protected WebElement txtSentForPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Archive')]")
    protected WebElement elmntArchive;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sent')]")
    protected WebElement elmntSent;

    @FindBy(how = How.XPATH, using = "//a[@mattooltip='Mark as unread']")
    protected WebElement btnMarkAsUnRead;

    @FindBy(how = How.XPATH, using = "//input[@aria-label='Select All']/parent::div")
    protected WebElement chkBoxInboxSelectAll;

    @FindBy(how = How.XPATH, using = "//a[@mattooltip='Move to inbox']")
    protected WebElement elmtMoveToInbox;

    @FindBy(how = How.XPATH, using = "//a[@mattooltip='Mark as read']")
    protected WebElement btnMarkAsRead;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'read') and b]")
    protected List<WebElement> elmntVerifyInbox;

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

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror']//p)[2]")
    protected WebElement btnReplyWriteMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='k-editor-content ng-star-inserted']/descendant::iframe")
    protected WebElement btnFocusFrame;

    @FindBy(how = How.XPATH, using = "(//div[@class='k-editor-content ng-star-inserted']/descendant::iframe)[1]")
    protected WebElement btnReplyfocusframe;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attach Files')]")
    protected WebElement btnAttachClick;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Back')]/i)[2]")
    protected WebElement btnBackInDraft;

    protected String strFloorplanFilePath = new StringBuilder().append(System.getProperty("user.dir")).append(File.separator).append(Constants.CONFIG_FOLDER).append(File.separator)
            .append(Constants.IMAGES_FOLDER).append(File.separator)
            .append("<<FILENAME>>").toString();

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    protected WebElement btnFloorplanUpload;

    @FindBy(how = How.XPATH, using = "//input[@value='Attach']")
    protected WebElement btndevUpload;

    @FindBy(how = How.XPATH, using = "//input[@id='AttachFile1_btnDone']")
    protected WebElement btndevDone;

    @FindBy(how = How.XPATH, using = "//span[text()='Attach ']")
    protected WebElement btnAttachUpload;

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

    protected String elmtMobileInboxesclick = new StringBuilder().append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmtMobilebInboxesclick = new StringBuilder().append("(//mat-card-title//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-view')]//h1")
    protected WebElement btnGroupMessageHeader;


    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Message sent successfully')]")
    protected WebElement btnSentSuccessfullyPopup;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'draft saved successfully')]")
    protected WebElement txtDraftSuccessfullPopUp;

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
    protected WebElement btnSentHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Close')]")
    protected WebElement btnSentClose;

    @FindBy(how = How.XPATH, using = "(//app-drafts[@class='ng-star-inserted']//h1)[1]")
    protected WebElement btnDraftHeader;

    protected String elmtGroupMessageclick = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

    protected String elmtMobileGroupMessageclick = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]").toString();

    protected String elmtInboxesclick = new StringBuilder()
            .append("(//mat-card-title//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();


    protected String elmtInboxclick = new StringBuilder()
            .append("(//mat-card-title//span//b[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

    protected String txtBodyMessage = new StringBuilder()
            .append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

    protected String txtBodyMessageForMobile = new StringBuilder()
            .append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]").toString();

    protected String elmtSentclick = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

    protected String elmtMobileSentclick = new StringBuilder()
            .append("(//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]").toString();

    protected String elmtDraftclick = new StringBuilder()
            .append("//div[contains(@class,'desktop-view')]//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append(" ')]").toString();

    protected String elmtMobileDraftclick = new StringBuilder()
            .append("(//div[contains(@class,'mobile-view')]//mat-card-title[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();

    @FindBy(how = How.XPATH, using = "//a[contains(@mattooltip,'Archive') or contains(@mattooltip,'Move to inbox')]")
    protected WebElement btnMoveTo;
//
//    @FindBy(how = How.XPATH, using = "//a[contains(@mattooltip,'Move to inbox')]")
//    protected WebElement btnMoveToInbox;

    protected String chkBoxInbox = new StringBuilder()
            .append("//*[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/ancestor::mat-card-content//input/parent::div")
            .toString();

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

    protected String strDraftData = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[1]").toString();


    protected String strMobileDraftData = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')])[2]").toString();


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

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'SIGN OUT')]"),
            @FindBy(how = How.XPATH, using = "//a[contains(text(),'Log out')]")
    })
    protected WebElement elmntLogOut;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

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



    public boolean SelectAllInboxMessage(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            waitForElement(chkBoxInboxSelectAll);
            waitForElementClickable(chkBoxInboxSelectAll);
            waitAndClick(chkBoxInboxSelectAll);
            int size = chkBoxInboxPatient.size();
            System.out.println("\n size of chkBoxInboxPatient >>> :: "+size);
            for (WebElement checkBok:chkBoxInboxPatient) {
                String checkBoxValue=checkBok.getAttribute("aria-checked");
                if (checkBoxValue.equalsIgnoreCase("false")){
                    System.out.println("All INBOX CheckBox was failed to select");
                    return blResult;
                }
            }
            takeScreenshotSanity(driver);
            System.out.println("Inbox All CheckBox was selected Successfully");
            blResult=true;
        } catch (Exception e) {
            System.out.println("Inbox All CheckBox was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickMarkAsUnRead(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            waitForElement(btnMarkAsUnRead);
            waitForElementClickable(btnMarkAsUnRead);
            waitAndClick(btnMarkAsUnRead);
            waitForSeconds(3);

            System.out.println("Mark as Unread was selected Successfully");
            blResult=true;
        } catch (Exception e) {
            System.out.println("Mark as unread was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean verifyMarkAsUnRead(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            int size = elmntVerifyInbox.size();
            System.out.println("\n size of chkBoxInboxPatient >>> :: "+size);
            for (WebElement messageSubject:elmntVerifyInbox) {
                String checkBoxValue=messageSubject.getAttribute("class");

                if (!checkBoxValue.contains("read")){
                    System.out.println("Failed select mark as Unread >>> :: ");
                    return blResult;
                }
            }
            System.out.println("Mark as Unread was selected Successfully");
            takeScreenshotSanity(driver);
            blResult=true;
        } catch (Exception e) {
            System.out.println("Mark as unread was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickMarkAsRead(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            waitForElement(btnMarkAsRead);
            waitForElementClickable(btnMarkAsRead);
            waitAndClick(btnMarkAsRead);
            waitForSeconds(3);
            System.out.println("Mark as read was selected Successfully");
            blResult=true;
        } catch (Exception e) {
            System.out.println("Mark as read was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean verifyMarkAsRead(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            int size = elmntVerifyInbox.size();
            System.out.println("\n size of chkBoxInboxPatient >>> :: "+size);
            for (WebElement messageSubject:elmntVerifyInbox) {
                String checkBoxValue=messageSubject.getAttribute("class");
                System.out.println("GetAttribue>>>>"+checkBoxValue);

                if (checkBoxValue.contains("read")){
                    System.out.println("Failed select mark as read >>> :: ");
                    return blResult=true;
                }
            }
            takeScreenshotSanity(driver);
            System.out.println("Mark as read was selected Successfully");
            blResult=true;
        } catch (Exception e) {
            System.out.println("Mark as read was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickArchive(){
        boolean blResult=false;
        try {
            waitForElement(txtInboxPatient);
            waitForElement(btnMoveTo);
            waitForElementClickable(btnMoveTo);
            waitAndClick(btnMoveTo);
            waitForSeconds(3);
            System.out.println("Archive was selected Successfully");
            blResult=true;
        } catch (Exception e) {
            System.out.println("Archive was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean verifyArchive(){
        boolean blResult=false;
        try {
            waitForElement(txtSuccessForArchive);
            System.out.println("Archive was selected Successfully");
            takeScreenshotSanity(driver);
            System.out.println("txtSuccessForArchive >>> :: "+verifyElement(txtSuccessForArchive));
//            waitForElement(verifyInboxEmpty);
//            verifyElement(verifyInboxEmpty);
            blResult=true;
        } catch (Exception e) {
            System.out.println("Archive was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToArchiveAndUndoAllArchiveMessages(){
        boolean blResult=false;
        try {

            waitForSeconds(3);
            waitForElement(elmntArchive);
            waitForElementClickable(elmntArchive);
            jsClick(elmntArchive);

            waitForSeconds(2);
            waitForElement(txtArchive);
            waitForElement(chkBoxInboxSelectAll);
            waitForElementClickable(chkBoxInboxSelectAll);
            jsClick(chkBoxInboxSelectAll);

            waitForSeconds(3);
            waitForElement(elmtMoveToInbox);
            waitForElementClickable(elmtMoveToInbox);
            jsClick(elmtMoveToInbox);
            takeScreenshotSanity(driver);
            waitForSeconds(3);
            waitForElement(txtSuccessForUndoArchive);
            verifyElement(txtSuccessForUndoArchive);
            takeScreenshotSanity(driver);
            blResult=true;
        } catch (Exception e) {
            System.out.println("Undo Archive was failed to select");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToArchive(){
        boolean blResult=false;
        try {
            waitForElement(elmntArchive);
            waitForElementClickable(elmntArchive);
            waitAndClick(elmntArchive);

            waitForSeconds(2);
            waitForElement(txtArchive);
            System.out.println("Navigate to Archive Successfully >>> :: "+verifyElement(txtSuccessForArchive));
            blResult=verifyElement(txtArchive);
        } catch (Exception e) {
            System.out.println("Navigate to Archive was failed");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean verifyPatientReceivedGroupMessage(String strSubjectMessage, String strBody) {
        boolean blResult = false;
        try {

            waitForElement(txtGroupMessagesPatient);
            System.out.println("X Path-inboxSubject >>> :: " + inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxSubject = waitForElement(By.xpath(inboxMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxSubject);
            takeScreenshotSanity(driver);
            waitForElementClickable(inboxSubject);
            click(inboxSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage)));
            WebElement inboxReceivedSubject = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strSubjectMessage))));
            waitForElement(inboxReceivedSubject);
            System.out.println("X Path-inboxMessageSubject >>> :: " + receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody)));
            WebElement bodyMessage = waitForElement(By.xpath(receivedMessageSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strBody))));
            waitForElement(bodyMessage);
            takeScreenshotSanity(driver);
            blResult = verifyElement(bodyMessage);
        } catch (Exception e) {
            System.out.println("Failed verify Patient Received Message >>>>> :: " + blResult);
            e.printStackTrace();

        }
        return blResult;
    }



    public boolean selectOutOfOfficeSetting() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            if (!verifyElement(chkboxOutOfOfficeReply)){
            waitForElementClickable(drpDownOutOfOfficeSettings);
            click(drpDownOutOfOfficeSettings);
            }
            waitForSeconds(1);
            waitForElement(chkboxOutOfOfficeReply);

            System.out.println("Out of Office Setting was selected >>> ::");
            blResult=verifyElement(chkboxOutOfOfficeReply);
//            blResult = chkboxOutOfOfficeReply.isDisplayed();

        } catch (Exception e) {
            System.out.println("Failed to select Out of Office Setting >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean moveReceivedMessageIntoArchive(String strSubject) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
//            System.out.println("X Path for chkBoxInbox >>> :: "+chkBoxInbox.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strSubject)));
//            WebElement ReceivedMessage=waitForElement(By.xpath(chkBoxInbox.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strSubject))));
            System.out.println("Move Received Message Into Archive chkBoxInbox >>> :: "+chkBoxInbox.replace("<<REPLACEMENT>>",strSubject));
            WebElement ReceivedMessage=waitForElement(By.xpath(chkBoxInbox.replace("<<REPLACEMENT>>",strSubject)));
            waitForElement(ReceivedMessage);
            waitForElementClickable(ReceivedMessage);
            System.out.println("inboxSubject dis >>> "+ ReceivedMessage.isDisplayed());
            System.out.println("inboxSubject ena >>> "+ ReceivedMessage.isEnabled());
            waitAndClick(ReceivedMessage);
            waitForElement(btnMoveTo);
            waitForElementClickable(btnMoveTo);
            waitAndClick(btnMoveTo);
            waitForElement(txtSuccessForArchive);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtSuccessForArchive);
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean moveSentMessageIntoArchive(String strSubject) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            System.out.println("Move Sent Message Into Archive chkBoxInbox >>> :: "+chkBoxInbox.replace("<<REPLACEMENT>>",strSubject));
            WebElement SentMessage =waitForElement(By.xpath(chkBoxInbox.replace("<<REPLACEMENT>>",strSubject)));
            waitForElement(SentMessage);
            waitForElementClickable(SentMessage);
            waitAndClick(SentMessage);
            waitForElement(btnMoveTo);
            waitForElementClickable(btnMoveTo);
            waitAndClick(btnMoveTo);
            waitForElement(txtSuccessForArchive);
            takeScreenshotSanity(driver);
            blResult = verifyElement(txtSuccessForArchive);
            System.out.println("\nSuccessfully moved Sent Message Into Archive >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to move Sent Message Into Archive >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean moveArchiveIntoSentMessage(String strSubject) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            System.out.println("move Archive Into Sent Message chkBoxInbox >>> :: "+chkBoxInbox.replace("<<REPLACEMENT>>",strSubject));
            WebElement SentMessage =waitForElement(By.xpath(chkBoxInbox.replace("<<REPLACEMENT>>",strSubject)));
            waitForElement(SentMessage);
            waitForElementClickable(SentMessage);
            waitAndClick(SentMessage);
            waitForElement(btnMoveTo);
            waitForElementClickable(btnMoveTo);
            waitAndClick(btnMoveTo);
            waitForElement(txtSuccessForMoveToSentFromArchive);
//            takeScreenshotSanity(driver);
            blResult = verifyElement(txtSuccessForMoveToSentFromArchive);
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean disableOutOfOfficeChkBox() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(chkboxOutOfOfficeReply);
            String strOutOfOfficeReply = chkboxOutOfOfficeReply.getAttribute("aria-checked");
            System.out.println("chkbox our of office Reply Attribute >>> :: " + strOutOfOfficeReply);
            if (strOutOfOfficeReply.equalsIgnoreCase("true")){
                waitForElementClickable(chkboxOutOfOfficeReply);
                jsClick(chkboxOutOfOfficeReply);
                blResult = true;
            } else {
                blResult = true;
            }
            takeScreenshotSanity(driver);
            System.out.println("Out of Office checkbox was not selected >>> ::");

        } catch (Exception e) {
            System.out.println("Out of Office checkbox was selected >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean clickSaveButton() {
        boolean blResult = false;

        try {
            waitForSeconds(1);
            takeScreenshotSanity(driver);
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



    public boolean verifyPatientSentMessage(String strMessages) {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            waitForElement(txtSentPatient);
            System.out.println("strMessages >>> :: " + strMessages);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject);
            takeScreenshotSanity(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);
            System.out.println("X Path-inboxSubject >>> :: " + elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject1 = waitForElement(By.xpath(elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject1);

            blResult = verifyElement(sentSubject1);
            System.out.println("\nSuccessfully verified reply sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify reply sent message >>> :: ");
        }
        return blResult;
    }
    public boolean verifyPatientSentMessageInArchive(String strMessages) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtArchive);
            System.out.println("strMessages >>> :: " + strMessages);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject);
//            takeScreenshotSanity(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);
            System.out.println("X Path-inboxSubject >>> :: " + elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject1 = waitForElement(By.xpath(elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject1);

            blResult = verifyElement(sentSubject1);
            System.out.println("\nSuccessfully verified reply sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify reply sent message >>> :: ");
        }
        return blResult;
    }
    public boolean verifyArchivedMovedToSent(String strMessages) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtSentForPatient);
            System.out.println("strMessages >>> :: " + strMessages);
            System.out.println("X Path-inboxSubject >>> :: " + sentMessageSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject = waitForElement(By.xpath(sentMessageSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject);
            takeScreenshotSanity(driver);
            waitForElementClickable(sentSubject);
            click(sentSubject);
            System.out.println("X Path-inboxSubject >>> :: " + elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages));
            WebElement sentSubject1 = waitForElement(By.xpath(elmntInnerSubject.replace("<<REPLACEMENT>>", strMessages)));
            waitForElement(sentSubject1);

            blResult = verifyElement(sentSubject1);
            System.out.println("\nSuccessfully verified Archived Moved To sent Message");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nFailed to verify Archived Moved To Sent message >>> :: ");
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
    public boolean navigateToPatientSentItems() {
        boolean blResult = false;
        try {
            waitForElement(elmntSent);
            waitForElementClickable(elmntSent);
            waitAndClick(elmntSent);

            waitForSeconds(2);
            waitForElement(txtSentForPatient);
            takeScreenshotSanity(driver);
            System.out.println("Navigate to Archive Successfully >>> :: "+verifyElement(txtSentForPatient));
            blResult=verifyElement(txtSentForPatient);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the inbox");
        }
        return blResult;
    }


    public boolean patientLogOut() {
        boolean blResult = false;
        try {
            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(elmntLogOut);
            waitForElementClickable(elmntLogOut);
            click(elmntLogOut);
            waitForElement(btnLogin);

            blResult = verifyElement(btnLogin);
            waitForSeconds(10);
            System.out.println("Patient Log out Successfully");
        } catch (Exception e) {
            System.out.println("Patient Failed to Log out");
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
            System.out.println("strSubject >>> :: "+TestDataUtil.getValue(strSubject));
            waitForSeconds(2);

            waitForElement(txtBoxSubject);
            waitForElementClickable(txtBoxSubject);
            txtBoxSubject.clear();

            txtBoxSubject.sendKeys(TestDataUtil.getValue(strSubject));
//            takeScreenshotSanity(driver);
            waitForSeconds(3);
            blResult = true;
            System.out.println("\nSuccessfully Entered The Subject Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickDeleteAllUnderDraft() {
        boolean blResult = false;

        try {
            waitForSeconds(2);
            waitForElement(txtDraftPatient);
            waitForElement(btnDeleteAllInDraft);
            waitForElementClickable(btnDeleteAllInDraft);
            jsClick(btnDeleteAllInDraft);
            waitForSeconds(4);
            waitForElement(btnYesForDeleteDraftMessage);
            waitForElementClickable(btnYesForDeleteDraftMessage);
            jsClick(btnYesForDeleteDraftMessage);

            waitForElement(txtSuccessForDraftDelete);
            takeScreenshotSanity(driver);
            waitForSeconds(3);
            blResult = verifyElement(txtSuccessForDraftDelete);
            System.out.println("\nSuccessfully Deleted The draft Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to delete the draft Message >>> :: ");
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




    public boolean enterBodyMessage(String strBodyMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            driver.switchTo().frame(frameComposeForDoctor);
            waitForSeconds(2);
            waitForElementClickable(txtBoxMessageBody);

            txtBoxMessageBody.sendKeys(strBodyMessage);
            takeScreenshotSanity(driver);
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


    public boolean selectLocation(String strFamilyMember) {
        boolean blResult = false;
        try {
            System.out.println("Member " + strFamilyMember);
            waitForSeconds(2);
            waitForElementClickable(btnLocation);
            waitForSeconds(2);
            jsClick(btnLocation);


            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntLocation.replace("<<REPLACEMENT>>", strFamilyMember)));
            waitForSeconds(1);
            waitForElementClickable(elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);


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

    public boolean verifyDraftHeader(String strHeader) {
        boolean blResult = false;
        System.out.println("strHeader >>>> ::"+ strHeader);

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            verifyElement(btnDraftHeader);
            waitForSeconds(2);
            WebElement elmntActiveHeader = waitForElement(By.xpath(elmtDraftclick.replace("<<REPLACEMENT>>",strHeader)));
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
        return blResult;
    }



    public boolean VerifyBodyMessage(String lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            if (verifyElement(btnFocusFrame)){
                driver.switchTo().frame(btnFocusFrame);
            }
            WebElement bodyMessage=waitForElement(By.xpath(txtBodyMessage.replace("<<REPLACEMENT>>",lstDetails)));
            System.out.println("X-Path for txtBodyMessageForMobile >>> :: "+ txtBodyMessage.replace("<<REPLACEMENT>>",lstDetails));
            takeScreenshotSanity(driver);
            jsScrollIntoView(bodyMessage);
            blResult=verifyElement(bodyMessage);
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult;
    }


    public void clickDashboardFromMenu() {

        waitForElementClickable(elmntdashboard);
        jsClick(elmntdashboard);

    }

    public void clickAttachButton() {
        waitForSeconds(3);
//        waitForElement(btnAttachButton);
        waitForElementClickable(btnAttachButton);
        click(btnAttachButton);
        System.out.println("<<<<<<<<<<clicked>>>>>>>>>>>>>>>>>>");
    }

    public void DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();
        }
    }

    public boolean attachTheFile(String strUploadDocumentName) {
        boolean blResult = false;
        try {
            clickAttachButton();
            waitForSeconds(3);
            focusWindow(2);
            System.out.println("Document Name" + strUploadDocumentName );
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
            focusWindow(1);
            waitForSeconds(5);

            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean clickDoctorSendMessageButton() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtComposeNewMessage);
            waitForElement(btnSendMessage);
            waitForElementClickable(btnSendMessage);
            click(btnSendMessage);
            waitForSeconds(1);
            waitForElement(txtComposeSuccessMessage);
            waitForElement(btnReturnToInbox);
            waitForElementClickable(btnReturnToInbox);
            click(btnReturnToInbox);
            waitForSeconds(3);
            waitForElement(txtComposeNewMessage);
            blResult = verifyElement(txtComposeNewMessage);
            takeScreenshotSanity(driver);

            System.out.println("\nSuccessfully Clicked the send message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to click the send message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToDoctorHomepage() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(btnHome);
            waitForElementClickable(btnHome);
            click(btnHome);
            waitForSeconds(2);
            waitForElement(txtMyHomePage);
            blResult = verifyElement(txtMyHomePage);
            System.out.println("Successfully navigated to the Doctor Homepage");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate the Doctor Homepage");
        }
        return blResult;
    }
}

package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProviderMessagesPage extends BasePage {
    public ProviderMessagesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "(//h1[text()=' Compose Email '])[1]")
    protected WebElement txtCompose;

    @FindBy(how = How.XPATH, using = "(//span[text()=' Save as Draft'])[1]")
    protected WebElement btnDraftMessage;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement DraftMessageOkbutton;


    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "(//h1[text()='Inbox'])[1]")
    protected WebElement txtInboxPage;

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

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'draft saved successfully')]")
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



    public boolean clickProviderDraftMessage() {
        boolean blResult = false;
        try {
//            waitForSeconds(2);
            waitForElement(txtCompose);
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
            waitForElement(txtDraftSavedSuccessMessagePopup);
            blResult = verifyElement(txtDraftSavedSuccessMessagePopup);

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
//            List<String> lstMessageDetails = TestDataUtil.getListOfValue(strMessage);
//            System.out.println("List Message Details >>> :: " + lstMessageDetails);
//            waitForSeconds(3);
            waitForElement(txtDraftPage);
            waitForSeconds(3);
            System.out.println(elmntDoctorDraftSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(5))));
            WebElement Subject = waitForElement(By.xpath(elmntDoctorDraftSubject.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage.get(5)))));
            waitForElement(Subject);
            verifyElement(Subject);
            click(Subject);
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

    public boolean clickSendMessageAndNavigateToHomePage() {
        boolean blResult = false;
        try {
//            waitForSeconds(2);
            waitForElement(txtCompose);
            jsScrollIntoView(btnSendMessage);
            waitForElementClickable(btnSendMessage);
            jsClick(btnSendMessage);
//            waitForSeconds(1);
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

}

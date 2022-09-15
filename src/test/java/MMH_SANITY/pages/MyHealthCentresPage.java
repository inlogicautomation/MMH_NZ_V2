package MMH_SANITY.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyHealthCentresPage extends BasePage {

    public MyHealthCentresPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Notice Board')]")
    protected WebElement elmntNoticeBoard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Connect to Health Centre')]")
    protected WebElement elmntConnectToHealthCentre;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Connect a health centre')]")
    protected WebElement btnConnectAHealthCentre;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health centres')]")
    protected WebElement elmntMyHealthCentres;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Notice Board')]")
    protected WebElement txtNoticeBoard;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Oops!!')]/following::p[contains(text(),'Selected health centre location is already connected with your account.')]")
    protected WebElement txtHealthCentreAlreadyConnect;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Connect a health centre')]")
    protected WebElement txtConnectAHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'GP')]//preceding-sibling::div/div[@class='mat-radio-inner-circle']")
    protected WebElement rdoBtnGP;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Health Centre']")
    protected WebElement txtBoxSearchForHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Overview')]")
    protected WebElement elmntOverview;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    protected WebElement btnNext;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'CONNECT')]")
    protected WebElement btnConnect;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Post to Notice Board')]")
    protected WebElement elmntPostToNotice;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Post')]")
    protected WebElement elmntNewPost;

    @FindBy(how = How.XPATH, using = "//iframe[@class='inner_iframe']")
    protected WebElement elmntIframe;

    @FindBy(how = How.XPATH, using = "//body[@id='editorBody']")
    protected WebElement elmntEditorBody;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Created successfully')]/preceding::h4[contains(text(),'Success!')]")
    protected WebElement txtCreatedSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Deleted successfully')]/preceding::h4[contains(text(),'Success!')]")
    protected WebElement txtDeletedSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement drpDownHealthCentre;

    protected String practiceName = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    protected String ddlHealthCentre = new StringBuilder()
            .append("//mat-option//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //li[contains(text(),'MTEVOLUTION,VM04Location2')]
    protected String healthCentre = new StringBuilder()
            .append("//li[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    protected String address = new StringBuilder()
            .append("//p[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    public boolean clickPracticeName(String strPracticeName) {
        boolean blResult = false;
        try {
            System.out.println("strPracticeName >>> :: " + strPracticeName);
            waitForElement(elmntMyHealthCentres);
            waitForElementClickable(elmntMyHealthCentres);
            waitAndClick(elmntMyHealthCentres);

            waitForElement(elmntNoticeBoard);
            System.out.println("X path practiceName >>> :: " + practiceName.replace("<<REPLACEMENT>>", strPracticeName));
            WebElement practice = waitForElement(By.xpath(practiceName.replace("<<REPLACEMENT>>", strPracticeName)));
            waitForElement(practice);
            waitForElementClickable(practice);
            waitAndClick(practice);

            blResult = verifyElement(elmntOverview);
        } catch (Exception e) {
            System.out.println("\n Failed to click PracticeName >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickNoticeBoard() {
        boolean blResult = false;
        try {
            waitForElement(elmntMyHealthCentres);
            waitForElementClickable(elmntMyHealthCentres);
            waitAndClick(elmntMyHealthCentres);

            waitForElement(elmntNoticeBoard);
            waitForElementClickable(elmntNoticeBoard);
            waitAndClick(elmntNoticeBoard);

            blResult = verifyElement(txtNoticeBoard);
        } catch (Exception e) {
            System.out.println("\n Failed to click NoticeBoard >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickConnectToHealthCentre() {
        boolean blResult = false;
        try {
            waitForElement(elmntMyHealthCentres);
            waitForElementClickable(elmntMyHealthCentres);
            waitAndClick(elmntMyHealthCentres);

            waitForElement(elmntConnectToHealthCentre);
            waitForElementClickable(elmntConnectToHealthCentre);
            waitAndClick(elmntConnectToHealthCentre);

            blResult = verifyElement(txtConnectAHealthCentre);
        } catch (Exception e) {
            System.out.println("\n Failed to click Connect To HealthCentre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickConnectAHealthCentre() {
        boolean blResult = false;
        try {
            waitForElement(txtConnectAHealthCentre);
            waitForElement(btnConnectAHealthCentre);
            waitForElementClickable(btnConnectAHealthCentre);
            waitAndClick(btnConnectAHealthCentre);

            waitForElement(txtBoxSearchForHealthCentre);
            blResult = verifyElement(txtBoxSearchForHealthCentre);
        } catch (Exception e) {
            System.out.println("\n Failed to click Connect A HealthCentre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean searchHealthCentre(String strHealthCentre) {
        boolean blResult = false;
        try {
            clickGP();
            System.out.println("strHealthCentre >>> "+strHealthCentre);
            waitForElement(txtBoxSearchForHealthCentre);
            waitForElementClickable(txtBoxSearchForHealthCentre);
            enterValue(txtBoxSearchForHealthCentre, strHealthCentre);
            waitForSeconds(2);

            System.out.println("\nX-path for address >>> :: "+healthCentre.replace("<<REPLACEMENT>>",strHealthCentre));
            WebElement HealthCentre=waitForElement(By.xpath(healthCentre.replace("<<REPLACEMENT>>",strHealthCentre)));
            waitForElement(HealthCentre);
            waitAndClick(HealthCentre);

            waitForElement(btnNext);
            waitForElementClickable(btnNext);
            waitAndClick(btnNext);

            waitForElement(btnConnect);
            blResult = verifyElement(btnConnect);
        } catch (Exception e) {
            System.out.println("\n Failed to click Connect A HealthCentre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean connectHealthCentre(String strHealthCentre) {
        boolean blResult = false;
        try {
            System.out.println("strHealthCentre >>> "+strHealthCentre);
            waitForElement(btnConnect);
            waitForSeconds(2);

            System.out.println("\nX-path for address >>> :: "+address.replace("<<REPLACEMENT>>",strHealthCentre));
            WebElement HealthCentre=waitForElement(By.xpath(address.replace("<<REPLACEMENT>>",strHealthCentre)));
            waitForElement(HealthCentre);

            waitForElement(btnConnect);
            waitForElementClickable(btnConnect);
            waitAndClick(btnConnect);

            waitForElement(txtHealthCentreAlreadyConnect);
            blResult = verifyElement(txtHealthCentreAlreadyConnect);
        } catch (Exception e) {
            System.out.println("\n Failed to Connect A HealthCentre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickGP() {
        waitForElement(txtBoxSearchForHealthCentre);
        waitForSeconds(2);
        waitForElement(rdoBtnGP);
        waitForElementClickable(rdoBtnGP);
        waitAndClick(rdoBtnGP);
    }

}

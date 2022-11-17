package MMH_SANITY.pages;

import cap.common.BasePage;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health Centres')]")
    protected WebElement elmntMyHealthCentres;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Notice Board')]")
    protected WebElement txtNoticeBoard;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Oops!!')]/following::p[contains(text(),'Selected health centre location is already connected with your account.')]")
    protected WebElement txtHealthCentreAlreadyConnect;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Connect a health centre')]")
    protected WebElement txtConnectAHealthCentre;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome')])[1]")
    protected WebElement txtMyHomePage;

    @FindBy(how = How.XPATH, using = "//div[@class='leftside']")
    protected WebElement elmntsMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search Patients')]/ancestor::div[contains(@class,'breadcrumbs')]")
    protected WebElement txtBCSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Post to Notice Board')]")
    protected WebElement elmntPostNoticeBoard;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'GP')]//preceding-sibling::div/div[@class='mat-radio-outer-circle'])[1]")
    protected WebElement rdoBtnGP;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Health Centre']")
    protected WebElement txtBoxSearchForHealthCentre;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Overview')]")
    protected WebElement elmntOverview;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    protected WebElement btnNext;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'btnSubmitEditor')]")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'CONNECT')]")
    protected WebElement btnConnect;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Post')]")
    protected WebElement elmntNewPost;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Content Header')]")
    protected WebElement txtContentHeader;

    @FindBy(how = How.XPATH, using = "//iframe[@class='inner_iframe']")
    protected WebElement elmntIframe;

    @FindBy(how = How.XPATH, using = "//body[@id='editorBody']")
    protected WebElement elmntEditorBody;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Created successfully')]/preceding::h4[contains(text(),'Success!')]")
    protected WebElement txtCreatedSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Deleted successfully')]/preceding::h4[contains(text(),'Success!')]")
    protected WebElement txtDeletedSuccessPopUp;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlPracticeList')]")
    protected WebElement drpDownHealthCentre;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlSelectType')]")
    protected WebElement drpDownContentType;

    @FindBy(how = How.XPATH, using = "//select[contains(@id,'ddlSelectHeader')]")
    protected WebElement drpDownContentHeader;

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'txtEndDate')]")
    protected WebElement elmntEndDate;

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'txtStartDate')]")
    protected WebElement elmntStartDate;

    protected String practiceName = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();


    //mat-card-title[contains(text(),'Post Header')]
    protected String verifyHeader = new StringBuilder()
            .append("//mat-card-title[contains(text(),'")
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

    //div[contains(text(),'123456qwert')]
    protected String verifyContent = new StringBuilder()
            .append("//div[contains(text(),'")
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
            waitForSeconds(3);
            if (!elmntNoticeBoard.isDisplayed()){
            waitForElement(elmntMyHealthCentres);
            waitForElementClickable(elmntMyHealthCentres);
            waitAndClick(elmntMyHealthCentres);}

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
            waitForSeconds(3);
            if (!elmntConnectToHealthCentre.isDisplayed()){
            waitForElement(elmntMyHealthCentres);
            waitForElementClickable(elmntMyHealthCentres);
            jsClick(elmntMyHealthCentres);}
            waitForSeconds(3);
            waitForElement(elmntConnectToHealthCentre);
            waitForElementClickable(elmntConnectToHealthCentre);
            jsClick(elmntConnectToHealthCentre);

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
            waitForSeconds(3);
//            clickGP();
            jsClick(rdoBtnGP);
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
        System.out.println("111111111111");
        waitForElement(txtBoxSearchForHealthCentre);
        waitForSeconds(2);
        waitForElement(rdoBtnGP);
        waitForElementClickable(rdoBtnGP);
        System.out.println("2222222222222222222");

        waitAndClick(rdoBtnGP);
        System.out.println("333333333333333333");

    }
    public boolean navigateToPostNoticeBoard() {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElement(txtMyHomePage);
            waitForElement(elmntsMenu);
            waitForElement(elmntPostNoticeBoard);
            waitForElementClickable(elmntPostNoticeBoard);
            click(elmntPostNoticeBoard);
            waitForSeconds(1);
            waitForElement(elmntNewPost);
            blResult = verifyElement(elmntNewPost);
            System.out.println("Successfully navigated to Post notice board >>> :: ");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to navigate Post notice board >>> :: ");
        }
        return blResult;
    }

    public boolean selectHealthCenter(String strHealthCenter) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntNewPost);
            waitForElement(drpDownHealthCentre);
            waitForElementClickable(drpDownHealthCentre);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlPracticeList')]")));
            System.out.println("strHealthCenter >>> :: "+strHealthCenter);
            healthCentre.selectByVisibleText(strHealthCenter);
            waitForSeconds(2);

            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectContentHeader(String strHeader) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntNewPost);
            jsScrollIntoView(txtContentHeader);
            waitForElement(drpDownContentHeader);
            waitForElementClickable(drpDownContentHeader);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlSelectHeader')]")));
            System.out.println("strHealthCenter >>> :: "+strHeader);
            healthCentre.selectByVisibleText(strHeader);
            waitForSeconds(5);
            waitForElement(txtContentHeader);
            blResult = verifyElement(txtContentHeader);
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectContentType(String strType) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntNewPost);
            jsScrollIntoView(txtContentHeader);
            waitForElement(drpDownContentType);
            waitForElementClickable(drpDownContentType);
            Select healthCentre = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlSelectType')]")));
            System.out.println("strHealthCenter >>> :: "+strType);
            healthCentre.selectByVisibleText(strType);

            waitForSeconds(5);
            waitForElement(txtContentHeader);
            blResult = verifyElement(txtContentHeader);

            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean selectDate() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(elmntStartDate);
            String strStartDate = DateUtil.getDate("YESTERDAY","dd/MM/YYYY");
            System.out.println("strStartDate >>> :: "+strStartDate);
            enterValue(elmntStartDate,strStartDate);

            waitForElement(elmntEndDate);
            String strEndDate=DateUtil.getDate("TOMORROW","dd/MM/YYYY");
            System.out.println("strEndDate >>> :: "+strEndDate);
            enterValue(elmntEndDate,strEndDate);

            blResult = true;
            System.out.println("\nSuccessfully selected the health centre >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to select the health centre >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean enterBodyMessage(String strBodyMessage) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(btnSave);
            driver.switchTo().frame(elmntIframe);
            waitForSeconds(2);
            waitForElementClickable(elmntEditorBody);

            elmntEditorBody.sendKeys(strBodyMessage);
            takeScreenshot(driver);
            waitForSeconds(3);
            driver.switchTo().parentFrame();

            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
            System.out.println("\nSuccessfully Entered The Subject Body Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean verifyNoticeBoardMessage(String strDetail) {
        boolean blResult = false;
        try {
            List<String> lstDetail = TestDataUtil.getListOfValue(strDetail);
            System.out.println("lstDetail >>> :: "+lstDetail);
            waitForSeconds(2);
            waitForElement(txtNoticeBoard);

            jsScroll();

            System.out.println("X-Path for Header >>> :: "+verifyHeader.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetail.get(0))));
            WebElement header = waitForElement(By.xpath(verifyHeader.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetail.get(0)))));
            waitForElement(header);

             System.out.println("X-Path for content >>> :: "+verifyContent.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetail.get(1))));
            WebElement content = waitForElement(By.xpath(verifyContent.replace("<<REPLACEMENT>>", TestDataUtil.getValue(lstDetail.get(1)))));
            waitForElement(header);

            takeScreenshot(driver);

            blResult = verifyElement(header);
            System.out.println("\nSuccessfully Entered The Subject Body Message >>> :: ");
        } catch (Exception e) {
            System.out.println("\nFailed to Enter the Subject Message >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickNewPost(){
        waitForSeconds(2);
        waitForElement(elmntNewPost);
        waitForElementClickable(elmntNewPost);
        waitAndClick(elmntNewPost);
        waitForSeconds(2);
        jsScrollIntoView(btnSave);
        waitForElement(btnSave);
        return verifyElement(btnSave);
    }

    public void clickSave(){
        waitForSeconds(2);
        waitForElement(btnSave);
        waitForElementClickable(btnSave);
        waitAndClick(btnSave);
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.getDate("TODAY","dd/MM/YYYY"));
        System.out.println(DateUtil.getDate("TOMORROW","dd/MM/YYYY"));

        StringBuilder str = new StringBuilder("Naveen");
        str.reverse();
        System.out.println(str);
    }

}

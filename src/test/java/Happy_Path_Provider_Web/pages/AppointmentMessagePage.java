package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.event.KeyEvent;

import static cap.utilities.SharedDriver.strExecutionID;

public class AppointmentMessagePage extends BasePage {

    public AppointmentMessagePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//h1[text()=' Appointment Message ']")
    protected WebElement elmntAppointmentMssgHeading;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[1]")
    protected WebElement elmntEnableBannerMssg;


    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[2]")
    protected WebElement elmntDisableBannerMssg;


    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[4]")
    protected WebElement elmntEnableWebBannerMessage;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='easyBookingHeading']")
    protected WebElement elmntBannerHeading;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='WebAppointmentBannerHeading']")
    protected WebElement elmntWebBannerHeading;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[5]")
    protected WebElement elmntDisableWebBannerMessage;

    @FindBy(how = How.XPATH, using = "(//iframe[@class='k-iframe'])[1]")
    protected WebElement frameBannerMessage;

    @FindBy(how = How.XPATH, using = "(//iframe[@class='k-iframe'])[2]")
    protected WebElement frameWebBannerMessage;

    @FindBy(how = How.XPATH, using = "//kendo-editor[@formcontrolname='easyBookingBannerMessage']/descendant::div")
    protected WebElement elmntBannerMessage;

    @FindBy(how = How.XPATH, using = "//kendo-editor[@formcontrolname='webAppointmentBannerMessage']")
    protected WebElement elmntWebBannerMessage;

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror']//p)[1]")
    protected WebElement elmntWriteBannerMessage;

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror']//p)[1]")
    protected WebElement elmntWriteWebBannerMessage;

    @FindBy(how = How.XPATH, using = "//button[.=' Edit ']")
    protected WebElement elmntEditbtn;

    @FindBy(how = How.XPATH, using = "//span[text()='SIGN OUT']")
    protected WebElement elmntSignOutBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='searchFilter1']/child::span")
    protected WebElement elmntAllRadioBtn;

    @FindBy(how = How.XPATH, using = "//label[text()='All']")
    protected WebElement elmntAll;

    @FindBy(how = How.XPATH, using = "//span[text()=' Close ']")
    protected WebElement elmntCloseSuccessLogin;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter search keyword here']")
    protected WebElement elmntSearchBox;

    @FindBy(how = How.XPATH, using = "//h2[.='Automation_Practice1_Loc1']")
    protected WebElement elmntLocation;

    @FindBy(how = How.XPATH, using = "//button[.='SEARCH']")
    protected WebElement btnSearch;

    @FindBy (how = How.XPATH, using = "//img[@class='header-logo']")
    protected WebElement MMHLogo;

    @FindBy (how = How.XPATH, using = "//div/a/img[@alt='ManageMyHealth']")
    protected WebElement MMHParentPageLogo;

    @FindBy (how = How.XPATH, using = "//span[normalize-space(text())='Close']")
    protected WebElement btnCloseAppointmentMssg;

    protected String elmntFindHealthCenterLocation = new StringBuilder()
            .append("(//h2[.='").append("<<REPLACEMENT>>").append("'])[1]").toString();


    protected String elmntBookNowOption = new StringBuilder()
            .append("//h2[.='").append("<<REPLACEMENT>>").append("']/parent::div/following-sibling::div/child::div/a[text()='More info']").toString();


    protected String elmntVerifyBannerHeading = new StringBuilder()
            .append("//h4/b[text()='").append("<<REPLACEMENT>>").append(":']").toString();

    protected String elmntVerifyWebBannerHeading = new StringBuilder()
            .append("//div[text()='").append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntVerifyWebBannerMessage = new StringBuilder()
            .append("//p[text()='").append("<<REPLACEMENT>>").append("']").toString();
    protected String elmntVerifyBannerMessage = new StringBuilder()
            .append("//h4/p[text()='").append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    public boolean clickBannerMessageYesRadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntEnableBannerMssg);
            jsClick(elmntEnableBannerMssg);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to click BannerMessage Yes Radio Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBannerMessageNoRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntDisableBannerMssg);
            jsClick(elmntDisableBannerMssg);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to click BannerMessage No Radio Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntBannerHeading);
            jsClick(elmntBannerHeading);
            waitForSeconds(2);
            elmntBannerHeading.clear();
            waitForSeconds(2);
            elmntBannerHeading.sendKeys(strHeading.concat(strExecutionID));
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to Enter Banner Heading Text Box >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterBannerMessage(String strBannerMessage) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntBannerMessage);
            waitForElement(elmntBannerMessage);
            driver.switchTo().frame(frameBannerMessage);
            waitForSeconds(2);
            click(elmntWriteBannerMessage);
            waitForSeconds(2);
            driver.switchTo().activeElement().clear();
            waitForSeconds(2);
            elmntWriteBannerMessage.click();
            waitForSeconds(2);
            driver.switchTo().activeElement().sendKeys(strBannerMessage);
            waitForSeconds(2);
            driver.switchTo().defaultContent();
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to Enter Banner Message Text Box >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickEditButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEditbtn);
            waitForElement(elmntEditbtn);
            jsClick(elmntEditbtn);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed click Edit Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean closeSuccessPopUp() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            verifyElement(elmntAppointmentMssgHeading);
            jsScrollIntoView(elmntCloseSuccessLogin);
            click(elmntCloseSuccessLogin);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed click close Success PopUp >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }






    public boolean clickSignOut() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            click(elmntSignOutBtn);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed click close Sign Out >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickAllRadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            boolean radioBtn = elmntAllRadioBtn.isSelected();
            if (radioBtn == true) {
                verifyElement(elmntAll);
            } else {
                click(elmntAllRadioBtn);
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
            }
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed click close All Radio Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterLocationInSearchBox(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            enterValue(elmntSearchBox, strLocation);
            waitForElement(btnSearch);
            click(btnSearch);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To Enter Location In Search Box >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyHealthCenterLocation(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            By bookedAppointment = By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation)));
            System.out.println(">>>>>>>>>>>>bookedAppointment"+bookedAppointment);
            if (verifyElement(bookedAppointment)){
                WebElement elmntLocation = waitForElement(By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));   System.out.println(">>>>>>>>>>>>bookedAppointment"+bookedAppointment);
                System.out.println(">>>>>>>>>>>>elmntLocation"+elmntLocation);
                verifyElement(elmntLocation);
            }else {
                refreshPage();
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
                WebElement elmntLocation = waitForElement(By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                System.out.println(">>>>>>>>>>>>elmntLocation"+elmntLocation);
                verifyElement(elmntLocation);
            }
            blresult = verifyElement(elmntLocation);
        } catch (Exception e) {
            System.out.println("Failed To verify Health Center Location >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBookNow(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement btnBookNow = waitForElement(By.xpath(elmntBookNowOption.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            System.out.println(">>>>>>>>>>>>>"+btnBookNow);
            jsClick(btnBookNow);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To click Book Now >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyBannerHeading.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHeading.concat(strExecutionID)))));
            blresult = verifyElement(elmntBannerHeading);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
        } catch (Exception e) {
            System.out.println("Failed To  verify Banner Heading >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyBannerMessage(String strMessage) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerMessage = waitForElement(By.xpath(elmntVerifyBannerMessage.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            blresult = verifyElement(elmntBannerMessage);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
        } catch (Exception e) {
            System.out.println("Failed To  verify Banner Message >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickPatientWebBannerMessageYesRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntEnableWebBannerMessage);
            jsClick(elmntEnableWebBannerMessage);
            takeScreenshot(driver);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To click Patient Web Banner Message Yes Radio Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean enterWebBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntWebBannerHeading);
            waitForElement(elmntWebBannerHeading);
            click(elmntWebBannerHeading);
            waitForElement(elmntWebBannerHeading);
            elmntWebBannerHeading.clear();
            elmntWebBannerHeading.sendKeys(strHeading.concat(strExecutionID));
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To Enter Web Banner Heading Text Box >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean enterWebBannerMessage(String strBannerMssg) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntWebBannerMessage);
            waitForElement(elmntWebBannerMessage);
            driver.switchTo().frame(frameWebBannerMessage);
            waitForSeconds(2);
            click(elmntWriteWebBannerMessage);
            waitForSeconds(2);
            driver.switchTo().activeElement().clear();
            waitForSeconds(2);
            elmntWriteWebBannerMessage.click();
            waitForSeconds(2);
            driver.switchTo().activeElement().sendKeys(strBannerMssg.concat(strExecutionID));
            waitForSeconds(2);
            driver.switchTo().defaultContent();
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To Enter Web Banner Heading Text Box >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyWebBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            String strdata=TestDataUtil.getValue(strHeading).concat(strExecutionID);
            System.out.println("strdata ::::: "+strdata);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyWebBannerHeading.replaceAll("<<REPLACEMENT>>", strdata)));
            blresult = verifyElement(elmntBannerHeading);
        } catch (Exception e) {
            System.out.println("Failed To verify Web Banner Heading >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyWebBannerMessage(String strHeading) {
        boolean blresult = false;
        try {
            String strdata=TestDataUtil.getValue(strHeading).concat(strExecutionID);
            System.out.println("strdata ::::: "+strdata);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyWebBannerMessage.replaceAll("<<REPLACEMENT>>", strdata)));
            blresult = verifyElement(elmntBannerHeading);
        } catch (Exception e) {
            System.out.println("Failed To verify Web Banner Heading >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyWebBannerMessageNotDisplayed(String strHeading) {
        boolean blresult = false;
        try {
            String strdata=TestDataUtil.getValue(strHeading).concat(strExecutionID);
            System.out.println("strdata ::::: "+strdata);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyWebBannerMessage.replaceAll("<<REPLACEMENT>>", strdata)));
            System.out.println(">>>>>>>>>elmntBannerHeading"+elmntBannerHeading);
            if (!verifyElement(elmntBannerHeading)){
                blresult=true;
            }else {
                verifyElement(elmntBannerHeading);
                blresult=false;
            }
        } catch (Exception e) {
            System.out.println("Failed To verify Web Banner Heading >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyWebBannerMessageDisplayed(String strHeading) {
        boolean blresult = false;
        try {
            String strdata=TestDataUtil.getValue(strHeading).concat(strExecutionID);
            System.out.println("strdata ::::: "+strdata);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyWebBannerMessage.replaceAll("<<REPLACEMENT>>", strdata)));
            System.out.println(">>>>>>>>>elmntBannerHeading"+elmntBannerHeading);
            if (isElementDisplayed(elmntBannerHeading)){
                blresult=true;
            }else {
                verifyElement(elmntBannerHeading);
                blresult=false;
            }
        } catch (Exception e) {
            System.out.println("Failed To verify Web Banner Heading >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickPatientWebBannerMessageNoRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntDisableWebBannerMessage);
            jsClick(elmntDisableWebBannerMessage);
            takeScreenshot(driver);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed To click Patient Web Banner Message Yes Radio Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


}

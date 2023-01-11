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

public class AppointmentMessagePage extends BasePage {

    public AppointmentMessagePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//h1[text()=' Appointment Message ']")
    protected WebElement elmntAppointmentMssgHeading;

    @FindBy(how = How.XPATH, using = "//div[.='keyboard_arrow_down']")
    protected WebElement elmntSelectHealthCentre;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[1]")
    protected WebElement elmntEnableBannerMssg;

//    (//mat-radio-group[@formcontrolname='easyBookingBanner']//following::mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked']//input)[1]

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[2]")
    protected WebElement elmntDisableBannerMssg;


    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='easyBookingBanner']//following::input)[4]")
    protected WebElement elmntEnableWebBannerMessage;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='easyBookingHeading']")
    protected WebElement elmntBannerHeading;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='WebAppointmentBannerHeading']")
    protected WebElement elmntWebBannerHeading;



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

    @FindBy(how = How.XPATH, using = "(//div[@class='ProseMirror']//p)[2]")
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

    @FindBy(how = How.XPATH, using = "(//h2[.='VM03Location'])[1]")
    protected WebElement elmntLocation;

    @FindBy(how = How.XPATH, using = "//button[.='SEARCH']")
    protected WebElement btnSearch;

    @FindBy (how = How.XPATH, using = "//img[@class='header-logo']")
    protected WebElement MMHLogo;

    @FindBy (how = How.XPATH, using = "//div/a/img[@alt='ManageMyHealth']")
    protected WebElement MMHParentPageLogo;

    @FindBy (how = How.XPATH, using = "//span[normalize-space(text())='Close']")
    protected WebElement btnCloseAppointmentMssg;


    protected String elmntBannerMessageText = new StringBuilder()
            .append("//div//p[text()='").append("<<REPLACEMENT>>").append("']").toString();


    protected String elmntFindHealthCenterLocation = new StringBuilder()
            .append("(//h2[.='").append("<<REPLACEMENT>>").append("'])[1]").toString();


    protected String elmntBookNowOption = new StringBuilder()
            .append("(//h2[.='").append("<<REPLACEMENT>>").append("']/parent::div/following-sibling::div/child::div/a[text()='Book now'])[2]").toString();


    protected String elmntVerifyBannerHeading = new StringBuilder()
            .append("//h4/b[text()='").append("<<REPLACEMENT>>").append(":']").toString();

    protected String elmntVerifyWebBannerHeading = new StringBuilder()
            .append("//p[text()='").append("<<REPLACEMENT>>").append("']").toString();

    protected String elmntVerifyBannerMessage = new StringBuilder()
            .append("//h4/p[text()='").append("<<REPLACEMENT>>").append("']").toString();


    public boolean verifyAppointmentHeading() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntAppointmentMssgHeading);
            blresult = verifyElement(elmntAppointmentMssgHeading);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickBannerMssgYesRadiobtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntEnableBannerMssg);
            jsClick(elmntEnableBannerMssg);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBannerMessageNoRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntDisableBannerMssg);
            jsClick(elmntDisableBannerMssg);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntBannerHeading);
            jsClick(elmntBannerHeading);
            waitForSeconds(2);
            elmntBannerHeading.clear();
            waitForSeconds(2);
            elmntBannerHeading.sendKeys(strHeading);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterBannerMessage(String strBannerMssg) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntBannerMessage);
            waitForElement(elmntBannerMessage);
//            elmntBannerMessage.click();
            driver.switchTo().frame(frameBannerMessage);
            waitForSeconds(2);
            click(elmntWriteBannerMessage);
            waitForSeconds(2);
            driver.switchTo().activeElement().clear();
            waitForSeconds(2);
            elmntWriteBannerMessage.click();
            waitForSeconds(2);
            driver.switchTo().activeElement().sendKeys(strBannerMssg);
            waitForSeconds(2);
            driver.switchTo().defaultContent();
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickEditbtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntEditbtn);
            waitForElementClickable(elmntEditbtn);
            waitForSeconds(2);
            click(elmntEditbtn);
            System.out.println("Successfully click Edit Button");
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean closeSuccessPopUp() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            verifyElement(elmntAppointmentMssgHeading);
            jsScrollIntoView(elmntCloseSuccessLogin);
            click(elmntCloseSuccessLogin);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean VerifyBannerMessage(String strBannerMessage) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntBannerText = waitForElement(By.xpath(elmntBannerMessageText.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strBannerMessage))));
            blresult = verifyElement(elmntBannerText);
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickDropDownHealthCenter() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntSelectHealthCentre);
            if (verifyElement(elmntSelectHealthCentre)) {
                waitForElementClickable(elmntSelectHealthCentre);
                click(elmntSelectHealthCentre);
            } else {
                jsClick(elmntSelectHealthCentre);
            }

            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickSignOut() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            click(elmntSignOutBtn);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickAllRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            boolean radioBtn = elmntAllRadioBtn.isSelected();
            if (radioBtn == true) {
                verifyElement(elmntAll);
            } else {
                click(elmntAllRadioBtn);
            }
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean enterLocationInSearchBox(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            enterValue(elmntSearchBox, strLocation);
            waitForElement(btnSearch);
            click(btnSearch);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyHealthCenterLocation(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            By bookedAppointment = By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation)));
            if (verifyElement(bookedAppointment)){
                WebElement elmntLocation = waitForElement(By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                verifyElement(elmntLocation);
            }else {
                refreshPage();
                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                WebElement elmntLocation = waitForElement(By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                verifyElement(elmntLocation);
            }
            blresult = verifyElement(elmntLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBookNow(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement btnBookNow = waitForElement(By.xpath(elmntBookNowOption.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            click(btnBookNow);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyBannerHeading.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHeading))));
            blresult = verifyElement(elmntBannerHeading);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyBannerMessage(String strMessage) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntBannerMessage = waitForElement(By.xpath(elmntVerifyBannerMessage.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strMessage))));
            blresult = verifyElement(elmntBannerMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickMMHLogo() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            click(MMHLogo);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(MMHParentPageLogo);
            blresult = verifyElement(MMHParentPageLogo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean closeAppointmentMssgPage() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(btnCloseAppointmentMssg);
            waitForElementClickable(btnCloseAppointmentMssg);
            click(btnCloseAppointmentMssg);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickPatientWebBannerMessageYesRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntEnableWebBannerMessage);
            jsClick(elmntEnableWebBannerMessage);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean enterWebBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntWebBannerHeading);
            jsClick(elmntWebBannerHeading);
            waitForElement(elmntWebBannerHeading);
//            waitForSeconds(2);
            elmntWebBannerHeading.clear();
//            waitForSeconds(2);
            elmntWebBannerHeading.sendKeys(strHeading);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean enterWebBannerMessage(String strBannerMssg) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntWebBannerMessage);
            waitForElement(elmntWebBannerMessage);
//            elmntBannerMessage.click();
            driver.switchTo().frame(frameWebBannerMessage);
            waitForSeconds(2);
            click(elmntWriteWebBannerMessage);
            waitForSeconds(2);
            driver.switchTo().activeElement().clear();
            waitForSeconds(2);
            elmntWriteWebBannerMessage.click();
            waitForSeconds(2);
            driver.switchTo().activeElement().sendKeys(strBannerMssg);
            waitForSeconds(2);
            driver.switchTo().defaultContent();
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyWebBannerHeading(String strHeading) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntBannerHeading = waitForElement(By.xpath(elmntVerifyWebBannerHeading.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHeading))));
            blresult = verifyElement(elmntBannerHeading);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }







}

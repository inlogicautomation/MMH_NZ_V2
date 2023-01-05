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


    @FindBy(how = How.XPATH, using = "//h1[text()='Appointment Message']")
    protected WebElement elmntAppointmentMssgHeading;

    @FindBy(how = How.XPATH, using = "//div[.='keyboard_arrow_down']")
    protected WebElement elmntSelectHealthCentre;

    @FindBy(how = How.XPATH, using = "//p[.='Easy Booking-Enable Banner Message']/parent::div/descendant::mat-radio-button[@value='true']/descendant::div[@class='mat-radio-inner-circle']")
    protected WebElement elmntEnableBannerMssg;

    @FindBy(how = How.XPATH, using = "//p[.='Easy Booking-Enable Banner Message']/parent::div/descendant::mat-radio-button[@value='false']/descendant::div[@class='mat-radio-inner-circle']")
    protected WebElement elmntDisableBannerMssg;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='easyBookingHeading']")
    protected WebElement elmntBannerHeading;

    @FindBy(how = How.XPATH, using = "(//iframe[@class='k-iframe'])[1]")
    protected WebElement frameBannerMessage;

    @FindBy(how = How.XPATH, using = "//kendo-editor[@formcontrolname='easyBookingBannerMessage']/descendant::div")
    protected WebElement elmntBannerMessage;

    @FindBy(how = How.XPATH, using = "//button[.=' Edit ']")
    protected WebElement elmntEditbtn;

    @FindBy(how = How.XPATH, using = "//span[text()='SIGN OUT']")
    protected WebElement elmntSignOutBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='searchFilter1']/child::span")
    protected WebElement elmntAllRadioBtn;

    @FindBy(how = How.XPATH, using = "//label[text()='All']")
    protected WebElement elmntAll;

    @FindBy(how = How.XPATH, using = "//div//a[@class='close']")
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
            click(elmntEnableBannerMssg);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBannerMssgNoRadioBtn() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntDisableBannerMssg);
            click(elmntDisableBannerMssg);
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
            elmntBannerHeading.clear();
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
            waitForElement(elmntBannerMessage);
            elmntBannerMessage.click();
            driver.switchTo().frame(frameBannerMessage);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            WebElement activeElmnt = driver.switchTo().activeElement();
            activeElmnt.sendKeys(strBannerMssg);
            focusBackToDefaultFrame();
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
            waitForElementClickable(elmntEditbtn);
            click(elmntEditbtn);
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
            jsScrollIntoView(elmntAppointmentMssgHeading);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            click(elmntCloseSuccessLogin);
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
            }else {
                refreshPage();
                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                WebElement elmntLocation = waitForElement(By.xpath(elmntFindHealthCenterLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
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





}

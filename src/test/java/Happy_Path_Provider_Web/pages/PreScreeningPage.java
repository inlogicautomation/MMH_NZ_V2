package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PreScreeningPage extends BasePage {

    public PreScreeningPage(WebDriver driver) {

        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//h1[.='Pre-Screening Settings']")
    protected WebElement elmntPreScreening;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Edit']")
    protected WebElement btnPreScreeningEdit;

    @FindBy(how = How.XPATH, using = "//div[.='keyboard_arrow_down']")
    protected WebElement elmntSelectHealthCentre;


    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Save']")
    protected WebElement elmntUpdate;


    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Close']")
    protected WebElement elmntClose;


    @FindBy (how = How.XPATH, using = "//h4[.='Let’s book your appointment.']")
    protected WebElement elmntBookAppointmentPage;

    @FindBy (how = How.XPATH, using = "//div[contains(@id,'cdk-overlay')]")
    protected WebElement elmntCovidPopup;


    @FindBy (how = How.XPATH, using = "//span[text()='Dashboard']")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='locationCenter']")
    protected WebElement elmntLocationCenter;

    protected String elmntLocation = new StringBuilder().append("//h6[text()='")
            .append("<<REPLACEMENT>>").append("']").toString();


    protected String elmntLocationIsInSelectedState = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>").append("']//ancestor::div[@class='ng-star-inserted']//child::div//input[@aria-checked='true']").toString();


    protected String elmntLocationIsInDeSelectedState = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>").append("']//ancestor::div[@class='ng-star-inserted']//child::div//input[@aria-checked='false']").toString();


    protected String elmntUpdated = new StringBuilder()
            .append("//span[text()='").append("<<REPLACEMENT>>").append("']").toString();


    protected String strHealthCentreLocation = new StringBuilder()
            .append("//div[@role='listbox']//span[normalize-space(text())='").append("<<REPLACEMENT>>").append("']").toString();


    protected String strSelectLocation = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::div[@class='ng-star-inserted']").toString();





    public boolean VerifySreeningPage() {
        boolean blresult = false;
        try {
            waitForElement(elmntPreScreening);
            blresult = verifyElement(elmntPreScreening);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickPreScreeningEdit() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(btnPreScreeningEdit);
            btnPreScreeningEdit.click();
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickHealthCentreDropDown() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntSelectHealthCentre);
            jsClick(elmntSelectHealthCentre);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean selectHealthCentre(String strHealthCentre) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntHealthCentreLocation = waitForElement(By.xpath(strHealthCentreLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHealthCentre))));
            click(elmntHealthCentreLocation);
            System.out.printf("Successfully select a Health centre");
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean selectLocation(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntLocation = waitForElement(By.xpath(strSelectLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            click(elmntLocation);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickUpdateButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntUpdate);
            waitForElementClickable(elmntUpdate);
            click(elmntUpdate);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickCloseButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntClose);
            click(elmntClose);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyUpdates(String strHealthCenter) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntHealthCenter = waitForElement(By.xpath(elmntUpdated.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHealthCenter))));
            waitForElement(elmntHealthCenter);
            blresult = verifyElement(elmntHealthCenter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean DeselectTheLocations(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForSeconds(2);
            WebElement LocationIsSelected = waitForElement(By.xpath(elmntLocationIsInSelectedState.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            jsClick(LocationIsSelected);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean ToselectTheLocations(String strLocation) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForSeconds(2);
            WebElement LocationIsNotSelected = waitForElement(By.xpath(elmntLocationIsInDeSelectedState .replaceAll("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
            jsClick(LocationIsNotSelected);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean VerifyCovidPopup(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntCovidPopup);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            blresult = verifyElement(elmntCovidPopup);;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  blresult;
    }


    public boolean ClickDashBoard(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            click(elmntDashBoard);
            blresult = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  blresult;
    }


    public boolean selectTheLocation(String strLocation) {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntLocationCenter);
            waitForSeconds(2);
            waitAndClick(elmntLocationCenter);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            WebElement elmntSelectLocation = waitForElement(By.xpath(elmntLocation.replace("<<REPLACEMENT>>", strLocation)));
            waitAndClick(elmntSelectLocation);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


}

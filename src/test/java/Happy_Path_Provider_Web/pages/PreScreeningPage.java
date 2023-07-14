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

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntSelectHealthCentre;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Save']")
    protected WebElement elmntUpdate;


    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Close']")
    protected WebElement elmntClose;

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


    protected String deselectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@ng-reflect-model='false']//input").toString();

    protected String selectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@ng-reflect-model='true']//input").toString();


    public boolean clickPreScreeningEdit() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(btnPreScreeningEdit);
            waitForElementClickable(btnPreScreeningEdit);
           click(btnPreScreeningEdit);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed Click PreScreening Edit");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickHealthCentreDropDown() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElementClickable(elmntSelectHealthCentre);
            jsClick(elmntSelectHealthCentre);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed select a Health centre Dropdown");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean selectHealthCentre(String strHealthCentre) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntHealthCentreLocation = waitForElement(By.xpath(strHealthCentreLocation.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHealthCentre))));
            click(elmntHealthCentreLocation);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed select a Health centre");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean deselectCovidPreScreeningPopup(String strLocation) {
        boolean blresult = false;
        try {
            jsScrollDown();
            jsScrollIntoView(elmntUpdate);
            if (verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                takeScreenshot(driver);
                System.out.println("Appointment PreScreening CheckBox Already Unchecked");
            }
            else {
                WebElement elmntHealthCentreLocation = waitForElement(By.xpath(selectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
                System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation"+ elmntHealthCentreLocation);
                jsClick(elmntHealthCentreLocation);
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
                verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
                takeScreenshot(driver);
                System.out.println("Appointment PreScreening CheckBox UnChecked::");
            }
            blresult = true;
        } catch (Exception e) {
            System.out.println("Cannot Successfully verify Appointment PreScreening CheckBox");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean selectCovidPreScreeningPopup(String strLocation) {
        boolean blresult = false;
        try {
            jsScrollDown();
            jsScrollIntoView(elmntUpdate);
            waitForSeconds(3);
            if (verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                takeScreenshot(driver);
                System.out.println("Appointment PreScreening CheckBox Already checked");
                blresult = true;
            }
            if (!verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
            WebElement elmntHealthCentreLocation2 = waitForElementClickable(By.xpath(deselectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation2"+ elmntHealthCentreLocation2);
            waitForElement(elmntHealthCentreLocation2);
            jsClick(elmntHealthCentreLocation2);
                waitForElementDisappear(driver,By.xpath(elmntSpinner));
            verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
                takeScreenshot(driver);
            System.out.println("Appointment PreScreening CheckBox Checked::");
                blresult = true;
            }
            blresult = true;
        }
        catch (Exception e) {

            System.out.println("Cannot Successfully verify Appointment PreScreening CheckBox");
                e.printStackTrace();
        }
        return blresult;
    }



    public boolean clickUpdateButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmntUpdate);
            waitForElementClickable(elmntUpdate);
            click(elmntUpdate);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to click Update Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickCloseButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmntClose);
            click(elmntClose);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            blresult = true;
        } catch (Exception e) {
            System.out.println("Failed to click Close Button >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyUpdates(String strHealthCenter) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntHealthCenter = waitForElement(By.xpath(elmntUpdated.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strHealthCenter))));
            System.out.printf(">>>>>>>>>>>>elmntHealthCenter>>>>"+elmntHealthCenter);
            waitForElement(elmntHealthCenter);
            blresult = verifyElement(elmntHealthCenter);
        } catch (Exception e) {
            System.out.println("Failed to verify Updates >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean ClickDashBoard(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            click(elmntDashBoard);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
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

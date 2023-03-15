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


    protected String deselectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid']//input").toString();

    //span[normalize-space(text())='VM03Location']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']//input

    //span[normalize-space(text())='VM03Location']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-untouched ng-pristine ng-valid']//input
    protected String selectCovidPreScreeningPopup = new StringBuilder()
            .append("//span[normalize-space(text())='").append("<<REPLACEMENT>>")
            .append("']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-valid mat-checkbox-checked ng-dirty ng-touched']//input").toString();
    //span[normalize-space(text())='VM03Location']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched mat-checkbox-checked']//input

    //span[normalize-space(text())='VM03Location2']//ancestor::mat-checkbox[@class='mat-checkbox mat-accent ng-valid mat-checkbox-checked ng-dirty ng-touched']//input





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
            jsScrollIntoView(btnPreScreeningEdit);
            waitForElementClickable(btnPreScreeningEdit);
           click(btnPreScreeningEdit);
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
            System.out.println("Successfully select a Health centre");
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean deselectCovidPreScreeningPopup(String strLocation) {
        boolean blresult = false;
        try {
            jsScrollDown();
            jsScrollIntoView(elmntUpdate);
            WebElement elmntHealthCentreLocation = waitForElement(By.xpath(selectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation"+ elmntHealthCentreLocation);
            if (verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                System.out.println("Appointment PreScreening CheckBox Already Unchecked");
            }
            else {
                jsClick(elmntHealthCentreLocation);
                verifyElement(By.xpath(deselectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
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
//            WebElement elmntHealthCentreLocation = waitForElementClickable(By.xpath(selectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
//            System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation"+ elmntHealthCentreLocation);
////            verifyElement(elmntHealthCentreLocation);
//            System.out.println("Appointment PreScreening CheckBox Already checked");
            if (verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
                System.out.println("Appointment PreScreening CheckBox Already checked");
                blresult = true;
            }
            if (!verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))))) {
            WebElement elmntHealthCentreLocation2 = waitForElementClickable(By.xpath(deselectCovidPreScreeningPopup.replaceAll("<<REPLACEMENT>>", TestDataUtil.getValue(strLocation))));
            System.out.println(">>>>>>>>>>>>elmntHealthCentreLocation2"+ elmntHealthCentreLocation2);
//            jsScrollIntoView(elmntHealthCentreLocation2);
            waitForElement(elmntHealthCentreLocation2);
            jsClick(elmntHealthCentreLocation2);
            verifyElement(By.xpath(selectCovidPreScreeningPopup.replace("<<REPLACEMENT>>",TestDataUtil.getValue(strLocation))));
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
            System.out.printf(">>>>>>>>>>>>elmntHealthCenter>>>>"+elmntHealthCenter);
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

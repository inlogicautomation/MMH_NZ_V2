package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BeatingTheBlues extends BasePage {
    public BeatingTheBlues(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Beating the Blues')]")
    protected WebElement elmtBeatingTheBlues;

    @FindBy(how = How.XPATH, using = " //h5[contains(text(),'Beating The Blues')]")
    protected WebElement elmtBeatingTheBluesHeader;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Session1')]//parent::a")
    protected WebElement elmtviewsession1;

//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Hi TOM KARRIE')]")
//    protected WebElement elmtHiTomheader;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Continue Session 1')]//following::span)[1]")
    protected WebElement elmtContinuesession1;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'What are your thoughts about doing weekly projects?')]")
    protected WebElement elmtWhatareyourthoughtsaboutdoingweeklyprojects;




    public boolean clickViewsummary() {
        waitForSeconds(3);
        jsScrollIntoView(elmtBeatingTheBlues);
        waitForElementClickable(elmtBeatingTheBlues);
        jsClick(elmtBeatingTheBlues);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        waitForElement(elmtBeatingTheBluesHeader);
        return verifyElement(elmtBeatingTheBluesHeader);
    }

    public void clickViewsession() {
        waitForSeconds(3);
        waitForElementClickable(elmtviewsession1);
        jsClick(elmtviewsession1);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

    }

    public boolean clickContinuesession1() {
        focusWindow(2);
        waitForSeconds(3);
        waitForElementClickable(elmtContinuesession1);
        jsClick(elmtContinuesession1);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        closeWindow(2);
        waitForSeconds(3);
        focusWindow(1);
        waitForSeconds(3);
        return true;

    }
}

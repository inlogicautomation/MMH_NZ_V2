package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAppointmentPage extends BasePage {
    public MyAppointmentPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(how = How.XPATH, using = "//span[text()='My Appointments']")
    protected WebElement clickMyAppointmentButton;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Steve!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Gp1!')]")
    })
    protected WebElement txtWelcome;
    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Appointments')] ")
    protected WebElement verifyheaderMyAppointmentPage;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Appointments')]")
    protected WebElement clickheaderMyAppointmentPage;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public boolean clickAppointmentButton() {
        boolean blresult = false;
        try {
            waitForElement(clickMyAppointmentButton);
            jsClick(clickMyAppointmentButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickheaderMyAppointmentPage);
            click(clickheaderMyAppointmentPage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyheaderMyAppointmentPage);
            blresult =verifyElement(verifyheaderMyAppointmentPage);
        } catch (Exception e) {
            System.out.println("Failed to click Appointment Button >>> :: ");
        }
        return blresult;
    }

    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{

            if (isElementDisplayed(txtWelcome)) {
                verifyElement(txtWelcome);
                waitForSeconds(3);
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(3);
                blResult = verifyElement(txtWelcome);
            }
            if (!isElementDisplayed(txtWelcome)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                System.out.println("Successfully click Logo");
                waitForSeconds(3);
                blResult=verifyElement(txtWelcome);
            }
        } catch (Exception e) {
            System.out.println("Failed to Navigate To Provider Homepage >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


}

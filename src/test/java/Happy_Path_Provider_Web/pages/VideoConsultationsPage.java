package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VideoConsultationsPage extends BasePage {
    public VideoConsultationsPage(WebDriver driver) {
        super(driver);
    }
    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"), //Desktop View
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Steve!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Gp1!')]")
    })
    protected WebElement txtWelcome;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;

    @FindBy(how = How.XPATH, using = "//span[text()='My Appointments']")
    protected WebElement clickMyAppointmentButton;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Appointments')]")
    protected WebElement clickheaderMyAppointmentPage;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Appointments')] ")
    protected WebElement verifyheaderMyAppointmentPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Video Consultations')]")
    protected WebElement clickVideoConsultationsButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Video Consultations')]")
    protected WebElement verifyheaderVideoConsutationsPage;



    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{

            if (isElementDisplayed(txtWelcome)) {
                verifyElement(txtWelcome);
                waitForSeconds(3);
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForSeconds(3);
                blResult = verifyElement(txtWelcome);
            }
            if (!isElementDisplayed(txtWelcome)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                System.out.println("Successfully click Logo");
                waitForSeconds(3);
                blResult=verifyElement(txtWelcome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickAppointmentButton() {
        boolean blresult = false;
        try {
            waitForElement(clickMyAppointmentButton);
            jsClick(clickMyAppointmentButton);
            waitForElement(clickheaderMyAppointmentPage);
            click(clickheaderMyAppointmentPage);
            waitForElement(verifyheaderMyAppointmentPage);
            blresult =verifyElement(verifyheaderMyAppointmentPage);
        } catch (Exception e) {

        }
        return blresult;
    }
    public boolean clickVideoConsultationsButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVideoConsultationsButton);
            jsClick(clickVideoConsultationsButton);
            waitForElement(verifyheaderVideoConsutationsPage);
            blresult =verifyElement(verifyheaderVideoConsutationsPage);
        } catch (Exception e) {

        }
        return blresult;
    }
}

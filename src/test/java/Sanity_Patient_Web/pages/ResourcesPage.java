package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourcesPage extends BasePage {

    public ResourcesPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Health Tools')]")
    protected WebElement elmntHealthTools;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Health centres')]")
    protected WebElement elmntMyHealthCentres;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resources')]")
    protected WebElement elmntResources;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Discover Health')]")
    protected WebElement elmntDiscoverHealth;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Resources')]")
    protected WebElement txtResources;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Patient Sheets')]")
    protected WebElement txtPatientSheets;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Patient Sheets')]/preceding-sibling::mat-icon")
    protected WebElement btnBackToResources;

    @FindBy(how = How.XPATH, using = "//a[@href='https://www.healthnavigator.org.nz/']")
    protected WebElement elmntHealthNavigator;

    @FindBy(how = How.XPATH, using = "//a[@href='/pages/patient-sheets']")
    protected WebElement elmntPatientSheets;

    @FindBy(how = How.XPATH, using = "//a[@href='https://covid19.govt.nz/']")
    protected WebElement elmntCovid19;

    @FindBy(how = How.XPATH, using = "//img[@alt='Unite against COVID-19']/parent::h1")
    protected WebElement elmntCovid19Logo;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health Navigator New Zealand')]")
    protected WebElement elmntHealthNavigatorLogo;

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;



    public boolean navigateToResources() {
        boolean blResult = false;
        try {

            waitForSeconds(2);

//            waitForElement(elmntHealthTools);
            jsScrollIntoView(elmntHealthTools);
            waitForElementClickable(elmntHealthTools);
            jsClick(elmntHealthTools);

            waitForSeconds(3);

            jsScrollIntoView(elmntResources);
            waitForElement(elmntResources);
            waitForElementClickable(elmntResources);
            jsClick(elmntResources);
            waitForSeconds(1);

            blResult = verifyElement(txtResources);

            System.out.println("Successfully navigated to Resources >>>>> :: " );
        } catch (Exception e) {
            System.out.println("Failed navigate to Resources >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean viewActivatedResources() {
        boolean blResult = false;
        try {

            waitForSeconds(2);
            waitForElement(elmntHealthNavigator);

            waitForElement(elmntPatientSheets);

            blResult = verifyElement(elmntCovid19);

            System.out.println("Successfully viewed Activated Resources >>>>> :: " );
        } catch (Exception e) {

            System.out.println("Failed view Activated Resources >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean navigateToHealthNavigator() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtResources);

            waitForElement(elmntHealthNavigator);
            waitForElementClickable(elmntHealthNavigator);
            waitAndClick(elmntHealthNavigator);

            try {
                waitForSeconds(5);
                waitForWindow(2);
                focusWindow(2);
                waitForElement(elmntHealthNavigatorLogo);

                String CurrentUrl = driver.getCurrentUrl();
                System.out.println("CurrentUrl >>> : " + CurrentUrl);
                CurrentUrl.equalsIgnoreCase("https://www.healthnavigator.org.nz/");

                System.out.println("User on the Health Navigator and Verified the Health Navigator page >>>>");
                closeWindow(2);
                waitForSeconds(5);
                waitForWindow(1);
                focusWindow(1);
                waitForElement(txtResources);
                takeScreenshotSanity(driver);
                blResult = verifyElement(txtResources);

            } catch (Exception e) {
                closeWindow(2);
                waitForSeconds(5);
                waitForWindow(1);
                focusWindow(1);
                waitForElement(txtResources);
                takeScreenshotSanity(driver);
                blResult = verifyElement(txtResources);
                e.printStackTrace();
                System.out.println("User not in the Health Navigator >>>>");
            }

            System.out.println("Successfully verified Activated Resources Health Navigator >>>>> :: " );
        } catch (Exception e) {

            System.out.println("Failed verified Activated Resources Health Navigator >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean navigateToCovid19() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtResources);

            waitForElement(elmntCovid19);
            waitForElementClickable(elmntCovid19);
            waitAndClick(elmntCovid19);

            try {
                waitForSeconds(5);
                waitForWindow(2);
                focusWindow(2);

                waitForElement(elmntCovid19Logo);
                String CurrentUrl = driver.getCurrentUrl();
                System.out.println("pageTitle >>> : " + CurrentUrl);
                CurrentUrl.equalsIgnoreCase("https://covid19.govt.nz/");
                takeScreenshotSanity(driver);

                System.out.println("User on the Covid 19 page and Verified the Covid 19 page >>>>");
                closeWindow(2);
                waitForSeconds(5);
                waitForWindow(1);
                focusWindow(1);
                waitForElement(txtResources);
                takeScreenshotSanity(driver);
                blResult = verifyElement(txtResources);
            } catch (Exception e) {
                closeWindow(1);
                waitForSeconds(3);
                waitForWindow(0);
                focusWindow(0);
                waitForElement(txtResources);
                takeScreenshotSanity(driver);
                blResult = verifyElement(txtResources);
                e.printStackTrace();
                System.out.println("User not in the Health Navigator >>>>");
            }

            System.out.println("Successfully verified Activated Resources Covid 19 page >>>>> :: " );
        } catch (Exception e) {

            System.out.println("Failed verified Activated Resources Covid 19 page >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }
    public boolean navigateToPatientSheet() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElement(txtResources);

            waitForElement(elmntPatientSheets);
            waitForElementClickable(elmntPatientSheets);
            waitAndClick(elmntPatientSheets);

            String pageTitle = driver.getTitle();
            System.out.println("pageTitle >>> : " + pageTitle);
            pageTitle.equalsIgnoreCase("Patient Sheets");

            waitForElement(txtPatientSheets);
            takeScreenshotSanity(driver);
            verifyElement(txtPatientSheets);

            waitForElement(btnBackToResources);
            waitForElementClickable(btnBackToResources);
            waitAndClick(btnBackToResources);

            waitForElement(txtResources);
            blResult = verifyElement(txtResources);


            System.out.println("Successfully verified Activated Resources Covid 19 page >>>>> :: " );
        } catch (Exception e) {

            System.out.println("Failed verified Activated Resources Covid 19 page >>>>> :: " );
            e.printStackTrace();

        }
        return blResult;
    }

}

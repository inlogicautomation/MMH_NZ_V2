package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProviderHomePage extends BasePage {

    public ProviderHomePage(WebDriver driver) {
        super(driver);
    }

    public String elmntModule = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<NAME>>")
            .append("')]").toString();

    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]")
    protected WebElement elmtSystemsMenu;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;

    @FindBy(xpath = "//h1[contains(text(),'Welcome,')]")
    protected WebElement txtWelcome;

    @FindBy(xpath = "//span[contains(text(),'E-Services')]")
    protected WebElement elmtEServices;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement txtRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement elmntRRPScriptInstructionsSettings;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;



    public boolean navigateToRepeatScriptFeeMessageSettings(String strName) {
        boolean blResult = false;
        try {
            waitForElement(elmtEServices);
            WebElement element = driver.findElement(By.xpath(elmntModule.replace("<<NAME>>",strName)));
            jsScrollIntoView(element);
            waitForElement(element);
            waitForElementClickable(element);
            waitAndClick(element);
            waitForElement(txtRRPScriptInstructionsSettings);
            takeScreenshot(driver);
            blResult =verifyElement(txtRRPScriptInstructionsSettings);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSystemMenu() {
        boolean blResult = false;
        try {
            waitForElement(elmtSystemsMenu);
            waitForElementClickable(elmtSystemsMenu);
            waitAndClick(elmtSystemsMenu);
            waitForElement(elmtEServices);
            blResult =verifyElement(elmtEServices);

        } catch (Exception e) {
            System.out.println("Failed to click System Menu >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToProviderHomepage() {
        boolean blResult = false;
        try {
            waitForElement(elmtMMHLogo);
            waitForElementClickable(elmtMMHLogo);
            waitAndClick(elmtMMHLogo);
            waitForElement(txtWelcome);
            blResult =verifyElement(txtWelcome);

        } catch (Exception e) {
            System.out.println("Failed to Navigate Homepage >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean test() {
        boolean blResult = false;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


}

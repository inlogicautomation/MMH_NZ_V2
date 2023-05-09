package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnlinePaymentSettingsPage extends BasePage {
    public OnlinePaymentSettingsPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSetting;
    public boolean click() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            System.out.println("Successfull see the Appointment Setting");
            blresult = true;
        } catch (Exception e) {

        }
        return blresult;
    }

}

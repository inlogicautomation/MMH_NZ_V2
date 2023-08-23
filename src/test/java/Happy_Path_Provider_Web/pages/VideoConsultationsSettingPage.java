package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VideoConsultationsSettingPage extends BasePage {

    public VideoConsultationsSettingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//div[text()='Video Consultation Settings']")
    protected WebElement elmntVideoConsultationSetting;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntAppointmentSettingEditButton;

    @FindBy(how = How.XPATH, using = "//div[text()='Video Consultation Settings']")
    protected WebElement elmntVideoConsultationSettingHeader;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmntHealthCentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    @FindBy (how = How.XPATH, using = "(//i[@class='icon-video'])[2]")
    protected WebElement elmntVideoAppointmentHeader;

    @FindBy (how = How.XPATH, using = "(//i[@class='icon-video'])[3]")
    protected WebElement elmntVideoAppointmentIcons;

    @FindBy (how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enableVC']//input)[1]")
    protected WebElement elmntEnableVideoConsultationyesButton;

    @FindBy (how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enableVC']//input)[2]")
    protected WebElement elmntEnableVideoConsultationNoButton;
    public boolean clickVideoConsultatonsSettingPage() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmntAppointments);
            waitForElement(elmntAppointments);
            click(elmntAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
jsScrollIntoView(elmntVideoConsultationSetting);
waitForElement(elmntVideoConsultationSetting);
click(elmntVideoConsultationSetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVideoConsultationSettingHeader);
            click(elmntVideoConsultationSettingHeader);
            jsScrollIntoView(elmntAppointmentSettingEditButton);
            waitForElementClickable(elmntAppointmentSettingEditButton);
            jsClick(elmntAppointmentSettingEditButton);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            System.out.println("Successfully see the Appointment Setting");
            blresult = verifyElement(elmntVideoConsultationSettingHeader);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click Appointment Message >>> :: ");
        }
        return blresult;
    }

    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntHealthCentre);
            click(elmntHealthCentre);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntHealthCentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean verifyPatientVideoAppointmentDisplayedInAllTab(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVideoAppointmentHeader);
            verifyElement(elmntVideoAppointmentHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVideoAppointmentIcons);
            blresult = verifyElement(elmntVideoAppointmentIcons);
        }catch (Exception e){
            System.out.println("Failed to Click Patient Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean EnableVideoConsultationYesButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEnableVideoConsultationyesButton);
            waitForElement(elmntEnableVideoConsultationyesButton);
            jsClick(elmntEnableVideoConsultationyesButton);
            blresult =   verifyElement(elmntEnableVideoConsultationyesButton);
        }catch (Exception e){
            System.out.println("Failed to Click Patient Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean EnableVideoConsultationNoButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntEnableVideoConsultationNoButton);
            waitForElement(elmntEnableVideoConsultationNoButton);
            jsClick(elmntEnableVideoConsultationNoButton);
            blresult =   verifyElement(elmntEnableVideoConsultationNoButton);
        }catch (Exception e){
            System.out.println("Failed to Click Patient Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyPatientVideoAppointmentNotDisplayedInAllTab(){
        boolean blresult = false;
        boolean blresult1 = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVideoAppointmentHeader);
            blresult=!verifyElement(elmntVideoAppointmentHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVideoAppointmentIcons);
            blresult1 =!verifyElement(elmntVideoAppointmentIcons);
        }catch (Exception e){
            System.out.println("Failed to Click Patient Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult&&blresult1;
    }
}

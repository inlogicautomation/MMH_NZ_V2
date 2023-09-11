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

    @FindBy (how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='allowFacetoFaceVC']//input)[1]")
    protected WebElement elmntfacetofaceappointmentVideoConsultationYesButton;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'Save')]")
    protected WebElement elmntVideoConsultationSaveButton;

    @FindBy (how = How.XPATH, using = "//p[contains(text(),'Changes saved successfully')]")
    protected WebElement elmntSavedSuccessfulyPopup;

    @FindBy (how = How.XPATH, using = "//div[contains(text(),'On Demand Video Consultation Settings')]")
    protected WebElement elmntOnDemandVideoconsultationsSettingstab;

    @FindBy (how = How.XPATH, using = "//div[contains(text(),' Enable On Demand Video Consultations')]")
    protected WebElement elmntOnDemandVideoconsultationsSettingsHeader;

    @FindBy (how = How.XPATH, using = "//mat-select[@formcontrolname='serviceName']")
    protected WebElement elmntServicecategory;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='ondemandVCEnable']//input)[1]")
    protected WebElement elmntOnDemandVideoConsultationsYesRadioButton;

    @FindBy(how = How.XPATH, using = "//div[@class='ProseMirror']")
    protected WebElement EnterMessageText;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='ondemandVCEnable']//input)[2]")
    protected WebElement elmntOnDemandVideoConsultationsNoRadioButton;

    @FindBy (how = How.XPATH, using = "//div[contains(text(),'SMS Video Invite Settings')]")
    protected WebElement elmntSMSVideoInviteSettingsSettingstab;

    @FindBy (how = How.XPATH, using = "//div[contains(text(),'Enable SMS Video Invite')]")
    protected WebElement elmntSMSVideoInviteSettingsHeader;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enableSMSVideoInvite']//input)[1]")
    protected WebElement elmntSMSVideoInviteYesRadioButton;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@formcontrolname='enableSMSVideoInvite']//input)[2]")
    protected WebElement elmntSMSVideoInviteNoRadioButton;




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

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean verifyPatientVideoAppointmentNotDisplayedInAllTab(){
        boolean blresult = false;
        boolean blresult1 = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=!verifyElement(elmntVideoAppointmentHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult1 =!verifyElement(elmntVideoAppointmentIcons);
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult&&blresult1;
    }

    public boolean EnablefacetofaceappointmentVideoConsultationYesButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntfacetofaceappointmentVideoConsultationYesButton);
            waitForElement(elmntfacetofaceappointmentVideoConsultationYesButton);
            jsClick(elmntfacetofaceappointmentVideoConsultationYesButton);
            blresult =   verifyElement(elmntfacetofaceappointmentVideoConsultationYesButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickVideoConsultationSaveButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntVideoConsultationSaveButton);
            waitForElement(elmntVideoConsultationSaveButton);
            jsClick(elmntVideoConsultationSaveButton);
            waitForElement(elmntSavedSuccessfulyPopup);
            blresult =   verifyElement(elmntSavedSuccessfulyPopup);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }
    public boolean clickOnDemandVideoconsultationsSettingstab(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntOnDemandVideoconsultationsSettingstab);
            jsClick(elmntOnDemandVideoconsultationsSettingstab);
            waitForElement(elmntOnDemandVideoconsultationsSettingsHeader);
            blresult =   verifyElement(elmntOnDemandVideoconsultationsSettingsHeader);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickEditButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAppointmentSettingEditButton);
            waitForElement(elmntAppointmentSettingEditButton);
            jsClick(elmntAppointmentSettingEditButton);
            waitForElement(elmntVideoConsultationSaveButton);
            blresult =   verifyElement(elmntVideoConsultationSaveButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickServiceCategory(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmntServicecategory);
            click(elmntServicecategory);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntServicecategory);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickOnDemandVideoConsultationsYesButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntOnDemandVideoConsultationsYesRadioButton);
            waitForElement(elmntOnDemandVideoConsultationsYesRadioButton);
            jsClick(elmntOnDemandVideoConsultationsYesRadioButton);
            blresult =   verifyElement(elmntOnDemandVideoConsultationsYesRadioButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean EntertheMessage(String strdata){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(EnterMessageText);
            waitForElement(EnterMessageText);
            enterValue(EnterMessageText,strdata);
            blresult =   verifyElement(EnterMessageText);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickOnDemandVideoConsultationsNoButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntOnDemandVideoConsultationsNoRadioButton);
            waitForElement(elmntOnDemandVideoConsultationsNoRadioButton);
            jsClick(elmntOnDemandVideoConsultationsNoRadioButton);
            blresult =   verifyElement(elmntOnDemandVideoConsultationsNoRadioButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }
    public boolean clickSMSVideoInviteSettingstab(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSMSVideoInviteSettingsSettingstab);
            jsClick(elmntSMSVideoInviteSettingsSettingstab);
            waitForElement(elmntSMSVideoInviteSettingsHeader);
            blresult =   verifyElement(elmntSMSVideoInviteSettingsHeader);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickSMSVideoInviteYesButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntSMSVideoInviteYesRadioButton);
            waitForElement(elmntSMSVideoInviteYesRadioButton);
            jsClick(elmntSMSVideoInviteYesRadioButton);
            blresult =   verifyElement(elmntSMSVideoInviteYesRadioButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickSMSVideoInviteNoButton(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntSMSVideoInviteNoRadioButton);
            waitForElement(elmntSMSVideoInviteNoRadioButton);
            jsClick(elmntSMSVideoInviteNoRadioButton);
            blresult =   verifyElement(elmntSMSVideoInviteNoRadioButton);
        }catch (Exception e){

            e.printStackTrace();
        }
        return blresult;
    }
}

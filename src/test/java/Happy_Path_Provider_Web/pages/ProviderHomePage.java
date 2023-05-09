package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ProviderHomePage extends BasePage {
    public static String strAppVersion;

    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;
    public ProviderHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement elmntloginbtn;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'Save')] ")
    protected WebElement elmntSavebtn;

    public String elmntModule = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<NAME>>")
            .append("')]").toString();

    public String MobileelmntModule = new StringBuilder()
            .append("//a[contains(text(),'")
            .append("<<NAME>>")
            .append("')]").toString();


    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]/following::mat-icon[contains(@class,'mat-icon notranslate dd')]")
    protected WebElement elmtSystemsMenu;

    @FindBy(xpath = "//mat-icon[text()='menu']")
    protected WebElement elmtMobileMenu;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "(//span[contains(text(),'Systems Menu')]//following::mat-icon)[1]")
    protected WebElement elmtSystemsMenuExpandIcon;

    @FindBy(xpath = "(//img[@alt='Manage My Health'])[3]")
    protected WebElement ProviderManageMyHealthLogo;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;

    //h1[contains(text(),'Welcome,')]//span[contains(text(),'ApptProvider!') or contains(text(),'Tim!')]
    @FindBy(xpath = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]")
    protected WebElement txtWelcome;

    @FindBy(xpath = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Harry Harry!')]")
    protected WebElement txtHarryHarryWelcome;

    @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SIGN OUT')]")
    protected WebElement btnExitApp;

    @FindBy(how = How.XPATH, using = "//span[text()='Provider Login']")
    protected WebElement txtProviderPortal;

    @FindBy(how = How.XPATH, using = "(//img[@alt='ManageMyHealth'])[1]")
    protected WebElement elmntMMHLogo;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SIGN OUT')]")
    protected WebElement elmntLogOut;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='exit_to_app']")
    protected WebElement elmntMobileLogOut;
    @FindBy(xpath = "//span[contains(text(),'Repeat Script Settings')]")
    protected WebElement elmtRepeatScriptSettings;

    @FindBy(xpath = "//button//span[contains(text(),'Edit')]")
    protected WebElement btnEditInRRPSettings;

    @FindBy(xpath = "//h1[contains(text(),'Repeat Script Settings')]")
    protected WebElement txtRepeatScriptSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettings;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']")
    protected WebElement txtBoxEmail;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Password']")
    protected WebElement txtBoxPassword;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement betaLoginBtn;
    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome,') or contains(text(),'Start managing your health, today')])[1]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;


    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtMobileRRPScriptInstructionsSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement txtRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement elmntRRPScriptInstructionsSettings;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//img[@class='profile-pic img-fluid']")
    protected WebElement ClickProfile;

    @FindBy(xpath = "//button[contains(text(),'Sign Out')]")
    protected WebElement ClickSignOutButton;


    public boolean navigateToRepeatScriptFeeMessageSettings(String strName) {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmtRepeatScriptSettings);
            waitForElement(elmtRepeatScriptSettings);
            jsClick(elmtRepeatScriptSettings);
            WebElement element = driver.findElement(By.xpath(elmntModule.replace("<<NAME>>",strName)));
            jsScrollIntoView(element);
            waitForElement(element);
//            waitForElementClickable(element);
            click(element);
            waitForElement(txtRRPScriptInstructionsSettings);
            takeScreenshot(driver);
            blResult =verifyElement(txtRRPScriptInstructionsSettings);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void enterEmailForBeta(String strEmail) {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);
        }
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
        }

    }

    public void enterPasswordForBeta(String strPassword) {
        if (verifyElement(txtBoxPassword)) {
            waitForElementClickable(txtBoxPassword);
            enterValue(txtBoxPassword, strPassword);
        }
        if (!verifyElement(txtBoxPassword)) {
            System.out.println("User here in home page");
        }

    }
    public void Providervisit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 2) {
            focusWindow(1);
            visit(TestDataUtil.getValue("&URL&"));
        }

    }
    public boolean clickproviderLoginButton() {
        boolean blResult = false;
        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println("===============>WindowsCount::" + WindowsCount);
            if (WindowsCount == 2) {
                focusWindow(1);
                waitForElement(betaLoginBtn);
                click(betaLoginBtn);
                blResult = true;
            }
        } catch (Exception e) {

        }
        return blResult;
    }

    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(SignInBtn)) {
//            waitForElement(SignInBtn);
            waitForSeconds(3);
            jsClick(SignInBtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } else if (!verifyElement(SignInBtn)) {
            System.out.println("user already in the home page");
        }
    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForSeconds(5);
        waitForElement(elmntVerifyHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion"+strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyHomePage);
    }



    public boolean navigateToMobileRepeatScriptFeeMessageSettings(String strName) {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmtRepeatScriptSettings);
            waitForElement(elmtRepeatScriptSettings);
            jsClick(elmtRepeatScriptSettings);
            WebElement element = driver.findElement(By.xpath(MobileelmntModule.replace("<<NAME>>",strName)));
            jsScrollIntoView(element);
            waitForElement(element);
//            waitForElementClickable(element);
            click(element);
            waitForElement(txtRRPScriptInstructionsSettings);
            takeScreenshot(driver);
            blResult =verifyElement(txtRRPScriptInstructionsSettings);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

//    public boolean clickSystemMenu() {
//        boolean blResult = false;
//        try {
//            waitForElementDisappear(driver,By.xpath(elmntSpinner));
//            waitForSeconds(2);
//            waitForElementClickable(elmtSystemsMenu);
//            System.out.println("Systems Menu is available to click");
//            jsScrollIntoView(elmtSystemsMenu);
//            jsClick(elmtSystemsMenu);
//            waitForSeconds(1);
//            jsScroll();
//            if(!verifyElement(elmtRepeatScriptSettings)){
//                click(elmntSystemMenu);
//            }
//            waitForElement(elmtRepeatScriptSettings);
//            blResult =verifyElement(elmtRepeatScriptSettings);
//        } catch (Exception e) {
//            System.out.println("Failed to click System Menu >>> :: ");
//            e.printStackTrace();
//        }
//        return blResult;
//    }

    public boolean clickSystemMenu() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenu);
            waitForSeconds(2);
            waitForElementClickable(elmtSystemsMenu);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSystemsMenu);
            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            if (!verifyElement(elmtRepeatScriptSettings)){
                click(elmntSystemMenu);
            }
            jsScrollIntoView(elmtRepeatScriptSettings);
            blResult = verifyElement(elmtRepeatScriptSettings);
        } catch (Exception e) {
            System.out.println("Failed to click System Menu >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickMobileSystemMenu() {
        boolean blResult = false;
        try {
            waitForElement(elmtMobileMenu);
            jsClick(elmtMobileMenu);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenu);
            waitForSeconds(2);
            waitForElementClickable(elmtSystemsMenu);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSystemsMenu);
            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            if (!verifyElement(elmtRepeatScriptSettings)){
                click(elmntSystemMenu);
            }
            jsScrollIntoView(elmtRepeatScriptSettings);
            blResult = verifyElement(elmtRepeatScriptSettings);
        } catch (Exception e) {
            System.out.println("Failed to click System Menu >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToRepeatScriptSettings(String strName) {
        boolean blResult = false;
        try {
            waitForElement(elmtRepeatScriptSettings);
            click(elmtRepeatScriptSettings);
            WebElement element = driver.findElement(By.xpath(elmntModule.replace("<<NAME>>", strName)));
            jsScrollIntoView(element);
            waitForElement(element);
            waitForElementClickable(element);
            click(element);
            waitForElement(txtRepeatScriptSettings);
            takeScreenshot(driver);
            blResult = verifyElement(txtRepeatScriptSettings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickEditButton() {
        waitForElement(btnEditInRRPSettings);
        jsScrollIntoView(btnEditInRRPSettings);
        jsClick(btnEditInRRPSettings);
        System.out.println("==========================================================");
        waitForElementDisappear(driver, By.xpath("//button//span[contains(text(),'Edit')]"));
    }

    public boolean clickSystemMenuExpandIcon() {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmtSystemsMenuExpandIcon);
            waitForElement(elmtSystemsMenuExpandIcon);
            waitForElementClickable(elmtSystemsMenuExpandIcon);
            click(elmtSystemsMenuExpandIcon);
            waitForElement(ProviderManageMyHealthLogo);
            click(ProviderManageMyHealthLogo);
            blResult =verifyElement(ProviderManageMyHealthLogo);

        } catch (Exception e) {
            System.out.println("Failed to click Provider ManageMyHealth Logo >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{
            System.out.println("Success Enter");
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

    public boolean test() {
        boolean blResult = false;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean launchPatientUrl() {
        boolean blresult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                int WindowsCount = driver.getWindowHandles().size();
                System.out.println(">>>>>>>>>WindowsCount : :" + WindowsCount);
                if (WindowsCount == 2) {
                    focusWindow(2);
                    waitForElement(elmntDashboard);
                    click(elmntDashboard);
                    verifyElement(verifyPatientHomePage);
                    System.out.println("user here in patient portal homepage");
                } else {
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                }
                if (WindowsCount == 1) {
                    ((JavascriptExecutor) driver).executeScript("window.open()");
                    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                    driver.switchTo().window(tabs.get(1));
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                    waitForSeconds(4);
                    waitForElementClickable(elmntLogOut);
                    jsClick(elmntLogOut);
                    waitForSeconds(2);
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                }
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                int WindowsCount = driver.getWindowHandles().size();
                System.out.println(">>>>>>>>>WindowsCount : :" + WindowsCount);
                if (WindowsCount == 2) {
                    focusWindow(2);
                    verifyElement(verifyPatientHomePage);
                    System.out.println("user here in patient portal homepage");
                } else {
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                }
                if (WindowsCount == 1) {
                    ((JavascriptExecutor) driver).executeScript("window.open()");
                    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                    driver.switchTo().window(tabs.get(1));
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                    waitForSeconds(4);
                    waitForElementClickable(elmntMobileLogOut);
                    jsClick(elmntMobileLogOut);
                    waitForSeconds(2);
                    visit(TestDataUtil.getValue("&PATIENT_URL&"));
                }

            }

            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickLogin() {
        boolean blresult = false;
        try{
            if (verifyElement(elmntloginbtn)) {
                waitForSeconds(3);
                jsClick(elmntloginbtn);
                System.out.println(" sucessfully clicked login ");
                refreshPage();
                blresult = true;
            }
            if (!verifyElement(elmntloginbtn)){
                System.out.println("user here in home page");
                blresult = true;

            }
        }catch (Exception e){
            System.out.println("user here in Patient Home Page");
            blresult = true;

        }
        return blresult;
    }
    public boolean clickSaveButton() {
        boolean blresult = false;
        try{
            waitForSeconds(3);
            jsScrollIntoView(elmntSavebtn);
            waitForElementClickable(elmntSavebtn);
            click(elmntSavebtn);
            System.out.println("Successfully click save Buuton");
            blresult = true;
        }catch (Exception e){
            System.out.println("save Button is Not Clicked");
            e.printStackTrace();
        }
        return blresult;
    }




    @FindBy (how = How.XPATH, using = "//div[@class='content-panel forgotPasswordContent']")
    protected WebElement loginPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@type='email']"),
            @FindBy (how = How.XPATH, using = "//input[@id='UserName']")
    })
    protected WebElement elmntUserName;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='EncrySecuredPassword']"),
            @FindBy(how = How.XPATH, using = "//input[@type='password']")
    })
    protected WebElement elmntPassword;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[text()='LOGIN']"),
            @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    })
    protected WebElement elmntLoginBtn;


    @FindBy (how = How.XPATH, using = "(//div[@class='toast-content'])[1]")
    protected WebElement elmntSuccessMessag;

    @FindBy (how = How.XPATH, using = "//span[text()='Tim!']")
    protected WebElement elmntTim;

    @FindBy (how = How.XPATH, using = "//span[text()='Systems Menu']")
    protected WebElement elmntSystemMenu;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSettings;

    @FindBy (how = How.XPATH, using = "//div[text()='Appointment Message']")
    protected WebElement elmntAppointmentMessage;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSetting;

    @FindBy (how = How.XPATH, using = "//h1[contains(text(),'Appointment Message')]")
    protected WebElement elmntAppoitmentMssgHeading;

    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement verifyPatientHomePage;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointment;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]")
    protected WebElement elmntBookAppointment;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]")
    protected WebElement elmntPatientBookAppointment;








    public boolean launchProviderUrl() {
        boolean blresult = false;
        try {
            visit(TestDataUtil.getValue("&URL&"));
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }






    public boolean switchToProviderTab() {
        boolean blResult = false;
        try {
            focusWindow(1);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean switchToPatientTab() {
        boolean blResult = false;
        try {
            focusWindow(2);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean MMHLogin(String strUserName,String strPassword){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntUserName);
            enterValue(elmntUserName,strUserName);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            enterValue(elmntPassword,strPassword);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntLoginBtn);
            click(elmntLoginBtn);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            blresult = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean verifyProviderHomePage(){
        boolean blresult = false;
        try{
            refreshPage();
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntTim);
            blresult = verifyElement(elmntTim);
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }




    public boolean clickPreScreeningSettings(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntAppointmentSettings);
            waitForElement(elmntAppointmentSettings);
            click(elmntAppointmentSettings);
            blresult = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickAppointmentMessage(){
        boolean blresult = false;
        try{
//            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            jsScrollIntoView(elmntAppointmentSetting);
            waitForElement(elmntAppointmentSetting);
            jsClick(elmntAppointmentSetting);
            jsScrollIntoView(elmntAppointmentMessage);
            waitForElementClickable(elmntAppointmentMessage);
            jsClick(elmntAppointmentMessage);
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            blresult = verifyElement(elmntAppoitmentMssgHeading);
        }catch (Exception e){

        }
        return  blresult;
    }


    public boolean verifyPatientHomePage(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(verifyPatientHomePage);
            blresult = verifyElement(verifyPatientHomePage);
            takeScreenshot(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickAppointmentMenu(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntAppointment);
            jsClick(elmntAppointment);
            blresult = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickPatientBookAppointment(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntAppointment);
            jsClick(elmntAppointment);
            waitForElement(elmntPatientBookAppointment);
            click(elmntPatientBookAppointment);
            blresult = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBookAppointment(){
        boolean blresult = false;
        try{
            if(verifyElement(elmntBookAppointment)){
//                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                waitForElementClickable(elmntBookAppointment);
                jsClick(elmntBookAppointment);
            }else {
                waitForElementClickable(elmntAppointment);
                click(elmntAppointment);
//                waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
                waitForElementClickable(elmntBookAppointment);
                click(elmntBookAppointment);
            }

            blresult = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (isElementDisplayed(txtWelcome)) {
                verifyElement(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(txtWelcome);
                blResult = verifyElement(txtWelcome);
            }else {
                jsScrollIntoView(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                refreshPage();
                blResult =verifyElement(txtWelcome);
            }
//            if (!isElementDisplayed(txtWelcome)) {
//                focusWindow(2);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                waitForElement(elmntDashboard);
//                waitForElementClickable(elmntDashboard);
//                click(elmntDashboard);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                blResult = verifyElement(txtWelcome);
//                System.out.println("User on the Patient HomePage and Verified>>>>");
//            }
            return blResult;

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToHarryHarryHomePage() {
        boolean blResult = false;
        try {
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (verifyElement(txtHarryHarryWelcome)) {
                verifyElement(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(txtHarryHarryWelcome);
                blResult = verifyElement(txtHarryHarryWelcome);
            }else {
                focusWindow(2);
                jsScrollIntoView(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                refreshPage();
                blResult =verifyElement(txtHarryHarryWelcome);
            }
//            if (!isElementDisplayed(txtWelcome)) {
//                focusWindow(2);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                waitForElement(elmntDashboard);
//                waitForElementClickable(elmntDashboard);
//                click(elmntDashboard);
//                waitForElementDisappear(driver, By.xpath(elmntSpinner));
//                blResult = verifyElement(txtWelcome);
//                System.out.println("User on the Patient HomePage and Verified>>>>");
//            }
            return blResult;

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickProviderLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForSeconds(3);
            jsClick(btnExitApp);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }

        return isVerified;
    }

    public boolean clickMMHLogo() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
            waitForElement(elmntMMHLogo);
            click(elmntMMHLogo);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }


        return isVerified;
    }


}

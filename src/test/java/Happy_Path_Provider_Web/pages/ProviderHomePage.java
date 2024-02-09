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

    public String elmntSecureMessages = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<NAME>>")
            .append("')]").toString();



    public String MobilelmntModule = new StringBuilder()
            .append("//a[contains(text(),'")
            .append("<<NAME>>")
            .append("')]").toString();


    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]/following::mat-icon[contains(@class,'mat-icon notranslate dd')]")
    protected WebElement elmtSystemsMenu;

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSecureMessaging;

    @FindBy(xpath = "//span[contains(text(),'Setup Online Payments')]")
    protected WebElement elmtSetupOnlinePayments;

    @FindBy(xpath = "//mat-icon[text()='menu']")
    protected WebElement elmtMobileMenu;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "(//span[contains(text(),'Setup Modules')]//following::mat-icon)[1]")
    protected WebElement elmtSystemsMenuExpandIcon;

    @FindBy(xpath = "(//img[@alt='Manage My Health'])[3]")
    protected WebElement ProviderManageMyHealthLogo;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Gp2White')]")
    })
    protected WebElement txtProviderPortalWelcomePage;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Harry Harry!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Auto Autochrisc1')]")
    })
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
    @FindBy(xpath = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmtRepeatScriptSettings;

    @FindBy(xpath = "//span[contains(text(),'SMS Credits')]")
    protected WebElement elmtSMSCreditFacility;

    @FindBy(xpath = "//button//span[contains(text(),'Edit')]")
    protected WebElement btnEditInRRPSettings;

    @FindBy(xpath = "//h1[contains(text(),'Repeat Script Settings')]")
    protected WebElement txtRepeatScriptSettings;

    @FindBy(xpath = "//a[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettingsheader;

    @FindBy(xpath = "//h1[contains(text(),'Setup Services')]")
    protected WebElement txtSetupServicesheader;

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



    @FindBy (how = How.XPATH, using = "//span[text()='Tim!']")
    protected WebElement elmntTim;

    @FindBy (how = How.XPATH, using = "//span[text()='Systems Menu']")
    protected WebElement elmntSystemMenu;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointment Settings']")
    protected WebElement elmntAppointmentSettings;

    @FindBy (how = How.XPATH, using = "//div[text()='Appointment Message']")
    protected WebElement elmntAppointmentMessage;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;

    @FindBy (how = How.XPATH, using = "//h1[contains(text(),'Appointment Message')]")
    protected WebElement elmntAppoitmentMssgHeading;

    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health today')]")
    protected WebElement verifyPatientHomePage;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointment;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]")
    protected WebElement elmntBookAppointment;

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]/i")
    protected WebElement elmntPatientBookAppointment;




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
            waitForElement(txtRRPScriptInstructionsSettingsheader);
            takeScreenshot(driver);
            blResult =verifyElement(txtRRPScriptInstructionsSettingsheader);

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
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        if (verifyElement(SignInBtn)) {
            waitForElement(SignInBtn);
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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtRepeatScriptSettings);
            waitForElement(elmtRepeatScriptSettings);
            jsClick(elmtRepeatScriptSettings);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement element = driver.findElement(By.xpath(MobilelmntModule.replace("<<NAME>>",strName)));
            System.out.println(">>>>>>>>>element"+element);
            jsScrollIntoView(element);
            waitForElement(element);
//            waitForElementClickable(element);
            click(element);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//waitForElement(txtRRPScriptInstructionsSettingsheader);
//           click(txtRRPScriptInstructionsSettingsheader);
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

//    public boolean clickSystemMenu() {
//        boolean blResult = false;
//        try {
//            waitForElementDisappear(driver,By.xpath(elmntSpinner));
//            jsScrollIntoView(elmtSystemsMenu);
//            waitForSeconds(2);
//            waitForElementClickable(elmtSystemsMenu);
//            System.out.println("Systems Menu is available to click");
//            jsClick(elmtSystemsMenu);
//            jsScrollIntoView(elmtRepeatScriptSettings);
//            System.out.println("scrolled ");
//            if (!verifyElement(elmtRepeatScriptSettings)){
//                click(elmntSystemMenu);
//            }
//            jsScrollIntoView(elmtRepeatScriptSettings);
//            blResult = verifyElement(elmtRepeatScriptSettings);
//        } catch (Exception e) {
//            System.out.println("Failed to click System Menu >>> :: ");
//            e.printStackTrace();
//        }
//        return blResult;
//    }

    public boolean clickMobileSystemMenu() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMobileMenu);
            jsClick(elmtMobileMenu);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenu);
            waitForSeconds(2);
            waitForElementClickable(elmtSystemsMenu);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSystemsMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtRepeatScriptSettings);
            click(elmtRepeatScriptSettings);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement element = driver.findElement(By.xpath(elmntModule.replace("<<NAME>>", strName)));
            jsScrollIntoView(element);
            waitForElement(element);
            waitForElementClickable(element);
            click(element);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtRepeatScriptSettings);
            takeScreenshot(driver);
            blResult = verifyElement(txtRepeatScriptSettings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToMobileRepeatScriptSettings(String strName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtRepeatScriptSettings);
            click(elmtRepeatScriptSettings);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement element = driver.findElement(By.xpath(MobilelmntModule.replace("<<NAME>>", strName)));
            System.out.printf(">>>>>element"+element);
            jsScrollIntoView(element);
            waitForElement(element);
            jsClick(element);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtRepeatScriptSettings);
            takeScreenshot(driver);
            blResult = verifyElement(txtRepeatScriptSettings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public void clickEditButton() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(btnEditInRRPSettings);
        jsScrollIntoView(btnEditInRRPSettings);
        jsClick(btnEditInRRPSettings);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        System.out.println("==========================================================");
        waitForElementDisappear(driver, By.xpath("//button//span[contains(text(),'Edit')]"));
    }

    public boolean clickSystemMenuExpandIcon() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenuExpandIcon);
            waitForElement(elmtSystemsMenuExpandIcon);
            waitForElementClickable(elmtSystemsMenuExpandIcon);
            click(elmtSystemsMenuExpandIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ProviderManageMyHealthLogo);
            click(ProviderManageMyHealthLogo);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ProviderManageMyHealthLogo);
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
        if (isElementDisplayed(txtProviderPortalWelcomePage)) {
            verifyElement(txtProviderPortalWelcomePage);
            waitForElement(elmtMMHLogo);
            waitForElementClickable(elmtMMHLogo);
            jsClick(elmtMMHLogo);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(txtProviderPortalWelcomePage);
        }
            if (!isElementDisplayed(txtProviderPortalWelcomePage)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
              waitForElement(txtProviderPortalWelcomePage);
                blResult=verifyElement(txtProviderPortalWelcomePage);
            }
        } catch (Exception e) {
            System.out.println("Cannot Successfully switch to doctor portal");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean launchPatientUrl() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
                int WindowsCount = driver.getWindowHandles().size();
                System.out.println(">>>>>>>>>WindowsCount : :" + WindowsCount);
                if (WindowsCount == 2) {
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
                    focusWindow(2);
                    if (verifyElement(txtProviderPortalWelcomePage)) {
//                        waitForElement(elmntDashboard);
//                        click(elmntDashboard);
                        driver.manage().deleteAllCookies();
                        System.out.println("user here in patient portal homepage");
                    } else {

//                        System.out.println("Else Part ::::::Window Count 2");
                        driver.manage().deleteAllCookies();
                        visit(TestDataUtil.getValue("&URL&"));

                    }

                }
                if (WindowsCount == 1) {
                    ((JavascriptExecutor) driver).executeScript("window.open()");
                    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                    driver.switchTo().window(tabs.get(1));
                    visit(TestDataUtil.getValue("&URL&"));
                    driver.manage().deleteAllCookies();
                    waitForSeconds(4);
                    int WindowsCounts = driver.getWindowHandles().size();
                    System.out.println("===============>WindowsCount::" + WindowsCounts);
                    if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                        if (isElementDisplayed(txtHarryHarryWelcome)) {
                            driver.manage().deleteAllCookies();
                            System.out.println("User here in Provider home page");
                            takeScreenshot(driver);
                        }
                        else{
                            if (verifyElement(btnExitApp)) {
                                waitForSeconds(3);
                                waitForElement(btnExitApp);
                                verifyElement(btnExitApp);
                                click(btnExitApp);
                                waitForSeconds(3);
                                visit(TestDataUtil.getValue("&URL&"));
                                driver.manage().deleteAllCookies();
                            }else {
                                waitForSeconds(3);
                                visit(TestDataUtil.getValue("&URL&"));
                                driver.manage().deleteAllCookies();

                            }
                        }

                    }
                    if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                        if (verifyElement(txtHarryHarryWelcome)) {
                            waitForElementClickable(elmntMobileLogOut);
                            jsClick(elmntMobileLogOut);
                            waitForSeconds(2);
                            visit(TestDataUtil.getValue("&URL&"));
                        }

                    }
                    if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                        if (verifyElement(txtHarryHarryWelcome)) {
                            waitForElementClickable(elmntMobileLogOut);
                            jsClick(elmntMobileLogOut);
                            waitForSeconds(2);
                            visit(TestDataUtil.getValue("&URL&"));
                        }
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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (verifyElement(elmntloginbtn)) {
            waitForElement(elmntloginbtn);
                jsClick(elmntloginbtn);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

            jsScrollIntoView(elmntSavebtn);
            waitForElement(elmntSavebtn);
            waitForElementClickable(elmntSavebtn);
            click(elmntSavebtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = true;
        }catch (Exception e){
            System.out.println("save Button is Not Clicked");
            e.printStackTrace();
        }
        return blresult;
    }









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



    public boolean clickAppointmentMessage(){
        boolean blresult = false;
        try{
            jsScrollIntoView(elmntAppointments);
            waitForElement(elmntAppointments);

            jsClick(elmntAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntAppointmentMessage);
            waitForElementClickable(elmntAppointmentMessage);
            jsClick(elmntAppointmentMessage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntAppoitmentMssgHeading);
        }catch (Exception e){
            System.out.println("Failed to click Appointment Messages >>> :: ");
        }
        return  blresult;
    }


    public boolean verifyPatientHomePage(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyPatientHomePage);
            blresult = verifyElement(verifyPatientHomePage);
            takeScreenshot(driver);
        }catch (Exception e){
            System.out.println("Failed to Verify Patient HomePage >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickAppointmentMenu(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntAppointment);
            jsClick(elmntAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = true;
        }catch (Exception e){
            System.out.println("Failed to Click Appointment Menu >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickPatientBookAppointment(){
        boolean blresult = false;
        try{
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmntAppointment);
            jsClick(elmntAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntPatientBookAppointment);
            jsClick(elmntPatientBookAppointment);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = true;
        }catch (Exception e){
            System.out.println("Failed to Click Patient Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }


    public boolean clickBookAppointment(){
        boolean blresult = false;
        try{
            if(verifyElement(elmntBookAppointment)){
                waitForElementClickable(elmntBookAppointment);
                jsClick(elmntBookAppointment);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
            }else {
                waitForElementClickable(elmntAppointment);
                click(elmntAppointment);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElementClickable(elmntBookAppointment);
                click(elmntBookAppointment);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
            }

            blresult = true;
        }catch (Exception e){
            System.out.println("Failed to Click Book Appointment >>> :: ");
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if (isElementDisplayed(txtProviderPortalWelcomePage)) {
                verifyElement(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(txtProviderPortalWelcomePage);
                blResult = verifyElement(txtProviderPortalWelcomePage);
            }else {
                jsScrollIntoView(elmntDashboard);
                waitForElementClickable(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                refreshPage();
                blResult =verifyElement(txtProviderPortalWelcomePage);
            }

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToHarryHarryHomePage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                blResult =verifyElement(txtHarryHarryWelcome);
            }

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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }

        return isVerified;
    }

    public boolean clickSecureMessaging() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSecureMessaging);
            waitForSeconds(2);
            waitForElementClickable(elmtSecureMessaging);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSecureMessaging);
            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
//            takeScreenshot(driver);
            if (!verifyElement(elmtRepeatScriptSettings)){
                click(elmtSecureMessaging);
            }
            jsScrollIntoView(elmtRepeatScriptSettings);
            blResult = verifyElement(elmtRepeatScriptSettings);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean navigateToSecureMessages(String strName) {
        boolean blResult = false;
        try {
            WebElement element = driver.findElement(By.xpath(elmntSecureMessages.replace("<<NAME>>",strName)));
            jsScrollIntoView(element);
            waitForElement(element);
            click(element);
            waitForElement(txtSetupServicesheader);
            takeScreenshot(driver);
            blResult =verifyElement(txtSetupServicesheader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickSetupOnlinePayments() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSetupOnlinePayments);
            waitForSeconds(2);
            waitForElementClickable(elmtSetupOnlinePayments);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSetupOnlinePayments);
            jsScrollIntoView(elmtSMSCreditFacility);
            System.out.println("scrolled ");
            takeScreenshot(driver);
            if (!verifyElement(elmtSMSCreditFacility)){
                click(elmtSetupOnlinePayments);
            }
            jsScrollIntoView(elmtSMSCreditFacility);
            blResult = verifyElement(elmtSMSCreditFacility);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


}

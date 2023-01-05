package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RepeatScriptSettingPage extends BasePage {

    public RepeatScriptSettingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement elmntRRPScriptInstructionsSettings;

    @FindBy(xpath = "//div[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement elmntRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Settings')]")
    protected WebElement txtRRPScriptInstructionsSettings;

    @FindBy(xpath = "//h3[contains(text(),'RRP Script Instructions Fee Setup')]")
    protected WebElement txtRRPScriptInstructionsFeeSetup;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    protected WebElement btnEdit;

    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    protected WebElement txtWelcome;

    @FindBy(xpath = "//div[@class='navbar-header']/a")
    protected WebElement imgNavHeader;

    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]")
    protected WebElement elmtSystemsMenu;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(xpath = "//h4[contains(text(),'Success!')]/following-sibling::p[contains(text(),'Changes Saved Successfully')]")
    protected WebElement successPopUp;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='HealthCenter']")
    protected WebElement drpDownLocation;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='ServiceName']")
    protected WebElement drpDownServiceName;

    @FindBy(how = How.XPATH, using = "(//span[text()='VM03Location']/following::mat-select[@name='staffDefaults'])[1]")
    protected WebElement drpDownProviderName;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked']//*[contains(text(),'Apply Rules based on Patient')]")
    protected WebElement selectedRRPRequest;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Apply Rules based on Patient')]")
    protected WebElement RRP1stOption;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Restrict to Named Provider in each Location')]")
    protected WebElement radioBtnRestrictToNamedProviderOption;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked']//*[normalize-space(text())='Restrict to Named Provider in each Location']")
    protected WebElement selectedRadioBtnRestrictToNamedProviderOption;

    @FindBy(how = How.XPATH, using = "//mat-radio-button[@class='mat-radio-button mat-radio-checked mat-accent']//*[contains(text(),'Rule A : No Restrictions')]")
    protected WebElement selectedRuleARequest;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]")
    protected WebElement txtFirstServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]")
    protected WebElement txt1stServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]")
    protected WebElement txtSSTP1ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]")
    protected WebElement txtDMBP1ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtSecondServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtSSTP2ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtDMBP2ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txt2ndServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtThirdServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtDMBP3ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txt3rdServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtSSTP3ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]")
    protected WebElement txtFourthServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]")
    protected WebElement txt4thServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]")
    protected WebElement txtSSTP4ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]")
    protected WebElement txtDMBP4ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txtFirstServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt1stServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt1stSSTPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt1stDMBPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txtSecondServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt2ndServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt2ndSSTPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt2ndDMBPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txtThirdServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt3rdServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt3rdSSTPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt3rdDMBPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txtFourthServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt4thServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt4thSSTPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='Fee'][1]")
    protected WebElement txt4thDMBPServiceOptionFee;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txtFirstServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txtSecondServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txtThirdServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txtFourthServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Rule B : Restrict to Default Location')]")
    protected WebElement optionRuleBRequest;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Rule C : Restrict to Default Location and Provider')]")
    protected WebElement optionRuleCRequest;

    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']")
    protected WebElement enabledVM04PracticeOption;

    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[1]")
    protected WebElement dropdownProvider;

    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[2]")
    protected WebElement dropdownProvider2;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Rule A : No Restrictions')]")
    protected WebElement optionRuleARequest;

    protected String selectLocation = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();

    protected String selectProvider = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]/parent::mat-option").toString();

    //span[contains(text(),'VM04Practice')]
    protected String selectedDrpDownOption = new StringBuilder()
            .append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    //div[contains(text(),'No')]/preceding-sibling::div/input
    protected String selectedRdoBtnValue = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]/preceding-sibling::div/input").toString();

    //div[contains(text(),'No')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']
    protected String rdoBtn = new StringBuilder()
            .append("//div[contains(text(),'")
            .append("<<TYPE>>")
            .append("')]/preceding-sibling::div/div[@class='mat-radio-inner-circle']").toString();


    public boolean clickRRPScriptInstructionSetting() {
        boolean isVerified = false;
        waitForSeconds(3);
        waitForElement(elmntRRPScriptInstructionsSettings);
        waitForElementClickable(elmntRRPScriptInstructionsSettings);
        waitAndClick(elmntRRPScriptInstructionsSettings);
        waitForElement(txtRRPScriptInstructionsSettings);
        isVerified = verifyElement(txtRRPScriptInstructionsSettings);
        return isVerified;
    }

    public boolean clickRRPScriptInstructionSettingEditButton() {
        boolean isVerified = false;
        waitForSeconds(3);
        waitForElement(btnEdit);
        waitForElementClickable(btnEdit);
        waitAndClick(btnEdit);
        waitForElement(btnSave);
        return isVerified = verifyElement(btnSave);
    }

    public boolean clickRRPScriptInstructionSettingSaveButton() {
        boolean isVerified = false;
        waitForSeconds(2);
        jsScrollIntoView(btnSave);
        waitForElement(btnSave);
        waitForElementClickable(btnSave);
        waitAndClick(btnSave);
        waitForElement(btnEdit);
        waitForElement(successPopUp);
        return isVerified = verifyElement(btnEdit);
    }

    public boolean clickRRPScriptInstructionFeeSetup() {
        boolean isVerified = false;
        waitForElement(elmntRRPScriptInstructionsFeeSetup);
        waitForElementClickable(elmntRRPScriptInstructionsFeeSetup);
        waitAndClick(elmntRRPScriptInstructionsFeeSetup);

        waitForElement(txtRRPScriptInstructionsFeeSetup);
        isVerified = verifyElement(txtRRPScriptInstructionsFeeSetup);
        return isVerified;
    }

    public boolean selectHealthCentreLocation(String strLocation) {
        boolean blResult = false;
        try {
            if (verifyElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)))) {
                blResult = true;
            } else {
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(drpDownLocation);
                waitForElementClickable(drpDownLocation);
                click(drpDownLocation);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(3);
                WebElement ddlLocation = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strLocation)));
                System.out.println(" select Location Locator ::" + ddlLocation);
                waitForElementClickable(ddlLocation);
                click(ddlLocation);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
                System.out.println(" selected DrpDownOption Locator >>> :: " + selectedOption);
                waitForElement(selectedOption);
                blResult = verifyElement(selectedOption);
                System.out.println("Location selected >>> :: " + strLocation);
            }
        } catch (Exception e) {
            System.out.println("Location not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectServiceName(String strServiceName) {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            if (verifyElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName)))) {
                blResult = true;
            }
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpDownServiceName);
            waitForElementClickable(drpDownServiceName);
            jsScrollIntoView(drpDownServiceName);
            click(drpDownServiceName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForPresenceOfElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strServiceName)));
            WebElement ddlServiceName = waitForElement(By.xpath(selectLocation.replace("<<REPLACEMENT>>", strServiceName)));
            System.out.println(" select Service Name :: " + ddlServiceName);
            waitForElementClickable(ddlServiceName);
            click(ddlServiceName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(" selected DrpDownOption Service Name >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName)));
            System.out.println(" selected DrpDownOption Service Name >>> :: " + selectedOption);
            blResult = verifyElement(selectedOption);
            System.out.println("Service Name was selected >>> :: " + strServiceName);
        } catch (Exception e) {
            System.out.println("Service Name not selected for >>> :: " + strServiceName);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectProviderName(String strProviderName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(drpDownProviderName);
            waitForElementClickable(drpDownProviderName);
            click(drpDownProviderName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForPresenceOfElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProviderName)));
            WebElement ddlServiceName = waitForElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProviderName)));
            System.out.println(" select Service Name :: " + ddlServiceName);
            waitForElementClickable(ddlServiceName);
            click(ddlServiceName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println(" selected DrpDownOption Service Name >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strProviderName) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strProviderName)));
            System.out.println(" selected DrpDownOption Service Name >>> :: " + selectedOption);
            blResult = verifyElement(selectedOption);
            System.out.println("Service Name was selected >>> :: " + strProviderName);
        } catch (Exception e) {
            System.out.println("Service Name not selected for >>> :: " + strProviderName);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectOtherReqData() {
        boolean blResult = false;
        try {
            if (verifyElement(selectedRRPRequest)) {
                blResult = verifyElement(selectedRRPRequest);
                System.out.println("RRP Settings in default selected");
            } else {
                waitForSeconds(2);
                waitForElementClickable(RRP1stOption);
                blResult = click(RRP1stOption);
                System.out.println("RRP Settings is now selected");
            }
        } catch (Exception e) {
            System.out.println("sending RRP Requests default option is not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectOtherReqDataToRestrictNameAndLocation() {
        boolean blResult = false;
        try {
            if (verifyElement(selectedRadioBtnRestrictToNamedProviderOption)) {
                blResult = verifyElement(selectedRadioBtnRestrictToNamedProviderOption);
                System.out.println("Selected the option Restrict to Named Provider in each Location from IF Statment");
            } else {
                waitForElementClickable(radioBtnRestrictToNamedProviderOption);
                blResult = click(radioBtnRestrictToNamedProviderOption);
                System.out.println("Selected the option Restrict to Named Provider in each Location ");
            }
        } catch (Exception e) {
            System.out.println("sending RRP Requests default option is not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSendReqDataRuleA() {
        boolean blResult = false;
        try {
            waitForSeconds(4);
            if (!verifyElement(selectedRuleARequest)) {
                waitForElementClickable(optionRuleARequest);
                blResult = click(optionRuleARequest);
                System.out.println("Rule A option is not selected and now it is selected >>> :: ");
//                waitForElementToAppear(driver, By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked']//*[contains(text(),'Rule A : No Restrictions')]"));
            } else {
                blResult = verifyElement(selectedRuleARequest);
                System.out.println("Rule A is already selected");
            }
        } catch (Exception e) {
            System.out.println("Rule A option is not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFirstSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtFirstServiceOption);
            String firstServiceOption = txtFirstServiceOption.getAttribute("value");
            System.out.println("Current value for first service option " + firstServiceOption + "And Expected Value is " + strServiceOption);
            if (firstServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtFirstServiceOption);
                enterValue(txtFirstServiceOption, strServiceOption);
                blResult = verifyElement(txtFirstServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values>>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select1stSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txt1stServiceOption);
            String firstServiceOption = txt1stServiceOption.getAttribute("value");
            System.out.println("Current value for first service option " + firstServiceOption + "And Expected Value is " + strServiceOption);
            if (firstServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txt1stServiceOption);
                enterValue(txt1stServiceOption, strServiceOption);
                blResult = verifyElement(txt1stServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values (SEND SCRIPT BY POST) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select1stSSTPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtSSTP1ServiceOption);
            String firstServiceOption = txtSSTP1ServiceOption.getAttribute("value");
            System.out.println("Current value for first service option " + firstServiceOption + "And Expected Value is " + strServiceOption);
            if (firstServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtSSTP1ServiceOption);
                enterValue(txtSSTP1ServiceOption, strServiceOption);
                blResult = verifyElement(txtSSTP1ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values (SEND SCRIPT TO PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select1stDMBPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDMBP1ServiceOption);
            String firstServiceOption = txtDMBP1ServiceOption.getAttribute("value");
            System.out.println("Current value for first service option " + firstServiceOption + "And Expected Value is " + strServiceOption);
            if (firstServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDMBP1ServiceOption);
                enterValue(txtDMBP1ServiceOption, strServiceOption);
                blResult = verifyElement(txtDMBP1ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values (DELIVER MEDS BY PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSecondSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtSecondServiceOption);
            String secondServiceOption = txtSecondServiceOption.getAttribute("value");
            System.out.println("Current value for Second service option " + secondServiceOption + "And Expected Value is " + strServiceOption);
            if (secondServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtSecondServiceOption);
                enterValue(txtSecondServiceOption, strServiceOption);
                blResult = verifyElement(txtSecondServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values>>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select2ndSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndServiceOption);
            String secondServiceOption = txt2ndServiceOption.getAttribute("value");
            System.out.println("Current value for Second service option " + secondServiceOption + "And Expected Value is " + strServiceOption);
            if (secondServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txt2ndServiceOption);
                enterValue(txt2ndServiceOption, strServiceOption);
                blResult = verifyElement(txt2ndServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values (SEND SCRIPT BY POST)>>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select2ndSSTPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtSSTP2ServiceOption);
            String secondServiceOption = txtSSTP2ServiceOption.getAttribute("value");
            System.out.println("Current value for Second service option " + secondServiceOption + "And Expected Value is " + strServiceOption);
            if (secondServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtSSTP2ServiceOption);
                enterValue(txtSSTP2ServiceOption, strServiceOption);
                blResult = verifyElement(txtSSTP2ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values (SEND SCRIPT TO PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select2ndDMBPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDMBP2ServiceOption);
            String secondServiceOption = txtDMBP2ServiceOption.getAttribute("value");
            System.out.println("Current value for Second service option " + secondServiceOption + "And Expected Value is " + strServiceOption);
            if (secondServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDMBP2ServiceOption);
                enterValue(txtDMBP2ServiceOption, strServiceOption);
                blResult = verifyElement(txtDMBP2ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values (DELIVER MEDS BY PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectThirdSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtThirdServiceOption);
            String thirdServiceOption = txtThirdServiceOption.getAttribute("value");
            System.out.println("Current value for third service option  " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtThirdServiceOption);
                enterValue(txtThirdServiceOption, strServiceOption);
                blResult = verifyElement(txtThirdServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values>>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select3rdSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdServiceOption);
            String thirdServiceOption = txt3rdServiceOption.getAttribute("value");
            System.out.println("Current value for third service option  " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txt3rdServiceOption);
                enterValue(txt3rdServiceOption, strServiceOption);
                blResult = verifyElement(txt3rdServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values (SEND SCRIPT BY POST) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select3rdSSTPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtSSTP3ServiceOption);
            String thirdServiceOption = txtSSTP3ServiceOption.getAttribute("value");
            System.out.println("Current value for Third service option " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtSSTP3ServiceOption);
                enterValue(txtSSTP3ServiceOption, strServiceOption);
                blResult = verifyElement(txtSSTP3ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values (SEND SCRIPT TO PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select3rdDMBPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDMBP4ServiceOption);
            String thirdServiceOption = txtDMBP4ServiceOption.getAttribute("value");
            System.out.println("Current value for Third service option " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDMBP4ServiceOption);
                enterValue(txtDMBP4ServiceOption, strServiceOption);
                blResult = verifyElement(txtDMBP4ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values (DELIVER MEDS BY PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFourthSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtFourthServiceOption);
            String fourthServiceOption = txtFourthServiceOption.getAttribute("value");
            System.out.println("Current value for fourth service option is " + fourthServiceOption + "And Expected Value is " + strServiceOption);
            if (fourthServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtFourthServiceOption);
                enterValue(txtFourthServiceOption, strServiceOption);
                blResult = verifyElement(txtFourthServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values>>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select4thSelectedServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txt4thServiceOption);
            String fourthServiceOption = txt4thServiceOption.getAttribute("value");
            System.out.println("Current value for fourth service option is " + fourthServiceOption + "And Expected Value is " + strServiceOption);
            if (fourthServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txt4thServiceOption);
                enterValue(txt4thServiceOption, strServiceOption);
                blResult = verifyElement(txt4thServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values (SEND SCRIPT BY POST) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select4thSSTPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtSSTP4ServiceOption);
            String fourthServiceOption = txtSSTP4ServiceOption.getAttribute("value");
            System.out.println("Current value for Fourth service option " + fourthServiceOption + "And Expected Value is " + strServiceOption);
            if (fourthServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtSSTP4ServiceOption);
                enterValue(txtSSTP4ServiceOption, strServiceOption);
                blResult = verifyElement(txtSSTP4ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values (SEND SCRIPT TO PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select4thDMBPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDMBP4ServiceOption);
            String fourthServiceOption = txtDMBP4ServiceOption.getAttribute("value");
            System.out.println("Current value for Fourth service option " + fourthServiceOption + "And Expected Value is " + strServiceOption);
            if (fourthServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDMBP4ServiceOption);
                enterValue(txtDMBP4ServiceOption, strServiceOption);
                blResult = verifyElement(txtDMBP4ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values (DELIVER MEDS BY PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForFirstSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtFirstServiceOptionFee);
            String firstServiceOptionFee = txtFirstServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txtFirstServiceOptionFee);
            enterValue(txtFirstServiceOptionFee, strFee);
            blResult = verifyElement(txtFirstServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stServiceOptionFee);
            String firstServiceOptionFee = txt1stServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stServiceOptionFee);
            enterValue(txt1stServiceOptionFee, strFee);
            blResult = verifyElement(txt1stServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stSSTPServiceOptionFee);
            String firstServiceOptionFee = txt1stSSTPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stSSTPServiceOptionFee);
            enterValue(txt1stSSTPServiceOptionFee, strFee);
            blResult = verifyElement(txt1stSSTPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stDMBPServiceOptionFee);
            String firstServiceOptionFee = txt1stDMBPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stDMBPServiceOptionFee);
            enterValue(txt1stDMBPServiceOptionFee, strFee);
            blResult = verifyElement(txt1stDMBPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForSecondSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtSecondServiceOptionFee);
            String secondServiceOptionFee = txtSecondServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txtSecondServiceOptionFee);
            enterValue(txtSecondServiceOptionFee, strFee);
            blResult = verifyElement(txtSecondServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndServiceOptionFee);
            String secondServiceOptionFee = txt2ndServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndServiceOptionFee);
            enterValue(txt2ndServiceOptionFee, strFee);
            blResult = verifyElement(txt2ndServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndSSTPServiceOptionFee);
            String secondServiceOptionFee = txt2ndSSTPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndSSTPServiceOptionFee);
            enterValue(txt2ndSSTPServiceOptionFee, strFee);
            blResult = verifyElement(txt2ndSSTPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndDMBPServiceOptionFee);
            String secondServiceOptionFee = txt2ndDMBPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndDMBPServiceOptionFee);
            enterValue(txt2ndDMBPServiceOptionFee, strFee);
            blResult = verifyElement(txt2ndDMBPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForThirdSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtThirdServiceOptionFee);
            String thirdServiceOptionFee = txtThirdServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txtThirdServiceOptionFee);
            enterValue(txtThirdServiceOptionFee, strFee);
            blResult = verifyElement(txtThirdServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdServiceOptionFee);
            String thirdServiceOptionFee = txt3rdServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdServiceOptionFee);
            enterValue(txt3rdServiceOptionFee, strFee);
            blResult = verifyElement(txt3rdServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdSSTPServiceOptionFee);
            String thirdServiceOptionFee = txt3rdSSTPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdSSTPServiceOptionFee);
            enterValue(txt3rdSSTPServiceOptionFee, strFee);
            blResult = verifyElement(txt3rdSSTPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdDMBPServiceOptionFee);
            String thirdServiceOptionFee = txt3rdDMBPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdDMBPServiceOptionFee);
            enterValue(txt3rdDMBPServiceOptionFee, strFee);
            blResult = verifyElement(txt3rdDMBPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForFourthSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtFourthServiceOptionFee);
            String fourthServiceOptionFee = txtFourthServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txtFourthServiceOptionFee);
            enterValue(txtFourthServiceOptionFee, strFee);
            blResult = verifyElement(txtFourthServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thServiceOptionFee);
            String fourthServiceOptionFee = txt4thServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thServiceOptionFee);
            enterValue(txt4thServiceOptionFee, strFee);
            blResult = verifyElement(txt4thServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thSSTPServiceOptionFee);
            String fourthServiceOptionFee = txt4thSSTPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thSSTPServiceOptionFee);
            enterValue(txt4thSSTPServiceOptionFee, strFee);
            blResult = verifyElement(txt4thSSTPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thDMBPServiceOptionFee);
            String fourthServiceOptionFee = txt4thDMBPServiceOptionFee.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thDMBPServiceOptionFee);
            enterValue(txt4thDMBPServiceOptionFee, strFee);
            blResult = verifyElement(txt4thDMBPServiceOptionFee);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescForFirstSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txtFirstServiceOptionDescription);
            String firstServiceOptionDescriptionText = txtFirstServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for First service Option Description is " + firstServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txtFirstServiceOptionDescription);
            enterValue(txtFirstServiceOptionDescription, strDescription);
            blResult = verifyElement(txtFirstServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option's Description>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor1stSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt1stServiceOptionDescription);
            String firstServiceOptionDescriptionText = txt1stServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for First service Option Description is " + firstServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt1stServiceOptionDescription);
            enterValue(txt1stServiceOptionDescription, strDescription);
            blResult = verifyElement(txt1stServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option's Description (SEND SCRIPT BY POST)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor1stSSTPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt1stSSTPServiceOptionDescription);
            String firstServiceOptionDescriptionText = txt1stSSTPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for First service Option Description is " + firstServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt1stSSTPServiceOptionDescription);
            enterValue(txt1stSSTPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt1stSSTPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FIRST Service option's Description (SEND SCRIPT TO PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor1stDMBPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt1stDMBPServiceOptionDescription);
            String firstServiceOptionDescriptionText = txt1stDMBPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for First service Option Description is " + firstServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt1stDMBPServiceOptionDescription);
            enterValue(txt1stDMBPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt1stDMBPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FIRST Service option's Description (DELIVER MEDS BY PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescForSecondSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txtSecondServiceOptionDescription);
            String secondServiceOptionDescriptionText = txtSecondServiceOptionDescription.getAttribute("value");
            System.out.println("Current Description is " + secondServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txtSecondServiceOptionDescription);
            enterValue(txtSecondServiceOptionDescription, strDescription);
            blResult = verifyElement(txtSecondServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option's Description>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor2ndSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndServiceOptionDescription);
            String secondServiceOptionDescriptionText = txt2ndServiceOptionDescription.getAttribute("value");
            System.out.println("Current Description is " + secondServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt2ndServiceOptionDescription);
            enterValue(txt2ndServiceOptionDescription, strDescription);
            blResult = verifyElement(txt2ndServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the (SEND SCRIPT BY POST) Second Service option's Description>>>:: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor2ndSSTPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndSSTPServiceOptionDescription);
            String secondServiceOptionDescriptionText = txt2ndSSTPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Second service Option description is " + secondServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt2ndSSTPServiceOptionDescription);
            enterValue(txt2ndSSTPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt2ndSSTPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option's Description (SEND SCRIPT TO PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor2ndDMBPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndDMBPServiceOptionDescription);
            String secondServiceOptionDescriptionText = txt2ndDMBPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Second service Option description is " + secondServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt2ndDMBPServiceOptionDescription);
            enterValue(txt2ndDMBPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt2ndDMBPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option's Description (DELIVER MEDS BY PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescForThirdSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txtThirdServiceOptionDescription);
            String thirdServiceOptionDescriptionText = txtThirdServiceOptionDescription.getAttribute("value");
            System.out.println("Current Description is " + thirdServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txtThirdServiceOptionDescription);
            enterValue(txtThirdServiceOptionDescription, strDescription);
            verifyElement(txtThirdServiceOptionDescription);
            blResult = verifyElement(txtThirdServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option's Description >>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor3rdSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdServiceOptionDescription);
            String thirdServiceOptionDescriptionText = txt3rdServiceOptionDescription.getAttribute("value");
            System.out.println("Current Description is " + thirdServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt3rdServiceOptionDescription);
            enterValue(txt3rdServiceOptionDescription, strDescription);
            verifyElement(txt3rdServiceOptionDescription);
            blResult = verifyElement(txt3rdServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the (SEND SCRIPT BY POST) Third Service option's Description >>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor3rdSSTPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdSSTPServiceOptionDescription);
            String thirdServiceOptionDescriptionText = txt3rdSSTPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + thirdServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt3rdSSTPServiceOptionDescription);
            enterValue(txt3rdSSTPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt3rdSSTPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option's Description (SEND SCRIPT TO PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor3rdDMBPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdDMBPServiceOptionDescription);
            String thirdServiceOptionDescriptionText = txt3rdDMBPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + thirdServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt3rdDMBPServiceOptionDescription);
            enterValue(txt3rdDMBPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt3rdDMBPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option's Description (DELIVER MEDS BY PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescForFourthSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txtFourthServiceOptionDescription);
            String fourthServiceOptionDescriptionText = txtFourthServiceOptionDescription.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txtFourthServiceOptionDescription);
            enterValue(txtFourthServiceOptionDescription, strDescription);
            verifyElement(txtFourthServiceOptionDescription);
            blResult = verifyElement(txtFourthServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option's Description>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor4thSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt4thServiceOptionDescription);
            String fourthServiceOptionDescriptionText = txt4thServiceOptionDescription.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt4thServiceOptionDescription);
            enterValue(txt4thServiceOptionDescription, strDescription);
            verifyElement(txt4thServiceOptionDescription);
            blResult = verifyElement(txt4thServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the (SEND SCRIPT BY POST) Fourth Service option's Description>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor4thSSTPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt4thSSTPServiceOptionDescription);
            String fourthServiceOptionDescriptionText = txt4thSSTPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + fourthServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt4thSSTPServiceOptionDescription);
            enterValue(txt4thSSTPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt4thSSTPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option's Description (SEND SCRIPT TO PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectDescFor4thDMBPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt4thDMBPServiceOptionDescription);
            String fourthServiceOptionDescriptionText = txt4thDMBPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + fourthServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt4thDMBPServiceOptionDescription);
            enterValue(txt4thDMBPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt4thDMBPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option's Description (DELIVER MEDS BY PHARMACY)>>> :: " + strDescription);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSendReqDataRuleB() {
        boolean blResult = false;
        try {
            waitForElement(optionRuleBRequest);
            blResult = click(optionRuleBRequest);
            System.out.println("Rule B option is selected");
        } catch (Exception e) {
            System.out.println("Rule B option is not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSendReqDataRuleC() {
        boolean blResult = false;
        try {
            waitForElement(optionRuleCRequest);
            blResult = click(optionRuleCRequest);
            System.out.println("Rule C option is selected");
        } catch (Exception e) {
            System.out.println("Rule C option is not selected >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectSendReqData(String strProvider) {
        boolean blResult1 = false;
        boolean blResult2 = false;
        try {
            waitForElement(enabledVM04PracticeOption);
            blResult1 = verifyElement(enabledVM04PracticeOption);
            System.out.println("VM04Practice location is indefault selected");
            click(dropdownProvider);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlProvider = waitForElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProvider)));
            click(ddlProvider);
            String providerName = dropdownProvider.getText();
            if (providerName.equals(strProvider)) {
                System.out.println("Both provider names are Same");
                blResult1 = true;
            }
            waitForElement(dropdownProvider2);
            click(dropdownProvider2);
            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlProvider2 = waitForElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProvider)));
            click(ddlProvider2);
            String providerName2 = dropdownProvider2.getText();
            if (providerName2.equals(strProvider)) {
                System.out.println("Both provider names are Same");
                blResult2 = true;
            }
        } catch (Exception e) {
            System.out.println("Send Request to Provider is not selected " + strProvider);
            e.printStackTrace();
        }
        return blResult1 && blResult2;
    }

    public boolean verifySavedData() {
        boolean blResult = false;
        try {
            waitForElement(btnSave);
            jsScrollIntoView(btnSave);
            jsClick(btnSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(successPopUp);
            blResult = verifyElement(successPopUp);
        } catch (Exception e) {
            System.out.println("Failed to verify the saved pop up");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean EnableRRPScriptInstructionsFeeForLocation(String strType) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            System.out.println("Rdo Btn Locator :: " + rdoBtn.replace("<<TYPE>>", strType) + "\n");
            WebElement type = waitForElement(By.xpath(rdoBtn.replace("<<TYPE>>", strType)));
            waitForElementClickable(type);
            waitForSeconds(3);
            jsClick(type);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("selectedType Btn Locator :: " + selectedRdoBtnValue.replace("<<TYPE>>", strType) + "\n");
            WebElement selectedType = waitForElement(By.xpath(selectedRdoBtnValue.replace("<<TYPE>>", strType)));
            waitForElement(selectedType);
            takeScreenshot(driver);
            blResult = selectedType.isSelected();

        } catch (Exception e) {
            System.out.println("Rdo Btn not selected >>> :: ");
            e.printStackTrace();

        }
        return blResult;
    }

    public boolean verifyRRPScriptInstructionsChanges(String strLocation, String strType) {
        boolean isVerified = false;
        try {
            System.out.println(" selected DrpDownOption Locator >>> :: " + selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(selectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
            waitForElement(selectedOption);
            jsScrollIntoView(selectedOption);
            takeScreenshot(driver);
            System.out.println("selectedType Btn Locator :: " + selectedRdoBtnValue.replace("<<TYPE>>", strType) + "\n");
            WebElement selectedType = waitForElement(By.xpath(selectedRdoBtnValue.replace("<<TYPE>>", strType)));
            waitForElement(selectedType);

            if (selectedOption.isDisplayed() || selectedType.isSelected()) {
                isVerified = true;
            } else {
                return isVerified;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVerified;
    }

    public boolean backToHomePage() {
        boolean isVerified = false;
        waitForSeconds(2);
        waitForElementClickable(imgNavHeader);
        jsClick(imgNavHeader);
        waitForElement(txtWelcome);
        isVerified = verifyElement(txtWelcome);
        return isVerified;
    }
}

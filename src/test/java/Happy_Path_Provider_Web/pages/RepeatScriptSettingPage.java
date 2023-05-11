package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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

    @FindBy(xpath = "(//mat-radio-group[@formcontrolname='isMessageMandatory']//div//div//following::input)[1]")
    protected WebElement btnRequestisMandatoryYESButton;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='PaymentOption']//mat-radio-button[1]//input")
    protected WebElement clickPayHealthCenterOnlyButton;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='PaymentOption']//mat-radio-button[3]//input")
    protected WebElement clickPayHealthCenterOnlyandPayNowButton;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='PaymentOption']//mat-radio-button[2]//input")
    protected WebElement clickPayNowButton;

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

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]")
    protected WebElement txtDVZPServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtSecondServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtSSTP2ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtDMBP2ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txtDVZP2ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]")
    protected WebElement txt2ndServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtThirdServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtDMBP3ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='48 Hours'][1]")
    protected WebElement txtDVZP3ServiceOption;

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

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='72 Hours'][1]")
    protected WebElement txtDVZP4ServiceOption;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txtFirstServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txtFirstServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txtFirstServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt1stServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt1stServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt1stServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt1stSSTPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt1stSSTPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt1stSSTPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt1stDMBPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt1stDVZPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt1stDMBPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='CSC'][2]")
    protected WebElement txt1stDVZPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt1stDMBPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::input[@data-placeholder='HUHC'][3]")
    protected WebElement txt1stDVZPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txtSecondServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txtSecondServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txtSecondServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt2ndServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt2ndServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt2ndServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt2ndSSTPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt2ndSSTPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt2ndSSTPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt2ndDMBPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt2ndDVZPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt2ndDMBPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='CSC'][2]")
    protected WebElement txt2ndDVZPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt2ndDMBPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::input[@data-placeholder='HUHC'][3]")
    protected WebElement txt2ndDVZPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txtThirdServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txtThirdServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txtThirdServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt3rdServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt3rdServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt3rdServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt3rdSSTPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt3rdSSTPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt3rdSSTPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt3rdDMBPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt3rdDVZPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt3rdDMBPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='CSC'][2]")
    protected WebElement txt3rdDVZPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt3rdDMBPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt3rdDVZPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txtFourthServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txtFourthServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txtFourthServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt4thServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt4thServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt4thServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt4thSSTPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt4thSSTPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt4thSSTPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt4thDMBPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='STD'][1]")
    protected WebElement txt4thDVZPServiceOptionFeeSTD;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='CSC'][1]")
    protected WebElement txt4thDMBPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='CSC'][2]")
    protected WebElement txt4thDVZPServiceOptionFeeCSC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='HUHC'][1]")
    protected WebElement txt4thDMBPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::input[@data-placeholder='HUHC'][3]")
    protected WebElement txt4thDVZPServiceOptionFeeHUHC;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txtFirstServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Urgent/Same day'][1]/following::textarea[1]")
    protected WebElement txt1stDVZPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txtSecondServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='Next Day'][1]/following::textarea[1]")
    protected WebElement txt2ndDVZPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txtThirdServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='48 Hours'][1]/following::textarea[1]")
    protected WebElement txt3rdDVZPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Patient to Collect Script']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txtFourthServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script by Post']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Send Script to Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thSSTPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver Meds by Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thDMBPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//b[.='Deliver via Zoom Pharmacy']/following::input[@data-placeholder='72 Hours'][1]/following::textarea[1]")
    protected WebElement txt4thDVZPServiceOptionDescription;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Rule B : Restrict to Default Location')]")
    protected WebElement optionRuleBRequest;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Rule C : Restrict to Default Location and Provider')]")
    protected WebElement optionRuleCRequest;

//    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']")
//    protected WebElement enabledVM04PracticeOption;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']"),
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='Automation_Practice1_Loc1']")

    })
    protected WebElement enabledVM04PracticeOption;

    //mat-checkbox//*[normalize-space(text())='Automation_Practice1_Loc1']

//    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[1]")
//    protected WebElement dropdownProvider;



    @FindAll({
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[1]"),
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='Automation_Practice1_Loc1']/following::mat-select[1]")

    })
    protected WebElement dropdownProvider;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[2]"),
            @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='Automation_Practice1_Loc1']/following::mat-select[2]")

    })
    protected WebElement dropdownProvider2;
//    @FindBy(how = How.XPATH, using = "//mat-checkbox//*[normalize-space(text())='VM04Practice']/following::mat-select[2]")
//    protected WebElement dropdownProvider2;

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
    protected String VeriflyselectedDrpDownOption = new StringBuilder()
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
            if (verifyElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)))) {
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
                WebElement selectedOption = waitForElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
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
            if (verifyElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName)))) {
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
            System.out.println(" selected DrpDownOption Service Name >>> :: " + VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strServiceName)));
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
            System.out.println(" selected DrpDownOption Service Name >>> :: " + VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strProviderName) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strProviderName)));
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

    public boolean select1stDVZPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDVZPServiceOption);
            String firstServiceOption = txtDVZPServiceOption.getAttribute("value");
            System.out.println("Current value for first service option " + firstServiceOption + "And Expected Value is " + strServiceOption);
            if (firstServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDVZPServiceOption);
                enterValue(txtDVZPServiceOption, strServiceOption);
                blResult = verifyElement(txtDVZPServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values (DELIVER VIA ZOOM PHARMACY) >>> :: " + strServiceOption);
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

    public boolean select2ndDVZPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDVZP2ServiceOption);
            String secondServiceOption = txtDVZP2ServiceOption.getAttribute("value");
            System.out.println("Current value for Second service option " + secondServiceOption + "And Expected Value is " + strServiceOption);
            if (secondServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDVZP2ServiceOption);
                enterValue(txtDVZP2ServiceOption, strServiceOption);
                blResult = verifyElement(txtDVZP2ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values (DELIVER VIA ZOOM PHARMACY) >>> :: " + strServiceOption);
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
            waitForElement(txtDMBP3ServiceOption);
            String thirdServiceOption = txtDMBP3ServiceOption.getAttribute("value");
            System.out.println("Current value for Third service option " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDMBP3ServiceOption);
                enterValue(txtDMBP3ServiceOption, strServiceOption);
                blResult = verifyElement(txtDMBP3ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values (DELIVER MEDS BY PHARMACY) >>> :: " + strServiceOption);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean select3rdDVZPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDVZP3ServiceOption);
            String thirdServiceOption = txtDVZP3ServiceOption.getAttribute("value");
            System.out.println("Current value for Third service option " + thirdServiceOption + "And Expected Value is " + strServiceOption);
            if (thirdServiceOption.equalsIgnoreCase(strServiceOption)) {
                blResult = true;
            } else {
                click(txtDVZP3ServiceOption);
                enterValue(txtDVZP3ServiceOption, strServiceOption);
                blResult = verifyElement(txtDVZP3ServiceOption);
            }
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values (DELIVER VIA ZOOM PHARMACY) >>> :: " + strServiceOption);
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

    public boolean select4thDVZPServiceOption(String strServiceOption) {
        boolean blResult = false;
        try {
            waitForElement(txtDVZP4ServiceOption);
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
            waitForElement(txtFirstServiceOptionFeeSTD);
            String firstServiceOptionFee = txtFirstServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txtFirstServiceOptionFeeSTD);
            enterValue(txtFirstServiceOptionFeeSTD, strFee);
            enterValue(txtFirstServiceOptionFeeCSC, "1023");
            enterValue(txtFirstServiceOptionFeeHUHC, "1024");
            blResult = verifyElement(txtFirstServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stServiceOptionFeeSTD);
            String firstServiceOptionFee = txt1stServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stServiceOptionFeeSTD);
            enterValue(txt1stServiceOptionFeeSTD, strFee);
            enterValue(txt1stServiceOptionFeeCSC, "1045");
            enterValue(txt1stServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txt1stServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stSSTPServiceOptionFeeSTD);
            String firstServiceOptionFee = txt1stSSTPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stSSTPServiceOptionFeeSTD);
            enterValue(txt1stSSTPServiceOptionFeeSTD, strFee);
            enterValue(txt1stSSTPServiceOptionFeeCSC, "1023");
            enterValue(txt1stSSTPServiceOptionFeeHUHC, "1024");
            blResult = verifyElement(txt1stSSTPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stDMBPServiceOptionFeeSTD);
            String firstServiceOptionFee = txt1stDMBPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stDMBPServiceOptionFeeSTD);
            enterValue(txt1stDMBPServiceOptionFeeSTD, strFee);
            enterValue(txt1stDMBPServiceOptionFeeCSC, "1023");
            enterValue(txt1stDMBPServiceOptionFeeHUHC, "1024");
            blResult = verifyElement(txt1stDMBPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor1stDVZPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt1stDVZPServiceOptionFeeSTD);
            String firstServiceOptionFee = txt1stDVZPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + firstServiceOptionFee + "And Expected Value is " + strFee);
            click(txt1stDVZPServiceOptionFeeSTD);
            enterValue(txt1stDVZPServiceOptionFeeSTD, strFee);
            enterValue(txt1stDVZPServiceOptionFeeCSC, "1023");
            enterValue(txt1stDVZPServiceOptionFeeHUHC, "1024");
            blResult = verifyElement(txt1stDVZPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the First Service option values Fee (DELIVER VIA ZOOM PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForSecondSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtSecondServiceOptionFeeSTD);
            String secondServiceOptionFee = txtSecondServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txtSecondServiceOptionFeeSTD);
            enterValue(txtSecondServiceOptionFeeSTD, strFee);
            enterValue(txtSecondServiceOptionFeeCSC, "1034");
            enterValue(txtSecondServiceOptionFeeHUHC, "1035");
            blResult = verifyElement(txtSecondServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndServiceOptionFeeSTD);
            String secondServiceOptionFee = txt2ndServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndServiceOptionFeeSTD);
            enterValue(txt2ndServiceOptionFeeSTD, strFee);
            enterValue(txt2ndServiceOptionFeeCSC, "1034");
            enterValue(txt2ndServiceOptionFeeHUHC, "1035");
            blResult = verifyElement(txt2ndServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Second Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndSSTPServiceOptionFeeSTD);
            String secondServiceOptionFee = txt2ndSSTPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndSSTPServiceOptionFeeSTD);
            enterValue(txt2ndSSTPServiceOptionFeeSTD, strFee);
            enterValue(txt2ndSSTPServiceOptionFeeCSC, "1034");
            enterValue(txt2ndSSTPServiceOptionFeeHUHC, "1035");
            blResult = verifyElement(txt2ndSSTPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndDMBPServiceOptionFeeSTD);
            String secondServiceOptionFee = txt2ndDMBPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndDMBPServiceOptionFeeSTD);
            enterValue(txt2ndDMBPServiceOptionFeeSTD, strFee);
            enterValue(txt2ndDMBPServiceOptionFeeCSC, "1034");
            enterValue(txt2ndDMBPServiceOptionFeeHUHC, "1035");
            blResult = verifyElement(txt2ndDMBPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor2ndDVZPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndDVZPServiceOptionFeeSTD);
            String secondServiceOptionFee = txt2ndDVZPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + secondServiceOptionFee + "And Expected Value is " + strFee);
            click(txt2ndDVZPServiceOptionFeeSTD);
            enterValue(txt2ndDVZPServiceOptionFeeSTD, strFee);
            enterValue(txt2ndDVZPServiceOptionFeeCSC, "1034");
            enterValue(txt2ndDVZPServiceOptionFeeHUHC, "1035");
            blResult = verifyElement(txt2ndDVZPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option values Fee (DELIVER ZOOM VIA PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForThirdSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtThirdServiceOptionFeeSTD);
            String thirdServiceOptionFee = txtThirdServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txtThirdServiceOptionFeeSTD);
            enterValue(txtThirdServiceOptionFeeSTD, strFee);
            enterValue(txtThirdServiceOptionFeeCSC, "1045");
            enterValue(txtThirdServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txtThirdServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdServiceOptionFeeSTD);
            String thirdServiceOptionFee = txt3rdServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdServiceOptionFeeSTD);
            enterValue(txt3rdServiceOptionFeeSTD, strFee);
            enterValue(txt3rdServiceOptionFeeCSC, "1045");
            enterValue(txt3rdServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txt3rdServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Third Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdSSTPServiceOptionFeeSTD);
            String thirdServiceOptionFee = txt3rdSSTPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdSSTPServiceOptionFeeSTD);
            enterValue(txt3rdSSTPServiceOptionFeeSTD, strFee);
            enterValue(txt3rdSSTPServiceOptionFeeCSC, "1045");
            enterValue(txt3rdSSTPServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txt3rdSSTPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdDMBPServiceOptionFeeSTD);
            String thirdServiceOptionFee = txt3rdDMBPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdDMBPServiceOptionFeeSTD);
            enterValue(txt3rdDMBPServiceOptionFeeSTD, strFee);
            enterValue(txt3rdDMBPServiceOptionFeeCSC, "1045");
            enterValue(txt3rdDMBPServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txt3rdDMBPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor3rdDVZPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdDVZPServiceOptionFeeSTD);
            String thirdServiceOptionFee = txt3rdDVZPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + thirdServiceOptionFee + "And Expected Value is " + strFee);
            click(txt3rdDVZPServiceOptionFeeSTD);
            enterValue(txt3rdDVZPServiceOptionFeeSTD, strFee);
            enterValue(txt3rdDVZPServiceOptionFeeCSC, "1045");
            enterValue(txt3rdDVZPServiceOptionFeeHUHC, "1046");
            blResult = verifyElement(txt3rdDVZPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option values Fee (DELIVER VIA ZOOM PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeForFourthSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txtFourthServiceOptionFeeSTD);
            String fourthServiceOptionFee = txtFourthServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txtFourthServiceOptionFeeSTD);
            enterValue(txtFourthServiceOptionFeeSTD, strFee);
            enterValue(txtFourthServiceOptionFeeCSC, "1056");
            enterValue(txtFourthServiceOptionFeeHUHC, "1057");
            blResult = verifyElement(txtFourthServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values Fee>>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thServiceOptionFeeSTD);
            String fourthServiceOptionFee = txt4thServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thServiceOptionFeeSTD);
            enterValue(txt4thServiceOptionFeeSTD, strFee);
            enterValue(txt4thServiceOptionFeeCSC, "1056");
            enterValue(txt4thServiceOptionFeeHUHC, "1057");
            blResult = verifyElement(txt4thServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the Fourth Service option values Fee (SEND SCRIPT BY POST) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thSSTPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thSSTPServiceOptionFeeSTD);
            String fourthServiceOptionFee = txt4thSSTPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thSSTPServiceOptionFeeSTD);
            enterValue(txt4thSSTPServiceOptionFeeSTD, strFee);
            enterValue(txt4thSSTPServiceOptionFeeCSC, "1056");
            enterValue(txt4thSSTPServiceOptionFeeHUHC, "1057");
            blResult = verifyElement(txt4thSSTPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values Fee (SEND SCRIPT TO PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thDMBPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thDMBPServiceOptionFeeSTD);
            String fourthServiceOptionFee = txt4thDMBPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thDMBPServiceOptionFeeSTD);
            enterValue(txt4thDMBPServiceOptionFeeSTD, strFee);
            enterValue(txt4thDMBPServiceOptionFeeCSC, "1056");
            enterValue(txt4thDMBPServiceOptionFeeHUHC, "1057");
            blResult = verifyElement(txt4thDMBPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values Fee (DELIVER MEDS BY PHARMACY) >>> :: " + strFee);
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectFeeFor4thDVZPSelectedServiceOption(String strFee) {
        boolean blResult = false;
        try {
            waitForElement(txt4thDVZPServiceOptionFeeSTD);
            String fourthServiceOptionFee = txt4thDVZPServiceOptionFeeSTD.getAttribute("value");
            System.out.println("Current value is " + fourthServiceOptionFee + "And Expected Value is " + strFee);
            click(txt4thDVZPServiceOptionFeeSTD);
            enterValue(txt4thDVZPServiceOptionFeeSTD, strFee);
            enterValue(txt4thDVZPServiceOptionFeeCSC, "1056");
            enterValue(txt4thDVZPServiceOptionFeeHUHC, "1057");
            blResult = verifyElement(txt4thDVZPServiceOptionFeeSTD);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option values Fee (DELIVER VIA ZOOM PHARMACY) >>> :: " + strFee);
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

    public boolean selectDescFor1stDVZPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt1stDVZPServiceOptionDescription);
            String firstServiceOptionDescriptionText = txt1stDVZPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for First service Option Description is " + firstServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt1stDVZPServiceOptionDescription);
            enterValue(txt1stDVZPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt1stDVZPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FIRST Service option's Description (DELIVER VIA ZOOM PHARMACY)>>> :: " + strDescription);
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

    public boolean selectDescFor2ndDVZPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt2ndDVZPServiceOptionDescription);
            String secondServiceOptionDescriptionText = txt2ndDVZPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Second service Option description is " + secondServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt2ndDVZPServiceOptionDescription);
            enterValue(txt2ndDVZPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt2ndDVZPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the SECOND Service option's Description (DELIVER VIA ZOOM PHARMACY)>>> :: " + strDescription);
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

    public boolean selectDescFor3rdDVZPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt3rdDVZPServiceOptionDescription);
            String thirdServiceOptionDescriptionText = txt3rdDVZPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + thirdServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt3rdDVZPServiceOptionDescription);
            enterValue(txt3rdDVZPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt3rdDVZPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the THIRD Service option's Description (DELIVER VIA ZOOM PHARMACY)>>> :: " + strDescription);
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

    public boolean selectDescFor4thDVZPSelectedServiceOption(String strDescription) {
        boolean blResult = false;
        try {
            waitForElement(txt4thDVZPServiceOptionDescription);
            String fourthServiceOptionDescriptionText = txt4thDVZPServiceOptionDescription.getAttribute("value");
            System.out.println("Current value for Third service Option description is " + fourthServiceOptionDescriptionText + " And Expected Description is " + strDescription);
            click(txt4thDVZPServiceOptionDescription);
            enterValue(txt4thDVZPServiceOptionDescription, strDescription);
            blResult = verifyElement(txt4thDVZPServiceOptionDescription);
        } catch (Exception e) {
            System.out.println("Not able to add the FOURTH Service option's Description (DELIVER VIA ZOOM PHARMACY)>>> :: " + strDescription);
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

    public boolean selectSendReqData(List<String> strProvider) {
        boolean blResult2 = false;
        try {

//            waitForElement(enabledVM04PracticeOption);
//            blResult1 = verifyElement(enabledVM04PracticeOption);
//            System.out.println("VM04Practice location is indefault selected");
            jsScrollIntoView(dropdownProvider);
            waitForElement(dropdownProvider);
            click(dropdownProvider);
//            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlProvider = waitForElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProvider.get(2))));
            click(ddlProvider);
            String providerName = dropdownProvider.getText();
//            if (providerName.equals(strProvider)) {
//                System.out.println("Both provider names are Same");
//            }
            waitForElement(dropdownProvider2);
            click(dropdownProvider2);
//            waitForPresenceOfElement(By.xpath("//div[@role='listbox']"));
            WebElement ddlProvider2 = waitForElement(By.xpath(selectProvider.replace("<<REPLACEMENT>>", strProvider.get(3))));
            click(ddlProvider2);
            String providerName2 = dropdownProvider2.getText();
//            if (providerName2.equals(strProvider)) {
//                System.out.println("Both provider names are Same");
//            }
            blResult2=true;
        } catch (Exception e) {
            System.out.println("Send Request to Provider is not selected " + strProvider);
            e.printStackTrace();
        }
        return  blResult2;
    }

    public boolean verifySavedData() {
        boolean blResult = false;
        try {

            jsScrollIntoView(btnSave);
            waitForElement(btnSave);
            jsClick(btnSave);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(successPopUp);
            blResult = true;
        } catch (Exception e) {
            System.out.println("Failed to verify the saved pop up");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickRequestisMandatoryYesButton() {
        boolean blResult = false;
        try {
            waitForElement(btnRequestisMandatoryYESButton);
            jsScrollIntoView(btnRequestisMandatoryYESButton);
            jsClick(btnRequestisMandatoryYESButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
        } catch (Exception e) {
            System.out.println("Failed to verify the saved pop up");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickPaymentSettingPayAtHealthCentreButton() {
        boolean blResult = false;
        try {
            waitForElement(clickPayHealthCenterOnlyButton);
            jsScrollIntoView(clickPayHealthCenterOnlyButton);
            jsClick(clickPayHealthCenterOnlyButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
        } catch (Exception e) {
            System.out.println("Failed to verify the saved pop up");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean ClickPaymentSettingPayAtHealthCentreOrPayNowButton() {
        boolean blResult = false;
        try {
            waitForElement(clickPayHealthCenterOnlyandPayNowButton);
            jsScrollIntoView(clickPayHealthCenterOnlyandPayNowButton);
            jsClick(clickPayHealthCenterOnlyandPayNowButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
        } catch (Exception e) {
            System.out.println("Failed to verify the saved pop up");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickPaymentSettingPayOnlineButton() {
        boolean blResult = false;
        try {
            waitForElement(clickPayNowButton);
            jsScrollIntoView(clickPayNowButton);
            jsClick(clickPayNowButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnSave);
            blResult = verifyElement(btnSave);
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
            System.out.println(" selected DrpDownOption Locator >>> :: " + VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation) + "\n");
            WebElement selectedOption = waitForElement(By.xpath(VeriflyselectedDrpDownOption.replace("<<REPLACEMENT>>", strLocation)));
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

package Happy_Path_Provider_Web;

import Happy_Path_Patient_Web_and_MR.pages.AppointmentsPage;
import Happy_Path_Provider_Web.pages.*;
import cap.helpers.Constants;
import cap.utilities.SharedDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Happy_Path_Patient_Web_and_MR.pages.HomePage;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProviderPageContainer {
    private WebDriver driver;
    public static Scenario myScenario;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();
    public ProviderHomePage providerHomePage;
    public RepeatScriptSettingPage repeatScriptSettingPage;
    public RRPScriptFeeSettingsPage rrpScriptFeeSettingsPage;
    public PreScreeningPage preScreeningPage;
    public AppointmentMessagePage appointmentMessagePage;
    public AppointmentsPage appointmentsPage;
    public ProviderMessagesPage providerMessagesPage;

    public AppointmentSettingPage appointmentSettingPage;

    public HomePage homePage;

    public PhoneAppointmentSettingPage phoneAppointmentSettingPage;




    public ProviderPageContainer() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            driver = SharedDriver.getDriver();
            initPages();
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            driver = SharedDriver.getDriver();
            driver = SharedDriver.getMobileDriver();
            initPages();
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            driver = SharedDriver.getDriver();
            initPages();
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("WEBMOBILE")) {
            driver = SharedDriver.getDriver();
            initPages();
        }

    }

    private void initPages() {
        providerHomePage = new ProviderHomePage(driver);
        repeatScriptSettingPage = new RepeatScriptSettingPage(driver);
        rrpScriptFeeSettingsPage = new RRPScriptFeeSettingsPage(driver);
        preScreeningPage = new PreScreeningPage(driver);
        appointmentMessagePage = new AppointmentMessagePage(driver);
        appointmentsPage = new AppointmentsPage(driver);
        providerMessagesPage = new ProviderMessagesPage(driver);
        appointmentSettingPage = new AppointmentSettingPage(driver);
    }

    @After("@WEB")
    public void afterScenario(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.log(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }
        if (scenario.isFailed()) {
            byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageBytes, "image/png", "");
        }
        System.out.println("\n Scenario Outline: " + scenario.getName());
        System.out.println("\n Scenario Status: " + scenario.getStatus());
    }

    //  @Before("not @API and not @Mobile and not @Desktop")
    @Before("@WEB")
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
    }
}


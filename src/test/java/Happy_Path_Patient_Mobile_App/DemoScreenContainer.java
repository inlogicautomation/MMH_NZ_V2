package Happy_Path_Patient_Mobile_App;


import Happy_Path_Patient_Mobile_App.screens.*;
import cap.helpers.Constants;
import cap.utilities.SharedDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Codoidian-pc on 05/03/2022.
 */
public class DemoScreenContainer {
    private WebDriver driver;

    //Demo Mobile Application Screens
    public static LoginScreen loginScreen;
    public static HomeScreen homeScreen;
    public static AppointmentsScreen appointmentsScreen;
    public static HealthRecordsScreen healthRecordsScreen;
    public static RepeatRequestPrescriptionScreen repeatRequestPrescriptionScreen;
    public static MessageScreen messageScreen;

    public static Scenario myScenario;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();


    public DemoScreenContainer() {
//        driver = SharedDriver.getMobileDriver();
//        initScreens();
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
            driver = SharedDriver.getMobileDriver();
            initPages();
        }
    }

    private void initPages() {
        // Mobile Application Screens
        loginScreen = new LoginScreen(driver);
        homeScreen = new HomeScreen(driver);
        appointmentsScreen = new AppointmentsScreen(driver);
        healthRecordsScreen = new HealthRecordsScreen(driver);
        repeatRequestPrescriptionScreen = new RepeatRequestPrescriptionScreen(driver);
        messageScreen = new MessageScreen(driver);
    }

    @After("@MOBILE")
    public void afterScenario(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.log(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }
        byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(imageBytes, "image/png", "");
        System.out.println("\n Scenario outline: " + scenario.getName());
        System.out.println("\n Scenario Status: " + scenario.getStatus());

        if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {

            if (scenario.getSourceTagNames().contains("@RELAUNCH")) {
                homeScreen.appRelaunch();
            } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
                loginScreen.reLaunchAppIOS();
            }
        }
        if (scenario.isFailed()) {
            System.out.println("Scenario Failed");
            if (System.getProperty("PLATFORM").equalsIgnoreCase("android")) {
                ApplicationState activity = ((AndroidDriver) driver).queryAppState("managemyhealth.co.nz");
                System.out.println("\n >> Get Current Activity: " + activity);
                if (activity.toString().contains("BACKGROUND") || activity.toString().contains("NOT_RUNNING")) {
                    System.out.println("\n In this execution, " + scenario.getName() + " -  App Closed unfortunately...");
                    loginScreen.reLaunchAppAndroid();
                }
            } else if (System.getProperty("PLATFORM").equalsIgnoreCase("ios")) {
                ApplicationState activity = ((IOSDriver) driver).queryAppState("managemyhealth.co.nz");
                if (activity.toString().contains("BACKGROUND") || activity.toString().contains("NOT_RUNNING")) {
                    System.out.println("Get Current APP Activity:: " + activity);
                    loginScreen.reLaunchAppIOS();
                }
            }
        }
    }


    @Before("@MOBILE")
    //@Before("not @API and not @WEB and not @Desktop")
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
    }
}

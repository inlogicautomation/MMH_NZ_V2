package MMH_MobileApp;


import MMH_MobileApp.screens.*;
import cap.utilities.SharedDriver;

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

    public static Scenario myScenario;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();


    public DemoScreenContainer() {
        driver = SharedDriver.getMobileDriver();
        initScreens();
    }

    private void initScreens() {
        // Mobile Application Screens
        loginScreen = new LoginScreen(driver);
        homeScreen = new HomeScreen(driver);
        appointmentsScreen = new AppointmentsScreen(driver);
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
    }

    @Before("@MOBILE")
    //@Before("not @API and not @WEB and not @Desktop")
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
    }
}

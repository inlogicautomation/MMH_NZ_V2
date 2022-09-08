package MMH.cukes;


import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import static MMH.pages.HomePage.*;

@CucumberOptions(features = {"src/test/resources/features/HappyPath_Web_&_MobileResponse"},
        monochrome = true,
        tags = "@HAPPY_PATH",
        glue = {"MMH"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })


public class DemoWebCukes extends AbstractTestNGCucumberTests {

    @AfterClass
    public void teardown() {
        ExtentService.getInstance().setSystemInfo("SYSTEM NAME", strSystemName);
        ExtentService.getInstance().setSystemInfo("SYSTEM USER NAME", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("OS", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("BROWSER DETAILS", strBrowserName);
        ExtentService.getInstance().setSystemInfo("BROWSER VERSION", strBrowserVersion);
        ExtentService.getInstance().setSystemInfo("BUILD NUMBER", strAppVersion);
        ExtentService.getInstance().setSystemInfo("APP URL", TestDataUtil.getValue("&URL&"));

    }
}
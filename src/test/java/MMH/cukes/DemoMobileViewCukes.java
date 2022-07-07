package MMH.cukes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/HappyPath"},
        monochrome = true,
        tags = "@HAPPY_PATH_MOBILE_RESPONSE",
        glue = {"MMH"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })


public class DemoMobileViewCukes extends AbstractTestNGCucumberTests {

}
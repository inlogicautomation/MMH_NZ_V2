package MMH.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

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

}
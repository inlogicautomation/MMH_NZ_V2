package MMH_MobileApp.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/HappyPath_Mobile_App"},
        monochrome = true,
        tags = "@HAPPY_PATH_MOBILE",
        glue = {"MMH_MobileApp","MMH"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class MobileCukes extends AbstractTestNGCucumberTests {

}
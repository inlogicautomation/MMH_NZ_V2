package MMH_MobileApp.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/HappyPath_Mobile"},
        monochrome = true,
        tags = "@Mobile_Appointment",
        glue = {"MMH_MobileApp"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class MobileCukes extends AbstractTestNGCucumberTests {

}
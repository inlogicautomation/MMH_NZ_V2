package Happy_Path_Provider_Web.cukes;

import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static Happy_Path_Patient_Web_and_MR.pages.HomePage.*;
import static Happy_Path_Patient_Web_and_MR.pages.HomePage.strSystemName;

@CucumberOptions(features = {"@target/failedrerun.txt"},
        monochrome = true,
        tags = "@APPOINTMENTS_SETTING",
        glue = {"Happy_Path_Provider_Web", "Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json",

        })

public class ReRunnerClass extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void Rerun() {
        System.setProperty("app", "Happy_Path_Provider_Web");
        System.setProperty("execution_type", "browser");
        System.setProperty("runner", "ProviderWebCukes");
        System.setProperty("browser_name", "chrome");
        System.setProperty("env", "QA");

    }
}

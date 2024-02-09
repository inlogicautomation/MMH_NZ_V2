package General_Sanity_Provider_Web.cukes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(features = {"@target/failedrerun.txt"},
        monochrome = true,
        tags = "@Logins",
        glue = {"General_Sanity_Provider_Web"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json",

        })

public class ReRunnerClass extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void Rerun() {
        System.setProperty("app", "General_Sanity_Provider_Web");
        System.setProperty("execution_type", "browser");
        System.setProperty("runner", "GeneralSanityWebCukes");
        System.setProperty("browser_name", "chrome");
        System.setProperty("env", "QA");

    }
}

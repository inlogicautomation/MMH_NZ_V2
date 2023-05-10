package Sanity_Patient_Web.cukes;
import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import static Sanity_Patient_Web.pages.HomePage.*;


@CucumberOptions(features = {"src/test/resources/features/Sanity_Patient_Web"},
        monochrome = true,
        tags = "@DASHBOARD1",
        glue = {"Sanity_Patient_Web", "Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })

public class SanityWebCukes extends AbstractTestNGCucumberTests {
        @AfterClass
        public void teardown() {
                ExtentService.getInstance().setSystemInfo("Application Name", "V2 Feature Development");
                ExtentService.getInstance().setSystemInfo("Application URL", TestDataUtil.getValue("&URL&"));
                ExtentService.getInstance().setSystemInfo("Execution Build", strAppVersion);
                ExtentService.getInstance().setSystemInfo("Operating System", System.getProperty("os.name"));
                ExtentService.getInstance().setSystemInfo("Execution Browser", strBrowserName);
                ExtentService.getInstance().setSystemInfo("Browser Version", strBrowserVersion);
                ExtentService.getInstance().setSystemInfo("Execution Machine", strSystemName);
                ExtentService.getInstance().setSystemInfo("Automation QA", System.getProperty("user.name"));


        }
}

//clean test -Dapp=Sanity_Patient_Web -Dexecution_type=browser -Drunner=SanityWebCukes -Dbrowser_name=chrome -Denv=PROD "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/WebApp-QAResults.html -Dsysteminfo.AppName=Demo-QA"

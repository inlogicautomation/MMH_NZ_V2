package Happy_Path_Patient_Web_and_MR.cukes;

import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import static Happy_Path_Patient_Web_and_MR.pages.HomePage.*;
import static Happy_Path_Patient_Web_and_MR.pages.HomePage.strAppVersion;

@CucumberOptions(features = {"src/test/resources/features/Happy_Path_Patient_Web_and_MR"},
        monochrome = true,
        tags = "@HAPPY_PATH_MOBILE_RESPONSE",
        glue = {"Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })

//clean test -Dapp=Happy_Path_Patient_Web_and_MR -Dexecution_type=mobile -Drunner=DemoMobileViewCukes -Dbrowser_name=chrome -Denv=PROD "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/MobileResponse-QAResults.html -Dsysteminfo.AppName=Demo-QA"


public class DemoMobileViewCukes extends AbstractTestNGCucumberTests {
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
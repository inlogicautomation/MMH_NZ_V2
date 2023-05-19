package Happy_Path_Provider_Web.cukes;

import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static Happy_Path_Patient_Web_and_MR.pages.HomePage.*;
import static Happy_Path_Patient_Web_and_MR.pages.HomePage.strSystemName;

@CucumberOptions(features = {"src/test/resources/features/Happy_Path_Provider_Web"},
        monochrome = true,
        tags = "@REPEAT_SCRIPT_SETTING1",
        glue = {"Happy_Path_Provider_Web", "Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json",
                "rerun:target/failedrerun.txt"

        })

public class ProviderMobileWebCukes extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void Rerun(){
        System.setProperty("app", "Happy_Path_Provider_Web");
        System.setProperty("execution_type","mobileview");
        System.setProperty("runner","ProviderMobileWebCukes");
        System.setProperty("browser_name","chrome");
        System.setProperty("env","QA");

    }
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

//    clean test -Dapp=Happy_Path_Provider_Web -Drunner=ProviderMobileWebCukes -Dexecution_type=mobile -Dconfig=local_android_Galaxy_A13_Chrome -Denv=QA -Dbrowser_name=chrome "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/RealDeviceMobile-QAResults.html -Dsysteminfo.AppName=Demo-QA"

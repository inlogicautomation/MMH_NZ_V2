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

public class AndroidMobileCukes extends AbstractTestNGCucumberTests {

}

//        clean test -Dapp=MMH_MobileApp -Drunner=MobileCukes -Dexecution_type=webmobile -Dconfig=local_android_Poco_M2_Mobile_App -Denv=QA -Dbrowser_name=chrome "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/MobileApp-QAResults.html -Dsysteminfo.AppName=Demo-QA"
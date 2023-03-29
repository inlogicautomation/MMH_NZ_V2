package Happy_Path_Patient_Mobile_App.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/Happy_Path_Patient_Mobile_App"},
        monochrome = true,
        tags = "@HAPPY_PATH_MOBILE",
        glue = {"Happy_Path_Patient_Mobile_App", "Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class iOSMobileCukes extends AbstractTestNGCucumberTests {

}

//        clean test -Dapp=Happy_Path_Patient_Mobile_App -Drunner=iOSMobileCukes -Dexecution_type=webmobile -Dconfig=local_ios_iphone13 -Denv=QA -Dbrowser_name=chrome "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/MobileApp-QAResults.html -Dsysteminfo.AppName=Demo-QA"
package Happy_Path_Patient_Mobile_App.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/Happy_Path_Patient_Mobile_App"},
        monochrome = true,
        tags = "@Mobile_Appointment",
        glue = {"Happy_Path_Patient_Mobile_App", "Happy_Path_Patient_Web_and_MR","Happy_Path_Provider_Web"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class AndroidMobileCukes extends AbstractTestNGCucumberTests {

}

//       clean test -Dapp=Happy_Path_Patient_Mobile_App -Drunner=AndroidMobileCukes -Dexecution_type=webmobile -Dconfig=local_android_Poco_M2_Android_App -Denv=QA -Dbrowser_name=chrome "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/MobileApp-QAResults.html -Dsysteminfo.AppName=Demo-QA"
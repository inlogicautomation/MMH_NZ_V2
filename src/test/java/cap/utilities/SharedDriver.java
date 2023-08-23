package cap.utilities;

import cap.helpers.Constants;
import org.openqa.selenium.WebDriver;

/**
 * Created by codoid-pc on 6/5/2018.
 */

/** The share driver util is used to determine which Execution Type run in your program receives a run time.Like BROWSER,MOBILEVIEW,MOBILE */
public class SharedDriver {

    protected static WebDriver driver;
    protected static WebDriver mobileDriver;
    protected static WebDriver windowsDriver;
    public static long randomID;
    public static String strExecutionID;

/**  Using this method, get a Windows driver. A run time is assigned to each execution type that runs in your program. Like BROWSER,MOBILEVIEW,MOBILE */
    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getWindowDriver() {
        return windowsDriver;
    }
    /**  Using this method, get a Mobile driver.A run time is assigned to each execution type that runs in your program */
    public static WebDriver getMobileDriver() {
        return mobileDriver;
    }


    static {
        strExecutionID = RandomGeneratorUtil.getRandomString();
        TestDataUtil.loadData(Constants.TESTDATA_PATH, System.getProperty(Constants.ENV_VARIABLE_APPLICATION));
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        System.out.println("\n >> Execution String: " + strExecutionID);

        if (strExecutionType.equalsIgnoreCase("BROWSER")
                || strExecutionType.equalsIgnoreCase("MOBILEVIEW")
                || strExecutionType.equalsIgnoreCase("TABLETVIEW")) {

            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WeDriver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("MOBILE")) {
            // Mobile Driver
            mobileDriver = DriverUtil.getMobileDriver();
            System.out.println("<----------------------Mobile Driver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("WINDOWS")) {
            // Windows Driver
            windowsDriver = DriverUtil.getWindowDriver();
            System.out.println("<----------------------Window Driver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("BOTH")) {
            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WebDriver is launched---------------------->");
            // Windows Driver
            windowsDriver = DriverUtil.getWindowDriver();
            System.out.println("<----------------------Window Driver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WebDriver is launched---------------------->");

            // Mobile Driver
            mobileDriver = DriverUtil.getMobileDriver();
            System.out.println("<----------------------Mobile Driver is launched---------------------->");



        } else if (strExecutionType.equalsIgnoreCase("API")) {
            System.out.println("<------------- API Suite started... ------------->");
        }
    }

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
            if (strExecutionType.equalsIgnoreCase("BROWSER")) {
                driver.quit();
            } else if (strExecutionType.equalsIgnoreCase("MOBILE"))
                mobileDriver.quit();
            else if (strExecutionType.equalsIgnoreCase("WINDOWS"))
                windowsDriver.quit();
            else if (strExecutionType.equalsIgnoreCase("BOTH")) {
                driver.quit();
                windowsDriver.quit();
            } else if (strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
                driver.quit();
                mobileDriver.quit();
            } else if (strExecutionType.equalsIgnoreCase("MOBILEVIEW")) {
                driver.quit();
                mobileDriver.quit();
            } else if(strExecutionType.equalsIgnoreCase("API")){
                System.out.println("<------------- API Suite Completed... ------------->");
            }
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    /*public SharedDriver(){
        super(driver);
        //driver = getDriver();

    }*/

}

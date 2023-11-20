package cap.helpers;

import java.awt.event.KeyEvent;
import java.io.File;


public class Constants {

    public static final String ENV_VARIABLE_EXECUTION_TYPE = "execution_type";
    public static final String ENV_VARIABLE_CONFIG = "config";
    public static final String ENV_VARIABLE_BROWSER_NAME = "browser_name";
    public static final String ENV_VARIABLE_ENVIRONMENT = "env";
    public static final String ENV_VARIABLE_APPLICATION = "app";
    public static final String ENV_VARIABLE_MOBILE = "mobile";
    public static final String ENV_VARIABLE_WINDOW = "window";


    //Folders
    public static final String CONFIG_FOLDER = "config";
    public static final String DRIVERS_FOLDER = "drivers";
    public static final String DOWNLOADS_FOLDER = "downloads";
    public static final String TESTDATA_FILE = "testdata";
    public static final String REPORTS_FOLDER = "reports";

    public static final String TESTDATA_FIELDS = "KEY";


    public static final String ENV_VARIABLE_REMOTE_IP = "remote_ip";
    public static final String ENV_VARIABLE_REMOTE_PORT = "remote_port";

    public static final String IMAGES_FOLDER = "images";
    public static final String TEST_DATA_FOLDER = "testdata";
    public static final String FLOORPLAN_FOLDER = "Floorplan";
    public static final String DRAG_AND_DROP_FOLDER = "DragandDrop";
    public static final String IMAGE_COMPARISON_FOLDER = "ImageComparison";
    public static final String DOUBLE_CLICK_IMAGES = "doubleClickImages";

    //Windows
    public static final String WINAPP_LOCAL_IP = "127.0.0.1";
    public static String WINAPP_LOCAL_PORT = "4723";

    //Platform
    public static final String ANDROID = "Android";
    public static final String IOS = "iOS";
    public static final String APPIUM_LOCAL_IP = "0.0.0.0";
    public static String APPIUM_LOCAL_PORT = "4723";

    public static final String REMOTE = "remote";
    public static final String LOCAL = "local";

    //WaitTimes
    public static final String OBJECT_WAIT_TIME = "object_wait_time";
    public static final String WAIT_NUMBER = "wait_number";


    //Drivers
    public static final String GECKO_DRIVER_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "geckodriver.exe";
    public static final String CHROME_DRIVER_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "chromedriver.exe";
    public static final String IE_DRIVER_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "IEDriverServer1.exe";
    public static final String EDGE_DRIVER_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "msedgedriver.exe";

    //Drivers mac
    public static final String GECKO_DRIVER_MAC_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "geckodriver_mac";
    public static final String CHROME_DRIVER_MAC_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "chromedriver";
    public static final String IE_DRIVER_MAC_PATH = CONFIG_FOLDER + "/" + DRIVERS_FOLDER + "/" + "IEDriverServer1.exe";

    //Testdata
    public static final String TESTDATA_PATH = CONFIG_FOLDER + "/" + TESTDATA_FILE + "/" + TESTDATA_FILE + ".xlsx";
    public static final String TESTDATA_PATH_TO = CONFIG_FOLDER + "/" + TESTDATA_FILE + "/";
    public static final String RANDOM_STRING = "_RANDOM";
    public static final String PREDATA = "predata";

    public static final String MAC = "MAC";
    public static final String WINDOWS = "WIN";

    //Downloads
    public static final String DOWNLOAD_PATH = CONFIG_FOLDER + File.separator + DOWNLOADS_FOLDER + File.separator;

    //Keys
    public static final int ROBO_KEY_ENTER = KeyEvent.VK_ENTER;
    public static final int ROBO_KEY_TAB = KeyEvent.VK_TAB;

    //Date
    public static final String DATE_FORMAT = "MMMM d, yyyy";
    public static final String KOBITONURL = "Codoid::QA_KobitonURL";
    public static final String WINAPP_DRIVER_EXE_DIRECTORY = "C:/Program Files (x86)/Windows Application Driver/WinAppDriver.exe";


    public static final String BASE_URI = "https://www.boursakuwait.com.kw/";


}

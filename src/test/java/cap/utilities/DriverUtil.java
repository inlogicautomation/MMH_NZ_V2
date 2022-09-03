package cap.utilities;

import cap.helpers.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by codoid-pc on 6/20/2018.
 */
public class DriverUtil {

    public static DesiredCapabilities capability = null;

    public static WebDriver getDriver() {

        WebDriver driver = null;
//        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        String strConfig = System.getProperty(Constants.ENV_VARIABLE_CONFIG, "");
//        String strEnvironment = "";
//        if (strExecutionType.equalsIgnoreCase("BROWSER")) {
        String strBrowser = System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME, "");
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");

        if (strConfig.isEmpty() || strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
            driver = getLocalDriver(strBrowser);
            driver.manage().window().maximize();
        } else if (strConfig.equalsIgnoreCase("remote")) {
            try {
                URL url = new URL("http://172.25.192.1:4545/wd/hub");

                ChromeOptions options = new ChromeOptions();
                //	options.addArguments("--start-maximized");
                options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
                options.addArguments("chrome.switches", "--disable-extensions");
                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("credentials_enable_service", false);
                chromePrefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", chromePrefs);

                driver = new RemoteWebDriver(url, options);
            } catch (Exception ex) {
                System.out.println("Exception for Remote Execution : " + ex.getMessage());
            }
        }

        return driver;
    }

    public static WebDriver getMobileDriver() {
        WebDriver driver = null;
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        String strConfig = System.getProperty(Constants.ENV_VARIABLE_CONFIG, "");
        if (!strConfig.isEmpty()) {
            capability = getCapability(strExecutionType, strConfig, "");
            driver = getAppiumDriver(capability);
        } else {
            System.out.println("\nCAP Fatal Error : Please provide Config E.g. -Dconfig=testobject_android_LG_Nexus_5X_Free");
            System.exit(0);
        }
        return driver;
    }

    public static WebDriver getWindowDriver() {
        WebDriver driver = null;
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        String strConfig = System.getProperty(Constants.ENV_VARIABLE_CONFIG, "");
        if (!strConfig.isEmpty()) {
            capability = getCapability(strExecutionType, strConfig, "");
            driver = getWinAppDriver(capability);
            System.out.println(driver);
        } else {
            System.out.println("\nCAP Fatal Error : Please provide Config E.g. -Dconfig=local_window");
            System.exit(0);
        }
        return driver;
    }


    private static WebDriver getLocalDriver(String strBrowserName) {
        WebDriver driver = null;
        String strExecutionView = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        try {
            final String osName = OSValidator.getOSName();
            System.out.println(osName);

            switch (strBrowserName) {
                case "firefox":

                    if (osName.toUpperCase().equals(Constants.MAC)) {
                        System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_MAC_PATH);
                    } else {
                        System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                    }

                    driver = new FirefoxDriver(firefoxOptions());
                    break;
                case "chrome":
                    if (osName.toUpperCase().equals(Constants.MAC)) {
                        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_MAC_PATH);
                    } else {
                        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                    }
                    if ("mobileview".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForMobileView());
                    } else if ("tabletview".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForTabletView());
                    } else {
                        driver = new ChromeDriver(chromeCapabilities());
                        driver.manage().window().maximize();
                    }
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER_PATH);
                    driver = new InternetExplorerDriver(ieCapabilities());
                    break;

                case "safari":
                    driver = new SafariDriver(safariCapabilities());
                    break;

                case "edge":
                    if(osName.toUpperCase().equals(Constants.MAC)){
                        System.setProperty("webdriver.edge.driver", Constants.EDGE_DRIVER_PATH);
                    }else{
                        System.setProperty("webdriver.edge.driver", Constants.EDGE_DRIVER_PATH);
                    }

                    driver = new EdgeDriver();
                    break;

                default:
                    if (osName.toUpperCase().equals(Constants.MAC)) {
                        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_MAC_PATH);
                    } else {
                        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                    }
                    driver = new ChromeDriver(chromeCapabilities());
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(new StringBuilder().append("\nCAP Fatal Error : ").append(e.getMessage()));
        }

        return driver;
    }


    public static DesiredCapabilities getCapability(String strExecutionType, String strConfig, String strBrowser) {
        DesiredCapabilities capability = new DesiredCapabilities();
        Properties config_prop = new Properties();
        InputStream config_inputStream = null;
        System.out.println("\n Enter :: getCapability :: Type : " + strExecutionType + "\n Config: " + strConfig);
        switch (strExecutionType) {
            case "mobile":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_MOBILE)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                        System.out.println(key +" : "+ value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;
            case "webmobile":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_MOBILE)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                        System.out.println(key + value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;


            case "WINDOWS":
                System.out.println(" - Caps - Windows");
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_WINDOW)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;

            case "both":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_WINDOW)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;
        }
        return capability;
    }


    public static WebDriver getWinAppDriver(DesiredCapabilities capability) {
        WebDriver driver = null;
        try {
            //Need to start WinApp driver exe file.
            //     startWinAppDriver();

            String strRemoteIP = System.getProperty(Constants.ENV_VARIABLE_REMOTE_IP, "");
            String strRemotePort = System.getProperty(Constants.ENV_VARIABLE_REMOTE_PORT, "");

            if (strRemoteIP.isEmpty()) {
                strRemoteIP = Constants.WINAPP_LOCAL_IP;
            }

            if (strRemotePort.isEmpty()) {
                strRemotePort = Constants.WINAPP_LOCAL_PORT;
            }
            System.out.println(">> Remote IP: " + strRemoteIP + "\n>> Port No:" + strRemotePort);
            String strURL = new StringBuilder()
                    .append("http://")
                    .append(strRemoteIP)
                    .append(":")
                    .append(strRemotePort)
                    .append("/")
                    .toString();
//            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capability);
            driver = new WindowsDriver(new URL(strURL), capability);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(new StringBuilder().append("\nCheck WinAppDriver is running ? "));
            System.out.println(new StringBuilder().append("\nCAP Fatal Error : ").append(e.getMessage()));
            System.exit(0);
        }
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver getAppiumDriver(DesiredCapabilities capability) {
        WebDriver driver = null;
        try {

            String strRemoteIP = System.getProperty(Constants.ENV_VARIABLE_REMOTE_IP, "");
            String strRemotePort = System.getProperty(Constants.ENV_VARIABLE_REMOTE_PORT, "");
            System.out.println("");
            if (strRemoteIP.isEmpty()) {
                strRemoteIP = Constants.APPIUM_LOCAL_IP;
            }

            if (strRemotePort.isEmpty()) {
                strRemotePort = Constants.APPIUM_LOCAL_PORT;
            }
            String strURL = "";
            if (System.getProperty(Constants.ENV_VARIABLE_CONFIG, "").contains("remote_")) {
                System.out.println("\n enter if... remote Execut");
                /*String USERNAME = "dineshn_1gY3Ft";
                String AUTOMATE_KEY = "MRFxtxpyyzbpg8p6rfKB";*/
                String USERNAME = "patrickfernandez2";
                String AUTOMATE_KEY = "YeVMjcoDUTGYkx7zkXMj";
                strURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
                System.out.println("URL   " + strURL);
                // strURL = new StringBuilder().append(Constants.KOBITONURL).toString();
                int connectionTimeout = 20 * 60 * 1000;
                int socketTimeout = 90 * 1000;

                // ApacheHttpClient.Factory clientFactory = new ApacheHttpClient.Factory(new HttpClientFactory(connectionTimeout, socketTimeout));
                // AppiumCommandExecutor executor = new AppiumCommandExecutor(new HashMap<String, AppiumCommandInfo>(), new URL(strURL));


            } else {
                strURL = new StringBuilder()
                        .append("http://")
                        .append(strRemoteIP)
                        .append(":")
                        .append(strRemotePort)
                        .append("/wd/hub")
                        .toString();
            }
            if (capability.getPlatform().toString().equalsIgnoreCase(Constants.ANDROID.toUpperCase())) {
                driver = new AndroidDriver(new URL(strURL), capability);

            } else if (capability.getPlatform().toString().equalsIgnoreCase(Constants.IOS.toUpperCase())) {
                driver = new IOSDriver(new URL(strURL), capability);
            }
            System.setProperty("PLATFORM", capability.getPlatform().toString().toUpperCase());
            System.out.println(">>> Check Paltform Name >> >> " + System.getProperty("PLATFORM"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(new StringBuilder().append("\nCAP Fatal Error : ").append(e.getMessage()));
            System.exit(0);
        }

        return driver;
    }

    public static DesiredCapabilities safariCapabilities() {
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
//        SafariOptions options = new SafariOptions();
//        options.setCapability("dataDir", strDownloadLocation);
//        DesiredCapabilities dc = new DesiredCapabilities().safari();
//        dc.setCapability(SafariOptions.CAPABILITY, options);
//        SafariOptions options = new SafariOptions();
//
//        options.setCapability("SafariOptions.DATA_DIR",strDownloadLocation);
        SafariOptions safariOptions = new SafariOptions();
//        safariOptions.useCleanSession(true);
        safariOptions.setCapability("dataDir", strDownloadLocation);

        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setCapability(SafariOptions.CAPABILITY, safariOptions);

        return capabilities;
    }

    public static ChromeOptions chromeCapabilities() {

        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);

        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");

        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");
        //  options.addArguments("chrome.switches", "--disable-extensions");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", chromePrefs);

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static FirefoxOptions firefoxOptions() throws Exception {
        FirefoxOptions options = new FirefoxOptions();
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();

        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.manager.showWhenStarting", false);
        //Set downloadPath
        options.addPreference("browser.download.dir", strDownloadLocation);
        //Set File Open &amp; Save preferences
//        options.addPreference("browser.helperApps.neverAsk.saveToDisk",
//                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;application/vnd.ms-excel;text/html;message/rfc822;");
//        options.addPreference("browser.helperApps.neverAsk.openFile",
//                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;application/vnd.ms-excel;text/html;message/rfc822;");

        options.addPreference("browser.helperApps.neverAsk.openFile",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml;text/html;message/rfc822;application/octet-stream;");
        options.addPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml;text/html;message/rfc822;application/octet-stream;");

        options.addPreference("browser.download.manager.showWhenStarting", false);
        options.addPreference("pdfjs.disabled", true);
        options.addPreference("browser.helperApps.alwaysAsk.force", false);
        options.addPreference("browser.download.manager.alertOnEXEOpen", false);
        options.addPreference("browser.download.manager.focusWhenStarting", false);
        options.addPreference("browser.download.manager.useWindow", false);

        options.addPreference("browser.download.manager.showAlertOnComplete", false);
        options.addPreference("browser.download.manager.closeWhenDone", false);
        return options;
    }

    public static InternetExplorerOptions ieCapabilities() {
        InternetExplorerOptions options = new InternetExplorerOptions();

        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        options.enablePersistentHovering();
        options.takeFullPageScreenshot();
        //  options.disableNativeEvents();
        options.requireWindowFocus();
        options.setCapability("ignoreProtectedModeSettings", true);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

        return options;
    }

    public static EdgeOptions edgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        return options;
    }

    public static ChromeOptions chromeCapabilitiesForMobileView() {
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");
        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", chromePrefs);
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static ChromeOptions chromeCapabilitiesForTabletView() {
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");
        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("height", 1024);
        deviceMetrics.put("width", 768);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

}

package cap.utilities;

import cap.helpers.Constants;


public class WindowsProcessUtil {

    public static Process process = null;

    public static Process OpenControlPanelPage() {
        Process process = null;
        try {
            ProcessBuilder pb = new ProcessBuilder(new String[]{"cmd.exe", "/c", "control printers"});
            process = pb.start();
            Thread.sleep(6767);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return process;
    }
/**   The startTimeZoneProcess Method is used to change your time zone while the programme is running. such as New Land Time Zone,*/

    public static Process startTimeZoneProcess(String strTimeZone) {
        Process pb = null;
        try {
            ProcessBuilder process = new ProcessBuilder("C:\\Windows\\System32\\tzutil.exe", "/s", strTimeZone);
            pb = process.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pb;
    }


    /**   The stopProcess Method is used to stop the startTimeZoneProcess*/
    public static void stopProcess(Process pb) {
        try {
            pb.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopWinAppDriverProcess() {
        try {
            process.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void startWinAppDriver() {
        try {
            System.out.println("\n >>> Enter :: WIN Process > startWinAppDriver...");
            String strDriverDirectory = Constants.WINAPP_DRIVER_EXE_DIRECTORY;
            ProcessBuilder builder = new ProcessBuilder(strDriverDirectory).inheritIO();
            process = builder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

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

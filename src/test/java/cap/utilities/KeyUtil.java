package cap.utilities;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;




public class KeyUtil {

    public static void copyToClipboard(File strFiletoUploadPath) {
        StringSelection stringSelection= new StringSelection(strFiletoUploadPath.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    /**The keyUtil used for control in your system "Key Board Actions." */

    public static void uploadFileInMACChrome() {
        try {
            Robot robot = new Robot();
            robot.delay(1000);
            //Open Goto window
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_G);
            //Paste the clipboard value
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_V);
            //Press Enter key to close the Goto window and Upload window
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void uploadFileInMACFirfox() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(1000);
            //Open Goto window
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_G);
            //Paste the clipboard value
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_V);
            //Press Enter key to close the Goto window and Upload window
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void uploadFileInWindows() {
        try {
            Robot robot = new Robot();
            robot.delay(1000);
            //Paste the clipboard value
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            //Press Enter key to close the Goto window and Upload window
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);

        } catch (Exception e){
            e.printStackTrace();
        }
    }


}

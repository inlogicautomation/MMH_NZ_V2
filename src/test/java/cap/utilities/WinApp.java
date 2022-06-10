package cap.utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WinApp {

    private static WindowsDriver driver = null;
    private static WebElement CalculatorResult = null;

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        System.out.println("\n >>> ");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //   capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        capabilities.setCapability("app", "54989IsmaelEstalayoMena.CoinBaseUnofficial_89h962p81ezx6!App");
        // capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\Office16\\EXCEL.exe");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(4855);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        System.out.println(" get Wind name: " + driver.getTitle());
        System.out.println("\n >>> BLN : BTC: " +
                driver.findElement(By.name("BTC")).isDisplayed());


        System.out.println("\n >>> BLN : BTC: " + driver.findElement(By.name("BTC")).getText());
        System.out.println("\n >>> BLN : ETH: " + driver.findElement(By.name("ETH")).getText());
        System.out.println("\n >>> BLN : LTC: " + driver.findElement(By.name("LTC")).getText());
        System.out.println("\n >>> BLN : XRP: " + driver.findElement(By.name("XRP")).getText());
        System.out.println("\n >>> BLN : XRP: " + driver.findElement(By.name("XRP")).getText());

        Thread.sleep(555);

        driver.findElement(By.name("Coins")).click();
        Thread.sleep(555);

        driver.findElement(By.name("Search")).click();
        Thread.sleep(555);

        driver.findElement(By.name("Search")).sendKeys("Shiba");
        Thread.sleep(555);
        driver.findElement(By.name("SHIB")).click();
        Thread.sleep(555);

        System.out.println("\n >>> BLN : Shiba Inu: " + driver.findElement(By.name("Shiba Inu")).getText());
        Thread.sleep(555);

        System.out.println("\n >>> BLN : Add new purchase BTN : " +
                driver.findElement(By.name("Add new purchase")).isDisplayed());
        driver.findElement(By.name("Add new purchase")).click();

        System.out.println("\n >>> BLN : NEW TRANSACTION : " +
                driver.findElement(By.name("NEW TRANSACTION")).isDisplayed());

        Thread.sleep(555);

        driver.findElement(By.name(" Quantity")).click();
        Thread.sleep(555);

        driver.switchTo().activeElement().clear();
        driver.switchTo().activeElement().sendKeys("1111");
        Thread.sleep(555);

        driver.findElement(By.name(" Cost")).click();
        Thread.sleep(555);

        driver.switchTo().activeElement().clear();
        driver.switchTo().activeElement().sendKeys("1001");

        Thread.sleep(1155);

        driver.findElement(By.name("Cancel")).click();
        Thread.sleep(855);


        driver.findElement(By.name(" Quantity")).click();
        Thread.sleep(555);

        driver.switchTo().activeElement().clear();
        driver.switchTo().activeElement().sendKeys("1111");
        Thread.sleep(555);

        driver.findElement(By.name(" Cost")).click();
        Thread.sleep(555);

        driver.switchTo().activeElement().clear();
        driver.switchTo().activeElement().sendKeys("1001");

        Thread.sleep(1155);

        driver.findElement(By.name("Cancel")).click();


        driver.findElement(By.name("Settings")).click();
        Thread.sleep(755);
        driver.findElement(By.name("About")).click();
        Thread.sleep(555);
        System.out.println("\n >>> BLN : About me : " +
                driver.findElement(By.name("About me")).isDisplayed());

        Thread.sleep(855);


        driver.findElement(By.name("Settings")).click();

        //TextBlock[@name='BTC']
//TextBlock[@name='BTC']/following-sibling::/TextBlock[1]

        /*System.out.println("\n >>> BLN : " +
                driver.findElement(By.name("Microsoft Office Activation Wizard")).isDisplayed());
        Thread.sleep(2555);

        driver.findElement(By.xpath("//Button[@Name='Close']")).click();
        Thread.sleep(1555);
        System.out.println("\n >>> BLN : Featured :: " +
                driver.findElement(By.name("Featured")).isDisplayed());

        driver.findElement(By.name("Blank workbook")).click();
        Thread.sleep(2555);
        System.out.println("\n >>> BLN : HEADING EXCEL :: " +
                driver.findElement(By.name("Book1 - Excel (Product Activation Failed)")).isDisplayed());

        driver.findElement(By.name("Insert")).click();
        Thread.sleep(855);
        driver.findElement(By.name("Table")).click();


        System.out.println("driver.getWindowHandles() :: " + driver.getWindowHandles().size());
        System.out.println("" + driver.getTitle());
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        System.out.println("After Switch 0 to 1 :: " + driver.getTitle());

        System.out.println("\n >>> BLN : Create Table :: " +
                driver.findElement(By.name("Create Table")).isDisplayed());

        driver.findElement(By.name("=$A$1")).click();
        Thread.sleep(855);
        // Name:	"=$A$1"    or     ClassName:	"EDTBX"

        driver.findElement(By.name("=$A$1")).clear();
        driver.switchTo().activeElement().sendKeys("=$B$4:$D$7");
        Thread.sleep(855);
        driver.findElement(By.name("OK")).click();
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        System.out.println("\n >>> After Table Creation : BLN : " +
                driver.findElement(By.name("B4")).isDisplayed());

        System.out.println("\n >>> After Table Creation :: " +
                driver.findElement(By.name("B4")).getText());*/
        //    Name:	"B4"
        //   Name:	"C4"
        //   Name:	"D4"
    }

    @Test
    public static void killNotepad() {
        try {
            ProcessBuilder pb = new ProcessBuilder(new String[]{"cmd.exe", "/c", "Taskkill /IM Cryto tracker.exe /F"});
            Process p = pb.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

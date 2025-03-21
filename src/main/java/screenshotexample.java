import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class screenshotexample {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        Thread.sleep(2000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("/Users/remitbee/sample/firstscreenshot.png");
        Files.copy(screenshot.toPath(), destination.toPath());

        System.out.println("Screenshot saved at: " + destination.getAbsolutePath());


        driver.quit();
    }
}






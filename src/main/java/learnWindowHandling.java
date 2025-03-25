import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class learnWindowHandling {
    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //window handle
            driver.get("https://letcode.in/window");
            String windowhandle = driver.getWindowHandle();
            System.out.println("firtswindow: " + windowhandle);

            //going to home page
            driver.findElement(By.id("home")).click();

            // window handles
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println(windowHandles);

            List<String> list = new ArrayList<String>(windowHandles);
            driver.switchTo().window(list.get(1));
            System.out.println(driver.getCurrentUrl());

            //closing parentWindow
            driver.switchTo().window(list.get(0));
            driver.close();







    }
}

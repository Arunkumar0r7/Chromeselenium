import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement simpleAlertBox= driver.findElement(By.id("accept"));
        simpleAlertBox.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        WebElement confirmbox = driver.findElement(By.id("confirm"));
        confirmbox.click();
        Alert alert1=driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.dismiss();

        WebElement promptBox = driver.findElement(By.id("prompt"));
        promptBox.click();
        Alert promptBox1 = driver.switchTo().alert();
        promptBox1.sendKeys("Arun Kumar");
        Thread.sleep(3000);
        promptBox1.accept();

    }
}

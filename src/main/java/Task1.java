import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.get("https://www.cp.wisecapitals.com/");

        WebElement LoginButtonbox = driver.findElement(By.id("log-in"));
        LoginButtonbox.click();

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("remittest@gmail.com");

        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("Remy@ru17");

        WebElement loginButton = driver.findElement(By.id("save-changes"));
        loginButton.click();

        WebElement phonenumber = driver.findElement(By.id("cus_phone1"));
        phonenumber.sendKeys("9104001950");

        WebElement sendcodeButton = driver.findElement(By.id("send-code"));
        sendcodeButton.click();






    }
}

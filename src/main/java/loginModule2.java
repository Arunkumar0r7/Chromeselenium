import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginModule2 {
    public static void main(String[] args)throws  InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.cp.wisecapitals.com/");

        WebElement LoginButtonbox = driver.findElement(By.id("log-in"));
        LoginButtonbox.click();

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("remittest11221@gmail.com");

        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("Remy@ru17");

        WebElement loginButton = driver.findElement(By.id("save-changes"));
        loginButton.click();

        Thread.sleep(3000);

        /// verficaion code
        WebElement input1 = driver.findElement(By.id("code-1"));
        input1.sendKeys("2");
        WebElement input2 = driver.findElement(By.id("code-2"));
        input2.sendKeys("1");
        WebElement input3 = driver.findElement(By.id("code-3"));
        input3.sendKeys("4");
        WebElement input4 = driver.findElement(By.id("code-4"));
        input4.sendKeys("3");
        WebElement input5 = driver.findElement(By.id("code-5"));
        input5.sendKeys("6");
        WebElement input6 = driver.findElement(By.id("code-6"));
        input6.sendKeys("5");


        WebElement verifyButton = driver.findElement(By.id("verify_code"));
        verifyButton.click();


        WebElement remitbeebutton = driver.findElement(By.id("fullname"));
        Thread.sleep(2000);
        remitbeebutton.click();


        WebElement logout = driver.findElement(By.xpath("//*[@id='user-menu-Logout']/div/div"));
        Thread.sleep(2000);
        logout.click();

    }
}

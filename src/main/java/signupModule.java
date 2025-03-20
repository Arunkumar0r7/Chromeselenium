import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class signupModule {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.cp.wisecapitals.com/");

        WebElement signupButtonbox = driver.findElement(By.id("sign-up"));
        signupButtonbox.click();

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("remittest5555555@gmail.com");

        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("Remy@ru17");

        WebElement signupButton = driver.findElement(By.xpath("//*[@id='sign-up']"));
        signupButton.click();

       WebElement phonenumber = driver.findElement(By.id("cus_phone1"));

       phonenumber.sendKeys("9704001950");

        WebElement sendcodeButton = driver.findElement(By.id("send-code"));
        sendcodeButton.click();

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

        Thread.sleep(2000);

        WebElement verifyButton = driver.findElement(By.id("verify-code"));
        verifyButton.click();
        /// personal box
        WebElement personolbox = driver.findElement(By.id("personal"));
        personolbox.click();

        WebElement sendmoneyBox = driver.findElement(By.id("send-money"));
        sendmoneyBox.click();
        Thread.sleep(2000);

        WebElement backButton = driver.findElement(By.id("btn-back"));
        backButton.click();

//        WebElement exchangeBox = driver.findElement(By.id("exchange"));
//        exchangeBox.click();
//        Thread.sleep(2000);
//
//        WebElement backButton2 = driver.findElement(By.id("btn-back"));
//        backButton.click();
//
//        WebElement imsbox = driver.findElement(By.id("bill"));
//        backButton2.click();
//        Thread.sleep(2000);
//
//        WebElement backButton3 = driver.findElement(By.id("btn-back"));
//        backButton3.click();
        WebElement decidelaterButton = driver.findElement(By.id("decide-later"));
        decidelaterButton.click();


    }
}

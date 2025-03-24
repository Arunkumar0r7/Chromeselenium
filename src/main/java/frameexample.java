import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameexample {
    public static void main(String[] args){

        WebDriver driver =new ChromeDriver();
        driver.get("https://letcode.in/frame");
        //doing with xpath
        WebElement myframe = driver.findElement(By.xpath("//iframe[@src='frameui']"));
        driver.switchTo().frame(myframe);

        /// with iframe id
//        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Arun");
        driver.findElement(By.name("lname")).sendKeys("Kumar");

        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("Test@123");

        // retrive to parentframe
        driver.switchTo().parentFrame();
        driver.findElement(By.name("lname")).sendKeys("kanniappan");





    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdownexample {

    public static void main(String[] args)throws  InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement Dropdownbox = driver.findElement(By.id("fruits"));
        Dropdownbox.click();

        Dropdownbox.click();

        Select select = new Select(Dropdownbox);
        select.selectByVisibleText("Apple");


//        select.selectByValue("1");
//
//
//        select.selectByIndex(3);

//        List<WebElement> listOfOptions = select.getOptions();
//       int size = listOfOptions.size();
//        System.out.println("number cof elements :" + size);

        WebElement Multiselect = driver.findElement(By.
                xpath("//*[@id=\"superheros\"]"));
        Select Multiselectbox  = new Select(Multiselect);


        Multiselectbox.selectByIndex(0);
        Multiselectbox.selectByIndex(1);
        Multiselectbox.selectByIndex(2);
        Multiselectbox.selectByIndex(3);
        Multiselectbox.selectByIndex(4);


        Thread.sleep(3000);
        driver.close();
    }
}

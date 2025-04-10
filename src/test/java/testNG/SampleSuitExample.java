package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleSuitExample {

    @Test

    public void openGoole(){
      long starttime=  System.currentTimeMillis();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        long endtime = System.currentTimeMillis();

        long Totaltime = endtime-starttime;
        System.out.println("Total time taken " + Totaltime);
    }

    @Test
    public void OpenBing(){
        long starttime=  System.currentTimeMillis();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.bing.com/");

        long endtime = System.currentTimeMillis();

        long Totaltime = endtime-starttime;
        System.out.println("Total time taken " + Totaltime);
    }

    @Test
    public void OpenYahoo() {
        long starttime = System.currentTimeMillis();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mozilla.org/en-US/firefox/");
        long endtime = System.currentTimeMillis();

        long Totaltime = endtime - starttime;
        System.out.println("Total time taken " + Totaltime);

        driver.quit();

    }

}

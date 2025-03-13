package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editexample {
    public static void main(String[] args)throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");

        WebElement emailbox = driver.findElement(By.id("fullName"));
        emailbox.sendKeys("Test@gmail.com");

        driver.findElement(By.id("join")).sendKeys("Boy");

        WebElement getTexBox = driver.findElement(By.id("getMe"));
       String value = getTexBox.getAttribute("ortonikc");
        System.out.println(value);

       //WebElement clearbox = driver.findElement(By.id("clearMe"));
        WebElement clearbox = driver.findElement(By.xpath("//*[@id='clearMe']"));
       clearbox.clear();

       WebElement Disabledbox = driver.findElement(By.xpath("//*[@id='noEdit']"));
       Boolean enabled = Disabledbox.isEnabled();
        System.out.println(enabled);

        Thread.sleep(5000);
        driver.quit();
    }
}

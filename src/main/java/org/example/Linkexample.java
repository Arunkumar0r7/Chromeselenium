package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkexample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml");
       //driver.findElement(By.linkText("Go to Dashboard")).click();

        /// paritallinked text
        driver.findElement(By.partialLinkText(" Dashboard")).click();
    }
}

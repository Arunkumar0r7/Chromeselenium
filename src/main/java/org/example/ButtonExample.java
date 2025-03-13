package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
    public static void main(String[] args)throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/button");


        /// find the position

        WebElement GetpositionButton = driver.findElement(By.id("position"));
        Point xypoint = GetpositionButton.getLocation();
        int xvalue =xypoint.getX();
        int yvalue =xypoint.getY();
        System.out.println("x value is : "+ xvalue + " y value is : "+ yvalue);

        /// find the color

//        WebElement colorbutton = driver.findElement(By.id("color"));
//        String backGroundColor = colorbutton.getCssValue("backg")


        ///find the size

        WebElement sizeButton = driver.findElement(By.id("property"));
        int height =sizeButton.getSize().getHeight();
        int width= sizeButton.getSize().getWidth();
        System.out.println("Height is : "+ height + "width is : "+ width);


        /// go to home page
        WebElement HomeButton = driver.findElement(By.id("home"));
        Thread.sleep(2000);
        HomeButton.click();

    }
}

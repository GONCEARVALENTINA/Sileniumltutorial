package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalKeys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/key_presses");

        driver.findElement(By.id("target")).sendKeys(Keys.LEFT);
        Thread.sleep(2000);

        driver.findElement(By.id("target")).sendKeys(Keys.chord(Keys.CONTROL, "A"));
        Thread.sleep(2000);

    }
}


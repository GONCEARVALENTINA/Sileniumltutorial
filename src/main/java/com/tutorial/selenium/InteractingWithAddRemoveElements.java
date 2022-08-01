package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class InteractingWithAddRemoveElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);

        WebElement buttonAddElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        buttonAddElement.click();

        Thread.sleep(2000);

        WebElement buttonDelete = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        buttonDelete.click();



        driver.quit();
//
        }
}

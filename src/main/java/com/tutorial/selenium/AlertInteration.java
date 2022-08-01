package com.tutorial.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AlertInteration {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        //коллекция кнопок, создаем лист кнопок и находим по тэгнайму
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        //удостоверяемся ,что все три кнопки на месте
        if (buttons.size() == 3){
            //хотим кликать на последнюю кнопку с инд.2
           buttons.get(2).click();
        }
        //взаимодействуем с этой кнопкой. для этого создаем обьект
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());// возвращает текст , который есть на третьем бутоне
        Thread.sleep(3000);

        alert.sendKeys("Hello there!"); //вводим текст
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

//        driver.quit();
    }
}

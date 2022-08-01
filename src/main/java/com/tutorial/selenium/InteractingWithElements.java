package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class InteractingWithElements {
    public static void main(String[] args) {

        By searchResults = By.cssSelector("div[data-index='0']");

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        // создаем класс и поле
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        // в созданное поле вводит некий текст
        searchInput.sendKeys("Kindle");
        // выполняет ENTER
        searchInput.submit();


        searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.clear();//очистка прежнего ввода
        searchInput.sendKeys("Amazon Fire"); //ввод другого текста
        searchInput.submit(); //Нажатие ENTER



        WebElement products = driver.findElement(searchResults);//сбор результатов наших поисков в ЕЛЕМЕНТ
        System.out.println(products.getText());
        System.out.println(products.getAttribute("class"));


//        driver.quit();


    }
}

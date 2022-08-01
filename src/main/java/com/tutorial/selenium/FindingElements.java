package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        //создаем коллекцию товара ".a-cardui-body"(отбор по классу)
        List<WebElement> cards = driver.findElements(By.cssSelector(".a-cardui-body"));

        if (cards.size() > 0) //если в коллекции множество товара , то мы просим драйвер кликнуть по первому(индекс 0)
            cards.get(0).click();


        // иденфицируем единственный элимент
        WebElement someCard = driver.findElement(By.linkText("See more"));
        someCard.click();
//        driver.quit();
    }
}

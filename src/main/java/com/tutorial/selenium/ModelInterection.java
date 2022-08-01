package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelInterection {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");//ссылка

        //Get current window handle/Получить текущий дескриптор окна/закладка на текущее окно
        String currentWindow = String.valueOf(driver.getWindowHandle());
        driver.findElement(By.cssSelector("button[data-toggle='modal']")).click();
        Thread.sleep(3000);

        WebElement modal = driver.findElement(By.className("modal-body"));
        //собираем все страницы,
        for (String windowName : driver.getWindowHandles()) {
            if (!windowName.equals(currentWindow)){
                driver.switchTo().window(windowName);

                break;
            }

        }
//        modal.findElement(By.className("btn btn-default")).click();
//        modal.findElement(By.xpath("//*[@class='btn btn-default' and contains text, 'Close']")).click();

        modal.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")).click();

        Thread.sleep(3000);

        driver.switchTo().window(currentWindow);
       driver.quit();


    }

}
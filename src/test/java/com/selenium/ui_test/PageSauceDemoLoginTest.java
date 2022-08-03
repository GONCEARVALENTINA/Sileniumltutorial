package com.selenium.ui_test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSauceDemoLoginTest {
    private static WebDriver driver;
    private static final String URL = "https://www.saucedemo.com";
    private static final String EMAIL = "1968@mail.ru";
    private static final String PASS = "123456";

    @BeforeClass
    public static void setUp() {
        System.out.println("Seting web driver");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("Close alle tabs");
        driver.quit();
    }
    @Test
    public void PageSauceDemoLoginPageTest() {
        PageSauceDemoLoginPage LoginPage = new PageSauceDemoLoginPage(driver);

        LoginPage.login(EMAIL, PASS);
    }
}






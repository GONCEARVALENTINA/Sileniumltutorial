package com.selenium.ui_test;

import com.selenium.ui_test.LoginPage;
//import com.selenium.ui_test.PageSauceDemoLoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private static WebDriver driver;
    private static final String URL =  "https://www.browserstack.com/users/sign_in";

//    private static final String URL =  "https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html";
//    private static final String URL =  "https://www.saucedemo.com";
    private static final String EMAIL =  "EMAIL";
    private static final String PASS =  "LOGIN";
    @BeforeClass
    public static void setUp(){
        System.out.println("Seting web driver");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Close alle tabs");
        driver.quit();
    }
    @Test
    public void LoginTest(){
            LoginPage LoginPage = new LoginPage(driver);
////        PageFactoryLoginPage LoginPage = new PageFactoryLoginPage(driver)
//        PageSauceDemoLoginPage LoginPage = new PageSauceDemoLoginPage (driver);

          LoginPage.login(EMAIL, PASS);


//        PageSauceDemoLoginPage.login(EMAIL, PASS);




    }

}

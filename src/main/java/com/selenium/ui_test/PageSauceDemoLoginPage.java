package com.selenium.ui_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageSauceDemoLoginPage {
    private static WebDriver driver;
    private final By emailField = By.xpath("//*[@id=\"user-name\"]");
    private final By passField = By.xpath("//*[@id=\"password\"]");
    private static final By singInBtn = By.xpath("//*[@id=\"login-button\"]");

    public PageSauceDemoLoginPage(WebDriver driver) {
        this.driver = driver;}


    public  void login(String email, String password) {
        driver.findElement(emailField ).sendKeys(email);
        driver.findElement(passField ).sendKeys(password);
        driver.findElement(singInBtn).click();
    }


}

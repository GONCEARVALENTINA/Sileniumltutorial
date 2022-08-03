package com.selenium.ui_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static WebDriver driver;
    private final By emailField = By.id("user_email_login");
    private final By passlField = By.id("user_password");
    private final By signInBtn = By.id("user_submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;}

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passlField).sendKeys(password);
        driver.findElement(signInBtn).click();
    }
}
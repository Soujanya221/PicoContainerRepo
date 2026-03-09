package com.epam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By signIn = By.className("login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        driver.findElement(signIn).click();
    }
}

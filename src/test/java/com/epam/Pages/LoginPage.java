package com.epam.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="SubmitLogin")
    WebElement loginBtn;

    @FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
    WebElement errorMessage;

    @FindBy(className="logout")
    WebElement logoutBtn;

    @FindBy(className="account")
    WebElement accountName;



    // Methods

    public void enterEmail(String userEmail) {
        email.clear();
        email.sendKeys(userEmail);
    }

    public void enterPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public void verifyLoginSuccess() {

        if(accountName.isDisplayed()) {
            System.out.println("Login Successful");
        }
    }

    public void verifyLoginError() {

        if(errorMessage.isDisplayed()) {
            System.out.println("Login Failed");
        }
    }

    public void clickLogout() {
        logoutBtn.click();
    }

    public void verifyLogout() {

        if(loginBtn.isDisplayed()) {
            System.out.println("Logout Successful");
        }
    }
}

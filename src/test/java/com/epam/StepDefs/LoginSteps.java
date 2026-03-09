package com.epam.StepDefs;


import com.epam.Context.TestContext;
import com.epam.Pages.HomePage;
import com.epam.Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class LoginSteps {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    public LoginSteps(TestContext context) {

        driver = context.getDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @And("User enters valid email and password")
    public void user_enters_valid_email_and_password() {

        loginPage.enterEmail("validuser@gmail.com");
        loginPage.enterPassword("password123");
    }

    @And("User clicks login button")
    public void user_clicks_login_button() {

        loginPage.clickLogin();
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {

        loginPage.verifyLoginSuccess();
    }

    @And("User enters invalid credentials")
    public void user_enters_invalid_credentials() {

        loginPage.enterEmail("wrong@gmail.com");
        loginPage.enterPassword("wrongpass");
    }

    @Then("Error message should appear")
    public void error_message_should_appear() {

        loginPage.verifyLoginError();
    }

    @Given("User is logged in")
    public void user_is_logged_in() {

        homePage.clickSignIn();

        loginPage.enterEmail("validuser@gmail.com");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();
    }

    @When("User clicks logout")
    public void user_clicks_logout() {

        loginPage.clickLogout();
    }

    @Then("User should be logged out")
    public void user_should_be_logged_out() {

        loginPage.verifyLogout();
    }
}

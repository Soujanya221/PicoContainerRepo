package com.epam.StepDefs;


import com.epam.Context.TestContext;
import com.epam.Pages.HomePage;
import com.epam.Pages.LoginPage;
import com.epam.Pages.RegistrationPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;

    public RegistrationSteps(TestContext context) {
        driver = context.getDriver();
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
    }

    @Given("User launches the shopping website")
    public void user_launches_the_shopping_website() {

        // Website already opened in Hooks
    }

    @When("User clicks on Sign in")
    public void user_clicks_on_sign_in() {

        homePage.clickSignIn();
    }

    @And("User enters email to create account")
    public void user_enters_email_to_create_account() {

        String email = "user" + System.currentTimeMillis() + "@gmail.com";
        registrationPage.enterEmailForRegistration(email);
    }

    @And("User clicks create account button")
    public void user_clicks_create_account_button() {

        registrationPage.clickCreateAccount();
    }

    @And("User fills registration form")
    public void user_fills_registration_form() {

        registrationPage.fillRegistrationForm(
                "Soujanya",
                "Atkari",
                "password123"
        );
    }

    @And("User submits registration form")
    public void user_submits_registration_form() {

        registrationPage.submitRegistration();
    }

    @Then("Account should be created successfully")
    public void account_should_be_created_successfully() {

        registrationPage.verifyAccountCreated();
    }

    @And("User enters existing email")
    public void user_enters_existing_email() {

        registrationPage.enterEmailForRegistration("existinguser@gmail.com");
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {

        registrationPage.verifyRegistrationError();
    }
}
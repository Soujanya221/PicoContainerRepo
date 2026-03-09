package com.epam.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Locators

    @FindBy(id="email_create")
    WebElement emailCreate;

    @FindBy(id="SubmitCreate")
    WebElement createAccountBtn;

    @FindBy(id="id_gender1")
    WebElement genderMr;

    @FindBy(id="customer_firstname")
    WebElement firstName;

    @FindBy(id="customer_lastname")
    WebElement lastName;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="firstname")
    WebElement addressFirstName;

    @FindBy(id="lastname")
    WebElement addressLastName;

    @FindBy(id="address1")
    WebElement address;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="id_state")
    WebElement state;

    @FindBy(id="postcode")
    WebElement postcode;

    @FindBy(id="phone_mobile")
    WebElement mobile;

    @FindBy(id="submitAccount")
    WebElement registerBtn;

    @FindBy(className="info-account")
    WebElement successMessage;

    @FindBy(id="create_account_error")
    WebElement errorMessage;



    // Methods

    public void enterEmailForRegistration(String email) {
        emailCreate.sendKeys(email);
    }

    public void clickCreateAccount() {
        createAccountBtn.click();
    }

    public void fillRegistrationForm(String fName,String lName,String pass) {

        genderMr.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        password.sendKeys(pass);

        addressFirstName.clear();
        addressFirstName.sendKeys(fName);

        addressLastName.clear();
        addressLastName.sendKeys(lName);

        address.sendKeys("Hyderabad Street");
        city.sendKeys("Hyderabad");

        state.sendKeys("California");

        postcode.sendKeys("50001");

        mobile.sendKeys("9876543210");
    }

    public void submitRegistration() {
        registerBtn.click();
    }

    public void verifyAccountCreated() {

        if(successMessage.isDisplayed()) {
            System.out.println("Account Created Successfully");
        }
    }

    public void verifyRegistrationError() {

        if(errorMessage.isDisplayed()) {
            System.out.println("Registration Error Displayed");
        }
    }
}

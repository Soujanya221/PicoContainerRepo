package com.epam.Hooks;

import com.epam.Context.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    TestContext context;
    WebDriver driver;

    public hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        context.setDriver(driver);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

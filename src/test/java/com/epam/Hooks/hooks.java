package com.epam.Hooks;

import com.epam.Context.TestContext;
import com.epam.utils.ConfigReader;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hooks {

    TestContext context;
    WebDriver driver;

    public hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {

        String browser = ConfigReader.getBrowser();

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getBaseUrl());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

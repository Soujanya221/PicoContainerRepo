package com.epam.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features/registration.feature",
        glue={"com.epam.StepDefs","com.epam.Hooks"},
        plugin={"pretty","html:target/cucumber-report.html"},
        monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

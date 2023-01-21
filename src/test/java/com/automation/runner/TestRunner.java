package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//Login.feature",  // to slashes //
        glue = "com.automation.steps",                              // stick to cucumber steps...mapping
        plugin = {"html:html-report/report.html", "json:target/cucumber.json"},
        dryRun = false

)


public class TestRunner {
}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"stepdefs"},
        tags = "",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/cucumber.json"}
)

public class Runner extends AbstractTestNGCucumberTests {
}

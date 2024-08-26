package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Feature/login.feature"},
    glue = { "stepDefination", "myhooks"},
    plugin = {"pretty"})

public class Runner extends AbstractTestNGCucumberTests {

}








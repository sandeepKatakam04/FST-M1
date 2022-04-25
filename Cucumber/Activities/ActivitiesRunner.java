package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "C:\\Users\\002GTS744\\FST33_Cucumber\\src\\test\\java\\features",
        glue = {"stepDefinitions"},
        plugin = {"html: test-reports"},
        monochrome = true,
        tags = "@Activity1"
        )

public class ActivitiesRunner {

}

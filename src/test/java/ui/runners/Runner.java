package ui.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",  //in order to see the reports, you may need to run features from here
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features/ui_feature",
        glue = "src/test/java/ui/stepdefinitions",
        tags = "@excel",
        dryRun = false
)

public class Runner {

}

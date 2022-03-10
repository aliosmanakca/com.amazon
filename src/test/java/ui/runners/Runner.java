package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",  //in order to see the reports, you may need to run features from here
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features/ui_feature",
        glue = "ui/stepdefinitions",
        tags = "@TC_0201",
        dryRun = false
)

public class Runner {

}

package api.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Reports/htmlReport.html",
                "json:Reports/jsonReport.json"},
        features="src/test/resources/api_feature",
        glue="api/stepdefinitions",
        tags="@api",
        //dryRun=false,
        publish=true
)

public class ApiRunner {
}

package ui.stepdefinitions;

import cucumber.api.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import ui.pages.AmazonPage;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

public class StepDef1 {

    AmazonPage amazonPage = new AmazonPage();
    Logger log = (Logger) LogManager.getLogger(StepDef1.class);

    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Assert.assertTrue(amazonPage.amazonLogo.isDisplayed());

        log.info("main page is opened");

    }


}

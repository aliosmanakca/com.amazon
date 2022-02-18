package ui.stepdefinitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import ui.pages.AmazonPage;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

public class StepDef1 {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Assert.assertTrue(amazonPage.amazonLogo.isDisplayed());
    }


}

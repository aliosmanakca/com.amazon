package ui.stepdefinitions;


import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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


    @Given("user goes to amazon page jenkins")
    public void userGoesToAmazonPageJenkins() {

        // deactivate hooks class and try again

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com/");

        String expectedurl = "amazon";
        String actualurl = driver.getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedurl));

        System.out.println("jenkins worked");

    }
}

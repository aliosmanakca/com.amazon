package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.AmazonPage;
import ui.utilities.Driver;

import java.util.Random;

public class StepDef7 {
    AmazonPage amazonPage = new AmazonPage();
    String linkName = "";

    @Then("goes to the bottom of the page")
    public void goesToTheBottomOfThePage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END);
    }


    @And("click a link")
    public void clickALink() {
        Random random = new Random();
        int index = random.nextInt(amazonPage.linksAtTheBottom.size()-1);

        String unwantedPart = Driver.getDriver().findElement(By.xpath("(//td[@class='navFooterDescItem']//a//span)["+(index+1)+"]")).getText();
        linkName = amazonPage.linksAtTheBottom.get(index).getText().replaceAll(unwantedPart,"");
        linkName = linkName.replaceAll("[^a-zA-Z ]", "");

        amazonPage.linksAtTheBottom.get(index).click();
    }


    @Then("sees the correct page")
    public void seesTheCorrectPage() {
        if (Driver.getDriver().findElements(By.xpath("//meta[contains(@content, '"+linkName+"')]")).size()>0  ||  Driver.getDriver().findElements(By.xpath("//meta[contains(@content, '"+linkName.toLowerCase()+"')]")).size()>0 ) {
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }

    }



}

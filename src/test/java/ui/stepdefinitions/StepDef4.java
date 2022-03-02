package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.AmazonPage;
import ui.utilities.Driver;

import java.util.List;

public class StepDef4 {
    AmazonPage amazonPage = new AmazonPage();

    @Then("searches a keyword {string}")
    public void searchesAKeyword(String keyword) {
        amazonPage.searchBox.sendKeys(keyword + Keys.ENTER);
    }

    @And("results contain {string}")
    public void resultsContain(String keyword) {
        List<WebElement> products = Driver.getDriver().findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
        for (WebElement each : products) {
            if (  !(  each.getText().toLowerCase().contains(keyword.toLowerCase())  )  ) {
                System.out.println(each.getText());
                Assert.fail();
            }
        }

    }


}

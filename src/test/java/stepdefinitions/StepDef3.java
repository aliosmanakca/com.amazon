package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StepDef3 {
    AmazonPage amazonPage = new AmazonPage();

    @Then("clicks ALL button")
    public void clicks_ALL_button() {
        amazonPage.allButton.click();
        Driver.getDriver().findElement(By.xpath("(//div[text()='see all'])[1]")).click();
    }

    @And("randomly choose a category")
    public void randomlyChooseACategory() {
        List<WebElement> categories = new ArrayList<>();
        for (int i = 1; i<25; i++) {
            WebElement element = Driver.getDriver().findElement(By.xpath("(//ul[@class='hmenu hmenu-visible']//li/a)["+i+"]"));
            categories.add(element);
        }

        Random random = new Random();
        int index = random.nextInt(categories.size()-1);
        WebElement randomCategory = categories.get(index);
        randomCategory.click();

        List<WebElement> subCategories = Driver.getDriver().findElements(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//a"));

        Assert.assertTrue(subCategories.size()>0);
    }


}

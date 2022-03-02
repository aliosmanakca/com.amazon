package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.utilities.Driver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StepDefTxt {

    @And("fills the credentials from given text file {string} and {string}")
    public void fillsTheCredentialsFromGivenTextFileAnd(String filePath, String rownumber) throws IOException {

        String line = Files.readAllLines(Paths.get(filePath)).get(Integer.parseInt(rownumber)-1);

        if (filePath.contains("username")){
            WebElement usernameTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_email']"));
            usernameTab.sendKeys(line + Keys.ENTER);
        }
        if (filePath.contains("password")){
            WebElement passwordTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_password']"));
            passwordTab.sendKeys(line + Keys.ENTER);
        }

    }

    @Then("sees the alert")
    public void seesTheAlert() {
        WebElement alert = Driver.getDriver().findElement(By.className("a-alert-heading"));
        Assert.assertTrue(alert.isDisplayed());
    }
}

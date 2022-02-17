package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.Driver;

public class StepDef2 {

    AmazonPage amazonPage = new AmazonPage();

    @Then("clicks login button")
    public void clicksLoginButton() {
        amazonPage.loginButton.click();
    }

    @And("enters {string} for username and {string} for password")
    public void entersForUsernameAndForPassword(String username, String password) {
        WebElement usernameTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_email']"));
        usernameTab.sendKeys(username + Keys.ENTER);

        WebElement passwordTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_password']"));
        passwordTab.sendKeys(password + Keys.ENTER);

        WebElement alert = Driver.getDriver().findElement(By.className("a-alert-heading"));
        Assert.assertTrue(alert.isDisplayed());
    }


}

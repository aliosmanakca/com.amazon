package ui.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.AmazonPage;
import ui.utilities.Driver;
import ui.utilities.ExcelUtil;

public class StepDefExcel {
    AmazonPage amazonPage = new AmazonPage();

    @And("fills the credentials from given {string} and {string}")
    public void fillsTheCredentialsFromGivenAnd(String sheetname, String rownumber) {
        ExcelUtil excel = new ExcelUtil("src/test/resources/test_data/AmazonCredentials.xlsx",sheetname);
        String[][] data = excel.getDataArray();

        WebElement usernameTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_email']"));
        String username = data[Integer.parseInt(rownumber)][0];
        System.out.println(username);
        usernameTab.sendKeys(username + Keys.ENTER);

        WebElement passwordTab = Driver.getDriver().findElement(By.xpath("//input[@id='ap_password']"));
        String password = data[Integer.parseInt(rownumber)][1];
        System.out.println(password);
        passwordTab.sendKeys(password + Keys.ENTER);

        WebElement alert = Driver.getDriver().findElement(By.className("a-alert-heading"));
        Assert.assertTrue(alert.isDisplayed());
    }

}

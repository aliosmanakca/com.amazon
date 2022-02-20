package ui.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import ui.pages.AmazonPage;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StepDef6 {
    AmazonPage amazonPage = new AmazonPage();
    double total = 0;

    @Then("adds some products to the cart")
    public void addsSomeProductsToTheCart() throws InterruptedException {

        List<Double> pricesDouble = new ArrayList<>();

        for (int i = 0; i<3; i++) {
            String str = amazonPage.productPrices.get(i).getText().replaceAll("[^0-9]","");
            str = str.substring(0,str.length()-2) + "." + str.substring(str.length()-2);
            pricesDouble.add(Double.valueOf(str));

            amazonPage.productPrices.get(i).click();
            Thread.sleep(1500);
            if (Driver.getDriver().findElements(By.xpath("//span[@id='submit.add-to-cart']")).size()>0){
                Driver.getDriver().findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
                Thread.sleep(1500);
                Driver.getDriver().navigate().back();
            }
            Thread.sleep(1500);
            Driver.getDriver().navigate().back();
        }


        for (int i = 0; i< pricesDouble.size(); i++) {
            total += pricesDouble.get(i);
        }

    }


    @And("goes to the cart")
    public void goesToTheCart() {
        amazonPage.cartButton.click();
    }


    @Then("sees total price is correct")
    public void seesTotalPriceIsCorrect() {
        String subTotalStr = Driver.getDriver().findElement(By.cssSelector("#sc-subtotal-amount-activecart")).getText().replaceAll("[^0-9.]","");
        System.out.println(subTotalStr);

        double subTotal = Double.parseDouble(subTotalStr);

        Assert.assertTrue(subTotal==total);

    }



}

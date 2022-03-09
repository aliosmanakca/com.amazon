package ui.stepdefinitions;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.pages.AmazonPage;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class StepDef5 {
    AmazonPage amazonPage = new AmazonPage();

    @And("randomly choose a filter")
    public void randomlyChooseAFilter() {
        if (Driver.getDriver().findElements(By.xpath("//span[contains(text() , 'See more')]")).size()>0 ) {
            List<WebElement> list1 = Driver.getDriver().findElements(By.xpath("//span[contains(text() , 'See more')]"));
            for (WebElement each : list1) {
                each.click();
            }
        }

        if (Driver.getDriver().findElements(By.xpath("//span[contains(text() , 'See All')]")).size()>0) {
            List<WebElement> list2 = Driver.getDriver().findElements(By.xpath("//span[contains(text() , 'See All')]"));
            for (WebElement each : list2) {
                each.click();
            }
        }

        Random random = new Random();
        int index = random.nextInt(amazonPage.filters.size()-1);
        System.out.println(amazonPage.filters.get(index).getText());
        Assert.assertTrue(amazonPage.filters.get(index).isEnabled());
    }

    @And("clicks sort button")
    public void clicksSortButton() {
        amazonPage.sortButton.click();
    }

    @Then("clicks low to high")
    public void clicksLowToHigh() {
        Driver.getDriver().findElement(By.linkText("Price: Low to High")).click();
    }


    @And("sees products in ascending order")
    public void seesProductsInAscendingOrder() {
        List<String> sortedPricesStr = new ArrayList<>();

        for (int i = 0; i<amazonPage.productPrices.size(); i++) {
            sortedPricesStr.add(amazonPage.productPrices.get(i).getText().replaceAll("[^0-9.]",""));
        }

        ListIterator litr = sortedPricesStr.listIterator();
        while (litr.hasNext()) {
            String element = (String) litr.next();
            litr.set(element.substring(0,element.length()-2) + "." + element.substring(element.length()-2));
        }

        List<Double> pricesDouble = new ArrayList<>();
        for (int i = 0; i<sortedPricesStr.size(); i++) {
            pricesDouble.add(Double.valueOf(sortedPricesStr.get(i)));
        }

        boolean ascending = Ordering.natural().isOrdered(pricesDouble);
        Assert.assertTrue(ascending);

    }


    @Then("clicks high to low")
    public void clicksHighToLow() {
        Driver.getDriver().findElement(By.xpath("//a[@id='s-result-sort-select_2']")).click();
    }

    @And("sees products in descending order")
    public void seesProductsInDescendingOrder() {
        List<String> sortedPricesStr = new ArrayList<>();

        for (int i = 0; i<amazonPage.productPrices.size(); i++) {
            sortedPricesStr.add(amazonPage.productPrices.get(i).getText().replaceAll("[^0-9.]",""));
        }

        ListIterator litr = sortedPricesStr.listIterator();
        while (litr.hasNext()) {
            String element = (String) litr.next();
            litr.set(element.substring(0,element.length()-2) + "." + element.substring(element.length()-2));
        }

        List<Double> pricesDouble = new ArrayList<>();
        for (int i = 0; i<sortedPricesStr.size(); i++) {
            pricesDouble.add(Double.valueOf(sortedPricesStr.get(i)));
        }

        System.out.println(pricesDouble);

        boolean descending = true;
        for (int i = 0; i< pricesDouble.size()-1; i++) {
            if(  !(pricesDouble.get(i) >= pricesDouble.get(i+1))  ) {
                descending=false;
            }
        }
        Assert.assertTrue(descending);

    }


}

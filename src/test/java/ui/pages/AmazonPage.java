package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public WebElement amazonLogo;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement loginButton;

    @FindBy(css = "#nav-hamburger-menu")
    public WebElement allButton;

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']//a")
    public List<WebElement> filters;

    @FindBy(css = "#a-autoid-0-announce")
    public WebElement sortButton;

    @FindBy(xpath = "//div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16']//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']//span[@class='a-price']")
    public List<WebElement> productPrices;

    @FindBy(css = "#nav-cart-count-container")
    public WebElement cartButton;

}

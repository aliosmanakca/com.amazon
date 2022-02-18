package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

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

}

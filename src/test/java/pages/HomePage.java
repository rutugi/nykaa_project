package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage {


    private WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Search on Nykaa']")
    WebElement searchBox;

    public WebElement getSearchResult() {
        return searchResult;
    }

    @FindBy(id="title-listing")
    WebElement searchResult;

    public WebElement getSearchBox() {
        return searchBox;
    }



    @FindBy(xpath = "//a[@target=\"_blank\"]")
            WebElement  getMakeup;

    public WebElement getGetMakeup() {
        return getMakeup;
    }

    public WebElement getQqqq() { return getQqqq;}
    @FindBy(xpath = "//input[@placeholder='Search on Nykaa']")
    WebElement getQqqq;
}


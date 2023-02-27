package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import pages.HomePage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class StepDefinition {

    private WebDriver driver;
    HomePage homePage;
    String url;
    HashMap<String, String> data;
    Scenario scenario;


    public StepDefinition(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }
    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }
    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the product name")
    public void the_user_enter_the_product_name() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }

    @Then("the product results should be displayed")
    public void the_product_results_should_be_displayed() {
        String text = homePage.getSearchResult().getText();
        System.out.println(text);
        Assert.assertEquals(text, data.get("SearchValue"));

    }


    @Given("the user navigates to home page")
    public void theUserNavigatesToHomePage() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("user enter the makeup page")
    public void userEnterTheMakeupPage() {
        homePage = new HomePage(driver);
        homePage.getGetMakeup().click();
    }

    @Then("the result should be display")
    public void theResultShouldBeDisplay() {


    }

    @When("the user search for invalid item name")
    public void the_user_search_for_invalid_item_name() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }

    @Then("{string} is displayed")
    public void is_displayed(String string) throws InterruptedException {
        String text = homePage.getSearchResult().getText();
        System.out.println(text);
        Assert.assertEquals(text, data.get("SearchValue"));
    }

    @Given("user navigate to nykaa website")
    public void userNavigateToNykaaWebsite() {
        url = QaProps.getValue("url");
        driver.get(url);
    }

    @Then("Qqqq is displayed")
    public void qqqqIsDisplayed() {

    }
}


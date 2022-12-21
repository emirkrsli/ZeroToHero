package ui.stepDefinitions;

import ui.exceptions.InvalidDriverException;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import ui.pages.GoogleHomePage;
import utilities.Driver;

public class GoogleStepDef {
    WebDriver driver;
    GoogleHomePage ghp;

    @Given("Browser is open")
    public void browser_is_open() throws InvalidDriverException {
        driver = Driver.getDriver();
    }

    @When("I navigate to Google Home Page")
    public void i_navigate_to_google_home_page() {
        driver.get("https://www.google.com");
    }
    @When("I search for {string}")
    public void i_search_for(String string) {
        ghp = new GoogleHomePage(driver);
        ghp.searchFor(string);
    }
    @Then("I should see search results")
    public void i_should_see_search_results() {
        ghp.verifyRelatedResults();
    }
}

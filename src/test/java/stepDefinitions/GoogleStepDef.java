package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.GoogleHomePage;

public class GoogleStepDef {
    WebDriver driver;
    GoogleHomePage ghp;

    @Given("Browser is open")
    public void browser_is_open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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

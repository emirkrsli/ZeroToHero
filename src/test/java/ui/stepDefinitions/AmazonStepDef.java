package ui.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.exceptions.InvalidDriverException;
import ui.pages.AmazonLoginPage;
import utilities.Driver;

public class AmazonStepDef {

    WebDriver driver;
    AmazonLoginPage amazonPage = new AmazonLoginPage();

    public AmazonStepDef() throws InvalidDriverException {
    }


    @Given("User is on the amazon page")
    public void user_is_on_the_amazon_page() throws InvalidDriverException {
        driver = Driver.getDriver(); //open the browser
        driver.get("https://www.amazon.com.tr/ref=nav_logo");

    }
    @Given("Verify the title has Amazon")
    public void verify_the_title_has_amazon() {
        Assert.assertTrue(driver.getTitle().contains("Amazon.com.tr"));
    }

    @And("User must sign in")
    public void userMustSignIn() {
        amazonPage.clickDropDownMenu();
        amazonPage.sendUserName();
        amazonPage.sendPassword();
    }

    @Given("User search for {string}")
    public void user_search_for(String string) {

    }
    @Then("Verify the result has {string}")
    public void verify_the_result_has(String string) {

    }
    @Then("Add to card")
    public void add_to_card() {

    }
    @Then("Close the application")
    public void close_the_application() {
        //driver.close();
    }


}

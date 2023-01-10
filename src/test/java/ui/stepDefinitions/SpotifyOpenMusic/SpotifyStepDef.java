package ui.stepDefinitions.SpotifyOpenMusic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.exceptions.InvalidDriverException;
import ui.pages.Spotify.SpotifyHomePage;
import ui.pages.Spotify.SpotifyRegistorPage;
import utilities.Driver;

public class SpotifyStepDef {

SpotifyHomePage spotifyHomePage = new SpotifyHomePage(Driver.getDriver());
SpotifyRegistorPage spotifyRegistorPage = new SpotifyRegistorPage(Driver.getDriver());

    public SpotifyStepDef() throws InvalidDriverException {
    }
    @Given("open Browser and go to  spotify page")
    public void open_browser_and_go_to_spotify_page() throws InvalidDriverException {
        Driver.getDriver().get("https://open.spotify.com");

    }
    @When("Click login sign in button")
    public void click_login_sign_in_button() {
        spotifyHomePage.clickLoginButton();
        System.out.println("login but calisti ");
    }

    @Then("find the search button")
    public void find_the_search_button() {
    }




}

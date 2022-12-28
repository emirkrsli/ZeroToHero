package ui.stepDefinitions.SpotifyOpenMusic;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.exceptions.InvalidDriverException;
import ui.pages.Spotify.SpotifyHomePage;
import ui.pages.Spotify.SpotifyRegistorPage;
import utilities.Driver;

public class HomePageStepDef {

SpotifyHomePage spotifyHomePage = new SpotifyHomePage(Driver.getDriver());
SpotifyRegistorPage spotifyRegistorPage = new SpotifyRegistorPage(Driver.getDriver());

    public HomePageStepDef() throws InvalidDriverException {
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

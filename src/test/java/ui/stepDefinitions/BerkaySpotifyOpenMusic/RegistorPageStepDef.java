package ui.stepDefinitions.BerkaySpotifyOpenMusic;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.exceptions.InvalidDriverException;
import ui.pages.Spotify.SpotifyHomePage;
import ui.pages.Spotify.SpotifyRegistorPage;
import utilities.Driver;

public class RegistorPageStepDef {
    SpotifyHomePage spotifyHomePage = new SpotifyHomePage(Driver.getDriver());
    SpotifyRegistorPage spotifyRegistorPage = new SpotifyRegistorPage(Driver.getDriver());
    public RegistorPageStepDef() throws InvalidDriverException {
    }


    @Then("login {string} and {string}")
    public void loginAnd(String username, String password) {
        spotifyRegistorPage.sendUserName(username);
        spotifyRegistorPage.sendPassword(password);
        spotifyRegistorPage.clikcLoginButton();
        System.out.println("sendusername calisti");

    }

}





package ui.stepDefinitions.SpotifyOpenMusic;

import io.cucumber.java.en.*;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;


public class LoginPageStepDef {

    @Given("open Browser and go to  spotify page")
    public void open_browser_and_go_to_spotify_page() throws InvalidDriverException {
        Driver.getDriver().get("https://open.spotify.com");

    }

}

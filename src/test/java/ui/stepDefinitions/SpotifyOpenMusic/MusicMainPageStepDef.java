package ui.stepDefinitions.SpotifyOpenMusic;

import io.cucumber.java.en.Then;
import ui.exceptions.InvalidDriverException;
import ui.pages.Spotify.SpotifySearchMusicPage;
import utilities.Driver;

public class MusicMainPageStepDef {


    SpotifySearchMusicPage spotifySearchMusicPage = new SpotifySearchMusicPage(Driver.getDriver());

    public MusicMainPageStepDef() throws InvalidDriverException {
    }

    @Then("send {string} search button")
    public void send_search_button(String musicName) {
        spotifySearchMusicPage.clickSearchButton();
        spotifySearchMusicPage.sendKeySearchButton(musicName);
        spotifySearchMusicPage.clickMusicBar();
        spotifySearchMusicPage.clickMusic();

    }
}

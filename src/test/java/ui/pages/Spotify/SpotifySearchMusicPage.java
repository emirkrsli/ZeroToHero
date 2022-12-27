package ui.pages.Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifySearchMusicPage {
    WebDriver ldriver ;

    public SpotifySearchMusicPage(WebDriver gdriver){
        ldriver = gdriver;
    }

    By searchButton = By.xpath("//*[@class='link-subtle ATUzFKub89lzvkmvhpyE'][1]");
    By searchButtonsendkey = By.xpath("//*[@class='Type__TypeElement-sc-goli3j-0 hGXzYa QO9loc33XC50mMRUCIvf']");
    By selectMusicBar = By.xpath("//*[@class='_gB1lxCfXeR8_Wze5Cx9']");
    By selectMusic = By.xpath("//*[text()='18']");


    private WebElement getSearchButton(){
        return ldriver.findElement(searchButton);
    }
    private WebElement getSearchButtonSendKey(){
        return ldriver.findElement(searchButtonsendkey);
    }
    private WebElement getSelectMusicBar(){
        return ldriver.findElement(selectMusicBar);
    }
    private WebElement getSelectMusic(){
        return ldriver.findElement(selectMusic);
    }


    public void clickSearchButton(){
        getSearchButton().click();
    }

    public void sendKeySearchButton(String name){
       getSearchButtonSendKey().sendKeys(name);
    }

    public void clickMusicBar(){
     getSelectMusicBar().click();
    }
    public void clickMusic(){
       getSelectMusic().click();
    }
}

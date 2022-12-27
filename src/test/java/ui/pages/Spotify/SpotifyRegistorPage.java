package ui.pages.Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifyRegistorPage {
    WebDriver lDriver ;

    public SpotifyRegistorPage (WebDriver gdriver){
        lDriver = gdriver;
    }

    By userName = By.id("login-username");
    By Password = By.id("login-password");
    By loginButton = By.id("login-button");



    private WebElement getUserName(){

        return lDriver.findElement(userName);
    }
    private WebElement getPassword(){
        return lDriver.findElement(Password);
    }
    private WebElement getloginbutton(){
        return lDriver.findElement(loginButton);
    }

    public void sendUserName(String username){

        getUserName().sendKeys(username);
    }
    public void sendPassword(String password){
        getPassword().sendKeys(password);
    }
    public void clikcLoginButton(){
         getloginbutton().click();
    }


}

package ui.pages.Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifyHomePage {


    WebDriver ldriver;
    public SpotifyHomePage(WebDriver gdriver){
        ldriver=gdriver;
    }

    By loginbutton = By.xpath("//*[@data-testid='login-button']");

   private WebElement  getLoginButton(){

       return ldriver.findElement(loginbutton);
   }


   public void clickLoginButton(){

       getLoginButton().click();
   }

}

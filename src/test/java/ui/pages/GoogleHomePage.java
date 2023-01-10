package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleHomePage {

    private WebDriver lDriver;

    public GoogleHomePage(WebDriver gDriver){

        lDriver = gDriver;
    }

    private final By searchBar = By.name("q");

    private WebElement getSearchBar(){
        return lDriver.findElement(searchBar);
    }

    public void searchFor(String keyWord){
        getSearchBar().sendKeys(keyWord + Keys.ENTER);
    }

    public void verifyRelatedResults(){

        //Assertion might not be healthy
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(lDriver.getCurrentUrl().contains("search?q=" + getSearchBar().getText()));
    }
}

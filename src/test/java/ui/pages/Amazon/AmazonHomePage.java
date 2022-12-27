package ui.pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

import java.security.Key;

public class AmazonHomePage {

    WebDriver driver = Driver.getDriver();
    By searchBox = By.xpath("//input[@type='text']");

    public AmazonHomePage() throws InvalidDriverException {
    }

    private WebElement getSearchBox(){
        return driver.findElement(searchBox);
    }

    public void clickAndSendProductToSearchBox(){
        getSearchBox().click();
        getSearchBox().sendKeys("Apple AirPods Pro (2. nesil)" + Keys.ENTER);
    }

}

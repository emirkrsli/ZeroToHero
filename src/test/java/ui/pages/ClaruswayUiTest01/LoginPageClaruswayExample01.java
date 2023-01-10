package ui.pages.ClaruswayUiTest01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

public class LoginPageClaruswayExample01 {
     WebDriver driver = Driver.getDriver();

    private final By usernameButton = By.id("username");
    private final By passwordButton = By.id("password");

    private final By submitButton = By.id("submit");

    public LoginPageClaruswayExample01() throws InvalidDriverException {
    }

    private WebElement getUsername(){
        return driver.findElement(usernameButton);
    }

    private WebElement getPassword(){
        return driver.findElement(passwordButton);
    }

    private WebElement getSubmitButton(){
        return driver.findElement(submitButton);
    }

    public void sendUsername(String username){
        getUsername().sendKeys(username);
    }
    public void sendPassword(String Password){
        getPassword().sendKeys(Password);
    }

    public void clickSubmitButton(){
        getSubmitButton().click();
    }



}

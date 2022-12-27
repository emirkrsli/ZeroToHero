package ui.pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

public class AmazonLoginPage {

    WebDriver driver = Driver.getDriver();

    By dropDownMenu = By.xpath("//a[@id='nav-link-accountList']");
    By userName = By.id("ap_email");
    By password = By.id("ap_password");

    public AmazonLoginPage() throws InvalidDriverException {
    }

    private WebElement getDropDownMenu() {
        return driver.findElement(dropDownMenu);
    }

    public void clickDropDownMenu() {
        getDropDownMenu().click();
    }

    private WebElement getUserName(){
        return driver.findElement(userName);
    }

    public void sendUserName(){
        getUserName().sendKeys("emirhan190341@gmail.com" + Keys.ENTER);
    }

    private  WebElement getPassword(){
        return driver.findElement(password);
    }

    public void sendPassword(){
        getPassword().sendKeys("ceter3l3" + Keys.ENTER);
    }

}

package ui.pages.Amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

public class AmazonBuyAndClosePage {
    WebDriver driver = Driver.getDriver();
    By dropDownMenu = By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']");
    By logOutButton = By.partialLinkText("Çıkış Yap");

    public AmazonBuyAndClosePage() throws InvalidDriverException {
    }

    private WebElement getDropDownMenu(){
        return driver.findElement(dropDownMenu);
    }

    private WebElement getLogOutButton(){
        return driver.findElement(logOutButton);
    }



    public void hoverDropDownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(getDropDownMenu()).perform();
    }

    public void clickLogOutButton(){
        getLogOutButton().click();
    }






}

package ui.pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

import java.time.Duration;

public class AmazonProductPage {
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    By addToCartButton = By.id("add-to-cart-button");
    By viewCardButton  = By.xpath("//form[@id='attach-view-cart-button-form']");

    public AmazonProductPage() throws InvalidDriverException {
    }

    private WebElement getAddToCardButton(){
        return driver.findElement(addToCartButton);
    }

    public void clickAddToCardButton(){
        getAddToCardButton().click();
    }

    private WebElement getViewCardButton(){
        return driver.findElement(viewCardButton);
    }

    public void waitViewCardButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCardButton));
    }

    public void clickViewCardButton(){
        getViewCardButton().click();
    }





}

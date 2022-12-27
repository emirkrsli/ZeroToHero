package ui.pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

public class AmazonResultPage {
    WebDriver driver = Driver.getDriver();
    By productVisibility = By.partialLinkText("Apple AirPods Pro (2. nesil) ");
    By product = By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']");


    public AmazonResultPage() throws InvalidDriverException {
    }

    private WebElement getProduct() {
        return driver.findElement(product);
    }

    //

    public boolean isProductVisible() {
       return  driver.getPageSource().contains("Apple AirPods Pro (2. nesil)");
    }

    public void clickProduct(){
        getProduct().click();
    }





}

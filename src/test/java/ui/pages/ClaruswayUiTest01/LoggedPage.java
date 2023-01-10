package ui.pages.ClaruswayUiTest01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ui.exceptions.InvalidDriverException;
import utilities.Driver;

public class LoggedPage {

WebDriver driver = Driver.getDriver();



    By succesprose = By.xpath("//*[@class='post-title']");
    By congratulationsAssert = By.xpath("//div[@id='loop-container']//p");

    public LoggedPage() throws InvalidDriverException {
    }


    private WebElement getsuccesSprose(){
        return driver.findElement(succesprose);
    }
    private WebElement getsuccesAssert(){
        return driver.findElement(congratulationsAssert);
    }


    public void AssertSuscces(){
        Assert.assertTrue(getsuccesSprose().isDisplayed());

    }

    public void AssertenMassege(){
        Assert.assertTrue(getsuccesAssert().getText().contains("Congratulations"),"Congratualions is not written");
    }

}

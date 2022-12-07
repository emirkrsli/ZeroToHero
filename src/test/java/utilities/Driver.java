package utilities;
import exceptions.InvalidDriverException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    //What?=>It is just to create, initialize the driver instance.(Singleton driver)
    //Why?=>We don't want to create and initialize the driver when we don't need
    //We will create and initialize the driver when it is null
    //We can use Driver class with different browser(chrome,firefox,headless)
    private Driver(){
        //we don't want to create another abject. Singleton pattern
    }

    //create a driver instance
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    //to initialize the driver we create a static method
    public static WebDriver getDriver() throws InvalidDriverException {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    driver.set(new FirefoxDriver());
                case "ie":
                    driver.set(new InternetExplorerDriver());
                    break;
                case "safari":
                    driver.set(new SafariDriver());
                    break;
                case "chrome-headless":
                    driver.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                    break;
                default:
                    System.out.println("browser is not valid");
                    throw new InvalidDriverException();
            }
        }
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get().manage().window().maximize();
        return driver.get();
    }

    public static void closeDriver(){
        if (driver!=null){//if the driver is pointing chrome
            driver.get().quit();//quit the driver
            driver=null;//set it back to null to make sure driver is null
            // so I can initialize it again
            //This is important especially you do cross browser testing(testing with
            // multiple browser like chrome, firefox, ie etc.)
        }
    }
}
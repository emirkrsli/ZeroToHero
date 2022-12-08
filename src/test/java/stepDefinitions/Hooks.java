package stepDefinitions;

import exceptions.InvalidDriverException;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {


    @After
    public void tearDown(Scenario scenario) throws IOException, InvalidDriverException {

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {

//            String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
//            File source = ts.getScreenshotAs(OutputType.FILE);
//
//            String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + "failedScreenshot" + date + ".png";
//            File finalDestination = new File(target);
//
//            BufferedImage bufferedImage = ImageIO.read(source);
//            ImageIO.write(bufferedImage, "png", finalDestination);

            System.out.println("aasd");
            String failed = ReusableMethods.getScreenshotParallel("failed screenshot");

            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}

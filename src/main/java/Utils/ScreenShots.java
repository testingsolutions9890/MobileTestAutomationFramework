package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {

    public static String getScreenShots(WebDriver driver, String nameOfSS) throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "//reports//"+nameOfSS+".png";
        FileUtils.copyFile(source, new File(destination));
        return  destination;
    }

}

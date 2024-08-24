package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstAndroidMobileTest extends BasicAndroidMobileTest {
    @Test
    public void firstMobileTest() throws MalformedURLException {


        WebElement wb = androidDriver.findElement(new AppiumBy.ByAccessibilityId(""));

    }



}

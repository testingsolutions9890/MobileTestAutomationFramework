package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenBrowserOnAndroid extends BasicAndroidMobileTest {

    @Test
    public void testOpenBrowserOnAndroid() {

        androidDriver.get("http://www.google.com");
        androidDriver.findElement(By.name("q")).sendKeys("Vedant khadkekar");
        androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}

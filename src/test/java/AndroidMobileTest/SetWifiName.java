package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SetWifiName extends BasicAndroidMobileTest {
    @Test
    public void testSetWifiName() throws MalformedURLException {


       androidDriver.findElement(new AppiumBy.ByAccessibilityId("Preference")).click();
       androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
       DeviceRotation  deviceRotation = new DeviceRotation(0,0,90);
       androidDriver.rotate(deviceRotation);
       androidDriver.findElement(By.id("android:id/checkbox")).click();
       androidDriver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
       Assert.assertEquals(androidDriver.findElement(By.id("android:id/alertTitle")).getText(),"WiFi settings","Title verified");
       androidDriver.findElement(By.id("android:id/edit")).sendKeys("abc");
       androidDriver.findElement(By.id("android:id/button1")).click();


    }



}

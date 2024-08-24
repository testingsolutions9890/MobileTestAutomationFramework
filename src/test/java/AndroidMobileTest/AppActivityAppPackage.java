package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppActivityAppPackage extends BasicAndroidMobileTest {
    @Test
    public void testAppActivityAppPackage() throws MalformedURLException, InterruptedException {


        // jump  direct to set wifi name page by App activity and App package

        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        androidDriver.startActivity(activity);

        androidDriver.findElement(By.id("android:id/checkbox")).click();

        DeviceRotation deviceRotation = new DeviceRotation(0,0,90);
        androidDriver.rotate(deviceRotation);

        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
        Assert.assertEquals(androidDriver.findElement(By.id("android:id/alertTitle")).getText(),"WiFi settings","Title verified");
        androidDriver.findElement(By.id("android:id/edit")).sendKeys("abc");
        androidDriver.findElement(By.id("android:id/button1")).click();

    }



}

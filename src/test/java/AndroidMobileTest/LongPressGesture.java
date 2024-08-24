package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPressGesture extends BasicAndroidMobileTest {
    @Test
    public void testLongPressGesture() throws MalformedURLException, InterruptedException {

        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Expandable Lists")).click();
        androidDriver.findElement(new AppiumBy.ByAccessibilityId("1. Custom Adapter")).click();
        WebElement wb = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        //android.widget.TextView[@text='People Names']
        //((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) wb).getId(), "duration", 2000));
        androidDriver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", wb,"duration",2000));

        Thread.sleep(2000);
        Assert.assertTrue(androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title']")).isDisplayed());
        Assert.assertEquals(androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title']")).getText(),"Sample menu");




    }



}

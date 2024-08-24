package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SwipeGesture extends BasicAndroidMobileTest {
    @Test
    public void testScrollGesture() throws MalformedURLException, InterruptedException {

        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();

        //scroll down to the element and click by Appium Method
        androidDriver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Gallery\").instance(0))")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
        WebElement wb = androidDriver.findElement(By.xpath("//android.widget.ImageView[1]"));
        Assert.assertEquals(androidDriver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"true");

        //swipe
        ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",    ((RemoteWebElement)wb).getId(),
                "direction", "left",
                "percent", 0.75
        ));

        Assert.assertEquals(androidDriver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"false");


    }



}

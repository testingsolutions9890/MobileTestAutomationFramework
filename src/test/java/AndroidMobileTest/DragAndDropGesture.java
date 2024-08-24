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

public class DragAndDropGesture extends BasicAndroidMobileTest {
    @Test
    public void testDragAndDropGesture() throws MalformedURLException, InterruptedException {

        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Drag and Drop")).click();
        WebElement source = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        //drag
        // Java
        ((JavascriptExecutor) androidDriver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(),
                "endX", 834,
                "endY", 735
        ));

        Thread.sleep(5000);

        Assert.assertEquals(androidDriver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText(),"Dropped!");

    }



}

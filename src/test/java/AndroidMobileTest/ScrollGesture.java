package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollGesture extends BasicAndroidMobileTest {
    @Test
    public void testScrollGesture() throws MalformedURLException, InterruptedException {

        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
        //WebElement wb = androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='WebView']"));

        //scroll down to the element and click by Appium Method
        androidDriver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))")).click();


        /*boolean canScrollMore = (Boolean) ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 3.0,
                "elementId",androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WebView\"]"))
        ));*/

    }



}

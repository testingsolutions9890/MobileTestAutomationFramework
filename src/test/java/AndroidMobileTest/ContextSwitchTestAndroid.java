package AndroidMobileTest;

import Base.BasicAndroidMobileTest;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Set;

public class ContextSwitchTestAndroid extends BasicAndroidMobileTest {

    @Test
    public void testContextSwitch() throws InterruptedException {

    androidDriver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Vedant");
    androidDriver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    androidDriver.findElement(By.xpath("//android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    androidDriver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
    androidDriver.findElement(By.className("android.widget.CheckBox")).click();
    androidDriver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
    Thread.sleep(3000);

    Set<String> contexts = androidDriver.getContextHandles();

    for(String context : contexts){
        System.out.println(">>>>>" + context);
    }
    Thread.sleep(3000);
    androidDriver.context("WEBVIEW_com.androidsample.generalstore");
    androidDriver.findElement(By.name("q")).sendKeys("Vedant khadkekar");
    androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));


    }
}

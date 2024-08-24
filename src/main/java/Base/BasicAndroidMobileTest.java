package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasicAndroidMobileTest {


    public AppiumDriverLocalService serviceBuilder;
    public UiAutomator2Options  options;
    public AndroidDriver androidDriver;

    @BeforeClass
    public void setUpAppium() throws MalformedURLException {

        serviceBuilder = new AppiumServiceBuilder()
                .withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.BASEPATH,"/wd/hub")
                .withTimeout(Duration.ofSeconds(60))
                .build();
        serviceBuilder.start();


        options = new UiAutomator2Options();
        options.setDeviceName("Pixel XL API 34");
        options.setChromedriverExecutable("//Users/vedantkhadkekar//Documents//Workspace//AutomationProject//src//main//resources//chromedriver_mac64");
        //options.setCapability("browserName","Chrome");
        options.setApp("//Users//vedantkhadkekar//Documents//Workspace//AutomationProject//src//main//resources//General-Store.apk");
        //options.setApp("//Users//vedantkhadkekar//Documents//Workspace//AutomationProject//src//main//resources//ApiDemos-debug.apk");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
        serviceBuilder.stop();

    }
}

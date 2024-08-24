package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasicIOSMobileTest {


    public AppiumDriverLocalService serviceBuilder;
    public XCUITestOptions options;
    public IOSDriver iosDriver;

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


        options = new XCUITestOptions();
        options.setDeviceName("iPhone 13");
        //options.setUdid("89E97506-4E26-4C17-866E-7ABAD3A11A38");
        //options.setApp("//Users//vedantkhadkekar//Library//Developer//Xcode//DerivedData//UIKitCatalog-eicvxxqbqkbxokfgjibadauxadwk//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
        options.setApp("/Users/vedantkhadkekar/Library/Developer/Xcode/DerivedData/UIKitCatalog-eicvxxqbqkbxokfgjibadauxadwk/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
        options.setPlatformVersion("16.4");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
        iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDown(){
        iosDriver.quit();
        serviceBuilder.stop();

    }
}

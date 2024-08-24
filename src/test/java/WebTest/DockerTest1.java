package WebTest;

import Base.BasicTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class DockerTest1 {

    @Test
    public void dockerTest1() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url,dc);
        remoteWebDriver.get("https://www.google.com");

    }
}

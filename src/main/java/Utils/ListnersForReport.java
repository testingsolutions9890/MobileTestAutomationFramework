package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ListnersForReport implements ITestListener {
    WebDriver driver;
    ScreenShots screenShots;

    ExtentReports extentreporter = ExtentreporterNG.getExtentReportObject();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extentreporter.createTest(result.getMethod().getMethodName());
        extentreporter.setSystemInfo("Test Automation Engineer","Vedant khadkekar");
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Test has been Passed");
    }

    public void onTestFailure(ITestResult result) {
        screenShots = new ScreenShots();
        test.fail(result.getThrowable());
        ITestContext context =  result.getTestContext();
        driver = (WebDriver) context.getAttribute("driver");
        try {
            String screenShot = screenShots.getScreenShots(driver,result.getMethod().getMethodName());
            test.addScreenCaptureFromPath(screenShot,result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP,"Test has been skipped");
        test.fail(result.getThrowable());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
        extentreporter.flush();
    }

}

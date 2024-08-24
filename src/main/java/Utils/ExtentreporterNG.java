package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreporterNG{

    static ExtentReports extentReports;
    public static ExtentReports getExtentReportObject(){
        //ExtentReport and ExtentSparkreporter
        String path = System.getProperty("user.dir") + "//reports//xtentReportResults.html";
        ExtentSparkReporter extentSparkreporter = new ExtentSparkReporter(path);

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkreporter);
         return extentReports;

    }
}

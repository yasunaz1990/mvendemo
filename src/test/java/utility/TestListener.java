package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    //1. ReportManger
    private ExtentReports reportManger;
    private ExtentSparkReporter spark;
    private ExtentTest testCaseSection;


    @Override
    public void onStart(ITestContext test) {
        reportManger =  new ExtentReports();
        String path = System.getProperty("user.dir") + "/reports/";
        spark = new ExtentSparkReporter(path);
        spark.config().setTheme(Theme.STANDARD);
        reportManger.attachReporter(spark);
    }

    @Override
    public void onFinish(ITestContext test) {
        reportManger.flush();
    }


    //---- Test Case Detection ---//
    @Override
    public void onTestStart(ITestResult testcase) {
        testCaseSection =  reportManger.createTest(testcase.getName());
    }

    @Override
    public void onTestSuccess(ITestResult testcase) {
        testCaseSection.pass("This test case has passed!");
    }

    @Override
    public void onTestFailure(ITestResult testcase) {
        testCaseSection.fail("This test case has failed");
    }

    @Override
    public void onTestSkipped(ITestResult testcase) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult testcase) {

    }

}

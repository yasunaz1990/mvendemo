package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class TestExecutionDetection implements ITestListener {

    // ========= Test Context Execution Detection ========//
    @Override
    public void onStart(ITestContext test) {

    }

    @Override
    public void onFinish(ITestContext test) {

    }

    //====== Individual Test Case Execution Detection ======//
    @Override
    public void onTestStart(ITestResult testcase) {

    }

    @Override
    public void onTestSuccess(ITestResult testcase) {

    }

    @Override
    public void onTestFailure(ITestResult testcase) {

    }

    @Override
    public void onTestSkipped(ITestResult testcase) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
}

// All test case : 45
// Passed        : 15
// Failed        : 20
// Skipped       : 10

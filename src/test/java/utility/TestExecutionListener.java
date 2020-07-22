package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestExecutionListener implements ITestListener {

    private ExtentReports extentReportManager;
    private ExtentTest testCaseSection;


    //---- <test> detection ---//

    @Override
    public void onStart(ITestContext test) {
        // 0. Create an Extent Report Manager
        extentReportManager = new ExtentReports();

        // 1, place to save the report
        String reportDirPath = System.getProperty("user.dir") + "/reports/";

        // 2, Create a report writer object called Reporter
        //    Provide the path where it can save the generated report at the
        //    end of the test execution.
        ExtentSparkReporter spark = new ExtentSparkReporter(reportDirPath);

        // 3, Configure the spark so that it can write necessary system info
        //    to the report file
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Alphaleaf_Automation_Test_Report");
        spark.config().setReportName("Nightly Test Execution");


        // 4, Attach this spark Report Writer object to the
        //    extent report manager, so it will be used for
        //    report creation
        extentReportManager.attachReporter(spark);
    }

    @Override
    public void onFinish(ITestContext test) {
        extentReportManager.flush();
    }


    //---- Test Case Detection ---//
    @Override
    public void onTestStart(ITestResult testcase) {
        String testCaseName = testcase.getName();
        testCaseSection = extentReportManager.createTest(testCaseName);
    }

    @Override
    public void onTestSuccess(ITestResult testcase) {
        testCaseSection.fail("Test case has passed");
    }

    @Override
    public void onTestFailure(ITestResult testcase) {
        testCaseSection.fail("Test case has failed");
    }

    @Override
    public void onTestSkipped(ITestResult testcase) {
        testCaseSection.fail("Test case has skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult testcase) {

    }


}

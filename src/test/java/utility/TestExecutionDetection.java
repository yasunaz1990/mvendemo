package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;

public class TestExecutionDetection implements ITestListener {

    // Global Variable
    // Make Report related object accessible to all of the methods below
    private ExtentReports extentReportManager;
    private ExtentTest testCaseSection;
    ExtentSparkReporter spark;


    // ======== Indivual <test> detection =========//

    @Override
    public void onStart(ITestContext test) {

        // 0. Create an Extent Report Manager
        extentReportManager = new ExtentReports();

        // 1, place to save the report
        String reportDirPath = System.getProperty("user.dir") + "/reports/";

        // 2, Create a report writer object called Reporter
        //    Provide the path where it can save the generated report at the
        //    end of the test execution.
        spark = new ExtentSparkReporter(reportDirPath);

        // 3, Configure the spark so that it can write necessary system info
        //    to the report file
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Alphaleaf_Automation_Test_Report");
        spark.config().setReportName("Nightly Test Execution");


        // 4, Attach this spark Report Writer object to the
        //    extent report manager, so it will be used for
        //    report creation
        extentReportManager.attachReporter(spark);
    }

    @Override
    public void onFinish(ITestContext test) {
        // 5. Flush the report writing steam ( channel )
        //    once the test has completed, because there are
        //    no more report writing activity, so it does not make sense
        //    to keep the reporter object and holding RAM hostage.
        extentReportManager.flush();
    }




    //====== Individual Test Case Detection ====== //
    @Override
    public void onTestStart(ITestResult testcase) {
        String testCaseName = testcase.getName();
        testCaseSection = extentReportManager.createTest(testCaseName);
        TestStepLogger.setTestCaseSection(testCaseSection);

    }

    @Override
    public void onTestSuccess(ITestResult testcase) {
        testCaseSection.pass("Test case has passed");
    }

    @Override
    public void onTestFailure(ITestResult testcase) {
        testCaseSection.fail("Test case has failed");
    }

    @Override
    public void onTestSkipped(ITestResult testcase) {
        testCaseSection.skip("Test case has skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        // DO NOTHING
    }

}

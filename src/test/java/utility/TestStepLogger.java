package utility;

import com.aventstack.extentreports.ExtentTest;

public class TestStepLogger {

    private static ExtentTest testCaseSectionObj;

    // Logs the test step
    public static void setTestCaseSection(ExtentTest testCaseSection) {
        testCaseSectionObj = testCaseSection;
    }


    public static void step(String message) {
        testCaseSectionObj.info(message);
    }
}

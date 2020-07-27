package utility;

import com.aventstack.extentreports.ExtentTest;



public class Step {
    // Field
    private static ExtentTest testCaseSection;

    public static void setTestCaseSection(ExtentTest extenTestObj) {
        testCaseSection = extenTestObj;
    }


    public static void info(String message) {
        testCaseSection.info(message);
    }
}



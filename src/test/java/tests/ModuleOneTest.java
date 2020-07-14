package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Test Class
public class ModuleOneTest {

    // - Pre-Condition befre test case
    @BeforeMethod
    public void openDatabase() {
        System.out.println("Opening a database....");
        System.out.println("Database has opened, ready for Read/Write");
    }

    // - Post Condition
    @AfterMethod
    public void cleanAndCloseDatabase() {
        System.out.println("Done DB test, cleaning and closing the database....\n\n");
    }


    // 1st test case
    // Condition
    @Test
    public void testCase1() {
        System.out.println("executing test case no.1");
    }


    @Test
    public void testCase2() {
        System.out.println("executing test case no.2");
    }


    @Test
    public void testCase3() {
        System.out.println("executing test case no.3");
    }

    @Test
    public void testCase4() {
        System.out.println("executing test case no.4");
    }

}


// DRY
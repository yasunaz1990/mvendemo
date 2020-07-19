package tests;

import org.testng.Assert;
import org.testng.annotations.*;

// Test Class
public class ModuleTwoTest {
    @BeforeClass
    public void prep() {
        System.out.println("Before any test case in this class begins...let me do something");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        System.out.println("After all thet test case in this class finished...let me do something");
    }

    @BeforeMethod
    public void openDb() {
        System.out.println("Openning DB");
    }

    @AfterMethod
    public void closeDb() {
        System.out.println("-----Closing DB------\n");
    }

    @Test
    public void test100() {
        System.out.println("testcase100");
        Assert.assertFalse(false);
    }

    @Test(dependsOnMethods = "test100", alwaysRun = true)
    public void test101() {
        System.out.println("testcase101");
    }

    @Test
    public void test102() {
        System.out.println("testcase102");
    }
}

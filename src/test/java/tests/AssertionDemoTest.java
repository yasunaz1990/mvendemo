package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


// Test Class: group reletaed test cases
public class AssertionDemoTest {

    @Test
    public void testCase10() {
        Assert.assertEquals(10, 11);
    }


    @Test
    public void testCase11() {
        Assert.assertEquals(10.98, 10.98);
    }


    @Test
    public void testCase12() {
       String[] expected = {"Voted",      "Not Voted", "Pending"};
       String[] actual =   {"Voted",      "Not Voted", "Pending"};

       Assert.assertEquals(actual, expected);
    }


    @Test
    public void testCase13() {
        boolean actual = true;
        Assert.assertFalse(actual);
    }

    @Test
    public void testCase14() {
        String expected = "Success";
        String actual   = "Process pending..";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCase15() {
        boolean actual = (19 > 1000);
        Assert.assertTrue(actual);
    }


    @Test
    public void multiAssertionHardAssert() {
        // Hard Assert  --> Static methods
        // two nums
        Assert.assertEquals(10, 10);
        System.out.println("code below first assert");
        // two stirng values
        Assert.assertEquals("Worlds", "Word");
        System.out.println("code below 2nd assert");
        // false
        Assert.assertFalse(true);
    }

    @Test
    public void multiAssertSoftAssert() {
        // Soft Assert
        SoftAssert sAssert = new SoftAssert();

        sAssert.assertEquals(120, 10);
        System.out.println("code X");

        sAssert.assertEquals("Worlds", "World");
        System.out.println("code Y");

        sAssert.assertFalse(true);
        System.out.println("code Z");

        sAssert.assertAll();
    }

}

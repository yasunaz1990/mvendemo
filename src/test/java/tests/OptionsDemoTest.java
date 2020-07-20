package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.TestStepLogger;

public class OptionsDemoTest {



    @Test
    public void test1() {
        System.out.println("Test1 code");
        TestStepLogger.step("Test1 Code");
    }

    @Test
    public void test2() {
        System.out.println("Test2 code haha");
        TestStepLogger.step("Test2 Code");
    }

    @Test
    public void test3() {
        System.out.println("Test3 code");
        TestStepLogger.step("Test3 Code");
    }

    @Test
    public void test4() {
        System.out.println("Test4 code");
        TestStepLogger.step("Test4 Code");
    }

    @Test
    public void test5() {
        System.out.println("Test5 code");
        TestStepLogger.step("Test5 Code");
    }

    //@Test
    public void test6() {
        System.out.println("Test6 code haha");
        TestStepLogger.step("Test6 Code");
    }

    //@Test
    public void test7() {
        System.out.println("Test7 code");
        TestStepLogger.step("Test7 Code");
    }
}

// enabled
// invocationCount
// dependesOnMethods
// alwaysRun
// groups                x               mvn test -Dgroups="smoke","reg"
// priority              x
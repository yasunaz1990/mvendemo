package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OptionsDemoTest {

    @Test
    public void test1() {
        System.out.println("Test1 code haha");
    }

    @Test
    public void test2() {
        System.out.println("Test2 code haha");
    }

    @Test
    public void test3() {
        System.out.println("Test3 code");
    }

    @Test
    public void test4() {
        System.out.println("Test4 code");
    }

    @Test
    public void test5() {
        System.out.println("Test5 code");
    }

    @Test
    public void test6() {
        System.out.println("Test6 code haha");
    }

    @Test
    public void test7() {
        System.out.println("Test7 code");
    }
}

// enabled
// invocationCount
// dependesOnMethods
// alwaysRun
// groups                x               mvn test -Dgroups="smoke","reg"
// priority              x
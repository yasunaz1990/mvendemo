package testcases;

import org.testng.annotations.Test;

public class TestClass {

    @Test(groups="smoke")
    public void testCase1() {
        System.out.println("TC1");
    }

    @Test(groups={"smoke","reg","e2e"})
    public void testCase2() {
        System.out.println("TC2");
    }

    @Test(groups="smoke")
    public void testCase3() {
        System.out.println("TC3");
    }

    @Test(groups="reg")
    public void testCase4() {
        System.out.println("TC4");
    }

    @Test(groups="e2e")
    public void testCase5() {
        System.out.println("TC5");
    }

    @Test(groups={"smoke","reg","e2e"})
    public void testCase6() {
        System.out.println("TC6");
    }

    @Test(groups="smoke")
    public void testCase7() {
        System.out.println("TC7");
    }
}
